package edu.isu.cs2263.hom4;

import java.util.HashSet;

public class GraphImplm implements Visitor {
    private HashSet<User> nodes;

    public GraphImplm() {
        nodes = new HashSet<>();
    }

    public boolean AddEdge(User v1, User v2, String relnName) {
        return v2.getRelnList().add(new Relationship(v1, relnName));
    }

    public void AddUser(User v) {
        nodes.add(v);
    }

    public void printGraph() {
        for (User v : nodes) {
            for (Relationship e : v.getRelnList()) {
                System.out.print(v.getName());
                System.out.print("------" + e.getRelnName()+"------"+e.getDestVertex().getName()  );
            }
            System.out.print("\n");
        }
    }

    public void Count(){
        int married=0;
        int follower=0;
        int noRelationship=0;
        for (User v : nodes) {
            for (Relationship e : v.getRelnList()) {
                boolean isMarried=(e.getRelnName()=="Married");
                boolean isFollower=(e.getRelnName()=="Follower");
                if (isMarried){
                    married++;
                }
                else if (isFollower){
                    follower++;
                }
                else
                    System.out.println("Only type: 'Follower','Married' in the relationship");



                //System.out.print(v.getName());
                // System.out.print("------" + e.getRelnName()+"------"+e.getDestVertex().getName()  );
                // return counter;
            }


        }
        System.out.println(" \n Relatioships       Count \n");
        System.out.println("Married Relatioships:   "+married+" \n"+"Follower Relatioships   "+ follower) ;

    }


    @Override
    public void visit(Married married) {
        printGraph();
        Count();
    }

    @Override
    public void visit(Follower follower) {
        printGraph();
        Count();
    }

}
