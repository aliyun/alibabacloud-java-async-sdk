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
 * {@link InitAuthVerifyRequest} extends {@link RequestModel}
 *
 * <p>InitAuthVerifyRequest</p>
 */
public class InitAuthVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallbackToken")
    private String callbackToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CardPageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardPageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CardType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocScanMode")
    private String docScanMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdSpoof")
    private String idSpoof;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metaInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OuterOrderNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerOrderNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sceneId;

    private InitAuthVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callbackToken = builder.callbackToken;
        this.callbackUrl = builder.callbackUrl;
        this.cardPageNumber = builder.cardPageNumber;
        this.cardType = builder.cardType;
        this.docScanMode = builder.docScanMode;
        this.idSpoof = builder.idSpoof;
        this.metaInfo = builder.metaInfo;
        this.outerOrderNo = builder.outerOrderNo;
        this.productCode = builder.productCode;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitAuthVerifyRequest create() {
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
     * @return idSpoof
     */
    public String getIdSpoof() {
        return this.idSpoof;
    }

    /**
     * @return metaInfo
     */
    public String getMetaInfo() {
        return this.metaInfo;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<InitAuthVerifyRequest, Builder> {
        private String regionId; 
        private String callbackToken; 
        private String callbackUrl; 
        private String cardPageNumber; 
        private String cardType; 
        private String docScanMode; 
        private String idSpoof; 
        private String metaInfo; 
        private String outerOrderNo; 
        private String productCode; 
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(InitAuthVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callbackToken = request.callbackToken;
            this.callbackUrl = request.callbackUrl;
            this.cardPageNumber = request.cardPageNumber;
            this.cardType = request.cardType;
            this.docScanMode = request.docScanMode;
            this.idSpoof = request.idSpoof;
            this.metaInfo = request.metaInfo;
            this.outerOrderNo = request.outerOrderNo;
            this.productCode = request.productCode;
            this.sceneId = request.sceneId;
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
         * CallbackToken.
         */
        public Builder callbackToken(String callbackToken) {
            this.putBodyParameter("CallbackToken", callbackToken);
            this.callbackToken = callbackToken;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putBodyParameter("CallbackUrl", callbackUrl);
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
            this.putBodyParameter("CardPageNumber", cardPageNumber);
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
            this.putBodyParameter("CardType", cardType);
            this.cardType = cardType;
            return this;
        }

        /**
         * DocScanMode.
         */
        public Builder docScanMode(String docScanMode) {
            this.putBodyParameter("DocScanMode", docScanMode);
            this.docScanMode = docScanMode;
            return this;
        }

        /**
         * IdSpoof.
         */
        public Builder idSpoof(String idSpoof) {
            this.putBodyParameter("IdSpoof", idSpoof);
            this.idSpoof = idSpoof;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;zimVer&quot;: &quot;3.0.0&quot;,
         *   &quot;appVersion&quot;: &quot;1&quot;,
         *   &quot;bioMetaInfo&quot;: &quot;4.1.0:1150****,0&quot;,
         *   &quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,
         *   &quot;deviceType&quot;: &quot;ios&quot;,
         *   &quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,
         *   &quot;apdidToken&quot;: &quot;&quot;,
         *   &quot;deviceModel&quot;: &quot;iPhone9,1&quot;
         * }</p>
         */
        public Builder metaInfo(String metaInfo) {
            this.putBodyParameter("MetaInfo", metaInfo);
            this.metaInfo = metaInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putBodyParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_OCR</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000002996</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public InitAuthVerifyRequest build() {
            return new InitAuthVerifyRequest(this);
        } 

    } 

}
