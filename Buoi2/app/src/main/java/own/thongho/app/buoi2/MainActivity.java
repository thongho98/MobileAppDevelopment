package own.thongho.app.buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvThongBao;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login2);

        //setControl();

        //setEvent();
    }

    private void setControl(){
        tvThongBao = findViewById(R.id.tvThongBao);
        btnClick = findViewById(R.id.btnClick);
    }

    private void setEvent(){
        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvThongBao.setText("Giải lao");
            }
        });
    }
}
