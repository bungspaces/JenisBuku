package com.example.jenisbuku.model;

import java.util.ArrayList;

//private String nama,asal,karakter,jenis,keterangan,photo;
public class dtBuku {
    public static String[][] dataBuku = new String[][]{
            {"Persia",
                    "Iran",
                    "Pendiam, penyayang, tidak terlalu aktif, dan setia",
                    "Kucing persia adalah ras kucing yang paling populer di dunia, asal mula kucing ini berasal dari persia yang pada detik ini di sebut dengan negara iran.\n" +
                            "Namun saat ini kucing persia lebih banyak dikembangkan di negara inggris dan amerika yang menjadi penghasil kucing persia terbesar.\n",
                    "https://okdogi.com/wp-content/uploads/2015/12/jenis-kucing-persia-1.jpg"},
            {"Russian Blue",
                    "Russia",
                    "cerdas, penasaran, ramah, pemalu dan sensitif",
                    "Asal mula kucing ini berasal dari sebuah pelabuhan arkhangelsk di russia. Russian blue adalah jenis kucing berambut pendek dengan warna bulu abu kebiruan dan mempunyai mata cantik yang cukup menarik jika melihatnya secara langsung.\n",
                    "https://okdogi.com/wp-content/uploads/2015/12/russian-blue-2.jpg"},
            {"Domestik",
                    "Indonesia",
                    "Liar, kuat, energik, pemburu, dan aktif",
                    "Kucing domestik umumnya memiliki karakter dan sifat bawaan yang cukup baik, seperti mandiri, ingatan yang tajam, serta fisik yang kuat.\n" +
                            "\n" +
                            "Kucing yang dapat kalian temukan di area rumah dan di jalan-jalan, banyak orang indonesia memelihara mereka karena alasan kucing domestik lebih mudah dan lebih simple untuk dirawat.\n",
                    "https://okdogi.com/wp-content/uploads/2015/12/KUCING-KAMPUNG.jpg"},
            {"Turkish Anggora",
                    "Turki",
                    "anggun, lincah, energik, dan  aktif",
                    "Anggora adalah kelompok kucing alami yang tertua di dunia. Desas-desusnya kucing ini sangat sering dikaitkan dengan mitos dari legenda di wilayah Turki.\n" +
                            "\n" +
                            "Salah satu trah kucing ras yang populer di indonesia selain kucing persia, mereka merupakan jenis kucing berukuran sedang dengan bulu yang cukup panjang dan cantik.\n" +
                            "\n" +
                            "Banyak orang bingung perbedaan antara kucing persia dan anggora, sebenarnya mereka memang sangat berbeda.\n",
                    "https://okdogi.com/wp-content/uploads/2015/12/kucing-anggora.jpg"},
            {"American Shorthair",
                    "Amerika utara",
                    "Kuat, cerdas, pintar berburu, baik, ramah,tenang, senang bermain dan mudah beradaptasi",
                    "Kucing ras american shorthair adalah keturunan dari ras european shorthair dan british shorthair.\n" +
                            "\n" +
                            "Awalnya kucing ini di kenal dengan sebutan shorthair, lalu memiliki nama populer dengan nama domestic shorthair di tahun 1960.\n" +
                            "\n" +
                            "Seiring  berjalannya waktu pada tahun 1966 kucing tersebut berubah nama menjadi american shorthair.\n",
                    "https://okdogi.com/wp-content/uploads/2015/12/american-short-hair.jpg"},
            {"Siamese",
                    "Thailand",
                    "Ramah, suara lembut, cerdas, rasa ingin tahu, dan lincah",
                    "Kucing yang berasal dari thailand yang terkenal dengan warna colour pointnya, Siamese juga sering menjadi indukan untuk membuat keturunan baru.\n" +
                            "\n" +
                            "Kucing himalaya dan ragdoll merupakan trah kucing hasil persilangan dari kucing siamese.\n" +
                            "\n" +
                            "Kucing siamese juga terbagi menjadi 4 jenis yang dibedakan dari fisik dan warna bulu mereka.\n",
                    "https://okdogi.com/wp-content/uploads/2016/03/Siamese-cat-traditional.jpg"},
            {"Norwegian Forest",
                    "Norwegia",
                    "Ramah, pendiam, dan jarang mengluarkan suara keras (berisik)",
                    "Ras kucing norwegian forest menurut sejarah berasal dari sebuah daerah yang bernama norway, nenek moyang kucing ini dipercaya berasal dari hutan-hutan di norwegia dan skandinavia.\n" +
                            "\n" +
                            "Bulu mereka akan panjang dan tebal saat musim dingin datang dan akan menipis (rontok) di musim semi tiba. \n" +
                            "\n" +
                            "Keunikan lainnya pada kucing ini juga memiliki bulu yang pendek berwarna gelap, dan bulu yang panjang berwarna terang.\n",
                    "https://okdogi.com/wp-content/uploads/2015/12/kucing-norwegian-forest.jpg"},
            {"Sphynx",
                    "Kanada",
                    "Aktif, setia, cerdas, dan penyayang",
                    "Kucing sphynx merupakan jenis kucing yang memiliki bulu sangat pendek, kalo di lihat sepintas kucing tersebut tampak tidak memiliki bulu sama sekali.\n" +
                            "\n" +
                            "Namun jika diamati lebih lanjut kucing ini ditumbuhi rambut halus diberapa bagian tubuhnya, seperti di telinga, kaki, ekor, dan organ vitalnya.\n",
                    "https://okdogi.com/wp-content/uploads/2015/12/kucing-sphynx-.jpg"},
            {"Manx",
                    "Inggris",
                    "Setia, aktif, dan senang bermain di lingkungannya",
                    "Kucing manx atau sebutan lainnya yang biasa di panggil rumpy merupakan jenis kucing dunia yang tidak memiliki ekor.\n" +
                            "\n" +
                            "Kucing ini adalah salah satu ras kucing tertua yang pernah terdaftar di CFA (Cat Fanciers Association) di tahun 1908.\n",
                    "https://t1.ea.ltmcdn.com/en/images/6/1/5/img_caring_for_a_manx_cat_1516_600.jpg"},
            {"Savannah",
                    "Amerika Serikat",
                    "Kuat, energik, lentur, bersahabat, dan ramah",
                    "Kucing savannah adalah salah satu kucing termahal di dunia, kelompok kucing ini merupakan ras kucing hibrida yang dihasilkan dari sebuah persilangan kucing liar serval (dari daratan afrika) dengan seekor kucing siamese, bengal, dan egyptian mau.\n" +
                            "Savannah adalah kucing yang berpenampilan liar dan buas walaupun seperti itu kucing savannah adalah tipe kucing yang baik, bersahabat dan ramah.\n",
                    "https://images.squarespace-cdn.com/content/v1/53adb125e4b094aac18a8ee7/1535401445223-LGHEW4LVKO46Q4F9M1LR/ke17ZwdGBToddI8pDm48kIex8OphTLRJ8zEeC4tz03gUqsxRUqqbr1mOJYKfIPR7LoDQ9mXPOjoJoqy81S2I8GRo6ASst2s6pLvNAu_PZdJsA9YPA2G5IQrIK4Z4_Al2V3oth9piDmVZS3gaDVLS10sbaqpZk3FMti7p-rXz2Pg/Juliet-10.jpg"},
            {"Bengal",
                    "Amerika Serikat",
                    "Aktif dan sangat menyukai air",
                    "Kucing bengal, kucing ini adalah keturunan ketiga dari hasil sebuah persilangan antara kucing ras american shorthair dengan kucing kucing ras asian leopard.\n" +
                            "\n" +
                            "Walaupun kucing bengal identik dengan kucing hutan, namun kelompok kucing tergolong hewan yang ramah tamah dan jinak.\n",
                    "https://okdogi.com/wp-content/uploads/2015/12/bengal..jpg"},
    };

    public static ArrayList<Buku> getListData(){
        ArrayList<Buku> list = new ArrayList<>();
        for (String[] subData : dataBuku){
            Buku buku = new Buku();
            buku.setNama(subData[0]);
            buku.setAsal(subData[1]);
            buku.setKarakter(subData[2]);
            buku.setKeterangan(subData[3]);
            buku.setPhoto(subData[4]);

            list.add(buku);
        }
        return list;
    }
}
