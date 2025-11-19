package Task1;

public class PredictionCommand implements Command{
    //Varibles / Encapsulation
    PredictionModel2 Model;
    HurricanePredictionTemplate cur;
    //Constructor to encapsulate and intialize
    public PredictionCommand(PredictionModel2 cur2, HurricanePredictionTemplate Cur){
        cur = Cur;
        Model = cur2;
    }

    @Override
    public void Execute() {
        System.out.println("Running Prediction:");
        cur.applyPredictionModel();

    }

}
