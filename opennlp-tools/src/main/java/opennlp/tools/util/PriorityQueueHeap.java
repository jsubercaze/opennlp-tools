package opennlp.tools.util;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueHeap<E> implements Heap<E> {

	PriorityQueue<E> queue;

	public PriorityQueueHeap() {
		queue = new PriorityQueue<>();
	}

	public PriorityQueueHeap(int size) {
		queue = new PriorityQueue<>(size);
	}

	@Override
	public E extract() {
		return queue.poll();
	}

	@Override
	public E first() {
		return queue.peek();
	}

	@Override
	public E last() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(E o) {
		queue.add(o);

	}

	@Override
	public int size() {
		return queue.size();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return queue.iterator();
	}

	@Override
	public void clear() {
		queue.clear();
	}

}
