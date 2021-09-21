package java2blog;

// Implementing a Binary Tree
public class PaypalTest2 {
	
	private String word; 
	
	public void addWord(String word) {
		this.word = word;
	}
	
	public boolean checkExist(String word) {
		return this.word.equals(word);
	}
	
	/* 
	 * https://www.baeldung.com/java-binary-tree
	 * Ele queria algum algoritmo com trenode,
	 * Mostrou uma imagem de BinaryTree.
	 */
	public static void main(String[] args) {
		String value = "";
		PaypalTest2 test = new PaypalTest2();
		test.addWord("value");
		test.checkExist(null);
		
		
	}
}
