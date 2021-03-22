package edu.isu.cs2263.hom4;

public class Test {
    public static void main(String[] args) {
        GraphImplm ourGraph = new GraphImplm();
        User subash=new User("Subash");
        User Rubi= new User("Rubi");
        User Dinesh=new User("Dinesh");
        User Tabitha=new User("Tabitha");
        Married m1=new Married(Tabitha,"Married");
        Follower F1=new Follower(Dinesh,"Follower");

        ourGraph.AddEdge(Dinesh,Tabitha,F1.getRelnName());
        ourGraph.AddEdge(subash,Rubi,"Married");
        ourGraph.AddEdge(Dinesh,subash,"Follower");
        ourGraph.AddUser(subash);
        ourGraph.AddUser(Rubi);
        ourGraph.AddUser(Dinesh);
        ourGraph.AddUser(Tabitha);


        m1.accept(ourGraph);
        F1.accept(ourGraph);



    }
}
