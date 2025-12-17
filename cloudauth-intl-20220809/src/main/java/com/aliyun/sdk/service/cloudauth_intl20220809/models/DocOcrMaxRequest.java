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
         * <p>Specifies whether to enable verification with an authoritative data source to enhance document anti-spoofing capabilities.</p>
         * <ul>
         * <li><p><strong>T</strong>: Enable</p>
         * </li>
         * <li><p><strong>F</strong>: Disable (default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><strong>Applicable document types</strong>: Chinese resident ID cards (CHN01001) and Chinese mainland driver&quot;s licenses (CHN02001).</li>
         * <li><strong>Data transfer declaration</strong>: If you enable this parameter, you agree to transfer the user&quot;s name and certificate number to an authoritative data source in the Chinese mainland for consistency verification.</li>
         * <li><strong>Performance impact:</strong> After you enable this feature, the response time of the API operation increases by 1 to 2 seconds. Adjust the timeout setting.</li>
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
         * <p>Page expected to be recognized</p>
         * <ul>
         * <li><p>01 (default): ID portrait.</p>
         * </li>
         * <li><p>02: Back of the certificate</p>
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
         * <p>Document type.
         * Format: Country (region) code + document type abbreviation + page (optional)
         * Note: If provided, it will automatically check if it matches the model recognition result; if empty, the document type will be returned after model recognition.</p>
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
         * <p>Document image, base64 encoded binary stream</p>
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
         * <p>Document image URL</p>
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
         * <p>Whether to turn on the certificate anti-counterfeiting function:</p>
         * <ul>
         * <li><p>T: open</p>
         * </li>
         * <li><p>F (default): not turned on.</p>
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
         * <p>Custom OCR quality detection threshold mode:</p>
         * <ul>
         * <li>0: System default</li>
         * <li>1: Strict mode</li>
         * <li>2: Lenient mode</li>
         * <li>3 (default): Disable quality detection</li>
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
         * <p>A unique business identifier defined by the merchant, used for subsequent problem localization and troubleshooting. It supports a combination of letters and numbers, with a maximum length of 32 characters. Please ensure its uniqueness.</p>
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
         * <p>Your custom user ID or other identifiers that can uniquely identify a specific user, such as a phone number or email address. It is strongly recommended to pre-desensitize the value of this field, for example, by hashing it.</p>
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
         * <p>OCR recognition mode.
         * 0: General document mode.
         * 1: Custom mode.</p>
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
         * <p>Specifies whether to return additional OCR fields in a standardized format:</p>
         * <ul>
         * <li><p><strong>0</strong>: No (default)</p>
         * </li>
         * <li><p><strong>1</strong>: Yes</p>
         * </li>
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
         * <p>The product solution to be integrated.</p>
         * <p>Value: ID_OCR_MAX</p>
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
         * <p>Prompt (for custom mode)</p>
         * 
         * <strong>example:</strong>
         * <p>xxxocr识别</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>Custom scene code, used to distinguish business scenarios, a 10-digit number.</p>
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
         * <p>Whether to enable document anti-counterfeiting function, default is not enabled.</p>
         * <ul>
         * <li>T: Enable document anti-counterfeiting function.</li>
         * <li>F: Do not enable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>F</p>
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
