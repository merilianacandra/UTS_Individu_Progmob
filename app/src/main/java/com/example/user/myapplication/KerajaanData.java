package com.example.user.myapplication;

import java.util.ArrayList;

public class KerajaanData {
    public static String[][] data = new String[][]{
            {"Kerajaan Kutai", "Sungai Mahakan, Kalimantan Timur", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Sejarah-Berdirinya-Kerjaan-Kutai.jpg"},
            {"Kerajaan Tarumanegara", "Jawa Barat", "https://situsbudaya.id/wp-content/uploads/2017/09/Kerajaan-Tarumanegara-Citarum.jpg"},
            {"Kerajaan Mataram Kuno", "Jawa Tengah", "https://i0.wp.com/www.romadecade.org/wp-content/uploads/2018/12/Kerajaan-Mataram-Kuno.jpg?fit=750%2C505&ssl=1"},
            {"Kerajaan Sriwijaya", "Sumatra", "https://perpustakaan.id/wp-content/uploads/2017/03/Kerajaan-Sriwijaya.jpg"},
            {"Kerajaan Singasari", "Malang", "https://histori.id/wp-content/uploads/2018/12/singasari-compressor.jpg"},
            {"Kerajaan Kediri", "Kota Daha", "https://i1.wp.com/www.romadecade.org/wp-content/uploads/2018/12/Kerajaan-Kediri.jpg?w=660&ssl=1"},
            {"Kerajaan Majapahit", "Jawa Timur", "https://moondoggiesmusic.com/wp-content/uploads/2018/10/Masa-Kejayaan-Kerajaan-Majapahit.jpg"}
    };

    public static ArrayList<Kerajaan> getListData(){
        Kerajaan kerajaan = null;
        ArrayList<Kerajaan> list = new ArrayList<>();
        for (String[] aData : data) {
            kerajaan = new Kerajaan();
            kerajaan.setName(aData[0]);
            kerajaan.setRemarks(aData[1]);
            kerajaan.setPhoto(aData[2]);

            list.add(kerajaan);
        }

        return list;
    }
}
