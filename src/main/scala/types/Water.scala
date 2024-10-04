package types

class Water extends AType {
  val name: String = "Water"
  override def equals(other: Any): Boolean = other match {
    case w: Water => true
    case _ => false
  }

  override def effectFire: Double = SUPEREFFECTIVE

  override def effectGrass: Double = INEFFECTIVE

}
