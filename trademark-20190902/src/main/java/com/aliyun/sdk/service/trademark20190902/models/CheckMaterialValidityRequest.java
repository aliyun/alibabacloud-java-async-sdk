// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMaterialValidityRequest} extends {@link RequestModel}
 *
 * <p>CheckMaterialValidityRequest</p>
 */
public class CheckMaterialValidityRequest extends Request {
    @Query
    @NameInMap("BusinessLicenseOssKey")
    private String businessLicenseOssKey;

    @Query
    @NameInMap("CardNumber")
    private String cardNumber;

    @Query
    @NameInMap("IdCardName")
    private String idCardName;

    @Query
    @NameInMap("IdCardNumber")
    private String idCardNumber;

    @Query
    @NameInMap("IdCardOssKey")
    private String idCardOssKey;

    @Query
    @NameInMap("MaterialId")
    @Validation()
    private Long materialId;

    @Query
    @NameInMap("MaterialRegion")
    private Integer materialRegion;

    @Query
    @NameInMap("MaterialType")
    private Integer materialType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PersonalType")
    private Long personalType;

    private CheckMaterialValidityRequest(Builder builder) {
        super(builder);
        this.businessLicenseOssKey = builder.businessLicenseOssKey;
        this.cardNumber = builder.cardNumber;
        this.idCardName = builder.idCardName;
        this.idCardNumber = builder.idCardNumber;
        this.idCardOssKey = builder.idCardOssKey;
        this.materialId = builder.materialId;
        this.materialRegion = builder.materialRegion;
        this.materialType = builder.materialType;
        this.name = builder.name;
        this.personalType = builder.personalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMaterialValidityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessLicenseOssKey
     */
    public String getBusinessLicenseOssKey() {
        return this.businessLicenseOssKey;
    }

    /**
     * @return cardNumber
     */
    public String getCardNumber() {
        return this.cardNumber;
    }

    /**
     * @return idCardName
     */
    public String getIdCardName() {
        return this.idCardName;
    }

    /**
     * @return idCardNumber
     */
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    /**
     * @return idCardOssKey
     */
    public String getIdCardOssKey() {
        return this.idCardOssKey;
    }

    /**
     * @return materialId
     */
    public Long getMaterialId() {
        return this.materialId;
    }

    /**
     * @return materialRegion
     */
    public Integer getMaterialRegion() {
        return this.materialRegion;
    }

    /**
     * @return materialType
     */
    public Integer getMaterialType() {
        return this.materialType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return personalType
     */
    public Long getPersonalType() {
        return this.personalType;
    }

    public static final class Builder extends Request.Builder<CheckMaterialValidityRequest, Builder> {
        private String businessLicenseOssKey; 
        private String cardNumber; 
        private String idCardName; 
        private String idCardNumber; 
        private String idCardOssKey; 
        private Long materialId; 
        private Integer materialRegion; 
        private Integer materialType; 
        private String name; 
        private Long personalType; 

        private Builder() {
            super();
        } 

        private Builder(CheckMaterialValidityRequest request) {
            super(request);
            this.businessLicenseOssKey = request.businessLicenseOssKey;
            this.cardNumber = request.cardNumber;
            this.idCardName = request.idCardName;
            this.idCardNumber = request.idCardNumber;
            this.idCardOssKey = request.idCardOssKey;
            this.materialId = request.materialId;
            this.materialRegion = request.materialRegion;
            this.materialType = request.materialType;
            this.name = request.name;
            this.personalType = request.personalType;
        } 

        /**
         * BusinessLicenseOssKey.
         */
        public Builder businessLicenseOssKey(String businessLicenseOssKey) {
            this.putQueryParameter("BusinessLicenseOssKey", businessLicenseOssKey);
            this.businessLicenseOssKey = businessLicenseOssKey;
            return this;
        }

        /**
         * CardNumber.
         */
        public Builder cardNumber(String cardNumber) {
            this.putQueryParameter("CardNumber", cardNumber);
            this.cardNumber = cardNumber;
            return this;
        }

        /**
         * IdCardName.
         */
        public Builder idCardName(String idCardName) {
            this.putQueryParameter("IdCardName", idCardName);
            this.idCardName = idCardName;
            return this;
        }

        /**
         * IdCardNumber.
         */
        public Builder idCardNumber(String idCardNumber) {
            this.putQueryParameter("IdCardNumber", idCardNumber);
            this.idCardNumber = idCardNumber;
            return this;
        }

        /**
         * IdCardOssKey.
         */
        public Builder idCardOssKey(String idCardOssKey) {
            this.putQueryParameter("IdCardOssKey", idCardOssKey);
            this.idCardOssKey = idCardOssKey;
            return this;
        }

        /**
         * MaterialId.
         */
        public Builder materialId(Long materialId) {
            this.putQueryParameter("MaterialId", materialId);
            this.materialId = materialId;
            return this;
        }

        /**
         * MaterialRegion.
         */
        public Builder materialRegion(Integer materialRegion) {
            this.putQueryParameter("MaterialRegion", materialRegion);
            this.materialRegion = materialRegion;
            return this;
        }

        /**
         * MaterialType.
         */
        public Builder materialType(Integer materialType) {
            this.putQueryParameter("MaterialType", materialType);
            this.materialType = materialType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PersonalType.
         */
        public Builder personalType(Long personalType) {
            this.putQueryParameter("PersonalType", personalType);
            this.personalType = personalType;
            return this;
        }

        @Override
        public CheckMaterialValidityRequest build() {
            return new CheckMaterialValidityRequest(this);
        } 

    } 

}
