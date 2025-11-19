package Task1;

public abstract class HurricanePredictionTemplate {
    //abstract template
    void PredictHurricane(){
        this.fetchdata();
        this.preprocessData();
        this.applyPredictionModel();
        this.postprocessResults();
    }

    abstract void fetchdata();
    abstract void preprocessData();
    abstract void applyPredictionModel();
    abstract void postprocessResults();
}
