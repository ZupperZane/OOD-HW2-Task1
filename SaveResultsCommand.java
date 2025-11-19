package Task1;

public class SaveResultsCommand implements Command{
    //Varibles / Encapsulation
    ResultSaver cur;
    HurricanePredictionTemplate cur2;

    //Constructor to encapsulate and intialize
    public SaveResultsCommand(ResultSaver Cur,HurricanePredictionTemplate Cur2){
        cur2 = Cur2;
        cur = Cur;
    }

    @Override
    public void Execute() {
        System.out.println("Saving Results");
        cur.saveResults();
        cur2.postprocessResults();
    }
}
