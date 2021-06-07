package javashowcase;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	void given_3Numbers_When_Added_ToBinaryTree_ShoudReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(2, size);
	}
}
