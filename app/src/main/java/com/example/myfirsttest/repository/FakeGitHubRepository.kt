package com.example.myfirsttest.repository


import com.example.myfirsttest.model.SearchResponse
import com.example.myfirsttest.presenter.RepositoryContract
import retrofit2.Response

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}
