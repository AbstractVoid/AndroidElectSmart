package com.electsmart.electsmart;

import static android.support.test.espresso.Espresso.onView;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.intent.matcher.IntentMatchers;
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
import android.view.View;
import android.widget.ListView;

import com.electsmart.electsmart.API.GoogleCivicInfo.Models.Candidate;
import com.electsmart.electsmart.Activities.ElectionActivity;
import com.electsmart.electsmart.Activities.MainActivity;
import com.electsmart.electsmart.Activities.TabActivity;
import com.electsmart.electsmart.Adapters.UpcomingElectionsAdapter;
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
public class UpcomingElectionNavigationTest extends ActivityUnitTestCase<TabActivity> {

    public UpcomingElectionNavigationTest() {
        super(TabActivity.class);
    }

    //Start activity before each test, terminated after each test
    /*@Rule
    public ActivityTestRule<TabActivity> mActivityRule = new ActivityTestRule<>(TabActivity.class);*/


    /*@Rule
    public IntentsTestRule<TabActivity> mActivityRule = new IntentsTestRule<TabActivity>(
            TabActivity.class);*/

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
    public void upcomingElectionsSelectElection() {
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

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //do nothing
        }
    }



    /*@Test
    public void upcomingElectionsSelectElection() {

        //Find Upcoming Elections Tab and select it
        onView(Matchers.allOf(ViewMatchers.isDescendantOfA(ViewMatchers.withId(R.id.tabs)), ViewMatchers.withText("Upcoming Elections")))
                .perform(ViewActions.click());

        onView(Matchers.allOf(ViewMatchers.isDescendantOfA(ViewMatchers.withId(R.id.tabs)), ViewMatchers.withText("Upcoming Elections")))
                .perform(ViewActions.click());

        // register ElectionActivity as it need to be monitored.
        Log.d("debug", "Class name: " + ElectionActivity.class.getName());

        //Find first row and select left election
        Espresso.onData(Matchers.anything())
                .inAdapterView(ViewMatchers.withId(R.id.upcomingElectionList))
                .atPosition(0)
                .onChildView(ViewMatchers.withId(R.id.leftElection))
                .perform(ViewActions.click());


        //Check activity started
        Intents.intended(IntentMatchers.hasComponent(new ComponentName(InstrumentationRegistry.getTargetContext(), ElectionActivity.class)));
    }

    public static Matcher<Object> UpcomingElectionRowHasContent( UpcomingElectionRow expectedRow) {
        return UpcomingElectionRowHasContent(Matchers.equalTo(expectedRow));
    }
    //private method that does the work of matching
    private static Matcher<Object> UpcomingElectionRowHasContent(final Matcher<UpcomingElectionRow> expectedObject) {
        return new BoundedMatcher<Object, UpcomingElectionRow>(UpcomingElectionRow.class) {
            @Override
            public boolean matchesSafely( final UpcomingElectionRow actualObject) {
                // ****** ... the 'matches'. See below.
                // this requires the MyObjectWithItemAndSize to have an 'equals' method
                if( expectedObject.matches(actualObject) ) {
                    return true;
                } else {
                    return false;
                }
            }
            @Override
            public void describeTo(final Description description) {
                description.appendText("True should return if expectedRow contains same info as actualRow besides hashMap");
            }
        };
    }*/


}