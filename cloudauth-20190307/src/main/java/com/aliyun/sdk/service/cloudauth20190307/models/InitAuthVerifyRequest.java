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
         * <p>A security token that you generate to prevent replay attacks and data tampering.
         * If this value is set, the CallbackToken field is included in the callback to CallbackUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
         */
        public Builder callbackToken(String callbackToken) {
            this.putBodyParameter("CallbackToken", callbackToken);
            this.callbackToken = callbackToken;
            return this;
        }

        /**
         * <p>The callback URL for OCR results. The callback request method is GET by default. The callback URL must start with https. After OCR is completed, a callback is sent to this URL with the certifyId and subcode fields automatically appended.</p>
         * <blockquote>
         * <p>Warning</p>
         * </blockquote>
         * <ul>
         * <li>The URL is validated for public network access before the API is invoked. If the URL is not publicly accessible, a 400 error is returned.</li>
         * <li>The callback is executed immediately after the OCR invocation is completed, but may be delayed due to network issues. Accept the request completion notification from the client side first, and then invoke the query API to obtain the result details.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com?callbackToken=100000****&certifyId=shaxxxx&subCode=200">https://www.aliyun.com?callbackToken=100000****&amp;certifyId=shaxxxx&amp;subCode=200</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putBodyParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The number of card pages collected by the SDK. Valid values:</p>
         * <ul>
         * <li>&quot;1&quot;: front side only</li>
         * <li>&quot;2&quot;: both front and back sides.</li>
         * </ul>
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
         * <p>The document type. Set the value to IDENTITY_CARD.</p>
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
         * <p>The OCR document scan pattern. Valid values:</p>
         * <ul>
         * <li>shoot (default): photo capture</li>
         * <li>scan: scan</li>
         * <li>auto: automatic switchover between photo capture and scan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shoot</p>
         */
        public Builder docScanMode(String docScanMode) {
            this.putBodyParameter("DocScanMode", docScanMode);
            this.docScanMode = docScanMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable the document anti-forgery detection feature. Valid values:</p>
         * <ul>
         * <li>Y: Enabled.</li>
         * <li>N: Disabled. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder idSpoof(String idSpoof) {
            this.putBodyParameter("IdSpoof", idSpoof);
            this.idSpoof = idSpoof;
            return this;
        }

        /**
         * <p>The MetaInfo environment parameter, which must be obtained from the client SDK.</p>
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
         * <p>A custom business unique identifier that you specify for subsequent troubleshooting.</p>
         * <p>The value can contain letters (both uppercase and lowercase) and digits, with a maximum length of 32 characters.</p>
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
         * <p>The product solution to use. Set the value to ID_OCR.</p>
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
         * <p>The China Chinese authentication scenario ID.</p>
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
