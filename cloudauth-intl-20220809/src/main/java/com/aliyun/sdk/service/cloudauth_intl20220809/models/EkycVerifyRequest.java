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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureBase64")
    private String idOcrPictureBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureUrl")
    private String idOcrPictureUrl;

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
        this.idOcrPictureBase64 = builder.idOcrPictureBase64;
        this.idOcrPictureUrl = builder.idOcrPictureUrl;
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
        private String idOcrPictureBase64; 
        private String idOcrPictureUrl; 
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
            this.idOcrPictureBase64 = request.idOcrPictureBase64;
            this.idOcrPictureUrl = request.idOcrPictureUrl;
            this.idThreshold = request.idThreshold;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.productCode = request.productCode;
        } 

        /**
         * <p>Specifies whether to enable identity verification against the official database:</p>
         * <ul>
         * <li><p><strong>T</strong>: Enable.</p>
         * </li>
         * <li><p><strong>F</strong>: Disable. (Default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This feature is currently available only for second-generation resident ID cards of the Chinese mainland.</p>
         * </blockquote>
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
         * <p>Specifies whether to crop the face image:</p>
         * <ul>
         * <li><p><strong>T</strong>: Allows cropping.</p>
         * </li>
         * <li><p><strong>F</strong>: Disallows cropping. (Default)</p>
         * </li>
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
         * <p>The user&quot;s real name.</p>
         * <blockquote>
         * <p>If Authorize is set to T and the certificate type is Chinese mainland resident ID card, you must enter at least one of the following groups of information:</p>
         * <ul>
         * <li>DocName and DocNo.</li>
         * <li>IdOcrPictureBase64 or IdOcrPictureUrl.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder docName(String docName) {
            this.putQueryParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * <p>The user&quot;s certificate number.</p>
         * <blockquote>
         * <p>If Authorize is set to <strong>T</strong> and the certificate type is Chinese mainland resident ID card, you must enter at least one of the following groups of information:</p>
         * <ul>
         * <li>DocName and DocNo.</li>
         * <li>IdOcrPictureBase64 or IdOcrPictureUrl.</li>
         * </ul>
         * </blockquote>
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
         * <p>The certificate type, which is uniquely identified by an 8-digit number. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#Hu5TG">Certificate types</a>.</p>
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
         * FacePictureBase64.
         */
        public Builder facePictureBase64(String facePictureBase64) {
            this.putBodyParameter("FacePictureBase64", facePictureBase64);
            this.facePictureBase64 = facePictureBase64;
            return this;
        }

        /**
         * <p>The URL of the portrait image. The URL must be an HTTP or HTTPS link accessible over the Internet.</p>
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
         * IdOcrPictureBase64.
         */
        public Builder idOcrPictureBase64(String idOcrPictureBase64) {
            this.putBodyParameter("IdOcrPictureBase64", idOcrPictureBase64);
            this.idOcrPictureBase64 = idOcrPictureBase64;
            return this;
        }

        /**
         * <p>The URL of the certificate image. The URL must be an HTTP or HTTPS link accessible over the Internet.</p>
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
         * <p>The custom OCR quality detection threshold mode:</p>
         * <ul>
         * <li><p><strong>0</strong>: Standard mode</p>
         * </li>
         * <li><p><strong>1</strong>: Strict mode</p>
         * </li>
         * <li><p><strong>2</strong>: Loose mode</p>
         * </li>
         * <li><p><strong>3</strong> (default): Disables quality detection</p>
         * </li>
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
         * <p>A unique business identifier that you customize. It is used to locate and troubleshoot issues. The identifier can be up to 32 characters in length and can contain letters and digits. Make sure that the identifier is unique.</p>
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
         * <p>A custom user ID or another identifier that can identify a specific user, such as a mobile number or an email address. Desensitize the value of this field in advance, for example, by hashing the value.</p>
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
         * <p>The product solution to integrate. Set the value to <strong>eKYC_MIN</strong>.</p>
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
