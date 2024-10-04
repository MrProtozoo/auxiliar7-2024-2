package types

abstract class AType extends Type {
  
  protected val BASIC = 1.0
  protected val BOOST = 1.5
  protected val NO_EFFECT = 0.0
  protected val INEFFECTIVE = 0.5
  protected val EFFECTIVE = 1.0
  protected val SUPEREFFECTIVE = 2.0

  // Fire, Water, Grass, Normal

  def bonusFire: Double = BASIC
  def bonusWater: Double = BASIC
  def bonusGrass: Double = BASIC
  def bonusNormal: Double = BASIC

  def effectFire: Double = EFFECTIVE
  def effectWater: Double = EFFECTIVE
  def effectGrass: Double = EFFECTIVE
  def effectNormal: Double = EFFECTIVE

}
