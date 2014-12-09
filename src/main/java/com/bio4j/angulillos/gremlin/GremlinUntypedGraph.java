package com.bio4j.angulillos.gremlin;

import com.bio4j.angulillos.UntypedGraph;

import com.tinkerpop.gremlin.structure.Vertex;
import com.tinkerpop.gremlin.structure.Edge;
import com.tinkerpop.gremlin.structure.Graph;
import static com.tinkerpop.gremlin.structure.Direction.*;

public interface GremlinUntypedGraph extends UntypedGraph<Vertex,String, Edge,String> {

  Graph gremlinGraph();

  @Override
  default Edge addEdge(Vertex from, String edgeType, Vertex to) {

    return from.addEdge( edgeType, to);
  }

  @Override
  default Vertex addVertex(String type) {

    return gremlinGraph().addVertex(type);
  }

  /*
  ### property methods
  */

  @Override
  default <V> V getPropertyV(Vertex vertex, String property) {

    return vertex.value(property);
  }

  @Override
  default <V> void setPropertyV(Vertex vertex, String property, V value) {

    vertex.property(property, value);
  }

  @Override
  default <V> V getPropertyE(Edge edge, String property) {

    return edge.value(property);
  }

  @Override
  default <V> void setPropertyE(Edge edge, String property, V value) {

    edge.property(property, value);
  }


  /*
  ### source and target
  */

  @Override
  default Vertex source(Edge edge) {

    return edge.iterators().vertexIterator(OUT).next();
  }

  @Override
  default Vertex target(Edge edge) {

    return edge.iterators().vertexIterator(IN).next();
  }
}