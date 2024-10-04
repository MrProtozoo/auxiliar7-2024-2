package types

class Grass extends AType {
  val name: String = "Grass"
  override def equals(other: Any): Boolean = other match {
    case g: Grass => true
    case _ => false
  }

  override def effectWater: Double = SUPEREFFECTIVE

  override def effectFire: Double = INEFFECTIVE

}
