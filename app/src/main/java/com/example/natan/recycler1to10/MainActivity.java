package com.example.natan.recycler1to10;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    // COMPLETED (1) Create a private static final int called NUM_LIST_ITEMS and set it equal to 100
    private static final int NUM_LIST_ITEMS = 100;

    private RecyclerAdapter mRecyclerAdapter;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerAdapter=new RecyclerAdapter(NUM_LIST_ITEMS);
        mRecyclerView.setAdapter(mRecyclerAdapter);

    }
}
