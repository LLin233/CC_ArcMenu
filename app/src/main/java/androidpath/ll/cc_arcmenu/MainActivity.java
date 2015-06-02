package androidpath.ll.cc_arcmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArcMenu arcMenuRightBottom = (ArcMenu) findViewById(R.id.id_arcmenu1);
        // add a MenuItem in code
        ImageView people = new ImageView(this);
        people.setImageResource(R.mipmap.composer_with);
        people.setTag("People");
        arcMenuRightBottom.addView(people);


        arcMenuRightBottom
                .setOnMenuItemClickListener(new ArcMenu.OnMenuItemClickListener() {
                    //Test menu status
                    @Override
                    public void onClick(View view, int pos) {
                        Toast.makeText(MainActivity.this,
                                pos + ":" + view.getTag(), Toast.LENGTH_SHORT)
                                .show();
                    }
                });
    }
}
