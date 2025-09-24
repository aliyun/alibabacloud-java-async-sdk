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
 * {@link FaceDuplicationCheckIntlRequest} extends {@link RequestModel}
 *
 * <p>FaceDuplicationCheckIntlRequest</p>
 */
public class FaceDuplicationCheckIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRegistration")
    private String autoRegistration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceGroupCodes")
    private String faceGroupCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceRegisterGroupCode")
    private String faceRegisterGroupCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceVerifyThreshold")
    private String faceVerifyThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Liveness")
    private String liveness;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReturnFaces")
    private String returnFaces;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SaveFacePicture")
    private String saveFacePicture;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceFacePicture")
    private String sourceFacePicture;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceFacePictureUrl")
    private String sourceFacePictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetFacePicture")
    private String targetFacePicture;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetFacePictureUrl")
    private String targetFacePictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VerifyModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyModel;

    private FaceDuplicationCheckIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRegistration = builder.autoRegistration;
        this.faceGroupCodes = builder.faceGroupCodes;
        this.faceRegisterGroupCode = builder.faceRegisterGroupCode;
        this.faceVerifyThreshold = builder.faceVerifyThreshold;
        this.liveness = builder.liveness;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.productCode = builder.productCode;
        this.returnFaces = builder.returnFaces;
        this.saveFacePicture = builder.saveFacePicture;
        this.sceneCode = builder.sceneCode;
        this.sourceFacePicture = builder.sourceFacePicture;
        this.sourceFacePictureUrl = builder.sourceFacePictureUrl;
        this.targetFacePicture = builder.targetFacePicture;
        this.targetFacePictureUrl = builder.targetFacePictureUrl;
        this.verifyModel = builder.verifyModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceDuplicationCheckIntlRequest create() {
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
     * @return autoRegistration
     */
    public String getAutoRegistration() {
        return this.autoRegistration;
    }

    /**
     * @return faceGroupCodes
     */
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
    }

    /**
     * @return faceRegisterGroupCode
     */
    public String getFaceRegisterGroupCode() {
        return this.faceRegisterGroupCode;
    }

    /**
     * @return faceVerifyThreshold
     */
    public String getFaceVerifyThreshold() {
        return this.faceVerifyThreshold;
    }

    /**
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
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

    /**
     * @return returnFaces
     */
    public String getReturnFaces() {
        return this.returnFaces;
    }

    /**
     * @return saveFacePicture
     */
    public String getSaveFacePicture() {
        return this.saveFacePicture;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return sourceFacePicture
     */
    public String getSourceFacePicture() {
        return this.sourceFacePicture;
    }

    /**
     * @return sourceFacePictureUrl
     */
    public String getSourceFacePictureUrl() {
        return this.sourceFacePictureUrl;
    }

    /**
     * @return targetFacePicture
     */
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    /**
     * @return targetFacePictureUrl
     */
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

    /**
     * @return verifyModel
     */
    public String getVerifyModel() {
        return this.verifyModel;
    }

    public static final class Builder extends Request.Builder<FaceDuplicationCheckIntlRequest, Builder> {
        private String regionId; 
        private String autoRegistration; 
        private String faceGroupCodes; 
        private String faceRegisterGroupCode; 
        private String faceVerifyThreshold; 
        private String liveness; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String productCode; 
        private String returnFaces; 
        private String saveFacePicture; 
        private String sceneCode; 
        private String sourceFacePicture; 
        private String sourceFacePictureUrl; 
        private String targetFacePicture; 
        private String targetFacePictureUrl; 
        private String verifyModel; 

        private Builder() {
            super();
        } 

        private Builder(FaceDuplicationCheckIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoRegistration = request.autoRegistration;
            this.faceGroupCodes = request.faceGroupCodes;
            this.faceRegisterGroupCode = request.faceRegisterGroupCode;
            this.faceVerifyThreshold = request.faceVerifyThreshold;
            this.liveness = request.liveness;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.productCode = request.productCode;
            this.returnFaces = request.returnFaces;
            this.saveFacePicture = request.saveFacePicture;
            this.sceneCode = request.sceneCode;
            this.sourceFacePicture = request.sourceFacePicture;
            this.sourceFacePictureUrl = request.sourceFacePictureUrl;
            this.targetFacePicture = request.targetFacePicture;
            this.targetFacePictureUrl = request.targetFacePictureUrl;
            this.verifyModel = request.verifyModel;
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
         * <p>Indicates whether to automatically register the face to the specified face library if no duplicate face is found.</p>
         * <ul>
         * <li>0- Auto-register (default)</li>
         * <li>1- Do not register</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder autoRegistration(String autoRegistration) {
            this.putBodyParameter("AutoRegistration", autoRegistration);
            this.autoRegistration = autoRegistration;
            return this;
        }

        /**
         * <p>The face library code created through the console, supporting up to 10 face libraries simultaneously. When multiple face library codes are passed, they should be separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>1232344，23444</p>
         */
        public Builder faceGroupCodes(String faceGroupCodes) {
            this.putBodyParameter("FaceGroupCodes", faceGroupCodes);
            this.faceGroupCodes = faceGroupCodes;
            return this;
        }

        /**
         * <p>Face registration library.</p>
         * 
         * <strong>example:</strong>
         * <p>0e0c34a77f</p>
         */
        public Builder faceRegisterGroupCode(String faceRegisterGroupCode) {
            this.putBodyParameter("FaceRegisterGroupCode", faceRegisterGroupCode);
            this.faceRegisterGroupCode = faceRegisterGroupCode;
            return this;
        }

        /**
         * <p>Face matching threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder faceVerifyThreshold(String faceVerifyThreshold) {
            this.putBodyParameter("FaceVerifyThreshold", faceVerifyThreshold);
            this.faceVerifyThreshold = faceVerifyThreshold;
            return this;
        }

        /**
         * <p>Whether to enable silent liveness detection</p>
         * <ul>
         * <li>0- Disabled</li>
         * <li>1- Enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder liveness(String liveness) {
            this.putBodyParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * <p>A unique business identifier for troubleshooting purposes. It supports a combination of 32 alphanumeric characters, please ensure its uniqueness.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putBodyParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>Your custom user ID or other identifiers that can uniquely identify a specific user, such as a phone number or email address. It is strongly recommended to pre-desensitize the value of this field, for example, by hashing it.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putBodyParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * <p>Product code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FACE_IDU_MIN</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>When there are multiple faces above the matching threshold, you can use this parameter to customize the number of returned faces</p>
         * <ul>
         * <li>Default returns 1</li>
         * <li>Maximum support 5</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnFaces(String returnFaces) {
            this.putBodyParameter("ReturnFaces", returnFaces);
            this.returnFaces = returnFaces;
            return this;
        }

        /**
         * <p>Distinguishes between saving the face image and features</p>
         * <ul>
         * <li>0- Face (default)</li>
         * <li>1- Features</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder saveFacePicture(String saveFacePicture) {
            this.putBodyParameter("SaveFacePicture", saveFacePicture);
            this.saveFacePicture = saveFacePicture;
            return this;
        }

        /**
         * <p>Your custom authentication scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>Base64 encoded portrait photo.</p>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        public Builder sourceFacePicture(String sourceFacePicture) {
            this.putBodyParameter("SourceFacePicture", sourceFacePicture);
            this.sourceFacePicture = sourceFacePicture;
            return this;
        }

        /**
         * <p>Portrait image URL, accessible via public HTTP or HTTPS link.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***face1.jpeg</p>
         */
        public Builder sourceFacePictureUrl(String sourceFacePictureUrl) {
            this.putBodyParameter("SourceFacePictureUrl", sourceFacePictureUrl);
            this.sourceFacePictureUrl = sourceFacePictureUrl;
            return this;
        }

        /**
         * <p>Base64 encoded portrait photo.</p>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        public Builder targetFacePicture(String targetFacePicture) {
            this.putBodyParameter("TargetFacePicture", targetFacePicture);
            this.targetFacePicture = targetFacePicture;
            return this;
        }

        /**
         * <p>Portrait image URL, accessible via public HTTP or HTTPS link.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***face2.jpeg</p>
         */
        public Builder targetFacePictureUrl(String targetFacePictureUrl) {
            this.putBodyParameter("TargetFacePictureUrl", targetFacePictureUrl);
            this.targetFacePictureUrl = targetFacePictureUrl;
            return this;
        }

        /**
         * <p>Verification type</p>
         * <ul>
         * <li>0- 1:N (default)</li>
         * <li>1- 1:1</li>
         * <li>2- 1:N + 1:1</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder verifyModel(String verifyModel) {
            this.putBodyParameter("VerifyModel", verifyModel);
            this.verifyModel = verifyModel;
            return this;
        }

        @Override
        public FaceDuplicationCheckIntlRequest build() {
            return new FaceDuplicationCheckIntlRequest(this);
        } 

    } 

}
