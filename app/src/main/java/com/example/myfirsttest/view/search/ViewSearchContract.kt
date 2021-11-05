package com.example.myfirsttest.view.search

import com.example.myfirsttest.model.SearchResult
import com.example.myfirsttest.view.ViewContract

internal interface ViewSearchContract : ViewContract {

    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}
