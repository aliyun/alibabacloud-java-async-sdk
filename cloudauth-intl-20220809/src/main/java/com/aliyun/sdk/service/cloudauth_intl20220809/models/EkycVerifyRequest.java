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
 * {@link EkycVerifyRequest} extends {@link RequestModel}
 *
 * <p>EkycVerifyRequest</p>
 */
public class EkycVerifyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Authorize")
    private String authorize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Crop")
    private String crop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocName")
    private String docName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocNo")
    private String docNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FacePictureBase64")
    private String facePictureBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePictureUrl")
    private String facePictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceQualityCheck")
    private String faceQualityCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureBase64")
    private String idOcrPictureBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureUrl")
    private String idOcrPictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdSpoof")
    private String idSpoof;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdThreshold")
    private String idThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    private EkycVerifyRequest(Builder builder) {
        super(builder);
        this.authorize = builder.authorize;
        this.crop = builder.crop;
        this.docName = builder.docName;
        this.docNo = builder.docNo;
        this.docType = builder.docType;
        this.facePictureBase64 = builder.facePictureBase64;
        this.facePictureUrl = builder.facePictureUrl;
        this.faceQualityCheck = builder.faceQualityCheck;
        this.idOcrPictureBase64 = builder.idOcrPictureBase64;
        this.idOcrPictureUrl = builder.idOcrPictureUrl;
        this.idSpoof = builder.idSpoof;
        this.idThreshold = builder.idThreshold;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EkycVerifyRequest create() {
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
     * @return crop
     */
    public String getCrop() {
        return this.crop;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return docNo
     */
    public String getDocNo() {
        return this.docNo;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return facePictureBase64
     */
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    /**
     * @return facePictureUrl
     */
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    /**
     * @return faceQualityCheck
     */
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<EkycVerifyRequest, Builder> {
        private String authorize; 
        private String crop; 
        private String docName; 
        private String docNo; 
        private String docType; 
        private String facePictureBase64; 
        private String facePictureUrl; 
        private String faceQualityCheck; 
        private String idOcrPictureBase64; 
        private String idOcrPictureUrl; 
        private String idSpoof; 
        private String idThreshold; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(EkycVerifyRequest request) {
            super(request);
            this.authorize = request.authorize;
            this.crop = request.crop;
            this.docName = request.docName;
            this.docNo = request.docNo;
            this.docType = request.docType;
            this.facePictureBase64 = request.facePictureBase64;
            this.facePictureUrl = request.facePictureUrl;
            this.faceQualityCheck = request.faceQualityCheck;
            this.idOcrPictureBase64 = request.idOcrPictureBase64;
            this.idOcrPictureUrl = request.idOcrPictureUrl;
            this.idSpoof = request.idSpoof;
            this.idThreshold = request.idThreshold;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.productCode = request.productCode;
        } 

        /**
         * <p>Specifies whether to enable authoritative identity verification. Currently, this applies only to second-generation ID cards in mainland China.</p>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder authorize(String authorize) {
            this.putQueryParameter("Authorize", authorize);
            this.authorize = authorize;
            return this;
        }

        /**
         * <p>Specifies whether cropping is allowed. By default, cropping is not allowed. Valid values:</p>
         * <ul>
         * <li>T: Detection is required.</li>
         * <li>F: Detection is required. (Default value: F)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>F</p>
         */
        public Builder crop(String crop) {
            this.putQueryParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * <p>The real name of the user. When Authorize=\&quot;T\&quot; and the document type is a mainland China ID card, either the key document information (DocName, DocNo) or the document image (IdOcrPictureBase64/URL) must be provided.
         * Note: Supports a combination of Chinese characters with a minimum length of one character. No special characters are allowed, except for the middle dot (·) used in ethnic minority names.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang**</p>
         */
        public Builder docName(String docName) {
            this.putQueryParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * <p>The document number of the user. When Authorize=\&quot;T\&quot; and the document type is a mainland China ID card, either the key document information (DocName, DocNo) or the document image (IdOcrPictureBase64/URL) must be provided.
         * Note: Supports a combination of letters and numbers with a length of 18 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>410***************</p>
         */
        public Builder docNo(String docNo) {
            this.putQueryParameter("DocNo", docNo);
            this.docNo = docNo;
            return this;
        }

        /**
         * <p>The document type.</p>
         * 
         * <strong>example:</strong>
         * <p>00000001</p>
         */
        public Builder docType(String docType) {
            this.putQueryParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * <p>The Base64-encoded face image.</p>
         * <p>Note:</p>
         * <ul>
         * <li>If you choose this method to pass in the face image, check the photo size and do not pass in an excessively large photo.</li>
         * <li>Specify either FacePictureBase64 or FacePictureUrl.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Base64</p>
         */
        public Builder facePictureBase64(String facePictureBase64) {
            this.putBodyParameter("FacePictureBase64", facePictureBase64);
            this.facePictureBase64 = facePictureBase64;
            return this;
        }

        /**
         * <p>The URL of the face photo.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
         */
        public Builder facePictureUrl(String facePictureUrl) {
            this.putQueryParameter("FacePictureUrl", facePictureUrl);
            this.facePictureUrl = facePictureUrl;
            return this;
        }

        /**
         * <p>Specifies whether to enable face quality detection.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder faceQualityCheck(String faceQualityCheck) {
            this.putQueryParameter("FaceQualityCheck", faceQualityCheck);
            this.faceQualityCheck = faceQualityCheck;
            return this;
        }

        /**
         * <p>The Base64-encoded document image.
         * Note:</p>
         * <ul>
         * <li>If you choose this method to pass in the document image, check the photo size and do not pass in an excessively large photo.</li>
         * <li>Specify either IdOcrPictureBase64 or IdOcrPictureUrl.</li>
         * </ul>
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
         * <p>The URL of the front side of the document image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
         */
        public Builder idOcrPictureUrl(String idOcrPictureUrl) {
            this.putQueryParameter("IdOcrPictureUrl", idOcrPictureUrl);
            this.idOcrPictureUrl = idOcrPictureUrl;
            return this;
        }

        /**
         * <p>Specifies whether to enable document anti-spoofing.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder idSpoof(String idSpoof) {
            this.putQueryParameter("IdSpoof", idSpoof);
            this.idSpoof = idSpoof;
            return this;
        }

        /**
         * <p>The custom OCR quality detection threshold mode. Valid values:</p>
         * <ul>
         * <li>0: system default</li>
         * <li>1: strict mode</li>
         * <li>2: loose mode</li>
         * <li>3 (default): disable quality detection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder idThreshold(String idThreshold) {
            this.putQueryParameter("IdThreshold", idThreshold);
            this.idThreshold = idThreshold;
            return this;
        }

        /**
         * <p>A custom business unique identifier defined by the merchant, used for subsequent issue tracking and troubleshooting. Supports a combination of letters and numbers up to 32 characters in length. Ensure that this value is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>A custom user ID or other identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize this field value in advance, for example, by hashing the value.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>eKYC_MIN</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public EkycVerifyRequest build() {
            return new EkycVerifyRequest(this);
        } 

    } 

}
