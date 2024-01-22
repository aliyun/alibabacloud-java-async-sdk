// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EkycVerifyRequest} extends {@link RequestModel}
 *
 * <p>EkycVerifyRequest</p>
 */
public class EkycVerifyRequest extends Request {
    @Query
    @NameInMap("Authorize")
    private String authorize;

    @Query
    @NameInMap("Crop")
    private String crop;

    @Query
    @NameInMap("DocName")
    private String docName;

    @Query
    @NameInMap("DocNo")
    private String docNo;

    @Query
    @NameInMap("DocType")
    private String docType;

    @Query
    @NameInMap("FacePictureBase64")
    private String facePictureBase64;

    @Query
    @NameInMap("FacePictureUrl")
    private String facePictureUrl;

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
    @NameInMap("ProductCode")
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
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.productCode = request.productCode;
        } 

        /**
         * Authorize.
         */
        public Builder authorize(String authorize) {
            this.putQueryParameter("Authorize", authorize);
            this.authorize = authorize;
            return this;
        }

        /**
         * Crop.
         */
        public Builder crop(String crop) {
            this.putQueryParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * DocName.
         */
        public Builder docName(String docName) {
            this.putQueryParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * DocNo.
         */
        public Builder docNo(String docNo) {
            this.putQueryParameter("DocNo", docNo);
            this.docNo = docNo;
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
         * FacePictureBase64.
         */
        public Builder facePictureBase64(String facePictureBase64) {
            this.putQueryParameter("FacePictureBase64", facePictureBase64);
            this.facePictureBase64 = facePictureBase64;
            return this;
        }

        /**
         * FacePictureUrl.
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
         * ProductCode.
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
