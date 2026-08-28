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
 * {@link CredentialSubmitIntlRequest} extends {@link RequestModel}
 *
 * <p>CredentialSubmitIntlRequest</p>
 */
public class CredentialSubmitIntlRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantBizId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    private CredentialSubmitIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkRuleConfig = builder.checkRuleConfig;
        this.credentialOcrPictureBase64 = builder.credentialOcrPictureBase64;
        this.credentialOcrPictureUrl = builder.credentialOcrPictureUrl;
        this.docType = builder.docType;
        this.fraudCheck = builder.fraudCheck;
        this.idQuality = builder.idQuality;
        this.merchantBizId = builder.merchantBizId;
        this.ocrArea = builder.ocrArea;
        this.ocrTranslation = builder.ocrTranslation;
        this.ocrValueStandard = builder.ocrValueStandard;
        this.productCode = builder.productCode;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialSubmitIntlRequest create() {
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
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
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

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    public static final class Builder extends Request.Builder<CredentialSubmitIntlRequest, Builder> {
        private String regionId; 
        private String checkRuleConfig; 
        private String credentialOcrPictureBase64; 
        private String credentialOcrPictureUrl; 
        private String docType; 
        private String fraudCheck; 
        private String idQuality; 
        private String merchantBizId; 
        private String ocrArea; 
        private String ocrTranslation; 
        private String ocrValueStandard; 
        private String productCode; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(CredentialSubmitIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkRuleConfig = request.checkRuleConfig;
            this.credentialOcrPictureBase64 = request.credentialOcrPictureBase64;
            this.credentialOcrPictureUrl = request.credentialOcrPictureUrl;
            this.docType = request.docType;
            this.fraudCheck = request.fraudCheck;
            this.idQuality = request.idQuality;
            this.merchantBizId = request.merchantBizId;
            this.ocrArea = request.ocrArea;
            this.ocrTranslation = request.ocrTranslation;
            this.ocrValueStandard = request.ocrValueStandard;
            this.productCode = request.productCode;
            this.sceneCode = request.sceneCode;
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
         * <p>Base64 encoding of the image. If you choose to upload the photo this way, please check the photo size and avoid uploading overly large photos.</p>
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
         * <p>Image URL, accessible via HTTP or HTTPS on the public network.</p>
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
         * <p>Credential type:</p>
         * <ul>
         * <li>02: Vehicle registration certificate</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
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
         * <p>false</p>
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
         * <p>A unique business identifier defined on the merchant side, used for troubleshooting issues later. Supports a combination of letters and digits, with a maximum length of 32 characters. Ensure uniqueness.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a***353888</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>Extraction type:</p>
         * <ul>
         * <li>0201: Thai vehicle registration certificate</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0201</p>
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

        /**
         * <p>Your custom authentication scenario ID, used for querying related records by entering this scenario ID in the console later. Supports a combination of 10 characters, digits, or underscores.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123****123</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public CredentialSubmitIntlRequest build() {
            return new CredentialSubmitIntlRequest(this);
        } 

    } 

}
