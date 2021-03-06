// Copyright (c) 2016 PSForever.net to present
package net.psforever.packet.game

import net.psforever.packet.{GamePacketOpcode, Marshallable, PacketHelpers, PlanetSideGamePacket}
import scodec.Codec
import scodec.codecs._

final case class GenericObjectStateMsg(object_guid : PlanetSideGUID,
                                       state : Long)
  extends PlanetSideGamePacket {
  type Packet = GenericObjectStateMsg
  def opcode = GamePacketOpcode.GenericObjectStateMsg
  def encode = GenericObjectStateMsg.encode(this)
}

object GenericObjectStateMsg extends Marshallable[GenericObjectStateMsg] {
  implicit val codec : Codec[GenericObjectStateMsg] = (
      ("object_guid" | PlanetSideGUID.codec) ::
        ("state" | uint32L)
    ).as[GenericObjectStateMsg]
}
