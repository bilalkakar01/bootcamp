package com.github.bilalkakar01.bootcamp1;

import static android.system.Os.close;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void testing(){
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(),GreetingActivity.class);
        ActivityScenario.launch(intent);
        onView(withId(R.id.greetingMessage)).check(matches(isDisplayed()));
        ActivityScenario.launch(intent).close();
    }


}
