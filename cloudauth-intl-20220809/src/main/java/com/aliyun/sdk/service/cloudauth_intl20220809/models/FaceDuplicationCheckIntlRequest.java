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
         * AutoRegistration.
         */
        public Builder autoRegistration(String autoRegistration) {
            this.putBodyParameter("AutoRegistration", autoRegistration);
            this.autoRegistration = autoRegistration;
            return this;
        }

        /**
         * FaceGroupCodes.
         */
        public Builder faceGroupCodes(String faceGroupCodes) {
            this.putBodyParameter("FaceGroupCodes", faceGroupCodes);
            this.faceGroupCodes = faceGroupCodes;
            return this;
        }

        /**
         * FaceRegisterGroupCode.
         */
        public Builder faceRegisterGroupCode(String faceRegisterGroupCode) {
            this.putBodyParameter("FaceRegisterGroupCode", faceRegisterGroupCode);
            this.faceRegisterGroupCode = faceRegisterGroupCode;
            return this;
        }

        /**
         * FaceVerifyThreshold.
         */
        public Builder faceVerifyThreshold(String faceVerifyThreshold) {
            this.putBodyParameter("FaceVerifyThreshold", faceVerifyThreshold);
            this.faceVerifyThreshold = faceVerifyThreshold;
            return this;
        }

        /**
         * Liveness.
         */
        public Builder liveness(String liveness) {
            this.putBodyParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
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
         * ReturnFaces.
         */
        public Builder returnFaces(String returnFaces) {
            this.putBodyParameter("ReturnFaces", returnFaces);
            this.returnFaces = returnFaces;
            return this;
        }

        /**
         * SaveFacePicture.
         */
        public Builder saveFacePicture(String saveFacePicture) {
            this.putBodyParameter("SaveFacePicture", saveFacePicture);
            this.saveFacePicture = saveFacePicture;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * SourceFacePicture.
         */
        public Builder sourceFacePicture(String sourceFacePicture) {
            this.putBodyParameter("SourceFacePicture", sourceFacePicture);
            this.sourceFacePicture = sourceFacePicture;
            return this;
        }

        /**
         * SourceFacePictureUrl.
         */
        public Builder sourceFacePictureUrl(String sourceFacePictureUrl) {
            this.putBodyParameter("SourceFacePictureUrl", sourceFacePictureUrl);
            this.sourceFacePictureUrl = sourceFacePictureUrl;
            return this;
        }

        /**
         * TargetFacePicture.
         */
        public Builder targetFacePicture(String targetFacePicture) {
            this.putBodyParameter("TargetFacePicture", targetFacePicture);
            this.targetFacePicture = targetFacePicture;
            return this;
        }

        /**
         * TargetFacePictureUrl.
         */
        public Builder targetFacePictureUrl(String targetFacePictureUrl) {
            this.putBodyParameter("TargetFacePictureUrl", targetFacePictureUrl);
            this.targetFacePictureUrl = targetFacePictureUrl;
            return this;
        }

        /**
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
