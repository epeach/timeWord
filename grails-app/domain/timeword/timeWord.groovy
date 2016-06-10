package timeword

import metafunctionality.ModuleInput

class timeWord extends ModuleInput {
    Double seconds
    Boolean oneAtTime
    static hasMany = [words:String]
    List words
}