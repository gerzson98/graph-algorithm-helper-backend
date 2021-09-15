package elte.algo.two.backend.graphs.domain.general;

import lombok.Data;

import java.util.UUID;

@Data
public class Line<T> {
	private final UUID id;
	private Point<T> sourcePoint;
	private Point<T> targetPoint;

	Line() {
		this.id = UUID.randomUUID();
	}
}
