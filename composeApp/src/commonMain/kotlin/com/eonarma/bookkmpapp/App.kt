package com.eonarma.bookkmpapp

import androidx.compose.runtime.*
import com.eonarma.bookpedia.core.data.HttpClientFactory
import com.eonarma.bookpedia.data.network.KtorRemoteBookDataSource
import com.eonarma.bookpedia.data.repository.DefaultBookRepository
import com.eonarma.bookpedia.presentation.book_list.BookListScreenRoot
import com.eonarma.bookpedia.presentation.book_list.BookListViewModel
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel(
            bookRepository = DefaultBookRepository(
                remoteBookDataSource = KtorRemoteBookDataSource(
                    httpClient = HttpClientFactory.create(engine)
                )
            )
        ) },
        onBookClick = {

        }
    )
}