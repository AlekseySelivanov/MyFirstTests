package com.example.myfirsttest.presenter.search

import com.example.myfirsttest.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}
