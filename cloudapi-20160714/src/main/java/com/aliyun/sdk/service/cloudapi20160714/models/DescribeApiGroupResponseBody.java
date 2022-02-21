// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupResponseBody</p>
 */
public class DescribeApiGroupResponseBody extends TeaModel {
    @NameInMap("BasePath")
    private String basePath;

    @NameInMap("BillingStatus")
    private String billingStatus;

    @NameInMap("ClassicVpcSubDomain")
    private String classicVpcSubDomain;

    @NameInMap("CmsMonitorGroup")
    private String cmsMonitorGroup;

    @NameInMap("CompatibleFlags")
    private String compatibleFlags;

    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("CustomDomains")
    private CustomDomains customDomains;

    @NameInMap("CustomTraceConfig")
    private String customTraceConfig;

    @NameInMap("CustomerConfigs")
    private String customerConfigs;

    @NameInMap("DefaultDomain")
    private String defaultDomain;

    @NameInMap("Description")
    private String description;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("HttpsPolicy")
    private String httpsPolicy;

    @NameInMap("IllegalStatus")
    private String illegalStatus;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("InstanceVipList")
    private String instanceVipList;

    @NameInMap("Ipv6Status")
    private String ipv6Status;

    @NameInMap("ModifiedTime")
    private String modifiedTime;

    @NameInMap("PassthroughHeaders")
    private String passthroughHeaders;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RpcPattern")
    private String rpcPattern;

    @NameInMap("StageItems")
    private StageItems stageItems;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubDomain")
    private String subDomain;

    @NameInMap("TrafficLimit")
    private Integer trafficLimit;

    @NameInMap("UserLogConfig")
    private String userLogConfig;

    @NameInMap("VpcDomain")
    private String vpcDomain;

    @NameInMap("VpcSlbIntranetDomain")
    private String vpcSlbIntranetDomain;

