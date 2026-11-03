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
    @com.aliyun.core.annotation.NameInMap("EnableAlbumUpload")
    private String enableAlbumUpload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBeauty")
    private String enableBeauty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTts")
    private String enableTts;

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
    @com.aliyun.core.annotation.NameInMap("H5DegradeConfirmBtn")
    private String h5DegradeConfirmBtn;

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
        this.enableAlbumUpload = builder.enableAlbumUpload;
        this.enableBeauty = builder.enableBeauty;
        this.enableTts = builder.enableTts;
        this.encryptType = builder.encryptType;
        this.faceContrastPicture = builder.faceContrastPicture;
        this.faceContrastPictureUrl = builder.faceContrastPictureUrl;
        this.faceGuardOutput = builder.faceGuardOutput;
        this.h5DegradeConfirmBtn = builder.h5DegradeConfirmBtn;
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
     * @return enableAlbumUpload
     */
    public String getEnableAlbumUpload() {
        return this.enableAlbumUpload;
    }

    /**
     * @return enableBeauty
     */
    public String getEnableBeauty() {
        return this.enableBeauty;
    }

    /**
     * @return enableTts
     */
    public String getEnableTts() {
        return this.enableTts;
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
     * @return h5DegradeConfirmBtn
     */
    public String getH5DegradeConfirmBtn() {
        return this.h5DegradeConfirmBtn;
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
        private String enableAlbumUpload; 
        private String enableBeauty; 
        private String enableTts; 
        private String encryptType; 
        private String faceContrastPicture; 
        private String faceContrastPictureUrl; 
        private String faceGuardOutput; 
        private String h5DegradeConfirmBtn; 
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
            this.enableAlbumUpload = request.enableAlbumUpload;
            this.enableBeauty = request.enableBeauty;
            this.enableTts = request.enableTts;
            this.encryptType = request.encryptType;
            this.faceContrastPicture = request.faceContrastPicture;
            this.faceContrastPictureUrl = request.faceContrastPictureUrl;
            this.faceGuardOutput = request.faceGuardOutput;
            this.h5DegradeConfirmBtn = request.h5DegradeConfirmBtn;
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
         * <p>Specifies whether to enable strict face quality detection in the SDK. Valid values:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Enables strict face quality detection.</p>
         * </li>
         * <li><p><strong>N</strong>: Does not enable strict face quality detection. This is the default value.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you enable this parameter, the SDK must integrate the <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/description-of-sdk-package-clipping">strict face quality detection module</a>. Affected by strict quality detection, the success rate of face scanning may decrease.</li>
         * <li>Only Android SDK 2.3.24 and later are supported.</li>
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
         * <p>The user authorization ID. The maximum length is 64 characters.</p>
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
         * <p>The date of birth on the ID document.</p>
         * <p>This parameter is required when the <strong>CertType</strong> parameter is set to <strong>PASSPORT</strong> and the <strong>Mode</strong> parameter is set to <strong>3</strong>.</p>
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
         * <p>The security token that you generate to prevent duplicate and tampered requests.</p>
         * <p>If you specify this parameter, the <strong>CallbackToken</strong> field is displayed in the callback URL.</p>
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
         * <p>The callback URL for authentication result notifications. The default callback request method is GET. The callback URL must start with <code>https</code>. After the authentication is completed, the platform invokes this URL and automatically appends the <code>certifyId</code> and <code>passed</code> fields. The value of the <code>passed</code> field is the subcode. Example: <code>https://www.aliyun.com?callbackToken=1000004826&amp;certifyId=shaxxxx&amp;passed=200</code>.</p>
         * <notice>
         * 
         * <ul>
         * <li>The callback is triggered only when the authentication is completed, including both successful and failed authentications. If the authentication is abandoned, an abnormal break occurs, or the authentication is not performed, no notification is sent. We recommend that you invoke the query API operation to obtain the authentication details after you receive the callback notification if needed.</li>
         * <li>The accessibility of the URL is verified before the API operation is invoked. If the URL does not support public network access, a 401 error is returned.</li>
         * <li>The API operation must return HTTP status code 200 after the callback. Otherwise, a retry is triggered, and two callbacks are sent within 3 seconds.</li>
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
         * <p>Specifies whether to enable the camera selection feature. Valid values:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Enables the feature.</p>
         * </li>
         * <li><p><strong>N</strong>: Does not enable the feature. This is the default value.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This feature takes effect only in the PC integration mode. After this feature is enabled, users can select a camera for authentication.</p>
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
         * <p>The real name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>The ID document number.</p>
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
         * <p>The type of the ID document.</p>
         * <p>Only ID cards are supported. Set the value to IDENTITY_CARD.</p>
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
         * <p><strong>[Deprecated]</strong></p>
         * <p>The CertifyId of a previous successful ID Verification. The photo used in the previous authentication is used as the comparison photo.</p>
         * <blockquote>
         * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
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
         * <p>The type of the returned <strong>CertifyUrl</strong>. Valid values:</p>
         * <ul>
         * <li><p><strong>L</strong>: Original long URL.</p>
         * </li>
         * <li><p><strong>S</strong> (default): Short URL.</p>
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
         * <p>The device type of the Web SDK. Valid values: <strong>WEB</strong> and <strong>H5</strong>.</p>
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
         * <p>Specifies whether to allow face image cropping. By default, cropping is not allowed. Valid values:</p>
         * <ul>
         * <li><p>T: Cropping is allowed.</p>
         * </li>
         * <li><p>F: Cropping is not allowed.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the requested image is not collected by the standard liveness detection SDK, we recommend that you allow face image cropping. After this feature is enabled, the requested image is cropped and corrected before the request is sent to the service.</p>
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
         * <p>Specifies whether to allow album upload. Valid values: Y and N. Default value: N.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder enableAlbumUpload(String enableAlbumUpload) {
            this.putQueryParameter("EnableAlbumUpload", enableAlbumUpload);
            this.enableAlbumUpload = enableAlbumUpload;
            return this;
        }

        /**
         * <p>Specifies whether to enable the beauty filter. Valid values: Y and N.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder enableBeauty(String enableBeauty) {
            this.putQueryParameter("EnableBeauty", enableBeauty);
            this.enableBeauty = enableBeauty;
            return this;
        }

        /**
         * <p>Specifies whether to enable speech synthesis for H5 willingness authentication. Valid values: Y and N. Default value: Y.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder enableTts(String enableTts) {
            this.putQueryParameter("EnableTts", enableTts);
            this.enableTts = enableTts;
            return this;
        }

        /**
         * <p>The encryption algorithm. Only the SM2 algorithm is supported.</p>
         * <p>After encrypted transmission is enabled, you must pass the encrypted CertName and CertNo. For more information about encryption, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/description-of-parameter-encryption#task-2229332">Parameter encryption</a>.</p>
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
         * <p>The Base64-encoded image.</p>
         * <blockquote>
         * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
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
         * <p>The URL of the image in OSS. Only authorized OSS image URLs are supported.</p>
         * <blockquote>
         * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
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
         * <p>The type of the Device Assistant tag. Set the value to <strong>DeviceRisk</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>Outputting Device Assistant tags incurs additional fees. For more information, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/face-guard">Value-added services</a>.</li>
         * <li>If you do not need to output Device Assistant tags, you can leave this parameter empty or do not pass it.</li>
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
         * <p>Specifies whether to display the I Have Completed Authentication button on the H5 downgrade page after authentication is completed. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: Displays the button.</li>
         * <li><strong>N</strong> (default): Hides the button.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder h5DegradeConfirmBtn(String h5DegradeConfirmBtn) {
            this.putQueryParameter("H5DegradeConfirmBtn", h5DegradeConfirmBtn);
            this.h5DegradeConfirmBtn = h5DegradeConfirmBtn;
            return this;
        }

        /**
         * <p>The IP address of the user.</p>
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
         * <p>The Metainfo environment parameter. You must obtain this parameter by using the client SDK.</p>
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
         * <p>The mobile phone number of the user.</p>
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
         * <p>The method to obtain the passport NFC verification elements. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: User input. The end user manually enters the ID document element information by using the UI provided by the Alibaba Cloud SDK.</p>
         * </li>
         * <li><p><strong>3</strong>: External parameter input. The ID document element information is passed from external sources.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When the NFC decoder decrypts the encrypted information of the passport chip, it needs to obtain three passport elements: name, date of birth, and expiration date.</p>
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
         * <p>The liveness detection type. Valid values:</p>
         * <blockquote>
         * <p>Only the following liveness detection types are supported. Custom actions or combinations are not supported.</p>
         * </blockquote>
         * <p>Description
         * Only the following liveness detection types are supported. Custom actions or combinations are not supported.</p>
         * <ul>
         * <li><p><strong>LIVENESS</strong> (default): Blinking.</p>
         * </li>
         * <li><p><strong>PHOTINUS_LIVENESS</strong>: Blinking and colorful light reflection.</p>
         * </li>
         * <li><p><strong>MULTI_ACTION</strong>: Blinking and head turning (the order is random).</p>
         * </li>
         * <li><p><strong>MOVE_ACTION</strong> (recommended): Moving closer or farther and blinking.</p>
         * </li>
         * <li><p><strong>MOVE_PHOTINUS</strong>: Moving closer or farther and colorful light reflection.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><strong>The default liveness detection type</strong> is supported in the following SDK versions:<ul>
         * <li>Android SDK 1.2.6 and later</li>
         * <li>iOS SDK 1.2.4 and later</li>
         * <li>Harmony SDK 1.0.0 and later</li>
         * </ul>
         * </li>
         * <li>Other types are supported in the latest SDK versions for Android, iOS, and Harmony. We recommend that you integrate the latest SDK version.</li>
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
         * <p>Specifies whether to intercept the request when multiple faces are detected on the terminal. Valid values:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Intercepts the request. The client prompts the user to scan the face again.</p>
         * </li>
         * <li><p><strong>N</strong> (default): Does not intercept the request. The largest face in the face scanning screen is sent to the server for security detection.</p>
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
         * <p>The name of the authorized OSS bucket.</p>
         * <blockquote>
         * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
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
         * <p>The name of the object in the authorized OSS bucket.</p>
         * <blockquote>
         * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
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
         * <p>The unique identifier of the merchant request.</p>
         * <p>The value is a 32-character alphanumeric string. The first few characters are a custom abbreviation of the merchant, the middle part can be a period of time, and the last part can be a random or incremental sequence.</p>
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
         * <p>The downgrade configuration when WebRTC or WebAssembly is incompatible during mobile H5 authentication. Valid values:</p>
         * <ul>
         * <li><p><strong>keep</strong>: Downgrade is not supported. The result is directly returned.</p>
         * </li>
         * <li><p><strong>url</strong> (default): Downgrade is supported. The authentication URL is returned. The user opens or switches to a browser by using this URL for authentication.</p>
         * </li>
         * <li><p><strong>video</strong>: Downgrade is supported. The system camera is used to record a 3- to 5-second blinking video for authentication.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When the downgrade mode is set to video, the following features become invalid and product security is reduced. We recommend that you configure this mode only for security scenarios.</p>
         * <ul>
         * <li>The liveness detection type setting does not take effect.</li>
         * <li>The VideoEvidence feature is not supported.</li>
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
         * <p>The fixed value. The value of this parameter varies based on the product solution:</p>
         * <ul>
         * <li>APP authentication solution: Set the value to ID_PRO.</li>
         * <li>Face liveness verification solution: Set the value to PV_FV.</li>
         * <li>Liveness detection solution: Set the value to LR_FR.</li>
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
         * <p>Specifies whether to enable the rare character mode. Valid values:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Enables the mode. Before authentication, an information input box appears. The user must enter the name with rare characters and the ID card number, and agree to the agreement before the authentication process starts.</p>
         * </li>
         * <li><p><strong>N</strong>: Does not enable the mode. This is the default value.</p>
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
         * <p>Specifies whether to read the ID document photo. Valid values:</p>
         * <ul>
         * <li><p><strong>Y</strong>: Reads the photo.</p>
         * </li>
         * <li><p><strong>N</strong>: Does not read the photo.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you need to use the face photo from the ID document in subsequent authentication steps, we recommend that you set this parameter to Y.</p>
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
         * <p>The redirect URL for the merchant business page.</p>
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
         * <p>The ID of the authentication scenario.</p>
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
         * <p>The age-friendly configuration parameter. This parameter takes effect for each authentication request. You can select different parameters for each authentication request based on the business property, customer distribution, and operation attribute of your app. The following options are available. Default value: 0.</p>
         * <ul>
         * <li><p><strong>0</strong>: Disables the age-friendly pattern for the current authentication request.</p>
         * </li>
         * <li><p><strong>1</strong>: Enables the age-friendly pattern for the current authentication request.</p>
         * </li>
         * <li><p><strong>2</strong>: Allows the user to select the pattern.</p>
         * </li>
         * </ul>
         * <p>The end user can select the authentication pattern. The product guide page provides two authentication entries: Start Authentication and Senior Authentication Pattern. When the user selects Senior Authentication Pattern, the system enters the age-friendly pattern.</p>
         * <blockquote>
         * <ul>
         * <li>The age-friendly parameter takes effect only when the liveness detection type <strong>Model</strong> is set to <strong>LIVENESS</strong> or <strong>MULTI_ACTION</strong>.</li>
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
         * <p>The URL of the UI configuration file.</p>
         * <p>For the complete configuration, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/web-sdk-ui-custom-configuration-description">Web SDK UI custom configuration</a>.</p>
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
         * <p>The custom user ID in the customer business. Make sure that the ID is unique.</p>
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
         * <p>The expiration date of the ID document.</p>
         * <p>This parameter is required when the <strong>CertType</strong> parameter is set to <strong>PASSPORT</strong> and the <strong>Mode</strong> parameter is set to <strong>3</strong>.</p>
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
         * <p>Specifies whether to enable video evidence. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enables video evidence.</p>
         * </li>
         * <li><p><strong>false</strong>: Does not enable video evidence. This is the default value.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Because video files are large, the system discards video files to prioritize the transmission of necessary authentication images when the network is unstable. We recommend that you set your business to weakly depend on videos.</p>
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
         * <p>The custom willingness content. This parameter is required when personalized settings are enabled. The value is a JSON string of a string list.</p>
         * <ul>
         * <li><p>In the read-along scenario: The content cannot exceed 60 Chinese characters (excluding punctuation marks), and the list contains only one element.</p>
         * </li>
         * <li><p>In the Q&amp;A scenario: You can configure up to three questions. Each question cannot exceed 30 Chinese characters, and each question is an element in the list.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;I, Mr. Wang, agree to the *** agreement.&quot;]</p>
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
