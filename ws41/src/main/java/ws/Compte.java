package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.lang.reflect.Field;
import java.util.Date;


@XmlRootElement(name = "compte")//quand je le convertir a XML il vas me donner un elements xml qui s appele compte
@XmlAccessorType(XmlAccessType.FIELD) //tu dis a jaxbi de le mettre sur les champs et ne pas sur les getters
public class Compte {


            private int code;
            private double solde;
            @XmlTransient //Dans c est une annotation de jaxbi-- Quands tu convertis cet objet en xml ignore cet attribut
            private Date dateCreation;

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }


}
