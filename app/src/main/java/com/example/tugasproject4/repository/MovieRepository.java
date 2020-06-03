package com.example.tugasproject4.repository;

import com.example.tugasproject4.model.CastAndCrew;
import com.example.tugasproject4.model.Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static MovieRepository instance;
    private List<Movies> list = new ArrayList<>();

    public static MovieRepository getInstance(){
        if (instance == null){
            instance = new MovieRepository();
        }

        return instance;
    }

    public List<CastAndCrew> AdAstra(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kU3B75TyRiCgE270EyZnHjfivoq.jpg", "Brand Pitt"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rdKKuq8zWCDYlKSxIfwGo2RUjpN.jpg", "Tommy Lee Jones"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aL4nmTVtQU2uQDNdBCarTy413CZ.jpg", "Ruth Negga"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/o2SOFI53N6Gv5S3fDEBNbeimbzY.jpg", "John Ortiz"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jrOj6t9pH8TqO65pnsRuvRNhwqx.jpg", "Liv Tyler"));
        return al;
    }

    public List<CastAndCrew> Scoob(){
        List<CastAndCrew> a1= new ArrayList<>();
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kphnirb7YggSVEhGI47kACxaIJQ.jpg", "Will Forte"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/b3gImArbw13mMKJIe9leFc9YYb7.jpg", "Frank Welker" ));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kkWFJ2Ygu6ZcQgrldOnjhHg7WOk.jpg","Amanda Seyfried"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bTEFpaWd7A6AZVWOqKKBWzKEUe8.jpg","Mark Wahlberg"));
        return a1;
    }

    public List<CastAndCrew> SurviveTheNight(){
        List<CastAndCrew> a1= new ArrayList<>();
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/A1XBu3CffBpSK8HEIJM8q7Mn4lz.jpg","Bruce Willis"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jIkzUQUVLkgn3HFMFRJBDAD0OLj.jpg","Chad Michael Murray"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/w71z6hZrwLi0hBkPFxiUe60bgOI.jpg","Lydia Hull"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iNVDnqbElYQ5ISM0va2fTJUJaOx.jpg","Tyler Jon olson"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zPceeH9jsxUgvQhgyppLdcbtEbf.jpg","Shea Buckner"));
        return a1;
    }

    public  List<CastAndCrew> TheCallofTheWild(){
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5M7oN3sznp99hWYQ9sX0xheswWX.jpg","Harrison Ford"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/6ioq5zfiwSZbPRWY8fVUO8bWRBC.jpg","Dan Stevens"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/sMd7ba1hWVm5E1Lf5VYcj82ouod.jpg","Colin Woodell"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/52kqB0Bei1TaTBx2rABrijVhhTG.jpg","Karen Gillan"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/o34IwFPlOvE00yJA2E4nvp5RQB7.jpg","Omar Sy"));
        return a1;
    }
