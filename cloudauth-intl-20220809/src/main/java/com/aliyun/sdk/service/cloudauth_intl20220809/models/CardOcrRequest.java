// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CardOcrRequest} extends {@link RequestModel}
 *
 * <p>CardOcrRequest</p>
 */
public class CardOcrRequest extends Request {
    @Query
    @NameInMap("DocType")
    private String docType;

    @Query
    @NameInMap("IdFaceQuality")
    private String idFaceQuality;

    @Query
    @NameInMap("IdOcrPictureBase64")
    private String idOcrPictureBase64;

    @Query
    @NameInMap("IdOcrPictureUrl")
    private String idOcrPictureUrl;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    @Query
    @NameInMap("MerchantUserId")
    private String merchantUserId;

    @Query
    @NameInMap("Ocr")
    private String ocr;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("Spoof")
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
            this.putQueryParameter("IdOcrPictureBase64", idOcrPictureBase64);
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
        public CardOcrRequest build() {
            return new CardOcrRequest(this);
        } 

    } 

}
