public class Main {
    public static void main(String[] args) {
        chart pieChart = new chart();
        pieChart.addChart(new subject(5, "IPA"));
        System.out.println(pieChart);
    }
}