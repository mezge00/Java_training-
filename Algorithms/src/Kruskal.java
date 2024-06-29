/*
 * procedure kruskal(G, w)
Input:
A connected undirected graph G = (V, E) with edge weights w e
Output:
A minimum spanning tree defined by the edges X
for all u ∈ V :
makeset(u)
X = {}
Sort the edges E by weight
for all edges {u, v} ∈ E, in increasing order of weight:
if find(u) 6 = find(v):
add edge {u, v} to X
union(u, v)
 * */
public class Kruskal {

}
