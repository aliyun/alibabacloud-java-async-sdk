// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link InitFaceVerifyRequest} extends {@link RequestModel}
 *
 * <p>InitFaceVerifyRequest</p>
 */
public class InitFaceVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppQualityCheck")
    private String appQualityCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthId")
    private String authId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Birthday")
    private String birthday;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackToken")
    private String callbackToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CameraSelection")
    private String cameraSelection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertNo")
    private String certNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    private String certifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyUrlStyle")
    private String certifyUrlStyle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyUrlType")
    private String certifyUrlType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Crop")
    private String crop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptType")
    private String encryptType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceContrastPicture")
    @com.aliyun.core.annotation.Validation(maxLength = 1548576)
    private String faceContrastPicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceContrastPictureUrl")
    private String faceContrastPictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceGuardOutput")
    private String faceGuardOutput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaInfo")
    private String metaInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectName")
    private String ossObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterOrderNo")
    private String outerOrderNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcedurePriority")
    private String procedurePriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RarelyCharacters")
    private String rarelyCharacters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadImg")
    private String readImg;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnUrl")
    private String returnUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuitableType")
    private String suitableType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UiCustomUrl")
    private String uiCustomUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidityDate")
    private String validityDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoEvidence")
    private String videoEvidence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoluntaryCustomizedContent")
    private String voluntaryCustomizedContent;

    private InitFaceVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appQualityCheck = builder.appQualityCheck;
        this.authId = builder.authId;
        this.birthday = builder.birthday;
        this.callbackToken = builder.callbackToken;
        this.callbackUrl = builder.callbackUrl;
        this.cameraSelection = builder.cameraSelection;
        this.certName = builder.certName;
        this.certNo = builder.certNo;
        this.certType = builder.certType;
        this.certifyId = builder.certifyId;
        this.certifyUrlStyle = builder.certifyUrlStyle;
        this.certifyUrlType = builder.certifyUrlType;
        this.crop = builder.crop;
        this.encryptType = builder.encryptType;
        this.faceContrastPicture = builder.faceContrastPicture;
        this.faceContrastPictureUrl = builder.faceContrastPictureUrl;
        this.faceGuardOutput = builder.faceGuardOutput;
        this.ip = builder.ip;
        this.metaInfo = builder.metaInfo;
        this.mobile = builder.mobile;
        this.mode = builder.mode;
        this.model = builder.model;
        this.ossBucketName = builder.ossBucketName;
        this.ossObjectName = builder.ossObjectName;
        this.outerOrderNo = builder.outerOrderNo;
        this.procedurePriority = builder.procedurePriority;
        this.productCode = builder.productCode;
        this.rarelyCharacters = builder.rarelyCharacters;
        this.readImg = builder.readImg;
        this.returnUrl = builder.returnUrl;
        this.sceneId = builder.sceneId;
        this.suitableType = builder.suitableType;
        this.uiCustomUrl = builder.uiCustomUrl;
        this.userId = builder.userId;
        this.validityDate = builder.validityDate;
        this.videoEvidence = builder.videoEvidence;
        this.voluntaryCustomizedContent = builder.voluntaryCustomizedContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitFaceVerifyRequest create() {
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
     * @return appQualityCheck
     */
    public String getAppQualityCheck() {
        return this.appQualityCheck;
    }

    /**
     * @return authId
     */
    public String getAuthId() {
        return this.authId;
    }

    /**
     * @return birthday
     */
    public String getBirthday() {
        return this.birthday;
    }

    /**
     * @return callbackToken
     */
    public String getCallbackToken() {
        return this.callbackToken;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return cameraSelection
     */
    public String getCameraSelection() {
        return this.cameraSelection;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certNo
     */
    public String getCertNo() {
        return this.certNo;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    /**
     * @return certifyUrlStyle
     */
    public String getCertifyUrlStyle() {
        return this.certifyUrlStyle;
    }

    /**
     * @return certifyUrlType
     */
    public String getCertifyUrlType() {
        return this.certifyUrlType;
    }

    /**
     * @return crop
     */
    public String getCrop() {
        return this.crop;
    }

    /**
     * @return encryptType
     */
    public String getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return faceContrastPicture
     */
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    /**
     * @return faceContrastPictureUrl
     */
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    /**
     * @return faceGuardOutput
     */
    public String getFaceGuardOutput() {
        return this.faceGuardOutput;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return metaInfo
     */
    public String getMetaInfo() {
        return this.metaInfo;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossObjectName
     */
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    /**
     * @return procedurePriority
     */
    public String getProcedurePriority() {
        return this.procedurePriority;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return rarelyCharacters
     */
    public String getRarelyCharacters() {
        return this.rarelyCharacters;
    }

    /**
     * @return readImg
     */
    public String getReadImg() {
        return this.readImg;
    }

    /**
     * @return returnUrl
     */
    public String getReturnUrl() {
        return this.returnUrl;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return suitableType
     */
    public String getSuitableType() {
        return this.suitableType;
    }

    /**
     * @return uiCustomUrl
     */
    public String getUiCustomUrl() {
        return this.uiCustomUrl;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return validityDate
     */
    public String getValidityDate() {
        return this.validityDate;
    }

    /**
     * @return videoEvidence
     */
    public String getVideoEvidence() {
        return this.videoEvidence;
    }

    /**
     * @return voluntaryCustomizedContent
     */
    public String getVoluntaryCustomizedContent() {
        return this.voluntaryCustomizedContent;
    }

    public static final class Builder extends Request.Builder<InitFaceVerifyRequest, Builder> {
        private String regionId; 
        private String appQualityCheck; 
        private String authId; 
        private String birthday; 
        private String callbackToken; 
        private String callbackUrl; 
        private String cameraSelection; 
        private String certName; 
        private String certNo; 
        private String certType; 
        private String certifyId; 
        private String certifyUrlStyle; 
        private String certifyUrlType; 
        private String crop; 
        private String encryptType; 
        private String faceContrastPicture; 
        private String faceContrastPictureUrl; 
        private String faceGuardOutput; 
        private String ip; 
        private String metaInfo; 
        private String mobile; 
        private String mode; 
        private String model; 
        private String ossBucketName; 
        private String ossObjectName; 
        private String outerOrderNo; 
        private String procedurePriority; 
        private String productCode; 
        private String rarelyCharacters; 
        private String readImg; 
        private String returnUrl; 
        private Long sceneId; 
        private String suitableType; 
        private String uiCustomUrl; 
        private String userId; 
        private String validityDate; 
        private String videoEvidence; 
        private String voluntaryCustomizedContent; 

        private Builder() {
            super();
        } 

        private Builder(InitFaceVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appQualityCheck = request.appQualityCheck;
            this.authId = request.authId;
            this.birthday = request.birthday;
            this.callbackToken = request.callbackToken;
            this.callbackUrl = request.callbackUrl;
            this.cameraSelection = request.cameraSelection;
            this.certName = request.certName;
            this.certNo = request.certNo;
            this.certType = request.certType;
            this.certifyId = request.certifyId;
            this.certifyUrlStyle = request.certifyUrlStyle;
            this.certifyUrlType = request.certifyUrlType;
            this.crop = request.crop;
            this.encryptType = request.encryptType;
            this.faceContrastPicture = request.faceContrastPicture;
            this.faceContrastPictureUrl = request.faceContrastPictureUrl;
            this.faceGuardOutput = request.faceGuardOutput;
            this.ip = request.ip;
            this.metaInfo = request.metaInfo;
            this.mobile = request.mobile;
            this.mode = request.mode;
            this.model = request.model;
            this.ossBucketName = request.ossBucketName;
            this.ossObjectName = request.ossObjectName;
            this.outerOrderNo = request.outerOrderNo;
            this.procedurePriority = request.procedurePriority;
            this.productCode = request.productCode;
            this.rarelyCharacters = request.rarelyCharacters;
            this.readImg = request.readImg;
            this.returnUrl = request.returnUrl;
            this.sceneId = request.sceneId;
            this.suitableType = request.suitableType;
            this.uiCustomUrl = request.uiCustomUrl;
            this.userId = request.userId;
            this.validityDate = request.validityDate;
            this.videoEvidence = request.videoEvidence;
            this.voluntaryCustomizedContent = request.voluntaryCustomizedContent;
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
         * AppQualityCheck.
         */
        public Builder appQualityCheck(String appQualityCheck) {
            this.putQueryParameter("AppQualityCheck", appQualityCheck);
            this.appQualityCheck = appQualityCheck;
            return this;
        }

        /**
         * AuthId.
         */
        public Builder authId(String authId) {
            this.putBodyParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * Birthday.
         */
        public Builder birthday(String birthday) {
            this.putQueryParameter("Birthday", birthday);
            this.birthday = birthday;
            return this;
        }

        /**
         * CallbackToken.
         */
        public Builder callbackToken(String callbackToken) {
            this.putQueryParameter("CallbackToken", callbackToken);
            this.callbackToken = callbackToken;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * CameraSelection.
         */
        public Builder cameraSelection(String cameraSelection) {
            this.putQueryParameter("CameraSelection", cameraSelection);
            this.cameraSelection = cameraSelection;
            return this;
        }

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * CertNo.
         */
        public Builder certNo(String certNo) {
            this.putQueryParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * CertType.
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * CertifyId.
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * CertifyUrlStyle.
         */
        public Builder certifyUrlStyle(String certifyUrlStyle) {
            this.putQueryParameter("CertifyUrlStyle", certifyUrlStyle);
            this.certifyUrlStyle = certifyUrlStyle;
            return this;
        }

        /**
         * CertifyUrlType.
         */
        public Builder certifyUrlType(String certifyUrlType) {
            this.putQueryParameter("CertifyUrlType", certifyUrlType);
            this.certifyUrlType = certifyUrlType;
            return this;
        }

        /**
         * Crop.
         */
        public Builder crop(String crop) {
            this.putBodyParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * EncryptType.
         */
        public Builder encryptType(String encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * FaceContrastPicture.
         */
        public Builder faceContrastPicture(String faceContrastPicture) {
            this.putBodyParameter("FaceContrastPicture", faceContrastPicture);
            this.faceContrastPicture = faceContrastPicture;
            return this;
        }

        /**
         * FaceContrastPictureUrl.
         */
        public Builder faceContrastPictureUrl(String faceContrastPictureUrl) {
            this.putQueryParameter("FaceContrastPictureUrl", faceContrastPictureUrl);
            this.faceContrastPictureUrl = faceContrastPictureUrl;
            return this;
        }

        /**
         * FaceGuardOutput.
         */
        public Builder faceGuardOutput(String faceGuardOutput) {
            this.putQueryParameter("FaceGuardOutput", faceGuardOutput);
            this.faceGuardOutput = faceGuardOutput;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * MetaInfo.
         */
        public Builder metaInfo(String metaInfo) {
            this.putQueryParameter("MetaInfo", metaInfo);
            this.metaInfo = metaInfo;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssObjectName.
         */
        public Builder ossObjectName(String ossObjectName) {
            this.putQueryParameter("OssObjectName", ossObjectName);
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * OuterOrderNo.
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putQueryParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * ProcedurePriority.
         */
        public Builder procedurePriority(String procedurePriority) {
            this.putQueryParameter("ProcedurePriority", procedurePriority);
            this.procedurePriority = procedurePriority;
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
         * RarelyCharacters.
         */
        public Builder rarelyCharacters(String rarelyCharacters) {
            this.putQueryParameter("RarelyCharacters", rarelyCharacters);
            this.rarelyCharacters = rarelyCharacters;
            return this;
        }

        /**
         * ReadImg.
         */
        public Builder readImg(String readImg) {
            this.putQueryParameter("ReadImg", readImg);
            this.readImg = readImg;
            return this;
        }

        /**
         * ReturnUrl.
         */
        public Builder returnUrl(String returnUrl) {
            this.putQueryParameter("ReturnUrl", returnUrl);
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * SuitableType.
         */
        public Builder suitableType(String suitableType) {
            this.putQueryParameter("SuitableType", suitableType);
            this.suitableType = suitableType;
            return this;
        }

        /**
         * UiCustomUrl.
         */
        public Builder uiCustomUrl(String uiCustomUrl) {
            this.putQueryParameter("UiCustomUrl", uiCustomUrl);
            this.uiCustomUrl = uiCustomUrl;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * ValidityDate.
         */
        public Builder validityDate(String validityDate) {
            this.putQueryParameter("ValidityDate", validityDate);
            this.validityDate = validityDate;
            return this;
        }

        /**
         * VideoEvidence.
         */
        public Builder videoEvidence(String videoEvidence) {
            this.putQueryParameter("VideoEvidence", videoEvidence);
            this.videoEvidence = videoEvidence;
            return this;
        }

        /**
         * VoluntaryCustomizedContent.
         */
        public Builder voluntaryCustomizedContent(String voluntaryCustomizedContent) {
            this.putQueryParameter("VoluntaryCustomizedContent", voluntaryCustomizedContent);
            this.voluntaryCustomizedContent = voluntaryCustomizedContent;
            return this;
        }

        @Override
        public InitFaceVerifyRequest build() {
            return new InitFaceVerifyRequest(this);
        } 

    } 

}
