package com.eonarma.bookpedia.domain

import com.eonarma.bookpedia.core.domain.DataError
import com.eonarma.bookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}