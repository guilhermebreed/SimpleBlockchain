import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
        Hash = digital signature

        Each block will have:

            List of transactions
            Previous hash
            Hash
     */

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        String[] genesisTransactions = {"Satoshi sent me 10 bitcoins", "Somebody sent me 10 bitcoins"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2transactions = {"Send 10 bitcoin for claus", "Buy a car with bitcoin"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2transactions);

        String[] block3transactions = {"Send 100000 bitcoin for mother of god"};
        Block block3 = new Block(block2.getBlockHash(), block3transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());
        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());


    }
}

