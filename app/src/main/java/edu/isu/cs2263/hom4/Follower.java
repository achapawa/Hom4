package edu.isu.cs2263.hom4;

public class Follower extends Relationship {
    public Follower(User dest, String w) {
        super(dest, w);
    }
    @Override
    public void accept(Visitor visit) {

        visit.visit(this);
    }
}
