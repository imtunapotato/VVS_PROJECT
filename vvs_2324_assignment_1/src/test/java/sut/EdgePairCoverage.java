package sut;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EdgePairCoverage {

	@Test
	public void testOneTwo(){
		ArrayNTree<Integer> tree1 = new ArrayNTree<>(2);
		ArrayNTree<Integer> tree2 = tree1;
		assertTrue(tree1.equals(tree2));
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void TestOneThreeFour() {
		ArrayNTree<Integer> tree1 = new ArrayNTree<>(2);
		int n = 2;
		assertFalse(tree1.equals(n));
	}
	@Test
	public void TestOneThreeFiveSix() {
		ArrayNTree<Integer> tree1 = new ArrayNTree<>(1,2);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(1,2);
		assertTrue(tree1.equals(tree2));
	}
	@Test
	public void TestOneThreeFiveSeven() {
		ArrayNTree<Integer> tree1 = new ArrayNTree<>(1,2);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(2,2);
		assertFalse(tree1.equals(tree2));
	}
}
