// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link CredentialRecognitionIntlRequest} extends {@link RequestModel}
 *
 * <p>CredentialRecognitionIntlRequest</p>
 */
public class CredentialRecognitionIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckRuleConfig")
    private String checkRuleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CredentialOcrPictureBase64")
    private String credentialOcrPictureBase64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CredentialOcrPictureUrl")
    private String credentialOcrPictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FraudCheck")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fraudCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdQuality")
    private String idQuality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OcrArea")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ocrArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OcrTranslation")
    private String ocrTranslation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OcrValueStandard")
    private String ocrValueStandard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    private CredentialRecognitionIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkRuleConfig = builder.checkRuleConfig;
        this.credentialOcrPictureBase64 = builder.credentialOcrPictureBase64;
        this.credentialOcrPictureUrl = builder.credentialOcrPictureUrl;
        this.docType = builder.docType;
        this.fraudCheck = builder.fraudCheck;
        this.idQuality = builder.idQuality;
        this.ocrArea = builder.ocrArea;
        this.ocrTranslation = builder.ocrTranslation;
        this.ocrValueStandard = builder.ocrValueStandard;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialRecognitionIntlRequest create() {
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
     * @return checkRuleConfig
     */
    public String getCheckRuleConfig() {
        return this.checkRuleConfig;
    }

    /**
     * @return credentialOcrPictureBase64
     */
    public String getCredentialOcrPictureBase64() {
        return this.credentialOcrPictureBase64;
    }

    /**
     * @return credentialOcrPictureUrl
     */
    public String getCredentialOcrPictureUrl() {
        return this.credentialOcrPictureUrl;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return fraudCheck
     */
    public String getFraudCheck() {
        return this.fraudCheck;
    }

    /**
     * @return idQuality
     */
    public String getIdQuality() {
        return this.idQuality;
    }

    /**
     * @return ocrArea
     */
    public String getOcrArea() {
        return this.ocrArea;
    }

    /**
     * @return ocrTranslation
     */
    public String getOcrTranslation() {
        return this.ocrTranslation;
    }

    /**
     * @return ocrValueStandard
     */
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<CredentialRecognitionIntlRequest, Builder> {
        private String regionId; 
        private String checkRuleConfig; 
        private String credentialOcrPictureBase64; 
        private String credentialOcrPictureUrl; 
        private String docType; 
        private String fraudCheck; 
        private String idQuality; 
        private String ocrArea; 
        private String ocrTranslation; 
        private String ocrValueStandard; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(CredentialRecognitionIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkRuleConfig = request.checkRuleConfig;
            this.credentialOcrPictureBase64 = request.credentialOcrPictureBase64;
            this.credentialOcrPictureUrl = request.credentialOcrPictureUrl;
            this.docType = request.docType;
            this.fraudCheck = request.fraudCheck;
            this.idQuality = request.idQuality;
            this.ocrArea = request.ocrArea;
            this.ocrTranslation = request.ocrTranslation;
            this.ocrValueStandard = request.ocrValueStandard;
            this.productCode = request.productCode;
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
         * CheckRuleConfig.
         */
        public Builder checkRuleConfig(String checkRuleConfig) {
            this.putBodyParameter("CheckRuleConfig", checkRuleConfig);
            this.checkRuleConfig = checkRuleConfig;
            return this;
        }

        /**
         * <p>Base64 encoded image. If you choose to upload the photo via IdOcrPictureBase64 (photo Base64 encoding), please check the photo size and do not upload overly large photos.</p>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        public Builder credentialOcrPictureBase64(String credentialOcrPictureBase64) {
            this.putBodyParameter("CredentialOcrPictureBase64", credentialOcrPictureBase64);
            this.credentialOcrPictureBase64 = credentialOcrPictureBase64;
            return this;
        }

        /**
         * <p>Image URL, accessible over the public network via HTTP or HTTPS links.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***</p>
         */
        public Builder credentialOcrPictureUrl(String credentialOcrPictureUrl) {
            this.putBodyParameter("CredentialOcrPictureUrl", credentialOcrPictureUrl);
            this.credentialOcrPictureUrl = credentialOcrPictureUrl;
            return this;
        }

        /**
         * <p>Voucher type.</p>
         * <ul>
         * <li>Transaction Voucher: 01 (including: water, electricity, gas, credit card, and other types of e-bill images)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder docType(String docType) {
            this.putQueryParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * <p>Whether to enable tampering detection</p>
         * <ul>
         * <li>true: Enable</li>
         * <li>false: Disable</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fraudCheck(String fraudCheck) {
            this.putQueryParameter("FraudCheck", fraudCheck);
            this.fraudCheck = fraudCheck;
            return this;
        }

        /**
         * IdQuality.
         */
        public Builder idQuality(String idQuality) {
            this.putQueryParameter("IdQuality", idQuality);
            this.idQuality = idQuality;
            return this;
        }

        /**
         * <p>Extraction type:</p>
         * <ul>
         * <li>0101: E-bill Address &amp; Name Module (extracts address and name modules through intelligent analysis)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0101</p>
         */
        public Builder ocrArea(String ocrArea) {
            this.putQueryParameter("OcrArea", ocrArea);
            this.ocrArea = ocrArea;
            return this;
        }

        /**
         * OcrTranslation.
         */
        public Builder ocrTranslation(String ocrTranslation) {
            this.putQueryParameter("OcrTranslation", ocrTranslation);
            this.ocrTranslation = ocrTranslation;
            return this;
        }

        /**
         * OcrValueStandard.
         */
        public Builder ocrValueStandard(String ocrValueStandard) {
            this.putQueryParameter("OcrValueStandard", ocrValueStandard);
            this.ocrValueStandard = ocrValueStandard;
            return this;
        }

        /**
         * <p>The product solution to be integrated. Value: CREDENTIAL_RECOGNITION.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL_RECOGNITION</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public CredentialRecognitionIntlRequest build() {
            return new CredentialRecognitionIntlRequest(this);
        } 

    } 

}
