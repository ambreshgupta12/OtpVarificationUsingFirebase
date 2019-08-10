package www.mombatti.moviemvvdemonetwork.database.entity;

import com.google.gson.annotations.SerializedName;

public class ResultEntity {

@SerializedName("gender")
    private String gender;

    @SerializedName("name")
    private NameEntity nameEntity;

    @SerializedName("location")
    private LocationEntity locationEntity;


    @SerializedName("login")
    private LoginEntity loginEntity;



    @SerializedName("dob")
    private DobEntity dobEntity;



    @SerializedName("registered")
    private RegisteredEntity registeredEntity;




    @SerializedName("phone")
    private String phone;

    @SerializedName("cell")
    private String cell;



    @SerializedName("id")
    private IdEntity idEntity;


    @SerializedName("picture")
    private PictureEntity pictureEntity;

    @SerializedName("nat")
    private String nat;


    public ResultEntity(String gender, NameEntity nameEntity, LocationEntity locationEntity, LoginEntity loginEntity, DobEntity dobEntity,
                        RegisteredEntity registeredEntity, String phone, String cell, IdEntity idEntity, PictureEntity pictureEntity, String nat) {
        this.gender = gender;
        this.nameEntity = nameEntity;
        this.locationEntity = locationEntity;
        this.loginEntity = loginEntity;
        this.dobEntity = dobEntity;
        this.registeredEntity = registeredEntity;
        this.phone = phone;
        this.cell = cell;
        this.idEntity = idEntity;
        this.pictureEntity = pictureEntity;
        this.nat = nat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public NameEntity getNameEntity() {
        return nameEntity;
    }

    public void setNameEntity(NameEntity nameEntity) {
        this.nameEntity = nameEntity;
    }

    public LocationEntity getLocationEntity() {
        return locationEntity;
    }

    public void setLocationEntity(LocationEntity locationEntity) {
        this.locationEntity = locationEntity;
    }

    public LoginEntity getLoginEntity() {
        return loginEntity;
    }

    public void setLoginEntity(LoginEntity loginEntity) {
        this.loginEntity = loginEntity;
    }

    public DobEntity getDobEntity() {
        return dobEntity;
    }

    public void setDobEntity(DobEntity dobEntity) {
        this.dobEntity = dobEntity;
    }

    public RegisteredEntity getRegisteredEntity() {
        return registeredEntity;
    }

    public void setRegisteredEntity(RegisteredEntity registeredEntity) {
        this.registeredEntity = registeredEntity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public IdEntity getIdEntity() {
        return idEntity;
    }

    public void setIdEntity(IdEntity idEntity) {
        this.idEntity = idEntity;
    }

    public PictureEntity getPictureEntity() {
        return pictureEntity;
    }

    public void setPictureEntity(PictureEntity pictureEntity) {
        this.pictureEntity = pictureEntity;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }
}
