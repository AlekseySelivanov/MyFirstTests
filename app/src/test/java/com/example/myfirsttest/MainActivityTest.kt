package com.example.myfirsttest

import android.os.Build
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.geekbrains.tests.view.search.MainActivity
import org.junit.runner.RunWith
import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class MainActivityTest {
    private lateinit var scenario: ActivityScenario<MainActivity>
    private lateinit var context: Context

    @Before
    fun setUp() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
        context = ApplicationProvider.getApplicationContext()
    }

    @Test
    fun activity_AssertNotNull() {
        scenario.onActivity {
            assertNotNull(it)
        }
    }

    @Test
    fun activity_IsResumed() {
        assertEquals(Lifecycle.State.RESUMED, scenario.state)
    }

    @Test
    fun activity_EditText_NotNull(){
        scenario.onActivity {
            val searchEditText = it.findViewById<EditText>(R.id.searchEditText)
            assertNotNull(searchEditText)
        }
    }

    @Test
    fun activity_EditText_IsVisible(){
        scenario.onActivity {
            val searchEditText = it.findViewById<EditText>(R.id.searchEditText)
            assertEquals(View.VISIBLE, searchEditText.visibility)
        }
    }

    @Test
    fun activity_EditText_Test(){
        scenario.onActivity {
            val searchEditText = it.findViewById<EditText>(R.id.searchEditText)
            searchEditText.setText("Test", TextView.BufferType.EDITABLE)
            assertNotNull(searchEditText.text)
            assertEquals("Test", searchEditText.text.toString())
        }
    }

    @Test
    fun activity_Button_NotNull(){
        scenario.onActivity {
            val toDetailsActivityButton = it.findViewById<Button>(R.id.toDetailsActivityButton)
            assertNotNull(toDetailsActivityButton)
        }
    }

    @Test
    fun activity_Button_IsVisible(){
        scenario.onActivity {
            val toDetailsActivityButton = it.findViewById<Button>(R.id.toDetailsActivityButton)
            assertEquals(View.VISIBLE, toDetailsActivityButton.visibility)
        }
    }

    @After
    fun close(){
        scenario.close()
    }
}