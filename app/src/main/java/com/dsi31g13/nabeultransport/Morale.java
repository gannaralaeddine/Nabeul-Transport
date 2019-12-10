package com.dsi31g13.nabeultransport;

public class Morale
{
    private String mSociale;
    private String mIdFiscale;  //int
    private String mAccompagnant;
    private String mCinMorale;  //int
    private String mTypeBus;
    private String mNombreVoyageurs;   //int
    private String mCauseLocation;
    private String mProgVoyage;
    private String mDateDepart;   //Date
    private String mHeureDepart;   //int
    private String mLieuDepart;
    private String mDateArrivee;  //Date
    private String mHeureArrivee;  //int

    public Morale() {}

    public Morale(String mSociale, String mIdFiscale, String mAccompagnant, String mCinMorale, String mTypeBus, String mNombreVoyageurs, String mCauseLocation, String mProgVoyage, String mDateDepart, String mHeureDepart, String mLieuDepart, String mDateArrivee, String mHeureArrivee)
    {
        this.mSociale = mSociale;
        this.mIdFiscale = mIdFiscale;
        this.mAccompagnant = mAccompagnant;
        this.mCinMorale = mCinMorale;
        this.mTypeBus = mTypeBus;
        this.mNombreVoyageurs = mNombreVoyageurs;
        this.mCauseLocation = mCauseLocation;
        this.mProgVoyage = mProgVoyage;
        this.mDateDepart = mDateDepart;
        this.mHeureDepart = mHeureDepart;
        this.mLieuDepart = mLieuDepart;
        this.mDateArrivee = mDateArrivee;
        this.mHeureArrivee = mHeureArrivee;
    }

    public String getmSociale() {
        return mSociale;
    }

    public void setmSociale(String mSociale) {
        this.mSociale = mSociale;
    }

    public String getmIdFiscale() {
        return mIdFiscale;
    }

    public void setmIdFiscale(String mIdFiscale) {
        this.mIdFiscale = mIdFiscale;
    }

    public String getmAccompagnant() {
        return mAccompagnant;
    }

    public void setmAccompagnant(String mAccompagnant) {
        this.mAccompagnant = mAccompagnant;
    }

    public String getmCinMorale() {
        return mCinMorale;
    }

    public void setmCinMorale(String mCinMorale) {
        this.mCinMorale = mCinMorale;
    }

    public String getmTypeBus() {
        return mTypeBus;
    }

    public void setmTypeBus(String mTypeBus) {
        this.mTypeBus = mTypeBus;
    }

    public String getmNombreVoyageurs() {
        return mNombreVoyageurs;
    }

    public void setmNombreVoyageurs(String mNombreVoyageurs) {
        this.mNombreVoyageurs = mNombreVoyageurs;
    }

    public String getmCauseLocation() {
        return mCauseLocation;
    }

    public void setmCauseLocation(String mCauseLocation) {
        this.mCauseLocation = mCauseLocation;
    }

    public String getmProgVoyage() {
        return mProgVoyage;
    }

    public void setmProgVoyage(String mProgVoyage) {
        this.mProgVoyage = mProgVoyage;
    }

    public String getmDateDepart() {
        return mDateDepart;
    }

    public void setmDateDepart(String mDateDepart) {
        this.mDateDepart = mDateDepart;
    }

    public String getmHeureDepart() {
        return mHeureDepart;
    }

    public void setmHeureDepart(String mHeureDepart) {
        this.mHeureDepart = mHeureDepart;
    }

    public String getmLieuDepart() {
        return mLieuDepart;
    }

    public void setmLieuDepart(String mLieuDepart) {
        this.mLieuDepart = mLieuDepart;
    }

    public String getmDateArrivee() {
        return mDateArrivee;
    }

    public void setmDateArrivee(String mDateArrivee) {
        this.mDateArrivee = mDateArrivee;
    }

    public String getmHeureArrivee() {
        return mHeureArrivee;
    }

    public void setmHeureArrivee(String mHeureArrivee) {
        this.mHeureArrivee = mHeureArrivee;
    }
}
