package com.gtunes

class Album {
    String title

    static hasMany = [songs:Song]
    static belongsTo = [artist : Artist]
    // static hasOne = [song:Song]

    SortedSet songs

    static constraints = {
    }
}
