// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link QueryDomainBySaleIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainBySaleIdResponseBody</p>
 */
public class QueryDomainBySaleIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChineseContactPerson")
    private String chineseContactPerson;

    @com.aliyun.core.annotation.NameInMap("ChineseHolder")
    private String chineseHolder;

    @com.aliyun.core.annotation.NameInMap("CreationDate")
    private String creationDate;

    @com.aliyun.core.annotation.NameInMap("DnsList")
    private DnsList dnsList;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomainRegType")
    private String domainRegType;

    @com.aliyun.core.annotation.NameInMap("EmailVerificationClientHold")
    private Boolean emailVerificationClientHold;

    @com.aliyun.core.annotation.NameInMap("EmailVerificationStatus")
    private Integer emailVerificationStatus;

    @com.aliyun.core.annotation.NameInMap("EnglishContactPerson")
    private String englishContactPerson;

    @com.aliyun.core.annotation.NameInMap("EnglishHolder")
    private String englishHolder;

    @com.aliyun.core.annotation.NameInMap("ExpirationDate")
    private String expirationDate;

    @com.aliyun.core.annotation.NameInMap("HolderEmail")
    private String holderEmail;

    @com.aliyun.core.annotation.NameInMap("Premium")
    private Boolean premium;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("SafetyLock")
    private String safetyLock;

    @com.aliyun.core.annotation.NameInMap("SaleId")
    private String saleId;

    @com.aliyun.core.annotation.NameInMap("TransferLock")
    private String transferLock;

    @com.aliyun.core.annotation.NameInMap("TransferOutStatus")
    private String transferOutStatus;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WhoisProtected")
    private Boolean whoisProtected;

    private QueryDomainBySaleIdResponseBody(Builder builder) {
        this.chineseContactPerson = builder.chineseContactPerson;
        this.chineseHolder = builder.chineseHolder;
        this.creationDate = builder.creationDate;
        this.dnsList = builder.dnsList;
        this.domainName = builder.domainName;
        this.domainRegType = builder.domainRegType;
        this.emailVerificationClientHold = builder.emailVerificationClientHold;
        this.emailVerificationStatus = builder.emailVerificationStatus;
        this.englishContactPerson = builder.englishContactPerson;
        this.englishHolder = builder.englishHolder;
        this.expirationDate = builder.expirationDate;
        this.holderEmail = builder.holderEmail;
        this.premium = builder.premium;
        this.remark = builder.remark;
        this.safetyLock = builder.safetyLock;
        this.saleId = builder.saleId;
        this.transferLock = builder.transferLock;
        this.transferOutStatus = builder.transferOutStatus;
        this.userId = builder.userId;
        this.whoisProtected = builder.whoisProtected;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainBySaleIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chineseContactPerson
     */
    public String getChineseContactPerson() {
        return this.chineseContactPerson;
    }

    /**
     * @return chineseHolder
     */
    public String getChineseHolder() {
        return this.chineseHolder;
    }

    /**
     * @return creationDate
     */
    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * @return dnsList
     */
    public DnsList getDnsList() {
        return this.dnsList;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainRegType
     */
    public String getDomainRegType() {
        return this.domainRegType;
    }

    /**
     * @return emailVerificationClientHold
     */
    public Boolean getEmailVerificationClientHold() {
        return this.emailVerificationClientHold;
    }

    /**
     * @return emailVerificationStatus
     */
    public Integer getEmailVerificationStatus() {
        return this.emailVerificationStatus;
    }

    /**
     * @return englishContactPerson
     */
    public String getEnglishContactPerson() {
        return this.englishContactPerson;
    }

    /**
     * @return englishHolder
     */
    public String getEnglishHolder() {
        return this.englishHolder;
    }

    /**
     * @return expirationDate
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * @return holderEmail
     */
    public String getHolderEmail() {
        return this.holderEmail;
    }

    /**
     * @return premium
     */
    public Boolean getPremium() {
        return this.premium;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return safetyLock
     */
    public String getSafetyLock() {
        return this.safetyLock;
    }

    /**
     * @return saleId
     */
    public String getSaleId() {
        return this.saleId;
    }

    /**
     * @return transferLock
     */
    public String getTransferLock() {
        return this.transferLock;
    }

    /**
     * @return transferOutStatus
     */
    public String getTransferOutStatus() {
        return this.transferOutStatus;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return whoisProtected
     */
    public Boolean getWhoisProtected() {
        return this.whoisProtected;
    }

    public static final class Builder {
        private String chineseContactPerson; 
        private String chineseHolder; 
        private String creationDate; 
        private DnsList dnsList; 
        private String domainName; 
        private String domainRegType; 
        private Boolean emailVerificationClientHold; 
        private Integer emailVerificationStatus; 
        private String englishContactPerson; 
        private String englishHolder; 
        private String expirationDate; 
        private String holderEmail; 
        private Boolean premium; 
        private String remark; 
        private String safetyLock; 
        private String saleId; 
        private String transferLock; 
        private String transferOutStatus; 
        private String userId; 
        private Boolean whoisProtected; 

        private Builder() {
        } 

        private Builder(QueryDomainBySaleIdResponseBody model) {
            this.chineseContactPerson = model.chineseContactPerson;
            this.chineseHolder = model.chineseHolder;
            this.creationDate = model.creationDate;
            this.dnsList = model.dnsList;
            this.domainName = model.domainName;
            this.domainRegType = model.domainRegType;
            this.emailVerificationClientHold = model.emailVerificationClientHold;
            this.emailVerificationStatus = model.emailVerificationStatus;
            this.englishContactPerson = model.englishContactPerson;
            this.englishHolder = model.englishHolder;
            this.expirationDate = model.expirationDate;
            this.holderEmail = model.holderEmail;
            this.premium = model.premium;
            this.remark = model.remark;
            this.safetyLock = model.safetyLock;
            this.saleId = model.saleId;
            this.transferLock = model.transferLock;
            this.transferOutStatus = model.transferOutStatus;
            this.userId = model.userId;
            this.whoisProtected = model.whoisProtected;
        } 

        /**
         * ChineseContactPerson.
         */
        public Builder chineseContactPerson(String chineseContactPerson) {
            this.chineseContactPerson = chineseContactPerson;
            return this;
        }

        /**
         * ChineseHolder.
         */
        public Builder chineseHolder(String chineseHolder) {
            this.chineseHolder = chineseHolder;
            return this;
        }

        /**
         * CreationDate.
         */
        public Builder creationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        /**
         * DnsList.
         */
        public Builder dnsList(DnsList dnsList) {
            this.dnsList = dnsList;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainRegType.
         */
        public Builder domainRegType(String domainRegType) {
            this.domainRegType = domainRegType;
            return this;
        }

        /**
         * EmailVerificationClientHold.
         */
        public Builder emailVerificationClientHold(Boolean emailVerificationClientHold) {
            this.emailVerificationClientHold = emailVerificationClientHold;
            return this;
        }

        /**
         * EmailVerificationStatus.
         */
        public Builder emailVerificationStatus(Integer emailVerificationStatus) {
            this.emailVerificationStatus = emailVerificationStatus;
            return this;
        }

        /**
         * EnglishContactPerson.
         */
        public Builder englishContactPerson(String englishContactPerson) {
            this.englishContactPerson = englishContactPerson;
            return this;
        }

        /**
         * EnglishHolder.
         */
        public Builder englishHolder(String englishHolder) {
            this.englishHolder = englishHolder;
            return this;
        }

        /**
         * ExpirationDate.
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * HolderEmail.
         */
        public Builder holderEmail(String holderEmail) {
            this.holderEmail = holderEmail;
            return this;
        }

        /**
         * Premium.
         */
        public Builder premium(Boolean premium) {
            this.premium = premium;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * SafetyLock.
         */
        public Builder safetyLock(String safetyLock) {
            this.safetyLock = safetyLock;
            return this;
        }

        /**
         * SaleId.
         */
        public Builder saleId(String saleId) {
            this.saleId = saleId;
            return this;
        }

        /**
         * TransferLock.
         */
        public Builder transferLock(String transferLock) {
            this.transferLock = transferLock;
            return this;
        }

        /**
         * TransferOutStatus.
         */
        public Builder transferOutStatus(String transferOutStatus) {
            this.transferOutStatus = transferOutStatus;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WhoisProtected.
         */
        public Builder whoisProtected(Boolean whoisProtected) {
            this.whoisProtected = whoisProtected;
            return this;
        }

        public QueryDomainBySaleIdResponseBody build() {
            return new QueryDomainBySaleIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainBySaleIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainBySaleIdResponseBody</p>
     */
    public static class DnsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dns")
        private java.util.List<String> dns;

        private DnsList(Builder builder) {
            this.dns = builder.dns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsList create() {
            return builder().build();
        }

        /**
         * @return dns
         */
        public java.util.List<String> getDns() {
            return this.dns;
        }

        public static final class Builder {
            private java.util.List<String> dns; 

            private Builder() {
            } 

            private Builder(DnsList model) {
                this.dns = model.dns;
            } 

            /**
             * Dns.
             */
            public Builder dns(java.util.List<String> dns) {
                this.dns = dns;
                return this;
            }

            public DnsList build() {
                return new DnsList(this);
            } 

        } 

    }
}
