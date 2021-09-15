package elte.algo.two.backend.graphs.domain.huffmann;

import elte.algo.two.backend.graphs.domain.general.Leaf;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class HuffmannLeaf extends Leaf<Integer> {
	private final Character codedValue;
}
