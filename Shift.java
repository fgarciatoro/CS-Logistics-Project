import java.util.ArrayList;
public class Shift { // will define the number of shifts in the main method when I call it
  Member med10;
  Member med12;
  Member med13;
  static ArrayList<Member> allMembers;
  public Member findMember(int memRank) {
    for(int i = 0; i < allMembers.size(); i++);
      if(allMembers.get(i).numShifts < 4 && allMembers.get(i).availability.get(shiftNum) == 2 && allMembers.get(i).rank == memRank) {
        Member toReturn = allMembers.get(i);
        allMembers.get(i).plusShifts();
        break;
      }
    }
    return toReturn;
  }
public void defineMembers(){
  Member newMember;
  for(int j = 0; j < FileReader.size(); j++) {
     ArrayList<String> eachMember = FileReader.get(j);
     String newName = eachMember.get(0);
    String newRank = eachMember.get(1);
    eachMember = eachMember.remove(0);
    eachMember = eachMember.remove(0);
     newMember = new Member(newName, newRank, eachMember);
    allMembers.add(newMember);
    }
}
  public Member find10() {
    return findMember(10);
  }
  public Member find12() {
    return findMember(12);
  }
  public Member find13() {
    return findMember(13);
  }
  public Shift() {
    med10 = find10();
    med12 = find12();
    med13 = find13();
  }
