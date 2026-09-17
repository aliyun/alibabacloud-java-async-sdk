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
 * {@link CardOcrRequest} extends {@link RequestModel}
 *
 * <p>CardOcrRequest</p>
 */
public class CardOcrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdFaceQuality")
    private String idFaceQuality;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureBase64")
    private String idOcrPictureBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureUrl")
    private String idOcrPictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ocr")
    private String ocr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spoof")
    private String spoof;

    private CardOcrRequest(Builder builder) {
        super(builder);
        this.docType = builder.docType;
        this.idFaceQuality = builder.idFaceQuality;
        this.idOcrPictureBase64 = builder.idOcrPictureBase64;
        this.idOcrPictureUrl = builder.idOcrPictureUrl;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.ocr = builder.ocr;
        this.productCode = builder.productCode;
        this.spoof = builder.spoof;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CardOcrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return idFaceQuality
     */
    public String getIdFaceQuality() {
        return this.idFaceQuality;
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
     * @return ocr
     */
    public String getOcr() {
        return this.ocr;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return spoof
     */
    public String getSpoof() {
        return this.spoof;
    }

    public static final class Builder extends Request.Builder<CardOcrRequest, Builder> {
        private String docType; 
        private String idFaceQuality; 
        private String idOcrPictureBase64; 
        private String idOcrPictureUrl; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String ocr; 
        private String productCode; 
        private String spoof; 

        private Builder() {
            super();
        } 

        private Builder(CardOcrRequest request) {
            super(request);
            this.docType = request.docType;
            this.idFaceQuality = request.idFaceQuality;
            this.idOcrPictureBase64 = request.idOcrPictureBase64;
            this.idOcrPictureUrl = request.idOcrPictureUrl;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.ocr = request.ocr;
            this.productCode = request.productCode;
            this.spoof = request.spoof;
        } 

        /**
         * <p>The document type.</p>
         * 
         * <strong>example:</strong>
         * <p>00000006</p>
         */
        public Builder docType(String docType) {
            this.putQueryParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * <p>Specifies whether to perform face quality detection on the ID document. Valid values:</p>
         * <ul>
         * <li>T: Perform face quality detection.</li>
         * <li>F: Do not perform face quality detection. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>F</p>
         */
        public Builder idFaceQuality(String idFaceQuality) {
            this.putQueryParameter("IdFaceQuality", idFaceQuality);
            this.idFaceQuality = idFaceQuality;
            return this;
        }

        /**
         * <p>The Base64-encoded image of the front side of the ID document. The value is a Base64 encoding of the image.</p>
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
         * <p>The URL of the front-side image of the ID document.</p>
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
         * <p>The merchant-defined unique business ID used for subsequent troubleshooting. The value can be a combination of letters and digits with a maximum length of 32 characters. Ensure that the value is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>dso9322***dsjsd22</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>The merchant user ID or another identifier that can be used to identify a specific user, such as a phone number or email address. We strongly recommend that you pre-desensitize the value of the userId field, for example, by hashing the value.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * <p>Specifies whether to perform OCR on the ID document. Valid values:</p>
         * <ul>
         * <li>T: Perform OCR on the ID document. This is the default value.</li>
         * <li>F: Do not perform OCR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder ocr(String ocr) {
            this.putQueryParameter("Ocr", ocr);
            this.ocr = ocr;
            return this;
        }

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_OCR_MIN</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Specifies whether to enable anti-spoofing detection. Valid values:</p>
         * <ul>
         * <li>T: Enable anti-spoofing detection.</li>
         * <li>F: Disable anti-spoofing detection. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>F</p>
         */
        public Builder spoof(String spoof) {
            this.putQueryParameter("Spoof", spoof);
            this.spoof = spoof;
            return this;
        }

        @Override
        public CardOcrRequest build() {
            return new CardOcrRequest(this);
        } 

    } 

}
