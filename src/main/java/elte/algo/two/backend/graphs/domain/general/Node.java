package elte.algo.two.backend.graphs.domain.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Node<T> extends Leaf<T> {
	private Line leftChildLine;
	private Line rightChildLine;
}
