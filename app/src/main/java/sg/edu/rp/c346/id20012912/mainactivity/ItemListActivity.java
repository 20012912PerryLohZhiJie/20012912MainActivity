package sg.edu.rp.c346.id20012912.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class ItemListActivity extends AppCompatActivity
{

    EditText Item,ItemIndex;
    Spinner spinner;

    Button btnadd,btnupdate;
    Button btnremove,btnclear;
    Button btnhome;

    ListView ViewItem;
    ArrayList<String> alItem;
    ArrayAdapter<String> aaItem;
    String item = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        Intent getItemsList = getIntent();
        this.setTitle("Item List Activity");

        Item = findViewById(R.id.EditItem);
        ItemIndex = findViewById(R.id.EditItemIndex);

        spinner= findViewById(R.id.Spinner);

        btnadd = findViewById(R.id.btnAdd);
        btnupdate = findViewById(R.id.btnUpdate);
        btnremove = findViewById(R.id.btnRemove);
        btnclear = findViewById(R.id.btnClear);
        btnhome = findViewById(R.id.BacktoHome);

        ViewItem = findViewById(R.id.ListViewItems);

        alItem = new ArrayList<>();
        aaItem = new ArrayAdapter<>(ItemListActivity.this, android.R.layout.simple_list_item_1,alItem);
        ViewItem.setAdapter(aaItem);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

                switch (position)
                {
                    case 0:

                        Item.setHint("Expires <YYYY-M-D> <Item name>");
                        ItemIndex.setHint("Type in Item Number");

                        btnadd.setEnabled(true);
                        btnupdate.setEnabled(true);
                        btnremove.setEnabled(true);

                        break;

                    case 1:

                        Item.setHint("Expires <YYYY-M-D> <Item name>");
                        ItemIndex.setHint("Type in Item Number");

                        btnadd.setEnabled(true);
                        btnremove.setEnabled(true);
                        btnupdate.setEnabled(true);

                        break;

                    case 2:

                        Item.setHint("Expires <YYYY-M-D> <Item name>");
                        Item.setHint("Type in Item Number");

                        btnadd.setEnabled(true);
                        btnupdate.setEnabled(true);
                        btnremove.setEnabled(true);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });


        btnadd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                item = Item.getText().toString();

                if(item.contains("A"))
                {
                        alItem.add(item);
                        Collections.sort(alItem);
                        aaItem.notifyDataSetChanged();
                }


                else
                {
                   alItem.add(item);
                   aaItem.notifyDataSetChanged();

                }


                Toast.makeText(ItemListActivity.this,(item + " is added"),Toast.LENGTH_LONG).show();
                Item.setText(" ");
                ItemIndex.setText(null);
            }
        });

        btnremove.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                int itemid = Integer.parseInt(ItemIndex.getText().toString())-1 ;

                if(alItem.size()==0)
                {
                    Toast.makeText(ItemListActivity.this, "Nothing to remove",Toast.LENGTH_LONG).show();
                    return;
                }

                if(itemid > alItem.size()-1)
                {
                    Toast.makeText(ItemListActivity.this, "Nothing at that index to remove",Toast.LENGTH_LONG).show();
                    return;
                }

                alItem.remove(itemid);
                aaItem.notifyDataSetChanged();

                Toast.makeText(ItemListActivity.this, "Item " + (itemid+1) + " Removed!",Toast.LENGTH_LONG).show();
                Item.setText(" ");
                ItemIndex.setText(null);
            }
        });

        btnupdate.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                String updateitem = Item.getText().toString();
                int itemid = Integer.parseInt(ItemIndex.getText().toString())-1;

                alItem.set(itemid ,updateitem);
                Toast.makeText(ItemListActivity.this, (item + " is Updated to " + updateitem),Toast.LENGTH_LONG).show();

                aaItem.notifyDataSetChanged();
                Item.setText(" ");
                ItemIndex.setText(null);
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                alItem.clear();
                aaItem.notifyDataSetChanged();
                Toast.makeText(ItemListActivity.this, "All Items Cleared!",Toast.LENGTH_LONG).show();

                Item.setText(" ");
                ItemIndex.setText(null);
            }
        });

        btnhome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });


        ViewItem.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(ItemListActivity.this, " " + alItem.get(position), Toast.LENGTH_LONG).show();
                item = ViewItem.getSelectedItem().toString();
                ItemIndex.setText(" " + position);

            }
        });

        /*Item.addTextChangedListener(new TextWatcher()
        {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {


                int month1 = Integer.parseInt("1 Month")
                if (R.id.Spinner = month1 )
                {
                    count = 30;


                }
                (ItemListActivity.this).aaItem.getFilter().filter(s);



            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

         */




    }
}