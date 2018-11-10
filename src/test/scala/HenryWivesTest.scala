import org.scalatest.{Matchers, FunSuite}

/** @version 1.3.0 */
class HenryWivesTest extends FunSuite with Matchers {

  test("Catherine of Aragon; 11 June 1509 – 23 May 1533; Annulled") {
    HenryWives.survived("Catherine", 24) should be (true)
  }

  test("Anne Boleyn; 28 May 1533 – 17 May 1536; Beheaded") {
    HenryWives.survived("Anne",2) should be (false)
  }

  test("Jane Seymour; 30 May 1536 – 24 October 1537; Died"){
    HenryWives.survived("Jane",1) should be (false)
  }

  test("Anne of Cleves; 6 January 1540 – 9 July 1540; Annulled"){
    HenryWives.survived("Anne",1) should be (true)
  }

  test(" Catherine Howard; 28 July 1540 – 23 November 1541; Beheaded") {
    HenryWives.survived("Catherine", 1) should be (false)
  }

  test("Catherine Parr; 12 July 1543 – 28 January 1547; Widowed") {
    HenryWives.survived("Catherine",2) should be (true)
  }


}