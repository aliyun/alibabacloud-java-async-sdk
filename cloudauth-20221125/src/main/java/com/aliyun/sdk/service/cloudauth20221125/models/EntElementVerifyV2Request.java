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
 * {@link EntElementVerifyV2Request} extends {@link RequestModel}
 *
 * <p>EntElementVerifyV2Request</p>
 */
public class EntElementVerifyV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InfoVerifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String infoVerifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonCertNo")
    private String legalPersonCertNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonName")
    private String legalPersonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAuthorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAuthorization;

    private EntElementVerifyV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entName = builder.entName;
        this.infoVerifyType = builder.infoVerifyType;
        this.legalPersonCertNo = builder.legalPersonCertNo;
        this.legalPersonName = builder.legalPersonName;
        this.licenseNo = builder.licenseNo;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.sceneCode = builder.sceneCode;
        this.userAuthorization = builder.userAuthorization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntElementVerifyV2Request create() {
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

    public static final class Builder extends Request.Builder<EntElementVerifyV2Request, Builder> {
        private String regionId; 
        private String entName; 
        private String infoVerifyType; 
        private String legalPersonCertNo; 
        private String legalPersonName; 
        private String licenseNo; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String sceneCode; 
        private String userAuthorization; 

        private Builder() {
            super();
        } 

        private Builder(EntElementVerifyV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.entName = request.entName;
            this.infoVerifyType = request.infoVerifyType;
            this.legalPersonCertNo = request.legalPersonCertNo;
            this.legalPersonName = request.legalPersonName;
            this.licenseNo = request.licenseNo;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
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
         * <p>This parameter is required.</p>
         */
        public Builder entName(String entName) {
            this.putQueryParameter("EntName", entName);
            this.entName = entName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ENT_2META</p>
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
         * LegalPersonName.
         */
        public Builder legalPersonName(String legalPersonName) {
            this.putQueryParameter("LegalPersonName", legalPersonName);
            this.legalPersonName = legalPersonName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>91330106673959****</p>
         */
        public Builder licenseNo(String licenseNo) {
            this.putQueryParameter("LicenseNo", licenseNo);
            this.licenseNo = licenseNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mch7x9a2b4c8d3e5f6g1h2i3j4k5****</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000006</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userAuthorization(String userAuthorization) {
            this.putQueryParameter("UserAuthorization", userAuthorization);
            this.userAuthorization = userAuthorization;
            return this;
        }

        @Override
        public EntElementVerifyV2Request build() {
            return new EntElementVerifyV2Request(this);
        } 

    } 

}
