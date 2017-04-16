package game.com.zoodoku;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

/**
 * Created by Aswin on 22-Mar-17.
 */
public class PuzzleView extends View {
    private static final String TAG = "ZooDoKu" ;
    private final Game game;
    public PuzzleView(Context context){
        super(context);
        this.game=(Game) context;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
    private float width;
    private float height;
    private int selX;
    private int selY;
    private final Rect selRect=new Rect();

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        width=w / 9f;               //Dividing current screen width 9 times; because, 9 rows and 9 columns in sudoku
        height=h / 9f;               //Dividing current screen height 9 times
        getRect(selX,selY,selRect);
        Log.d(TAG, "onSizeChanged: width " + width + ", height " + height);
        super.onSizeChanged(w, h, oldw, oldh);
    }
    public void getRect(int x,int y, Rect rect){
        rect.set((int) (x*width),(int) (y*height),(int) (x*width+width),(int) (y*height+height));
    }
    @Override
    protected void onDraw(Canvas canvas) {
        Paint background = new Paint();
        background.setColor(getResources().getColor(R.color.puzzle_background));
        canvas.drawRect(0,0,getWidth(),getHeight(),background);
        super.onDraw(canvas);
    }
}
