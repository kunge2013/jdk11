package collections;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KCollections {
	public static void main(String[] args) {
	}
	
	/**
	 * 	不可变List集合
	 * @param objects
	 * @return
	 */
	public static <E> List<E> unmodifyList(E... objects) {
		return List.of(objects);
	}
	
	/**
	 * 	不可变SET集合
	 * @param objects
	 * @return
	 */
	public static <E> Set<E> unmodifySet(E... objects) {
		return Set.of(objects);
	}
	
	/**
	 * 	不可变集合
	 * @param objects
	 * @return
	 */
	public static <K,V> Map<K,V> unmodifyMap(Entry<? extends K, ? extends V>... objects) {
		return Map.ofEntries(objects);
	}
}
