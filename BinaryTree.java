package binaryTree;

public class BinaryTree {
	
private TreeNode root;//instance variable
	
	//in order to represent a TreeNode we create TreeNode class
	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data; // Can be any generic type
		
		public TreeNode(int data) {
			this.data = data;
		}
		
	public void createBinaryTree() {
		TreeNode first = new TreeNode(56);
		TreeNode second = new TreeNode(30);
		TreeNode third = new TreeNode(70);
		
		root = first;//root ---> first
		first.left = second;
		first.right = third;//second ---> first ---> third
		}
	}
}