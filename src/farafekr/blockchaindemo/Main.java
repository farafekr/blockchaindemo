/*
 * Simple Blockchain Demo
 * By @farafekr
 * Author @mobinranjbar
 * www.hadoop.ir
 */
package farafekr.blockchaindemo;

public class Main {

	public static void main(String[] args) {
		// ایجاد تراکنش های ریشه که لازمه شروع بلاک چین می باشد
		String[] genesisTransactions = {"Mobin Ranjbar sent Mehrdad 9999 bitcoin","Mobin Ranjbar sent 10 bitcoins to Mehrdad"};
        	// تراکنش ریشه دارای مقدار هش قبلی صفر و با داده تراکنش های ریشه اولین بلاک را می سازد
		Block genesisBlock = new Block(0, genesisTransactions);
	// بلاک بعدی تراکنش های دیگری را نگهداری می کند. این تراکنش ها در این مثال آرایه ای از رشته ها می باشند
        String[] block2Transactions = {"Mobin Ranjbar sent 10 bitcoin to Peyman", "Mobin Ranjbar sent 10 bitcoin to Sina"};
	// بلاک دوم از هش بلاک قبلی و هش بلاک جاری که همان هش داده های تراکنش هاست تشکیل می شود
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
	// و همینطور بلاک سوم
        String[] block3Transactions = {"Mobin Ranjbar sent 999 bitcoin to Farafekr Technology"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
        
        System.out.println("This is a Simple Blockchain Demo by Farafekr Technology\n");
        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash()); // چاپ هش بلاک ریشه

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash()); // چاپ هش بلاک دوم

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash()); // چاپ هش بلاک سوم

	}

}
