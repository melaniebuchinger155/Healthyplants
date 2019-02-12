package buchinger.melanie.healthyplants;


import android.content.Context;
import android.content.Intent;

public class Person extends Intent {
    private String name;
    private String giessintervall;
    private String familie;
    private String imgURL;


    public Person(String  name, String giessintervall, String familie, String imgURL) {
        this.giessintervall = giessintervall;
        this.name = name;
        this.familie = familie;
        this.imgURL=imgURL;

    }


















    public String getImgURL() {return imgURL;
    }
    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }



    public String getgiessintervall() { return giessintervall; }
    public void setgiessintervall(String giessintervall) {
        this.giessintervall = giessintervall;
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public String getfamilie() {
        return familie;
    }
    public void setfamilie(String familie) {
        this.familie = familie;
    }


}
