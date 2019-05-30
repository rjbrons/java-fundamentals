package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tally {

    public String tally(ArrayList<String> votes){
        HashMap<String, Integer> voteMap = new HashMap<>();
        int highest = 0;
        String topVote = "";
        for (String vote : votes){
            if (voteMap.containsKey(vote)){
               voteMap.put(vote, voteMap.get(vote) + 1);
            } else {
                voteMap.put(vote, 1);
            }
            if (voteMap.get(vote) > highest){
                highest = voteMap.get(vote);
                topVote = vote;
            }
        }
        return topVote;
    }
}
