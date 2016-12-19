package dmcc.com.myapptitle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.wsg.widget.AppTitle;

public class MainActivity extends AppCompatActivity {

    AppTitle commonBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        commonBar = (AppTitle) findViewById(R.id.mytitle);
        commonBar.setActionListener(new AppTitle.ActionListener() {
            @Override
            public void OnActionClickListener(View view) {

                Toast.makeText(MainActivity.this,"--" + view.getId(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
