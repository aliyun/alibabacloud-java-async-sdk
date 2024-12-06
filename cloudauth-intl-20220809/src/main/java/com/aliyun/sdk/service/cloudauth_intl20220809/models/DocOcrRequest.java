// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DocOcrRequest} extends {@link RequestModel}
 *
 * <p>DocOcrRequest</p>
 */
public class DocOcrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardSide")
    private String cardSide;

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
    @com.aliyun.core.annotation.NameInMap("IdThreshold")
    private String idThreshold;

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

    private DocOcrRequest(Builder builder) {
        super(builder);
        this.cardSide = builder.cardSide;
        this.docType = builder.docType;
        this.idFaceQuality = builder.idFaceQuality;
        this.idOcrPictureBase64 = builder.idOcrPictureBase64;
        this.idOcrPictureUrl = builder.idOcrPictureUrl;
        this.idThreshold = builder.idThreshold;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.ocr = builder.ocr;
        this.productCode = builder.productCode;
        this.spoof = builder.spoof;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocOcrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cardSide
     */
    public String getCardSide() {
        return this.cardSide;
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

    public static final class Builder extends Request.Builder<DocOcrRequest, Builder> {
        private String cardSide; 
        private String docType; 
        private String idFaceQuality; 
        private String idOcrPictureBase64; 
        private String idOcrPictureUrl; 
        private String idThreshold; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String ocr; 
        private String productCode; 
        private String spoof; 

        private Builder() {
            super();
        } 

        private Builder(DocOcrRequest request) {
            super(request);
            this.cardSide = request.cardSide;
            this.docType = request.docType;
            this.idFaceQuality = request.idFaceQuality;
            this.idOcrPictureBase64 = request.idOcrPictureBase64;
            this.idOcrPictureUrl = request.idOcrPictureUrl;
            this.idThreshold = request.idThreshold;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.ocr = request.ocr;
            this.productCode = request.productCode;
            this.spoof = request.spoof;
        } 

        /**
         * CardSide.
         */
        public Builder cardSide(String cardSide) {
            this.putQueryParameter("CardSide", cardSide);
            this.cardSide = cardSide;
            return this;
        }

        /**
         * DocType.
         */
        public Builder docType(String docType) {
            this.putQueryParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * IdFaceQuality.
         */
        public Builder idFaceQuality(String idFaceQuality) {
            this.putQueryParameter("IdFaceQuality", idFaceQuality);
            this.idFaceQuality = idFaceQuality;
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
         * IdOcrPictureUrl.
         */
        public Builder idOcrPictureUrl(String idOcrPictureUrl) {
            this.putQueryParameter("IdOcrPictureUrl", idOcrPictureUrl);
            this.idOcrPictureUrl = idOcrPictureUrl;
            return this;
        }

        /**
         * IdThreshold.
         */
        public Builder idThreshold(String idThreshold) {
            this.putQueryParameter("IdThreshold", idThreshold);
            this.idThreshold = idThreshold;
            return this;
        }

        /**
         * MerchantBizId.
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * MerchantUserId.
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * Ocr.
         */
        public Builder ocr(String ocr) {
            this.putQueryParameter("Ocr", ocr);
            this.ocr = ocr;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * Spoof.
         */
        public Builder spoof(String spoof) {
            this.putQueryParameter("Spoof", spoof);
            this.spoof = spoof;
            return this;
        }

        @Override
        public DocOcrRequest build() {
            return new DocOcrRequest(this);
        } 

    } 

}
