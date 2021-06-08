package binaryTree;

import java.util.Stack;

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
	}	
		public void inOrder(TreeNode root) {
			if(root == null) {
				return;
			}

			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}

		public void inOrder() {
			if(root == null) {
				return;
			}

			Stack<TreeNode> stack = new Stack<>();
			TreeNode temp = root;

			while(!stack.isEmpty() || temp != null) {
				if(temp != null) {
					stack.push(temp);
					temp = temp.left;
				} else {
					temp = stack.pop();
					System.out.print(temp.data + " ");
					temp = temp.right;
				}
			}
		}	
		
	public void createBinaryTree() {
		TreeNode first = new TreeNode(56);
		TreeNode second = new TreeNode(30);
		TreeNode third = new TreeNode(70);
		TreeNode fourth = new TreeNode(22);
		TreeNode fifth = new TreeNode(40);
		TreeNode sixth = new TreeNode(60);
		TreeNode seventh = new TreeNode(95);
		TreeNode eight = new TreeNode(11);
		TreeNode nine = new TreeNode(65);
		TreeNode ten = new TreeNode(3);
		TreeNode eleven = new TreeNode(16);
		TreeNode twelve = new TreeNode(63);
		TreeNode thirteen = new TreeNode(67);
		
		root = first;//root ---> first
		first.left = second;
		first.right = third;//second ---> first ---> third
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		fourth.left = eight;
		fourth.right = null;
		fifth.left = null;
		fifth.right = null;
		sixth.left = null;
		sixth.right = nine;
		seventh.left = null;
		seventh.right = null;
		eight.left = ten;
		eight.right = eleven;
		nine.left = twelve;
		nine.right = thirteen;
	}	
		
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		bt.inOrder();
		
	}
}