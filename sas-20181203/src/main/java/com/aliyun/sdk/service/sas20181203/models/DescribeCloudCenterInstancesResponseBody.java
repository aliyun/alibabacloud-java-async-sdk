// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCloudCenterInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudCenterInstancesResponseBody</p>
 */
public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCloudCenterInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudCenterInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCloudCenterInstancesResponseBody model) {
            this.instances = model.instances;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details about the assets.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>32A73759-4C0F-4801-BE98-901223ACEE9A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call is successful.</li>
         * <li><strong>false</strong>: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudCenterInstancesResponseBody build() {
            return new DescribeCloudCenterInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudCenterInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudCenterInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("AssetTypeName")
        private String assetTypeName;

        @com.aliyun.core.annotation.NameInMap("AuthModifyTime")
        private Long authModifyTime;

        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private Integer authVersion;

        @com.aliyun.core.annotation.NameInMap("AuthVersionName")
        private String authVersionName;

        @com.aliyun.core.annotation.NameInMap("Bind")
        private Boolean bind;

        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("ClientSubStatus")
        private String clientSubStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("CpuInfo")
        private String cpuInfo;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("ExposedStatus")
        private Integer exposedStatus;

        @com.aliyun.core.annotation.NameInMap("Flag")
        private Integer flag;

        @com.aliyun.core.annotation.NameInMap("FlagName")
        private String flagName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupTrace")
        private String groupTrace;

        @com.aliyun.core.annotation.NameInMap("HcStatus")
        private String hcStatus;

        @com.aliyun.core.annotation.NameInMap("HealthCheckCount")
        private Integer healthCheckCount;

        @com.aliyun.core.annotation.NameInMap("Importance")
        private Integer importance;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpListString")
        private String ipListString;

        @com.aliyun.core.annotation.NameInMap("Kernel")
        private String kernel;

        @com.aliyun.core.annotation.NameInMap("LastLoginTimestamp")
        private Long lastLoginTimestamp;

        @com.aliyun.core.annotation.NameInMap("MacListString")
        private String macListString;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsName")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("PodCount")
        private Integer podCount;

        @com.aliyun.core.annotation.NameInMap("PostPaidFlag")
        private Integer postPaidFlag;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private String riskCount;

        @com.aliyun.core.annotation.NameInMap("RiskStatus")
        private String riskStatus;

        @com.aliyun.core.annotation.NameInMap("SafeEventCount")
        private Integer safeEventCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagResources")
        private String tagResources;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        @com.aliyun.core.annotation.NameInMap("VendorName")
        private String vendorName;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        @com.aliyun.core.annotation.NameInMap("VulStatus")
        private String vulStatus;

        private Instances(Builder builder) {
            this.alarmStatus = builder.alarmStatus;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.assetType = builder.assetType;
            this.assetTypeName = builder.assetTypeName;
            this.authModifyTime = builder.authModifyTime;
            this.authVersion = builder.authVersion;
            this.authVersionName = builder.authVersionName;
            this.bind = builder.bind;
            this.clientStatus = builder.clientStatus;
            this.clientSubStatus = builder.clientSubStatus;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.cores = builder.cores;
            this.cpuInfo = builder.cpuInfo;
            this.createdTime = builder.createdTime;
            this.exposedStatus = builder.exposedStatus;
            this.flag = builder.flag;
            this.flagName = builder.flagName;
            this.groupId = builder.groupId;
            this.groupTrace = builder.groupTrace;
            this.hcStatus = builder.hcStatus;
            this.healthCheckCount = builder.healthCheckCount;
            this.importance = builder.importance;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.ipListString = builder.ipListString;
            this.kernel = builder.kernel;
            this.lastLoginTimestamp = builder.lastLoginTimestamp;
            this.macListString = builder.macListString;
            this.mem = builder.mem;
            this.os = builder.os;
            this.osName = builder.osName;
            this.podCount = builder.podCount;
            this.postPaidFlag = builder.postPaidFlag;
            this.region = builder.region;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.riskCount = builder.riskCount;
            this.riskStatus = builder.riskStatus;
            this.safeEventCount = builder.safeEventCount;
            this.status = builder.status;
            this.tag = builder.tag;
            this.tagId = builder.tagId;
            this.tagResources = builder.tagResources;
            this.uuid = builder.uuid;
            this.vendor = builder.vendor;
            this.vendorName = builder.vendorName;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vulCount = builder.vulCount;
            this.vulStatus = builder.vulStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return assetTypeName
         */
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        /**
         * @return authModifyTime
         */
        public Long getAuthModifyTime() {
            return this.authModifyTime;
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return authVersionName
         */
        public String getAuthVersionName() {
            return this.authVersionName;
        }

        /**
         * @return bind
         */
        public Boolean getBind() {
            return this.bind;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return clientSubStatus
         */
        public String getClientSubStatus() {
            return this.clientSubStatus;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return cpuInfo
         */
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return exposedStatus
         */
        public Integer getExposedStatus() {
            return this.exposedStatus;
        }

        /**
         * @return flag
         */
        public Integer getFlag() {
            return this.flag;
        }

        /**
         * @return flagName
         */
        public String getFlagName() {
            return this.flagName;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupTrace
         */
        public String getGroupTrace() {
            return this.groupTrace;
        }

        /**
         * @return hcStatus
         */
        public String getHcStatus() {
            return this.hcStatus;
        }

        /**
         * @return healthCheckCount
         */
        public Integer getHealthCheckCount() {
            return this.healthCheckCount;
        }

        /**
         * @return importance
         */
        public Integer getImportance() {
            return this.importance;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipListString
         */
        public String getIpListString() {
            return this.ipListString;
        }

        /**
         * @return kernel
         */
        public String getKernel() {
            return this.kernel;
        }

        /**
         * @return lastLoginTimestamp
         */
        public Long getLastLoginTimestamp() {
            return this.lastLoginTimestamp;
        }

        /**
         * @return macListString
         */
        public String getMacListString() {
            return this.macListString;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return podCount
         */
        public Integer getPodCount() {
            return this.podCount;
        }

        /**
         * @return postPaidFlag
         */
        public Integer getPostPaidFlag() {
            return this.postPaidFlag;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return riskCount
         */
        public String getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return safeEventCount
         */
        public Integer getSafeEventCount() {
            return this.safeEventCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return tagResources
         */
        public String getTagResources() {
            return this.tagResources;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        /**
         * @return vendorName
         */
        public String getVendorName() {
            return this.vendorName;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        /**
         * @return vulStatus
         */
        public String getVulStatus() {
            return this.vulStatus;
        }

        public static final class Builder {
            private String alarmStatus; 
            private String appId; 
            private String appName; 
            private String assetType; 
            private String assetTypeName; 
            private Long authModifyTime; 
            private Integer authVersion; 
            private String authVersionName; 
            private Boolean bind; 
            private String clientStatus; 
            private String clientSubStatus; 
            private String clusterId; 
            private String clusterName; 
            private Integer cores; 
            private String cpuInfo; 
            private Long createdTime; 
            private Integer exposedStatus; 
            private Integer flag; 
            private String flagName; 
            private Long groupId; 
            private String groupTrace; 
            private String hcStatus; 
            private Integer healthCheckCount; 
            private Integer importance; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String ipListString; 
            private String kernel; 
            private Long lastLoginTimestamp; 
            private String macListString; 
            private Integer mem; 
            private String os; 
            private String osName; 
            private Integer podCount; 
            private Integer postPaidFlag; 
            private String region; 
            private String regionId; 
            private String regionName; 
            private String riskCount; 
            private String riskStatus; 
            private Integer safeEventCount; 
            private String status; 
            private String tag; 
            private String tagId; 
            private String tagResources; 
            private String uuid; 
            private Integer vendor; 
            private String vendorName; 
            private String vpcInstanceId; 
            private Integer vulCount; 
            private String vulStatus; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.alarmStatus = model.alarmStatus;
                this.appId = model.appId;
                this.appName = model.appName;
                this.assetType = model.assetType;
                this.assetTypeName = model.assetTypeName;
                this.authModifyTime = model.authModifyTime;
                this.authVersion = model.authVersion;
                this.authVersionName = model.authVersionName;
                this.bind = model.bind;
                this.clientStatus = model.clientStatus;
                this.clientSubStatus = model.clientSubStatus;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.cores = model.cores;
                this.cpuInfo = model.cpuInfo;
                this.createdTime = model.createdTime;
                this.exposedStatus = model.exposedStatus;
                this.flag = model.flag;
                this.flagName = model.flagName;
                this.groupId = model.groupId;
                this.groupTrace = model.groupTrace;
                this.hcStatus = model.hcStatus;
                this.healthCheckCount = model.healthCheckCount;
                this.importance = model.importance;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.ip = model.ip;
                this.ipListString = model.ipListString;
                this.kernel = model.kernel;
                this.lastLoginTimestamp = model.lastLoginTimestamp;
                this.macListString = model.macListString;
                this.mem = model.mem;
                this.os = model.os;
                this.osName = model.osName;
                this.podCount = model.podCount;
                this.postPaidFlag = model.postPaidFlag;
                this.region = model.region;
                this.regionId = model.regionId;
                this.regionName = model.regionName;
                this.riskCount = model.riskCount;
                this.riskStatus = model.riskStatus;
                this.safeEventCount = model.safeEventCount;
                this.status = model.status;
                this.tag = model.tag;
                this.tagId = model.tagId;
                this.tagResources = model.tagResources;
                this.uuid = model.uuid;
                this.vendor = model.vendor;
                this.vendorName = model.vendorName;
                this.vpcInstanceId = model.vpcInstanceId;
                this.vulCount = model.vulCount;
                this.vulStatus = model.vulStatus;
            } 

            /**
             * <p>Indicates whether alerts are generated on the asset. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * <blockquote>
             * <p> This parameter is available only when the <strong>Vendor</strong> parameter is set to 9.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * <blockquote>
             * <p> This parameter is available only when the <strong>Vendor</strong> parameter is set to 9.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testAppName</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an ECS instance</li>
             * <li><strong>1</strong>: a Server Load Balancer (SLB) instance</li>
             * <li><strong>2</strong>: a Network Address Translation (NAT) gateway</li>
             * <li><strong>3</strong>: an ApsaraDB RDS instance</li>
             * <li><strong>4</strong>: an ApsaraDB for MongoDB instance</li>
             * <li><strong>5</strong>: an ApsaraDB for Redis instance</li>
             * <li><strong>6</strong>: a container image</li>
             * <li><strong>7</strong>: a container</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The name of the asset type.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service</p>
             */
            public Builder assetTypeName(String assetTypeName) {
                this.assetTypeName = assetTypeName;
                return this;
            }

            /**
             * <p>The timestamp when Security Center is authorized to scan the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1627974044000</p>
             */
            public Builder authModifyTime(Long authModifyTime) {
                this.authModifyTime = authModifyTime;
                return this;
            }

            /**
             * <p>The edition of Security Center that is authorized to scan the asset. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Basic edition</li>
             * <li><strong>6</strong>: Anti-virus edition</li>
             * <li><strong>5</strong>: Advanced edition</li>
             * <li><strong>3</strong>: Enterprise edition</li>
             * <li><strong>7</strong>: Ultimate edition</li>
             * <li><strong>10</strong>: Value-added Plan edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>The name of the Security Center edition that is authorized to protect the asset. Valid values:</p>
             * <ul>
             * <li>Basic edition</li>
             * <li>Anti-virus edition</li>
             * <li>Advanced edition</li>
             * <li>Enterprise edition</li>
             * <li>Ultimate edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ultimate Edition</p>
             */
            public Builder authVersionName(String authVersionName) {
                this.authVersionName = authVersionName;
                return this;
            }

            /**
             * <p>Indicates whether Security Center is authorized to scan the asset. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Security Center is authorized to scan the asset.</li>
             * <li><strong>false</strong>: Security Center is not authorized to scan the asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>The status of the Security Center agent installed on the asset. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: The Security Center agent is <strong>enabled</strong>.</li>
             * <li><strong>offline</strong>: The Security Center agent is <strong>disabled</strong>.</li>
             * <li><strong>pause</strong>: The Security Center agent is <strong>suspended</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The sub-status of the Security Center agent installed on the asset. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: The Security Center agent is <strong>enabled</strong>.</li>
             * <li><strong>offline</strong>: The Security Center agent is <strong>disabled</strong>.</li>
             * <li><strong>pause</strong>: The Security Center agent is <strong>suspended</strong>.</li>
             * <li><strong>uninstalled</strong>: The Security Center agent is <strong>uninstalled</strong>.</li>
             * <li><strong>stopped</strong>: The Security Center agent is <strong>stopped</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder clientSubStatus(String clientSubStatus) {
                this.clientSubStatus = clientSubStatus;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c690a0789419f4284a4e0a29e12fe****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster1</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The number of the CPU cores used by the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The CPU information about the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Intel(R) Xeon(R) Platinum 8269CY CPU @ 2.50GHz</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1607365213000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Indicates whether the asset is exposed. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The asset is not exposed.</li>
             * <li><strong>1</strong>: The asset is exposed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exposedStatus(Integer exposedStatus) {
                this.exposedStatus = exposedStatus;
                return this;
            }

            /**
             * <p>Indicates whether the asset is an Alibaba Cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The asset is an Alibaba Cloud asset.</li>
             * <li><strong>1</strong>: The asset is not an Alibaba Cloud asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The service provider of the asset. Valid values:</p>
             * <ul>
             * <li><strong>ALIYUN</strong></li>
             * <li><strong>OUT</strong></li>
             * <li><strong>IDC</strong></li>
             * <li><strong>Tencent</strong></li>
             * <li><strong>HUAWEICLOUD</strong></li>
             * <li><strong>Azure</strong></li>
             * <li><strong>AWS</strong></li>
             * <li><strong>ASK</strong></li>
             * <li><strong>TRIPARTITE</strong></li>
             * <li><strong>SAE</strong></li>
             * <li><strong>PAI</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASK</p>
             */
            public Builder flagName(String flagName) {
                this.flagName = flagName;
                return this;
            }

            /**
             * <p>The ID of the asset group to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>4120080</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the group to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder groupTrace(String groupTrace) {
                this.groupTrace = groupTrace;
                return this;
            }

            /**
             * <p>Indicates whether baseline risks are detected on the asset. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * <p>The number of baseline risks that are detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder healthCheckCount(Integer healthCheckCount) {
                this.healthCheckCount = healthCheckCount;
                return this;
            }

            /**
             * <p>The importance of the asset. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: an important asset</li>
             * <li><strong>1</strong>: a common asset</li>
             * <li><strong>0</strong>: a test asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * <p>The ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>yztest-l***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The public IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The IP addresses of the system.</p>
             * 
             * <strong>example:</strong>
             * <p>172.31.XX.XX,172.171.XX.XX</p>
             */
            public Builder ipListString(String ipListString) {
                this.ipListString = ipListString;
                return this;
            }

            /**
             * <p>The version of the kernel.</p>
             * 
             * <strong>example:</strong>
             * <p>3.10.0-1127.19.1.el7.x86_64</p>
             */
            public Builder kernel(String kernel) {
                this.kernel = kernel;
                return this;
            }

            /**
             * <p>The timestamp when the Security Center agent was last online. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637592907000</p>
             */
            public Builder lastLoginTimestamp(Long lastLoginTimestamp) {
                this.lastLoginTimestamp = lastLoginTimestamp;
                return this;
            }

            /**
             * <p>The MAC addresses of the system.</p>
             * 
             * <strong>example:</strong>
             * <p>00:13:3e:31:13:39,02:12:67:b8:<strong>:</strong></p>
             */
            public Builder macListString(String macListString) {
                this.macListString = macListString;
                return this;
            }

            /**
             * <p>The size of the memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The operating system of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The kernel version of the asset.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>The number of pods.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>The billing method of the protection version currently bound to the asset. Values: - <strong>0</strong>: Subscription - <strong>1</strong>: Pay-as-you-go</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder postPaidFlag(Integer postPaidFlag) {
                this.postPaidFlag = postPaidFlag;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-cm***-***</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the region in which the asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hanghzou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region in which the asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The total number of baseline risks that are detected on the asset. The value of this parameter is in the JSON format and contains the following fields:</p>
             * <ul>
             * <li><strong>account</strong>: the number of accounts that are used to log on from unapproved logon locations and whose passwords are cracked</li>
             * <li><strong>appNum</strong>: the number of scanners</li>
             * <li><strong>asapVulCount</strong>: the total number of high-severity vulnerabilities</li>
             * <li><strong>baselineHigh</strong>: the number of high-risk baseline risks</li>
             * <li><strong>baselineLow</strong>: the number of low-risk baseline risks</li>
             * <li><strong>baselineMedium</strong>: the number of medium-risk baseline risks</li>
             * <li><strong>baselineNum</strong>: the total number of baseline risks</li>
             * <li><strong>cmsNum</strong>: the number of Web-CMS vulnerabilities</li>
             * <li><strong>containerAsap</strong>: the number of high-severity vulnerabilities that are detected on containers</li>
             * <li><strong>containerLater</strong>: the number of medium-severity vulnerabilities that are detected on containers</li>
             * <li><strong>containerNntf</strong>: the number of low-severity vulnerabilities that are detected on containers</li>
             * <li><strong>containerRemind</strong>: the number of alerts whose Emergency level is Reminder on containers</li>
             * <li><strong>containerSerious</strong>: the number of alerts Emergency level is Urgent on containers</li>
             * <li><strong>containerSuspicious</strong>: the number of alerts whose Emergency level is Suspicious on containers</li>
             * <li><strong>cveNum</strong>: the number of Linux software vulnerabilities</li>
             * <li><strong>emgNum</strong>: the number of urgent vulnerabilities</li>
             * <li><strong>health</strong>: the number of baseline alerts that are unhandled</li>
             * <li><strong>imageBaselineHigh</strong>: the number of high-risk baseline risks that are detected on images</li>
             * <li><strong>imageBaselineLow</strong>: the number of low-risk baseline risks that are detected on images</li>
             * <li><strong>imageBaselineMedium</strong>: the number of medium-risk baseline risks that are detected on images</li>
             * <li><strong>imageBaselineNum</strong>: the total number of baseline risks that are detected on images</li>
             * <li><strong>imageMaliciousFileRemind</strong>: the number of malicious files that are detected on images and have the Emergency level of Reminder</li>
             * <li><strong>imageMaliciousFileSerious</strong>: the number of malicious files that are detected on images and have the Emergency level of Urgent</li>
             * <li><strong>imageMaliciousFileSuspicious</strong>: the number of malicious files that are detected on images and have the Emergency level of Suspicious</li>
             * <li><strong>imageVulAsap</strong>: the number of high-severity vulnerabilities that are detected on images</li>
             * <li><strong>imageVulLater</strong>: the number of medium-severity vulnerabilities that are detected on an image</li>
             * <li><strong>imageVulNntf</strong>: the number of low-severity vulnerabilities that are detected on an image</li>
             * <li><strong>laterVulCount</strong>: the number of medium-severity vulnerabilities</li>
             * <li><strong>newSuspicious</strong>: the number of alerts</li>
             * <li><strong>nntfVulCount</strong>: the number of low-severity vulnerabilities.</li>
             * <li><strong>remindNum</strong>: the number of alerts whose Emergency level is Reminder</li>
             * <li><strong>scaNum</strong>: the number of vulnerabilities that are detected based on software component analysis</li>
             * <li><strong>seriousNum</strong>: the number of alerts whose Emergency level is Urgent</li>
             * <li><strong>suspNum</strong>: the number of alerts whose Emergency level is Suspicious</li>
             * <li><strong>suspicious</strong>: the total number of alerts</li>
             * <li><strong>sysNum</strong>: the number of Windows system vulnerabilities</li>
             * <li><strong>trojan</strong>: the number of trojans</li>
             * <li><strong>uuid</strong>: the UUIDs of assets</li>
             * <li><strong>vul</strong>: the number of vulnerabilities</li>
             * <li><strong>weakPWNum</strong>: the number of weak passwords</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;account&quot;:0,&quot;appNum&quot;:0,&quot;asapVulCount&quot;:0,&quot;baselineHigh&quot;:0,&quot;baselineLow&quot;:0,&quot;baselineMedium&quot;:0,&quot;baselineNum&quot;:0,&quot;cmsNum&quot;:0,&quot;containerAsap&quot;:0,&quot;containerLater&quot;:0,&quot;containerNntf&quot;:0,&quot;containerRemind&quot;:0,&quot;containerSerious&quot;:0,&quot;containerSuspicious&quot;:0,&quot;cveNum&quot;:0,&quot;emgNum&quot;:0,&quot;health&quot;:0,&quot;imageBaselineHigh&quot;:0,&quot;imageBaselineLow&quot;:0,&quot;imageBaselineMedium&quot;:0,&quot;imageBaselineNum&quot;:0,&quot;imageMaliciousFileRemind&quot;:0,&quot;imageMaliciousFileSerious&quot;:0,&quot;imageMaliciousFileSuspicious&quot;:0,&quot;imageVulAsap&quot;:0,&quot;imageVulLater&quot;:0,&quot;imageVulNntf&quot;:0,&quot;laterVulCount&quot;:0,&quot;newSuspicious&quot;:0,&quot;nntfVulCount&quot;:0,&quot;remindNum&quot;:0,&quot;scaNum&quot;:0,&quot;seriousNum&quot;:0,&quot;suspNum&quot;:0,&quot;suspicious&quot;:0,&quot;sysNum&quot;:0,&quot;trojan&quot;:0,&quot;uuid&quot;:&quot;inet-37316411-37fe-4b72-b245-346a2721d4b6&quot;,&quot;vul&quot;:0,&quot;weakPWNum&quot;:0}</p>
             */
            public Builder riskCount(String riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>Indicates whether risks are detected on the asset. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>The number of alerts that are generated on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder safeEventCount(Integer safeEventCount) {
                this.safeEventCount = safeEventCount;
                return this;
            }

            /**
             * <p>The status of the asset. Valid values:</p>
             * <ul>
             * <li><strong>Running</strong>: running</li>
             * <li><strong>notRunning</strong>: stopped</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the asset tag.</p>
             * 
             * <strong>example:</strong>
             * <p>InternetIp,test</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The ID of the asset tag.</p>
             * 
             * <strong>example:</strong>
             * <p>121313,41412</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The custom tag added to the Lingjun node. This parameter is returned only for LINGJUN GPU-accelerated instances.</p>
             * 
             * <strong>example:</strong>
             * <p>app:test,type:lingjun</p>
             */
            public Builder tagResources(String tagResources) {
                this.tagResources = tagResources;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>c9107c04-942f-40c1-981a-f1c1***</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The service provider of the asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: an asset outside Alibaba Cloud</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: an asset from a third-party cloud service provider</li>
             * <li><strong>8</strong>: a lightweight asset</li>
             * <li><strong>9</strong>: a SAE instance</li>
             * <li><strong>10</strong>: an instance in PAI</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The name of the service provider for the asset.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>ALIYUN</strong>: Alibaba Cloud</li>
             * <li><strong>OUT</strong>: a third-party service provider</li>
             * <li><strong>IDC</strong>: a data center</li>
             * <li><strong>TENCENT</strong>: Tencent Cloud</li>
             * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
             * <li><strong>Microsoft</strong>: Microsoft Azure</li>
             * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
             * <li><strong>TRIPARTITE</strong>: a lightweight server</li>
             * <li><strong>SAE</strong>: a SAE instance</li>
             * <li><strong>PAI</strong>: an instance in PAI</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Tencent</p>
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf60agqq65bs98zoo****</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that are detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * <p>Indicates whether vulnerabilities are detected on the asset. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder vulStatus(String vulStatus) {
                this.vulStatus = vulStatus;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudCenterInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudCenterInstancesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.nextToken = builder.nextToken;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private String nextToken; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.nextToken = model.nextToken;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The value of NextToken that is returned when the NextToken method is used.</p>
             * 
             * <strong>example:</strong>
             * <p>B604532DEF982B875E8360A6EFA3B***</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
