package com.electsmart.electsmart;

import static android.support.test.espresso.Espresso.onView;

import android.app.Activity;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;

import com.electsmart.electsmart.API.GoogleCivicInfo.Models.Candidate;
import com.electsmart.electsmart.Activities.ElectionActivity;
import com.electsmart.electsmart.Activities.TabActivity;
import com.electsmart.electsmart.Models.Election;
import com.electsmart.electsmart.Models.UpcomingElectionRow;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ElectionNavigationTest extends ActivityUnitTestCase<TabActivity> {

    public ElectionNavigationTest() {
        super(TabActivity.class);
    }

    private UiDevice mDevice;

    @Rule
    public IntentsTestRule<TabActivity> mActivityRule = new IntentsTestRule<TabActivity>(
            TabActivity.class){
        @Override
        protected void beforeActivityLaunched() {
            mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            super.beforeActivityLaunched();
        }
    };

    @Test
    public void ElectionActivityStarted() {

        //Open More options menu
        UiObject upcomingElectionsTab = mDevice.findObject(new UiSelector().className("android.support.v7.app.ActionBar$Tab").index(1));
        try {
            if (upcomingElectionsTab.exists() && upcomingElectionsTab.isEnabled()) {
                upcomingElectionsTab.click();
            }
        } catch (UiObjectNotFoundException e) {
            System.exit(1);
        }

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //do nothing
        }

        //Select first election
        UiObject election = mDevice.findObject(new UiSelector()
                .className("android.widget.ListView")
                .index(2)
                .childSelector(new UiSelector()
                        .index(0)
                        .className("android.widget.LinearLayout")
                        .resourceId("com.electsmart.electsmart:id/UpcomingElectionClicker"))
                .childSelector(new UiSelector()
                        .index(0)
                        .className("android.widget.RelativeLayout")
                        .resourceId("com.electsmart.electsmart:id/leftElection")));
        try {
            if (election.exists() && election.isEnabled()) {
                election.click();
            } else {
                Log.d("election", "Can't find election!!!!!!!!!!!!!!1");
                System.exit(1);
            }
        } catch (UiObjectNotFoundException e) {
            Log.d("SETTINGS ERROR: ", "Couldn't find settings option");
        }
        //Click on child (Candidate)
        /*
        Espresso.onData(Matchers.allOf(Matchers.instanceOf(Candidate.class), withCandidateName("Candidate 0")))
                .inAdapterView(ViewMatchers.withId(R.id.expList))
                .perform(ViewActions.click());
        */

        try {
            Thread.sleep(15000);
        }catch(InterruptedException e){
            //do nothing
        }

        //Click on candidate
        Espresso.onData(Matchers.anything())
                .inAdapterView(ViewMatchers.withId(R.id.candidateList))
                .atPosition(0)
                .perform(ViewActions.click());

        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            //do nothing
        }
    }

    public static Matcher<Object> withPositionName(String name) {
        return withPositionName(Matchers.equalTo(name));
    }
    //private method that does the work of matching
    private static Matcher<Object> withPositionName(final Matcher<String> name) {
        return new BoundedMatcher<Object, String>(String.class) {
            @Override
            public boolean matchesSafely( final String actualObject) {
                // ****** ... the 'matches'. See below.
                // this requires the MyObjectWithItemAndSize to have an 'equals' method
                if( name.matches(actualObject) ) {
                    return true;
                } else {
                    return false;
                }
            }
            @Override
            public void describeTo(final Description description) {
                description.appendText("True should return if expectedCandidate contains same info as actualCandidate besides hashMap");
            }
        };
    }

    public static Matcher<Object> withCandidateName(String name) {
        return withCandidateName(Matchers.equalTo(name));
    }
    //private method that does the work of matching
    private static Matcher<Object> withCandidateName(final Matcher<String> name) {
        return new BoundedMatcher<Object, Candidate>(Candidate.class) {
            @Override
            public boolean matchesSafely( final Candidate actualObject) {
                // ****** ... the 'matches'. See below.
                // this requires the MyObjectWithItemAndSize to have an 'equals' method
                if( name.matches(actualObject.getName()) ) {
                    return true;
                } else {
                    return false;
                }
            }
            @Override
            public void describeTo(final Description description) {
                description.appendText("True should return if expectedCandidate contains same info as actualCandidate besides hashMap");
            }
        };
    }
}
