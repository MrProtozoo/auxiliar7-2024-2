package types

class FireTest extends munit.FunSuite {

  var fMov: Fire = _
  var fCreat: Fire = _
  var wCreat: Water = _
  var gCreat: Grass = _

  override def beforeEach(context: BeforeEach) = {
    fMov = new Fire()
    fCreat = new Fire()
    wCreat = new Water()
    gCreat = new Grass()
  }

  test("A Fire attack of a Fire creature should have a bonus") {
    assertEquals(fCreat.bonusFire, 1.5)
  }

  test("A Fire attack of a Grass creature do not hava a bonus") {
    assertEquals(fCreat.bonusGrass, 1.0)
  }

  test("A Fire attack of a Water creature do not hava a bonus") {
    assertEquals(fCreat.bonusWater, 1.0)
  }

  test("A Fire attack should be effective against Fire") {
    assertEquals(fCreat.effectFire, 1.0)
  }

  test("A Fire attack should be supereffective against Grass") {
    assertEquals(fCreat.effectGrass, 2.0)
  }

  test("A Fire attack should be ineffective against Water") {
    assertEquals(fCreat.effectWater, 0.5)
  }
}
