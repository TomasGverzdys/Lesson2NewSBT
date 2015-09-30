import org.scalatest.{Matchers, FunSuite}

/**
 * Created by Tomas_Laptop on 2015/09/29.
 */
class OligoUTest extends FunSuite with Matchers {
  test ("Oligo's isValid function can detect when an Oligo is valid"){
    Oligo("ATCG").isValid shouldBe true
    Oligo("GCCTY").isValid shouldBe false
    Oligo("").isValid shouldBe false
    Oligo("`/;").isValid shouldBe false

  }

  test ("Oligo can count the number of adenine properly"){
    val testOligo = Oligo("AAAATTTTGGGGCCCCATGC")
    testOligo.NumberOfA shouldBe 5
    testOligo.NumberOfT shouldBe 5
    testOligo.NumberOfG shouldBe 5
    testOligo.NumberOfC shouldBe 5
  }

  test ("Oligo's countCharacter can test the number of characters in a sequence") {
    val testOligo = Oligo("AGAGAGAGAG")
    testOligo.countCharacter('A') shouldBe 5
  }
}
