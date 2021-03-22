package edu.isu.cs2263.hom4;

public class Relationship implements Visitable {
    private String relnName;
    private User destVertex;

    public Relationship(User dest, String w) {
        this.destVertex = dest;
        this.relnName = w;
    }

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