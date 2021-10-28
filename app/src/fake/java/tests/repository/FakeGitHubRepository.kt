package com.example.tests.repository

import com.example.myfirsttest.model.SearchResponse
import com.example.myfirsttest.presenter.RepositoryContract
import com.example.myfirsttest.repository.RepositoryCallback
import retrofit2.Response

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}
