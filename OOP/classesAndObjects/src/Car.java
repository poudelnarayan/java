public class Car {
    private int doors;
    private int wheels;
    private String models;
    private String engine;
    private String color;
    public void setModels(String models) {
        String validModel = models.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("comoddoro")){
            this.models = models;
        } else {
            this.models = "Unknown";
        }
    }

    public String getModels() {
        return  this.models;
    }
}
