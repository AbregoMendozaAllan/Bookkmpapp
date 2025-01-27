package com.eonarma.bookkmpapp

import androidx.compose.runtime.*
import com.eonarma.bookpedia.presentation.book_list.BookListScreenRoot
import com.eonarma.bookpedia.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {

        }
    )
}