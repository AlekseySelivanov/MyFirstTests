package com.example.myfirsttest

import com.geekbrains.tests.presenter.details.DetailsPresenter
import com.example.myfirsttest.view.details.ViewDetailsContract
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class DetailsPresenterTest {

    private lateinit var presenter: DetailsPresenter

    @Mock
    private lateinit var viewContract: ViewDetailsContract

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        presenter = DetailsPresenter(viewContract)
    }

    @Test
    fun onIncrement_Test() {
        val counter = 1
        presenter.setCounter(counter)
        presenter.onIncrement()
        verify(viewContract, times(1)).setCount(counter + 1)
    }

    @Test
    fun onDecrement_Test() {
        val counter = 1
        presenter.setCounter(counter)
        presenter.onDecrement()
        verify(viewContract, times(1)).setCount(counter - 1)
    }

    @Test
    fun onAttach_ViewNotNull() {
        presenter.onAttach(viewContract)
        val viewFromPresenter = presenter.getView()
        assertNotNull(viewFromPresenter)
    }

    @Test
    fun onDetach_ViewNull() {
        presenter.onAttach(viewContract)
        val viewFromPresenter = presenter.getView()
        assertNotNull(viewFromPresenter)

        presenter.onDetach(viewContract)
        val viewFromPresenterAfterDetach = presenter.getView()

        assertNull(viewFromPresenterAfterDetach)
    }
}
