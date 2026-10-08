// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryDomainByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainByInstanceIdResponseBody</p>
 */
public class QueryDomainByInstanceIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CnnicPrivacyServiceStatus")
    private String cnnicPrivacyServiceStatus;

    @com.aliyun.core.annotation.NameInMap("DnsList")
    private DnsList dnsList;

    @com.aliyun.core.annotation.NameInMap("DomainGroupId")
    private Long domainGroupId;

    @com.aliyun.core.annotation.NameInMap("DomainGroupName")
    private String domainGroupName;

    @com.aliyun.core.annotation.NameInMap("DomainLifecycleStatus")
    private String domainLifecycleStatus;

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

    @com.aliyun.core.annotation.NameInMap("PrivacyServiceStatus")
    private String privacyServiceStatus;

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

    private QueryDomainByInstanceIdResponseBody(Builder builder) {
        this.cnnicPrivacyServiceStatus = builder.cnnicPrivacyServiceStatus;
        this.dnsList = builder.dnsList;
        this.domainGroupId = builder.domainGroupId;
        this.domainGroupName = builder.domainGroupName;
        this.domainLifecycleStatus = builder.domainLifecycleStatus;
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
        this.privacyServiceStatus = builder.privacyServiceStatus;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnnicPrivacyServiceStatus
     */
    public String getCnnicPrivacyServiceStatus() {
        return this.cnnicPrivacyServiceStatus;
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
     * @return domainLifecycleStatus
     */
    public String getDomainLifecycleStatus() {
        return this.domainLifecycleStatus;
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
     * @return privacyServiceStatus
     */
    public String getPrivacyServiceStatus() {
        return this.privacyServiceStatus;
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
        private String cnnicPrivacyServiceStatus; 
        private DnsList dnsList; 
        private Long domainGroupId; 
        private String domainGroupName; 
        private String domainLifecycleStatus; 
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
        private String privacyServiceStatus; 
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

        private Builder() {
        } 

        private Builder(QueryDomainByInstanceIdResponseBody model) {
            this.cnnicPrivacyServiceStatus = model.cnnicPrivacyServiceStatus;
            this.dnsList = model.dnsList;
            this.domainGroupId = model.domainGroupId;
            this.domainGroupName = model.domainGroupName;
            this.domainLifecycleStatus = model.domainLifecycleStatus;
            this.domainName = model.domainName;
            this.domainNameProxyService = model.domainNameProxyService;
            this.domainNameVerificationStatus = model.domainNameVerificationStatus;
            this.domainStatus = model.domainStatus;
            this.domainType = model.domainType;
            this.email = model.email;
            this.emailVerificationClientHold = model.emailVerificationClientHold;
            this.emailVerificationStatus = model.emailVerificationStatus;
            this.expirationCurrDateDiff = model.expirationCurrDateDiff;
            this.expirationDate = model.expirationDate;
            this.expirationDateLong = model.expirationDateLong;
            this.expirationDateStatus = model.expirationDateStatus;
            this.instanceId = model.instanceId;
            this.premium = model.premium;
            this.privacyServiceStatus = model.privacyServiceStatus;
            this.realNameStatus = model.realNameStatus;
            this.registrantName = model.registrantName;
            this.registrantOrganization = model.registrantOrganization;
            this.registrantType = model.registrantType;
            this.registrantUpdatingStatus = model.registrantUpdatingStatus;
            this.registrationDate = model.registrationDate;
            this.registrationDateLong = model.registrationDateLong;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.tag = model.tag;
            this.transferOutStatus = model.transferOutStatus;
            this.transferProhibitionLock = model.transferProhibitionLock;
            this.updateProhibitionLock = model.updateProhibitionLock;
            this.userId = model.userId;
            this.zhRegistrantName = model.zhRegistrantName;
            this.zhRegistrantOrganization = model.zhRegistrantOrganization;
        } 

        /**
         * CnnicPrivacyServiceStatus.
         */
        public Builder cnnicPrivacyServiceStatus(String cnnicPrivacyServiceStatus) {
            this.cnnicPrivacyServiceStatus = cnnicPrivacyServiceStatus;
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
         * <p>The ID of the domain name group. You can call the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> operation to obtain the ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * <p>The name of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>测试分组</p>
         */
        public Builder domainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }

        /**
         * DomainLifecycleStatus.
         */
        public Builder domainLifecycleStatus(String domainLifecycleStatus) {
            this.domainLifecycleStatus = domainLifecycleStatus;
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
         * <p>Indicates whether the domain name privacy protection service is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder domainNameProxyService(Boolean domainNameProxyService) {
            this.domainNameProxyService = domainNameProxyService;
            return this;
        }

        /**
         * <p>The status of the domain name review. Valid values:</p>
         * <ul>
         * <li><p><strong>NONAUDIT</strong>: The domain name is not verified.</p>
         * </li>
         * <li><p><strong>SUCCEED</strong>: The domain name is verified.</p>
         * </li>
         * <li><p><strong>FAILED</strong>: The domain name fails to be verified.</p>
         * </li>
         * <li><p><strong>AUDITING</strong>: The domain name is being verified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONAUDIT</p>
         */
        public Builder domainNameVerificationStatus(String domainNameVerificationStatus) {
            this.domainNameVerificationStatus = domainNameVerificationStatus;
            return this;
        }

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li><p>1: The domain name needs to be renewed.</p>
         * </li>
         * <li><p>2: The domain name needs to be redeemed.</p>
         * </li>
         * <li><p>3: The domain name is normal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder domainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><p>New gTLD.</p>
         * </li>
         * <li><p>gTLD.</p>
         * </li>
         * <li><p>ccTLD.</p>
         * </li>
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
         * <p>Indicates whether the DNS resolution for the domain name is suspended. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: The DNS resolution for the domain name is not suspended.</p>
         * </li>
         * <li><p><strong>true</strong>: The DNS resolution for the domain name is suspended.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder emailVerificationClientHold(Boolean emailVerificationClientHold) {
            this.emailVerificationClientHold = emailVerificationClientHold;
            return this;
        }

        /**
         * <p>Indicates whether the email address of the domain name registrant is verified. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The email address is not verified.</p>
         * </li>
         * <li><p><strong>1</strong>: The email address is verified.</p>
         * </li>
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
         * <p>The number of days from the expiration date to the current date.</p>
         * 
         * <strong>example:</strong>
         * <p>356</p>
         */
        public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
            return this;
        }

        /**
         * <p>The expiration date of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-07 17:02:13</p>
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * <p>The expiration timestamp of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>1625111915000</p>
         */
        public Builder expirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }

        /**
         * <p>The expiration status of the domain name. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: The domain name has not expired.</p>
         * </li>
         * <li><p><strong>2</strong>: The domain name has expired.</p>
         * </li>
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
         * <p>S20179H1BBI9test</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether the domain name is a premium domain name. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: a premium domain name.</p>
         * </li>
         * <li><p><strong>false</strong>: not a premium domain name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder premium(Boolean premium) {
            this.premium = premium;
            return this;
        }

        /**
         * PrivacyServiceStatus.
         */
        public Builder privacyServiceStatus(String privacyServiceStatus) {
            this.privacyServiceStatus = privacyServiceStatus;
            return this;
        }

        /**
         * <p>The real-name verification status of the domain name. Valid values:</p>
         * <ul>
         * <li><p><strong>NONAUDIT</strong>: The real-name verification is not performed.</p>
         * </li>
         * <li><p><strong>SUCCEED</strong>: The real-name verification is successful.</p>
         * </li>
         * <li><p><strong>FAILED</strong>: The real-name verification fails.</p>
         * </li>
         * <li><p><strong>AUDITING</strong>: The real-name verification is in progress.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The real-name verification status of a domain name is a composite status of domain name review and real-name verification. The real-name verification of a domain name is successful only when both the domain name review and real-name verification are successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NONAUDIT</p>
         */
        public Builder realNameStatus(String realNameStatus) {
            this.realNameStatus = realNameStatus;
            return this;
        }

        /**
         * <p>The name of the contact person.</p>
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
         * <p>The type of the domain name registrant. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: an individual.</p>
         * </li>
         * <li><p><strong>2</strong>: an enterprise.</p>
         * </li>
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
         * <p>The status of the domain name registrant. Valid values:</p>
         * <ul>
         * <li><p><strong>PENDING</strong>: The information about the domain name registrant is being modified.</p>
         * </li>
         * <li><p><strong>NORMAL</strong>: The information about the domain name registrant is not being modified.</p>
         * </li>
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
         * <p>The registration date of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-07 17:02:13</p>
         */
        public Builder registrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        /**
         * <p>The registration timestamp of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>1625111915000</p>
         */
        public Builder registrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
            return this;
        }

        /**
         * <p>The remarks of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试备注</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23C9B3C4-9E2C-4405-A88D-BD33E459D140</p>
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
         * Tag.
         */
        public Builder tag(Tag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>The status of the domain name transfer. Valid values:</p>
         * <ul>
         * <li><p><strong>NORMAL</strong>: The domain name is not being transferred out of Alibaba Cloud.</p>
         * </li>
         * <li><p><strong>PENDING</strong>: The domain name is being transferred out of Alibaba Cloud.</p>
         * </li>
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
         * <p>The status of the domain name transfer lock. Valid values:</p>
         * <ul>
         * <li><p><strong>NONE_SETTING</strong>: The domain name transfer lock is not enabled.</p>
         * </li>
         * <li><p><strong>OPEN</strong>: The domain name transfer lock is enabled.</p>
         * </li>
         * <li><p><strong>CLOSE</strong>: The domain name transfer lock is disabled.</p>
         * </li>
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
         * <li><p><strong>NONE_SETTING</strong>: The security lock is not enabled.</p>
         * </li>
         * <li><p><strong>OPEN</strong>: The security lock is enabled.</p>
         * </li>
         * <li><p><strong>CLOSE</strong>: The security lock is disabled.</p>
         * </li>
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
         * <p>The user ID (UID) of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>121000000****</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The contact person in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        public Builder zhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }

        /**
         * <p>The registrant of the domain name in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }

        public QueryDomainByInstanceIdResponseBody build() {
            return new QueryDomainByInstanceIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainByInstanceIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainByInstanceIdResponseBody</p>
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
    /**
     * 
     * {@link QueryDomainByInstanceIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainByInstanceIdResponseBody</p>
     */
    public static class TagTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(TagTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
    /**
     * 
     * {@link QueryDomainByInstanceIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainByInstanceIdResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<TagTag> tag;

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
        public java.util.List<TagTag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<TagTag> tag; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<TagTag> tag) {
                this.tag = tag;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
