package com.example.rowdyhacks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    final int VIEW_TYPE_LOADING = 0;
    final int VIEW_TYPE_ITEM = 1;
    public List<String> mHistory;
    public RecyclerViewAdapter(List<String> mList){
        mHistory = mList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM){
            //also got to get context for the tvBtn
            //tvBtn is for message
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
            return new ItemViewHolder(view);
        }
        else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_loading, parent, false);
            return new LoadingHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if(viewHolder instanceof ItemViewHolder)
            populateItemRows((ItemViewHolder) viewHolder, position);
    }

    @Override
    public int getItemCount() {
        return mHistory == null ? 0: mHistory.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mHistory.get(position) == null ? VIEW_TYPE_LOADING: VIEW_TYPE_ITEM;
    }

    private class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvItem;
        //Button tvBtn;
        public ItemViewHolder(@NonNull View itemView){
            super(itemView);
            tvItem = itemView.findViewById(R.id.tvItem);
            //tvBtn = itemView.findViewById(R.id.tvBtn);
        }
    }
    private class LoadingHolder extends RecyclerView.ViewHolder {
        public LoadingHolder (@NonNull View itemView){
            super(itemView);
        }
    }
    private void populateItemRows (ItemViewHolder viewHolder, int position){
        String item = mHistory.get(position);
        viewHolder.tvItem.setText(item);
        //viewHolder.tvBtn.setText(item);
    }
}
