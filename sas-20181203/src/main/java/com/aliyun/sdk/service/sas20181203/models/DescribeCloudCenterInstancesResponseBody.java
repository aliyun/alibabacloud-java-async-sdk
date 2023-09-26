// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudCenterInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudCenterInstancesResponseBody</p>
 */
public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
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
        private java.util.List < Instances> instances; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * An array that consists of the details about the asset.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   **true**: The call is successful.
         * *   **false**: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudCenterInstancesResponseBody build() {
            return new DescribeCloudCenterInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("AssetType")
        private String assetType;

        @NameInMap("AuthModifyTime")
        private Long authModifyTime;

        @NameInMap("AuthVersion")
        private Integer authVersion;

        @NameInMap("AuthVersionName")
        private String authVersionName;

        @NameInMap("Bind")
        private Boolean bind;

        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("CpuInfo")
        private String cpuInfo;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("ExposedStatus")
        private Integer exposedStatus;

        @NameInMap("Flag")
        private Integer flag;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("GroupTrace")
        private String groupTrace;

        @NameInMap("HcStatus")
        private String hcStatus;

        @NameInMap("HealthCheckCount")
        private Integer healthCheckCount;

        @NameInMap("Importance")
        private Integer importance;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("IpListString")
        private String ipListString;

        @NameInMap("Kernel")
        private String kernel;

        @NameInMap("LastLoginTimestamp")
        private Long lastLoginTimestamp;

        @NameInMap("MacListString")
        private String macListString;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("Os")
        private String os;

        @NameInMap("OsName")
        private String osName;

        @NameInMap("PodCount")
        private Integer podCount;

        @NameInMap("Region")
        private String region;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("RiskCount")
        private String riskCount;

        @NameInMap("RiskStatus")
        private String riskStatus;

        @NameInMap("SafeEventCount")
        private Integer safeEventCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("TagId")
        private String tagId;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("Vendor")
        private Integer vendor;

        @NameInMap("VendorName")
        private String vendorName;

        @NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        @NameInMap("VulCount")
        private Integer vulCount;

        @NameInMap("VulStatus")
        private String vulStatus;

        private Instances(Builder builder) {
            this.alarmStatus = builder.alarmStatus;
            this.assetType = builder.assetType;
            this.authModifyTime = builder.authModifyTime;
            this.authVersion = builder.authVersion;
            this.authVersionName = builder.authVersionName;
            this.bind = builder.bind;
            this.clientStatus = builder.clientStatus;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.cores = builder.cores;
            this.cpuInfo = builder.cpuInfo;
            this.createdTime = builder.createdTime;
            this.exposedStatus = builder.exposedStatus;
            this.flag = builder.flag;
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
            this.region = builder.region;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.riskCount = builder.riskCount;
            this.riskStatus = builder.riskStatus;
            this.safeEventCount = builder.safeEventCount;
            this.status = builder.status;
            this.tag = builder.tag;
            this.tagId = builder.tagId;
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
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
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
            private String assetType; 
            private Long authModifyTime; 
            private Integer authVersion; 
            private String authVersionName; 
            private Boolean bind; 
            private String clientStatus; 
            private String clusterId; 
            private String clusterName; 
            private Integer cores; 
            private String cpuInfo; 
            private Long createdTime; 
            private Integer exposedStatus; 
            private Integer flag; 
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
            private String region; 
            private String regionId; 
            private String regionName; 
            private String riskCount; 
            private String riskStatus; 
            private Integer safeEventCount; 
            private String status; 
            private String tag; 
            private String tagId; 
            private String uuid; 
            private Integer vendor; 
            private String vendorName; 
            private String vpcInstanceId; 
            private Integer vulCount; 
            private String vulStatus; 

            /**
             * Indicates whether alerts are generated on the asset. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   **0**: an ECS instance
             * *   **1**: a Server Load Balancer (SLB) instance
             * *   **2**: a Network Address Translation (NAT) gateway
             * *   **3**: an ApsaraDB RDS instance
             * *   **4**: an ApsaraDB for MongoDB instance
             * *   **5**: an ApsaraDB for Redis instance
             * *   **6**: a container image
             * *   **7**: a container
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * The timestamp when Security Center is authorized to scan the asset.
             */
            public Builder authModifyTime(Long authModifyTime) {
                this.authModifyTime = authModifyTime;
                return this;
            }

            /**
             * The edition of Security Center that is authorized to scan the asset. Valid values:
             * <p>
             * 
             * *   **1**: Basic edition
             * *   **6**: Anti-virus edition
             * *   **5**: Advanced edition
             * *   **3**: Enterprise edition
             * *   **7**: Ultimate edition
             * *   **10**: Value-added Plan edition
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * The name of the Security Center edition that is authorized to scan the asset. Valid values:
             * <p>
             * 
             * *   Basic edition
             * *   Anti-virus edition
             * *   Advanced edition
             * *   Enterprise edition
             * *   Ultimate edition
             * *   Value-added Plan edition
             */
            public Builder authVersionName(String authVersionName) {
                this.authVersionName = authVersionName;
                return this;
            }

            /**
             * Indicates whether Security Center is authorized to scan the asset. Valid values:
             * <p>
             * 
             * *   **true**: Security Center is authorized to scan the asset.
             * *   **false**: Security Center is not authorized to scan the asset.
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * The status of the Security Center agent installed on the asset. Valid values:
             * <p>
             * 
             * *   **online**: The Security Center agent is **enabled**.
             * *   **offline**: The Security Center agent is **disabled**.
             * *   **pause**: The Security Center agent is **suspended**.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The number of the CPU cores used by the asset.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The CPU information about the asset.
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * The timestamp when the cluster was created. Unit: milliseconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Indicates whether the asset is exposed. Valid values:
             * <p>
             * 
             * *   **0**: The asset is not exposed.
             * *   **1**: The asset is exposed.
             */
            public Builder exposedStatus(Integer exposedStatus) {
                this.exposedStatus = exposedStatus;
                return this;
            }

            /**
             * Indicates whether the asset is an Alibaba Cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: The asset is an Alibaba Cloud asset.
             * *   **1**: The asset is not an Alibaba Cloud asset.
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The ID of the asset group to which the asset belongs.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the group to which the asset belongs.
             */
            public Builder groupTrace(String groupTrace) {
                this.groupTrace = groupTrace;
                return this;
            }

            /**
             * Indicates whether baseline risks are detected on the asset. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * The number of baseline risks that are detected on the asset.
             */
            public Builder healthCheckCount(Integer healthCheckCount) {
                this.healthCheckCount = healthCheckCount;
                return this;
            }

            /**
             * The importance of the asset. Valid values:
             * <p>
             * 
             * *   **2**: an important asset
             * *   **1**: a common asset
             * *   **0**: a test asset
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * The ID of the asset.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the asset.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the asset.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The public IP address of the asset.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The IP addresses of the system.
             */
            public Builder ipListString(String ipListString) {
                this.ipListString = ipListString;
                return this;
            }

            /**
             * The version of the kernel.
             */
            public Builder kernel(String kernel) {
                this.kernel = kernel;
                return this;
            }

            /**
             * The timestamp when the Security Center agent was last online. Unit: milliseconds.
             */
            public Builder lastLoginTimestamp(Long lastLoginTimestamp) {
                this.lastLoginTimestamp = lastLoginTimestamp;
                return this;
            }

            /**
             * The MAC addresses of the system.
             */
            public Builder macListString(String macListString) {
                this.macListString = macListString;
                return this;
            }

            /**
             * The size of the memory. Unit: MB.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The operating system of the asset.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * The kernel version of the asset.
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * The number of pods.
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * The region ID of the asset.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The ID of the region in which the asset resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the region in which the asset resides.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The total number of baseline risks that are detected on the asset. The value of this parameter is in the JSON format and contains the following fields:
             * <p>
             * 
             * *   **account**: the number of accounts that are used to log on from unapproved logon locations and whose passwords are cracked
             * *   **appNum**: the number of scanners
             * *   **asapVulCount**: the total number of high-severity vulnerabilities
             * *   **baselineHigh**: the number of high-risk baseline risks
             * *   **baselineLow**: the number of low-risk baseline risks
             * *   **baselineMedium**: the number of medium-risk baseline risks
             * *   **baselineNum**: the total number of baseline risks
             * *   **cmsNum**: the number of Web-CMS vulnerabilities
             * *   **containerAsap**: the number of high-severity vulnerabilities that are detected on containers
             * *   **containerLater**: the number of medium-severity vulnerabilities that are detected on containers
             * *   **containerNntf**: the number of low-severity vulnerabilities that are detected on containers
             * *   **containerRemind**: the number of alerts whose Emergency level is Reminder on containers
             * *   **containerSerious**: the number of alerts Emergency level is Urgent on containers
             * *   **containerSuspicious**: the number of alerts whose Emergency level is Suspicious on containers
             * *   **cveNum**: the number of Linux software vulnerabilities
             * *   **emgNum**: the number of urgent vulnerabilities
             * *   **health**: the number of baseline alerts that are unhandled
             * *   **imageBaselineHigh**: the number of high-risk baseline risks that are detected on images
             * *   **imageBaselineLow**: the number of low-risk baseline risks that are detected on images
             * *   **imageBaselineMedium**: the number of medium-risk baseline risks that are detected on images
             * *   **imageBaselineNum**: the total number of baseline risks that are detected on images
             * *   **imageMaliciousFileRemind**: the number of malicious files that are detected on images and have the Emergency level of Reminder
             * *   **imageMaliciousFileSerious**: the number of malicious files that are detected on images and have the Emergency level of Urgent
             * *   **imageMaliciousFileSuspicious**: the number of malicious files that are detected on images and have the Emergency level of Suspicious
             * *   **imageVulAsap**: the number of high-severity vulnerabilities that are detected on images
             * *   **imageVulLater**: the number of medium-severity vulnerabilities that are detected on an image
             * *   **imageVulNntf**: the number of low-severity vulnerabilities that are detected on an image
             * *   **laterVulCount**: the number of medium-severity vulnerabilities
             * *   **newSuspicious**: the number of alerts
             * *   **nntfVulCount**: the number of low-severity vulnerabilities.
             * *   **remindNum**: the number of alerts whose Emergency level is Reminder
             * *   **scaNum**: the number of vulnerabilities that are detected based on software component analysis
             * *   **seriousNum**: the number of alerts whose Emergency level is Urgent
             * *   **suspNum**: the number of alerts whose Emergency level is Suspicious
             * *   **suspicious**: the total number of alerts
             * *   **sysNum**: the number of Windows system vulnerabilities
             * *   **trojan**: the number of trojans
             * *   **uuid**: the UUIDs of assets
             * *   **vul**: the number of vulnerabilities
             * *   **weakPWNum**: the number of weak passwords
             */
            public Builder riskCount(String riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * Indicates whether risks are detected on the asset. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * The number of alerts that are generated on the asset.
             */
            public Builder safeEventCount(Integer safeEventCount) {
                this.safeEventCount = safeEventCount;
                return this;
            }

            /**
             * The status of the asset. Valid values:
             * <p>
             * 
             * *   **Running**: running
             * *   **notRunning**: stopped
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the asset tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The ID of the asset tag.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The type of the asset by source. Valid values:
             * <p>
             * 
             * *   **0**: an ECS instance.
             * *   **1**: a third-party cloud server.
             * *   **2**: a server in a data center.
             * *   **3**: a server deployed on Tencent Cloud. This value is returned only after the asset is protected by Security Center.
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * The name of the service provider (SP) for the asset.
             * <p>
             * 
             * Valid values:
             * 
             * *   **TENCENT**: Tencent Cloud
             * *   **ALIYUN**: Alibaba Cloud
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            /**
             * The ID of the VPC to which the asset belongs.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * The number of vulnerabilities that are detected on the asset.
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * Indicates whether vulnerabilities are detected on the asset. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
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
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * 使用NextToken方式下返回的NextToken值。
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **20**.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
