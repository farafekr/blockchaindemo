/*
 * Simple Blockchain Demo
 * By @farafekr
 * Author @mobinranjbar
 * www.hadoop.ir
 */
package farafekr.blockchaindemo;

public class Main {

	public static void main(String[] args) {
		String[] genesisTransactions = {"Mobin Ranjbar sent Mehrdad 9999 bitcoin","Mobin Ranjbar sent 10 bitcoins to Mehrdad"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Mobin Ranjbar sent 10 bitcoin to Peyman", "Mobin Ranjbar sent 10 bitcoin to Sina"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Mobin Ranjbar sent 999 bitcoin to Farafekr Technology"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
        
        System.out.println("This is a Simple Blockchain Demo by Farafekr Technology\n");
        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

	}

}
