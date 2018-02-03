/*
 * Simple Blockchain Demo
 * By @farafekr
 * Author @mobinranjbar
 * www.hadoop.ir
 */
package farafekr.blockchaindemo;

import java.util.Arrays;

public class Block {

    private int previousHash; // مقدار هش قبلی در بلاک
    private String[] transactions; // لیست تراکنش هایی که به عنوان داده در بلاک ذخیره می شوند

    private int blockHash; // هش بلاک جاری

    // در زیر تابع سازنده بلاک با مقدار دهی متغیرها فراخوانی می شود
    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash; // مقداردهی هنگام تعریف متغیر هش قبلی
        this.transactions = transactions; // مقداردهی هنگام تعریف تراکنش ها

        Object[] contens = {Arrays.hashCode(transactions), previousHash}; // هر بلاک از هش داده و هش بلاک قبلی تحت آرایه ای از اشیاء تعریف می شود
        this.blockHash = Arrays.hashCode(contens); // در نهایت هش بلاک جاری محاسبه می شود
       

    }

    public int getPreviousHash() { // تابع Getter هش قبلی
        return previousHash;
    }

    public String[] getTransaction() { // تابع Getter لیست تراکنش ها
        return transactions;
    }

    public int getBlockHash() { // تابع Getter هش بلاک جاری
        return blockHash;
    }
}
