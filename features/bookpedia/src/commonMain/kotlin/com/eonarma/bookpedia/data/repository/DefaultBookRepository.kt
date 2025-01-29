package com.eonarma.bookpedia.data.repository

import com.eonarma.bookpedia.core.domain.DataError
import com.eonarma.bookpedia.core.domain.Result
import com.eonarma.bookpedia.core.domain.map
import com.eonarma.bookpedia.data.mappers.toBook
import com.eonarma.bookpedia.data.network.RemoteBookDataSource
import com.eonarma.bookpedia.domain.Book
import com.eonarma.bookpedia.domain.BookRepository

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}