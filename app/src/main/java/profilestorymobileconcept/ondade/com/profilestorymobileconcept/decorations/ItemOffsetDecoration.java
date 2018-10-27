package profilestorymobileconcept.ondade.com.profilestorymobileconcept.decorations;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Originally made by https://gist.github.com/yqritc/ccca77dc42f2364777e1
// Modified by me to support custom offset on each side

public class ItemOffsetDecoration extends RecyclerView.ItemDecoration {

    private int left;
    private int top;
    private int right;
    private int bottom;

    public ItemOffsetDecoration(int itemOffset) {
        left = top = right = bottom = itemOffset;
    }

    public ItemOffsetDecoration(@NonNull Context context, @DimenRes int itemOffsetId) {
        this(context.getResources().getDimensionPixelSize(itemOffsetId));
    }

    public ItemOffsetDecoration(int left,int top,int right,int bottom){
        this.left=left;
        this.top=top;
        this.right=right;
        this.bottom=bottom;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(left, top, right, bottom);
    }
}