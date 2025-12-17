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
 * {@link FaceCrossCompareIntlRequest} extends {@link RequestModel}
 *
 * <p>FaceCrossCompareIntlRequest</p>
 */
public class FaceCrossCompareIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompareModel")
    private String compareModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceVerifyThreshold")
    private String faceVerifyThreshold;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceAFacePicture")
    private String sourceAFacePicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceAFacePictureUrl")
    private String sourceAFacePictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceBFacePicture")
    private String sourceBFacePicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceBFacePictureUrl")
    private String sourceBFacePictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceCFacePicture")
    private String sourceCFacePicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCFacePictureUrl")
    private String sourceCFacePictureUrl;

    private FaceCrossCompareIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.compareModel = builder.compareModel;
        this.faceVerifyThreshold = builder.faceVerifyThreshold;
        this.merchantBizId = builder.merchantBizId;
        this.productCode = builder.productCode;
        this.sceneCode = builder.sceneCode;
        this.sourceAFacePicture = builder.sourceAFacePicture;
        this.sourceAFacePictureUrl = builder.sourceAFacePictureUrl;
        this.sourceBFacePicture = builder.sourceBFacePicture;
        this.sourceBFacePictureUrl = builder.sourceBFacePictureUrl;
        this.sourceCFacePicture = builder.sourceCFacePicture;
        this.sourceCFacePictureUrl = builder.sourceCFacePictureUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceCrossCompareIntlRequest create() {
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
     * @return compareModel
     */
    public String getCompareModel() {
        return this.compareModel;
    }

    /**
     * @return faceVerifyThreshold
     */
    public String getFaceVerifyThreshold() {
        return this.faceVerifyThreshold;
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

    /**
     * @return sourceAFacePicture
     */
    public String getSourceAFacePicture() {
        return this.sourceAFacePicture;
    }

    /**
     * @return sourceAFacePictureUrl
     */
    public String getSourceAFacePictureUrl() {
        return this.sourceAFacePictureUrl;
    }

    /**
     * @return sourceBFacePicture
     */
    public String getSourceBFacePicture() {
        return this.sourceBFacePicture;
    }

    /**
     * @return sourceBFacePictureUrl
     */
    public String getSourceBFacePictureUrl() {
        return this.sourceBFacePictureUrl;
    }

    /**
     * @return sourceCFacePicture
     */
    public String getSourceCFacePicture() {
        return this.sourceCFacePicture;
    }

    /**
     * @return sourceCFacePictureUrl
     */
    public String getSourceCFacePictureUrl() {
        return this.sourceCFacePictureUrl;
    }

    public static final class Builder extends Request.Builder<FaceCrossCompareIntlRequest, Builder> {
        private String regionId; 
        private String compareModel; 
        private String faceVerifyThreshold; 
        private String merchantBizId; 
        private String productCode; 
        private String sceneCode; 
        private String sourceAFacePicture; 
        private String sourceAFacePictureUrl; 
        private String sourceBFacePicture; 
        private String sourceBFacePictureUrl; 
        private String sourceCFacePicture; 
        private String sourceCFacePictureUrl; 

        private Builder() {
            super();
        } 

        private Builder(FaceCrossCompareIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.compareModel = request.compareModel;
            this.faceVerifyThreshold = request.faceVerifyThreshold;
            this.merchantBizId = request.merchantBizId;
            this.productCode = request.productCode;
            this.sceneCode = request.sceneCode;
            this.sourceAFacePicture = request.sourceAFacePicture;
            this.sourceAFacePictureUrl = request.sourceAFacePictureUrl;
            this.sourceBFacePicture = request.sourceBFacePicture;
            this.sourceBFacePictureUrl = request.sourceBFacePictureUrl;
            this.sourceCFacePicture = request.sourceCFacePicture;
            this.sourceCFacePictureUrl = request.sourceCFacePictureUrl;
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
         * <p>Comparison mode</p>
         * <ul>
         * <li>0-Chain comparison (default): A:B and B:C</li>
         * <li>1-Circular comparison: A:B and B:C and C:A</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder compareModel(String compareModel) {
            this.putQueryParameter("CompareModel", compareModel);
            this.compareModel = compareModel;
            return this;
        }

        /**
         * <p>Face matching threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder faceVerifyThreshold(String faceVerifyThreshold) {
            this.putQueryParameter("FaceVerifyThreshold", faceVerifyThreshold);
            this.faceVerifyThreshold = faceVerifyThreshold;
            return this;
        }

        /**
         * <p>A unique business identifier for subsequent troubleshooting. It supports a combination of 32 alphanumeric characters, please ensure its uniqueness.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>Product solution to be integrated. Value: 
         * FACE_CROSS_COMPARE</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FACE_CROSS_COMPARE</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Custom business scenario ID</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * SourceAFacePicture.
         */
        public Builder sourceAFacePicture(String sourceAFacePicture) {
            this.putBodyParameter("SourceAFacePicture", sourceAFacePicture);
            this.sourceAFacePicture = sourceAFacePicture;
            return this;
        }

        /**
         * <p>Portrait image URL, accessible via HTTP or HTTPS on the public network.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.xxx.com/1.jpg">https://www.xxx.com/1.jpg</a></p>
         */
        public Builder sourceAFacePictureUrl(String sourceAFacePictureUrl) {
            this.putQueryParameter("SourceAFacePictureUrl", sourceAFacePictureUrl);
            this.sourceAFacePictureUrl = sourceAFacePictureUrl;
            return this;
        }

        /**
         * SourceBFacePicture.
         */
        public Builder sourceBFacePicture(String sourceBFacePicture) {
            this.putBodyParameter("SourceBFacePicture", sourceBFacePicture);
            this.sourceBFacePicture = sourceBFacePicture;
            return this;
        }

        /**
         * <p>Portrait image URL, accessible via HTTP or HTTPS on the public network.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.xxx.com/1.jpg">https://www.xxx.com/1.jpg</a></p>
         */
        public Builder sourceBFacePictureUrl(String sourceBFacePictureUrl) {
            this.putQueryParameter("SourceBFacePictureUrl", sourceBFacePictureUrl);
            this.sourceBFacePictureUrl = sourceBFacePictureUrl;
            return this;
        }

        /**
         * SourceCFacePicture.
         */
        public Builder sourceCFacePicture(String sourceCFacePicture) {
            this.putBodyParameter("SourceCFacePicture", sourceCFacePicture);
            this.sourceCFacePicture = sourceCFacePicture;
            return this;
        }

        /**
         * <p>Portrait image URL, accessible via HTTP or HTTPS on the public network.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.xxx.com/1.jpg">https://www.xxx.com/1.jpg</a></p>
         */
        public Builder sourceCFacePictureUrl(String sourceCFacePictureUrl) {
            this.putQueryParameter("SourceCFacePictureUrl", sourceCFacePictureUrl);
            this.sourceCFacePictureUrl = sourceCFacePictureUrl;
            return this;
        }

        @Override
        public FaceCrossCompareIntlRequest build() {
            return new FaceCrossCompareIntlRequest(this);
        } 

    } 

}
