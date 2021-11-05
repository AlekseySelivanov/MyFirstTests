package com.example.myfirsttest.presenter

import com.example.myfirsttest.repository.RepositoryCallback


internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}
