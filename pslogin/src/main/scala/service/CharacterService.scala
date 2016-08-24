package service

import net.psforever.packet.GamePacket

/**
  * Created by highl on 23/08/2016.
  */
trait CharacterService {

  def loadCharacters: List[GamePacket]

}
