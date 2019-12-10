package com.dsi31g13.nabeultransport;

public class Physique
{
    private String mCinPhysique;
    private String mNom;
    private String mPrenom;
    private String mAdresse;

    public Physique() {}

    public Physique(String mAdresse , String mCinPhysique, String mNom, String mPrenom )
    {
        this.mAdresse = mAdresse;
        this.mCinPhysique = mCinPhysique;
        this.mNom = mNom;
        this.mPrenom = mPrenom;
    }

    public String getmCinPhysique() {
        return mCinPhysique;
    }

    public void setmCinPhysique(String mCinPhysique) {
        this.mCinPhysique = mCinPhysique;
    }

    public String getmNom() {
        return mNom;
    }

    public void setmNom(String mNom) {
        this.mNom = mNom;
    }

    public String getmPrenom() {
        return mPrenom;
    }

    public void setmPrenom(String mPrenom) {
        this.mPrenom = mPrenom;
    }

    public String getmAdresse() {
        return mAdresse;
    }

    public void setmAdresse(String mAdresse) {
        this.mAdresse = mAdresse;
    }
}
