package com.mycompany.assignment_3_oop;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie() {
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie[] getPG(Movie[] movies) {
        Movie[] newArr = new Movie[movies.length];
        for (Movie i : movies) {
            for (int j = 0; j < newArr.length; j++) {
                if (i.rating == "PG") {
                    newArr[j] = i;
                }

            }
        }
        return newArr;
    }
}
