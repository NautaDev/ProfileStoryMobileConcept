package profilestorymobileconcept.ondade.com.profilestorymobileconcept.adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import profilestorymobileconcept.ondade.com.profilestorymobileconcept.R;
import profilestorymobileconcept.ondade.com.profilestorymobileconcept.interfaces.FeedImageListener;
import profilestorymobileconcept.ondade.com.profilestorymobileconcept.models.FeedImageModel;
import profilestorymobileconcept.ondade.com.profilestorymobileconcept.viewHolders.FeedImageViewHolder;

// TODO: Comment this file
public class FeedImageAdapter extends RecyclerView.Adapter {

    ArrayList<FeedImageModel> values;
    Context context;
    FeedImageListener listener;

    public static ArrayList<FeedImageModel> generateSamples(){
        ArrayList<FeedImageModel> arrayList=new ArrayList<>();

        for(int i=0;i<6;i++){
            arrayList.add(new FeedImageModel("",false));
        }

        return arrayList;
    }

    public FeedImageAdapter(Context context,ArrayList<FeedImageModel> values,FeedImageListener listener){
        this.values=values;
        this.context=context;
        this.listener=listener;
    }

    @Override
    public FeedImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.feed_image_recycler_item, parent, false);

        return new FeedImageViewHolder(view,listener);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // TODO: This can be done better, now I prefer to just have a working version
        // but I should improve it
        FeedImageViewHolder fHolder = (FeedImageViewHolder)holder;
        fHolder.setData(values.get(position));

    }

    @Override
    public int getItemCount() {

        return values.size();
    }

}
