package ru.azanova.KPIris;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    private TextView tvName, tvTimeOver, tvTimeUni, tvTimePlos, tvNamename, textView2,
            textView3, textView4,tvPart, tvColObor, tvPlos, tvOver, tvUni, tvTimePart,
            tvOverHour, tvUniHour, tvPlosHour, tvOverDay, tvUniDay, tvPlosDay, textView19, textView20;
    private EditText edColPart, edColUni, edColOver, edColPlos;
    private Button btCalkTimePart, btBack, btCalk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_layout);
        init();
        scan();
        getIntentMain();
    }
    private void init()
    {
        btCalk = findViewById(R.id.btCalk);
        btBack = findViewById(R.id.btBack);
        btCalkTimePart = findViewById(R.id.btCalkTimePart);

        tvName = findViewById(R.id.tvName);
        tvTimeOver = findViewById(R.id.tvTimeOver);
        tvTimeUni = findViewById(R.id.tvTimeUni);
        tvTimePlos = findViewById(R.id.tvTimePlos);
        tvNamename = findViewById(R.id.tvNamename);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        tvPart = findViewById(R.id.tvPart);
        tvColObor = findViewById(R.id.tvColObor);
        tvTimePart = findViewById(R.id.tvTimePart);
        tvPlos = findViewById(R.id.tvPlos);
        tvOver = findViewById(R.id.tvOver);
        tvUniHour = findViewById(R.id.tvUniHour);
        tvUniDay = findViewById(R.id.tvUniDay);
        tvUni = findViewById(R.id.tvUni);
        tvOverHour = findViewById(R.id.tvOverHour);
        tvOverDay = findViewById(R.id.tvOverDay);
        tvPlosHour = findViewById(R.id.tvPlosHour);
        tvPlosDay = findViewById(R.id.tvPlosDay);

        edColPart = findViewById(R.id.edColPart);
        edColUni = findViewById(R.id.edColUni);
        edColOver = findViewById(R.id.edColOver);
        edColPlos = findViewById(R.id.edColPlos);
    }
    private void scan ()
    {
        btCalk.setVisibility(View.GONE);
        btBack.setVisibility(View.VISIBLE);
        btCalkTimePart.setVisibility(View.VISIBLE);

        tvName.setVisibility(View.VISIBLE);
        tvTimeOver.setVisibility(View.VISIBLE);
        tvTimeUni.setVisibility(View.VISIBLE);
        tvTimePlos.setVisibility(View.VISIBLE);
        tvNamename.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
        textView3.setVisibility(View.VISIBLE);
        textView4.setVisibility(View.VISIBLE);

        textView19.setVisibility(View.GONE);
        textView20.setVisibility(View.GONE);
        tvPart.setVisibility(View.GONE);
        tvColObor.setVisibility(View.GONE);
        tvTimePart.setVisibility(View.GONE);
        tvPlos.setVisibility(View.GONE);
        tvOver.setVisibility(View.GONE);
        tvUniHour.setVisibility(View.GONE);
        tvUniDay.setVisibility(View.GONE);
        tvUni.setVisibility(View.GONE);
        tvOverHour.setVisibility(View.GONE);
        tvOverDay.setVisibility(View.GONE);
        tvPlosHour.setVisibility(View.GONE);
        tvPlosDay.setVisibility(View.GONE);

        edColPart.setVisibility(View.GONE);
        edColUni.setVisibility(View.GONE);
        edColOver.setVisibility(View.GONE);
        edColPlos.setVisibility(View.GONE);
    }
    private void part ()
    {
        btCalk.setVisibility(View.VISIBLE);
        btBack.setVisibility(View.VISIBLE);
        btCalkTimePart.setVisibility(View.GONE);

        tvName.setVisibility(View.VISIBLE);
        tvTimeOver.setVisibility(View.VISIBLE);
        tvTimeUni.setVisibility(View.VISIBLE);
        tvTimePlos.setVisibility(View.VISIBLE);
        tvNamename.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
        textView3.setVisibility(View.VISIBLE);
        textView4.setVisibility(View.VISIBLE);

        tvPart.setVisibility(View.VISIBLE);
        tvColObor.setVisibility(View.VISIBLE);
        tvPlos.setVisibility(View.VISIBLE);
        tvOver.setVisibility(View.VISIBLE);
        tvUni.setVisibility(View.VISIBLE);

        textView19.setVisibility(View.GONE);
        textView20.setVisibility(View.GONE);
        tvTimePart.setVisibility(View.GONE);
        tvUniHour.setVisibility(View.GONE);
        tvUniDay.setVisibility(View.GONE);
        tvUni.setVisibility(View.VISIBLE);
        tvOverHour.setVisibility(View.GONE);
        tvOverDay.setVisibility(View.GONE);
        tvPlosHour.setVisibility(View.GONE);
        tvPlosDay.setVisibility(View.GONE);

        edColPart.setVisibility(View.VISIBLE);
        edColUni.setVisibility(View.VISIBLE);
        edColOver.setVisibility(View.VISIBLE);
        edColPlos.setVisibility(View.VISIBLE);
    }
    private void calkPart()
    {
        btCalk.setVisibility(View.VISIBLE);
        btBack.setVisibility(View.VISIBLE);
        btCalkTimePart.setVisibility(View.GONE);

        tvName.setVisibility(View.VISIBLE);
        tvTimeOver.setVisibility(View.VISIBLE);
        tvTimeUni.setVisibility(View.VISIBLE);
        tvTimePlos.setVisibility(View.VISIBLE);
        tvNamename.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
        textView3.setVisibility(View.VISIBLE);
        textView4.setVisibility(View.VISIBLE);

        tvPart.setVisibility(View.VISIBLE);
        tvColObor.setVisibility(View.VISIBLE);
        tvPlos.setVisibility(View.VISIBLE);
        tvOver.setVisibility(View.VISIBLE);
        tvUni.setVisibility(View.VISIBLE);

        textView19.setVisibility(View.VISIBLE);
        textView20.setVisibility(View.VISIBLE);
        tvTimePart.setVisibility(View.VISIBLE);
        tvUniHour.setVisibility(View.VISIBLE);
        tvUniDay.setVisibility(View.VISIBLE);
        tvUni.setVisibility(View.VISIBLE);
        tvOverHour.setVisibility(View.VISIBLE);
        tvOverDay.setVisibility(View.VISIBLE);
        tvPlosHour.setVisibility(View.VISIBLE);
        tvPlosDay.setVisibility(View.VISIBLE);

        edColPart.setVisibility(View.VISIBLE);
        edColUni.setVisibility(View.VISIBLE);
        edColOver.setVisibility(View.VISIBLE);
        edColPlos.setVisibility(View.VISIBLE);
    }
    private void getIntentMain ()
    {
        Intent i = getIntent();
        if (i != null)
        {
            tvName.setText(i.getStringExtra(Constant.PRODUCT_NAME));
            tvTimeOver.setText(i.getStringExtra(Constant.PRODUCT_TIME_OVER));
            tvTimeUni.setText(i.getStringExtra(Constant.PRODUCT_TIME_UNI));
            tvTimePlos.setText(i.getStringExtra(Constant.PRODUCT_TIME_PLOS));
        }
    }
    public void calk ()
    {
        int colPartI = Integer.parseInt(edColPart.getText().toString());
        int colOverI = Integer.parseInt(edColOver.getText().toString());
        int colUniI = Integer.parseInt(edColUni.getText().toString());
        int colPlosI = Integer.parseInt(edColPlos.getText().toString());

        int timeOver = Integer.parseInt(tvTimeOver.getText().toString());
        int timeUni = Integer.parseInt(tvTimeUni.getText().toString());
        int timePlos = Integer.parseInt(tvTimePlos.getText().toString());


        int overHour = colPartI * timeOver/60/colOverI;
        int uniHour = colPartI  * timeUni/60/colUniI;
        int plosHour = colPartI * timePlos/60/colPlosI;
        int overDay = overHour/8;
        int uniDay = uniHour/8;
        int plosDay = plosHour/8;

        String overHourS = overHour+"";
        String uniHourS = uniHour+"";
        String plosHourS = plosHour+"";
        String overDayS = overDay+"";
        String uniDayS = uniDay+"";
        String plosDayS = plosDay+"";

        tvOverHour.setText(overHourS);
        tvUniHour.setText(uniHourS);
        tvPlosHour.setText(plosHourS);
        tvOverDay.setText(overDayS);
        tvUniDay.setText(uniDayS);
        tvPlosDay.setText(plosDayS);

    }
    public void onClickBack(View view)
    {
        Intent i = new Intent(ShowActivity.this, StartActivity.class);
        startActivity(i);
    }
    public void onClickCalkTime (View view)
    {
        part();

        }
    public void onClickCalk(View view)
    {

       String colPart = edColPart.getText().toString();
       String colOver = edColOver.getText().toString();
       String colUni = edColUni.getText().toString();
       String colPlos = edColPlos.getText().toString();

        if(!TextUtils.isEmpty(colPart) && !TextUtils.isEmpty(colOver)&& !TextUtils.isEmpty(colUni)&& !TextUtils.isEmpty(colPlos))
        {
            calkPart();
            calk();

        }
        else
        {
            Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show();
        }

    }

}

