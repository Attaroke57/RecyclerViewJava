package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Adapter.ItemClickListener {
    private Adapter adapter;
    private RecyclerView rvMakanan;
    private ArrayList<Data> DataMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataMakanan = new ArrayList<>();
        adapter = new Adapter(getApplicationContext(), DataMakanan, MainActivity.this);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvMakanan = findViewById(R.id.rvFilm);
        rvMakanan.setHasFixedSize(true);
        rvMakanan.setLayoutManager(mLayoutManager);
        rvMakanan.setAdapter(adapter);
        adapter.setClickListener(this);

        AddData();
    }
    public void AddData() {

        Data makanan1 = new Data();
        makanan1.setImageUrl("https://cdn1-production-images-kly.akamaized.net/EjwV7j3Y4JrlqUFuavke4NtRWtM=/1200x675/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3108566/original/079979700_1587487794-Sajiku_1.jpg");
        makanan1.setJudul("Nasi Goreng");
        makanan1.setDeskripsi("Nasi goreng adalah makanan berupa nasi yang digoreng dan dicampur dalam minyak goreng, margarin, atau mentega");
        DataMakanan.add(makanan1);


        Data makanan2 = new Data();
        makanan2.setJudul("Ayam Geprek");
        makanan2.setImageUrl("https://png.pngtree.com/png-clipart/20230319/original/pngtree-complete-geprek-chicken-with-fresh-vegetables-png-image_8996077.png");
        makanan2.setDeskripsi("Ayam geprek adalah makanan ayam goreng tepung khas Indonesia yang diulek atau dilumatkan bersama sambal bajak.");
        DataMakanan.add(makanan2);

        Data makanan3 = new Data();
        makanan3.setJudul("Ayam Bakar");
        makanan3.setImageUrl("https://asset.kompas.com/crops/yoovaRyPxaPFOY4gfCciore2eUY=/3x0:700x465/750x500/data/photo/2020/12/30/5fec5602f116e.jpg");
        makanan3.setDeskripsi("Ayam bakar adalah sebuah hidangan Asia Tenggara Maritim, terutama hidangan Indonesia atau Malaysia, dari ayam yang dipanggang di atas arang.");
        DataMakanan.add(makanan3);

        Data makanan4 = new Data();
        makanan4.setJudul("Sate Ayam");
        makanan4.setImageUrl("https://www.blibli.com/friends-backend/wp-content/uploads/2023/04/B300045-Cover-resep-sate-ayam.jpg");
        makanan4.setDeskripsi("Sate ayam adalah makanan khas Indonesia. Sate Ayam dibuat dari daging ayam.");
        DataMakanan.add(makanan4);

        Data makanan5 = new Data();
        makanan5.setJudul("Pecel lele");
        makanan5.setImageUrl("https://asset.kompas.com/crops/QT6V0LoKz42gr5uezLBcGZyBBLw=/0x0:1000x667/750x500/data/photo/2021/03/21/60569b33a2b3d.jpeg");
        makanan5.setDeskripsi("Pecel lele atau pecek lele atau penyetan adalah makanan khas Jawa Timur, yang terdiri dari ikan lele dan sambal tomat.");
        DataMakanan.add(makanan5);

        Data makanan6 = new Data();
        makanan6.setJudul("Nasi Kuning");
        makanan6.setImageUrl("https://www.sasa.co.id/medias/page_medias/nasi_kuning_rice_cooker.jpg");
        makanan6.setDeskripsi("Nasi kuning adalah makanan khas Indonesia. Makanan ini terbuat dari beras yang dimasak bersama dengan kunyit serta santan dan rempah-rempah.");
        DataMakanan.add(makanan6);

        Data makanan7 = new Data();
        makanan7.setJudul("Nasi Lemak");
        makanan7.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/5/55/Nasi_Lemak_dengan_Chili_Nasi_Lemak_dan_Sotong_Pedas%2C_di_Penang_Summer_Restaurant.jpg");
        makanan7.setDeskripsi("Nasi lemak adalah jenis makanan khas suku Melayu yang lazim ditemukan di Malaysia");
        DataMakanan.add(makanan7);

        Data makanan8 = new Data();
        makanan8.setJudul("Sup Iga");
        makanan8.setImageUrl("https://awsimages.detik.net.id/community/media/visual/2022/07/07/resep-sop-iga-sapi-jawa-1.jpeg?w=1200");
        makanan8.setDeskripsi("Sup buntut dibuat dengan ekor sapi. Sedikitnya ada lima versi sup buntut yang populer di seluruh dunia: makanan tradisional Korea, makanan Tiongkok yang lebih mirip semur, ekor sapi goreng/panggang");
        DataMakanan.add(makanan8);

        Data makanan9 = new Data();
        makanan9.setJudul("Rawon");
        makanan9.setImageUrl("https://www.masakapahariini.com/wp-content/uploads/2021/10/resep-rawon-daging-780x440-1.jpg");
        makanan9.setDeskripsi("Rawon adalah masakan khas Indonesia yang berasal dari Ponorogo yang berupa sup daging berkuah hitam");
        DataMakanan.add(makanan9);



    }


    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getJudul() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}