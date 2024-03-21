// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CombineAuthorizationLetterRequest} extends {@link RequestModel}
 *
 * <p>CombineAuthorizationLetterRequest</p>
 */
public class CombineAuthorizationLetterRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("ApplicantType")
    private String applicantType;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("ContactPhone")
    private String contactPhone;

    @Query
    @NameInMap("ContactPostcode")
    private String contactPostcode;

    @Query
    @NameInMap("MaterialId")
    private String materialId;

    @Query
    @NameInMap("MaterialName")
    private String materialName;

    @Query
    @NameInMap("Nationality")
    private String nationality;

    @Query
    @NameInMap("PersonalType")
    private String personalType;

    @Query
    @NameInMap("PrincipalName")
    private Integer principalName;

    @Query
    @NameInMap("TmProduceType")
    private String tmProduceType;

    @Query
    @NameInMap("TrademarkName")
    private String trademarkName;

    private CombineAuthorizationLetterRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.applicantType = builder.applicantType;
        this.contactName = builder.contactName;
        this.contactPhone = builder.contactPhone;
        this.contactPostcode = builder.contactPostcode;
        this.materialId = builder.materialId;
        this.materialName = builder.materialName;
        this.nationality = builder.nationality;
        this.personalType = builder.personalType;
        this.principalName = builder.principalName;
        this.tmProduceType = builder.tmProduceType;
        this.trademarkName = builder.trademarkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CombineAuthorizationLetterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return applicantType
     */
    public String getApplicantType() {
        return this.applicantType;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return contactPhone
     */
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * @return contactPostcode
     */
    public String getContactPostcode() {
        return this.contactPostcode;
    }

    /**
     * @return materialId
     */
    public String getMaterialId() {
        return this.materialId;
    }

    /**
     * @return materialName
     */
    public String getMaterialName() {
        return this.materialName;
    }

    /**
     * @return nationality
     */
    public String getNationality() {
        return this.nationality;
    }

    /**
     * @return personalType
     */
    public String getPersonalType() {
        return this.personalType;
    }

    /**
     * @return principalName
     */
    public Integer getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return tmProduceType
     */
    public String getTmProduceType() {
        return this.tmProduceType;
    }

    /**
     * @return trademarkName
     */
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public static final class Builder extends Request.Builder<CombineAuthorizationLetterRequest, Builder> {
        private String address; 
        private String applicantType; 
        private String contactName; 
        private String contactPhone; 
        private String contactPostcode; 
        private String materialId; 
        private String materialName; 
        private String nationality; 
        private String personalType; 
        private Integer principalName; 
        private String tmProduceType; 
        private String trademarkName; 

        private Builder() {
            super();
        } 

        private Builder(CombineAuthorizationLetterRequest request) {
            super(request);
            this.address = request.address;
            this.applicantType = request.applicantType;
            this.contactName = request.contactName;
            this.contactPhone = request.contactPhone;
            this.contactPostcode = request.contactPostcode;
            this.materialId = request.materialId;
            this.materialName = request.materialName;
            this.nationality = request.nationality;
            this.personalType = request.personalType;
            this.principalName = request.principalName;
            this.tmProduceType = request.tmProduceType;
            this.trademarkName = request.trademarkName;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * ApplicantType.
         */
        public Builder applicantType(String applicantType) {
            this.putQueryParameter("ApplicantType", applicantType);
            this.applicantType = applicantType;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * ContactPhone.
         */
        public Builder contactPhone(String contactPhone) {
            this.putQueryParameter("ContactPhone", contactPhone);
            this.contactPhone = contactPhone;
            return this;
        }

        /**
         * ContactPostcode.
         */
        public Builder contactPostcode(String contactPostcode) {
            this.putQueryParameter("ContactPostcode", contactPostcode);
            this.contactPostcode = contactPostcode;
            return this;
        }

        /**
         * MaterialId.
         */
        public Builder materialId(String materialId) {
            this.putQueryParameter("MaterialId", materialId);
            this.materialId = materialId;
            return this;
        }

        /**
         * MaterialName.
         */
        public Builder materialName(String materialName) {
            this.putQueryParameter("MaterialName", materialName);
            this.materialName = materialName;
            return this;
        }

        /**
         * Nationality.
         */
        public Builder nationality(String nationality) {
            this.putQueryParameter("Nationality", nationality);
            this.nationality = nationality;
            return this;
        }

        /**
         * PersonalType.
         */
        public Builder personalType(String personalType) {
            this.putQueryParameter("PersonalType", personalType);
            this.personalType = personalType;
            return this;
        }

        /**
         * PrincipalName.
         */
        public Builder principalName(Integer principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * TmProduceType.
         */
        public Builder tmProduceType(String tmProduceType) {
            this.putQueryParameter("TmProduceType", tmProduceType);
            this.tmProduceType = tmProduceType;
            return this;
        }

        /**
         * TrademarkName.
         */
        public Builder trademarkName(String trademarkName) {
            this.putQueryParameter("TrademarkName", trademarkName);
            this.trademarkName = trademarkName;
            return this;
        }

        @Override
        public CombineAuthorizationLetterRequest build() {
            return new CombineAuthorizationLetterRequest(this);
        } 

    } 

}
