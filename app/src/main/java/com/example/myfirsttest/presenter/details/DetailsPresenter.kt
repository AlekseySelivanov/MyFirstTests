package com.example.myfirsttest.presenter.details

import com.example.myfirsttest.view.ViewContract
import com.example.myfirsttest.view.details.ViewDetailsContract

internal class DetailsPresenter internal constructor(
    private var viewContract: ViewDetailsContract?,
    private var count: Int = 0
) : PresenterDetailsContract {

    override fun setCounter(count: Int) {
        this.count = count
    }

    override fun onIncrement() {
        count++
        viewContract!!.setCount(count)
    }

    override fun onDecrement() {
        count--
        viewContract!!.setCount(count)
    }

    fun getView() = viewContract

    override fun onAttach(view: ViewContract) {
        if (viewContract == null) {
            viewContract = view as ViewDetailsContract
        }
    }

    override fun onDetach(view: ViewContract) {
        viewContract = null
    }
}
