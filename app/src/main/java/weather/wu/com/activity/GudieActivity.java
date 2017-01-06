package weather.wu.com.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;
import com.zaaach.citypicker.CityPickerActivity;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import weather.wu.com.adapter.GuideFragmentAdapter;
import weather.wu.com.utils.SharedPreferencesUtils;
import weather.wu.com.utils.SpUtils;
import weather.wu.com.weather.MainActivity;
import weather.wu.com.weather.R;

public class GudieActivity extends FragmentActivity implements ViewPager.OnPageChangeListener{
   @BindView(R.id.guide_btn)
    public Button mBtnEnter;
    GuideFragmentAdapter mAdapter;
    //@BindViews(R.id.pager)
    ViewPager mPager;
   // @BindView(R.id.indicator)
    PageIndicator mIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide);

      //  SharedPreferencesUtils sharedPreferencesUtils = new SharedPreferencesUtils(this);
     /*   if(!SpUtils.getBoolean(getApplication(),"first_start",true)){

            startActivity(new Intent(this,MainActivity.class));
            finish();
        }*/
       /* if(!SpUtils.getBoolean(getApplication(),SpUtils.FIRST_START,true)){
            startActivity(new Intent(GudieActivity.this,MainActivity.class));
        }*/


        mAdapter = new GuideFragmentAdapter(getSupportFragmentManager());

       mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);

      /*  mAdapter.setCount(mAdapter.getCount() + 1);
        mIndicator.notifyDataSetChanged();*/
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
           /* if(position!=4){
                mBtnEnter.setVisibility(View.GONE);
            }*/
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
 /*   @OnClick(R.id.guide_btn)
    public void onEnter(View v){
        startActivity(new Intent(GudieActivity.this, MainActivity.class));
        finish();
    }*/
}