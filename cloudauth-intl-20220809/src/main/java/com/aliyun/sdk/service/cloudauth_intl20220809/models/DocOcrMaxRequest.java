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
 * {@link DocOcrMaxRequest} extends {@link RequestModel}
 *
 * <p>DocOcrMaxRequest</p>
 */
public class DocOcrMaxRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Authorize")
    private String authorize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocPage")
    private String docPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureBase64")
    private String idOcrPictureBase64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureUrl")
    private String idOcrPictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdSpoof")
    private String idSpoof;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdThreshold")
    private String idThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OcrModel")
    private String ocrModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OcrValueStandard")
    private String ocrValueStandard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spoof")
    private String spoof;

    private DocOcrMaxRequest(Builder builder) {
        super(builder);
        this.authorize = builder.authorize;
        this.docPage = builder.docPage;
        this.docType = builder.docType;
        this.idOcrPictureBase64 = builder.idOcrPictureBase64;
        this.idOcrPictureUrl = builder.idOcrPictureUrl;
        this.idSpoof = builder.idSpoof;
        this.idThreshold = builder.idThreshold;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.ocrModel = builder.ocrModel;
        this.ocrValueStandard = builder.ocrValueStandard;
        this.productCode = builder.productCode;
        this.prompt = builder.prompt;
        this.sceneCode = builder.sceneCode;
        this.spoof = builder.spoof;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocOcrMaxRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorize
     */
    public String getAuthorize() {
        return this.authorize;
    }

    /**
     * @return docPage
     */
    public String getDocPage() {
        return this.docPage;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return idOcrPictureBase64
     */
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    /**
     * @return idOcrPictureUrl
     */
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    /**
     * @return idSpoof
     */
    public String getIdSpoof() {
        return this.idSpoof;
    }

    /**
     * @return idThreshold
     */
    public String getIdThreshold() {
        return this.idThreshold;
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
     * @return ocrModel
     */
    public String getOcrModel() {
        return this.ocrModel;
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
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return spoof
     */
    public String getSpoof() {
        return this.spoof;
    }

    public static final class Builder extends Request.Builder<DocOcrMaxRequest, Builder> {
        private String authorize; 
        private String docPage; 
        private String docType; 
        private String idOcrPictureBase64; 
        private String idOcrPictureUrl; 
        private String idSpoof; 
        private String idThreshold; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String ocrModel; 
        private String ocrValueStandard; 
        private String productCode; 
        private String prompt; 
        private String sceneCode; 
        private String spoof; 

        private Builder() {
            super();
        } 

        private Builder(DocOcrMaxRequest request) {
            super(request);
            this.authorize = request.authorize;
            this.docPage = request.docPage;
            this.docType = request.docType;
            this.idOcrPictureBase64 = request.idOcrPictureBase64;
            this.idOcrPictureUrl = request.idOcrPictureUrl;
            this.idSpoof = request.idSpoof;
            this.idThreshold = request.idThreshold;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.ocrModel = request.ocrModel;
            this.ocrValueStandard = request.ocrValueStandard;
            this.productCode = request.productCode;
            this.prompt = request.prompt;
            this.sceneCode = request.sceneCode;
            this.spoof = request.spoof;
        } 

        /**
         * <p>Specifies whether to enable authoritative data source verification to enhance document anti-forgery capabilities.</p>
         * <ul>
         * <li><p><strong>T</strong>: enabled.</p>
         * </li>
         * <li><p><strong>F</strong>: disabled (default).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><strong>Applicable document types</strong>: China resident identity card (CHN01001) and Chinese mainland driver\&quot;s license (CHN02001).</li>
         * <li><strong>Data transmission statement</strong>: Enabling this parameter indicates your consent to transmit the user\&quot;s name and document number to an authoritative data source in the Chinese mainland for consistency verification.</li>
         * <li><strong>Performance impact</strong>: After this feature is enabled, the API response time increases by approximately 1 to 2 seconds. Adjust the timeout settings accordingly.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder authorize(String authorize) {
            this.putBodyParameter("Authorize", authorize);
            this.authorize = authorize;
            return this;
        }

        /**
         * <p>The expected page to recognize. Valid values:</p>
         * <ul>
         * <li><p>01 (default): the portrait side of the document.</p>
         * </li>
         * <li><p>02: the back side of the document.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder docPage(String docPage) {
            this.putBodyParameter("DocPage", docPage);
            this.docPage = docPage;
            return this;
        }

        /**
         * <p>The document type.</p>
         * <ul>
         * <li>Format: country code + document type abbreviation + page (optional).</li>
         * </ul>
         * <p>Note:</p>
         * <ul>
         * <li>OcrModel = 0: DocType is required. Specify the document type. The existing logic remains unchanged.</li>
         * <li>OcrModel = 1 or 2: DocType must be left empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNSSC01</p>
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * <p>The Base64-encoded image of the card or certificate.</p>
         * <p>If you use IdOcrPictureBase64 to pass in the document image, check the image size and do not pass in an excessively large image.</p>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        public Builder idOcrPictureBase64(String idOcrPictureBase64) {
            this.putBodyParameter("IdOcrPictureBase64", idOcrPictureBase64);
            this.idOcrPictureBase64 = idOcrPictureBase64;
            return this;
        }

        /**
         * <p>The URL of the card or certificate image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***********.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</p>
         */
        public Builder idOcrPictureUrl(String idOcrPictureUrl) {
            this.putBodyParameter("IdOcrPictureUrl", idOcrPictureUrl);
            this.idOcrPictureUrl = idOcrPictureUrl;
            return this;
        }

        /**
         * <p>Specifies whether to enable the document anti-forgery feature. Valid values:</p>
         * <ul>
         * <li><p>T: enabled.</p>
         * </li>
         * <li><p>F (default): disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>F</p>
         */
        public Builder idSpoof(String idSpoof) {
            this.putBodyParameter("IdSpoof", idSpoof);
            this.idSpoof = idSpoof;
            return this;
        }

        /**
         * <p>The custom OCR quality detection threshold mode. Valid values:</p>
         * <ul>
         * <li>0: system default.</li>
         * <li>1: strict mode.</li>
         * <li>2: loose mode.</li>
         * <li>3 (default): quality detection disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder idThreshold(String idThreshold) {
            this.putBodyParameter("IdThreshold", idThreshold);
            this.idThreshold = idThreshold;
            return this;
        }

        /**
         * <p>The custom unique business identifier, which is used for subsequent troubleshooting.</p>
         * <p>The value can contain up to 32 characters, including letters and digits. Make sure the value is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putBodyParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>The custom user ID or another identifier that can identify a specific user, such as a phone number or email address.</p>
         * <p>We strongly recommend that you desensitize the value of this field in advance, for example, by hashing the value.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putBodyParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * <p>The OCR recognition mode. Valid values:</p>
         * <ul>
         * <li><p>0: general document recognition mode (default).</p>
         * </li>
         * <li><p>1: automatic document classification mode.</p>
         * </li>
         * <li><p>2: automatic document classification + general recognition mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ocrModel(String ocrModel) {
            this.putBodyParameter("OcrModel", ocrModel);
            this.ocrModel = ocrModel;
            return this;
        }

        /**
         * <p>Specifies whether to enable OCR key field standardization. Valid values:</p>
         * <ul>
         * <li>0: no (default). </li>
         * <li>1: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ocrValueStandard(String ocrValueStandard) {
            this.putQueryParameter("OcrValueStandard", ocrValueStandard);
            this.ocrValueStandard = ocrValueStandard;
            return this;
        }

        /**
         * <p>The product solution to use.</p>
         * <p>Set this parameter to ID_OCR_MAX.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_OCR_MAX</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <blockquote>
         * <p>Warning: This field is deprecated.</warning>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>已废弃</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The custom authentication scenario ID. You can use this scenario ID to query related records in the console.</p>
         * <p>The value can contain up to 10 characters, including letters, digits, and underscores.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p><warning>This field is deprecated.</warning>.</p>
         * 
         * <strong>example:</strong>
         * <p>已废弃</p>
         */
        public Builder spoof(String spoof) {
            this.putBodyParameter("Spoof", spoof);
            this.spoof = spoof;
            return this;
        }

        @Override
        public DocOcrMaxRequest build() {
            return new DocOcrMaxRequest(this);
        } 

    } 

}
