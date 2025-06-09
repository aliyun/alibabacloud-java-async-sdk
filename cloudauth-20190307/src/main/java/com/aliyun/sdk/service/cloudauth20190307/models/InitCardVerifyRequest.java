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
 * {@link InitCardVerifyRequest} extends {@link RequestModel}
 *
 * <p>InitCardVerifyRequest</p>
 */
public class InitCardVerifyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackToken")
    private String callbackToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardPageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardPageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocScanMode")
    private String docScanMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metaInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    @com.aliyun.core.annotation.Validation(required = true)
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PictureSave")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pictureSave;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyMeta")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyMeta;

    private InitCardVerifyRequest(Builder builder) {
        super(builder);
        this.callbackToken = builder.callbackToken;
        this.callbackUrl = builder.callbackUrl;
        this.cardPageNumber = builder.cardPageNumber;
        this.cardType = builder.cardType;
        this.docScanMode = builder.docScanMode;
        this.merchantBizId = builder.merchantBizId;
        this.metaInfo = builder.metaInfo;
        this.model = builder.model;
        this.pictureSave = builder.pictureSave;
        this.verifyMeta = builder.verifyMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitCardVerifyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return cardPageNumber
     */
    public String getCardPageNumber() {
        return this.cardPageNumber;
    }

    /**
     * @return cardType
     */
    public String getCardType() {
        return this.cardType;
    }

    /**
     * @return docScanMode
     */
    public String getDocScanMode() {
        return this.docScanMode;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
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
     * @return pictureSave
     */
    public String getPictureSave() {
        return this.pictureSave;
    }

    /**
     * @return verifyMeta
     */
    public String getVerifyMeta() {
        return this.verifyMeta;
    }

    public static final class Builder extends Request.Builder<InitCardVerifyRequest, Builder> {
        private String callbackToken; 
        private String callbackUrl; 
        private String cardPageNumber; 
        private String cardType; 
        private String docScanMode; 
        private String merchantBizId; 
        private String metaInfo; 
        private String model; 
        private String pictureSave; 
        private String verifyMeta; 

        private Builder() {
            super();
        } 

        private Builder(InitCardVerifyRequest request) {
            super(request);
            this.callbackToken = request.callbackToken;
            this.callbackUrl = request.callbackUrl;
            this.cardPageNumber = request.cardPageNumber;
            this.cardType = request.cardType;
            this.docScanMode = request.docScanMode;
            this.merchantBizId = request.merchantBizId;
            this.metaInfo = request.metaInfo;
            this.model = request.model;
            this.pictureSave = request.pictureSave;
            this.verifyMeta = request.verifyMeta;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cardPageNumber(String cardPageNumber) {
            this.putQueryParameter("CardPageNumber", cardPageNumber);
            this.cardPageNumber = cardPageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IDENTITY_CARD</p>
         */
        public Builder cardType(String cardType) {
            this.putQueryParameter("CardType", cardType);
            this.cardType = cardType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;zimVer&quot;:&quot;3.0.0&quot;,&quot;appVersion&quot;: &quot;1&quot;,&quot;bioMetaInfo&quot;: &quot;4.1.0:1150****,0&quot;,&quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,&quot;deviceType&quot;: &quot;ios&quot;,&quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,&quot;apdidToken&quot;: &quot;&quot;,&quot;deviceModel&quot;: &quot;iPhone9,1&quot;}</p>
         */
        public Builder metaInfo(String metaInfo) {
            this.putQueryParameter("MetaInfo", metaInfo);
            this.metaInfo = metaInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OCR_VERIFY</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder pictureSave(String pictureSave) {
            this.putQueryParameter("PictureSave", pictureSave);
            this.pictureSave = pictureSave;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_2_META</p>
         */
        public Builder verifyMeta(String verifyMeta) {
            this.putQueryParameter("VerifyMeta", verifyMeta);
            this.verifyMeta = verifyMeta;
            return this;
        }

        @Override
        public InitCardVerifyRequest build() {
            return new InitCardVerifyRequest(this);
        } 

    } 

}
