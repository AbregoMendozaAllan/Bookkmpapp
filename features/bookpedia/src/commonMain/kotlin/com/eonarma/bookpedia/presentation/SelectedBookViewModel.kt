package com.eonarma.bookpedia.presentation

import androidx.lifecycle.ViewModel
import com.eonarma.bookpedia.domain.Book
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SelectedBookViewModel: ViewModel() {
    private val _selectedBook = MutableStateFlow<Book?>(null)
    val selectedBook = _selectedBook.asStateFlow()

    fun onSelectedBook(book: Book?) {
        _selectedBook.value = book
    }
}