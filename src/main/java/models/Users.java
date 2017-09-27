package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Users {

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public String getUser_type() {
        return user_type;
    }

    public String getSquadron() {
        return squadron;
    }

    public int getPhone_num() {
        return phone_num;
    }

    public int getCell_num() {
        return cell_num;
    }

    public int getWork_num() {
        return work_num;
    }

    public int getCourse_num() {
        return course_num;
    }

    public String getHazah_job() {
        return hazah_job;
    }



    private String name;
    @Id
    private int id;
    private String mail;
    private String birth_date;
    private String address;
    private String status;
    private String user_type;
    private String squadron;
    private int phone_num;
    private int cell_num;
    private int work_num;
    private int course_num;
    private String hazah_job;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public void setSquadron(String squadron) {
        this.squadron = squadron;
    }

    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }

    public void setCell_num(int cell_num) {
        this.cell_num = cell_num;
    }

    public void setWork_num(int work_num) {
        this.work_num = work_num;
    }

    public void setCourse_num(int course_num) {
        this.course_num = course_num;
    }

    public void setHazah_job(String hazah_job) {
        this.hazah_job = hazah_job;
    }

    public Users(){
    }

    public Users(String name, int id, String mail, String birth_date, String address, String status, String user_type, String squadron, int phone_num, int cell_num, int work_num, int course_num, String hazah_job) {
        this.name = name;
        this.id = id;
        this.mail = mail;
        this.birth_date = birth_date;
        this.address = address;
        this.status = status;
        this.user_type = user_type;
        this.squadron = squadron;
        this.phone_num = phone_num;
        this.cell_num = cell_num;
        this.work_num = work_num;
        this.course_num = course_num;
        this.hazah_job = hazah_job;
    }
}
