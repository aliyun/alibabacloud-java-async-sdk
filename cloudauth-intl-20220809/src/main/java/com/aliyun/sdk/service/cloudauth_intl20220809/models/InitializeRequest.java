// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeRequest} extends {@link RequestModel}
 *
 * <p>InitializeRequest</p>
 */
public class InitializeRequest extends Request {
    @Query
    @NameInMap("Authorize")
    private String authorize;

    @Query
    @NameInMap("CallbackToken")
    private String callbackToken;

    @Query
    @NameInMap("CallbackUrl")
    private String callbackUrl;

    @Query
    @NameInMap("Crop")
    private String crop;

    @Query
    @NameInMap("DocScanMode")
    private String docScanMode;

    @Query
    @NameInMap("DocType")
    private String docType;

    @Body
    @NameInMap("FacePictureBase64")
    private String facePictureBase64;

    @Query
    @NameInMap("FacePictureUrl")
    private String facePictureUrl;

    @Query
    @NameInMap("IdFaceQuality")
    private String idFaceQuality;

    @Query
    @NameInMap("IdSpoof")
    private String idSpoof;

    @Query
    @NameInMap("LanguageConfig")
    private String languageConfig;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    @Query
    @NameInMap("MerchantUserId")
    private String merchantUserId;

    @Query
    @NameInMap("MetaInfo")
    private String metaInfo;

    @Query
    @NameInMap("Ocr")
    private String ocr;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductFlow")
    private String productFlow;

    @Query
    @NameInMap("ReturnUrl")
    private String returnUrl;

    @Query
    @NameInMap("SceneCode")
    private String sceneCode;

    @Query
    @NameInMap("SecurityLevel")
    private String securityLevel;

    @Query
    @NameInMap("StyleConfig")
    private String styleConfig;

    private InitializeRequest(Builder builder) {
        super(builder);
        this.authorize = builder.authorize;
        this.callbackToken = builder.callbackToken;
        this.callbackUrl = builder.callbackUrl;
        this.crop = builder.crop;
        this.docScanMode = builder.docScanMode;
        this.docType = builder.docType;
        this.facePictureBase64 = builder.facePictureBase64;
        this.facePictureUrl = builder.facePictureUrl;
        this.idFaceQuality = builder.idFaceQuality;
        this.idSpoof = builder.idSpoof;
        this.languageConfig = builder.languageConfig;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.metaInfo = builder.metaInfo;
        this.ocr = builder.ocr;
        this.productCode = builder.productCode;
        this.productFlow = builder.productFlow;
        this.returnUrl = builder.returnUrl;
        this.sceneCode = builder.sceneCode;
        this.securityLevel = builder.securityLevel;
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
     * @return ocr
     */
    public String getOcr() {
        return this.ocr;
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
     * @return styleConfig
     */
    public String getStyleConfig() {
        return this.styleConfig;
    }

    public static final class Builder extends Request.Builder<InitializeRequest, Builder> {
        private String authorize; 
        private String callbackToken; 
        private String callbackUrl; 
        private String crop; 
        private String docScanMode; 
        private String docType; 
        private String facePictureBase64; 
        private String facePictureUrl; 
        private String idFaceQuality; 
        private String idSpoof; 
        private String languageConfig; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String metaInfo; 
        private String ocr; 
        private String productCode; 
        private String productFlow; 
        private String returnUrl; 
        private String sceneCode; 
        private String securityLevel; 
        private String styleConfig; 

        private Builder() {
            super();
        } 

        private Builder(InitializeRequest request) {
            super(request);
            this.authorize = request.authorize;
            this.callbackToken = request.callbackToken;
            this.callbackUrl = request.callbackUrl;
            this.crop = request.crop;
            this.docScanMode = request.docScanMode;
            this.docType = request.docType;
            this.facePictureBase64 = request.facePictureBase64;
            this.facePictureUrl = request.facePictureUrl;
            this.idFaceQuality = request.idFaceQuality;
            this.idSpoof = request.idSpoof;
            this.languageConfig = request.languageConfig;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.metaInfo = request.metaInfo;
            this.ocr = request.ocr;
            this.productCode = request.productCode;
            this.productFlow = request.productFlow;
            this.returnUrl = request.returnUrl;
            this.sceneCode = request.sceneCode;
            this.securityLevel = request.securityLevel;
            this.styleConfig = request.styleConfig;
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
         * OCR。
         */
        public Builder ocr(String ocr) {
            this.putQueryParameter("Ocr", ocr);
            this.ocr = ocr;
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
