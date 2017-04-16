package game.com.zoodoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Game extends AppCompatActivity {
    private static final String TAG = "ZooDoKu" ;
    public static final String KEY_DIFFICULTY = "game.com.zoodoku.difficulty" ;
    public static final int DIFFICULTY_EASY = 0;
    public static final int DIFFICULTY_MEDIUM = 1;
    public static final int DIFFICULTY_HARD = 2;
    private int puzzle[] = new int[9 * 9];
    private PuzzleView puzzleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        int diff = getIntent().getIntExtra(KEY_DIFFICULTY,DIFFICULTY_EASY);
        puzzle=getPuzzle(diff);
        calculateUsedTiles();
        puzzleView=new PuzzleView(this);
        setContentView(R.layout.activity_game);
        puzzleView.requestFocus();
    }
}
