public class chart extends subject {
    private subject subject;
    private double resume;


    public double addChart(subject subject21){
        this.subject = subject21;
        resume = subject21.getBeban()/ subject.getBeban()*100;
        return resume;
    }

}
