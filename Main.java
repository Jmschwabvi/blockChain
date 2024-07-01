import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
/**
 * John Schwab 7/1/24
 */
public class Main {
    
    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) {
        String[] genesisTransactions = {"Bob sent John 6 coin", "Tommy sent Tim 14 coin"};
        Block genesisBlock = new Block(0, genesisTransactions);
        
        String[] secondTransactions = {"Bob sent Tom 8 coin", "Jeff sent John 2 coin"};
        Block block2 = new Block(genesisBlock.getBlockHash(), secondTransactions);
        
        String[] thirdTransactions = {"Tom sent Bob 2 coin", "Jeff sent Bob 6 coin"};
        Block block3 = new Block(block2.getBlockHash(), thirdTransactions);
        
        System.out.println("Hash of genesis block: ");
        System.out.println(genesisBlock.getBlockHash());
        
        System.out.println("Hash of block 2: ");
        System.out.println(block2.getBlockHash());
        
        System.out.println("Hash of block 3: ");
        System.out.println(block3.getBlockHash());
    }

}
