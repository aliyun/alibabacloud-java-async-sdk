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
 * {@link QuerySmsBaseScreenNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsBaseScreenNewResponseBody</p>
 */
public class QuerySmsBaseScreenNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountBalance")
    private String accountBalance;

    @com.aliyun.core.annotation.NameInMap("CardAbilityMark")
    private String cardAbilityMark;

    @com.aliyun.core.annotation.NameInMap("CardCustomerMark")
    private String cardCustomerMark;

    @com.aliyun.core.annotation.NameInMap("CertifyType")
    private String certifyType;

    @com.aliyun.core.annotation.NameInMap("ChannelType")
    private String channelType;

    @com.aliyun.core.annotation.NameInMap("ChildAccountAuth")
    private String childAccountAuth;

    @com.aliyun.core.annotation.NameInMap("CreditValue")
    private String creditValue;

    @com.aliyun.core.annotation.NameInMap("CurrentLocale")
    private String currentLocale;

    @com.aliyun.core.annotation.NameInMap("CustFrom")
    private Integer custFrom;

    @com.aliyun.core.annotation.NameInMap("CustName")
    private String custName;

    @com.aliyun.core.annotation.NameInMap("DataAbilityMark")
    private String dataAbilityMark;

    @com.aliyun.core.annotation.NameInMap("DayuMigrateStatus")
    private Integer dayuMigrateStatus;

    @com.aliyun.core.annotation.NameInMap("InvoiceBalance")
    private String invoiceBalance;

    @com.aliyun.core.annotation.NameInMap("IpSmsAbilityMark")
    private String ipSmsAbilityMark;

    @com.aliyun.core.annotation.NameInMap("IsAccountMerged")
    private Boolean isAccountMerged;

    @com.aliyun.core.annotation.NameInMap("IsAliInnerUser")
    private Boolean isAliInnerUser;

    @com.aliyun.core.annotation.NameInMap("IsChineseUser")
    private Boolean isChineseUser;

    @com.aliyun.core.annotation.NameInMap("IsDayuCustomer")
    private Boolean isDayuCustomer;

    @com.aliyun.core.annotation.NameInMap("IsDayuTopCust")
    private Boolean isDayuTopCust;

    @com.aliyun.core.annotation.NameInMap("IsMnsForceMigratingCustomer")
    private Boolean isMnsForceMigratingCustomer;

    @com.aliyun.core.annotation.NameInMap("IsMnsMigratingCustomer")
    private Boolean isMnsMigratingCustomer;

    @com.aliyun.core.annotation.NameInMap("IsNeedAuth")
    private Boolean isNeedAuth;

    @com.aliyun.core.annotation.NameInMap("IsOldFisCust")
    private Boolean isOldFisCust;

    @com.aliyun.core.annotation.NameInMap("IsOldSms")
    private Boolean isOldSms;

    @com.aliyun.core.annotation.NameInMap("IsOpened")
    private Boolean isOpened;

    @com.aliyun.core.annotation.NameInMap("IsRemainMnsPackage")
    private Boolean isRemainMnsPackage;

    @com.aliyun.core.annotation.NameInMap("IsSendSmsToGlobeUser")
    private Boolean isSendSmsToGlobeUser;

    @com.aliyun.core.annotation.NameInMap("IsShortUrlNormalUse")
    private Boolean isShortUrlNormalUse;

    @com.aliyun.core.annotation.NameInMap("IsShortUrlOpened")
    private Boolean isShortUrlOpened;

    @com.aliyun.core.annotation.NameInMap("IsSilentCust")
    private Boolean isSilentCust;

    @com.aliyun.core.annotation.NameInMap("OsStatus")
    private Integer osStatus;

    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShortUrlServeTag")
    private Boolean shortUrlServeTag;

    @com.aliyun.core.annotation.NameInMap("SmsMarketingAssistantTag")
    private Boolean smsMarketingAssistantTag;

    @com.aliyun.core.annotation.NameInMap("TextAbilityMark")
    private String textAbilityMark;

    @com.aliyun.core.annotation.NameInMap("VoucherNum")
    private Integer voucherNum;

    private QuerySmsBaseScreenNewResponseBody(Builder builder) {
        this.accountBalance = builder.accountBalance;
        this.cardAbilityMark = builder.cardAbilityMark;
        this.cardCustomerMark = builder.cardCustomerMark;
        this.certifyType = builder.certifyType;
        this.channelType = builder.channelType;
        this.childAccountAuth = builder.childAccountAuth;
        this.creditValue = builder.creditValue;
        this.currentLocale = builder.currentLocale;
        this.custFrom = builder.custFrom;
        this.custName = builder.custName;
        this.dataAbilityMark = builder.dataAbilityMark;
        this.dayuMigrateStatus = builder.dayuMigrateStatus;
        this.invoiceBalance = builder.invoiceBalance;
        this.ipSmsAbilityMark = builder.ipSmsAbilityMark;
        this.isAccountMerged = builder.isAccountMerged;
        this.isAliInnerUser = builder.isAliInnerUser;
        this.isChineseUser = builder.isChineseUser;
        this.isDayuCustomer = builder.isDayuCustomer;
        this.isDayuTopCust = builder.isDayuTopCust;
        this.isMnsForceMigratingCustomer = builder.isMnsForceMigratingCustomer;
        this.isMnsMigratingCustomer = builder.isMnsMigratingCustomer;
        this.isNeedAuth = builder.isNeedAuth;
        this.isOldFisCust = builder.isOldFisCust;
        this.isOldSms = builder.isOldSms;
        this.isOpened = builder.isOpened;
        this.isRemainMnsPackage = builder.isRemainMnsPackage;
        this.isSendSmsToGlobeUser = builder.isSendSmsToGlobeUser;
        this.isShortUrlNormalUse = builder.isShortUrlNormalUse;
        this.isShortUrlOpened = builder.isShortUrlOpened;
        this.isSilentCust = builder.isSilentCust;
        this.osStatus = builder.osStatus;
        this.prodCode = builder.prodCode;
        this.requestId = builder.requestId;
        this.shortUrlServeTag = builder.shortUrlServeTag;
        this.smsMarketingAssistantTag = builder.smsMarketingAssistantTag;
        this.textAbilityMark = builder.textAbilityMark;
        this.voucherNum = builder.voucherNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsBaseScreenNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountBalance
     */
    public String getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * @return cardAbilityMark
     */
    public String getCardAbilityMark() {
        return this.cardAbilityMark;
    }

    /**
     * @return cardCustomerMark
     */
    public String getCardCustomerMark() {
        return this.cardCustomerMark;
    }

    /**
     * @return certifyType
     */
    public String getCertifyType() {
        return this.certifyType;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return childAccountAuth
     */
    public String getChildAccountAuth() {
        return this.childAccountAuth;
    }

    /**
     * @return creditValue
     */
    public String getCreditValue() {
        return this.creditValue;
    }

    /**
     * @return currentLocale
     */
    public String getCurrentLocale() {
        return this.currentLocale;
    }

    /**
     * @return custFrom
     */
    public Integer getCustFrom() {
        return this.custFrom;
    }

    /**
     * @return custName
     */
    public String getCustName() {
        return this.custName;
    }

    /**
     * @return dataAbilityMark
     */
    public String getDataAbilityMark() {
        return this.dataAbilityMark;
    }

    /**
     * @return dayuMigrateStatus
     */
    public Integer getDayuMigrateStatus() {
        return this.dayuMigrateStatus;
    }

    /**
     * @return invoiceBalance
     */
    public String getInvoiceBalance() {
        return this.invoiceBalance;
    }

    /**
     * @return ipSmsAbilityMark
     */
    public String getIpSmsAbilityMark() {
        return this.ipSmsAbilityMark;
    }

    /**
     * @return isAccountMerged
     */
    public Boolean getIsAccountMerged() {
        return this.isAccountMerged;
    }

    /**
     * @return isAliInnerUser
     */
    public Boolean getIsAliInnerUser() {
        return this.isAliInnerUser;
    }

    /**
     * @return isChineseUser
     */
    public Boolean getIsChineseUser() {
        return this.isChineseUser;
    }

    /**
     * @return isDayuCustomer
     */
    public Boolean getIsDayuCustomer() {
        return this.isDayuCustomer;
    }

    /**
     * @return isDayuTopCust
     */
    public Boolean getIsDayuTopCust() {
        return this.isDayuTopCust;
    }

    /**
     * @return isMnsForceMigratingCustomer
     */
    public Boolean getIsMnsForceMigratingCustomer() {
        return this.isMnsForceMigratingCustomer;
    }

    /**
     * @return isMnsMigratingCustomer
     */
    public Boolean getIsMnsMigratingCustomer() {
        return this.isMnsMigratingCustomer;
    }

    /**
     * @return isNeedAuth
     */
    public Boolean getIsNeedAuth() {
        return this.isNeedAuth;
    }

    /**
     * @return isOldFisCust
     */
    public Boolean getIsOldFisCust() {
        return this.isOldFisCust;
    }

    /**
     * @return isOldSms
     */
    public Boolean getIsOldSms() {
        return this.isOldSms;
    }

    /**
     * @return isOpened
     */
    public Boolean getIsOpened() {
        return this.isOpened;
    }

    /**
     * @return isRemainMnsPackage
     */
    public Boolean getIsRemainMnsPackage() {
        return this.isRemainMnsPackage;
    }

    /**
     * @return isSendSmsToGlobeUser
     */
    public Boolean getIsSendSmsToGlobeUser() {
        return this.isSendSmsToGlobeUser;
    }

    /**
     * @return isShortUrlNormalUse
     */
    public Boolean getIsShortUrlNormalUse() {
        return this.isShortUrlNormalUse;
    }

    /**
     * @return isShortUrlOpened
     */
    public Boolean getIsShortUrlOpened() {
        return this.isShortUrlOpened;
    }

    /**
     * @return isSilentCust
     */
    public Boolean getIsSilentCust() {
        return this.isSilentCust;
    }

    /**
     * @return osStatus
     */
    public Integer getOsStatus() {
        return this.osStatus;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shortUrlServeTag
     */
    public Boolean getShortUrlServeTag() {
        return this.shortUrlServeTag;
    }

    /**
     * @return smsMarketingAssistantTag
     */
    public Boolean getSmsMarketingAssistantTag() {
        return this.smsMarketingAssistantTag;
    }

    /**
     * @return textAbilityMark
     */
    public String getTextAbilityMark() {
        return this.textAbilityMark;
    }

    /**
     * @return voucherNum
     */
    public Integer getVoucherNum() {
        return this.voucherNum;
    }

    public static final class Builder {
        private String accountBalance; 
        private String cardAbilityMark; 
        private String cardCustomerMark; 
        private String certifyType; 
        private String channelType; 
        private String childAccountAuth; 
        private String creditValue; 
        private String currentLocale; 
        private Integer custFrom; 
        private String custName; 
        private String dataAbilityMark; 
        private Integer dayuMigrateStatus; 
        private String invoiceBalance; 
        private String ipSmsAbilityMark; 
        private Boolean isAccountMerged; 
        private Boolean isAliInnerUser; 
        private Boolean isChineseUser; 
        private Boolean isDayuCustomer; 
        private Boolean isDayuTopCust; 
        private Boolean isMnsForceMigratingCustomer; 
        private Boolean isMnsMigratingCustomer; 
        private Boolean isNeedAuth; 
        private Boolean isOldFisCust; 
        private Boolean isOldSms; 
        private Boolean isOpened; 
        private Boolean isRemainMnsPackage; 
        private Boolean isSendSmsToGlobeUser; 
        private Boolean isShortUrlNormalUse; 
        private Boolean isShortUrlOpened; 
        private Boolean isSilentCust; 
        private Integer osStatus; 
        private String prodCode; 
        private String requestId; 
        private Boolean shortUrlServeTag; 
        private Boolean smsMarketingAssistantTag; 
        private String textAbilityMark; 
        private Integer voucherNum; 

        private Builder() {
        } 

        private Builder(QuerySmsBaseScreenNewResponseBody model) {
            this.accountBalance = model.accountBalance;
            this.cardAbilityMark = model.cardAbilityMark;
            this.cardCustomerMark = model.cardCustomerMark;
            this.certifyType = model.certifyType;
            this.channelType = model.channelType;
            this.childAccountAuth = model.childAccountAuth;
            this.creditValue = model.creditValue;
            this.currentLocale = model.currentLocale;
            this.custFrom = model.custFrom;
            this.custName = model.custName;
            this.dataAbilityMark = model.dataAbilityMark;
            this.dayuMigrateStatus = model.dayuMigrateStatus;
            this.invoiceBalance = model.invoiceBalance;
            this.ipSmsAbilityMark = model.ipSmsAbilityMark;
            this.isAccountMerged = model.isAccountMerged;
            this.isAliInnerUser = model.isAliInnerUser;
            this.isChineseUser = model.isChineseUser;
            this.isDayuCustomer = model.isDayuCustomer;
            this.isDayuTopCust = model.isDayuTopCust;
            this.isMnsForceMigratingCustomer = model.isMnsForceMigratingCustomer;
            this.isMnsMigratingCustomer = model.isMnsMigratingCustomer;
            this.isNeedAuth = model.isNeedAuth;
            this.isOldFisCust = model.isOldFisCust;
            this.isOldSms = model.isOldSms;
            this.isOpened = model.isOpened;
            this.isRemainMnsPackage = model.isRemainMnsPackage;
            this.isSendSmsToGlobeUser = model.isSendSmsToGlobeUser;
            this.isShortUrlNormalUse = model.isShortUrlNormalUse;
            this.isShortUrlOpened = model.isShortUrlOpened;
            this.isSilentCust = model.isSilentCust;
            this.osStatus = model.osStatus;
            this.prodCode = model.prodCode;
            this.requestId = model.requestId;
            this.shortUrlServeTag = model.shortUrlServeTag;
            this.smsMarketingAssistantTag = model.smsMarketingAssistantTag;
            this.textAbilityMark = model.textAbilityMark;
            this.voucherNum = model.voucherNum;
        } 

        /**
         * AccountBalance.
         */
        public Builder accountBalance(String accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }

        /**
         * CardAbilityMark.
         */
        public Builder cardAbilityMark(String cardAbilityMark) {
            this.cardAbilityMark = cardAbilityMark;
            return this;
        }

        /**
         * CardCustomerMark.
         */
        public Builder cardCustomerMark(String cardCustomerMark) {
            this.cardCustomerMark = cardCustomerMark;
            return this;
        }

        /**
         * CertifyType.
         */
        public Builder certifyType(String certifyType) {
            this.certifyType = certifyType;
            return this;
        }

        /**
         * ChannelType.
         */
        public Builder channelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        /**
         * ChildAccountAuth.
         */
        public Builder childAccountAuth(String childAccountAuth) {
            this.childAccountAuth = childAccountAuth;
            return this;
        }

        /**
         * CreditValue.
         */
        public Builder creditValue(String creditValue) {
            this.creditValue = creditValue;
            return this;
        }

        /**
         * CurrentLocale.
         */
        public Builder currentLocale(String currentLocale) {
            this.currentLocale = currentLocale;
            return this;
        }

        /**
         * CustFrom.
         */
        public Builder custFrom(Integer custFrom) {
            this.custFrom = custFrom;
            return this;
        }

        /**
         * CustName.
         */
        public Builder custName(String custName) {
            this.custName = custName;
            return this;
        }

        /**
         * DataAbilityMark.
         */
        public Builder dataAbilityMark(String dataAbilityMark) {
            this.dataAbilityMark = dataAbilityMark;
            return this;
        }

        /**
         * DayuMigrateStatus.
         */
        public Builder dayuMigrateStatus(Integer dayuMigrateStatus) {
            this.dayuMigrateStatus = dayuMigrateStatus;
            return this;
        }

        /**
         * InvoiceBalance.
         */
        public Builder invoiceBalance(String invoiceBalance) {
            this.invoiceBalance = invoiceBalance;
            return this;
        }

        /**
         * IpSmsAbilityMark.
         */
        public Builder ipSmsAbilityMark(String ipSmsAbilityMark) {
            this.ipSmsAbilityMark = ipSmsAbilityMark;
            return this;
        }

        /**
         * IsAccountMerged.
         */
        public Builder isAccountMerged(Boolean isAccountMerged) {
            this.isAccountMerged = isAccountMerged;
            return this;
        }

        /**
         * IsAliInnerUser.
         */
        public Builder isAliInnerUser(Boolean isAliInnerUser) {
            this.isAliInnerUser = isAliInnerUser;
            return this;
        }

        /**
         * IsChineseUser.
         */
        public Builder isChineseUser(Boolean isChineseUser) {
            this.isChineseUser = isChineseUser;
            return this;
        }

        /**
         * IsDayuCustomer.
         */
        public Builder isDayuCustomer(Boolean isDayuCustomer) {
            this.isDayuCustomer = isDayuCustomer;
            return this;
        }

        /**
         * IsDayuTopCust.
         */
        public Builder isDayuTopCust(Boolean isDayuTopCust) {
            this.isDayuTopCust = isDayuTopCust;
            return this;
        }

        /**
         * IsMnsForceMigratingCustomer.
         */
        public Builder isMnsForceMigratingCustomer(Boolean isMnsForceMigratingCustomer) {
            this.isMnsForceMigratingCustomer = isMnsForceMigratingCustomer;
            return this;
        }

        /**
         * IsMnsMigratingCustomer.
         */
        public Builder isMnsMigratingCustomer(Boolean isMnsMigratingCustomer) {
            this.isMnsMigratingCustomer = isMnsMigratingCustomer;
            return this;
        }

        /**
         * IsNeedAuth.
         */
        public Builder isNeedAuth(Boolean isNeedAuth) {
            this.isNeedAuth = isNeedAuth;
            return this;
        }

        /**
         * IsOldFisCust.
         */
        public Builder isOldFisCust(Boolean isOldFisCust) {
            this.isOldFisCust = isOldFisCust;
            return this;
        }

        /**
         * IsOldSms.
         */
        public Builder isOldSms(Boolean isOldSms) {
            this.isOldSms = isOldSms;
            return this;
        }

        /**
         * IsOpened.
         */
        public Builder isOpened(Boolean isOpened) {
            this.isOpened = isOpened;
            return this;
        }

        /**
         * IsRemainMnsPackage.
         */
        public Builder isRemainMnsPackage(Boolean isRemainMnsPackage) {
            this.isRemainMnsPackage = isRemainMnsPackage;
            return this;
        }

        /**
         * IsSendSmsToGlobeUser.
         */
        public Builder isSendSmsToGlobeUser(Boolean isSendSmsToGlobeUser) {
            this.isSendSmsToGlobeUser = isSendSmsToGlobeUser;
            return this;
        }

        /**
         * IsShortUrlNormalUse.
         */
        public Builder isShortUrlNormalUse(Boolean isShortUrlNormalUse) {
            this.isShortUrlNormalUse = isShortUrlNormalUse;
            return this;
        }

        /**
         * IsShortUrlOpened.
         */
        public Builder isShortUrlOpened(Boolean isShortUrlOpened) {
            this.isShortUrlOpened = isShortUrlOpened;
            return this;
        }

        /**
         * IsSilentCust.
         */
        public Builder isSilentCust(Boolean isSilentCust) {
            this.isSilentCust = isSilentCust;
            return this;
        }

        /**
         * OsStatus.
         */
        public Builder osStatus(Integer osStatus) {
            this.osStatus = osStatus;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShortUrlServeTag.
         */
        public Builder shortUrlServeTag(Boolean shortUrlServeTag) {
            this.shortUrlServeTag = shortUrlServeTag;
            return this;
        }

        /**
         * SmsMarketingAssistantTag.
         */
        public Builder smsMarketingAssistantTag(Boolean smsMarketingAssistantTag) {
            this.smsMarketingAssistantTag = smsMarketingAssistantTag;
            return this;
        }

        /**
         * TextAbilityMark.
         */
        public Builder textAbilityMark(String textAbilityMark) {
            this.textAbilityMark = textAbilityMark;
            return this;
        }

        /**
         * VoucherNum.
         */
        public Builder voucherNum(Integer voucherNum) {
            this.voucherNum = voucherNum;
            return this;
        }

        public QuerySmsBaseScreenNewResponseBody build() {
            return new QuerySmsBaseScreenNewResponseBody(this);
        } 

    } 

}
