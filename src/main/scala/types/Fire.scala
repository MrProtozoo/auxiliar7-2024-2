package types

class Fire extends AType {
  val name: String = "Fire"
  override def equals(other: Any): Boolean = other match {
    case f: Fire => true
    case _ => false
  }

  override def bonusFire: Double = BOOST

  override def effectGrass: Double = SUPEREFFECTIVE

  override def effectWater: Double = INEFFECTIVE

}
