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
 * {@link FaceLivenessRequest} extends {@link RequestModel}
 *
 * <p>FaceLivenessRequest</p>
 */
public class FaceLivenessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Crop")
    private String crop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceAttributeCheck")
    private String faceAttributeCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FacePictureBase64")
    private String facePictureBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePictureUrl")
    private String facePictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceQuality")
    private String faceQuality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceQualityCheck")
    private String faceQualityCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Occlusion")
    private String occlusion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    private FaceLivenessRequest(Builder builder) {
        super(builder);
        this.crop = builder.crop;
        this.faceAttributeCheck = builder.faceAttributeCheck;
        this.facePictureBase64 = builder.facePictureBase64;
        this.facePictureUrl = builder.facePictureUrl;
        this.faceQuality = builder.faceQuality;
        this.faceQualityCheck = builder.faceQualityCheck;
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
     * @return faceAttributeCheck
     */
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
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
     * @return faceQualityCheck
     */
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
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
        private String faceAttributeCheck; 
        private String facePictureBase64; 
        private String facePictureUrl; 
        private String faceQuality; 
        private String faceQualityCheck; 
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
            this.faceAttributeCheck = request.faceAttributeCheck;
            this.facePictureBase64 = request.facePictureBase64;
            this.facePictureUrl = request.facePictureUrl;
            this.faceQuality = request.faceQuality;
            this.faceQualityCheck = request.faceQualityCheck;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.occlusion = request.occlusion;
            this.productCode = request.productCode;
        } 

        /**
         * <p>Specifies whether to allow cropping. Default value: F. Valid values:</p>
         * <ul>
         * <li>T: enabled.</li>
         * <li>F: disabled. (Default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder crop(String crop) {
            this.putQueryParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * FaceAttributeCheck.
         */
        public Builder faceAttributeCheck(String faceAttributeCheck) {
            this.putQueryParameter("FaceAttributeCheck", faceAttributeCheck);
            this.faceAttributeCheck = faceAttributeCheck;
            return this;
        }

        /**
         * <p>The Base64-encoded face photo.</p>
         * <p>Note:</p>
         * <ul>
         * <li>If you use FacePictureBase64 (Base64-encoded photo) to pass in the face photo, check the photo size and do not pass in an excessively large photo.</li>
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
         * <p>Specifies whether to output the face quality score. Default value: F. Valid values:</p>
         * <ul>
         * <li>T: enabled.</li>
         * <li>F: disabled. (Default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder faceQuality(String faceQuality) {
            this.putQueryParameter("FaceQuality", faceQuality);
            this.faceQuality = faceQuality;
            return this;
        }

        /**
         * <p>The face quality check.</p>
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
         * <p>The merchant-defined unique business ID used for subsequent troubleshooting. The value can contain letters and digits with a maximum length of 32 characters. Ensure that the value is unique.</p>
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
         * <p>The merchant user ID or another identifier that can be used to identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of the userId field before passing it in, for example, by hashing the value.</p>
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
         * <p>Specifies whether to perform occlusion detection. Default value: F. Valid values:</p>
         * <ul>
         * <li>T: enabled.</li>
         * <li>F: disabled. (Default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder occlusion(String occlusion) {
            this.putQueryParameter("Occlusion", occlusion);
            this.occlusion = occlusion;
            return this;
        }

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>FACE_LIVENESS_MIN</p>
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
