package com.eonarma.bookkmpapp

import androidx.compose.runtime.*
import com.eonarma.bookpedia.core.data.HttpClientFactory
import com.eonarma.bookpedia.data.network.KtorRemoteBookDataSource
import com.eonarma.bookpedia.data.repository.DefaultBookRepository
import com.eonarma.bookpedia.presentation.book_list.BookListScreenRoot
import com.eonarma.bookpedia.presentation.book_list.BookListViewModel
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    val viewModel = koinViewModel<BookListViewModel>()
    BookListScreenRoot(
        viewModel = viewModel,
        onBookClick = {

        }
    )
}