    private DescribeApiGroupResponseBody(Builder builder) {
        this.basePath = builder.basePath;
        this.billingStatus = builder.billingStatus;
        this.classicVpcSubDomain = builder.classicVpcSubDomain;
        this.cmsMonitorGroup = builder.cmsMonitorGroup;
        this.compatibleFlags = builder.compatibleFlags;
        this.createdTime = builder.createdTime;
        this.customDomains = builder.customDomains;
        this.customTraceConfig = builder.customTraceConfig;
        this.customerConfigs = builder.customerConfigs;
        this.defaultDomain = builder.defaultDomain;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.httpsPolicy = builder.httpsPolicy;
        this.illegalStatus = builder.illegalStatus;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.instanceVipList = builder.instanceVipList;
        this.ipv6Status = builder.ipv6Status;
        this.modifiedTime = builder.modifiedTime;
        this.passthroughHeaders = builder.passthroughHeaders;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.rpcPattern = builder.rpcPattern;
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
     * @return classicVpcSubDomain
     */
    public String getClassicVpcSubDomain() {
        return this.classicVpcSubDomain;
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
     * @return instanceVipList
     */
    public String getInstanceVipList() {
        return this.instanceVipList;
    }

    /**
     * @return ipv6Status
     */
    public String getIpv6Status() {
        return this.ipv6Status;
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
     * @return rpcPattern
     */
    public String getRpcPattern() {
        return this.rpcPattern;
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
        private String classicVpcSubDomain; 
        private String cmsMonitorGroup; 
        private String compatibleFlags; 
        private String createdTime; 
        private CustomDomains customDomains; 
        private String customTraceConfig; 
        private String customerConfigs; 
        private String defaultDomain; 
        private String description; 
        private String groupId; 
        private String groupName; 
        private String httpsPolicy; 
        private String illegalStatus; 
        private String instanceId; 
        private String instanceType; 
        private String instanceVipList; 
        private String ipv6Status; 
        private String modifiedTime; 
        private String passthroughHeaders; 
        private String regionId; 
        private String requestId; 
        private String rpcPattern; 
        private StageItems stageItems; 
        private String status; 
        private String subDomain; 
        private Integer trafficLimit; 
        private String userLogConfig; 
        private String vpcDomain; 
        private String vpcSlbIntranetDomain; 

        /**
         * BasePath.
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * BillingStatus.
         */
        public Builder billingStatus(String billingStatus) {
            this.billingStatus = billingStatus;
            return this;
        }

        /**
         * ClassicVpcSubDomain.
         */
        public Builder classicVpcSubDomain(String classicVpcSubDomain) {
            this.classicVpcSubDomain = classicVpcSubDomain;
            return this;
        }

        /**
         * CmsMonitorGroup.
         */
        public Builder cmsMonitorGroup(String cmsMonitorGroup) {
            this.cmsMonitorGroup = cmsMonitorGroup;
            return this;
        }

        /**
         * CompatibleFlags.
         */
        public Builder compatibleFlags(String compatibleFlags) {
            this.compatibleFlags = compatibleFlags;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * CustomDomains.
         */
        public Builder customDomains(CustomDomains customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * CustomTraceConfig.
         */
        public Builder customTraceConfig(String customTraceConfig) {
            this.customTraceConfig = customTraceConfig;
            return this;
        }

        /**
         * CustomerConfigs.
         */
        public Builder customerConfigs(String customerConfigs) {
            this.customerConfigs = customerConfigs;
            return this;
        }

        /**
         * DefaultDomain.
         */
        public Builder defaultDomain(String defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * HttpsPolicy.
         */
        public Builder httpsPolicy(String httpsPolicy) {
            this.httpsPolicy = httpsPolicy;
            return this;
        }

        /**
         * IllegalStatus.
         */
        public Builder illegalStatus(String illegalStatus) {
            this.illegalStatus = illegalStatus;
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * InstanceVipList.
         */
        public Builder instanceVipList(String instanceVipList) {
            this.instanceVipList = instanceVipList;
            return this;
        }

        /**
         * Ipv6Status.
         */
        public Builder ipv6Status(String ipv6Status) {
            this.ipv6Status = ipv6Status;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * PassthroughHeaders.
         */
        public Builder passthroughHeaders(String passthroughHeaders) {
            this.passthroughHeaders = passthroughHeaders;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * RpcPattern.
         */
        public Builder rpcPattern(String rpcPattern) {
            this.rpcPattern = rpcPattern;
            return this;
        }

        /**
         * StageItems.
         */
        public Builder stageItems(StageItems stageItems) {
            this.stageItems = stageItems;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        /**
         * TrafficLimit.
         */
        public Builder trafficLimit(Integer trafficLimit) {
            this.trafficLimit = trafficLimit;
            return this;
        }

        /**
         * UserLogConfig.
         */
        public Builder userLogConfig(String userLogConfig) {
            this.userLogConfig = userLogConfig;
            return this;
        }

        /**
         * VpcDomain.
         */
        public Builder vpcDomain(String vpcDomain) {
            this.vpcDomain = vpcDomain;
            return this;
        }

        /**
         * VpcSlbIntranetDomain.
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
        @NameInMap("BindStageName")
        private String bindStageName;

        @NameInMap("CertificateId")
        private String certificateId;

        @NameInMap("CertificateName")
        private String certificateName;

        @NameInMap("CustomDomainType")
        private String customDomainType;

        @NameInMap("DomainBindingStatus")
        private String domainBindingStatus;

        @NameInMap("DomainCNAMEStatus")
        private String domainCNAMEStatus;

        @NameInMap("DomainLegalStatus")
        private String domainLegalStatus;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainRemark")
        private String domainRemark;

        @NameInMap("DomainWebSocketStatus")
        private String domainWebSocketStatus;

        @NameInMap("WildcardDomainPatterns")
        private String wildcardDomainPatterns;

        private DomainItem(Builder builder) {
            this.bindStageName = builder.bindStageName;
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.customDomainType = builder.customDomainType;
            this.domainBindingStatus = builder.domainBindingStatus;
            this.domainCNAMEStatus = builder.domainCNAMEStatus;
            this.domainLegalStatus = builder.domainLegalStatus;
            this.domainName = builder.domainName;
            this.domainRemark = builder.domainRemark;
            this.domainWebSocketStatus = builder.domainWebSocketStatus;
            this.wildcardDomainPatterns = builder.wildcardDomainPatterns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainItem create() {
            return builder().build();
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
         * @return wildcardDomainPatterns
         */
        public String getWildcardDomainPatterns() {
            return this.wildcardDomainPatterns;
        }

        public static final class Builder {
            private String bindStageName; 
            private String certificateId; 
            private String certificateName; 
            private String customDomainType; 
            private String domainBindingStatus; 
            private String domainCNAMEStatus; 
            private String domainLegalStatus; 
            private String domainName; 
            private String domainRemark; 
            private String domainWebSocketStatus; 
            private String wildcardDomainPatterns; 

            /**
             * BindStageName.
             */
            public Builder bindStageName(String bindStageName) {
                this.bindStageName = bindStageName;
                return this;
            }

            /**
             * CertificateId.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * CertificateName.
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * CustomDomainType.
             */
            public Builder customDomainType(String customDomainType) {
                this.customDomainType = customDomainType;
                return this;
            }

            /**
             * DomainBindingStatus.
             */
            public Builder domainBindingStatus(String domainBindingStatus) {
                this.domainBindingStatus = domainBindingStatus;
                return this;
            }

            /**
             * DomainCNAMEStatus.
             */
            public Builder domainCNAMEStatus(String domainCNAMEStatus) {
                this.domainCNAMEStatus = domainCNAMEStatus;
                return this;
            }

            /**
             * DomainLegalStatus.
             */
            public Builder domainLegalStatus(String domainLegalStatus) {
                this.domainLegalStatus = domainLegalStatus;
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
             * DomainRemark.
             */
            public Builder domainRemark(String domainRemark) {
                this.domainRemark = domainRemark;
                return this;
            }

            /**
             * DomainWebSocketStatus.
             */
            public Builder domainWebSocketStatus(String domainWebSocketStatus) {
                this.domainWebSocketStatus = domainWebSocketStatus;
                return this;
            }

            /**
             * WildcardDomainPatterns.
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
        @NameInMap("DomainItem")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageName")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * StageId.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * StageName.
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
        @NameInMap("StageInfo")
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
