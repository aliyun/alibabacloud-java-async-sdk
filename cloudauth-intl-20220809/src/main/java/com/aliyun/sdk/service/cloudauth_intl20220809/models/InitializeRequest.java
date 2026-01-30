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
 * {@link InitializeRequest} extends {@link RequestModel}
 *
 * <p>InitializeRequest</p>
 */
public class InitializeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppQualityCheck")
    private String appQualityCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Authorize")
    private String authorize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRegistration")
    private String autoRegistration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackToken")
    private String callbackToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChameleonFrameEnable")
    private String chameleonFrameEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Crop")
    private String crop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateOfBirth")
    private String dateOfBirth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateOfExpiry")
    private String dateOfExpiry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocName")
    private String docName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocNo")
    private String docNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocPageConfig")
    private java.util.List<String> docPageConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocScanMode")
    private String docScanMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocVideo")
    private String docVideo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentNumber")
    private String documentNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EditOcrResult")
    private String editOcrResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExperienceCode")
    private String experienceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceGroupCodes")
    private String faceGroupCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FacePictureBase64")
    private String facePictureBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePictureUrl")
    private String facePictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceRegisterGroupCode")
    private String faceRegisterGroupCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceVerifyThreshold")
    private String faceVerifyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdFaceQuality")
    private String idFaceQuality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdSpoof")
    private String idSpoof;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdThreshold")
    private String idThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanguageConfig")
    private String languageConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MRTDInput")
    private String MRTDInput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaInfo")
    private String metaInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ocr")
    private String ocr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pages")
    private String pages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcedurePriority")
    private String procedurePriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductFlow")
    private String productFlow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnFaces")
    private String returnFaces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnUrl")
    private String returnUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveFacePicture")
    private String saveFacePicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityLevel")
    private String securityLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowAlbumIcon")
    private String showAlbumIcon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowGuidePage")
    private String showGuidePage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowOcrResult")
    private String showOcrResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StyleConfig")
    private String styleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFacePicture")
    private String targetFacePicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFacePictureUrl")
    private String targetFacePictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseNFC")
    private String useNFC;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyModel")
    private String verifyModel;

    private InitializeRequest(Builder builder) {
        super(builder);
        this.appQualityCheck = builder.appQualityCheck;
        this.authorize = builder.authorize;
        this.autoRegistration = builder.autoRegistration;
        this.callbackToken = builder.callbackToken;
        this.callbackUrl = builder.callbackUrl;
        this.chameleonFrameEnable = builder.chameleonFrameEnable;
        this.crop = builder.crop;
        this.dateOfBirth = builder.dateOfBirth;
        this.dateOfExpiry = builder.dateOfExpiry;
        this.docName = builder.docName;
        this.docNo = builder.docNo;
        this.docPageConfig = builder.docPageConfig;
        this.docScanMode = builder.docScanMode;
        this.docType = builder.docType;
        this.docVideo = builder.docVideo;
        this.documentNumber = builder.documentNumber;
        this.editOcrResult = builder.editOcrResult;
        this.email = builder.email;
        this.experienceCode = builder.experienceCode;
        this.faceGroupCodes = builder.faceGroupCodes;
        this.facePictureBase64 = builder.facePictureBase64;
        this.facePictureUrl = builder.facePictureUrl;
        this.faceRegisterGroupCode = builder.faceRegisterGroupCode;
        this.faceVerifyThreshold = builder.faceVerifyThreshold;
        this.idFaceQuality = builder.idFaceQuality;
        this.idSpoof = builder.idSpoof;
        this.idThreshold = builder.idThreshold;
        this.languageConfig = builder.languageConfig;
        this.MRTDInput = builder.MRTDInput;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.metaInfo = builder.metaInfo;
        this.mobile = builder.mobile;
        this.model = builder.model;
        this.ocr = builder.ocr;
        this.pages = builder.pages;
        this.procedurePriority = builder.procedurePriority;
        this.productCode = builder.productCode;
        this.productFlow = builder.productFlow;
        this.returnFaces = builder.returnFaces;
        this.returnUrl = builder.returnUrl;
        this.saveFacePicture = builder.saveFacePicture;
        this.sceneCode = builder.sceneCode;
        this.securityLevel = builder.securityLevel;
        this.showAlbumIcon = builder.showAlbumIcon;
        this.showGuidePage = builder.showGuidePage;
        this.showOcrResult = builder.showOcrResult;
        this.styleConfig = builder.styleConfig;
        this.targetFacePicture = builder.targetFacePicture;
        this.targetFacePictureUrl = builder.targetFacePictureUrl;
        this.useNFC = builder.useNFC;
        this.verifyModel = builder.verifyModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appQualityCheck
     */
    public String getAppQualityCheck() {
        return this.appQualityCheck;
    }

    /**
     * @return authorize
     */
    public String getAuthorize() {
        return this.authorize;
    }

    /**
     * @return autoRegistration
     */
    public String getAutoRegistration() {
        return this.autoRegistration;
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
     * @return chameleonFrameEnable
     */
    public String getChameleonFrameEnable() {
        return this.chameleonFrameEnable;
    }

    /**
     * @return crop
     */
    public String getCrop() {
        return this.crop;
    }

    /**
     * @return dateOfBirth
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * @return dateOfExpiry
     */
    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return docNo
     */
    public String getDocNo() {
        return this.docNo;
    }

    /**
     * @return docPageConfig
     */
    public java.util.List<String> getDocPageConfig() {
        return this.docPageConfig;
    }

    /**
     * @return docScanMode
     */
    public String getDocScanMode() {
        return this.docScanMode;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return docVideo
     */
    public String getDocVideo() {
        return this.docVideo;
    }

    /**
     * @return documentNumber
     */
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    /**
     * @return editOcrResult
     */
    public String getEditOcrResult() {
        return this.editOcrResult;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return experienceCode
     */
    public String getExperienceCode() {
        return this.experienceCode;
    }

    /**
     * @return faceGroupCodes
     */
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
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
     * @return idFaceQuality
     */
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    /**
     * @return idSpoof
     */
    public String getIdSpoof() {
        return this.idSpoof;
    }

    /**
     * @return idThreshold
     */
    public String getIdThreshold() {
        return this.idThreshold;
    }

    /**
     * @return languageConfig
     */
    public String getLanguageConfig() {
        return this.languageConfig;
    }

    /**
     * @return MRTDInput
     */
    public String getMRTDInput() {
        return this.MRTDInput;
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
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return ocr
     */
    public String getOcr() {
        return this.ocr;
    }

    /**
     * @return pages
     */
    public String getPages() {
        return this.pages;
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
     * @return productFlow
     */
    public String getProductFlow() {
        return this.productFlow;
    }

    /**
     * @return returnFaces
     */
    public String getReturnFaces() {
        return this.returnFaces;
    }

    /**
     * @return returnUrl
     */
    public String getReturnUrl() {
        return this.returnUrl;
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
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * @return showAlbumIcon
     */
    public String getShowAlbumIcon() {
        return this.showAlbumIcon;
    }

    /**
     * @return showGuidePage
     */
    public String getShowGuidePage() {
        return this.showGuidePage;
    }

    /**
     * @return showOcrResult
     */
    public String getShowOcrResult() {
        return this.showOcrResult;
    }

    /**
     * @return styleConfig
     */
    public String getStyleConfig() {
        return this.styleConfig;
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
     * @return useNFC
     */
    public String getUseNFC() {
        return this.useNFC;
    }

    /**
     * @return verifyModel
     */
    public String getVerifyModel() {
        return this.verifyModel;
    }

    public static final class Builder extends Request.Builder<InitializeRequest, Builder> {
        private String appQualityCheck; 
        private String authorize; 
        private String autoRegistration; 
        private String callbackToken; 
        private String callbackUrl; 
        private String chameleonFrameEnable; 
        private String crop; 
        private String dateOfBirth; 
        private String dateOfExpiry; 
        private String docName; 
        private String docNo; 
        private java.util.List<String> docPageConfig; 
        private String docScanMode; 
        private String docType; 
        private String docVideo; 
        private String documentNumber; 
        private String editOcrResult; 
        private String email; 
        private String experienceCode; 
        private String faceGroupCodes; 
        private String facePictureBase64; 
        private String facePictureUrl; 
        private String faceRegisterGroupCode; 
        private String faceVerifyThreshold; 
        private String idFaceQuality; 
        private String idSpoof; 
        private String idThreshold; 
        private String languageConfig; 
        private String MRTDInput; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String metaInfo; 
        private String mobile; 
        private String model; 
        private String ocr; 
        private String pages; 
        private String procedurePriority; 
        private String productCode; 
        private String productFlow; 
        private String returnFaces; 
        private String returnUrl; 
        private String saveFacePicture; 
        private String sceneCode; 
        private String securityLevel; 
        private String showAlbumIcon; 
        private String showGuidePage; 
        private String showOcrResult; 
        private String styleConfig; 
        private String targetFacePicture; 
        private String targetFacePictureUrl; 
        private String useNFC; 
        private String verifyModel; 

        private Builder() {
            super();
        } 

        private Builder(InitializeRequest request) {
            super(request);
            this.appQualityCheck = request.appQualityCheck;
            this.authorize = request.authorize;
            this.autoRegistration = request.autoRegistration;
            this.callbackToken = request.callbackToken;
            this.callbackUrl = request.callbackUrl;
            this.chameleonFrameEnable = request.chameleonFrameEnable;
            this.crop = request.crop;
            this.dateOfBirth = request.dateOfBirth;
            this.dateOfExpiry = request.dateOfExpiry;
            this.docName = request.docName;
            this.docNo = request.docNo;
            this.docPageConfig = request.docPageConfig;
            this.docScanMode = request.docScanMode;
            this.docType = request.docType;
            this.docVideo = request.docVideo;
            this.documentNumber = request.documentNumber;
            this.editOcrResult = request.editOcrResult;
            this.email = request.email;
            this.experienceCode = request.experienceCode;
            this.faceGroupCodes = request.faceGroupCodes;
            this.facePictureBase64 = request.facePictureBase64;
            this.facePictureUrl = request.facePictureUrl;
            this.faceRegisterGroupCode = request.faceRegisterGroupCode;
            this.faceVerifyThreshold = request.faceVerifyThreshold;
            this.idFaceQuality = request.idFaceQuality;
            this.idSpoof = request.idSpoof;
            this.idThreshold = request.idThreshold;
            this.languageConfig = request.languageConfig;
            this.MRTDInput = request.MRTDInput;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.metaInfo = request.metaInfo;
            this.mobile = request.mobile;
            this.model = request.model;
            this.ocr = request.ocr;
            this.pages = request.pages;
            this.procedurePriority = request.procedurePriority;
            this.productCode = request.productCode;
            this.productFlow = request.productFlow;
            this.returnFaces = request.returnFaces;
            this.returnUrl = request.returnUrl;
            this.saveFacePicture = request.saveFacePicture;
            this.sceneCode = request.sceneCode;
            this.securityLevel = request.securityLevel;
            this.showAlbumIcon = request.showAlbumIcon;
            this.showGuidePage = request.showGuidePage;
            this.showOcrResult = request.showOcrResult;
            this.styleConfig = request.styleConfig;
            this.targetFacePicture = request.targetFacePicture;
            this.targetFacePictureUrl = request.targetFacePictureUrl;
            this.useNFC = request.useNFC;
            this.verifyModel = request.verifyModel;
        } 

        /**
         * <p><warning>This feature is currently not supported by <strong>Web SDK</strong>. Please refer to the App SDK integration if needed.</warning></p>
         * <p>Whether to enable strict face quality detection:</p>
         * <ul>
         * <li>Y: Enable (default)</li>
         * <li>N: Disable</li>
         * </ul>
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
         * <p>Whether to enable authoritative identity verification, currently applicable only to the second-generation ID card in mainland China. (IDV product input parameter)</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder authorize(String authorize) {
            this.putQueryParameter("Authorize", authorize);
            this.authorize = authorize;
            return this;
        }

        /**
         * <p>Whether to enable automatic registration</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder autoRegistration(String autoRegistration) {
            this.putQueryParameter("AutoRegistration", autoRegistration);
            this.autoRegistration = autoRegistration;
            return this;
        }

        /**
         * <p>Security Token, used for preventing duplication and tampering. If this parameter is passed, the CallbackToken field will be displayed in the callback address.</p>
         * 
         * <strong>example:</strong>
         * <p>7ca5c68d869344ea8eeb30cdfd544544-6358700</p>
         */
        public Builder callbackToken(String callbackToken) {
            this.putQueryParameter("CallbackToken", callbackToken);
            this.callbackToken = callbackToken;
            return this;
        }

        /**
         * <p>Callback notification address for authentication results. The default callback request method is GET, and the callback address must start with https. After completing the authentication, the platform will call back this address and automatically add the transactionId, passed, and subcode fields.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com?callbackToken=1000004826&transactionId=shaxxxx&passed=Y&subCode=200">https://www.aliyun.com?callbackToken=1000004826&amp;transactionId=shaxxxx&amp;passed=Y&amp;subCode=200</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>Whether to enable adaptive color-changing window border</p>
         * <ul>
         * <li><strong>Y</strong>: Enable</li>
         * <li><strong>N</strong>: Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder chameleonFrameEnable(String chameleonFrameEnable) {
            this.putQueryParameter("ChameleonFrameEnable", chameleonFrameEnable);
            this.chameleonFrameEnable = chameleonFrameEnable;
            return this;
        }

        /**
         * <p>Whether to crop. (IDV product input parameter)</p>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder crop(String crop) {
            this.putQueryParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * <p>Date of birth on the document</p>
         * <p><strong>MRTDInput = 2</strong> is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder dateOfBirth(String dateOfBirth) {
            this.putQueryParameter("DateOfBirth", dateOfBirth);
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * <p>Expiration date on the document</p>
         * <p><strong>MRTDInput = 2</strong> is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder dateOfExpiry(String dateOfExpiry) {
            this.putQueryParameter("DateOfExpiry", dateOfExpiry);
            this.dateOfExpiry = dateOfExpiry;
            return this;
        }

        /**
         * <p>User&quot;s real name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder docName(String docName) {
            this.putQueryParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * <p>User&quot;s document number.</p>
         * 
         * <strong>example:</strong>
         * <p>411xxxxxxxxxxx0001</p>
         */
        public Builder docNo(String docNo) {
            this.putQueryParameter("DocNo", docNo);
            this.docNo = docNo;
            return this;
        }

        /**
         * <p>Customer-defined input to specify whether to collect more pages</p>
         */
        public Builder docPageConfig(java.util.List<String> docPageConfig) {
            String docPageConfigShrink = shrink(docPageConfig, "DocPageConfig", "json");
            this.putQueryParameter("DocPageConfig", docPageConfigShrink);
            this.docPageConfig = docPageConfig;
            return this;
        }

        /**
         * <p>Document capture mode.</p>
         * <ul>
         * <li>manual: Manual capture.</li>
         * <li>auto: Automatic capture (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        public Builder docScanMode(String docScanMode) {
            this.putQueryParameter("DocScanMode", docScanMode);
            this.docScanMode = docScanMode;
            return this;
        }

        /**
         * <p>Document type, uniquely identified by an 8-digit combination.
         * Note: This parameter is required only when ProductCode is KYC_GLOBAL, OCR_GLOBAL, or IDR_GLOBAL.</p>
         * 
         * <strong>example:</strong>
         * <p>​01560000</p>
         */
        public Builder docType(String docType) {
            this.putQueryParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * <p>Whether to require a video for evidence.</p>
         * <ul>
         * <li><p>N: Not required (default).</p>
         * </li>
         * <li><p>Y: During the authentication process, a 1~2 second video of the user&quot;s face will be captured and returned via the query interface.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Due to the large size of the video file, the system may discard it when the network is unstable, prioritizing the transmission of necessary images for authentication.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder docVideo(String docVideo) {
            this.putQueryParameter("DocVideo", docVideo);
            this.docVideo = docVideo;
            return this;
        }

        /**
         * <p>Document number</p>
         * <p><strong>MRTDInput = 2</strong> is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder documentNumber(String documentNumber) {
            this.putQueryParameter("DocumentNumber", documentNumber);
            this.documentNumber = documentNumber;
            return this;
        }

        /**
         * <p>In the document OCR recognition step, whether the recognition result page is editable:</p>
         * <ul>
         * <li><p><strong>0</strong>: Not editable</p>
         * </li>
         * <li><p><strong>1</strong> (default): Editable</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder editOcrResult(String editOcrResult) {
            this.putQueryParameter("EditOcrResult", editOcrResult);
            this.editOcrResult = editOcrResult;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>Experience code</p>
         * 
         * <strong>example:</strong>
         * <p>9be7b7d0180041219e5ab03ac6dab5fb</p>
         */
        public Builder experienceCode(String experienceCode) {
            this.putQueryParameter("ExperienceCode", experienceCode);
            this.experienceCode = experienceCode;
            return this;
        }

        /**
         * <p>Face library to be compared</p>
         * 
         * <strong>example:</strong>
         * <p>0e0c34a77f</p>
         */
        public Builder faceGroupCodes(String faceGroupCodes) {
            this.putQueryParameter("FaceGroupCodes", faceGroupCodes);
            this.faceGroupCodes = faceGroupCodes;
            return this;
        }

        /**
         * <p>Base64 encoded face image. If you choose to pass the face image via FacePictureBase64, please check the image size and do not upload images larger than 1 MB.
         * When productCode is FV_GLOBAL, choose one of the parameters between FacePictureBase64 and FacePictureUrl to pass in.</p>
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
         * <p>Face image URL. A publicly accessible HTTP or HTTPS link. When productCode is FV_GLOBAL, choose one of the parameters between FacePictureUrl and FacePictureBase to pass in.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder facePictureUrl(String facePictureUrl) {
            this.putQueryParameter("FacePictureUrl", facePictureUrl);
            this.facePictureUrl = facePictureUrl;
            return this;
        }

        /**
         * <p>Face library for registration.</p>
         * 
         * <strong>example:</strong>
         * <p>0e0c34a77f</p>
         */
        public Builder faceRegisterGroupCode(String faceRegisterGroupCode) {
            this.putQueryParameter("FaceRegisterGroupCode", faceRegisterGroupCode);
            this.faceRegisterGroupCode = faceRegisterGroupCode;
            return this;
        }

        /**
         * <p>Face verification threshold</p>
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
         * <p>Face image quality. (IDV product input parameter)</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder idFaceQuality(String idFaceQuality) {
            this.putQueryParameter("IdFaceQuality", idFaceQuality);
            this.idFaceQuality = idFaceQuality;
            return this;
        }

        /**
         * <p>Whether to enable certificate anti-counterfeiting detection. (IDV product input parameter)</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder idSpoof(String idSpoof) {
            this.putQueryParameter("IdSpoof", idSpoof);
            this.idSpoof = idSpoof;
            return this;
        }

        /**
         * <p>Custom OCR quality detection threshold mode:</p>
         * <ul>
         * <li><strong>0</strong>: Standard mode</li>
         * <li><strong>1</strong>: Strict mode</li>
         * <li><strong>2</strong>: Lenient mode</li>
         * <li><strong>3</strong> (default): Disable quality detection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder idThreshold(String idThreshold) {
            this.putQueryParameter("IdThreshold", idThreshold);
            this.idThreshold = idThreshold;
            return this;
        }

        /**
         * <p>Language configuration. (IDV product input parameter)</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder languageConfig(String languageConfig) {
            this.putQueryParameter("LanguageConfig", languageConfig);
            this.languageConfig = languageConfig;
            return this;
        }

        /**
         * <p>Source of MRTD verification parameters. This parameter is required to decrypt information when reading the document chip via NFC.</p>
         * <ul>
         * <li><p><strong>0</strong>: User input</p>
         * </li>
         * <li><p><strong>1</strong>: OCR read</p>
         * </li>
         * <li><p><strong>2</strong>: Passed through the API</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder MRTDInput(String MRTDInput) {
            this.putQueryParameter("MRTDInput", MRTDInput);
            this.MRTDInput = MRTDInput;
            return this;
        }

        /**
         * <p>A unique business identifier defined by the merchant, used for subsequent troubleshooting. It supports a combination of letters and numbers, with a maximum length of 32 characters. Please ensure its uniqueness.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a***353888</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>Your custom user ID or other identifiers that can recognize specific users, such as phone numbers or email addresses. It is strongly recommended to pre-desensitize the value of this field, for example, by hashing it.</p>
         * 
         * <strong>example:</strong>
         * <p>1221****6543</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * <p>Metainfo environment parameter, which needs to be obtained through the client SDK.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bioMetaInfo&quot;:&quot;4.1.0:2916352,0&quot;,&quot;deviceType&quot;:&quot;web&quot;,&quot;ua&quot;:&quot;Mozilla/5.0 (Macintosh</p>
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
         * <p>The type of liveness detection to be performed:</p>
         * <ul>
         * <li><p><strong>LIVENESS</strong> (default): Blinking action liveness detection.</p>
         * </li>
         * <li><p><strong>PHOTINUS_LIVENESS</strong>: Blinking action liveness + photinus liveness dual detection.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For supported SDK versions, see <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/sdk-publishing-record?spm=a2c63.p38356.0.i99">SDK Publishing Record</a>.</li>
         * <li>PC does not support photinus liveness dual detection.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PHOTINUS_LIVENESS</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>Whether to enable OCR. (IDV product input parameter)</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder ocr(String ocr) {
            this.putQueryParameter("Ocr", ocr);
            this.ocr = ocr;
            return this;
        }

        /**
         * <p>Page configuration for collection, multiple pages are connected using commas. The value range is as follows:</p>
         * <ul>
         * <li><p><strong>01</strong>: Front side of the document</p>
         * </li>
         * <li><p><strong>01,02</strong>: Front and back sides of the document</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When this value is 01,02, currently only Chinese and Vietnamese IDs are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder pages(String pages) {
            this.putQueryParameter("Pages", pages);
            this.pages = pages;
            return this;
        }

        /**
         * <p>When compatibility issues occur with H5-based mobile authentication, whether to allow a fallback handling method.</p>
         * <ul>
         * <li><p><strong>url</strong> (default): Support fallback. The page displays the authentication URL, which users can copy and open in another browser to continue the authentication process.</p>
         * </li>
         * <li><p><strong>keep</strong>: Do not support fallback. Directly return the error reason and end the authentication process.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This switch is not supported on PC.</li>
         * <li>If the business scenario involves completing authentication through an embedded web page in an app, it is recommended to set this parameter to <code>keep</code> to disallow URL fallback.</li>
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
         * <p>The product solution to be integrated. The values are as follows:</p>
         * <ul>
         * <li>KYC_GLOBAL (eKYC product solution)</li>
         * <li>FV_GLOBAL (Live Face Verification)</li>
         * <li>FL_GLOBAL (Liveness Detection)</li>
         * <li>IDR_GLOBAL (Single Document Verification)</li>
         * <li>OCR_GLOBAL (Single Document OCR)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KYC_GLOBAL</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Supports card and face sequential arrangement:</p>
         * <ul>
         * <li>DOC_FACE (default)</li>
         * <li>FACE_DOC</li>
         * </ul>
         * <p>Note: This parameter is required only when ProductCode is KYC_GLOBAL.</p>
         * 
         * <strong>example:</strong>
         * <p>DOC_FACE</p>
         */
        public Builder productFlow(String productFlow) {
            this.putQueryParameter("ProductFlow", productFlow);
            this.productFlow = productFlow;
            return this;
        }

        /**
         * <p>Number of duplicate faces returned</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnFaces(String returnFaces) {
            this.putQueryParameter("ReturnFaces", returnFaces);
            this.returnFaces = returnFaces;
            return this;
        }

        /**
         * <p>Client-side callback address.</p>
         * 
         * <strong>example:</strong>
         * <p>http*****</p>
         */
        public Builder returnUrl(String returnUrl) {
            this.putQueryParameter("ReturnUrl", returnUrl);
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * <p>Whether to save the face image</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder saveFacePicture(String saveFacePicture) {
            this.putQueryParameter("SaveFacePicture", saveFacePicture);
            this.saveFacePicture = saveFacePicture;
            return this;
        }

        /**
         * <p>Scene code. (IDV product input parameter)</p>
         * 
         * <strong>example:</strong>
         * <p>123****123</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>Represents different security levels in the authentication process. The available values are as follows:</p>
         * <p>01: Normal mode (default).
         * 02: Secure mode, a relatively strict mode, suitable for high-risk scenarios. (IDV product input parameter)</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder securityLevel(String securityLevel) {
            this.putQueryParameter("SecurityLevel", securityLevel);
            this.securityLevel = securityLevel;
            return this;
        }

        /**
         * <p>In the document OCR recognition step, whether to display the album upload entry:</p>
         * <ul>
         * <li><p><strong>1</strong>: Display (default)</p>
         * </li>
         * <li><p><strong>0</strong>: Do not display</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder showAlbumIcon(String showAlbumIcon) {
            this.putQueryParameter("ShowAlbumIcon", showAlbumIcon);
            this.showAlbumIcon = showAlbumIcon;
            return this;
        }

        /**
         * <p>Switch to control whether to display the guide page:</p>
         * <ul>
         * <li><p><strong>1</strong>: Display (default)</p>
         * </li>
         * <li><p><strong>0</strong>: Do not display</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder showGuidePage(String showGuidePage) {
            this.putQueryParameter("ShowGuidePage", showGuidePage);
            this.showGuidePage = showGuidePage;
            return this;
        }

        /**
         * <p>In the document OCR recognition step, whether to display the recognition result page:</p>
         * <ul>
         * <li><p><strong>1</strong>: Display (default)</p>
         * </li>
         * <li><p><strong>0</strong>: Do not display</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder showOcrResult(String showOcrResult) {
            this.putQueryParameter("ShowOcrResult", showOcrResult);
            this.showOcrResult = showOcrResult;
            return this;
        }

        /**
         * <p>Custom UI configuration. Based on the configuration template, convert your custom UI configuration into a JSON string and pass it through this interface. For more information, see <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/idv-kyc-custom-skin?spm=a2c63.p38356.0.i60">IDV UI Customization</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;guidepage:&quot;: {<strong><strong>}, 
         *   &quot;ocrPage&quot;: {</strong></strong>},
         *   &quot;ocrResultPage&quot;: [<strong><strong>],
         *   &quot;facePage&quot;: {</strong></strong>},
         * }</p>
         */
        public Builder styleConfig(String styleConfig) {
            this.putQueryParameter("StyleConfig", styleConfig);
            this.styleConfig = styleConfig;
            return this;
        }

        /**
         * <p>Base64 encoding of the portrait photo.</p>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        public Builder targetFacePicture(String targetFacePicture) {
            this.putQueryParameter("TargetFacePicture", targetFacePicture);
            this.targetFacePicture = targetFacePicture;
            return this;
        }

        /**
         * <p>Portrait image URL, accessible via public HTTP or HTTPS link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.xxxxx.com/1.jpg">https://www.xxxxx.com/1.jpg</a></p>
         */
        public Builder targetFacePictureUrl(String targetFacePictureUrl) {
            this.putQueryParameter("TargetFacePictureUrl", targetFacePictureUrl);
            this.targetFacePictureUrl = targetFacePictureUrl;
            return this;
        }

        /**
         * <p>When <strong>DocType</strong>=01000000 (global passport), you can choose whether to enable NFC verification.</p>
         * <ul>
         * <li><strong>Y</strong> (enable)</li>
         * <li><strong>N</strong> (disable)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder useNFC(String useNFC) {
            this.putQueryParameter("UseNFC", useNFC);
            this.useNFC = useNFC;
            return this;
        }

        /**
         * <p>Type of verification</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder verifyModel(String verifyModel) {
            this.putQueryParameter("VerifyModel", verifyModel);
            this.verifyModel = verifyModel;
            return this;
        }

        @Override
        public InitializeRequest build() {
            return new InitializeRequest(this);
        } 

    } 

}
