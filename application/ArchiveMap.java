package application;
import geography.GeographicPoint;
import roadgraph.*;

public final class ArchiveMap {
	
	private GeographicPoint start;
	private GeographicPoint end;
	private MapGraph graph;
	private String map;

	public ArchiveMap(GeographicPoint start,GeographicPoint end, MapGraph graph, char searchMethod, String map ){
		this.start = start;
		this.end = end;
		this.map = map;
		this.graph = graph;
		if(Character.toLowerCase(searchMethod) == 'a'){
			graph.aStarSearch(start, end);
		}
		else if (Character.toLowerCase(searchMethod) == 'd'){
			graph.dijkstra(start, end);
		}
		else if (Character.toLowerCase(searchMethod) == 'b'){
			graph.bfs(start, end);
		}
	}
	
	@Override
	public String toString(){
		return "Map "+map+" archived";
	}
}
