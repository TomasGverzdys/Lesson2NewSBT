case class Oligo (sequence:String) {
  val NumberOfA = countCharacter('A')
  val NumberOfT = countCharacter('T')
  val NumberOfG = countCharacter('G')
  val NumberOfC = countCharacter('C')
  val SimpleOligoTemp = calculateSimpleOligoTemp()

  def isValid:Boolean = sequence.matches ("[atgcATGC]+")

  def countCharacter (characterToCount: Char) : Int = sequence.count (_ == characterToCount)

  def printOligoSummary () = {
    println(s"$sequence: A($NumberOfA), T($NumberOfT), G($NumberOfG), C($NumberOfC)")
  }

  def calculateSimpleOligoTemp () : Int = {
    (NumberOfA + NumberOfT)*2 + (NumberOfC + NumberOfG)*4
  }
}
