package com.eonarma.bookpedia.data.network

import com.eonarma.bookpedia.core.domain.DataError
import com.eonarma.bookpedia.core.domain.Result
import com.eonarma.bookpedia.data.dto.SearchResponseDTO

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDTO, DataError.Remote>
}