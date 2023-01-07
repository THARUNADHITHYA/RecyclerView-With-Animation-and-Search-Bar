package com.example.recyclerviewanimated;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ReviewAdapter reviewAdapter;
    List<ReviewItem> mData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //requestWindowFeature(Window.FEATURE_ACTION_BAR);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();


        recyclerView = findViewById(R.id.review_rv);
        mData = new ArrayList<>();
        mData.add(new ReviewItem("Iphone 14 Review","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","11/06/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("First trip to India","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.","21/05/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("Android Views ","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","12/12/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("Oneplus 9 Review","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.","07/07/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("Java Programming ","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","11/08/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("Dell G3 Review","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","03/02/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("Tata Harrier Review","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","17/12/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("Engineering Scope","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.","16/11/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("Innovations ","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","24/08/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("Yamaha in 2023","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.","14/09/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("Realme Booms","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.","25/10/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("5G Tech","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.","06/04/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("UI UX Designing","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","24/05/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("Neural Networks","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","14/01/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("Parallel Processing","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","15/10/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("Hiring Increases","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","12/08/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("2022 Review","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","31/12/2022",R.drawable.usertwo));
        mData.add(new ReviewItem("BCCI about WC T20 ","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.","11/08/2022",R.drawable.uservoyager));
        mData.add(new ReviewItem("IPL Updates","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","11/11/2022",R.drawable.usertwo));

        reviewAdapter = new ReviewAdapter(this,mData);
        recyclerView.setAdapter(reviewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu,menu);
        MenuItem searchItem = menu.findItem(R.id.actionSearch);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                filter(s);
                return false;
            }
        });

        return  true;

    }

    public void filter(String text)
    {
        ArrayList<ReviewItem> filteredList = new ArrayList<ReviewItem>();

        for(ReviewItem item: mData){
            if(item.getTitle().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }

        if(filteredList.isEmpty()){
            Toast.makeText(this,"No match Found",Toast.LENGTH_SHORT).show();
        }
        else
            reviewAdapter.filteredList(filteredList);

    }


}