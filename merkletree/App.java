import java.util.ArrayList;
import java.util.List;

public class App {
	  public static void main(String [] args) {
	    List<String> tempTxList = new ArrayList<String>();
	    tempTxList.add("f");
	    tempTxList.add("g");
	    tempTxList.add("h");
	    tempTxList.add("i");
	    tempTxList.add("j");
	    
	    MerkleTrees merkleTrees = new MerkleTrees(tempTxList);
	    merkleTrees.merkle_tree();
	    System.out.println("root : " + merkleTrees.getRoot());
	  }
}