// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CredentialVerifyRequest} extends {@link RequestModel}
 *
 * <p>CredentialVerifyRequest</p>
 */
public class CredentialVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertNum")
    private String certNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredName")
    private String credName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredType")
    private String credType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageContext")
    private String imageContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsCheck")
    private String isCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOCR")
    private String isOCR;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantId")
    private String merchantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private CredentialVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.certNum = builder.certNum;
        this.credName = builder.credName;
        this.credType = builder.credType;
        this.identifyNum = builder.identifyNum;
        this.imageContext = builder.imageContext;
        this.imageUrl = builder.imageUrl;
        this.isCheck = builder.isCheck;
        this.isOCR = builder.isOCR;
        this.merchantId = builder.merchantId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialVerifyRequest create() {
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
     * @return certNum
     */
    public String getCertNum() {
        return this.certNum;
    }

    /**
     * @return credName
     */
    public String getCredName() {
        return this.credName;
    }

    /**
     * @return credType
     */
    public String getCredType() {
        return this.credType;
    }

    /**
     * @return identifyNum
     */
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    /**
     * @return imageContext
     */
    public String getImageContext() {
        return this.imageContext;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return isCheck
     */
    public String getIsCheck() {
        return this.isCheck;
    }

    /**
     * @return isOCR
     */
    public String getIsOCR() {
        return this.isOCR;
    }

    /**
     * @return merchantId
     */
    public String getMerchantId() {
        return this.merchantId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CredentialVerifyRequest, Builder> {
        private String regionId; 
        private String certNum; 
        private String credName; 
        private String credType; 
        private String identifyNum; 
        private String imageContext; 
        private String imageUrl; 
        private String isCheck; 
        private String isOCR; 
        private String merchantId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CredentialVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.certNum = request.certNum;
            this.credName = request.credName;
            this.credType = request.credType;
            this.identifyNum = request.identifyNum;
            this.imageContext = request.imageContext;
            this.imageUrl = request.imageUrl;
            this.isCheck = request.isCheck;
            this.isOCR = request.isOCR;
            this.merchantId = request.merchantId;
            this.userName = request.userName;
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
         * CertNum.
         */
        public Builder certNum(String certNum) {
            this.putQueryParameter("CertNum", certNum);
            this.certNum = certNum;
            return this;
        }

        /**
         * CredName.
         */
        public Builder credName(String credName) {
            this.putQueryParameter("CredName", credName);
            this.credName = credName;
            return this;
        }

        /**
         * CredType.
         */
        public Builder credType(String credType) {
            this.putQueryParameter("CredType", credType);
            this.credType = credType;
            return this;
        }

        /**
         * IdentifyNum.
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * ImageContext.
         */
        public Builder imageContext(String imageContext) {
            this.putBodyParameter("ImageContext", imageContext);
            this.imageContext = imageContext;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * IsCheck.
         */
        public Builder isCheck(String isCheck) {
            this.putQueryParameter("IsCheck", isCheck);
            this.isCheck = isCheck;
            return this;
        }

        /**
         * IsOCR.
         */
        public Builder isOCR(String isOCR) {
            this.putQueryParameter("IsOCR", isOCR);
            this.isOCR = isOCR;
            return this;
        }

        /**
         * MerchantId.
         */
        public Builder merchantId(String merchantId) {
            this.putQueryParameter("MerchantId", merchantId);
            this.merchantId = merchantId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CredentialVerifyRequest build() {
            return new CredentialVerifyRequest(this);
        } 

    } 

}
