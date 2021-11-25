package com.gtunes

class Artist {
    String name

    static hasMany = [albums : Album]

    static constraints = {
    }
}
