// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link GetCardSmsLinkRequest} extends {@link RequestModel}
 *
 * <p>GetCardSmsLinkRequest</p>
 */
public class GetCardSmsLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardCodeType")
    private Integer cardCodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardLinkType")
    private Integer cardLinkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardTemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardTemplateParamJson")
    private String cardTemplateParamJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomShortCodeJson")
    private String customShortCodeJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumberJson")
    private String phoneNumberJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignNameJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signNameJson;

    private GetCardSmsLinkRequest(Builder builder) {
        super(builder);
        this.cardCodeType = builder.cardCodeType;
        this.cardLinkType = builder.cardLinkType;
        this.cardTemplateCode = builder.cardTemplateCode;
        this.cardTemplateParamJson = builder.cardTemplateParamJson;
        this.customShortCodeJson = builder.customShortCodeJson;
        this.domain = builder.domain;
        this.outId = builder.outId;
        this.phoneNumberJson = builder.phoneNumberJson;
        this.signNameJson = builder.signNameJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardSmsLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cardCodeType
     */
    public Integer getCardCodeType() {
        return this.cardCodeType;
    }

    /**
     * @return cardLinkType
     */
    public Integer getCardLinkType() {
        return this.cardLinkType;
    }

    /**
     * @return cardTemplateCode
     */
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    /**
     * @return cardTemplateParamJson
     */
    public String getCardTemplateParamJson() {
        return this.cardTemplateParamJson;
    }

    /**
     * @return customShortCodeJson
     */
    public String getCustomShortCodeJson() {
        return this.customShortCodeJson;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return phoneNumberJson
     */
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    /**
     * @return signNameJson
     */
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public static final class Builder extends Request.Builder<GetCardSmsLinkRequest, Builder> {
        private Integer cardCodeType; 
        private Integer cardLinkType; 
        private String cardTemplateCode; 
        private String cardTemplateParamJson; 
        private String customShortCodeJson; 
        private String domain; 
        private String outId; 
        private String phoneNumberJson; 
        private String signNameJson; 

        private Builder() {
            super();
        } 

        private Builder(GetCardSmsLinkRequest request) {
            super(request);
            this.cardCodeType = request.cardCodeType;
            this.cardLinkType = request.cardLinkType;
            this.cardTemplateCode = request.cardTemplateCode;
            this.cardTemplateParamJson = request.cardTemplateParamJson;
            this.customShortCodeJson = request.customShortCodeJson;
            this.domain = request.domain;
            this.outId = request.outId;
            this.phoneNumberJson = request.phoneNumberJson;
            this.signNameJson = request.signNameJson;
        } 

        /**
         * <p>The code type of the URLs.</p>
         * <ul>
         * <li><strong>1</strong>: group texting</li>
         * <li><strong>2</strong>: personalization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cardCodeType(Integer cardCodeType) {
            this.putQueryParameter("CardCodeType", cardCodeType);
            this.cardCodeType = cardCodeType;
            return this;
        }

        /**
         * <p>The type of the short URLs.</p>
         * <ul>
         * <li>1: standard short code.</li>
         * <li>2: custom short code.</li>
         * </ul>
         * <blockquote>
         * <p>If the <strong>CardLinkType</strong> is not specified, standard short codes are generated. If you need to generate custom short codes, contact Alibaba Cloud SMS technical support.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cardLinkType(Integer cardLinkType) {
            this.putQueryParameter("CardLinkType", cardLinkType);
            this.cardLinkType = cardLinkType;
            return this;
        }

        /**
         * <p>The code of the message template. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
         * <blockquote>
         * <p>Make sure that the message template has been approved.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CARD_SMS_****</p>
         */
        public Builder cardTemplateCode(String cardTemplateCode) {
            this.putQueryParameter("CardTemplateCode", cardTemplateCode);
            this.cardTemplateCode = cardTemplateCode;
            return this;
        }

        /**
         * <p>The variables of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>[{},{}]</p>
         */
        public Builder cardTemplateParamJson(String cardTemplateParamJson) {
            this.putQueryParameter("CardTemplateParamJson", cardTemplateParamJson);
            this.cardTemplateParamJson = cardTemplateParamJson;
            return this;
        }

        /**
         * <p>The custom short code. It can contain 4 to 8 digits or letters.</p>
         * <blockquote>
         * <p>If the CardLinkType parameter is set to 2, the CustomShortCodeJson parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abCde</p>
         */
        public Builder customShortCodeJson(String customShortCodeJson) {
            this.putQueryParameter("CustomShortCodeJson", customShortCodeJson);
            this.customShortCodeJson = customShortCodeJson;
            return this;
        }

        /**
         * <p>The original domain name. You must submit domain names for approval in advance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the <strong>CardLinkType</strong> parameter is set to <strong>2</strong>, the <strong>Domain</strong> parameter is required.</p>
         * </li>
         * <li><p>The <strong>Domain</strong> parameter cannot exceed 100 characters in length. If the parameter is not specified, a default domain name is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>xxx.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>BC20220608102511660860762****</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * <p>The mobile phone numbers of recipients, custom identifiers, or system identifiers.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>A maximum of 10,000 mobile phone numbers are supported.</p>
         * </li>
         * <li><p>You can enter custom identifier. Each identifier can be a maximum of 60 characters in length.</p>
         * </li>
         * <li><p>You can apply for a maximum of 10 OPPO templates at a time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1390000****
         * &quot;,&quot;1370000****
         * &quot;]</p>
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putQueryParameter("PhoneNumberJson", phoneNumberJson);
            this.phoneNumberJson = phoneNumberJson;
            return this;
        }

        /**
         * <p>The signature. You can view the template code in the <strong>Signature</strong> column on the <strong>Signaturess</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
         * <blockquote>
         * <p>The signatures must be approved and correspond to the mobile numbers in sequence.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;aliyun&quot;, &quot;aliyun2&quot;]</p>
         */
        public Builder signNameJson(String signNameJson) {
            this.putQueryParameter("SignNameJson", signNameJson);
            this.signNameJson = signNameJson;
            return this;
        }

        @Override
        public GetCardSmsLinkRequest build() {
            return new GetCardSmsLinkRequest(this);
        } 

    } 

}
