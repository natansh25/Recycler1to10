package com.example.natan.recycler1to10;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Constructor;

/**
 * Created by natan on 11/16/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.NumberViewHolder> {

    private int mNumberItems;

    //Constructor for GreenAdapter that accepts a number of items to display and the specification


    public RecyclerAdapter(int numberOfItems) {

        mNumberItems = numberOfItems;
    }

    /**
     * This gets called when each new ViewHolder is created. This happens when the RecyclerView
     * is laid out. Enough ViewHolders will be created to fill the screen and allow for scrolling.
     *
     * @param viewGroup The ViewGroup that these ViewHolders are contained within.
     * @param viewType  If your RecyclerView has more than one type of item (which ours doesn't) you
     *                  can use this viewType integer to provide a different layout. See
     *                  {@link android.support.v7.widget.RecyclerView.Adapter#getItemViewType(int)}
     *                  for more details.
     * @return A new NumberViewHolder that holds the View for each list item
     */


    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.item_layout;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        NumberViewHolder viewHolder = new NumberViewHolder(view);

        return viewHolder;


    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {

        holder.listItemNumberView.setText(String.valueOf(position));


    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {
        // custom layout text view

        TextView listItemNumberView;

        public NumberViewHolder(View itemView) {
            super(itemView);
            // findview by id text view
            listItemNumberView = (TextView) itemView.findViewById(R.id.textView);

        }
    }
}

