package domain

import scodec.codecs._


/**
  * Created by highl on 24/08/2016.
  */
abstract class Character {
  var zoneId : Int
  var charId : Int
  var charGUID : Int
  var secondsSinceLastLogin: Int

}

