import java.util.Arrays;
/**
 * John Schwab 7/1/24
 */
public class Block {
    private int previousHash;
    private String[] transactionList;
    private int blockHash;

   public Block(int previousHash, String[] transactionList) {
       this.previousHash = previousHash;
       this.transactionList = transactionList;
       
       Object[] contents = {Arrays.hashCode(transactionList), previousHash};
       this.blockHash = Arrays.hashCode(contents);
   }
   
   public int getPreviousHash() {
       return previousHash;
   }
   public String[] getTransaction() {
       return transactionList;
   }
   public int getBlockHash() {
       return blockHash;
   }
}
