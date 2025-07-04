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
    @com.aliyun.core.annotation.NameInMap("ExperienceCode")
    private String experienceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FacePictureBase64")
    private String facePictureBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePictureUrl")
    private String facePictureUrl;

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
    @com.aliyun.core.annotation.NameInMap("ReturnUrl")
    private String returnUrl;

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
    @com.aliyun.core.annotation.NameInMap("UseNFC")
    private String useNFC;

    private InitializeRequest(Builder builder) {
        super(builder);
        this.appQualityCheck = builder.appQualityCheck;
        this.authorize = builder.authorize;
        this.callbackToken = builder.callbackToken;
        this.callbackUrl = builder.callbackUrl;
        this.chameleonFrameEnable = builder.chameleonFrameEnable;
        this.crop = builder.crop;
        this.dateOfBirth = builder.dateOfBirth;
        this.dateOfExpiry = builder.dateOfExpiry;
        this.docPageConfig = builder.docPageConfig;
        this.docScanMode = builder.docScanMode;
        this.docType = builder.docType;
        this.docVideo = builder.docVideo;
        this.documentNumber = builder.documentNumber;
        this.experienceCode = builder.experienceCode;
        this.facePictureBase64 = builder.facePictureBase64;
        this.facePictureUrl = builder.facePictureUrl;
        this.idFaceQuality = builder.idFaceQuality;
        this.idSpoof = builder.idSpoof;
        this.idThreshold = builder.idThreshold;
        this.languageConfig = builder.languageConfig;
        this.MRTDInput = builder.MRTDInput;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.metaInfo = builder.metaInfo;
        this.model = builder.model;
        this.ocr = builder.ocr;
        this.pages = builder.pages;
        this.procedurePriority = builder.procedurePriority;
        this.productCode = builder.productCode;
        this.productFlow = builder.productFlow;
        this.returnUrl = builder.returnUrl;
        this.sceneCode = builder.sceneCode;
        this.securityLevel = builder.securityLevel;
        this.showAlbumIcon = builder.showAlbumIcon;
        this.showGuidePage = builder.showGuidePage;
        this.showOcrResult = builder.showOcrResult;
        this.styleConfig = builder.styleConfig;
        this.useNFC = builder.useNFC;
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
     * @return experienceCode
     */
    public String getExperienceCode() {
        return this.experienceCode;
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
     * @return returnUrl
     */
    public String getReturnUrl() {
        return this.returnUrl;
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
     * @return useNFC
     */
    public String getUseNFC() {
        return this.useNFC;
    }

    public static final class Builder extends Request.Builder<InitializeRequest, Builder> {
        private String appQualityCheck; 
        private String authorize; 
        private String callbackToken; 
        private String callbackUrl; 
        private String chameleonFrameEnable; 
        private String crop; 
        private String dateOfBirth; 
        private String dateOfExpiry; 
        private java.util.List<String> docPageConfig; 
        private String docScanMode; 
        private String docType; 
        private String docVideo; 
        private String documentNumber; 
        private String experienceCode; 
        private String facePictureBase64; 
        private String facePictureUrl; 
        private String idFaceQuality; 
        private String idSpoof; 
        private String idThreshold; 
        private String languageConfig; 
        private String MRTDInput; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String metaInfo; 
        private String model; 
        private String ocr; 
        private String pages; 
        private String procedurePriority; 
        private String productCode; 
        private String productFlow; 
        private String returnUrl; 
        private String sceneCode; 
        private String securityLevel; 
        private String showAlbumIcon; 
        private String showGuidePage; 
        private String showOcrResult; 
        private String styleConfig; 
        private String useNFC; 

        private Builder() {
            super();
        } 

        private Builder(InitializeRequest request) {
            super(request);
            this.appQualityCheck = request.appQualityCheck;
            this.authorize = request.authorize;
            this.callbackToken = request.callbackToken;
            this.callbackUrl = request.callbackUrl;
            this.chameleonFrameEnable = request.chameleonFrameEnable;
            this.crop = request.crop;
            this.dateOfBirth = request.dateOfBirth;
            this.dateOfExpiry = request.dateOfExpiry;
            this.docPageConfig = request.docPageConfig;
            this.docScanMode = request.docScanMode;
            this.docType = request.docType;
            this.docVideo = request.docVideo;
            this.documentNumber = request.documentNumber;
            this.experienceCode = request.experienceCode;
            this.facePictureBase64 = request.facePictureBase64;
            this.facePictureUrl = request.facePictureUrl;
            this.idFaceQuality = request.idFaceQuality;
            this.idSpoof = request.idSpoof;
            this.idThreshold = request.idThreshold;
            this.languageConfig = request.languageConfig;
            this.MRTDInput = request.MRTDInput;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.metaInfo = request.metaInfo;
            this.model = request.model;
            this.ocr = request.ocr;
            this.pages = request.pages;
            this.procedurePriority = request.procedurePriority;
            this.productCode = request.productCode;
            this.productFlow = request.productFlow;
            this.returnUrl = request.returnUrl;
            this.sceneCode = request.sceneCode;
            this.securityLevel = request.securityLevel;
            this.showAlbumIcon = request.showAlbumIcon;
            this.showGuidePage = request.showGuidePage;
            this.showOcrResult = request.showOcrResult;
            this.styleConfig = request.styleConfig;
            this.useNFC = request.useNFC;
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
         * Authorize.
         */
        public Builder authorize(String authorize) {
            this.putQueryParameter("Authorize", authorize);
            this.authorize = authorize;
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
         * ChameleonFrameEnable.
         */
        public Builder chameleonFrameEnable(String chameleonFrameEnable) {
            this.putQueryParameter("ChameleonFrameEnable", chameleonFrameEnable);
            this.chameleonFrameEnable = chameleonFrameEnable;
            return this;
        }

        /**
         * Crop.
         */
        public Builder crop(String crop) {
            this.putQueryParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * DateOfBirth.
         */
        public Builder dateOfBirth(String dateOfBirth) {
            this.putQueryParameter("DateOfBirth", dateOfBirth);
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * DateOfExpiry.
         */
        public Builder dateOfExpiry(String dateOfExpiry) {
            this.putQueryParameter("DateOfExpiry", dateOfExpiry);
            this.dateOfExpiry = dateOfExpiry;
            return this;
        }

        /**
         * DocPageConfig.
         */
        public Builder docPageConfig(java.util.List<String> docPageConfig) {
            String docPageConfigShrink = shrink(docPageConfig, "DocPageConfig", "json");
            this.putQueryParameter("DocPageConfig", docPageConfigShrink);
            this.docPageConfig = docPageConfig;
            return this;
        }

        /**
         * DocScanMode.
         */
        public Builder docScanMode(String docScanMode) {
            this.putQueryParameter("DocScanMode", docScanMode);
            this.docScanMode = docScanMode;
            return this;
        }

        /**
         * DocType.
         */
        public Builder docType(String docType) {
            this.putQueryParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * DocVideo.
         */
        public Builder docVideo(String docVideo) {
            this.putQueryParameter("DocVideo", docVideo);
            this.docVideo = docVideo;
            return this;
        }

        /**
         * DocumentNumber.
         */
        public Builder documentNumber(String documentNumber) {
            this.putQueryParameter("DocumentNumber", documentNumber);
            this.documentNumber = documentNumber;
            return this;
        }

        /**
         * ExperienceCode.
         */
        public Builder experienceCode(String experienceCode) {
            this.putQueryParameter("ExperienceCode", experienceCode);
            this.experienceCode = experienceCode;
            return this;
        }

        /**
         * FacePictureBase64.
         */
        public Builder facePictureBase64(String facePictureBase64) {
            this.putBodyParameter("FacePictureBase64", facePictureBase64);
            this.facePictureBase64 = facePictureBase64;
            return this;
        }

        /**
         * FacePictureUrl.
         */
        public Builder facePictureUrl(String facePictureUrl) {
            this.putQueryParameter("FacePictureUrl", facePictureUrl);
            this.facePictureUrl = facePictureUrl;
            return this;
        }

        /**
         * IdFaceQuality.
         */
        public Builder idFaceQuality(String idFaceQuality) {
            this.putQueryParameter("IdFaceQuality", idFaceQuality);
            this.idFaceQuality = idFaceQuality;
            return this;
        }

        /**
         * IdSpoof.
         */
        public Builder idSpoof(String idSpoof) {
            this.putQueryParameter("IdSpoof", idSpoof);
            this.idSpoof = idSpoof;
            return this;
        }

        /**
         * IdThreshold.
         */
        public Builder idThreshold(String idThreshold) {
            this.putQueryParameter("IdThreshold", idThreshold);
            this.idThreshold = idThreshold;
            return this;
        }

        /**
         * LanguageConfig.
         */
        public Builder languageConfig(String languageConfig) {
            this.putQueryParameter("LanguageConfig", languageConfig);
            this.languageConfig = languageConfig;
            return this;
        }

        /**
         * MRTDInput.
         */
        public Builder MRTDInput(String MRTDInput) {
            this.putQueryParameter("MRTDInput", MRTDInput);
            this.MRTDInput = MRTDInput;
            return this;
        }

        /**
         * MerchantBizId.
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * MerchantUserId.
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
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
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>OCR。</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder ocr(String ocr) {
            this.putQueryParameter("Ocr", ocr);
            this.ocr = ocr;
            return this;
        }

        /**
         * Pages.
         */
        public Builder pages(String pages) {
            this.putQueryParameter("Pages", pages);
            this.pages = pages;
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
         * ProductFlow.
         */
        public Builder productFlow(String productFlow) {
            this.putQueryParameter("ProductFlow", productFlow);
            this.productFlow = productFlow;
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
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * SecurityLevel.
         */
        public Builder securityLevel(String securityLevel) {
            this.putQueryParameter("SecurityLevel", securityLevel);
            this.securityLevel = securityLevel;
            return this;
        }

        /**
         * ShowAlbumIcon.
         */
        public Builder showAlbumIcon(String showAlbumIcon) {
            this.putQueryParameter("ShowAlbumIcon", showAlbumIcon);
            this.showAlbumIcon = showAlbumIcon;
            return this;
        }

        /**
         * ShowGuidePage.
         */
        public Builder showGuidePage(String showGuidePage) {
            this.putQueryParameter("ShowGuidePage", showGuidePage);
            this.showGuidePage = showGuidePage;
            return this;
        }

        /**
         * ShowOcrResult.
         */
        public Builder showOcrResult(String showOcrResult) {
            this.putQueryParameter("ShowOcrResult", showOcrResult);
            this.showOcrResult = showOcrResult;
            return this;
        }

        /**
         * StyleConfig.
         */
        public Builder styleConfig(String styleConfig) {
            this.putQueryParameter("StyleConfig", styleConfig);
            this.styleConfig = styleConfig;
            return this;
        }

        /**
         * UseNFC.
         */
        public Builder useNFC(String useNFC) {
            this.putQueryParameter("UseNFC", useNFC);
            this.useNFC = useNFC;
            return this;
        }

        @Override
        public InitializeRequest build() {
            return new InitializeRequest(this);
        } 

    } 

}
