// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
    @com.aliyun.core.annotation.NameInMap("MerchantDetail")
    private java.util.List<MerchantDetail> merchantDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantId")
    private String merchantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptModel")
    private String promptModel;

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
        this.merchantDetail = builder.merchantDetail;
        this.merchantId = builder.merchantId;
        this.productCode = builder.productCode;
        this.prompt = builder.prompt;
        this.promptModel = builder.promptModel;
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
     * @return merchantDetail
     */
    public java.util.List<MerchantDetail> getMerchantDetail() {
        return this.merchantDetail;
    }

    /**
     * @return merchantId
     */
    public String getMerchantId() {
        return this.merchantId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return promptModel
     */
    public String getPromptModel() {
        return this.promptModel;
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
        private java.util.List<MerchantDetail> merchantDetail; 
        private String merchantId; 
        private String productCode; 
        private String prompt; 
        private String promptModel; 
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
            this.merchantDetail = request.merchantDetail;
            this.merchantId = request.merchantId;
            this.productCode = request.productCode;
            this.prompt = request.prompt;
            this.promptModel = request.promptModel;
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
         * MerchantDetail.
         */
        public Builder merchantDetail(java.util.List<MerchantDetail> merchantDetail) {
            String merchantDetailShrink = shrink(merchantDetail, "MerchantDetail", "json");
            this.putQueryParameter("MerchantDetail", merchantDetailShrink);
            this.merchantDetail = merchantDetail;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * PromptModel.
         */
        public Builder promptModel(String promptModel) {
            this.putQueryParameter("PromptModel", promptModel);
            this.promptModel = promptModel;
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

    /**
     * 
     * {@link CredentialVerifyRequest} extends {@link TeaModel}
     *
     * <p>CredentialVerifyRequest</p>
     */
    public static class MerchantDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MerchantDetail(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MerchantDetail create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MerchantDetail build() {
                return new MerchantDetail(this);
            } 

        } 

    }
}
