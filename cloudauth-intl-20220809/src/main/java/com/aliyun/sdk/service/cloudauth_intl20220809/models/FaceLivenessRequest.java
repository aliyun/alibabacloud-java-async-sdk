// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FaceLivenessRequest} extends {@link RequestModel}
 *
 * <p>FaceLivenessRequest</p>
 */
public class FaceLivenessRequest extends Request {
    @Query
    @NameInMap("Crop")
    private String crop;

    @Body
    @NameInMap("FacePictureBase64")
    private String facePictureBase64;

    @Query
    @NameInMap("FacePictureUrl")
    private String facePictureUrl;

    @Query
    @NameInMap("FaceQuality")
    private String faceQuality;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    @Query
    @NameInMap("MerchantUserId")
    private String merchantUserId;

    @Query
    @NameInMap("Occlusion")
    private String occlusion;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    private FaceLivenessRequest(Builder builder) {
        super(builder);
        this.crop = builder.crop;
        this.facePictureBase64 = builder.facePictureBase64;
        this.facePictureUrl = builder.facePictureUrl;
        this.faceQuality = builder.faceQuality;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.occlusion = builder.occlusion;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceLivenessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crop
     */
    public String getCrop() {
        return this.crop;
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
     * @return faceQuality
     */
    public String getFaceQuality() {
        return this.faceQuality;
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
     * @return occlusion
     */
    public String getOcclusion() {
        return this.occlusion;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<FaceLivenessRequest, Builder> {
        private String crop; 
        private String facePictureBase64; 
        private String facePictureUrl; 
        private String faceQuality; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String occlusion; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(FaceLivenessRequest request) {
            super(request);
            this.crop = request.crop;
            this.facePictureBase64 = request.facePictureBase64;
            this.facePictureUrl = request.facePictureUrl;
            this.faceQuality = request.faceQuality;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.occlusion = request.occlusion;
            this.productCode = request.productCode;
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
         * FacePictureBase64.
         */
        public Builder facePictureBase64(String facePictureBase64) {
            this.putBodyParameter("FacePictureBase64", facePictureBase64);
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
         * FaceQuality.
         */
        public Builder faceQuality(String faceQuality) {
            this.putQueryParameter("FaceQuality", faceQuality);
            this.faceQuality = faceQuality;
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
         * Occlusion.
         */
        public Builder occlusion(String occlusion) {
            this.putQueryParameter("Occlusion", occlusion);
            this.occlusion = occlusion;
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
        public FaceLivenessRequest build() {
            return new FaceLivenessRequest(this);
        } 

    } 

}
