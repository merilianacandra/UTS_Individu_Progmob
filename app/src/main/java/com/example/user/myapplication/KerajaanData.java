package com.example.user.myapplication;

import java.util.ArrayList;

public class KerajaanData {
    public static String[][] data = new String[][]{
            {"Kerajaan Kutai", "Sungai Mahakan, Kalimantan Timur", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Sejarah-Berdirinya-Kerjaan-Kutai.jpg", "Kutai Martadipura adalah kerajaan bercorak Hindu di Nusantara yang memiliki bukti sejarah tertua. Berdiri sekitar abad ke-4. Kerajaan ini terletak di Muara Kaman, Kalimantan Timur, tepatnya di hulu sungai Mahakam.Nama Kutai diberikan oleh para ahli mengambil dari nama tempat ditemukannya prasasti yang menunjukkan eksistensi kerajaan tersebut. Tidak ada prasasti yang secara jelas menyebutkan nama kerajaan ini dan memang sangat sedikit informasi yang dapat diperoleh. "},
            {"Kerajaan Tarumanegara", "Jawa Barat", "https://situsbudaya.id/wp-content/uploads/2017/09/Kerajaan-Tarumanegara-Citarum.jpg", "nana"},
            {"Kerajaan Mataram Kuno", "Jawa Tengah", "https://i0.wp.com/www.romadecade.org/wp-content/uploads/2018/12/Kerajaan-Mataram-Kuno.jpg?fit=750%2C505&ssl=1", "sintya"},
            {"Kerajaan Sriwijaya", "Sumatra", "https://perpustakaan.id/wp-content/uploads/2017/03/Kerajaan-Sriwijaya.jpg", "putri"},
            {"Kerajaan Singasari", "Malang", "https://histori.id/wp-content/uploads/2018/12/singasari-compressor.jpg", "fitri"},
            {"Kerajaan Kediri", "Kota Daha", "https://i1.wp.com/www.romadecade.org/wp-content/uploads/2018/12/Kerajaan-Kediri.jpg?w=660&ssl=1", "ebiks"},
            {"Kerajaan Majapahit", "Jawa Timur", "https://moondoggiesmusic.com/wp-content/uploads/2018/10/Masa-Kejayaan-Kerajaan-Majapahit.jpg", "meril"}
    };

    public static ArrayList<Kerajaan> getListData(){
        Kerajaan kerajaan = null;
        ArrayList<Kerajaan> list = new ArrayList<>();
        for (String[] aData : data) {
            kerajaan = new Kerajaan();
            kerajaan.setName(aData[0]);
            kerajaan.setRemarks(aData[1]);
            kerajaan.setPhoto(aData[2]);
            kerajaan.setDeskrip(aData[3]);

            list.add(kerajaan);
        }

        return list;
    }
}
