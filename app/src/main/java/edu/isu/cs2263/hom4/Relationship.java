package edu.isu.cs2263.hom4;

public class Relationship implements Visitable {
    private String relnName;
    private User destVertex;

    public Relationship(User dest, String w) {
        this.destVertex = dest;
        this.relnName = w;
    }

    /* can use this approach for an unweighted graph
        or better remove variable weight altogether from Edge class */

    public String getRelnName() {
        return relnName;
    }

    public User getDestVertex() {
        return destVertex;
    }


    @Override
    public void accept(Visitor visit) {

    }
}