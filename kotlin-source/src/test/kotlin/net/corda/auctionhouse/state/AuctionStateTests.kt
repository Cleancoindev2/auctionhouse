package net.corda.auctionhouse.state

/**
 * Practical exercise instructions.
 * Uncomment the first unit test [hasIOUAmountFieldOfCorrectType] then run the unit test using the green arrow
 * to the left of the [AuctionStateTests] class or the [hasIOUAmountFieldOfCorrectType] method.
 * Running the unit tests from [AuctionStateTests] runs all of the unit tests defined in the class.
 * The test should fail because you need to make some changes to the AuctionState to make the test pass. Read the TODO
 * under each task number for a description and a hint of what you need to do.
 * Once you have the unit test passing, uncomment the next test.
 * Continue until all the unit tests pass.
 * Hint: CMD / Ctrl + click on the brown type names in square brackets for that type's definition in the codebase.
 */
class AuctionStateTests {

//    /**
//     * Task 1.
//     * TODO: Add an 'amount' property of type [Amount] to the [AuctionState] class to get this test to pass.
//     * Hint: [Amount] is a template class that takes a class parameter of the token you would like an [Amount] of.
//     * As we are dealing with cash lent from one Party to another a sensible token to use would be [Currency].
//     */
//    @Test
//    fun hasIOUAmountFieldOfCorrectType() {
//        // Does the amount field exist?
//        AuctionState::class.java.getDeclaredField("amount")
//        // Is the amount field of the correct type?
//        assertEquals(AuctionState::class.java.getDeclaredField("amount").type, Amount::class.java)
//    }
//
//    /**
//     * Task 2.
//     * TODO: Add a 'lender' property of type [Party] to the [AuctionState] class to get this test to pass.
//     */
//    @Test
//    fun hasLenderFieldOfCorrectType() {
//        // Does the lender field exist?
//        AuctionState::class.java.getDeclaredField("lender")
//        // Is the lender field of the correct type?
//        assertEquals(AuctionState::class.java.getDeclaredField("lender").type, Party::class.java)
//    }
//
//    /**
//     * Task 3.
//     * TODO: Add a 'borrower' property of type [Party] to the [AuctionState] class to get this test to pass.
//     */
//    @Test
//    fun hasBorrowerFieldOfCorrectType() {
//        // Does the borrower field exist?
//        AuctionState::class.java.getDeclaredField("borrower")
//        // Is the borrower field of the correct type?
//        assertEquals(AuctionState::class.java.getDeclaredField("borrower").type, Party::class.java)
//    }
//
//    /**
//     * Task 4.
//     * TODO: Add a 'paid' property of type [Amount] to the [AuctionState] class to get this test to pass.
//     * Hint:
//     * - We would like this property to be initialised to a zero amount of Currency upon creation of the [AuctionState].
//     * - You can use the [POUNDS] extension function over [Int] to create an amount of pounds e.g. '10.POUNDS'.
//     * - This property keeps track of how much of the initial [AuctionState.amount] has been settled by the borrower
//     * - You can initialise a property with a default value in a Kotlin data class like this:
//     *
//     *       data class(val number: Int = 10)
//     *
//     * - We need to make sure that the [AuctionState.paid] property is of the same currency type as the
//     *   [AuctionState.amount] property. You can create an instance of the [Amount] class that takes a zero value and a token
//     *   representing the currency - which should be the same currency as the [AuctionState.amount] property.
//     */
//    @Test
//    fun hasPaidFieldOfCorrectType() {
//        // Does the paid field exist?
//        AuctionState::class.java.getDeclaredField("paid")
//        // Is the paid field of the correct type?
//        assertEquals(AuctionState::class.java.getDeclaredField("paid").type, Amount::class.java)
//    }
//
//    /**
//     * Task 5.
//     * TODO: Include the lender within the [AuctionState.participants] list
//     * Hint: [listOf] takes any number of parameters and will add them to the list
//     */
//    @Test
//    fun lenderIsParticipant() {
//        val iouState = AuctionState(1.POUNDS, ALICE.party, BOB.party)
//        assertNotEquals(iouState.participants.indexOf(ALICE.party), -1)
//    }
//
//    /**
//     * Task 6.
//     * TODO: Similar to the last task, include the borrower within the [AuctionState.participants] list
//     */
//    @Test
//    fun borrowerIsParticipant() {
//        val iouState = AuctionState(1.POUNDS, ALICE.party, BOB.party)
//        assertNotEquals(iouState.participants.indexOf(BOB.party), -1)
//    }
//
//    /**
//     * Task 7.
//     * TODO: Implement [LinearState] along with the required properties and methods.
//     * Hint: [LinearState] implements [ContractState] which defines an additional property and method. You can use
//     * IntellIJ to automatically add the member definitions for you or you can add them yourself. Look at the definition
//     * of [LinearState] for what requires adding.
//     */
//    @Test
//    fun isLinearState() {
//        assert(LinearState::class.java.isAssignableFrom(AuctionState::class.java))
//    }
//
//    /**
//     * Task 8.
//     * TODO: Override the [LinearState.auctionId] property and assign it a value via your state's constructor.
//     * Hint:
//     * - The [LinearState.auctionId] property is of type [UniqueIdentifier]. You need to create a new instance of
//     * the [UniqueIdentifier] class.
//     * - The [LinearState.auctionId] is designed to link all [LinearState]s (which represent the state of an
//     * agreement at a specific point in time) together. All the [LinearState]s with the same [LinearState.auctionId]
//     * represent the complete life-cycle to date of an agreement, asset or shared fact.
//     * - Provide a default value for [auctionId] for a new [AuctionState]
//     */
//    @Test
//    fun hasLinearIdFieldOfCorrectType() {
//        // Does the auctionId field exist?
//        AuctionState::class.java.getDeclaredField("auctionId")
//        // Is the auctionId field of the correct type?
//        assertEquals(AuctionState::class.java.getDeclaredField("auctionId").type, UniqueIdentifier::class.java)
//    }
//
//    /**
//     * Task 9.
//     * TODO: Ensure parameters are ordered correctly.
//     * Hint: Make sure that the lender and borrower fields are not in the wrong order as this may cause some
//     * confusion in subsequent tasks!
//     */
//    @Test
//    fun checkIOUStateParameterOrdering() {
//        val fields = AuctionState::class.java.declaredFields
//        val amountIdx = fields.indexOf(AuctionState::class.java.getDeclaredField("amount"))
//        val lenderIdx = fields.indexOf(AuctionState::class.java.getDeclaredField("lender"))
//        val borrowerIdx = fields.indexOf(AuctionState::class.java.getDeclaredField("borrower"))
//        val paidIdx = fields.indexOf(AuctionState::class.java.getDeclaredField("paid"))
//        val linearIdIdx = fields.indexOf(AuctionState::class.java.getDeclaredField("auctionId"))
//
//        assert(amountIdx < lenderIdx)
//        assert(lenderIdx < borrowerIdx)
//        assert(borrowerIdx < paidIdx)
//        assert(paidIdx < linearIdIdx)
//    }
//
//    /**
//     * Task 10.
//     * TODO: Add a helper method called [pay] that can be called from an [AuctionState] to settle an amount of the IOU.
//     * Hint:
//     * - You will need to increase the [AuctionState.paid] property by the amount the borrower wishes to pay.
//     * - Add a new function called [pay] in [AuctionState]. This function will need to return an [AuctionState].
//     * - The existing state is immutable so a new state must be created from the existing state. Kotlin provides a [copy]
//     * method which creates a new object with new values for specified fields.
//     * - [copy] returns a copy of the object instance and the fields can be changed by specifying new values as
//     * parameters to [copy]     */
//    @Test
//    fun checkPayHelperMethod() {
//        val iou = AuctionState(10.DOLLARS, ALICE.party, BOB.party)
//        assertEquals(5.DOLLARS, iou.pay(5.DOLLARS).paid)
//        assertEquals(3.DOLLARS, iou.pay(1.DOLLARS).pay(2.DOLLARS).paid)
//        assertEquals(10.DOLLARS, iou.pay(5.DOLLARS).pay(3.DOLLARS).pay(2.DOLLARS).paid)
//    }
//
//    /**
//     * Task 11.
//     * TODO: Add a helper method called [withNewLender] that can be called from an [AuctionState] to change the IOU's lender.
//     */
//    @Test
//    fun checkWithNewLenderHelperMethod() {
//        val iou = AuctionState(10.DOLLARS, ALICE.party, BOB.party)
//        assertEquals(MINICORP.party, iou.withNewLender(MINICORP.party).lender)
//        assertEquals(MEGACORP.party, iou.withNewLender(MEGACORP.party).lender)
//    }
}