public  List<CastAndCrew> BloodShot(){
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7rwSXluNWZAluYMOEWBxkPmckES.jpg","Vin Diesel"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/2EpyDXqw1oyJnKayu2XshczjiBN.jpg","Elza Gonzales"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rU3Whc039MeS4DEuxvf0AavFGH.jpg","HeughanSam "));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mlYytYJvoEHmhDH2enLtES1098Q.jpg","Toby Kebbell"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/6EtG9vwttacIeSJYss5aUabVikQ.jpg","Talulah Riley"));
        return  a1;
    }
    public List<CastAndCrew> TheHunt(){
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hBOviIHCVqbWyyPUoIxZohDl5SL.jpg","Betty Glipin"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5isa5g6ayWgE1ttempSXJdo6Xb4.jpg","Hilary Swank"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xhWmMUp7ZyXITAN2snKmLmfSOQG.jpg","Ethan Suplee"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nwYRbspICPpgNaRrBOrjQ7cEE2S.jpg","Teri Wyble"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mB6pvurTeQIf55UiOQrkaB1Pynu.jpg","Ike Barinholz"));
        return a1;
    }

    public List<CastAndCrew> BadBoysForLife(){
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/eze9FO9VuryXLP0aF2cRqPCcibN.jpg","Will Smith"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tnLGwtSFvAWHAXPyw98Cz6gsYYf.jpg","Martin Lawrence"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5k8tBBvoV43iK6u0k2YUSVXPmuK.jpg","paola Nunez"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ssFXWN5li5OWJLgUoFlUDY0ZyPc.jpg","Vanessa Hudgens"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/unP5YUgEdECL2gMLs0zCNya6is6.jpg","Alexandra Ludwig"));
    return a1;
    }

    public List<CastAndCrew>Sonic(){
        List<CastAndCrew>a1= new ArrayList<>();
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5vV52TSEIhe4ZZLWwv3i7nfv8we.jpg","Ben Schwartz"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tJK1PbhcJj5cBNqnuFKHtAFPQKz.jpg","James Marsden"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ienbErTKd9RHCV1j7FJLNEWUAzn.jpg","Jim Carrey"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/6Hb9e7jna7nml58cztAvbKgFAPx.jpg","Tika Sumpter"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/x5KdL3QoS4YuozVpfuPsu3MLwwf.jpg","natasha Rothwell"));
    return  a1;
    }

    public List<CastAndCrew>Dolittle(){
        List<CastAndCrew>a1=new ArrayList<>();
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1YjdSym1jTG7xjHSI0yGGWEsw5i.jpg","Robert Downey Jr"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/50GhCzQuaI5Ul01NEyJZloeVP7g.jpg","Antonio Banderas"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/n9ZlY63j6sfx8KlKnYpJpQIbjhM.jpg","Michael Sheen"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8ovAhq8t8d4Z0ldERz3x0pylvDJ.jpg","Jim Broadbent"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/suPlvXS2HBGlWhb3RbtLeUh62T.jpg","jessie Buckley"));
        a1.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8T0wcDmBZMoqWLyjsWAWfI2uoVo.jpg","Harry Collettt"));
    return a1;
    }

    public List<CastAndCrew>Joker() {
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zixTWuMZ1D8EopgOhLVZ6Js2ux3.jpg","joaquin Phoenix"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/3qxvTNSKRaPWpW21714Msv4xAFF.jpg","Robert De Niro"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/sgxzT54GnvgeMnOZgpQQx9csAdd.jpg","Zazie Beetz"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aJRQAkO24L6bH8qkkE5Iv1nA3gf.jpg","Frances Conroy"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/sEcPXqdcoZ9h4s7PSjVYocEPypP.jpg","Brett Cullen "));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/oWc8N97ADcbGvmYEWCHiTTqwTro.jpg","Shea Whigham"));
    return a1;
    }

    public List<CastAndCrew>GoneGirl() {
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8WE5VNhTkiyus0xqUWdL9wNyl0P.jpg","Ben Affleck"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8ObNklHDi2hjdz0ayzJFB9jtqzm.jpg","Rosamund Pike"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ryLJMLR4VvLDGv6AxxaBUEmoguu.jpg","Kim Dickens"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/A7za8TwUw1bazdvgJkdfUYcGCVP.jpg","Tyler Perry"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/lFfihTEvJM3q6MksebaU5aor3bS.jpg","Neil Patrick Harris"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/19BIUqUTq4dXCCes7L1UP4ypqfQ.jpg","Carrie Coon"));
    return a1;
    }
    public List<CastAndCrew>LaCorazonada() {
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/j8bTfMobbYKZ3zHQz8mGfBfoooq.jpg","Luisana Lopilato"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ioVO80TD1XSqLt2vAAzs2R82LNa.jpg","Joaquin Furriel"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/2xX2kDwX59aQaTsoP5dEdKMG7OV.jpg","Rafael Ferro"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/b48XGrTnLCVU914nxWHrAwpRNr.jpg","Juan Manuel Guilera"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/yK0n6dBsY0qWyn5Rq3J0FU5Wch.jpg","Sebastian Mogordoy"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qeenO8rBtNaNiCyI9M10SJw0NjK.jpg","Delfina Chaves"));
    return a1;
    }

    public List<CastAndCrew>Cars() {
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ntN3DL1Us5G2PCvlfq112vLXRKa.jpg","Owen Wilson"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xb9ycwwKn4K3BmzAWHe8bKqFDVr.jpg","Paul Newman"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/uKAfrFRZYnHFAxw53Jldbs8yIZO.jpg","Bonnie Hunt"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/w10ovvYjWZUlCJPa8aYJciycsOU.jpg","Larry the Cable Guy"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1LOfr36H1OFP5nsCD1ZQKu5QpXo.jpg","Tony Shalhoub"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/eecHDNRn9K80ZcuSocsMhQb2G1i.jpg","Cheech Marin"));
        return a1;
    }

    public List<CastAndCrew>a1917() {
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/3igGY57QsdJPTChto3ZBDT9vXTg.jpg","Gourge MacKay"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/A3UGnYH7ESTBwEjWBFev7MhvBsB.jpg","Dean Charles ChapMan"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/y6OqnC0QJXwCzY9CthZm0ONv31B.jpg","Mark Strong"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/3QQdJAMuXSBDK5uuTdgRNwJu1em.jpg","Andrew Scott"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/67HfnUIyYsxd11u99BHBFgFgCQf.jpg","Richrd Madden"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qS6WwLJb8GlYcIV5Cj16J3RJDE3.jpg","Claire Buburcq"));
        return a1;
    }


    public List<CastAndCrew>Parasite() {
        List<CastAndCrew> a1 = new ArrayList<>();
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/714R0wEx5SJ9o7l1Zfs37jTc8hi.jpg","Song Kang ho"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nnwVLKIQPYoF88ohshnFfbSB0UW.jpg","Lee Sun Kyun"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5MgWM8pkUiYkj9MEaEpO0Ir1FD9.jpg","cho Yeo Jeong"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hfskkkziJrGwobqik02RSoyt6v0.jpg","Choi Woo Shik"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/uWppIvypWODMjCxiGDWX92y86ci.jpg","Park SO dam"));
        a1.add (new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/45qpdANxxvU3danQPEhpGSQM9MX.jpg","Lee Jung Eum"));
        return a1;
    }

    public List<Movies> getData(){
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xJUILftRf6TJxloOgrilOTJfeOn.jpg","Ad Astra","Seorang astronot melakukan perjalanan ke tepi luar tata surya untuk menemukan ayahnya dan mengungkap misteri yang mengancam kelangsungan hidup planet kita. Dia mengungkap rahasia yang menantang sifat keberadaan manusia dan tempat kita di kosmos.","cerita Fiksi, Drama","2h 3m","James Gray","2019", AdAstra()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zG2l9Svw4PTldWJAzC171Y3d6G8.jpg", "Scoon", "Film ini menceritakan bagaimana awal pertemuan Scooby dan Shaggy. Shaggy yang coba menyelamatkan Scooby dari seorang polisi hingga mereka berdua akhirnya bersahabat. Mereka berdua pun bertemu Freddie, Velma dan Daphne dan menjadi anggota geng Mystery Inc. Scooby adan anggota akan menghadai sebuah misteri yang menantang yaitu komplotan anjing hantu Cerberus ke dunia. Bagaimanakah aksi mereka membongkar misteri ini ?", "keluarga, Animasi, KOmedi, Misteri, Petualang","1h 34m","Tony Cervone","2020",Scoob()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/niyXFhGIk4W2WTcX2Eod8vx2Mfe.jpg","Survive The Nught","A disgraced doctor and his family are held hostage at their home by criminals on the run, when a robbery-gone-awry requires them to seek immediate medical attention.","Aksi, Cerita Seru","1h 29m","Matt Eskandri","2020",SurviveTheNight()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8WUVHemHFH2ZIP6NWkwlHWsyrEL.jpg","BloodShoot","Ray Garrison/Bloodshot adalah seorang prajurit yang dihidupkan kembali oleh sebuah nanoteknologi. Karena teknologi ini ia memiliki kemampuan baru yang luar biasa. Namun masa lalu Ray tiba-tiba muncul dan membuatnya penasaran dengan jati dirinya. Dengan kemampuan barunya itu, ia berjuang mendapatkan kebenaran tentang kehidupannya.","Aksi, cerita Fiksi","1h 49m","Dave Wilson","2020",BloodShot()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wxPhn4ef1EAo5njxwBkAEVrlJJG.jpg","The Hunt","Twelve strangers wake up in a clearing. They don't know where they are—or how they got there. In the shadow of a dark internet conspiracy theory, ruthless elitists gather at a remote location to hunt humans for sport. But their master plan is about to be derailed when one of the hunted turns the tables on her pursuers.","Aksi, cerita Seru, Thriller","1h 30m","Cralg Zobel","2020",TheHunt()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AfjRxv9JjcARPoMcd8FUA9XIyor.jpg","The Call Of The Wild","Buck is a big-hearted dog whose blissful domestic life is turned upside down when he is suddenly uprooted from his California home and transplanted to the exotic wilds of the Yukon during the Gold Rush of the 1890s. As the newest rookie on a mail delivery dog sled team—and later its leader—Buck experiences the adventure of a lifetime, ultimately finding his true place in the world and becoming his own master.","Drama, Petualang, Keluarga","1h 40m", "Chris Sanders","2020",TheCallofTheWild()));
       list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/chhwNdkN4n2oIEjz736HPjTJg1h.jpg","Bad Boys For Life","Marcus dan Mike dipaksa untuk menghadapi ancaman baru, perubahan karir, dan krisis paruh baya saat mereka bergabung dengan tim elit AMMO yang baru dibentuk oleh Departemen Kepolisian Miami untuk menaklukkan Armando Amas yang kejam, pemimpin dari bandar narkoba Miami yang berbahaya.","seru, Aksi, Kejahatan","2h 4m","Bilall Failah","2020",BadBoysForLife()));
       list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aQvJ5WPzZgYVDrxLX4R6cLJCEaQ.jpg","Sonic The Hedgehog","Mengisahkan petualangan Sonic saat ia belajar tentang kompleksitas kehidupan di bumi bersama manusia sahabat barunya, Tom Wachowski. Sonic dan Tom bersatu untuk menghentikan si jahat Dr. Robotnik yang ingin menangkap Sonic dan menggunakan kekuatan istimewanya untuk menguasai dunia.","Aksi, cerita Fiksi, Komedi, Keluarga","1h 39m","Jeff Fowler","2020",Sonic()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xnjvwfDulnOCy8qtYX0iqydmMhk.jpg","Dolittle","Setelah kehilangan istri tercinta, Dr. John Dolittle (Robert Downey Jr.) yang eksentrik mengasingkan dirinya di balik rumahnya dan hanya ditemani hewan-hewan peliharaannya yang eksotis.","komedi, Fantasi, Petualangan, Keluarga","1h 41m","Stephen Gaghan","2020",Dolittle()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg","JOKER","Selama 1980-an, seorang pelawak berdiri gagal didorong gila dan beralih ke kehidupan kejahatan dan kekacauan di Kota Gotham sambil menjadi tokoh kejahatan psikopat terkenal.","kejahatan,drama","2h 2m","Todd Phillips","2019", Joker()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tQf4DUygWo64AOuqgk4jEDCE3Ws.jpg","Gone Girl","Gone Girl adalah sebuah film thriller psikologis Amerika Serikat yang rilis pada tahun 2014. Film ini disutradarai oleh David Fincher. Skenario film ini ditulis oleh Gillian Flynn, berdasarkan pada novel karangannya yang memiliki judul yang sama. Film ini dibintangi Ben Affleck dan Rosamund Pike","Misteri, Drama","2h 29m","Dacid Fincher","2014", GoneGirl()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zOQ8G8Ov8O1EzJgfWWQnowJeYlV.jpg","Intuition","Police officer Pipa works on her first big case while simultaneously investigating her boss, who is suspected of murder. The prequel to \"Perdida\".","kejahatan","1h 56m","Alejandro Montiel","2020", LaCorazonada()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qa6HCwP4Z15l3hpsASz3auugEW6.jpg","Cars","Lightning McQueen, mobil balap rookie jagoan yang digerakkan untuk sukses, menemukan bahwa hidup adalah tentang perjalanan, bukan garis finish, ketika dia mendapati dirinya tiba-tiba berbelok di Radiator Springs, kota Route 66 yang mengantuk. Dalam perjalanan melintasi negara ke Kejuaraan Piala Piston besar di California untuk bersaing dengan dua pemain pro berpengalaman, McQueen mengenal karakter offbeat kota.","Animasi, Petualang, Komedi. Keluarga","1h 57m","John Lasseter","2006", Cars()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iZf0KyrE25z1sage4SYFLCCrMi9.jpg","1917 ","Pada puncak perang dunia pertama, dua orang tentara Inggris muda, Schofield dan Blake diberikan sebuah misi yang kelihatannya tidak masuk akal. Berlomba melawan waktu, mereka harus melewati daerah musuh dan menyampaikan sebuah pesan yang akan menghentikan serangan mematikan terhadap ratusan tentara - di mana saudara laki-laki Blake berada di antaranya.","Kejahatan, Drama, Aksi,Sejarah","1h 59m","Sam Mendes","2019", a1917()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kNDkdMSdbP7rlGwpjUhQklmWijT.jpg","Parasite","Semua menganggur, keluarga Ki-taek memiliki minat khusus pada Taman kaya dan glamor untuk mata pencaharian mereka sampai mereka terjerat dalam insiden tak terduga.","KOmedi, Drama","2h 13m","Bong Joon-ho","2019",Parasite()));
     return list;
    }

    public void removeIndex(int index){
        list.remove(index);
    }

    public void clearData(){
        list.clear();
    }
}
