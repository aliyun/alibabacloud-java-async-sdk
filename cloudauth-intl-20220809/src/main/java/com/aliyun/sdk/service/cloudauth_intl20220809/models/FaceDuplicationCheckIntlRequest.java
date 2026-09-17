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
    @com.aliyun.core.annotation.NameInMap("FaceAttributeCheck")
    private String faceAttributeCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceGroupCodes")
    private String faceGroupCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceQualityCheck")
    private String faceQualityCheck;

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
    @com.aliyun.core.annotation.NameInMap("UpdateFaceIfUserExists")
    private String updateFaceIfUserExists;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VerifyModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyModel;

    private FaceDuplicationCheckIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRegistration = builder.autoRegistration;
        this.faceAttributeCheck = builder.faceAttributeCheck;
        this.faceGroupCodes = builder.faceGroupCodes;
        this.faceQualityCheck = builder.faceQualityCheck;
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
        this.updateFaceIfUserExists = builder.updateFaceIfUserExists;
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
     * @return faceAttributeCheck
     */
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
    }

    /**
     * @return faceGroupCodes
     */
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
    }

    /**
     * @return faceQualityCheck
     */
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
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
     * @return updateFaceIfUserExists
     */
    public String getUpdateFaceIfUserExists() {
        return this.updateFaceIfUserExists;
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
        private String faceAttributeCheck; 
        private String faceGroupCodes; 
        private String faceQualityCheck; 
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
        private String updateFaceIfUserExists; 
        private String verifyModel; 

        private Builder() {
            super();
        } 

        private Builder(FaceDuplicationCheckIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoRegistration = request.autoRegistration;
            this.faceAttributeCheck = request.faceAttributeCheck;
            this.faceGroupCodes = request.faceGroupCodes;
            this.faceQualityCheck = request.faceQualityCheck;
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
            this.updateFaceIfUserExists = request.updateFaceIfUserExists;
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
         * <p>Specifies whether to automatically register the face to the specified face library when no duplicate face is found during the search. Valid values:</p>
         * <ul>
         * <li>0: automatic registration</li>
         * <li>1: no registration (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRegistration(String autoRegistration) {
            this.putBodyParameter("AutoRegistration", autoRegistration);
            this.autoRegistration = autoRegistration;
            return this;
        }

        /**
         * FaceAttributeCheck.
         */
        public Builder faceAttributeCheck(String faceAttributeCheck) {
            this.putBodyParameter("FaceAttributeCheck", faceAttributeCheck);
            this.faceAttributeCheck = faceAttributeCheck;
            return this;
        }

        /**
         * <p>The face library codes created by the customer through the console. A maximum of 10 face libraries can be queried simultaneously. Separate multiple face library codes with commas.</p>
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
         * <p>The face quality check.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder faceQualityCheck(String faceQualityCheck) {
            this.putBodyParameter("FaceQualityCheck", faceQualityCheck);
            this.faceQualityCheck = faceQualityCheck;
            return this;
        }

        /**
         * <p>The face library for registration.</p>
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
         * <p>The face matching threshold.&gt;Warning: This is a reserved field and is not currently enabled.</warning></p>
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
         * <p>Specifies whether to enable passive liveness detection. Valid values:</p>
         * <ul>
         * <li>0: disabled</li>
         * <li>1: enabled</li>
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
         * <p>The custom unique business identifier used for subsequent troubleshooting. The value supports a combination of letters and numbers with a length of 32 characters. Ensure that the value is unique.</p>
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
         * <p>The custom user ID or other identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of this field in advance, such as by hashing the value.</p>
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
         * <p>The product code.</p>
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
         * <p>Specifies the number of faces to return when multiple faces above the matching threshold exist. You can customize the return quantity through this parameter.</p>
         * <ul>
         * <li>Default value: 1</li>
         * <li>Maximum value: 5</li>
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
         * <p>Specifies the type of face data to save. Valid values:</p>
         * <ul>
         * <li>0: face image (default)</li>
         * <li>1: feature<blockquote>
         * <p>Warning: This is a reserved field and is not currently enabled.</warning></p>
         * </blockquote>
         * </li>
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
         * <p>The custom verification scenario ID.</p>
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
         * <p>The Base64-encoded face photo.</p>
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
         * <p>The URL of the face image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
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
         * <p>The Base64-encoded face photo.</p>
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
         * <p>The URL of the face image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
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
         * <p>Specifies whether to overwrite the existing face with the current face when MerchantUserId already exists during automatic registration. Valid values: Y: overwrite. N: do not overwrite and return that the UserId already exists.</p>
         */
        public Builder updateFaceIfUserExists(String updateFaceIfUserExists) {
            this.putBodyParameter("UpdateFaceIfUserExists", updateFaceIfUserExists);
            this.updateFaceIfUserExists = updateFaceIfUserExists;
            return this;
        }

        /**
         * <p>The verification type. Valid values:</p>
         * <ul>
         * <li><p>0: retrieve pattern</p>
         * <blockquote>
         * <ul>
         * <li>Feature: Submits a face library and a user face image (sourceFacePicture). The system automatically retrieves the face library to determine whether the specified face image (sourceFacePicture) already exists. Passive liveness detection can be enabled for the face image (sourceFacePicture).</li>
         * <li>Recommended scenario: Real-person create an account where duplicate registration is not allowed.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li><p>1 (default): authenticate pattern</p>
         * <blockquote>
         * <ul>
         * <li>Feature: Submits a specified face image (sourceFacePicture) and a retained face image (TargetFacePicture). The system automatically authenticates whether the faces match. Passive liveness detection can be enabled for the specified face image (sourceFacePicture).</li>
         * <li>Recommended scenario: Authenticating whether the operation is performed by the account owner when modifying logon credentials or account information.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li><p>2: comprehensive pattern</p>
         * <blockquote>
         * <ul>
         * <li>Feature: Submits a face library, a specified face image (sourceFacePicture), and a retained face image (TargetFacePicture). The system automatically retrieves the face library to determine whether the specified face image (sourceFacePicture) exists, authenticates whether it matches the retained face, and supports enabling passive liveness detection for the specified face image (sourceFacePicture).</li>
         * <li>Recommended scenario: Authenticating that the user is new and the operation is performed by the user.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
