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
    @com.aliyun.core.annotation.NameInMap("NeedMultiFaceCheck")
    private String needMultiFaceCheck;

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
        this.needMultiFaceCheck = builder.needMultiFaceCheck;
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
     * @return needMultiFaceCheck
     */
    public String getNeedMultiFaceCheck() {
        return this.needMultiFaceCheck;
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
        private String needMultiFaceCheck; 
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
            this.needMultiFaceCheck = request.needMultiFaceCheck;
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
         * <p>Whether the SDK enables strict face quality detection:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Enable</p>
         * </li>
         * <li><p><strong>N</strong> (default): Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is enabled, the SDK needs to integrate the <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/description-of-sdk-package-clipping?spm=a2c4g.11186623.0.0.1a9d35c6ySFUPW">strict face quality detection module</a>. Enabling strict quality detection may decrease the success rate of user face recognition.</li>
         * <li>Only supported in Android SDK version 2.3.24 and above.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder appQualityCheck(String appQualityCheck) {
            this.putQueryParameter("AppQualityCheck", appQualityCheck);
            this.appQualityCheck = appQualityCheck;
            return this;
        }

        /**
         * <p>User authorization ID, with a maximum length of 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>92d46b9e9e2d703f2897f350d5bd4149</p>
         */
        public Builder authId(String authId) {
            this.putBodyParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * <p>Date of birth on the document.</p>
         * <p>This field is required when the document type <strong>CertType</strong> is <strong>PASSPORT</strong> and <strong>Mode</strong> is <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1993-10-10</p>
         */
        public Builder birthday(String birthday) {
            this.putQueryParameter("Birthday", birthday);
            this.birthday = birthday;
            return this;
        }

        /**
         * <p>Security token, generated by you, used for preventing duplication and tampering.</p>
         * <p>If this value is set, the <strong>CallbackToken</strong> field will be displayed in the callback address.</p>
         * 
         * <strong>example:</strong>
         * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
         */
        public Builder callbackToken(String callbackToken) {
            this.putQueryParameter("CallbackToken", callbackToken);
            this.callbackToken = callbackToken;
            return this;
        }

        /**
         * <p>Callback notification address for the authentication result, with the default callback request method being GET. The callback address must start with <code>https</code>. After completing the authentication, the platform will call back this address and automatically add the <code>certifyId</code> and <code>passed</code> fields, where the value of the <code>passed</code> field is the subcode, for example: <code>https://www.aliyun.com?callbackToken=1000004826&amp;certifyId=shaxxxx&amp;passed=200</code>.</p>
         * <notice>
         * 
         * <ul>
         * <li>Callbacks are triggered only when the authentication is completed (including both successful and unsuccessful authentications). If the authentication is abandoned, interrupted abnormally, or not performed, no notification will be sent. It is recommended that you retrieve detailed authentication information through a query interface if needed after receiving the callback notification.</li>
         * <li>The accessibility of the provided address will be verified before the API call. If the address cannot be accessed over the public network, a 401 error will be returned.</li>
         * <li>The callback interface must return an HTTP status code of 200; otherwise, it will trigger a retry, with two callbacks within 3 seconds.</li>
         * </ul>
         * </notice>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>Whether to enable the camera selection feature:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Enable</p>
         * </li>
         * <li><p><strong>N</strong> (default): Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This feature only takes effect in PC integration mode. When enabled, it allows users to select the camera for authentication.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder cameraSelection(String cameraSelection) {
            this.putQueryParameter("CameraSelection", cameraSelection);
            this.cameraSelection = cameraSelection;
            return this;
        }

        /**
         * <p>Real name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>Document number.</p>
         * 
         * <strong>example:</strong>
         * <p>330103xxxxxxxxxxxx</p>
         */
        public Builder certNo(String certNo) {
            this.putQueryParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * <p>Document type.
         * Currently, only IDENTITY_CARD (ID card) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>IDENTITY_CARD</p>
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * <blockquote>
         * <p>Warning: To be deprecated</p>
         * </blockquote>
         * <p>Previously passed CertifyId for real-person authentication, where the photo taken during authentication is used as the comparison photo.</p>
         * <blockquote>
         * <p>Among the four image input methods (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, OSS), choose one to input.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * <p>Types of <strong>CertifyUrl</strong> returned, including:</p>
         * <ul>
         * <li><p><strong>L</strong>: Original long link</p>
         * </li>
         * <li><p><strong>S</strong> (default): Short link</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>L</p>
         */
        public Builder certifyUrlStyle(String certifyUrlStyle) {
            this.putQueryParameter("CertifyUrlStyle", certifyUrlStyle);
            this.certifyUrlStyle = certifyUrlStyle;
            return this;
        }

        /**
         * <p>Web SDK device type, with values <strong>WEB</strong> or <strong>H5</strong>.</p>
         * <blockquote>
         * <p>Only Web SDK device types are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WEB</p>
         */
        public Builder certifyUrlType(String certifyUrlType) {
            this.putQueryParameter("CertifyUrlType", certifyUrlType);
            this.certifyUrlType = certifyUrlType;
            return this;
        }

        /**
         * <p>Whether to allow cropping of the face image, with the default being not allowed.</p>
         * <ul>
         * <li><p>T: Indicates allowing cropping.</p>
         * </li>
         * <li><p>F: Indicates not allowing cropping.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the image you are requesting is not from a standard liveness detection SDK, it is recommended to allow face image cropping. When this feature is enabled, the requested image will first undergo face cropping and alignment, and then the service request will be initiated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder crop(String crop) {
            this.putBodyParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * <p>Encryption algorithm to be used, currently supporting only the SM2 national encryption algorithm.</p>
         * <p>After enabling encrypted transmission, you need to pass in the encrypted CertName and CertNo. For how to encrypt, please refer to <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/description-of-parameter-encryption?spm=a2c4g.11186623.0.0.1a9d566eWdqwy8#task-2229332">Parameter Encryption Instructions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SM2</p>
         */
        public Builder encryptType(String encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>Base64 encoded photo.</p>
         * <blockquote>
         * <p>Choose one of the following methods to upload the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
         */
        public Builder faceContrastPicture(String faceContrastPicture) {
            this.putBodyParameter("FaceContrastPicture", faceContrastPicture);
            this.faceContrastPicture = faceContrastPicture;
            return this;
        }

        /**
         * <p>OSS photo address, currently only supports authorized OSS photo addresses.</p>
         * <blockquote>
         * <p>Among the four image input methods (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, OSS), choose one to input.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
         */
        public Builder faceContrastPictureUrl(String faceContrastPictureUrl) {
            this.putQueryParameter("FaceContrastPictureUrl", faceContrastPictureUrl);
            this.faceContrastPictureUrl = faceContrastPictureUrl;
            return this;
        }

        /**
         * <p>Device assistant label type, with the value: <strong>DeviceRisk</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>Choosing to output the device assistant will incur additional costs. For details, see <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/face-guard?spm=a2c4g.11186623.0.0.443e5522rbHsR4">Paid Value-Added Services</a>.</li>
         * <li>If you do not need to output the device assistant label, you can either not pass the parameter or pass an empty value.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DeviceRisk</p>
         */
        public Builder faceGuardOutput(String faceGuardOutput) {
            this.putQueryParameter("FaceGuardOutput", faceGuardOutput);
            this.faceGuardOutput = faceGuardOutput;
            return this;
        }

        /**
         * <p>User&quot;s IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>114.xxx.xxx.xxx</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>Metainfo environment parameter, which needs to be obtained through the client SDK.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;zimVer&quot;:&quot;3.0.0&quot;,&quot;appVersion&quot;: &quot;1&quot;,&quot;bioMetaInfo&quot;: &quot;4.1.0:11501568,0&quot;,&quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,&quot;deviceType&quot;: &quot;ios&quot;,&quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,&quot;apdidToken&quot;: &quot;&quot;,&quot;deviceModel&quot;: &quot;iPhone9,1&quot;}</p>
         */
        public Builder metaInfo(String metaInfo) {
            this.putQueryParameter("MetaInfo", metaInfo);
            this.metaInfo = metaInfo;
            return this;
        }

        /**
         * <p>User&quot;s phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>130xxxxxxxx</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>Method to obtain passport NFC verification elements:</p>
         * <ul>
         * <li><p><strong>1</strong>: User input, where the end-user manually inputs the document information using the UI interface provided by the Alibaba Cloud SDK.</p>
         * </li>
         * <li><p><strong>3</strong>: External parameter input, where the document information is passed through external parameters.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When decoding the encrypted information from the passport chip using NFC, three elements of the passport need to be obtained, including name, date of birth, and document expiration date.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>Liveness detection type, with values:</p>
         * <blockquote>
         * <p>Only the following liveness detection types are supported; custom actions or combinations are not supported at this time.</p>
         * </blockquote>
         * <p>Note
         * Only the following liveness detection types are supported; custom actions or combinations are not supported at this time.</p>
         * <ul>
         * <li><p><strong>LIVENESS</strong> (default): Blinking</p>
         * </li>
         * <li><p><strong>PHOTINUS_LIVENESS</strong>: Blinking + Colorful Light</p>
         * </li>
         * <li><p><strong>MULTI_ACTION</strong>: Blinking + Head Shaking (the order of blinking and head shaking is random)</p>
         * </li>
         * <li><p><strong>MOVE_ACTION</strong> (recommended): Moving Closer and Farther + Blinking</p>
         * </li>
         * <li><p><strong>MOVE_PHOTINUS</strong>: Moving Closer and Farther + Colorful Light</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The <strong>default liveness detection type</strong> is supported in the following versions:<ul>
         * <li>Android SDK 1.2.6 and above</li>
         * <li>iOS SDK 1.2.4 and above</li>
         * <li>Harmony SDK 1.0.0 and above</li>
         * </ul>
         * </li>
         * <li>Other types are supported in the latest SDK versions for Android/iOS/Harmony. It is recommended to integrate the latest version.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MOVE_ACTION</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>Whether to intercept when multiple faces are detected, with the following values:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Intercept, and the client prompts the user to re-scan their face.</p>
         * </li>
         * <li><p><strong>N</strong> (default): Do not intercept, and send the largest face in the scanned image to the server for security checks.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder needMultiFaceCheck(String needMultiFaceCheck) {
            this.putQueryParameter("NeedMultiFaceCheck", needMultiFaceCheck);
            this.needMultiFaceCheck = needMultiFaceCheck;
            return this;
        }

        /**
         * <p>Authorized OSS bucket name.</p>
         * <blockquote>
         * <p>Among the four image input methods (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, OSS), choose one to input.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>Authorized OSS object name.</p>
         * <blockquote>
         * <p>Among the four image input methods (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, OSS), choose one to input.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>verify/xxxxx/xxxxxx.jpeg</p>
         */
        public Builder ossObjectName(String ossObjectName) {
            this.putQueryParameter("OssObjectName", ossObjectName);
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * <p>Unique identifier for the merchant&quot;s request.</p>
         * <p>The value is a 32-character alphanumeric combination. The first few characters are a custom abbreviation defined by the merchant, followed by a period, and the latter part can be a random or incremental sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putQueryParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * <p>Degradation configuration for mobile H5 authentication when WebRTC or Webassembly is incompatible.</p>
         * <ul>
         * <li><p><strong>keep</strong>: Does not support degradation, returns directly.</p>
         * </li>
         * <li><p><strong>url</strong> (default): Supports degradation, returns an authentication URL. Users can use this URL to open or switch browsers for authentication.</p>
         * </li>
         * <li><p><strong>video</strong>: Supports degradation, uses the system camera to record a 3~5 second blinking video for authentication.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When the degradation mode is Video, the following functions will be disabled, and the product security will decrease. It is recommended to configure it only for secure scenarios.</p>
         * <ul>
         * <li>Liveness detection type settings will not take effect.</li>
         * <li>The VideoEvidence function is not supported.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>url</p>
         */
        public Builder procedurePriority(String procedurePriority) {
            this.putQueryParameter("ProcedurePriority", procedurePriority);
            this.procedurePriority = procedurePriority;
            return this;
        }

        /**
         * <p>Fixed value. The parameter value differs based on the product solution:</p>
         * <ul>
         * <li>APP Authentication Scheme: Fixed value is ID_PRO</li>
         * <li>Live Face Verification Scheme: Fixed value is PV_FV</li>
         * <li>Liveness Detection Scheme: Fixed value is LR_FR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Whether to enable rare character mode:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Enable. A message input box will pop up before the user authenticates, requiring the input of the rare character name and ID number. The user must agree to the terms before starting the authentication process.</p>
         * </li>
         * <li><p><strong>N</strong>: Not enabled (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder rarelyCharacters(String rarelyCharacters) {
            this.putQueryParameter("RarelyCharacters", rarelyCharacters);
            this.rarelyCharacters = rarelyCharacters;
            return this;
        }

        /**
         * <p>Whether to read the document photo:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Read</p>
         * </li>
         * <li><p><strong>N</strong>: Do not read</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the document face photo is needed in subsequent authentication steps, it is recommended to set this parameter to Y.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder readImg(String readImg) {
            this.putQueryParameter("ReadImg", readImg);
            this.readImg = readImg;
            return this;
        }

        /**
         * <p>Target URL for the merchant&quot;s business page to redirect to.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder returnUrl(String returnUrl) {
            this.putQueryParameter("ReturnUrl", returnUrl);
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * <p>Authentication Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000006</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Aging-friendly configuration parameters that take effect for each authentication request. You can choose different parameters based on your app&quot;s business attributes, customer distribution, operational characteristics, etc., for each authentication request. The options include the following, with the default being 0.</p>
         * <ul>
         * <li><p><strong>0</strong>: Not enabled, indicating that the current authentication request does not enable aging-friendly mode.</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled, indicating that the current authentication request enables aging-friendly mode.</p>
         * </li>
         * <li><p><strong>2</strong>: User choice.</p>
         * </li>
         * </ul>
         * <p>Supports end-users in choosing the authentication mode. The product guide page provides two authentication entry points: &quot;Enable Authentication&quot; and &quot;Elderly Authentication Mode&quot;. When the user selects &quot;Elderly Authentication Mode&quot;, the system enters aging-friendly mode.</p>
         * <blockquote>
         * <ul>
         * <li>Aging-friendly parameters are only effective when the liveness detection type <strong>Model</strong> is set to <strong>LIVENESS</strong> or <strong>MULTI_ACTION</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder suitableType(String suitableType) {
            this.putQueryParameter("SuitableType", suitableType);
            this.suitableType = suitableType;
            return this;
        }

        /**
         * <p>UI configuration file URL.</p>
         * <p>You can view the complete configuration in the <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/web-sdk-ui-custom-configuration-description?spm=a2c4g.11186623.0.0.4c683f5c8K3I9p">Web SDK UI Customization Description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder uiCustomUrl(String uiCustomUrl) {
            this.putQueryParameter("UiCustomUrl", uiCustomUrl);
            this.uiCustomUrl = uiCustomUrl;
            return this;
        }

        /**
         * <p>Custom user ID for the customer&quot;s business, please ensure it is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>Document expiration date.</p>
         * <p>This field is required when the document type <strong>CertType</strong> is <strong>PASSPORT</strong> and <strong>Mode</strong> is <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2039-06-10</p>
         */
        public Builder validityDate(String validityDate) {
            this.putQueryParameter("ValidityDate", validityDate);
            this.validityDate = validityDate;
            return this;
        }

        /**
         * <p>Whether to enable video evidence:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable</p>
         * </li>
         * <li><p><strong>false</strong> (default): Disable</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Due to the large size of video files, when the network is unstable, the system will discard the video file to prioritize the transmission of necessary images for authentication. It is recommended that your business set a weak dependency on the video.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder videoEvidence(String videoEvidence) {
            this.putQueryParameter("VideoEvidence", videoEvidence);
            this.videoEvidence = videoEvidence;
            return this;
        }

        /**
         * <p>Customized content. Required when personalized settings are enabled. The format is a JSON String of a String List.</p>
         * <ul>
         * <li><p>For the follow-reading scenario: It should not exceed 60 Chinese characters (excluding punctuation), and the List contains only one element.</p>
         * </li>
         * <li><p>For the Q&amp;A scenario: Up to 3 questions can be set, with each question not exceeding 30 Chinese characters, and each question being an element in the List.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;本人王先生同意***协议。&quot;]</p>
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
