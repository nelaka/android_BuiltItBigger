package com.udacity.gradle.builditbigger;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertNotNull;


@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void asyncTaskLoadJokesTest() throws ExecutionException, InterruptedException {

        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(new EndpointsAsyncTask.TaskCompleteListener() {
            @Override
            public void onTaskComplete(String result) {
                //is implemented after test, so it's not necessary
            }
        });
        asyncTask.execute();

        assertNotNull(asyncTask.get());
    }


    @Test
    public void clickButtonDisplaysJoke() {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.joke_tv)).check(matches(isDisplayed()));
    }
}