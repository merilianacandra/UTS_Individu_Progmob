package com.example.user.myapplication;

import java.util.ArrayList;

public class KerajaanData {
    public static String[][] data = new String[][]{
            {"Kerajaan Kutai", "Sungai Mahakan, Kalimantan Timur", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Sejarah-Berdirinya-Kerjaan-Kutai.jpg", "Kutai Martadipura adalah kerajaan bercorak Hindu di Nusantara yang memiliki bukti sejarah tertua. Berdiri sekitar abad ke-4. Kerajaan ini terletak di Muara Kaman, Kalimantan Timur, tepatnya di hulu sungai Mahakam.Nama Kutai diberikan oleh para ahli mengambil dari nama tempat ditemukannya prasasti yang menunjukkan eksistensi kerajaan tersebut. Tidak ada prasasti yang secara jelas menyebutkan nama kerajaan ini dan memang sangat sedikit informasi yang dapat diperoleh. "},
            {"Kerajaan Tarumanegara", "Jawa Barat", "https://situsbudaya.id/wp-content/uploads/2017/09/Kerajaan-Tarumanegara-Citarum.jpg", "Tarumanagara atau Kerajaan Taruma adalah sebuah kerajaan yang pernah berkuasa di wilayah barat pulau Jawa pada abad ke-4 hingga abad ke-7 M. Taruma merupakan salah satu kerajaan tertua di Nusantara yang meninggalkan catatan sejarah. Dalam catatan sejarah dan peninggalan artefak di sekitar lokasi kerajaan, terlihat bahwa pada saat itu Kerajaan Taruma adalah kerajaan Hindu beraliran Wisnu. "},
            {"Kerajaan Mataram Kuno", "Jawa Tengah", "https://i0.wp.com/www.romadecade.org/wp-content/uploads/2018/12/Kerajaan-Mataram-Kuno.jpg?fit=750%2C505&ssl=1", "Kerajaan Medang (atau sering juga disebut Kerajaan Mataram Kuno atau Kerajaan Mataram Hindu) adalah nama sebuah kerajaan yang berdiri di Jawa Tengah pada abad ke-8, kemudian berpindah ke Jawa Timur pada abad ke-10. Para raja kerajaan ini banyak meninggalkan bukti sejarah berupa prasasti-prasasti yang tersebar di Jawa Tengah dan Jawa Timur, serta membangun banyak candi baik yang bercorak Hindu maupun Buddha. Kerajaan Medang akhirnya runtuh pada awal abad ke-11. "},
            {"Kerajaan Sriwijaya", "Sumatra", "https://perpustakaan.id/wp-content/uploads/2017/03/Kerajaan-Sriwijaya.jpg", "Sriwijaya bahari tu yaitu sebuah kerajaan Melayu kuno di pulau Sumatra nang banyak pengaruhnya di kepulauan Nusantara.[1] Bukti awal soal adanya kerajaan ini asalnya dari abad ke-7; seurang pendeta Cina, I-Tsing, menulis inya pernah mendatangi Sriwijaya tahun 671 selawas 6 bulan.[2][3] Prasasti pertama soal Sriwijaya gén asalnya dari abad ke-7, yaitu Prasasti Kedukan Bukit di Palémbang, Sumatra Selatan, tahun 683. Kerajaan ini mulai gugur tahun 1200 dan 1300 marga banyak alasan, termasuk jua ekspansi kerajaan Majapahit. Dalam bahasa Sansekerta, sri artinya bacahaya dan wijaya artinya kemenangan."},
            {"Kerajaan Singasari", "Malang", "https://histori.id/wp-content/uploads/2018/12/singasari-compressor.jpg", "Kerajaan Singasariatau sering pula ditulis Singhasari atau Singosari, adalah sebuah kerajaan di Jawa Timur yang didirikan oleh Ken Arok pada tahun 1222. Lokasi kerajaan ini sekarang diperkirakan berada di daerah Singasari, Malang. "},
            {"Kerajaan Kediri", "Kota Daha", "https://i1.wp.com/www.romadecade.org/wp-content/uploads/2018/12/Kerajaan-Kediri.jpg?w=660&ssl=1", "Kerajaan Kadiri atau Kediri atau Panjalu, adalah sebuah kerajaan yang terdapat di Jawa Timur antara tahun 1042-1222. Kerajaan ini berpusat di kota Daha, yang terletak di sekitar Kota Kediri sekarang. Sesungguhnya kota Daha sudah ada sebelum Kerajaan Kadiri berdiri. Daha merupakan singkatan dari Dahanapura, yang berarti kota api. Nama ini terdapat dalam prasasti Pamwatan yang dikeluarkan Airlangga tahun 1042. Hal ini sesuai dengan berita dalam Serat Calon Arang bahwa, saat akhir pemerintahan Airlangga, pusat kerajaan sudah tidak lagi berada di Kahuripan, melainkan pindah ke Daha. "},
            {"Kerajaan Majapahit", "Jawa Timur", "https://moondoggiesmusic.com/wp-content/uploads/2018/10/Masa-Kejayaan-Kerajaan-Majapahit.jpg", "Kemaharajaan Majapahit adalah sebuah kerajaan yang berpusat di Jawa Timur, Indonesia, yang pernah berdiri sekitar tahun 1293 hingga 1500 M. Kerajaan ini mencapai puncak kejayaannya menjadi kemaharajaan raya yang menguasai wilayah yang luas di Nusantara pada masa kekuasaan Hayam Wuruk, yang berkuasa dari tahun 1350 hingga 1389.Kerajaan Majapahit adalah kerajaan Hindu-Buddha terakhir yang menguasai Nusantara dan dianggap sebagai kerajaan terbesar dalam sejarah Indonesia. Menurut Negarakertagama, kekuasaannya terbentang dari Jawa, Sumatra, Semenanjung Malaya, Kalimantan, hingga Indonesia timur, meskipun wilayah kekuasaannya masih diperdebatkan."}
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
