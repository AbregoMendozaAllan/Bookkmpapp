package com.eonarma.bookpedia.di

import com.eonarma.bookpedia.core.data.HttpClientFactory
import com.eonarma.bookpedia.data.network.KtorRemoteBookDataSource
import com.eonarma.bookpedia.data.network.RemoteBookDataSource
import com.eonarma.bookpedia.data.repository.DefaultBookRepository
import com.eonarma.bookpedia.domain.BookRepository
import com.eonarma.bookpedia.presentation.SelectedBookViewModel
import com.eonarma.bookpedia.presentation.book_detail.BookDetailViewModel
import com.eonarma.bookpedia.presentation.book_list.BookListViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }

    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
    viewModelOf(::SelectedBookViewModel)
    viewModelOf(::BookDetailViewModel)
}