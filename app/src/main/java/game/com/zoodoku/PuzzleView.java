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

}
