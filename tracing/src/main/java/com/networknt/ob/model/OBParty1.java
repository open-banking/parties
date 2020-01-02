package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBParty1  {

    private String PartyNumber;
    private String PartyId;
    private java.util.List<OBPostalAddress8> Address;
    private String Phone;
    private String Mobile;
    private OBExternalPartyType1Code PartyType;
    private String EmailAddress;
    private String Name;

    public OBParty1 () {
    }

    @JsonProperty("PartyNumber")
    public String getPartyNumber() {
        return PartyNumber;
    }

    public void setPartyNumber(String PartyNumber) {
        this.PartyNumber = PartyNumber;
    }

    @JsonProperty("PartyId")
    public String getPartyId() {
        return PartyId;
    }

    public void setPartyId(String PartyId) {
        this.PartyId = PartyId;
    }

    @JsonProperty("Address")
    public java.util.List<OBPostalAddress8> getAddress() {
        return Address;
    }

    public void setAddress(java.util.List<OBPostalAddress8> Address) {
        this.Address = Address;
    }

    @JsonProperty("Phone")
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @JsonProperty("Mobile")
    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    @JsonProperty("PartyType")
    public OBExternalPartyType1Code getPartyType() {
        return PartyType;
    }

    public void setPartyType(OBExternalPartyType1Code PartyType) {
        this.PartyType = PartyType;
    }

    @JsonProperty("EmailAddress")
    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    @JsonProperty("Name")
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBParty1 OBParty1 = (OBParty1) o;

        return Objects.equals(PartyNumber, OBParty1.PartyNumber) &&
               Objects.equals(PartyId, OBParty1.PartyId) &&
               Objects.equals(Address, OBParty1.Address) &&
               Objects.equals(Phone, OBParty1.Phone) &&
               Objects.equals(Mobile, OBParty1.Mobile) &&
               Objects.equals(PartyType, OBParty1.PartyType) &&
               Objects.equals(EmailAddress, OBParty1.EmailAddress) &&
               Objects.equals(Name, OBParty1.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PartyNumber, PartyId, Address, Phone, Mobile, PartyType, EmailAddress, Name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBParty1 {\n");
        sb.append("    PartyNumber: ").append(toIndentedString(PartyNumber)).append("\n");        sb.append("    PartyId: ").append(toIndentedString(PartyId)).append("\n");        sb.append("    Address: ").append(toIndentedString(Address)).append("\n");        sb.append("    Phone: ").append(toIndentedString(Phone)).append("\n");        sb.append("    Mobile: ").append(toIndentedString(Mobile)).append("\n");        sb.append("    PartyType: ").append(toIndentedString(PartyType)).append("\n");        sb.append("    EmailAddress: ").append(toIndentedString(EmailAddress)).append("\n");        sb.append("    Name: ").append(toIndentedString(Name)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
