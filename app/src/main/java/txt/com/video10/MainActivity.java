package txt.com.video10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initLayoutbyLinear();
        setContentView(linearLayoutRoot);

    }

    public void initLayoutbyLinear (){
        //linearLayoutRoot
        linearLayoutRoot = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsRoot = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
        linearLayoutRoot.setLayoutParams(layoutParamsRoot);

        //linearLayout Second
        LinearLayout linearLayoutSecond = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsSecond = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        linearLayoutSecond.setLayoutParams(layoutParamsSecond);

        //ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setImageResource(R.mipmap.ic_launcher);

        // TextView
        TextView textView = new TextView(this);
        LinearLayout.LayoutParams layoutParamstextView = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamstextView.gravity = Gravity.CENTER;
        layoutParamstextView.setMargins(20,0,0,0);
        textView.setLayoutParams(layoutParamstextView);
        textView.setText(R.string.textView_Hello);

        //add ImageView và TextView in linearLayoutSecond
        linearLayoutSecond.addView(imageView);
        linearLayoutSecond.addView(textView);

        // Button Click

        Button buttonClick = new Button(this);
        LinearLayout.LayoutParams layoutParamsbuttonClick =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonClick.setLayoutParams(layoutParamsbuttonClick);
        layoutParamsbuttonClick.gravity = Gravity.CENTER;
        buttonClick.setPadding(20,0,0,0);
        buttonClick.setText(R.string.textbutton_Click);

        // Button Hihi

        Button buttonHihi = new Button(this);
        LinearLayout.LayoutParams layoutParamsbuttonHihi =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonHihi.setLayoutParams(layoutParamsbuttonHihi);
        layoutParamsbuttonHihi.gravity = Gravity.CENTER;
        buttonHihi.setPadding(20,0,0,0);
        buttonHihi.setText(R.string.textbutton_Hihi);

        // add linearLayoutSecond, buttonClick và button Hihi in LinearlayoutRoot
        linearLayoutRoot.addView(linearLayoutSecond);
        linearLayoutRoot.addView(buttonClick);
        linearLayoutRoot.addView(buttonHihi);

    }
}