package elte.algo.two.backend.graphs.domain.huffmann;

import elte.algo.two.backend.graphs.domain.general.Line;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class HuffmannLine<T> extends Line<T> {
	private final int flag;
}
