// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EntVerifyRequest} extends {@link RequestModel}
 *
 * <p>EntVerifyRequest</p>
 */
public class EntVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    private String accountNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntName")
    private String entName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InfoVerifyType")
    private String infoVerifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonCertNo")
    private String legalPersonCertNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonMobile")
    private String legalPersonMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonName")
    private String legalPersonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseNo")
    private String licenseNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskModelVersion")
    private String riskModelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskVerifyType")
    private String riskVerifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAuthorization")
    private String userAuthorization;

    private EntVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountNo = builder.accountNo;
        this.entName = builder.entName;
        this.infoVerifyType = builder.infoVerifyType;
        this.legalPersonCertNo = builder.legalPersonCertNo;
        this.legalPersonMobile = builder.legalPersonMobile;
        this.legalPersonName = builder.legalPersonName;
        this.licenseNo = builder.licenseNo;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.riskModelVersion = builder.riskModelVersion;
        this.riskVerifyType = builder.riskVerifyType;
        this.sceneCode = builder.sceneCode;
        this.userAuthorization = builder.userAuthorization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntVerifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accountNo
     */
    public String getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return entName
     */
    public String getEntName() {
        return this.entName;
    }

    /**
     * @return infoVerifyType
     */
    public String getInfoVerifyType() {
        return this.infoVerifyType;
    }

    /**
     * @return legalPersonCertNo
     */
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    /**
     * @return legalPersonMobile
     */
    public String getLegalPersonMobile() {
        return this.legalPersonMobile;
    }

    /**
     * @return legalPersonName
     */
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    /**
     * @return licenseNo
     */
    public String getLicenseNo() {
        return this.licenseNo;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return merchantUserId
     */
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    /**
     * @return riskModelVersion
     */
    public String getRiskModelVersion() {
        return this.riskModelVersion;
    }

    /**
     * @return riskVerifyType
     */
    public String getRiskVerifyType() {
        return this.riskVerifyType;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return userAuthorization
     */
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

    public static final class Builder extends Request.Builder<EntVerifyRequest, Builder> {
        private String regionId; 
        private String accountNo; 
        private String entName; 
        private String infoVerifyType; 
        private String legalPersonCertNo; 
        private String legalPersonMobile; 
        private String legalPersonName; 
        private String licenseNo; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String riskModelVersion; 
        private String riskVerifyType; 
        private String sceneCode; 
        private String userAuthorization; 

        private Builder() {
            super();
        } 

        private Builder(EntVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountNo = request.accountNo;
            this.entName = request.entName;
            this.infoVerifyType = request.infoVerifyType;
            this.legalPersonCertNo = request.legalPersonCertNo;
            this.legalPersonMobile = request.legalPersonMobile;
            this.legalPersonName = request.legalPersonName;
            this.licenseNo = request.licenseNo;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.riskModelVersion = request.riskModelVersion;
            this.riskVerifyType = request.riskVerifyType;
            this.sceneCode = request.sceneCode;
            this.userAuthorization = request.userAuthorization;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AccountNo.
         */
        public Builder accountNo(String accountNo) {
            this.putQueryParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * EntName.
         */
        public Builder entName(String entName) {
            this.putQueryParameter("EntName", entName);
            this.entName = entName;
            return this;
        }

        /**
         * InfoVerifyType.
         */
        public Builder infoVerifyType(String infoVerifyType) {
            this.putQueryParameter("InfoVerifyType", infoVerifyType);
            this.infoVerifyType = infoVerifyType;
            return this;
        }

        /**
         * LegalPersonCertNo.
         */
        public Builder legalPersonCertNo(String legalPersonCertNo) {
            this.putQueryParameter("LegalPersonCertNo", legalPersonCertNo);
            this.legalPersonCertNo = legalPersonCertNo;
            return this;
        }

        /**
         * LegalPersonMobile.
         */
        public Builder legalPersonMobile(String legalPersonMobile) {
            this.putQueryParameter("LegalPersonMobile", legalPersonMobile);
            this.legalPersonMobile = legalPersonMobile;
            return this;
        }

        /**
         * LegalPersonName.
         */
        public Builder legalPersonName(String legalPersonName) {
            this.putQueryParameter("LegalPersonName", legalPersonName);
            this.legalPersonName = legalPersonName;
            return this;
        }

        /**
         * LicenseNo.
         */
        public Builder licenseNo(String licenseNo) {
            this.putQueryParameter("LicenseNo", licenseNo);
            this.licenseNo = licenseNo;
            return this;
        }

        /**
         * MerchantBizId.
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * MerchantUserId.
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * RiskModelVersion.
         */
        public Builder riskModelVersion(String riskModelVersion) {
            this.putQueryParameter("RiskModelVersion", riskModelVersion);
            this.riskModelVersion = riskModelVersion;
            return this;
        }

        /**
         * RiskVerifyType.
         */
        public Builder riskVerifyType(String riskVerifyType) {
            this.putQueryParameter("RiskVerifyType", riskVerifyType);
            this.riskVerifyType = riskVerifyType;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * UserAuthorization.
         */
        public Builder userAuthorization(String userAuthorization) {
            this.putQueryParameter("UserAuthorization", userAuthorization);
            this.userAuthorization = userAuthorization;
            return this;
        }

        @Override
        public EntVerifyRequest build() {
            return new EntVerifyRequest(this);
        } 

    } 

}
