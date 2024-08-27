// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupResponseBody</p>
 */
public class DescribeApiGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasePath")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("BillingStatus")
    private String billingStatus;

    @com.aliyun.core.annotation.NameInMap("CloudMarketCommodity")
    private Boolean cloudMarketCommodity;

    @com.aliyun.core.annotation.NameInMap("CmsMonitorGroup")
    private String cmsMonitorGroup;

    @com.aliyun.core.annotation.NameInMap("CompatibleFlags")
    private String compatibleFlags;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("CustomDomains")
    private CustomDomains customDomains;

    @com.aliyun.core.annotation.NameInMap("CustomTraceConfig")
    private String customTraceConfig;

    @com.aliyun.core.annotation.NameInMap("CustomerConfigs")
    private String customerConfigs;

    @com.aliyun.core.annotation.NameInMap("DedicatedInstanceType")
    private String dedicatedInstanceType;

    @com.aliyun.core.annotation.NameInMap("DefaultDomain")
    private String defaultDomain;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisableInnerDomain")
    private Boolean disableInnerDomain;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("HttpsPolicy")
    private String httpsPolicy;

    @com.aliyun.core.annotation.NameInMap("IllegalStatus")
    private String illegalStatus;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("Ipv6Status")
    private String ipv6Status;

    @com.aliyun.core.annotation.NameInMap("MigrationError")
    private String migrationError;

    @com.aliyun.core.annotation.NameInMap("MigrationStatus")
    private String migrationStatus;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("PassthroughHeaders")
    private String passthroughHeaders;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StageItems")
    private StageItems stageItems;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    @com.aliyun.core.annotation.NameInMap("TrafficLimit")
    private Integer trafficLimit;

    @com.aliyun.core.annotation.NameInMap("UserLogConfig")
    private String userLogConfig;

    @com.aliyun.core.annotation.NameInMap("VpcDomain")
    private String vpcDomain;

    @com.aliyun.core.annotation.NameInMap("VpcSlbIntranetDomain")
    private String vpcSlbIntranetDomain;

    private DescribeApiGroupResponseBody(Builder builder) {
        this.basePath = builder.basePath;
        this.billingStatus = builder.billingStatus;
        this.cloudMarketCommodity = builder.cloudMarketCommodity;
        this.cmsMonitorGroup = builder.cmsMonitorGroup;
        this.compatibleFlags = builder.compatibleFlags;
        this.createdTime = builder.createdTime;
        this.customDomains = builder.customDomains;
        this.customTraceConfig = builder.customTraceConfig;
        this.customerConfigs = builder.customerConfigs;
        this.dedicatedInstanceType = builder.dedicatedInstanceType;
        this.defaultDomain = builder.defaultDomain;
        this.description = builder.description;
        this.disableInnerDomain = builder.disableInnerDomain;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.httpsPolicy = builder.httpsPolicy;
        this.illegalStatus = builder.illegalStatus;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.ipv6Status = builder.ipv6Status;
        this.migrationError = builder.migrationError;
        this.migrationStatus = builder.migrationStatus;
        this.modifiedTime = builder.modifiedTime;
        this.passthroughHeaders = builder.passthroughHeaders;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.stageItems = builder.stageItems;
        this.status = builder.status;
        this.subDomain = builder.subDomain;
        this.trafficLimit = builder.trafficLimit;
        this.userLogConfig = builder.userLogConfig;
        this.vpcDomain = builder.vpcDomain;
        this.vpcSlbIntranetDomain = builder.vpcSlbIntranetDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return billingStatus
     */
    public String getBillingStatus() {
        return this.billingStatus;
    }

    /**
     * @return cloudMarketCommodity
     */
    public Boolean getCloudMarketCommodity() {
        return this.cloudMarketCommodity;
    }

    /**
     * @return cmsMonitorGroup
     */
    public String getCmsMonitorGroup() {
        return this.cmsMonitorGroup;
    }

    /**
     * @return compatibleFlags
     */
    public String getCompatibleFlags() {
        return this.compatibleFlags;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return customDomains
     */
    public CustomDomains getCustomDomains() {
        return this.customDomains;
    }

    /**
     * @return customTraceConfig
     */
    public String getCustomTraceConfig() {
        return this.customTraceConfig;
    }

    /**
     * @return customerConfigs
     */
    public String getCustomerConfigs() {
        return this.customerConfigs;
    }

    /**
     * @return dedicatedInstanceType
     */
    public String getDedicatedInstanceType() {
        return this.dedicatedInstanceType;
    }

    /**
     * @return defaultDomain
     */
    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableInnerDomain
     */
    public Boolean getDisableInnerDomain() {
        return this.disableInnerDomain;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return httpsPolicy
     */
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    /**
     * @return illegalStatus
     */
    public String getIllegalStatus() {
        return this.illegalStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return ipv6Status
     */
    public String getIpv6Status() {
        return this.ipv6Status;
    }

    /**
     * @return migrationError
     */
    public String getMigrationError() {
        return this.migrationError;
    }

    /**
     * @return migrationStatus
     */
    public String getMigrationStatus() {
        return this.migrationStatus;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return passthroughHeaders
     */
    public String getPassthroughHeaders() {
        return this.passthroughHeaders;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stageItems
     */
    public StageItems getStageItems() {
        return this.stageItems;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * @return trafficLimit
     */
    public Integer getTrafficLimit() {
        return this.trafficLimit;
    }

    /**
     * @return userLogConfig
     */
    public String getUserLogConfig() {
        return this.userLogConfig;
    }

    /**
     * @return vpcDomain
     */
    public String getVpcDomain() {
        return this.vpcDomain;
    }

    /**
     * @return vpcSlbIntranetDomain
     */
    public String getVpcSlbIntranetDomain() {
        return this.vpcSlbIntranetDomain;
    }

    public static final class Builder {
        private String basePath; 
        private String billingStatus; 
        private Boolean cloudMarketCommodity; 
        private String cmsMonitorGroup; 
        private String compatibleFlags; 
        private String createdTime; 
        private CustomDomains customDomains; 
        private String customTraceConfig; 
        private String customerConfigs; 
        private String dedicatedInstanceType; 
        private String defaultDomain; 
        private String description; 
        private Boolean disableInnerDomain; 
        private String groupId; 
        private String groupName; 
        private String httpsPolicy; 
        private String illegalStatus; 
        private String instanceId; 
        private String instanceType; 
        private String ipv6Status; 
        private String migrationError; 
        private String migrationStatus; 
        private String modifiedTime; 
        private String passthroughHeaders; 
        private String regionId; 
        private String requestId; 
        private StageItems stageItems; 
        private String status; 
        private String subDomain; 
        private Integer trafficLimit; 
        private String userLogConfig; 
        private String vpcDomain; 
        private String vpcSlbIntranetDomain; 

        /**
         * The root path of the API.
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * The billing status of the API group.
         * <p>
         * 
         * *   **NORMAL**: The API group is normal.
         * *   **LOCKED**: The API group is locked due to overdue payments.
         */
        public Builder billingStatus(String billingStatus) {
            this.billingStatus = billingStatus;
            return this;
        }

        /**
         * The products on Alibaba Cloud Marketplace.
         */
        public Builder cloudMarketCommodity(Boolean cloudMarketCommodity) {
            this.cloudMarketCommodity = cloudMarketCommodity;
            return this;
        }

        /**
         * The CloudMonitor application group.
         */
        public Builder cmsMonitorGroup(String cmsMonitorGroup) {
            this.cmsMonitorGroup = cmsMonitorGroup;
            return this;
        }

        /**
         * The list of associated tags. Separate multiple tags with commas (,).
         */
        public Builder compatibleFlags(String compatibleFlags) {
            this.compatibleFlags = compatibleFlags;
            return this;
        }

        /**
         * The creation time (UTC) of the API group.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The details about the custom domain name.
         */
        public Builder customDomains(CustomDomains customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * The custom trace configuration.
         */
        public Builder customTraceConfig(String customTraceConfig) {
            this.customTraceConfig = customTraceConfig;
            return this;
        }

        /**
         * The list of custom configuration items.
         */
        public Builder customerConfigs(String customerConfigs) {
            this.customerConfigs = customerConfigs;
            return this;
        }

        /**
         * The type of exclusive instance where the group is located
         * <p>
         * 
         * - VPC fusion type exclusive instance: vpc_connect
         * - Traditional type exclusive instance: normal
         */
        public Builder dedicatedInstanceType(String dedicatedInstanceType) {
            this.dedicatedInstanceType = dedicatedInstanceType;
            return this;
        }

        /**
         * The default domain name.
         */
        public Builder defaultDomain(String defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }

        /**
         * The description of the API group.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Indicates whether access over the public second-level domain name is enabled. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder disableInnerDomain(Boolean disableInnerDomain) {
            this.disableInnerDomain = disableInnerDomain;
            return this;
        }

        /**
         * The ID of the API group. This ID is generated by the system and globally unique.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the group to which the API belongs.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * The HTTPS policy.
         */
        public Builder httpsPolicy(String httpsPolicy) {
            this.httpsPolicy = httpsPolicy;
            return this;
        }

        /**
         * The validity status of the API group. Valid values:
         * <p>
         * 
         * *   **NORMAL**: The API group is normal.
         * *   **LOCKED**: The API group is locked because it is not valid.
         */
        public Builder illegalStatus(String illegalStatus) {
            this.illegalStatus = illegalStatus;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the instance.
         * <p>
         * 
         * *   CLASSIC_SHARED: shared instance that uses the classic network configuration
         * *   VPC_SHARED: shared instance that uses VPC
         * *   VPC_DEDICATED: dedicated instance that uses VPC
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The IPv6 status.
         */
        public Builder ipv6Status(String ipv6Status) {
            this.ipv6Status = ipv6Status;
            return this;
        }

        /**
         * The reason for the failure of the group migration instance task. When the value of the MigrationStatus parameter is Failed, it is not empty.
         */
        public Builder migrationError(String migrationError) {
            this.migrationError = migrationError;
            return this;
        }

        /**
         * Group migration instance task status
         * <p>
         * 
         * - Running
         * - Success
         * - Failed
         */
        public Builder migrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }

        /**
         * The last modification time (UTC) of the API group.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * Specifies whether to pass headers.
         */
        public Builder passthroughHeaders(String passthroughHeaders) {
            this.passthroughHeaders = passthroughHeaders;
            return this;
        }

        /**
         * The region to which the API group belongs.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The runtime environment information.
         */
        public Builder stageItems(StageItems stageItems) {
            this.stageItems = stageItems;
            return this;
        }

        /**
         * The status of the API group.
         * <p>
         * 
         * *   **NORMAL**: The API group is normal.
         * *   **DELETE**: The API group is deleted.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The second-level domain name automatically assigned to the API group.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        /**
         * The upper QPS limit of the API group. The default value is 500. You can increase the upper limit by submitting an application.
         */
        public Builder trafficLimit(Integer trafficLimit) {
            this.trafficLimit = trafficLimit;
            return this;
        }

        /**
         * The user log settings.
         */
        public Builder userLogConfig(String userLogConfig) {
            this.userLogConfig = userLogConfig;
            return this;
        }

        /**
         * The VPC domain name.
         */
        public Builder vpcDomain(String vpcDomain) {
            this.vpcDomain = vpcDomain;
            return this;
        }

        /**
         * The VPC SLB domain name.
         */
        public Builder vpcSlbIntranetDomain(String vpcSlbIntranetDomain) {
            this.vpcSlbIntranetDomain = vpcSlbIntranetDomain;
            return this;
        }

        public DescribeApiGroupResponseBody build() {
            return new DescribeApiGroupResponseBody(this);
        } 

    } 

    public static class DomainItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindStageAlias")
        private String bindStageAlias;

        @com.aliyun.core.annotation.NameInMap("BindStageName")
        private String bindStageName;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CertificateValidEnd")
        private Long certificateValidEnd;

        @com.aliyun.core.annotation.NameInMap("CertificateValidStart")
        private Long certificateValidStart;

        @com.aliyun.core.annotation.NameInMap("CustomDomainType")
        private String customDomainType;

        @com.aliyun.core.annotation.NameInMap("DomainBindingStatus")
        private String domainBindingStatus;

        @com.aliyun.core.annotation.NameInMap("DomainCNAMEStatus")
        private String domainCNAMEStatus;

        @com.aliyun.core.annotation.NameInMap("DomainLegalStatus")
        private String domainLegalStatus;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainRemark")
        private String domainRemark;

        @com.aliyun.core.annotation.NameInMap("DomainWebSocketStatus")
        private String domainWebSocketStatus;

        @com.aliyun.core.annotation.NameInMap("IsHttpRedirectToHttps")
        private Boolean isHttpRedirectToHttps;

        @com.aliyun.core.annotation.NameInMap("WildcardDomainPatterns")
        private String wildcardDomainPatterns;

        private DomainItem(Builder builder) {
            this.bindStageAlias = builder.bindStageAlias;
            this.bindStageName = builder.bindStageName;
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.certificateValidEnd = builder.certificateValidEnd;
            this.certificateValidStart = builder.certificateValidStart;
            this.customDomainType = builder.customDomainType;
            this.domainBindingStatus = builder.domainBindingStatus;
            this.domainCNAMEStatus = builder.domainCNAMEStatus;
            this.domainLegalStatus = builder.domainLegalStatus;
            this.domainName = builder.domainName;
            this.domainRemark = builder.domainRemark;
            this.domainWebSocketStatus = builder.domainWebSocketStatus;
            this.isHttpRedirectToHttps = builder.isHttpRedirectToHttps;
            this.wildcardDomainPatterns = builder.wildcardDomainPatterns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainItem create() {
            return builder().build();
        }

        /**
         * @return bindStageAlias
         */
        public String getBindStageAlias() {
            return this.bindStageAlias;
        }

        /**
         * @return bindStageName
         */
        public String getBindStageName() {
            return this.bindStageName;
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return certificateValidEnd
         */
        public Long getCertificateValidEnd() {
            return this.certificateValidEnd;
        }

        /**
         * @return certificateValidStart
         */
        public Long getCertificateValidStart() {
            return this.certificateValidStart;
        }

        /**
         * @return customDomainType
         */
        public String getCustomDomainType() {
            return this.customDomainType;
        }

        /**
         * @return domainBindingStatus
         */
        public String getDomainBindingStatus() {
            return this.domainBindingStatus;
        }

        /**
         * @return domainCNAMEStatus
         */
        public String getDomainCNAMEStatus() {
            return this.domainCNAMEStatus;
        }

        /**
         * @return domainLegalStatus
         */
        public String getDomainLegalStatus() {
            return this.domainLegalStatus;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainRemark
         */
        public String getDomainRemark() {
            return this.domainRemark;
        }

        /**
         * @return domainWebSocketStatus
         */
        public String getDomainWebSocketStatus() {
            return this.domainWebSocketStatus;
        }

        /**
         * @return isHttpRedirectToHttps
         */
        public Boolean getIsHttpRedirectToHttps() {
            return this.isHttpRedirectToHttps;
        }

        /**
         * @return wildcardDomainPatterns
         */
        public String getWildcardDomainPatterns() {
            return this.wildcardDomainPatterns;
        }

        public static final class Builder {
            private String bindStageAlias; 
            private String bindStageName; 
            private String certificateId; 
            private String certificateName; 
            private Long certificateValidEnd; 
            private Long certificateValidStart; 
            private String customDomainType; 
            private String domainBindingStatus; 
            private String domainCNAMEStatus; 
            private String domainLegalStatus; 
            private String domainName; 
            private String domainRemark; 
            private String domainWebSocketStatus; 
            private Boolean isHttpRedirectToHttps; 
            private String wildcardDomainPatterns; 

            /**
             * The alias of the associated environment.
             */
            public Builder bindStageAlias(String bindStageAlias) {
                this.bindStageAlias = bindStageAlias;
                return this;
            }

            /**
             * The environment in which the associated API group runs.
             */
            public Builder bindStageName(String bindStageName) {
                this.bindStageName = bindStageName;
                return this;
            }

            /**
             * The SSL certificate ID, which is automatically generated by the system.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * The name of the SSL certificate.
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * The time when the certificate expires.
             */
            public Builder certificateValidEnd(Long certificateValidEnd) {
                this.certificateValidEnd = certificateValidEnd;
                return this;
            }

            /**
             * The time when the certificate takes effect.
             */
            public Builder certificateValidStart(Long certificateValidStart) {
                this.certificateValidStart = certificateValidStart;
                return this;
            }

            /**
             * The type of the custom domain name.
             */
            public Builder customDomainType(String customDomainType) {
                this.customDomainType = customDomainType;
                return this;
            }

            /**
             * The binding status of the custom domain name. Valid values:
             * <p>
             * 
             * *   **BINDING**: The domain name is bound.
             * *   **BOUND**: The domain name is not bound.
             */
            public Builder domainBindingStatus(String domainBindingStatus) {
                this.domainBindingStatus = domainBindingStatus;
                return this;
            }

            /**
             * The domain name resolution status. Valid values:
             * <p>
             * 
             * *   **RESOLVED**
             * *   **UNRESOLVED**
             */
            public Builder domainCNAMEStatus(String domainCNAMEStatus) {
                this.domainCNAMEStatus = domainCNAMEStatus;
                return this;
            }

            /**
             * The validity status of the domain name. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The domain name is valid.
             * *   **ABNORMAL**: The domain name is invalid. This status affects API calls and needs to be rectified as soon as possible.
             */
            public Builder domainLegalStatus(String domainLegalStatus) {
                this.domainLegalStatus = domainLegalStatus;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Remarks about the domain name, such as the cause of an exception.
             */
            public Builder domainRemark(String domainRemark) {
                this.domainRemark = domainRemark;
                return this;
            }

            /**
             * The status of the domain that uses the WebSocket feature.
             */
            public Builder domainWebSocketStatus(String domainWebSocketStatus) {
                this.domainWebSocketStatus = domainWebSocketStatus;
                return this;
            }

            /**
             * Indicates whether to redirect HTTP requests to HTTPS.
             */
            public Builder isHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
                this.isHttpRedirectToHttps = isHttpRedirectToHttps;
                return this;
            }

            /**
             * The wildcard domain name mode.
             */
            public Builder wildcardDomainPatterns(String wildcardDomainPatterns) {
                this.wildcardDomainPatterns = wildcardDomainPatterns;
                return this;
            }

            public DomainItem build() {
                return new DomainItem(this);
            } 

        } 

    }
    public static class CustomDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainItem")
        private java.util.List < DomainItem> domainItem;

        private CustomDomains(Builder builder) {
            this.domainItem = builder.domainItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomDomains create() {
            return builder().build();
        }

        /**
         * @return domainItem
         */
        public java.util.List < DomainItem> getDomainItem() {
            return this.domainItem;
        }

        public static final class Builder {
            private java.util.List < DomainItem> domainItem; 

            /**
             * DomainItem.
             */
            public Builder domainItem(java.util.List < DomainItem> domainItem) {
                this.domainItem = domainItem;
                return this;
            }

            public CustomDomains build() {
                return new CustomDomains(this);
            } 

        } 

    }
    public static class StageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        private StageInfo(Builder builder) {
            this.description = builder.description;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String description; 
            private String stageId; 
            private String stageName; 

            /**
             * The environment description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The environment ID.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The environment name.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public StageInfo build() {
                return new StageInfo(this);
            } 

        } 

    }
    public static class StageItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StageInfo")
        private java.util.List < StageInfo> stageInfo;

        private StageItems(Builder builder) {
            this.stageInfo = builder.stageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageItems create() {
            return builder().build();
        }

        /**
         * @return stageInfo
         */
        public java.util.List < StageInfo> getStageInfo() {
            return this.stageInfo;
        }

        public static final class Builder {
            private java.util.List < StageInfo> stageInfo; 

            /**
             * StageInfo.
             */
            public Builder stageInfo(java.util.List < StageInfo> stageInfo) {
                this.stageInfo = stageInfo;
                return this;
            }

            public StageItems build() {
                return new StageItems(this);
            } 

        } 

    }
}
