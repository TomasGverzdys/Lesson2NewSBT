object HelloWorld {
  def main(args: Array[String]): Unit = {

    val sequences = args.toVector
    val oligos = sequences.map(Oligo)
    oligos.map (_.printOligoSummary)
  }
}
