/**
 * Created by edreichua on 3/2/16.
 */
public class PageRankDriver {

    // filename
    private static final String DartmouthCSClasses = "C:/Users/leons/Desktop/PageRank-master/PageRank-master/dartcsclass.txt";
    private static final String Simple = "C:/Users/leons/Desktop/PageRank-master/PageRank-master/simple.txt";
    private static final String Medium = "C:/Users/leons/Desktop/PageRank-master/PageRank-master/medium.txt";
    private static final String Physics = "C:/Users/leons/Desktop/PageRank-master/PageRank-master/physcitation.txt";

    // boolean flags
    private static final boolean isDangling = true;
    private static final boolean isJump = true;
    private static final boolean isSorted = true;

    public static void main(String[] args){

        PageRank p = new PageRank(DartmouthCSClasses, isDangling, isJump);

        if(isSorted)
            p.printSortedResults();
        else
            p.printResults();
    }

}
