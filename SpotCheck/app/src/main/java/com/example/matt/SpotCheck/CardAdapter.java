package com.example.matt.SpotCheck;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dan on 3/23/16.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder>
{
	private CardView[] cardSet;
	// Provide a reference to the views for each data item
	// Complex data items may need more than one view per item, and
	// you provide access to all the views for a data item in a view holder
	public static class ViewHolder extends RecyclerView.ViewHolder {
		// each data item is just a string in this case
		public CardView cardView;

		public ViewHolder(CardView card) {
			super(card);
			cardView = card;
		}
	}

	// Provide a suitable constructor (depends on the kind of dataset)
	public CardAdapter(CardView[] mCardSet) {
		cardSet = mCardSet;
	}

	// Create new views (invoked by the layout manager)
	@Override
	public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
	                                               int viewType) {
		// create a new view
		View v = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.spot_card, parent, false);
		// set the view's size, margins, paddings and layout parameters
		//TODO:...

		ViewHolder vh = new ViewHolder((CardView)v);
		return vh;
	}

	// Replace the contents of a view (invoked by the layout manager)
	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		// - get element from your dataset at this position
		// - replace the contents of the view with that element
		holder.cardView = cardSet[position];

	}

	// Return the size of your dataset (invoked by the layout manager)
	@Override
	public int getItemCount() {
		return cardSet.length;
	}
}