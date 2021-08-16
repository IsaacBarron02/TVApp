package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Inicio",
            "Tus me gusta",
            "Álbumes",
            "Tus playlist",
            "Biblioteca",
            "Releases",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "AM",
                "Colores",
                "YHLQMDLG",
                "Appettite for Destruction",
                "Mi Nuevo Yo"
        };

        String description = "Copyrigth ©";
        String studio[] = {
                "Artic Monkeys", "J Balvin", "Bad Bunny", "Guns and Roses", "Natanael Cano"
        };
        String videoUrl[] = {
                "https://www.youtube.com/watch?v=bpOSxM0rNPM&list=OLAK5uy_kk162BW2lzsM8QE54N8nt6dvmsM9gdn4M",
                "https://www.youtube.com/watch?v=KHAgoT4FZbc&list=OLAK5uy_nU7AvmrgLKP2n5f_ncZajFvTGELnCViJA",
                "https://www.youtube.com/watch?v=fEYUoBgYKzw&list=OLAK5uy_kxz7HRNwhGKe9j6rR8zEbbjEm416wwGUk&index=2",
                "https://www.youtube.com/watch?v=o1tj2zJ2Wvg&list=OLAK5uy_n13hmdsIozcCRyaY4cRDuuviphpfbzPrw",
                "https://www.youtube.com/watch?v=xh9ymx2bPjA&list=OLAK5uy_m3dLMWarIOra00ud70cV6pK3eOP3riAP4"
        };
        String bgImageUrl[] = {
                "https://i.scdn.co/image/ab6761610000e5eb39f37a34b404169fdca52dc8",
                "https://i.scdn.co/image/ab6761610000e5eb4474158bcb878d0395b52c7a",
                "https://i.scdn.co/image/ab6761610000e5eb6ad57a3cb26ae3ffd0f28f22",
                "https://consequence.net/wp-content/uploads/2015/11/screen-shot-2015-11-12-at-10-52-33-am.png",
                "https://i.scdn.co/image/ab6761610000e5eb615df07b39adb4ddcccd4270",
        };
        String cardImageUrl[] = {
                "https://upload.wikimedia.org/wikipedia/commons/e/e7/%22AM%22_%28Arctic_Monkeys%29.jpg",
                "https://images-na.ssl-images-amazon.com/images/I/81PX5QopjSL._SL1400_.jpg",
                "https://images.genius.com/aa1c8b77f382d4d32ad97002ab823680.1000x1000x1.png",
                "https://i.scdn.co/image/ab67616d0000b27321ebf49b3292c3f0f575f0f5",
                "https://i.scdn.co/image/ab67616d0000b273b621e5024b3157a800bfa971"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}