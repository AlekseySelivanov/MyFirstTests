package com.example.myfirsttest.presenter

import com.example.myfirsttest.model.SearchResponse
import com.example.myfirsttest.repository.RepositoryCallback
import io.reactivex.Observable


interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )

    fun searchGithub(
        query: String
    ): Observable<SearchResponse>

}
