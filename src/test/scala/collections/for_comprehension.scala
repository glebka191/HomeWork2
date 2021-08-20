package collections

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class for_comprehension extends AnyFlatSpec {

  "check correct map" shouldBe {
    assert(NonEmptyWrap(10).map(_ * 10) === NonEmptyWrap(100))
    assert(NonEmptyWrap(10).map(el => NonEmptyWrap(el)) === NonEmptyWrap(NonEmptyWrap(10)))
    assert(Wrap.empty[Int].map(el => el * 10) === EmptyWrap)
  }

  "check correct flatMap" shouldBe {
    assert(NonEmptyWrap(10).flatMap(el => NonEmptyWrap(el * 10)) === NonEmptyWrap(10 * 10))
    assert(Wrap.empty[Int].flatMap(_ => NonEmptyWrap(10)) === NonEmptyWrap(10))
    assert(Wrap.empty[Int].flatMap(_ => EmptyWrap) === EmptyWrap)
  }

  "check correct pure" shouldBe {
    assert(EmptyWrap === Wrap.empty)
  }
}
