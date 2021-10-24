package com.geekbrains.tests.presenter.search

import com.example.myfirsttest.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
    //onAttach
    //onDetach
}
