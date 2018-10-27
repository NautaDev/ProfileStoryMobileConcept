package profilestorymobileconcept.ondade.com.profilestorymobileconcept.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import com.like.LikeButton;
import com.makeramen.roundedimageview.RoundedImageView;

import profilestorymobileconcept.ondade.com.profilestorymobileconcept.interfaces.FeedImageListener;
import profilestorymobileconcept.ondade.com.profilestorymobileconcept.models.FeedImageModel;

// TODO: Comment this file
public class FeedImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public RoundedImageView imageView;
    public LikeButton likeButton;
    public RelativeLayout relativeLayout;

    FeedImageModel item;
    FeedImageListener listener;

    public FeedImageViewHolder(View v, FeedImageListener listener){

        super(v);

        this.listener=listener;
        v.setOnClickListener(this);

        //imageView = (RoundedImageView)v.findViewById();
        //likeButton = (LikeButton)v.findViewById();
        //relativeLayout = (RelativeLayout)v.findViewById();

    }

    public void setData(FeedImageModel item){
        this.item = item;

        // TODO: Load image from URL
        // TODO: Set image as liked or not (random since it is a demo)
    }

    @Override
    public void onClick(View view){
        // TODO: Fire event when click on image
        if(listener!=null){
            listener.onItemClick(item);
        }
    }

}
