package org.bitcoindevkit

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class OfflineWalletTest {
    @Test
    fun testDescriptorBip86() {
        val mnemonic: Mnemonic = Mnemonic(WordCount.WORDS12)
        val descriptorSecretKey: DescriptorSecretKey = DescriptorSecretKey(Network.TESTNET, mnemonic, null)
        val descriptor: Descriptor = Descriptor.newBip86(descriptorSecretKey, KeychainKind.EXTERNAL, Network.TESTNET)

        assertTrue(descriptor.asString().startsWith("tr"), "Bip86 Descriptor does not start with 'tr'")
    }

   @Test
    fun testNewAddress() {
        val descriptor: Descriptor = Descriptor(
            "wpkh([c258d2e4/84h/1h/0h]tpubDDYkZojQFQjht8Tm4jsS3iuEmKjTiEGjG6KnuFNKKJb5A6ZUCUZKdvLdSDWofKi4ToRCwb9poe1XdqfUnP4jaJjCB2Zwv11ZLgSbnZSNecE/0/*)",
            Network.TESTNET
        )
        // val wallet: Wallet = WalletNoPersist(
        //     descriptor,
        //     null,
        //     Network.TESTNET
        // )
        // val addressInfo: AddressInfo = wallet.getAddress(AddressIndex.New)
        //
        // assertTrue(addressInfo.address.isValidForNetwork(Network.TESTNET), "Address is not valid for testnet network")
        // assertTrue(addressInfo.address.isValidForNetwork(Network.SIGNET), "Address is not valid for signet network")
        // assertFalse(addressInfo.address.isValidForNetwork(Network.REGTEST), "Address is valid for regtest network, but it shouldn't be")
        // assertFalse(addressInfo.address.isValidForNetwork(Network.BITCOIN), "Address is valid for bitcoin network, but it shouldn't be")
        //
        // assertEquals(
        //     expected = "tb1qzg4mckdh50nwdm9hkzq06528rsu73hjxxzem3e",
        //     actual = addressInfo.address.asString()
        // )
    }

    @Test
    fun testBalance() {
        val descriptor: Descriptor = Descriptor(
            "wpkh([c258d2e4/84h/1h/0h]tpubDDYkZojQFQjht8Tm4jsS3iuEmKjTiEGjG6KnuFNKKJb5A6ZUCUZKdvLdSDWofKi4ToRCwb9poe1XdqfUnP4jaJjCB2Zwv11ZLgSbnZSNecE/0/*)",
            Network.TESTNET
        )
        // val wallet: WalletNoPersist = WalletNoPersist(
        //     descriptor,
        //     null,
        //     Network.TESTNET
        // )

        // assertEquals(
        //     expected = 0uL,
        //     actual = wallet.getBalance().total
        // )
    }
}
