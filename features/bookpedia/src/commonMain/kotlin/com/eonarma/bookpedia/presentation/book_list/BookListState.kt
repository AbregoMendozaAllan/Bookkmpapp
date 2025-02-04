package com.eonarma.bookpedia.presentation.book_list

import com.eonarma.bookpedia.core.presentation.UiText
import com.eonarma.bookpedia.domain.Book

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val dummyBooks = List(20) { index ->
    Book(
        id = "book_$index",
        title = "Book Title $index",
        imageUrl = "https://via.placeholder.com/150", // Placeholder image URL
        authors = listOf("Author $index"),
        description = "This is a description of Book $index. It’s an amazing book that you’ll love to read.",
        languages = listOf("English", "Spanish"),
        yearFirstPublished = (2000 + index).toString(),
        averageRating = (3.5 + (index % 5) * 0.1),
        ratingCount = (100 + index * 10),
        numPages = (100 + index * 15),
        numEditions = (1 + index % 3)
    )
}
