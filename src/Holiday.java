public class Holiday {
    private String date;
    private String description;

    Holiday(){
    }

    Holiday(String date, String description){
        this.date = date;
        this.description = description;    
    }

    String getDate(){
        return date;
    }

    String getDesciption(){
        return description;
    }
}