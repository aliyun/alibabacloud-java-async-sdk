// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
    @com.aliyun.core.annotation.NameInMap("Crop")
    private String crop;

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

    private InitializeRequest(Builder builder) {
        super(builder);
        this.appQualityCheck = builder.appQualityCheck;
        this.authorize = builder.authorize;
        this.callbackToken = builder.callbackToken;
        this.callbackUrl = builder.callbackUrl;
        this.crop = builder.crop;
        this.docScanMode = builder.docScanMode;
        this.docType = builder.docType;
        this.docVideo = builder.docVideo;
        this.experienceCode = builder.experienceCode;
        this.facePictureBase64 = builder.facePictureBase64;
        this.facePictureUrl = builder.facePictureUrl;
        this.idFaceQuality = builder.idFaceQuality;
        this.idSpoof = builder.idSpoof;
        this.idThreshold = builder.idThreshold;
        this.languageConfig = builder.languageConfig;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.metaInfo = builder.metaInfo;
        this.model = builder.model;
        this.ocr = builder.ocr;
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
     * @return crop
     */
    public String getCrop() {
        return this.crop;
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

    public static final class Builder extends Request.Builder<InitializeRequest, Builder> {
        private String appQualityCheck; 
        private String authorize; 
        private String callbackToken; 
        private String callbackUrl; 
        private String crop; 
        private String docScanMode; 
        private String docType; 
        private String docVideo; 
        private String experienceCode; 
        private String facePictureBase64; 
        private String facePictureUrl; 
        private String idFaceQuality; 
        private String idSpoof; 
        private String idThreshold; 
        private String languageConfig; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String metaInfo; 
        private String model; 
        private String ocr; 
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

        private Builder() {
            super();
        } 

        private Builder(InitializeRequest request) {
            super(request);
            this.appQualityCheck = request.appQualityCheck;
            this.authorize = request.authorize;
            this.callbackToken = request.callbackToken;
            this.callbackUrl = request.callbackUrl;
            this.crop = request.crop;
            this.docScanMode = request.docScanMode;
            this.docType = request.docType;
            this.docVideo = request.docVideo;
            this.experienceCode = request.experienceCode;
            this.facePictureBase64 = request.facePictureBase64;
            this.facePictureUrl = request.facePictureUrl;
            this.idFaceQuality = request.idFaceQuality;
            this.idSpoof = request.idSpoof;
            this.idThreshold = request.idThreshold;
            this.languageConfig = request.languageConfig;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.metaInfo = request.metaInfo;
            this.model = request.model;
            this.ocr = request.ocr;
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
         * Crop.
         */
        public Builder crop(String crop) {
            this.putQueryParameter("Crop", crop);
            this.crop = crop;
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

        @Override
        public InitializeRequest build() {
            return new InitializeRequest(this);
        } 

    } 

}
