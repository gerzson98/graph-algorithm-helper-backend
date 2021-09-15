package elte.algo.two.backend.graphs.domain.general;

import lombok.Data;
import reactor.util.annotation.Nullable;

import java.util.UUID;

@Data
public class Point<T> {
	private final UUID id;

	@Nullable
	private Line<T> parentLine;
	private T key;

	Point() {
		this.id = UUID.randomUUID();
	}

	Point (T key) {
		this.key = key;
		this.id = UUID.randomUUID();
	}
}
