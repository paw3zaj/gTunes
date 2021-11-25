package com.gtunes

class Song {

    String title
    Integer duration

    static belongsTo = Album, Artist            // relacja jedno-stronna, należy do albumu
    // static belongsTo = Artist

    // static belongsTo = [album:Album]   relacja dwukierunkowa, należy do albumu

    static constraints = {
        title blank: false
        artist blank: false
    }

    static mapping = {
        table 'canto'
        id column:'song_id'
        version false
        // artist:'song_artist'
        title:'song_title'
    }
}
