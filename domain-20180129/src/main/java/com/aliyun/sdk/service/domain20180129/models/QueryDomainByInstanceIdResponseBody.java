// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainByInstanceIdResponseBody</p>
 */
public class QueryDomainByInstanceIdResponseBody extends TeaModel {
    @NameInMap("DnsList")
    private DnsList dnsList;

    @NameInMap("DomainGroupId")
    private Long domainGroupId;

    @NameInMap("DomainGroupName")
    private String domainGroupName;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("DomainNameProxyService")
    private Boolean domainNameProxyService;

    @NameInMap("DomainNameVerificationStatus")
    private String domainNameVerificationStatus;

    @NameInMap("DomainStatus")
    private String domainStatus;

    @NameInMap("DomainType")
    private String domainType;

    @NameInMap("Email")
    private String email;

    @NameInMap("EmailVerificationClientHold")
    private Boolean emailVerificationClientHold;

    @NameInMap("EmailVerificationStatus")
    private Integer emailVerificationStatus;

    @NameInMap("ExpirationCurrDateDiff")
    private Integer expirationCurrDateDiff;

    @NameInMap("ExpirationDate")
    private String expirationDate;

    @NameInMap("ExpirationDateLong")
    private Long expirationDateLong;

    @NameInMap("ExpirationDateStatus")
    private String expirationDateStatus;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Premium")
    private Boolean premium;

    @NameInMap("RealNameStatus")
    private String realNameStatus;

    @NameInMap("RegistrantName")
    private String registrantName;

    @NameInMap("RegistrantOrganization")
    private String registrantOrganization;

    @NameInMap("RegistrantType")
    private String registrantType;

    @NameInMap("RegistrantUpdatingStatus")
    private String registrantUpdatingStatus;

    @NameInMap("RegistrationDate")
    private String registrationDate;

    @NameInMap("RegistrationDateLong")
    private Long registrationDateLong;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Tag")
    private Tag tag;

    @NameInMap("TransferOutStatus")
    private String transferOutStatus;

    @NameInMap("TransferProhibitionLock")
    private String transferProhibitionLock;

    @NameInMap("UpdateProhibitionLock")
    private String updateProhibitionLock;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("ZhRegistrantName")
    private String zhRegistrantName;

    @NameInMap("ZhRegistrantOrganization")
    private String zhRegistrantOrganization;

    private QueryDomainByInstanceIdResponseBody(Builder builder) {
        this.dnsList = builder.dnsList;
        this.domainGroupId = builder.domainGroupId;
        this.domainGroupName = builder.domainGroupName;
        this.domainName = builder.domainName;
        this.domainNameProxyService = builder.domainNameProxyService;
        this.domainNameVerificationStatus = builder.domainNameVerificationStatus;
        this.domainStatus = builder.domainStatus;
        this.domainType = builder.domainType;
        this.email = builder.email;
        this.emailVerificationClientHold = builder.emailVerificationClientHold;
        this.emailVerificationStatus = builder.emailVerificationStatus;
        this.expirationCurrDateDiff = builder.expirationCurrDateDiff;
        this.expirationDate = builder.expirationDate;
        this.expirationDateLong = builder.expirationDateLong;
        this.expirationDateStatus = builder.expirationDateStatus;
        this.instanceId = builder.instanceId;
        this.premium = builder.premium;
        this.realNameStatus = builder.realNameStatus;
        this.registrantName = builder.registrantName;
        this.registrantOrganization = builder.registrantOrganization;
        this.registrantType = builder.registrantType;
        this.registrantUpdatingStatus = builder.registrantUpdatingStatus;
        this.registrationDate = builder.registrationDate;
        this.registrationDateLong = builder.registrationDateLong;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.transferOutStatus = builder.transferOutStatus;
        this.transferProhibitionLock = builder.transferProhibitionLock;
        this.updateProhibitionLock = builder.updateProhibitionLock;
        this.userId = builder.userId;
        this.zhRegistrantName = builder.zhRegistrantName;
        this.zhRegistrantOrganization = builder.zhRegistrantOrganization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainByInstanceIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return dnsList
     */
    public DnsList getDnsList() {
        return this.dnsList;
    }

    /**
     * @return domainGroupId
     */
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    /**
     * @return domainGroupName
     */
    public String getDomainGroupName() {
        return this.domainGroupName;
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
     * @return domainStatus
     */
    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
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
     * @return expirationCurrDateDiff
     */
    public Integer getExpirationCurrDateDiff() {
        return this.expirationCurrDateDiff;
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
     * @return expirationDateStatus
     */
    public String getExpirationDateStatus() {
        return this.expirationDateStatus;
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public Tag getTag() {
        return this.tag;
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

    /**
     * @return zhRegistrantName
     */
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    /**
     * @return zhRegistrantOrganization
     */
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

    public static final class Builder {
        private DnsList dnsList; 
        private Long domainGroupId; 
        private String domainGroupName; 
        private String domainName; 
        private Boolean domainNameProxyService; 
        private String domainNameVerificationStatus; 
        private String domainStatus; 
        private String domainType; 
        private String email; 
        private Boolean emailVerificationClientHold; 
        private Integer emailVerificationStatus; 
        private Integer expirationCurrDateDiff; 
        private String expirationDate; 
        private Long expirationDateLong; 
        private String expirationDateStatus; 
        private String instanceId; 
        private Boolean premium; 
        private String realNameStatus; 
        private String registrantName; 
        private String registrantOrganization; 
        private String registrantType; 
        private String registrantUpdatingStatus; 
        private String registrationDate; 
        private Long registrationDateLong; 
        private String remark; 
        private String requestId; 
        private String resourceGroupId; 
        private Tag tag; 
        private String transferOutStatus; 
        private String transferProhibitionLock; 
        private String updateProhibitionLock; 
        private String userId; 
        private String zhRegistrantName; 
        private String zhRegistrantOrganization; 

        /**
         * DnsList.
         */
        public Builder dnsList(DnsList dnsList) {
            this.dnsList = dnsList;
            return this;
        }

        /**
         * DomainGroupId.
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * DomainGroupName.
         */
        public Builder domainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
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
         * DomainStatus.
         */
        public Builder domainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
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
         * ExpirationCurrDateDiff.
         */
        public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
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
         * ExpirationDateStatus.
         */
        public Builder expirationDateStatus(String expirationDateStatus) {
            this.expirationDateStatus = expirationDateStatus;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(Tag tag) {
            this.tag = tag;
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

        /**
         * ZhRegistrantName.
         */
        public Builder zhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }

        /**
         * ZhRegistrantOrganization.
         */
        public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }

        public QueryDomainByInstanceIdResponseBody build() {
            return new QueryDomainByInstanceIdResponseBody(this);
        } 

    } 

    public static class DnsList extends TeaModel {
        @NameInMap("Dns")
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
    public static class TagTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TagTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagTag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagTag build() {
                return new TagTag(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < TagTag> tag;

        private Tag(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < TagTag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < TagTag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < TagTag> tag) {
                this.tag = tag;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
