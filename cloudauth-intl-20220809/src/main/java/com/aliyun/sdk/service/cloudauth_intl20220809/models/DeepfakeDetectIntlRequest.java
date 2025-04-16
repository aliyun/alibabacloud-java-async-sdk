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
 * {@link DeepfakeDetectIntlRequest} extends {@link RequestModel}
 *
 * <p>DeepfakeDetectIntlRequest</p>
 */
public class DeepfakeDetectIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceBase64")
    private String faceBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceInputType")
    private String faceInputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceUrl")
    private String faceUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    private DeepfakeDetectIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.faceBase64 = builder.faceBase64;
        this.faceInputType = builder.faceInputType;
        this.faceUrl = builder.faceUrl;
        this.merchantBizId = builder.merchantBizId;
        this.productCode = builder.productCode;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeepfakeDetectIntlRequest create() {
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
     * @return faceBase64
     */
    public String getFaceBase64() {
        return this.faceBase64;
    }

    /**
     * @return faceInputType
     */
    public String getFaceInputType() {
        return this.faceInputType;
    }

    /**
     * @return faceUrl
     */
    public String getFaceUrl() {
        return this.faceUrl;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
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

    public static final class Builder extends Request.Builder<DeepfakeDetectIntlRequest, Builder> {
        private String regionId; 
        private String faceBase64; 
        private String faceInputType; 
        private String faceUrl; 
        private String merchantBizId; 
        private String productCode; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(DeepfakeDetectIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.faceBase64 = request.faceBase64;
            this.faceInputType = request.faceInputType;
            this.faceUrl = request.faceUrl;
            this.merchantBizId = request.merchantBizId;
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
         * FaceBase64.
         */
        public Builder faceBase64(String faceBase64) {
            this.putBodyParameter("FaceBase64", faceBase64);
            this.faceBase64 = faceBase64;
            return this;
        }

        /**
         * FaceInputType.
         */
        public Builder faceInputType(String faceInputType) {
            this.putQueryParameter("FaceInputType", faceInputType);
            this.faceInputType = faceInputType;
            return this;
        }

        /**
         * FaceUrl.
         */
        public Builder faceUrl(String faceUrl) {
            this.putQueryParameter("FaceUrl", faceUrl);
            this.faceUrl = faceUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FACE_DEEPFAKE</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public DeepfakeDetectIntlRequest build() {
            return new DeepfakeDetectIntlRequest(this);
        } 

    } 

}
