package com.example.rowdyhacks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.activity_signup, parent, false);


        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = mContacts.get(position);

        // Set item views based on your views and data model
        TextView textView = holder.nameTextView;
        textView.setText(contact.getName());
        Button button = holder.messageButton;
        button.setText(contact.isOnline() ? "Message" : "Offline");
        button.setEnabled(contact.isOnline());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public Button messageButton;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
            messageButton = (Button) itemView.findViewById(R.id.message_button);
        }
    }
    private List<Contact> mContacts;

    // Pass in the contact array into the constructor
    public RecyclerViewAdapter(List<Contact> contacts) {
        mContacts = contacts;
    }

}
/*

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
        if(viewHolder instanceof ItemViewHolder) {
            populateItemRows((ItemViewHolder) viewHolder, position);
        }
    }

    @Override
    public int getItemCount() {

        return mHistory.size();
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
*/