// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDomainByDomainNameResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainByDomainNameResponseBody</p>
 */
public class QueryDomainByDomainNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DnsList")
    private DnsList dnsList;

    @com.aliyun.core.annotation.NameInMap("DomainGroupId")
    private Long domainGroupId;

    @com.aliyun.core.annotation.NameInMap("DomainGroupName")
    private String domainGroupName;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomainNameProxyService")
    private Boolean domainNameProxyService;

    @com.aliyun.core.annotation.NameInMap("DomainNameVerificationStatus")
    private String domainNameVerificationStatus;

    @com.aliyun.core.annotation.NameInMap("DomainStatus")
    private String domainStatus;

    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("EmailVerificationClientHold")
    private Boolean emailVerificationClientHold;

    @com.aliyun.core.annotation.NameInMap("EmailVerificationStatus")
    private Integer emailVerificationStatus;

    @com.aliyun.core.annotation.NameInMap("ExpirationCurrDateDiff")
    private Integer expirationCurrDateDiff;

    @com.aliyun.core.annotation.NameInMap("ExpirationDate")
    private String expirationDate;

    @com.aliyun.core.annotation.NameInMap("ExpirationDateLong")
    private Long expirationDateLong;

    @com.aliyun.core.annotation.NameInMap("ExpirationDateStatus")
    private String expirationDateStatus;

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

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private Tag tag;

    @com.aliyun.core.annotation.NameInMap("TransferOutStatus")
    private String transferOutStatus;

    @com.aliyun.core.annotation.NameInMap("TransferProhibitionLock")
    private String transferProhibitionLock;

    @com.aliyun.core.annotation.NameInMap("UpdateProhibitionLock")
    private String updateProhibitionLock;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("ZhRegistrantName")
    private String zhRegistrantName;

    @com.aliyun.core.annotation.NameInMap("ZhRegistrantOrganization")
    private String zhRegistrantOrganization;

    private QueryDomainByDomainNameResponseBody(Builder builder) {
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
         * <p>The Domain Name System (DNS) servers of the domain name.</p>
         */
        public Builder dnsList(DnsList dnsList) {
            this.dnsList = dnsList;
            return this;
        }

        /**
         * <p>The ID of the domain name group. You can call the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> operation to query the ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * <p>The name of the domain name group.</p>
         */
        public Builder domainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Indicates whether privacy protection is enabled for the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder domainNameProxyService(Boolean domainNameProxyService) {
            this.domainNameProxyService = domainNameProxyService;
            return this;
        }

        /**
         * <p>The status of name auditing for the domain name. Valid values:</p>
         * <ul>
         * <li><strong>NONAUDIT</strong>: The name auditing for the domain name is not performed.</li>
         * <li><strong>SUCCEED</strong>: The name auditing for the domain name is successful.</li>
         * <li><strong>FAILED</strong>: The name auditing for the domain name fails.</li>
         * <li><strong>AUDITING</strong>: The name auditing for the domain name is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        public Builder domainNameVerificationStatus(String domainNameVerificationStatus) {
            this.domainNameVerificationStatus = domainNameVerificationStatus;
            return this;
        }

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li>1: The domain name needs to be renewed.</li>
         * <li>2: The domain name needs to be redeemed.</li>
         * <li>3: The domain name is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder domainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li>New gTLD</li>
         * <li>gTLD</li>
         * <li>ccTLD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gTLD</p>
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>The email address of the domain name registrant.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>Indicates whether the domain name is in the ClientHold state.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder emailVerificationClientHold(Boolean emailVerificationClientHold) {
            this.emailVerificationClientHold = emailVerificationClientHold;
            return this;
        }

        /**
         * <p>Indicates whether the email address passes verification. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The email address fails the verification.</li>
         * <li><strong>1</strong>: The email address passes the verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder emailVerificationStatus(Integer emailVerificationStatus) {
            this.emailVerificationStatus = emailVerificationStatus;
            return this;
        }

        /**
         * <p>The number of days from the expiration date of the domain name to the current date.</p>
         * 
         * <strong>example:</strong>
         * <p>356</p>
         */
        public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
            return this;
        }

        /**
         * <p>The expiration date.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-07 17:02:13</p>
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * <p>The timestamp generated when the domain name expired.</p>
         * 
         * <strong>example:</strong>
         * <p>1625111915000</p>
         */
        public Builder expirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }

        /**
         * <p>Indicates whether the domain name expires. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The domain name does not expire.</li>
         * <li><strong>2</strong>: The domain name expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expirationDateStatus(String expirationDateStatus) {
            this.expirationDateStatus = expirationDateStatus;
            return this;
        }

        /**
         * <p>The instance ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>S20179H1BBI9****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether the domain name is a premium domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder premium(Boolean premium) {
            this.premium = premium;
            return this;
        }

        /**
         * <p>The status of real-name verification for the domain name. Valid values:</p>
         * <ul>
         * <li><strong>NONAUDIT</strong>: The real-name verification is not performed.</li>
         * <li><strong>SUCCEED</strong>: The real-name verification is successful.</li>
         * <li><strong>FAILED</strong>: The real-name verification fails.</li>
         * <li><strong>AUDITING</strong>: The real-name verification is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONAUDIT</p>
         */
        public Builder realNameStatus(String realNameStatus) {
            this.realNameStatus = realNameStatus;
            return this;
        }

        /**
         * <p>The name of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Test litm</p>
         */
        public Builder registrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }

        /**
         * <p>The registrant of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test litm</p>
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }

        /**
         * <p>The type of contact who registers the domain name. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: individual.</li>
         * <li><strong>2</strong>: enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder registrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }

        /**
         * <p>The status of the information about the domain name registrant. Valid values:</p>
         * <ul>
         * <li><strong>PENDING</strong>: The information about the domain name registrant is being modified.</li>
         * <li><strong>NORMAL</strong>: normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder registrantUpdatingStatus(String registrantUpdatingStatus) {
            this.registrantUpdatingStatus = registrantUpdatingStatus;
            return this;
        }

        /**
         * <p>The time when the domain name was registered.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-07 17:02:13</p>
         */
        public Builder registrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        /**
         * <p>The timestamp generated when the domain name was registered.</p>
         * 
         * <strong>example:</strong>
         * <p>1584675448000</p>
         */
        public Builder registrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
            return this;
        }

        /**
         * <p>The remarks on the domain name.</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>44101664-3E70-4F0E-89E5-CCB74BF*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw6bpc6n7zai</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(Tag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>The transfer status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The domain name is normal.</li>
         * <li><strong>PENDING</strong>: The domain name is being transferred out from Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder transferOutStatus(String transferOutStatus) {
            this.transferOutStatus = transferOutStatus;
            return this;
        }

        /**
         * <p>The status of the transfer lock for the domain name. Valid values:</p>
         * <ul>
         * <li><strong>NONE_SETTING</strong>: No transfer lock is configured.</li>
         * <li><strong>OPEN</strong>: The transfer lock is enabled.</li>
         * <li><strong>CLOSE</strong>: The transfer lock is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOSE</p>
         */
        public Builder transferProhibitionLock(String transferProhibitionLock) {
            this.transferProhibitionLock = transferProhibitionLock;
            return this;
        }

        /**
         * <p>The status of the security lock for the domain name. Valid values:</p>
         * <ul>
         * <li><strong>NONE_SETTING</strong>: No security lock is configured.</li>
         * <li><strong>OPEN</strong>: The security lock is enabled.</li>
         * <li><strong>CLOSE</strong>: The security lock is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOSE</p>
         */
        public Builder updateProhibitionLock(String updateProhibitionLock) {
            this.updateProhibitionLock = updateProhibitionLock;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>121000000****</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The Chinese name of the domain name contact.</p>
         */
        public Builder zhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }

        /**
         * <p>The Chinese name of the domain name registrant.</p>
         */
        public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }

        public QueryDomainByDomainNameResponseBody build() {
            return new QueryDomainByDomainNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainByDomainNameResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainByDomainNameResponseBody</p>
     */
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
    /**
     * 
     * {@link QueryDomainByDomainNameResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainByDomainNameResponseBody</p>
     */
    public static class TagTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Vaue")
        private String vaue;

        private TagTag(Builder builder) {
            this.key = builder.key;
            this.vaue = builder.vaue;
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
         * @return vaue
         */
        public String getVaue() {
            return this.vaue;
        }

        public static final class Builder {
            private String key; 
            private String vaue; 

            /**
             * <p>The tag key.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             */
            public Builder vaue(String vaue) {
                this.vaue = vaue;
                return this;
            }

            public TagTag build() {
                return new TagTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDomainByDomainNameResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainByDomainNameResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
             * <p>The tags.</p>
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
