// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainByDomainNameResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainByDomainNameResponseBody</p>
 */
public class QueryDomainByDomainNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DnsList")
    private DnsList dnsList;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomainNameProxyService")
    private Boolean domainNameProxyService;

    @com.aliyun.core.annotation.NameInMap("DomainNameVerificationStatus")
    private String domainNameVerificationStatus;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("EmailVerificationClientHold")
    private Boolean emailVerificationClientHold;

    @com.aliyun.core.annotation.NameInMap("EmailVerificationStatus")
    private Integer emailVerificationStatus;

    @com.aliyun.core.annotation.NameInMap("ExpirationDate")
    private String expirationDate;

    @com.aliyun.core.annotation.NameInMap("ExpirationDateLong")
    private Long expirationDateLong;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Premium")
    private Boolean premium;

    @com.aliyun.core.annotation.NameInMap("RealNameStatus")
    private String realNameStatus;

    @com.aliyun.core.annotation.NameInMap("RegistrantName")
    private String registrantName;

    @com.aliyun.core.annotation.NameInMap("RegistrantOrganization")
    private String registrantOrganization;

    @com.aliyun.core.annotation.NameInMap("RegistrantType")
    private String registrantType;

    @com.aliyun.core.annotation.NameInMap("RegistrantUpdatingStatus")
    private String registrantUpdatingStatus;

    @com.aliyun.core.annotation.NameInMap("RegistrationDate")
    private String registrationDate;

    @com.aliyun.core.annotation.NameInMap("RegistrationDateLong")
    private Long registrationDateLong;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransferOutStatus")
    private String transferOutStatus;

    @com.aliyun.core.annotation.NameInMap("TransferProhibitionLock")
    private String transferProhibitionLock;

    @com.aliyun.core.annotation.NameInMap("UpdateProhibitionLock")
    private String updateProhibitionLock;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private QueryDomainByDomainNameResponseBody(Builder builder) {
        this.dnsList = builder.dnsList;
        this.domainName = builder.domainName;
        this.domainNameProxyService = builder.domainNameProxyService;
        this.domainNameVerificationStatus = builder.domainNameVerificationStatus;
        this.email = builder.email;
        this.emailVerificationClientHold = builder.emailVerificationClientHold;
        this.emailVerificationStatus = builder.emailVerificationStatus;
        this.expirationDate = builder.expirationDate;
        this.expirationDateLong = builder.expirationDateLong;
        this.instanceId = builder.instanceId;
        this.premium = builder.premium;
        this.realNameStatus = builder.realNameStatus;
        this.registrantName = builder.registrantName;
        this.registrantOrganization = builder.registrantOrganization;
        this.registrantType = builder.registrantType;
        this.registrantUpdatingStatus = builder.registrantUpdatingStatus;
        this.registrationDate = builder.registrationDate;
        this.registrationDateLong = builder.registrationDateLong;
        this.requestId = builder.requestId;
        this.transferOutStatus = builder.transferOutStatus;
        this.transferProhibitionLock = builder.transferProhibitionLock;
        this.updateProhibitionLock = builder.updateProhibitionLock;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainByDomainNameResponseBody create() {
        return builder().build();
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
     * @return domainNameProxyService
     */
    public Boolean getDomainNameProxyService() {
        return this.domainNameProxyService;
    }

    /**
     * @return domainNameVerificationStatus
     */
    public String getDomainNameVerificationStatus() {
        return this.domainNameVerificationStatus;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
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
     * @return expirationDate
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * @return expirationDateLong
     */
    public Long getExpirationDateLong() {
        return this.expirationDateLong;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return premium
     */
    public Boolean getPremium() {
        return this.premium;
    }

    /**
     * @return realNameStatus
     */
    public String getRealNameStatus() {
        return this.realNameStatus;
    }

    /**
     * @return registrantName
     */
    public String getRegistrantName() {
        return this.registrantName;
    }

    /**
     * @return registrantOrganization
     */
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    /**
     * @return registrantType
     */
    public String getRegistrantType() {
        return this.registrantType;
    }

    /**
     * @return registrantUpdatingStatus
     */
    public String getRegistrantUpdatingStatus() {
        return this.registrantUpdatingStatus;
    }

    /**
     * @return registrationDate
     */
    public String getRegistrationDate() {
        return this.registrationDate;
    }

    /**
     * @return registrationDateLong
     */
    public Long getRegistrationDateLong() {
        return this.registrationDateLong;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transferOutStatus
     */
    public String getTransferOutStatus() {
        return this.transferOutStatus;
    }

    /**
     * @return transferProhibitionLock
     */
    public String getTransferProhibitionLock() {
        return this.transferProhibitionLock;
    }

    /**
     * @return updateProhibitionLock
     */
    public String getUpdateProhibitionLock() {
        return this.updateProhibitionLock;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private DnsList dnsList; 
        private String domainName; 
        private Boolean domainNameProxyService; 
        private String domainNameVerificationStatus; 
        private String email; 
        private Boolean emailVerificationClientHold; 
        private Integer emailVerificationStatus; 
        private String expirationDate; 
        private Long expirationDateLong; 
        private String instanceId; 
        private Boolean premium; 
        private String realNameStatus; 
        private String registrantName; 
        private String registrantOrganization; 
        private String registrantType; 
        private String registrantUpdatingStatus; 
        private String registrationDate; 
        private Long registrationDateLong; 
        private String requestId; 
        private String transferOutStatus; 
        private String transferProhibitionLock; 
        private String updateProhibitionLock; 
        private String userId; 

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
         * DomainNameProxyService.
         */
        public Builder domainNameProxyService(Boolean domainNameProxyService) {
            this.domainNameProxyService = domainNameProxyService;
            return this;
        }

        /**
         * DomainNameVerificationStatus.
         */
        public Builder domainNameVerificationStatus(String domainNameVerificationStatus) {
            this.domainNameVerificationStatus = domainNameVerificationStatus;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
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
         * ExpirationDate.
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * ExpirationDateLong.
         */
        public Builder expirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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
         * RealNameStatus.
         */
        public Builder realNameStatus(String realNameStatus) {
            this.realNameStatus = realNameStatus;
            return this;
        }

        /**
         * RegistrantName.
         */
        public Builder registrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }

        /**
         * RegistrantOrganization.
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }

        /**
         * RegistrantType.
         */
        public Builder registrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }

        /**
         * RegistrantUpdatingStatus.
         */
        public Builder registrantUpdatingStatus(String registrantUpdatingStatus) {
            this.registrantUpdatingStatus = registrantUpdatingStatus;
            return this;
        }

        /**
         * RegistrationDate.
         */
        public Builder registrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        /**
         * RegistrationDateLong.
         */
        public Builder registrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
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
         * TransferOutStatus.
         */
        public Builder transferOutStatus(String transferOutStatus) {
            this.transferOutStatus = transferOutStatus;
            return this;
        }

        /**
         * TransferProhibitionLock.
         */
        public Builder transferProhibitionLock(String transferProhibitionLock) {
            this.transferProhibitionLock = transferProhibitionLock;
            return this;
        }

        /**
         * UpdateProhibitionLock.
         */
        public Builder updateProhibitionLock(String updateProhibitionLock) {
            this.updateProhibitionLock = updateProhibitionLock;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public QueryDomainByDomainNameResponseBody build() {
            return new QueryDomainByDomainNameResponseBody(this);
        } 

    } 

    public static class DnsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dns")
        private java.util.List < String > dns;

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
        public java.util.List < String > getDns() {
            return this.dns;
        }

        public static final class Builder {
            private java.util.List < String > dns; 

            /**
             * Dns.
             */
            public Builder dns(java.util.List < String > dns) {
                this.dns = dns;
                return this;
            }

            public DnsList build() {
                return new DnsList(this);
            } 

        } 

    }
}
