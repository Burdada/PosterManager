package ru.netology.domain;

public class PosterManager {
    public int limit;

    public PosterManager() {
        limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    private String[] movies = new String[0];

    public void save(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLenghth;
        if (movies.length < limit) {
            resultLenghth = movies.length;
        } else {
            resultLenghth = limit;
        }
        String[] tmp = new String[resultLenghth];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
