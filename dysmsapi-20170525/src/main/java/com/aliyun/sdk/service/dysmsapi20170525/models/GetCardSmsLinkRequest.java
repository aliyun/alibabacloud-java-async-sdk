// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The code type of the URLs.
         * <p>
         * 
         * *   **1**: group texting
         * *   **2**: personalization
         */
        public Builder cardCodeType(Integer cardCodeType) {
            this.putQueryParameter("CardCodeType", cardCodeType);
            this.cardCodeType = cardCodeType;
            return this;
        }

        /**
         * The type of the short URLs.
         * <p>
         * 
         * *   1: standard short code.
         * *   2: custom short code.
         * 
         * > If the **CardLinkType** is not specified, standard short codes are generated. If you need to generate custom short codes, contact Alibaba Cloud SMS technical support.
         */
        public Builder cardLinkType(Integer cardLinkType) {
            this.putQueryParameter("CardLinkType", cardLinkType);
            this.cardLinkType = cardLinkType;
            return this;
        }

        /**
         * The code of the message template. You can view the template code in the **Template Code** column on the **Templates** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * <p>
         * 
         * > Make sure that the message template has been approved.
         */
        public Builder cardTemplateCode(String cardTemplateCode) {
            this.putQueryParameter("CardTemplateCode", cardTemplateCode);
            this.cardTemplateCode = cardTemplateCode;
            return this;
        }

        /**
         * The variables of the message template.
         */
        public Builder cardTemplateParamJson(String cardTemplateParamJson) {
            this.putQueryParameter("CardTemplateParamJson", cardTemplateParamJson);
            this.cardTemplateParamJson = cardTemplateParamJson;
            return this;
        }

        /**
         * The custom short code. It can contain 4 to 8 digits or letters.
         * <p>
         * 
         * > If the CardLinkType parameter is set to 2, the CustomShortCodeJson parameter is required.
         */
        public Builder customShortCodeJson(String customShortCodeJson) {
            this.putQueryParameter("CustomShortCodeJson", customShortCodeJson);
            this.customShortCodeJson = customShortCodeJson;
            return this;
        }

        /**
         * The original domain name. You must submit domain names for approval in advance.
         * <p>
         * 
         * > 
         * 
         * *   If the **CardLinkType** parameter is set to **2**, the **Domain** parameter is required.
         * 
         * *   The **Domain** parameter cannot exceed 100 characters in length. If the parameter is not specified, a default domain name is used.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The extension field.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * The mobile phone numbers of recipients, custom identifiers, or system identifiers.
         * <p>
         * 
         * > 
         * 
         * *   A maximum of 10,000 mobile phone numbers are supported.
         * 
         * *   You can enter custom identifier. Each identifier can be a maximum of 60 characters in length.
         * 
         * *   You can apply for a maximum of 10 OPPO templates at a time.
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putQueryParameter("PhoneNumberJson", phoneNumberJson);
            this.phoneNumberJson = phoneNumberJson;
            return this;
        }

        /**
         * The signature. You can view the template code in the **Signature** column on the **Signaturess** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * <p>
         * 
         * > The signatures must be approved and correspond to the mobile numbers in sequence.
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
