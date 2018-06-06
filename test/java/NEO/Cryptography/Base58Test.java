package NEO.Cryptography;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class Base58Test extends TestCase {

    @Test
    public void testDecode() {
        String input = "111158ze8RJ8wMKd35waS6SpefN35LHvJHaR8AA38a9Ry2th1FfYgJGu8DyM5qtz3SRrbzEKLXtjQQCABzMEc35a9kRyiooMmbkvn6SH1yzTHgfXRR17UzuueQo2Jh5VzyhE1L4H1Q5x53YP5UHg1adfo5mDet9i9Ly5KwaDFRyYWxvgeHCf9i8WzU8ZdWfp6oejmaPXEwcA9R5zXn41LyasWuNcJrFwd6TxkiRrcTV5QVZJFeeiiuwdiRNtDL89c99mq8M3z5J4EVDBApJD6ShuqeAyDjkVjo9VUYMR28EHqSSmFbYABFuEQUGjy2Dogw48gZLUiEDj4KpxBDEqSLv1d56g1rjLAu52pQd89rNo9Md3Qy9GNLKH2f8LM8EjhmHgcPH8FyxxCxJnWku4szu8yzAtYP8TEsMC3TbRCK6jtX6wi75q8uTYP4Gkd24UnXBphmo1dKpkmuvZRwdS5H4ewMywvV3J4Fe6hY7QQR2KnVNaV93K57Er7jtj7mRafHc2NoKcGK5j85b4ZXaCU2X1dk6abqDD8aTgj7pT5hJvmJuaZimBVXbxvp6NftkvWR7Hm9jgYuCFB2HuBnaWLoMm7gPQyiFAGL9kR2ZB6NYNVUCzUevLFpxogQtWPtfzJRaeQE6sMwDaiYw7frJiEoTiV8tGfTRYfh78KP5FN938CFPH7B2q2vv5r2gvjmebniAuJuXRxSHyq1SAv3LCZnYEKxbuqKkgxZP45245jnbKKzrw1ATRBXW13Kx5rfJ8x2GSTpyQe2dJBJDDUNRSXbHtNhvd8TsTEoEocFcW7pyNkq675Xq2hh6dsgHsxZTJWheeaUd7KsdnmYDLjtYU1ayTRw92SXAzsGuetLDM6Xf4sizyTFEWSQf3JAgqFqoie2hhtn9n6rXK6Hyq2AzTreaZinrgYFjpcBKstsRq";
        byte[] data = Base58.decode(input);
        String hex = NEO.Helper.toHexString(data);
        assertEquals("00000000e36a0b74514cf5433ef8afdd64f52f5f149be7b68ffea2a30635e608aa3547cd419524c8559a59d5b9eb379c9b28ddadf212d5a26b840af9c03c63a59cb80f25f2220458e8030000a37e53ca9d1515ec59e75d652b5d3827bf04c165bbe9ef95cca4bf5501fd450140c252df98bc3a569154a00f408a8d70ec03d74dbaf9f41342ea7a6b26153be6b0ac56bf2cca48b79b981847c6f0d28f37e29da7444aa20cbc6f6c5e197166110d4050fbc4d36b74a5b0f826192bff34b9875287f352e5f1bc2d5ad7cf8de184504678113ba4638867c13adb971fb245df7aa858b7d63141f4d3d67f0e67a015a3c54066b7daf7bc24aeb97dcf46cafd0c5fb7a2e17fbb0ec354eacbe4044c99e971166069b731e57f0572cff4db48434da861b827410b4e0bd15f69c83081bd659b2440d2a93db8fa70fb7d9805db56db4704f5e241713035b8d082b7af735e0c556a9af515c3f7e8269e1505cfbc7381037c811645ddcfa38468669b7832df9ae34f524023b8a8e8fd98bce09e994c941de939d08cf51f61a0c851aa1e48852ebf3df1fef4d7c125019aeb68d3fc0c52d0924d5c40532796b6cd1b4dfeaff5b6f006b960f1552102486fd15702c4490a26703112a5cc1d0923fd697a33406bd5a1c00e0013b09a7021024c7b7fb6c310fccf1ba33b082519d82964ea93868d676662d4a59ad548df0e7d2102aaec38470f6aad0042c6e877cfd8087d2676b0f516fddd362801b9bd3936399e2103b209fd4f53a7170ea4444e0cb0a6bb6a53c2bd016926989cf85f9b0fba17a70c2103b8d9d5771d8f513aa0869b9cc8d50986403b78c6da36890638c3d46a5adce04a2102ca0e27697b9c248f6f16e085fd0061e26f44da85b58ee835c110caa5ec3ba5542102df48f60e8f3e01c48ff40b9b7f1310d7a8b2a193188befe1c2e3df740e89509357ae010000a37e53ca00000000", hex);
    }

    @Test
    public void testEncode() {
        String input = "00000000e36a0b74514cf5433ef8afdd64f52f5f149be7b68ffea2a30635e608aa3547cd419524c8559a59d5b9eb379c9b28ddadf212d5a26b840af9c03c63a59cb80f25f2220458e8030000a37e53ca9d1515ec59e75d652b5d3827bf04c165bbe9ef95cca4bf5501fd450140c252df98bc3a569154a00f408a8d70ec03d74dbaf9f41342ea7a6b26153be6b0ac56bf2cca48b79b981847c6f0d28f37e29da7444aa20cbc6f6c5e197166110d4050fbc4d36b74a5b0f826192bff34b9875287f352e5f1bc2d5ad7cf8de184504678113ba4638867c13adb971fb245df7aa858b7d63141f4d3d67f0e67a015a3c54066b7daf7bc24aeb97dcf46cafd0c5fb7a2e17fbb0ec354eacbe4044c99e971166069b731e57f0572cff4db48434da861b827410b4e0bd15f69c83081bd659b2440d2a93db8fa70fb7d9805db56db4704f5e241713035b8d082b7af735e0c556a9af515c3f7e8269e1505cfbc7381037c811645ddcfa38468669b7832df9ae34f524023b8a8e8fd98bce09e994c941de939d08cf51f61a0c851aa1e48852ebf3df1fef4d7c125019aeb68d3fc0c52d0924d5c40532796b6cd1b4dfeaff5b6f006b960f1552102486fd15702c4490a26703112a5cc1d0923fd697a33406bd5a1c00e0013b09a7021024c7b7fb6c310fccf1ba33b082519d82964ea93868d676662d4a59ad548df0e7d2102aaec38470f6aad0042c6e877cfd8087d2676b0f516fddd362801b9bd3936399e2103b209fd4f53a7170ea4444e0cb0a6bb6a53c2bd016926989cf85f9b0fba17a70c2103b8d9d5771d8f513aa0869b9cc8d50986403b78c6da36890638c3d46a5adce04a2102ca0e27697b9c248f6f16e085fd0061e26f44da85b58ee835c110caa5ec3ba5542102df48f60e8f3e01c48ff40b9b7f1310d7a8b2a193188befe1c2e3df740e89509357ae010000a37e53ca00000000";
        byte[] data = NEO.Helper.hexToBytes(input);
        String encoded = Base58.encode(data);
        assertEquals("111158ze8RJ8wMKd35waS6SpefN35LHvJHaR8AA38a9Ry2th1FfYgJGu8DyM5qtz3SRrbzEKLXtjQQCABzMEc35a9kRyiooMmbkvn6SH1yzTHgfXRR17UzuueQo2Jh5VzyhE1L4H1Q5x53YP5UHg1adfo5mDet9i9Ly5KwaDFRyYWxvgeHCf9i8WzU8ZdWfp6oejmaPXEwcA9R5zXn41LyasWuNcJrFwd6TxkiRrcTV5QVZJFeeiiuwdiRNtDL89c99mq8M3z5J4EVDBApJD6ShuqeAyDjkVjo9VUYMR28EHqSSmFbYABFuEQUGjy2Dogw48gZLUiEDj4KpxBDEqSLv1d56g1rjLAu52pQd89rNo9Md3Qy9GNLKH2f8LM8EjhmHgcPH8FyxxCxJnWku4szu8yzAtYP8TEsMC3TbRCK6jtX6wi75q8uTYP4Gkd24UnXBphmo1dKpkmuvZRwdS5H4ewMywvV3J4Fe6hY7QQR2KnVNaV93K57Er7jtj7mRafHc2NoKcGK5j85b4ZXaCU2X1dk6abqDD8aTgj7pT5hJvmJuaZimBVXbxvp6NftkvWR7Hm9jgYuCFB2HuBnaWLoMm7gPQyiFAGL9kR2ZB6NYNVUCzUevLFpxogQtWPtfzJRaeQE6sMwDaiYw7frJiEoTiV8tGfTRYfh78KP5FN938CFPH7B2q2vv5r2gvjmebniAuJuXRxSHyq1SAv3LCZnYEKxbuqKkgxZP45245jnbKKzrw1ATRBXW13Kx5rfJ8x2GSTpyQe2dJBJDDUNRSXbHtNhvd8TsTEoEocFcW7pyNkq675Xq2hh6dsgHsxZTJWheeaUd7KsdnmYDLjtYU1ayTRw92SXAzsGuetLDM6Xf4sizyTFEWSQf3JAgqFqoie2hhtn9n6rXK6Hyq2AzTreaZinrgYFjpcBKstsRq", encoded);
    }
}