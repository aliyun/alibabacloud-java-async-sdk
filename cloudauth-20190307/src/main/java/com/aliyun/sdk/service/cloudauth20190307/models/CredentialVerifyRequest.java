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
         * <p>The certificate number.</p>
         * 
         * <strong>example:</strong>
         * <p>4601*****</p>
         */
        public Builder certNum(String certNum) {
            this.putQueryParameter("CertNum", certNum);
            this.certNum = certNum;
            return this;
        }

        /**
         * <p>The credential name. Valid values:</p>
         * <ul>
         * <li>01: Personal cards and certificates<ul>
         * <li>0101: ID card</li>
         * <li>0102: Bank card</li>
         * <li>0104: Teacher qualification certificate</li>
         * <li>0107: Student ID card</li>
         * </ul>
         * </li>
         * <li>02: Business scenarios<ul>
         * <li>0201: Storefront photo</li>
         * <li>0202: Counter photo</li>
         * <li>0203: Scene photo</li>
         * </ul>
         * </li>
         * <li>03: Enterprise qualifications<ul>
         * <li>0301: Business license</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0104</p>
         */
        public Builder credName(String credName) {
            this.putQueryParameter("CredName", credName);
            this.credName = credName;
            return this;
        }

        /**
         * <p>The credential type. Valid values:</p>
         * <ul>
         * <li>01: Personal cards and certificates.</li>
         * <li>02: Business scenarios.</li>
         * <li>03: Enterprise qualifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder credType(String credType) {
            this.putQueryParameter("CredType", credType);
            this.credType = credType;
            return this;
        }

        /**
         * <p>The ID card number.</p>
         * 
         * <strong>example:</strong>
         * <p>429001********8211</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>The Base64-encoded image content. You must specify either imageUrl or imageContext.</p>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        public Builder imageContext(String imageContext) {
            this.putBodyParameter("ImageContext", imageContext);
            this.imageContext = imageContext;
            return this;
        }

        /**
         * <p>The image URL. You must specify either imageUrl or imageContext.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg">http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Specifies whether to enable authoritative verification. Valid values:</p>
         * <ul>
         * <li><strong><strong>0</strong></strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isCheck(String isCheck) {
            this.putQueryParameter("IsCheck", isCheck);
            this.isCheck = isCheck;
            return this;
        }

        /**
         * <p>Specifies whether to enable optical character recognition (OCR). Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * <p>You can set this parameter to <strong>1</strong> only when <strong>CredType</strong> is set to <strong>01</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isOCR(String isOCR) {
            this.putQueryParameter("IsOCR", isOCR);
            this.isOCR = isOCR;
            return this;
        }

        /**
         * <p>The merchant details. This parameter is required when PromptModel is set to DEFAULT.</p>
         */
        public Builder merchantDetail(java.util.List<MerchantDetail> merchantDetail) {
            String merchantDetailShrink = shrink(merchantDetail, "MerchantDetail", "json");
            this.putQueryParameter("MerchantDetail", merchantDetailShrink);
            this.merchantDetail = merchantDetail;
            return this;
        }

        /**
         * <p>The merchant ID. This parameter is required when <strong><strong>CredName</strong></strong> is set to <strong>02</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder merchantId(String merchantId) {
            this.putQueryParameter("MerchantId", merchantId);
            this.merchantId = merchantId;
            return this;
        }

        /**
         * <p>The call mode. Valid values:</p>
         * <ul>
         * <li><p>ANTI_FAKE_CHECK: Image anti-counterfeiting detection.</p>
         * </li>
         * <li><p>ANTI_FAKE_VL: Image anti-counterfeiting detection and semantic understanding.</p>
         * </li>
         * <li><p>IMAGE_VL_COG: Image semantic understanding.</p>
         * </li>
         * </ul>
         * <p>Default value: ANTI_FAKE_CHECK.</p>
         * <p>You can set this parameter to ANTI_FAKE_VL or IMAGE_VL_COG only when CredType is set to 02.</p>
         * 
         * <strong>example:</strong>
         * <p>ANTI_FAKE_CHECK</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The custom prompt content for image semantic understanding.</p>
         * <p>This parameter is required when PromptModel is set to CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The method to obtain the prompt for image semantic understanding. Valid values:</p>
         * <ul>
         * <li><p>DEFAULT: System default.</p>
         * </li>
         * <li><p>CUSTOM: Custom.</p>
         * </li>
         * </ul>
         * <p>Note: This parameter is required when ProductCode is set to ANTI_FAKE_VL or IMAGE_VL_COG.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder promptModel(String promptModel) {
            this.putQueryParameter("PromptModel", promptModel);
            this.promptModel = promptModel;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang*</p>
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

            private Builder() {
            } 

            private Builder(MerchantDetail model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the replacement keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>keyword</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the replacement keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>Keyword</p>
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
