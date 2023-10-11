package com.example.metric_convertapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1, sp2;
    EditText ed1;

    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.digitInput);
        sp1 = findViewById(R.id.metFrom);
        sp2 = findViewById(R.id.metTo);
        b1 = findViewById(R.id.conv);

        String[] from = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);

        String[] to = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
        ArrayAdapter add = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(add);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer res;

                Integer digit = Integer.parseInt(ed1.getText().toString());

                if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "km")
                {
                    res = digit;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "hm" && sp2.getSelectedItem().toString() == "hm")
                {
                    res = digit;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "dam" && sp2.getSelectedItem().toString() == "dam")
                {
                    res = digit;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "m")
                {
                    res = digit;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "dm" && sp2.getSelectedItem().toString() == "dm")
                {
                    res = digit;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "cm")
                {
                    res = digit;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "mm")
                {
                    res = digit;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "cm")
                {
                    res = digit / 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "dm")
                {
                    res = digit / 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "m")
                {
                    res = digit / 1000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "dam")
                {
                    res = digit / 10000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "hm")
                {
                    res = digit / 100000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "km")
                {
                    res = digit / 1000000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "mm")
                {
                    res = digit * 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "dm")
                {
                    res = digit / 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "m")
                {
                    res = digit / 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "dam")
                {
                    res = digit / 1000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "hm")
                {
                    res = digit / 10000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "km")
                {
                    res = digit / 100000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "dm" && sp2.getSelectedItem().toString() == "mm")
                {
                    res = digit * 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "dm" && sp2.getSelectedItem().toString() == "cm")
                {
                    res = digit * 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "dm" && sp2.getSelectedItem().toString() == "m")
                {
                    res = digit / 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "dm" && sp2.getSelectedItem().toString() == "dam")
                {
                    res = digit / 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "dm" && sp2.getSelectedItem().toString() == "hm")
                {
                    res = digit / 1000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "dm" && sp2.getSelectedItem().toString() == "km")
                {
                    res = digit / 10000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "mm")
                {
                    res = digit * 1000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "cm")
                {
                    res = digit * 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "dm")
                {
                    res = digit * 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "dam")
                {
                    res = digit / 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "hm")
                {
                    res = digit / 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "km")
                {
                    res = digit / 1000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "dam" && sp2.getSelectedItem().toString() == "mm")
                {
                    res = digit * 10000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "dam" && sp2.getSelectedItem().toString() == "cm")
                {
                    res = digit * 1000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "dam" && sp2.getSelectedItem().toString() == "dm")
                {
                    res = digit * 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "dam" && sp2.getSelectedItem().toString() == "m")
                {
                    res = digit * 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "dam" && sp2.getSelectedItem().toString() == "hm")
                {
                    res = digit / 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "dam" && sp2.getSelectedItem().toString() == "km")
                {
                    res = digit / 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "hm" && sp2.getSelectedItem().toString() == "mm")
                {
                    res = digit * 100000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "hm" && sp2.getSelectedItem().toString() == "cm")
                {
                    res = digit * 10000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "hm" && sp2.getSelectedItem().toString() == "dm")
                {
                    res = digit * 1000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "hm" && sp2.getSelectedItem().toString() == "m")
                {
                    res = digit * 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "hm" && sp2.getSelectedItem().toString() == "dam")
                {
                    res = digit * 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "hm" && sp2.getSelectedItem().toString() == "km")
                {
                    res = digit / 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "mm")
                {
                    res = digit * 1000000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "cm")
                {
                    res = digit * 100000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "dm")
                {
                    res = digit * 10000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "m")
                {
                    res = digit * 1000;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "dam")
                {
                    res = digit * 100;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

                if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "hm")
                {
                    res = digit * 10;
                    Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}