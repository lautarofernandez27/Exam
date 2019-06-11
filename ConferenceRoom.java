import java.util.*;

public class ConferenceRoom{
    private ArrayList<Meeting> meetings;
    public boolean login ()
}

public class User {
    private Hashtable<String,String> users; //userName,password
    public boolean login(String userName, String password){
        if (users.containsKey(userName))
            return this.users.get(userName) == password;
        return false;
    }
}

public class Meeting {
    private User organizer;
    private Date startTime;
    private Date finishTime;
    private ArrayList<User> participants;
    static final Date threeHours= "03:00:00";
    static final Date fifteenMinutes= "00:15:00";
    public int updateTime (User user,Date startTime,Date finishTime){
        if (user == this.organizer){
            if(finishTime.getTime() - startTime.getTime() < this.threeHours) && (finishTime.getTime() - startTime.getTime() > this.fifteenMinutes){
                this.startTime=startTime;
                this.finishTime=finishTime;
                return 1;
            }
        }
        return -1;//Something went wrong
    }
    public int deleteParticipant(User user, User user, User participantDeleted){
        if(user == this.organizer) && (this.participants.indexOf(participantDeleted) != -1){
            this.participants.remove(participantDeleted);
            return 1;
        }
        return -1; //Something went wrong
    }
    public int addParticipant(User user, User user, User participantAdded){
        if(user == this.organizer) && (this.participants.indexOf(participantDeleted) == -1){
            this.participants.add(participantAdded);
        }
        return -1;//Something went wrong
    }
    public Meeting(User organizer, Date startTime, Date finishTime,ArrayList<User> participants){
        if(finishTime.getTime() - startTime.getTime() < this.threeHours) && (finishTime.getTime() - startTime.getTime() > this.fifteenMinutes){
            this.startTime=startTime;
            this.finishTime=finishTime;
        }
        this.organizer=organizer;
    }
}