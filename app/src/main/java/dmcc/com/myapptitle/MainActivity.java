package dmcc.com.myapptitle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.wsg.widget.AppTitle;

public class MainActivity extends AppCompatActivity {

    AppTitle commonBar;
    Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        commonBar = (AppTitle) findViewById(R.id.mytitle);
        commonBar.setCenterText("标题").setShowLeftButton(true).setCanFinish(true).setRightText("保存");
        commonBar.setActionListener(new AppTitle.ActionListener() {
            @Override
            public void OnActionClickListener(View view) {
                showToast("--" + view.getId());
            }

            @Override
            public boolean OnActionLongClickListener(View view) {
                switch (view.getId()) {
                    case R.id.title_right_text:
                        showToast("保存");
                        break;
                }
                return true;
            }
        });

    }

    public void showToast(CharSequence text) {
        if (mToast == null) {
            mToast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }
}
