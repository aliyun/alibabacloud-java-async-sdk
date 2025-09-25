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
         * <p>Relevant certificate number.</p>
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
         * <ul>
         * <li>01: Personal ID cards<ul>
         * <li><strong>0101</strong>: ID card</li>
         * <li><strong>0102</strong>: Bank card</li>
         * <li><strong>0104</strong>: Teacher qualification certificate</li>
         * <li><strong>0107</strong>: Student ID card</li>
         * </ul>
         * </li>
         * <li>02: Business scenario<ul>
         * <li><strong>0201</strong>: Storefront photo</li>
         * <li><strong>0202</strong>: Counter photo</li>
         * <li><strong>0203</strong>: Scene photo</li>
         * </ul>
         * </li>
         * <li>03: Corporate qualifications<ul>
         * <li><strong>0301</strong>: Business license</li>
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
         * <p>Credential type:</p>
         * <ul>
         * <li>01: Personal ID cards</li>
         * <li>02: Business scenario</li>
         * <li>03: Corporate qualifications</li>
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
         * <p>ID number:</p>
         * <p>Note
         * Only supports the ID numbers of second-generation resident IDs and Hong Kong, Macao, and Taiwan residence permits.</p>
         * <ul>
         * <li><p>When paramType is normal: enter the plaintext ID number.</p>
         * </li>
         * <li><p>When paramType is md5: first 6 digits of the ID number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID number (plaintext).</p>
         * </li>
         * </ul>
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
         * <p>Base64 encoded image, choose one from <code>imageUrl</code>, <code>imageFile</code>, or <code>imageContext</code>.</p>
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
         * <p>Image URL, choose one from <code>imageUrl</code>, <code>imageFile</code>, or <code>imageContext</code>.</p>
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
         * <p>Whether to enable authoritative authentication</p>
         * <ul>
         * <li><strong><strong>0</strong></strong>: No</li>
         * <li><strong>1</strong>: Yes</li>
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
         * <p>Whether to enable OCR recognition.</p>
         * <ul>
         * <li><strong>0</strong>: No</li>
         * <li><strong>1</strong>: Yes</li>
         * </ul>
         * <blockquote>
         * <p>IsOCR can be set to 1 only when <strong>CredType</strong> is 01.</p>
         * </blockquote>
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
         * <p>Merchant details:</p>
         * <blockquote>
         * <p>This field is required when PromptModel is set to DEFAULT.</p>
         * </blockquote>
         */
        public Builder merchantDetail(java.util.List<MerchantDetail> merchantDetail) {
            String merchantDetailShrink = shrink(merchantDetail, "MerchantDetail", "json");
            this.putQueryParameter("MerchantDetail", merchantDetailShrink);
            this.merchantDetail = merchantDetail;
            return this;
        }

        /**
         * <p>Merchant ID. </p>
         * <blockquote>
         * <p>This field is required when <strong><strong>CredName</strong></strong> is set to <strong>02</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>913100********KW8P</p>
         */
        public Builder merchantId(String merchantId) {
            this.putQueryParameter("MerchantId", merchantId);
            this.merchantId = merchantId;
            return this;
        }

        /**
         * <p>Invocation mode:</p>
         * <ul>
         * <li><p><strong>ANTI_FAKE_CHECK</strong>: Image anti-forgery check</p>
         * </li>
         * <li><p><strong>ANTI_FAKE_VL</strong>: Image anti-forgery check and semantic understanding</p>
         * </li>
         * <li><p><strong>IMAGE_VL_COG</strong>: Image semantic understanding</p>
         * </li>
         * </ul>
         * <p>Default value: ANTI_FAKE_CHECK</p>
         * <blockquote>
         * <p>When <strong>CredType</strong> is set to 02, <strong>ProductCode</strong> can only be ANTI_FAKE_VL or IMAGE_VL_COG.</p>
         * </blockquote>
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
         * <p>Customer-defined prompt content for image semantic understanding.</p>
         * <blockquote>
         * <p>This field is required when PromptModel is set to CUSTOM.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>Prompt acquisition method for image semantic understanding:</p>
         * <ul>
         * <li><p><strong>DEFAULT</strong>: System default</p>
         * </li>
         * <li><p><strong>CUSTOM</strong>: Customer-defined</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When <strong>ProductCode</strong> is set to <strong>ANTI_FAKE_VL</strong> or <strong>IMAGE_VL_COG</strong>, this parameter must be provided.</p>
         * </blockquote>
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
         * <p>UserName</p>
         * 
         * <strong>example:</strong>
         * <p>张*</p>
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
             * <p>The private key of the certificate.</p>
             * <blockquote>
             * <p> If this parameter is specified, you must also specify <strong>CertName</strong> and <strong>Cert</strong>. If <strong>CertName</strong>, <strong>Cert</strong>, and <strong>Key</strong> are specified, you do not need to specify <strong>CertId</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>keyword</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Keyword value.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
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
