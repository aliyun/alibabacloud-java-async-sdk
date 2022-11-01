// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardSmsLinkRequest} extends {@link RequestModel}
 *
 * <p>GetCardSmsLinkRequest</p>
 */
public class GetCardSmsLinkRequest extends Request {
    @Query
    @NameInMap("CardCodeType")
    private Integer cardCodeType;

    @Query
    @NameInMap("CardLinkType")
    private Integer cardLinkType;

    @Query
    @NameInMap("CardTemplateCode")
    @Validation(required = true)
    private String cardTemplateCode;

    @Query
    @NameInMap("CardTemplateParamJson")
    private String cardTemplateParamJson;

    @Query
    @NameInMap("CustomShortCodeJson")
    private String customShortCodeJson;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("PhoneNumberJson")
    private String phoneNumberJson;

    @Query
    @NameInMap("SignNameJson")
    @Validation(required = true)
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
         * CardCodeType.
         */
        public Builder cardCodeType(Integer cardCodeType) {
            this.putQueryParameter("CardCodeType", cardCodeType);
            this.cardCodeType = cardCodeType;
            return this;
        }

        /**
         * CardLinkType.
         */
        public Builder cardLinkType(Integer cardLinkType) {
            this.putQueryParameter("CardLinkType", cardLinkType);
            this.cardLinkType = cardLinkType;
            return this;
        }

        /**
         * CardTemplateCode.
         */
        public Builder cardTemplateCode(String cardTemplateCode) {
            this.putQueryParameter("CardTemplateCode", cardTemplateCode);
            this.cardTemplateCode = cardTemplateCode;
            return this;
        }

        /**
         * CardTemplateParamJson.
         */
        public Builder cardTemplateParamJson(String cardTemplateParamJson) {
            this.putQueryParameter("CardTemplateParamJson", cardTemplateParamJson);
            this.cardTemplateParamJson = cardTemplateParamJson;
            return this;
        }

        /**
         * CustomShortCodeJson.
         */
        public Builder customShortCodeJson(String customShortCodeJson) {
            this.putQueryParameter("CustomShortCodeJson", customShortCodeJson);
            this.customShortCodeJson = customShortCodeJson;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * PhoneNumberJson.
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putQueryParameter("PhoneNumberJson", phoneNumberJson);
            this.phoneNumberJson = phoneNumberJson;
            return this;
        }

        /**
         * SignNameJson.
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
