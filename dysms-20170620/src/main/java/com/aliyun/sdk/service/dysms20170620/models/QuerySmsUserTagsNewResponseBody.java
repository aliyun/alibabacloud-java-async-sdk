// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsUserTagsNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsUserTagsNewResponseBody</p>
 */
public class QuerySmsUserTagsNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsAnyParamTemplateUser")
    private Boolean isAnyParamTemplateUser;

    @com.aliyun.core.annotation.NameInMap("IsBatchCreateSmsSign")
    private Boolean isBatchCreateSmsSign;

    @com.aliyun.core.annotation.NameInMap("IsInnerUser")
    private Boolean isInnerUser;

    @com.aliyun.core.annotation.NameInMap("IsNewUser")
    private Boolean isNewUser;

    @com.aliyun.core.annotation.NameInMap("IsNoneStatusNoChargeCust")
    private Boolean isNoneStatusNoChargeCust;

    @com.aliyun.core.annotation.NameInMap("IsOpenTemplateRule")
    private Boolean isOpenTemplateRule;

    @com.aliyun.core.annotation.NameInMap("IsOpenedCard")
    private Boolean isOpenedCard;

    @com.aliyun.core.annotation.NameInMap("IsOpenedDigit")
    private Boolean isOpenedDigit;

    @com.aliyun.core.annotation.NameInMap("IsOpenedInternationalSms")
    private Boolean isOpenedInternationalSms;

    @com.aliyun.core.annotation.NameInMap("IsOpenedMarket")
    private Boolean isOpenedMarket;

    @com.aliyun.core.annotation.NameInMap("IsOpenedSaas")
    private Boolean isOpenedSaas;

    @com.aliyun.core.annotation.NameInMap("IsOpenedSmppStandardProtocol")
    private Boolean isOpenedSmppStandardProtocol;

    @com.aliyun.core.annotation.NameInMap("IsOpenedStandardProtocol")
    private Boolean isOpenedStandardProtocol;

    @com.aliyun.core.annotation.NameInMap("IsVirtualCust")
    private Boolean isVirtualCust;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private Boolean requestId;

    @com.aliyun.core.annotation.NameInMap("SignCheckCommon")
    private Boolean signCheckCommon;

    @com.aliyun.core.annotation.NameInMap("SignCheckVerification")
    private Boolean signCheckVerification;

    @com.aliyun.core.annotation.NameInMap("SmsInformationSupervision")
    private Boolean smsInformationSupervision;

    private QuerySmsUserTagsNewResponseBody(Builder builder) {
        this.isAnyParamTemplateUser = builder.isAnyParamTemplateUser;
        this.isBatchCreateSmsSign = builder.isBatchCreateSmsSign;
        this.isInnerUser = builder.isInnerUser;
        this.isNewUser = builder.isNewUser;
        this.isNoneStatusNoChargeCust = builder.isNoneStatusNoChargeCust;
        this.isOpenTemplateRule = builder.isOpenTemplateRule;
        this.isOpenedCard = builder.isOpenedCard;
        this.isOpenedDigit = builder.isOpenedDigit;
        this.isOpenedInternationalSms = builder.isOpenedInternationalSms;
        this.isOpenedMarket = builder.isOpenedMarket;
        this.isOpenedSaas = builder.isOpenedSaas;
        this.isOpenedSmppStandardProtocol = builder.isOpenedSmppStandardProtocol;
        this.isOpenedStandardProtocol = builder.isOpenedStandardProtocol;
        this.isVirtualCust = builder.isVirtualCust;
        this.requestId = builder.requestId;
        this.signCheckCommon = builder.signCheckCommon;
        this.signCheckVerification = builder.signCheckVerification;
        this.smsInformationSupervision = builder.smsInformationSupervision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsUserTagsNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isAnyParamTemplateUser
     */
    public Boolean getIsAnyParamTemplateUser() {
        return this.isAnyParamTemplateUser;
    }

    /**
     * @return isBatchCreateSmsSign
     */
    public Boolean getIsBatchCreateSmsSign() {
        return this.isBatchCreateSmsSign;
    }

    /**
     * @return isInnerUser
     */
    public Boolean getIsInnerUser() {
        return this.isInnerUser;
    }

    /**
     * @return isNewUser
     */
    public Boolean getIsNewUser() {
        return this.isNewUser;
    }

    /**
     * @return isNoneStatusNoChargeCust
     */
    public Boolean getIsNoneStatusNoChargeCust() {
        return this.isNoneStatusNoChargeCust;
    }

    /**
     * @return isOpenTemplateRule
     */
    public Boolean getIsOpenTemplateRule() {
        return this.isOpenTemplateRule;
    }

    /**
     * @return isOpenedCard
     */
    public Boolean getIsOpenedCard() {
        return this.isOpenedCard;
    }

    /**
     * @return isOpenedDigit
     */
    public Boolean getIsOpenedDigit() {
        return this.isOpenedDigit;
    }

    /**
     * @return isOpenedInternationalSms
     */
    public Boolean getIsOpenedInternationalSms() {
        return this.isOpenedInternationalSms;
    }

    /**
     * @return isOpenedMarket
     */
    public Boolean getIsOpenedMarket() {
        return this.isOpenedMarket;
    }

    /**
     * @return isOpenedSaas
     */
    public Boolean getIsOpenedSaas() {
        return this.isOpenedSaas;
    }

    /**
     * @return isOpenedSmppStandardProtocol
     */
    public Boolean getIsOpenedSmppStandardProtocol() {
        return this.isOpenedSmppStandardProtocol;
    }

    /**
     * @return isOpenedStandardProtocol
     */
    public Boolean getIsOpenedStandardProtocol() {
        return this.isOpenedStandardProtocol;
    }

    /**
     * @return isVirtualCust
     */
    public Boolean getIsVirtualCust() {
        return this.isVirtualCust;
    }

    /**
     * @return requestId
     */
    public Boolean getRequestId() {
        return this.requestId;
    }

    /**
     * @return signCheckCommon
     */
    public Boolean getSignCheckCommon() {
        return this.signCheckCommon;
    }

    /**
     * @return signCheckVerification
     */
    public Boolean getSignCheckVerification() {
        return this.signCheckVerification;
    }

    /**
     * @return smsInformationSupervision
     */
    public Boolean getSmsInformationSupervision() {
        return this.smsInformationSupervision;
    }

    public static final class Builder {
        private Boolean isAnyParamTemplateUser; 
        private Boolean isBatchCreateSmsSign; 
        private Boolean isInnerUser; 
        private Boolean isNewUser; 
        private Boolean isNoneStatusNoChargeCust; 
        private Boolean isOpenTemplateRule; 
        private Boolean isOpenedCard; 
        private Boolean isOpenedDigit; 
        private Boolean isOpenedInternationalSms; 
        private Boolean isOpenedMarket; 
        private Boolean isOpenedSaas; 
        private Boolean isOpenedSmppStandardProtocol; 
        private Boolean isOpenedStandardProtocol; 
        private Boolean isVirtualCust; 
        private Boolean requestId; 
        private Boolean signCheckCommon; 
        private Boolean signCheckVerification; 
        private Boolean smsInformationSupervision; 

        private Builder() {
        } 

        private Builder(QuerySmsUserTagsNewResponseBody model) {
            this.isAnyParamTemplateUser = model.isAnyParamTemplateUser;
            this.isBatchCreateSmsSign = model.isBatchCreateSmsSign;
            this.isInnerUser = model.isInnerUser;
            this.isNewUser = model.isNewUser;
            this.isNoneStatusNoChargeCust = model.isNoneStatusNoChargeCust;
            this.isOpenTemplateRule = model.isOpenTemplateRule;
            this.isOpenedCard = model.isOpenedCard;
            this.isOpenedDigit = model.isOpenedDigit;
            this.isOpenedInternationalSms = model.isOpenedInternationalSms;
            this.isOpenedMarket = model.isOpenedMarket;
            this.isOpenedSaas = model.isOpenedSaas;
            this.isOpenedSmppStandardProtocol = model.isOpenedSmppStandardProtocol;
            this.isOpenedStandardProtocol = model.isOpenedStandardProtocol;
            this.isVirtualCust = model.isVirtualCust;
            this.requestId = model.requestId;
            this.signCheckCommon = model.signCheckCommon;
            this.signCheckVerification = model.signCheckVerification;
            this.smsInformationSupervision = model.smsInformationSupervision;
        } 

        /**
         * IsAnyParamTemplateUser.
         */
        public Builder isAnyParamTemplateUser(Boolean isAnyParamTemplateUser) {
            this.isAnyParamTemplateUser = isAnyParamTemplateUser;
            return this;
        }

        /**
         * IsBatchCreateSmsSign.
         */
        public Builder isBatchCreateSmsSign(Boolean isBatchCreateSmsSign) {
            this.isBatchCreateSmsSign = isBatchCreateSmsSign;
            return this;
        }

        /**
         * IsInnerUser.
         */
        public Builder isInnerUser(Boolean isInnerUser) {
            this.isInnerUser = isInnerUser;
            return this;
        }

        /**
         * IsNewUser.
         */
        public Builder isNewUser(Boolean isNewUser) {
            this.isNewUser = isNewUser;
            return this;
        }

        /**
         * IsNoneStatusNoChargeCust.
         */
        public Builder isNoneStatusNoChargeCust(Boolean isNoneStatusNoChargeCust) {
            this.isNoneStatusNoChargeCust = isNoneStatusNoChargeCust;
            return this;
        }

        /**
         * IsOpenTemplateRule.
         */
        public Builder isOpenTemplateRule(Boolean isOpenTemplateRule) {
            this.isOpenTemplateRule = isOpenTemplateRule;
            return this;
        }

        /**
         * IsOpenedCard.
         */
        public Builder isOpenedCard(Boolean isOpenedCard) {
            this.isOpenedCard = isOpenedCard;
            return this;
        }

        /**
         * IsOpenedDigit.
         */
        public Builder isOpenedDigit(Boolean isOpenedDigit) {
            this.isOpenedDigit = isOpenedDigit;
            return this;
        }

        /**
         * IsOpenedInternationalSms.
         */
        public Builder isOpenedInternationalSms(Boolean isOpenedInternationalSms) {
            this.isOpenedInternationalSms = isOpenedInternationalSms;
            return this;
        }

        /**
         * IsOpenedMarket.
         */
        public Builder isOpenedMarket(Boolean isOpenedMarket) {
            this.isOpenedMarket = isOpenedMarket;
            return this;
        }

        /**
         * IsOpenedSaas.
         */
        public Builder isOpenedSaas(Boolean isOpenedSaas) {
            this.isOpenedSaas = isOpenedSaas;
            return this;
        }

        /**
         * IsOpenedSmppStandardProtocol.
         */
        public Builder isOpenedSmppStandardProtocol(Boolean isOpenedSmppStandardProtocol) {
            this.isOpenedSmppStandardProtocol = isOpenedSmppStandardProtocol;
            return this;
        }

        /**
         * IsOpenedStandardProtocol.
         */
        public Builder isOpenedStandardProtocol(Boolean isOpenedStandardProtocol) {
            this.isOpenedStandardProtocol = isOpenedStandardProtocol;
            return this;
        }

        /**
         * IsVirtualCust.
         */
        public Builder isVirtualCust(Boolean isVirtualCust) {
            this.isVirtualCust = isVirtualCust;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(Boolean requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SignCheckCommon.
         */
        public Builder signCheckCommon(Boolean signCheckCommon) {
            this.signCheckCommon = signCheckCommon;
            return this;
        }

        /**
         * SignCheckVerification.
         */
        public Builder signCheckVerification(Boolean signCheckVerification) {
            this.signCheckVerification = signCheckVerification;
            return this;
        }

        /**
         * SmsInformationSupervision.
         */
        public Builder smsInformationSupervision(Boolean smsInformationSupervision) {
            this.smsInformationSupervision = smsInformationSupervision;
            return this;
        }

        public QuerySmsUserTagsNewResponseBody build() {
            return new QuerySmsUserTagsNewResponseBody(this);
        } 

    } 

}
