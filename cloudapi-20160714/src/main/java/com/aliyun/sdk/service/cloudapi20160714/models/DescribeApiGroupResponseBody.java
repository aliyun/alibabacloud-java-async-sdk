// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The root path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/qqq</p>
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * <p>The billing status of the API group.</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The API group is normal.</li>
         * <li><strong>LOCKED</strong>: The API group is locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder billingStatus(String billingStatus) {
            this.billingStatus = billingStatus;
            return this;
        }

        /**
         * <p>The products on Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cloudMarketCommodity(Boolean cloudMarketCommodity) {
            this.cloudMarketCommodity = cloudMarketCommodity;
            return this;
        }

        /**
         * <p>The CloudMonitor application group.</p>
         * 
         * <strong>example:</strong>
         * <p>217008423</p>
         */
        public Builder cmsMonitorGroup(String cmsMonitorGroup) {
            this.cmsMonitorGroup = cmsMonitorGroup;
            return this;
        }

        /**
         * <p>The list of associated tags. Separate multiple tags with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>depart:dep1</p>
         */
        public Builder compatibleFlags(String compatibleFlags) {
            this.compatibleFlags = compatibleFlags;
            return this;
        }

        /**
         * <p>The creation time (UTC) of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-08-01T06:53:02Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The details about the custom domain name.</p>
         */
        public Builder customDomains(CustomDomains customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * <p>The custom trace configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;parameterLocation&quot;:&quot;HEADER&quot;,&quot;parameterName&quot;:&quot;traceId&quot;}</p>
         */
        public Builder customTraceConfig(String customTraceConfig) {
            this.customTraceConfig = customTraceConfig;
            return this;
        }

        /**
         * <p>The list of custom configuration items.</p>
         * 
         * <strong>example:</strong>
         * <p>removeResponseServerHeader</p>
         */
        public Builder customerConfigs(String customerConfigs) {
            this.customerConfigs = customerConfigs;
            return this;
        }

        /**
         * <p>The type of exclusive instance where the group is located</p>
         * <ul>
         * <li>VPC fusion type exclusive instance: vpc_connect</li>
         * <li>Traditional type exclusive instance: normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder dedicatedInstanceType(String dedicatedInstanceType) {
            this.dedicatedInstanceType = dedicatedInstanceType;
            return this;
        }

        /**
         * <p>The default domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>mkt.api.gaore.com</p>
         */
        public Builder defaultDomain(String defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }

        /**
         * <p>The description of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>New weather informations.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether access over the public second-level domain name is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableInnerDomain(Boolean disableInnerDomain) {
            this.disableInnerDomain = disableInnerDomain;
            return this;
        }

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>NewWeather</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The HTTPS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS2_TLS1_0</p>
         */
        public Builder httpsPolicy(String httpsPolicy) {
            this.httpsPolicy = httpsPolicy;
            return this;
        }

        /**
         * <p>The validity status of the API group. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The API group is normal.</li>
         * <li><strong>LOCKED</strong>: The API group is locked because it is not valid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder illegalStatus(String illegalStatus) {
            this.illegalStatus = illegalStatus;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-cn-v6419k43xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the instance.</p>
         * <ul>
         * <li>CLASSIC_SHARED: shared instance that uses the classic network configuration</li>
         * <li>VPC_SHARED: shared instance that uses VPC</li>
         * <li>VPC_DEDICATED: dedicated instance that uses VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC_SHARED</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The IPv6 status.</p>
         * 
         * <strong>example:</strong>
         * <p>UNBIND</p>
         */
        public Builder ipv6Status(String ipv6Status) {
            this.ipv6Status = ipv6Status;
            return this;
        }

        /**
         * <p>The reason for the failure of the group migration instance task. When the value of the MigrationStatus parameter is Failed, it is not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>The current instance conflicts with the target instance.</p>
         */
        public Builder migrationError(String migrationError) {
            this.migrationError = migrationError;
            return this;
        }

        /**
         * <p>Group migration instance task status</p>
         * <ul>
         * <li>Running</li>
         * <li>Success</li>
         * <li>Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        public Builder migrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }

        /**
         * <p>The last modification time (UTC) of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-08-01T06:54:32Z</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>Specifies whether to pass headers.</p>
         * 
         * <strong>example:</strong>
         * <p>eagleeye-rpcid,x-b3-traceid</p>
         */
        public Builder passthroughHeaders(String passthroughHeaders) {
            this.passthroughHeaders = passthroughHeaders;
            return this;
        }

        /**
         * <p>The region to which the API group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>03442A3D-3B7D-434C-8A95-A5FEB989B519</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The runtime environment information.</p>
         */
        public Builder stageItems(StageItems stageItems) {
            this.stageItems = stageItems;
            return this;
        }

        /**
         * <p>The status of the API group.</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The API group is normal.</li>
         * <li><strong>DELETE</strong>: The API group is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The second-level domain name automatically assigned to the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>27d50c0f2e54b359919923d908bb015-cn-hangzhou.alicloudapi.com</p>
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        /**
         * <p>The upper QPS limit of the API group. The default value is 500. You can increase the upper limit by submitting an application.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder trafficLimit(Integer trafficLimit) {
            this.trafficLimit = trafficLimit;
            return this;
        }

        /**
         * <p>The user log settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;requestBody&quot;:true,&quot;responseBody&quot;:true,&quot;queryString&quot;:&quot;test&quot;,&quot;requestHeaders&quot;:&quot;test&quot;,&quot;responseHeaders&quot;:&quot;test&quot;,&quot;jwtClaims&quot;:&quot;test&quot;}</p>
         */
        public Builder userLogConfig(String userLogConfig) {
            this.userLogConfig = userLogConfig;
            return this;
        }

        /**
         * <p>The VPC domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>e4<em><em><strong>7151954</strong></em>acbd9f7</em>***1058a-ap-southeast-1-vpc.alicloudapi.com</p>
         */
        public Builder vpcDomain(String vpcDomain) {
            this.vpcDomain = vpcDomain;
            return this;
        }

        /**
         * <p>The VPC SLB domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>257e9d450e924d00b976b0ecfb7184c2-cn-beijing-intranet.alicloudapi.com</p>
         */
        public Builder vpcSlbIntranetDomain(String vpcSlbIntranetDomain) {
            this.vpcSlbIntranetDomain = vpcSlbIntranetDomain;
            return this;
        }

        public DescribeApiGroupResponseBody build() {
            return new DescribeApiGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiGroupResponseBody</p>
     */
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
             * <p>The alias of the associated environment.</p>
             * 
             * <strong>example:</strong>
             * <p>TEST1</p>
             */
            public Builder bindStageAlias(String bindStageAlias) {
                this.bindStageAlias = bindStageAlias;
                return this;
            }

            /**
             * <p>The environment in which the associated API group runs.</p>
             * 
             * <strong>example:</strong>
             * <p>TEST</p>
             */
            public Builder bindStageName(String bindStageName) {
                this.bindStageName = bindStageName;
                return this;
            }

            /**
             * <p>The SSL certificate ID, which is automatically generated by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The name of the SSL certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>myCertificate</p>
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * <p>The time when the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2635123476000</p>
             */
            public Builder certificateValidEnd(Long certificateValidEnd) {
                this.certificateValidEnd = certificateValidEnd;
                return this;
            }

            /**
             * <p>The time when the certificate takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1689043476000</p>
             */
            public Builder certificateValidStart(Long certificateValidStart) {
                this.certificateValidStart = certificateValidStart;
                return this;
            }

            /**
             * <p>The type of the custom domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder customDomainType(String customDomainType) {
                this.customDomainType = customDomainType;
                return this;
            }

            /**
             * <p>The binding status of the custom domain name. Valid values:</p>
             * <ul>
             * <li><strong>BINDING</strong>: The domain name is bound.</li>
             * <li><strong>BOUND</strong>: The domain name is not bound.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BINDING</p>
             */
            public Builder domainBindingStatus(String domainBindingStatus) {
                this.domainBindingStatus = domainBindingStatus;
                return this;
            }

            /**
             * <p>The domain name resolution status. Valid values:</p>
             * <ul>
             * <li><strong>RESOLVED</strong></li>
             * <li><strong>UNRESOLVED</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESOLVED</p>
             */
            public Builder domainCNAMEStatus(String domainCNAMEStatus) {
                this.domainCNAMEStatus = domainCNAMEStatus;
                return this;
            }

            /**
             * <p>The validity status of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The domain name is valid.</li>
             * <li><strong>ABNORMAL</strong>: The domain name is invalid. This status affects API calls and needs to be rectified as soon as possible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ABNORMAL</p>
             */
            public Builder domainLegalStatus(String domainLegalStatus) {
                this.domainLegalStatus = domainLegalStatus;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>api.demo.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Remarks about the domain name, such as the cause of an exception.</p>
             * 
             * <strong>example:</strong>
             * <p>Indicates that the domain name does not have an ICP filing.</p>
             */
            public Builder domainRemark(String domainRemark) {
                this.domainRemark = domainRemark;
                return this;
            }

            /**
             * <p>The status of the domain that uses the WebSocket feature.</p>
             * 
             * <strong>example:</strong>
             * <p>CLOSE</p>
             */
            public Builder domainWebSocketStatus(String domainWebSocketStatus) {
                this.domainWebSocketStatus = domainWebSocketStatus;
                return this;
            }

            /**
             * <p>Indicates whether to redirect HTTP requests to HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
                this.isHttpRedirectToHttps = isHttpRedirectToHttps;
                return this;
            }

            /**
             * <p>The wildcard domain name mode.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;{test}.test.com&quot;]</p>
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
    /**
     * 
     * {@link DescribeApiGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiGroupResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiGroupResponseBody</p>
     */
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
             * <p>The environment description.</p>
             * 
             * <strong>example:</strong>
             * <p>MYTEST</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123e8dc7bbe01613b5b1d726c2a7888e</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>TEST</p>
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
    /**
     * 
     * {@link DescribeApiGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiGroupResponseBody</p>
     */
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
