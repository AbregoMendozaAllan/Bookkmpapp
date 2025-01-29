package com.eonarma.bookpedia.data.network

import com.eonarma.bookpedia.core.data.safeCall
import com.eonarma.bookpedia.core.domain.DataError
import com.eonarma.bookpedia.core.domain.Result
import com.eonarma.bookpedia.data.dto.SearchResponseDTO
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter

private const val BASE_URL = "https://openlibrary.org"

class KtorRemoteBookDataSource(
    private val httpClient: HttpClient
): RemoteBookDataSource {
    override suspend fun searchBooks(
        query: String,
        resultLimit: Int?
    ): Result<SearchResponseDTO, DataError.Remote> {
        return safeCall {
            httpClient.get(
                urlString = "$BASE_URL/search.json"
            ) {
                parameter(key = "q", value = query)
                parameter(key = "limit", value = resultLimit)
                parameter(key = "language", value = "eng")
                parameter(key = "fields", value = "key,title,author_name,author_key,cover_edition_key,cover_i,ratings_average,ratings_count,first_publish_year,language,number_of_pages_median,edition_count")
            }
        }
    }
}