package sg.edu.rp.c346.id20012912.mainactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity
{
    TextView Heading, Introduction;
    TextView Phone, Electric, Furniture;
    TextView Mechanic, Hardware, Desktop, Television;
    ToggleButton Exit;
    Button Things;
    String CategoryClicked = " ";



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("C346 SA Activity");

        Heading = findViewById(R.id.Title);
        Heading.setTextColor(Color.parseColor("#FF0000"));


        Introduction = findViewById(R.id.Intro);
        Introduction.setTextColor(Color.parseColor("#0000FF"));


        Phone = findViewById(R.id.Mobile);
        registerForContextMenu(Phone);
        Phone.setTextColor(Color.parseColor("#1A1517"));

        Desktop = findViewById(R.id.Desktop);
        registerForContextMenu(Desktop);
        Desktop.setTextColor(Color.parseColor("#1A1517"));

        Television  = findViewById(R.id.tv);
        registerForContextMenu(Television);
        Television.setTextColor(Color.parseColor("#1A1517"));

        Electric  = findViewById(R.id.Electrical);
        registerForContextMenu(Electric);
        Electric.setTextColor(Color.parseColor("#1A1517"));

        Furniture = findViewById(R.id.Furniture);
        registerForContextMenu(Furniture);
        Furniture.setTextColor(Color.parseColor("#1A1517"));

        Mechanic = findViewById(R.id.Mechanical);
        registerForContextMenu(Mechanic);
        Mechanic.setTextColor(Color.parseColor("#1A1517"));


        Hardware = findViewById(R.id.HardWare);
        registerForContextMenu(Hardware);
        Hardware.setTextColor(Color.parseColor("#1A1517"));

        Things = findViewById(R.id.Items);
        Exit = findViewById(R.id.Exit);


        Things.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, ItemListActivity.class);
                startActivity(intent);

                Toast toast = Toast.makeText(getApplicationContext(),"Welcome to ItemsList Activity", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0, 0);
                toast.show();
            }
        });

        Exit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == R.id.EnglishSelection)
        {
            Toast.makeText(MainActivity.this, "English selected", Toast.LENGTH_LONG).show();

            Heading.setText("FindMyProduct");
            Introduction.setText("Hello there! Welcome to KnowMyItem App! In here, you will get to know a list of products and their warranties from its categories with just a click!");

            Phone.setText("Mobile Phones");
            Electric.setText("Electrical Products");
            Furniture.setText("Furniture");

            Mechanic.setText("Mechanical Products");
            Hardware.setText("Hardware");
            Desktop.setText("Desktop/Computer");
            Television.setText("Television");


        }

        if (item.getItemId() == R.id.SimpChineseSelection)
        {
            Toast.makeText(MainActivity.this, "Simplified Chinese selected", Toast.LENGTH_LONG).show();

            Heading.setText("查找我的产品");
            Introduction.setText("你好呀！欢迎使用 KnowMyItem 应用程序！在这里，您只需点击一下即可了解产品及其类别的保修清单");

            Phone.setText("手机");
            Electric.setText("电器产品");
            Furniture.setText("家具");

            Mechanic.setText("机械产品");
            Hardware.setText("硬件");
            Desktop.setText("台式电脑");
            Television.setText("电视");
        }

        if (item.getItemId() == R.id.TradChineseSelection)
        {
            Toast.makeText(MainActivity.this, "Traditional Chinese selected", Toast.LENGTH_LONG).show();

            Heading.setText("查找我的產品");
            Introduction.setText("你好呀！歡迎使用 KnowMyItem 應用程序！在這裡，您只需點擊一下即可了解產品列表及其類別中的保修");

            Phone.setText("手機");
            Electric.setText("電器產品");
            Furniture.setText("家具");

            Mechanic.setText("機械產品");
            Hardware.setText("硬件");
            Desktop.setText("台式電腦");
            Television.setText("電視");
        }

        if(item.getItemId() == R.id.MalaySelection)
        {
            Toast.makeText(MainActivity.this, "Malay Language selected", Toast.LENGTH_LONG).show();

            Heading.setText("Cari produk saya");
            Introduction.setText("Helo! Selamat datang ke aplikasi KnowMyItem! Di sini, anda boleh mengetahui mengenai senarai produk dan jaminan dalam kategorinya hanya dengan satu klik");

            Phone.setText("Telefon bimbit");
            Electric.setText("Produk elektrik");
            Furniture.setText("Perabot");

            Mechanic.setText("Produk Jentera");
            Hardware.setText("perkakasan");
            Desktop.setText("PC desktop");
            Television.setText("TV");

        }

        if(item.getItemId() == R.id.SpanishSelection)
        {
            Toast.makeText(MainActivity.this, "Spanish selected", Toast.LENGTH_LONG).show();

            Heading.setText("Encuentra mis productos");
            Introduction.setText("¡Hola! ¡Bienvenido a la aplicación KnowMyItem! Aquí, puede conocer la lista de productos y garantías en la categoría con solo un clic");

            Phone.setText("Bimbit telefónico");
            Electric.setText("Productos eléctricos");
            Furniture.setText("Mueble");

            Mechanic.setText("Productos de maquinaria");
            Hardware.setText("Hardware");
            Desktop.setText(" Escritorio de la PC");
            Television.setText("televisor");

        }

        if(item.getItemId() == R.id.JapaneseSelection)
        {
            Toast.makeText(MainActivity.this, "Japanese selected", Toast.LENGTH_LONG).show();

            Heading.setText("製品を探す");
            Introduction.setText("こんにちは！ KnowMyItem アプリへようこそ!ここでは、カテゴリ内の製品と保証の一覧がワンクリックでわかります");

            Phone.setText("電話のビンビット");
            Electric.setText("電気製品");
            Furniture.setText("家具");

            Mechanic.setText("機械製品");
            Hardware.setText("ハードウェア");
            Desktop.setText(" パソコンデスク");
            Television.setText("テレビ");

        }

        if(item.getItemId() == R.id.KoreanSelection)
        {
            Toast.makeText(MainActivity.this, "Korean selected", Toast.LENGTH_LONG).show();

            Heading.setText("제품 찾기");
            Introduction.setText("안녕하세요! KnowMyItem 응용 프로그램에 오신 것을 환영합니다! 여기에서는 카테고리의 제품 보증의 목록이 한 번의 클릭으로 알 수 있습니다");

            Phone.setText("전화 빈빗토");
            Electric.setText("전기 제품");
            Furniture.setText("가구");

            Mechanic.setText("기계 제품");
            Hardware.setText("하드웨어");
            Desktop.setText("컴퓨터 책상");
            Television.setText("텔레비전");

        }

        if(item.getItemId() == R.id.ItalianSelection)
        {
            Toast.makeText(MainActivity.this, "Italian selected", Toast.LENGTH_LONG).show();

            Heading.setText("Trova un prodotto");
            Introduction.setText("Buongiorno! Benvenuto nell'applicazione KnowMyItem! Qui troverai un elenco di garanzie sui prodotti in categorie con un clic");

            Phone.setText("telefono binbit");
            Electric.setText("Prodotti elettrici");
            Furniture.setText("mobilia");

            Mechanic.setText("prodotti meccanici");
            Hardware.setText("hardware");
            Desktop.setText("scrivania del computer");
            Television.setText("televisione");
        }

        if(item.getItemId() == R.id.FrenchSelection)
        {
            Toast.makeText(MainActivity.this, "French selected", Toast.LENGTH_LONG).show();

            Heading.setText("Trouver un produit");
            Introduction.setText("Bonjour! Bienvenue dans l'application KnowMyItem ! Vous trouverez ici une liste des garanties produits par catégories en un clic");

            Phone.setText("téléphone binbit");
            Electric.setText("Produits électriques");
            Furniture.setText("Un meuble");

            Mechanic.setText("produits mécaniques");
            Hardware.setText("Matériel");
            Desktop.setText("Bureau d'ordinateur");
            Television.setText("télévision");
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        if(v== Phone)
        {
            Toast.makeText(MainActivity.this, "Mobile Phone selected", Toast.LENGTH_LONG).show();
            CategoryClicked = "Mobile Phones";
            menu.add(0, 0, 0, "Iphone 12 Pro");
            menu.add(0, 1, 1, "SamSung Galaxy S21");
            menu.add(0, 2, 2, "HuaWei Galaxy Z Fold2 5G");
            menu.add(0, 3, 3, "XiaoMi RedMi Note 10 Pro");
            menu.add(0, 4, 4, "Pixel 4a 5G");

        }

        if(v== Desktop)
        {
            Toast.makeText(MainActivity.this, "Computer selected", Toast.LENGTH_LONG).show();
            CategoryClicked = "Computer";
            menu.add(1, 5, 0, "ASUS ZenBook 14");
            menu.add(1, 6, 1, "MacBook Pro 13");
            menu.add(1, 7, 2, "Lenovo IdeaPad Duet 3i");
            menu.add(1, 8, 3, "Acer Swift 3");
            menu.add(1,9,4,"Alienware Laptops");

        }

        if(v == Television)
        {
            Toast.makeText(MainActivity.this, "Television selected", Toast.LENGTH_LONG).show();
            CategoryClicked = "Television";
            menu.add(2, 10, 0, "Samsung QN900A Neo QLED 8K TV");
            menu.add(2, 11, 1, "LG C1 OLED TV");
            menu.add(2, 12, 2, "Philips OLED 805 (55OLED805, 65OLED805) TV");
            menu.add(2, 13, 3, "Polaroid 49-inch 4K Dolby Vision TV");
            menu.add(2, 14, 4, "Panasonic HZ2000 4K OLED TV");
        }


        if(v== Electric)
        {
            Toast.makeText(MainActivity.this, "Electrical Products selected", Toast.LENGTH_LONG).show();
            CategoryClicked = "Electrical Products";
            menu.add(3, 15, 0, "LG Bottom Freezer 2 Doors Refrigerator with Smart Inverter Compressor");
            menu.add(3, 16, 1, "AEG 9000 Series L9FEC966R washing machine");
            menu.add(3, 17, 2, "Panasonic SR-DF101 Rice Cooker");
            menu.add(3, 18, 3, "Mitsubishi Starmex MXY-3G28VA2");
            menu.add(3, 19, 4, "OSIM uDream Massage Chair");
        }

        if(v== Furniture)
        {
            Toast.makeText(MainActivity.this, "Furniture selected", Toast.LENGTH_LONG).show();
            CategoryClicked = "Furniture";
            menu.add(4, 20, 0, "Haagen Single-Sized Bed (Fabric Grey)");
            menu.add(4, 21, 1, "Secretlab OMEGA 2020 SeriesChair");
            menu.add(4, 22, 2, "WALD Dining Table Set in Cocoa (1+4)");
            menu.add(4, 23, 3, "SONGMICS 59 Inch Portable Clothes Closet Wardrobe");
            menu.add(4, 24, 4, "ASHLEY BRISE SOFA CHAISE Couch");


        }

        if(v== Mechanic)
        {
            Toast.makeText(MainActivity.this, "Mechanical Products selected", Toast.LENGTH_LONG).show();
            CategoryClicked = "Mechanical Products";
            menu.add(5, 25, 0, "Traditional Bicycle in Beige (24inch)");
            menu.add(5, 26, 1, "Mini Copper Bicycle Bell");
            menu.add(5, 27, 2, "Classic White Wall Clock G17");
            menu.add(5, 28, 3, "Lightweight pocket compass (directional magnet)");
            menu.add(5, 29, 4, "CASIO GENERAL MQ-71-2BDF UNISEX'S WATCH");
        }

        if(v == Hardware)
        {
            Toast.makeText(MainActivity.this, "HardWare selected", Toast.LENGTH_LONG).show();
            CategoryClicked= "Computer Peripherals";
            menu.add(6, 30, 0, "Razer DeathAdder v2 Mini Gaming Mouse");
            menu.add(6, 31, 1, "HP DeskJet 2330 Printer");
            menu.add(6, 32, 2, "Portable SSD T5 USB 3.1 500GB (Blue)");
            menu.add(6, 33, 3, "Sony WH-1000XM4 HeadPhones");
            menu.add(6, 34, 4, "Apple AirPods with Charging Case");

        }

    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (CategoryClicked.equalsIgnoreCase("Mobile Phones"))
        {
            CategoryClicked = "Mobile Phones";
            if (CategoryClicked.equalsIgnoreCase("Mobile Phones"))
            {
                if(item.getGroupId()== 0)
                {
                    if (item.getItemId() == 0) {
                        Uri uri1a = Uri.parse("https://www.apple.com/sg");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri1a);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 1) {

                        Uri uri1b = Uri.parse("https://www.samsung.com/sg");
                        Intent intent1b = new Intent(Intent.ACTION_VIEW, uri1b);
                        startActivity(intent1b);
                    }

                    if (item.getItemId() == 2) {
                        Uri uri1c = Uri.parse("https://consumer.huawei.com/sg/phones/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri1c);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 3) {

                        Uri uri1d = Uri.parse("https://www.mi.com/sg/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri1d);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 4) {

                        Uri uri1e = Uri.parse("https://store.google.com/sg/product/pixel_4a");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri1e);
                        startActivity(intent);
                    }
                }

            }

            CategoryClicked = "Computer";
            if (CategoryClicked.equalsIgnoreCase("Computer"))
            {
                if(item.getGroupId()==1)
                {
                    if (item.getItemId() == 5) {
                        Uri uri2a = Uri.parse("https://store.asus.com/us/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri2a);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 6) {

                        Uri uri2b = Uri.parse("https://www.apple.com/sg/macbook-pro/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri2b);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 7) {
                        Uri uri2c = Uri.parse("https://www.lenovo.com/sg/en/laptops/ideapad/ideapad-d-series");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri2c);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 8) {

                        Uri uri2d = Uri.parse("https://www.acer.com/ac/en/SG/content/series/swift3");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri2d);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 9) {

                        Uri uri2e = Uri.parse("https://www.dell.com/en-sg/gaming/alienware");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri2e);
                        startActivity(intent);
                    }
                }


            }

            CategoryClicked = "Television";
            if (CategoryClicked.equalsIgnoreCase("Television")) {

                if(item.getGroupId()==2) {

                    if (item.getItemId() == 10) {
                        Uri uri3a = Uri.parse("https://www.techradar.com/reviews/samsung-q80t-qled-tv");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri3a);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 11) {

                        Uri uri3b = Uri.parse("https://www.techradar.com/reviews/lg-c1-oled-tv-oled65c1");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri3b);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 12) {
                        Uri uri3c = Uri.parse("https://www.techradar.com/reviews/philips-oled-805-tv");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri3c);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 13) {

                        Uri uri3d = Uri.parse("https://www.techradar.com/reviews/polaroid-p49upa2029a-49-inch-4k-dolby-vision-tv");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri3d);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 14) {

                        Uri uri3e = Uri.parse("hhttps://www.techradar.com/reviews/panasonic-hz2000-4k-oled-tv");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri3e);
                        startActivity(intent);
                    }
                }


            }

            CategoryClicked = "Electrical Products";
            if (CategoryClicked.equalsIgnoreCase("Electrical Products"))
            {

                if(item.getGroupId()==3) {

                    if (item.getItemId() == 15) {
                        Uri uri4a = Uri.parse("https://www.lg.com/sg/refrigerators");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri4a);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 16) {

                        Uri uri4b = Uri.parse("https://www.t3.com/reviews/aeg-9000-series-l9fec966r");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri4b);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 17) {
                        Uri uri4c = Uri.parse("https://www.panasonic.com/ca/consumer/home-appliances/rice-cookers/microcomputer-controlled");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri4c);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 18) {

                        Uri uri4d = Uri.parse("https://iprice.sg/mitsubishi/appliances/air-conditioners/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri4d);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 19) {

                        Uri uri4e = Uri.parse("https://sg.osim.com/products/massage-chairs-sofas.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri4e);
                        startActivity(intent);
                    }
                }
            }


            CategoryClicked = "Furniture";
            if (CategoryClicked.equalsIgnoreCase("Furniture"))
            {
                if(item.getGroupId()==4) {

                    if (item.getItemId() == 20) {
                        Uri uri5a = Uri.parse("hhttps://www.fortytwo.sg/haagen-single-sized-bed-fabric-grey.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri5a);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 21) {

                        Uri uri5b = Uri.parse("https://secretlab.sg/collections/omega-series");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri5b);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 22) {
                        Uri uri5c = Uri.parse("https://jiji.sg/dining-sets/wald-dining-table-set-in-cocoa-1-4.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri5c);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 23) {

                        Uri uri5d = Uri.parse("https://www.amazon.com/dp");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri5d);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 24) {

                        Uri uri5e = Uri.parse("https://www.homemakers.com/webapp");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri5e);
                        startActivity(intent);
                    }
                }
            }


            CategoryClicked = "Computer Peripherals";
            if (CategoryClicked.equalsIgnoreCase("Computer Peripherals"))
            {

                if(item.getGroupId()==5) {
                    if (item.getItemId() == 25) {
                        Uri uri6a = Uri.parse("https://www.amazon.sg/Razer-DeathAdder-Mini-Gaming-Mouse/dp");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri6a);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 26) {

                        Uri uri6b = Uri.parse("https://www.amazon.sg/HP-DeskJet-2330-wireless-Orderable/dp");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri6b);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 27) {
                        Uri uri6c = Uri.parse("https://www.samsung.com/sg/memory-storage/portable-ssd");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri6c);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 28) {

                        Uri uri6d = Uri.parse("https://www.tomsguide.com/uk/us/best-headphones,review-1988.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri6d);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 29) {

                        Uri uri6e = Uri.parse("https://www.singtel.com/personal/products-services/mobile/accessories/apple-airpods-with-charging-case");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri6e);
                        startActivity(intent);
                    }
                }


            }


            CategoryClicked = "Mechanical Products";
            if (CategoryClicked.equalsIgnoreCase("Mechanical Products"))
            {
                if(item.getGroupId()==6) {

                    if (item.getItemId() == 30) {
                        Uri uri7a = Uri.parse("https://jiji.sg/bicycles/traditional-bicycle-in-beige-24inch.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri7a);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 31) {

                        Uri uri7b = Uri.parse("https://www.evosportz.com/mini-copper-bell");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri7b);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 32) {
                        Uri uri7c = Uri.parse("https://www.amazon.sg/Classic-White-Wall-Clock-G17/dp");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri7c);
                        startActivity(intent);

                    }

                    if (item.getItemId() == 33) {

                        Uri uri7d = Uri.parse("https://www.monotaro.sg/p/62096904.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri7d);
                        startActivity(intent);
                    }

                    if (item.getItemId() == 34) {

                        Uri uri7e = Uri.parse("https://www.h2hubwatches.com/products/casio");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri7e);
                        startActivity(intent);
                    }
                }



            }


        }

        return super.onContextItemSelected(item);
    }


}
