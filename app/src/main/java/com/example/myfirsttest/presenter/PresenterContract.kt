package com.example.myfirsttest.presenter

import com.example.myfirsttest.view.ViewContract

internal interface PresenterContract {
    fun onAttach(view: ViewContract)
    fun onDetach(view: ViewContract)
}
