package elte.algo.two.backend.graphs.domain.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leaf<T> extends Point<T> {
	private Line parentLine;
}
