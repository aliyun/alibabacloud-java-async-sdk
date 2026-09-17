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
    @com.aliyun.core.annotation.NameInMap("FileInputType")
    private String fileInputType;

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
        this.fileInputType = builder.fileInputType;
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
     * @return fileInputType
     */
    public String getFileInputType() {
        return this.fileInputType;
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
        private String fileInputType; 
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
            this.fileInputType = request.fileInputType;
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
         * <p>The field validation rule configuration in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;address_rule&quot;: &quot;Includes Address Hangzhou***&quot;,
         *     &quot;name_rule&quot;: &quot;Includes Name Zhang*&quot;,
         *     &quot;date_of_issue_rule&quot;: &quot;Whthin 2026.05.20&quot;
         * }</p>
         */
        public Builder checkRuleConfig(String checkRuleConfig) {
            this.putBodyParameter("CheckRuleConfig", checkRuleConfig);
            this.checkRuleConfig = checkRuleConfig;
            return this;
        }

        /**
         * <p>The Base64-encoded image. If you use this method to submit a photo, check the photo size and do not submit an excessively large photo.</p>
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
         * <p>The URL of the image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
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
         * <p>The credential type. Valid values:</p>
         * <ul>
         * <li>02: vehicle registration certificate.</li>
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
         * <p>The input file type. Valid values:</p>
         * <ul>
         * <li><p>IMAGE (default): image.</p>
         * </li>
         * <li><p>PDF: PDF format.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        public Builder fileInputType(String fileInputType) {
            this.putQueryParameter("FileInputType", fileInputType);
            this.fileInputType = fileInputType;
            return this;
        }

        /**
         * <p>Specifies whether to enable tampering detection. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
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
         * <p>Specifies whether to enable quality detection. Valid values:</p>
         * <ul>
         * <li>Y: Enabled.</li>
         * <li>N: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder idQuality(String idQuality) {
            this.putQueryParameter("IdQuality", idQuality);
            this.idQuality = idQuality;
            return this;
        }

        /**
         * <p>The custom business unique identifier on the merchant side, used for subsequent troubleshooting. The value can be a combination of letters and digits with a maximum length of 32 characters. Ensure that the value is unique.</p>
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
         * <p>The extraction type. Valid values:</p>
         * <ul>
         * <li>0201: Thailand vehicle registration certificate.</li>
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
         * <p>Specifies whether to enable translation. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ocrTranslation(String ocrTranslation) {
            this.putQueryParameter("OcrTranslation", ocrTranslation);
            this.ocrTranslation = ocrTranslation;
            return this;
        }

        /**
         * <p>Specifies whether to enable OCR result standardization. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ocrValueStandard(String ocrValueStandard) {
            this.putQueryParameter("OcrValueStandard", ocrValueStandard);
            this.ocrValueStandard = ocrValueStandard;
            return this;
        }

        /**
         * <p>The product solution to use. Set this parameter to CREDENTIAL_RECOGNITION.</p>
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
         * <p>The custom authentication scenario ID. You can use this scenario ID to query related records in the console. The value can be a combination of letters, digits, or underscores with a maximum length of 10 characters.</p>
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
