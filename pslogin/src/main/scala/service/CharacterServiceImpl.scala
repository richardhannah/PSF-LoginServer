package service

import net.psforever.packet.{GamePacket, PacketCoding}
import net.psforever.packet.game.{CharacterInfoMessage, PlanetSideGUID, PlanetSideZoneID}

/**
  * Created by highl on 23/08/2016.
  */
class CharacterServiceImpl extends CharacterService{

  private[this] val LOGGER = org.log4s.getLogger

  override def loadCharacters: List[GamePacket] = {
    LOGGER.debug("Loading character list for")//TODO - log username here

    // NOTE: PlanetSideZoneID just chooses the background
    var characaterInfoPackets: List[GamePacket]=List()
    characaterInfoPackets:+ PacketCoding.CreateGamePacket(0,CharacterInfoMessage(PlanetSideZoneID(1), 0, PlanetSideGUID(0), false, 0))
    characaterInfoPackets:+ PacketCoding.CreateGamePacket(0,CharacterInfoMessage(PlanetSideZoneID(1), 0, PlanetSideGUID(1), true, 0))
    return characaterInfoPackets
  }
}
