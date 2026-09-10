// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCloudCenterInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCloudCenterInstancesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status of the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of instance details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1B4C9A14-94E6-5EEB-BF39-7DACCE9AC0D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
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

        @com.aliyun.core.annotation.NameInMap("BindFileProtectType")
        private String bindFileProtectType;

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

        @com.aliyun.core.annotation.NameInMap("HasContainer")
        private String hasContainer;

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
        private String mem;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

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
        private String safeEventCount;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

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

        @com.aliyun.core.annotation.NameInMap("VendorUid")
        private String vendorUid;

        @com.aliyun.core.annotation.NameInMap("VendorUserName")
        private String vendorUserName;

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
            this.bindFileProtectType = builder.bindFileProtectType;
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
            this.hasContainer = builder.hasContainer;
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
            this.namespace = builder.namespace;
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
            this.serviceId = builder.serviceId;
            this.status = builder.status;
            this.tag = builder.tag;
            this.tagId = builder.tagId;
            this.tagResources = builder.tagResources;
            this.uuid = builder.uuid;
            this.vendor = builder.vendor;
            this.vendorName = builder.vendorName;
            this.vendorUid = builder.vendorUid;
            this.vendorUserName = builder.vendorUserName;
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
         * @return bindFileProtectType
         */
        public String getBindFileProtectType() {
            return this.bindFileProtectType;
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
         * @return hasContainer
         */
        public String getHasContainer() {
            return this.hasContainer;
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
        public String getMem() {
            return this.mem;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
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
        public String getSafeEventCount() {
            return this.safeEventCount;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
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
         * @return vendorUid
         */
        public String getVendorUid() {
            return this.vendorUid;
        }

        /**
         * @return vendorUserName
         */
        public String getVendorUserName() {
            return this.vendorUserName;
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
            private String bindFileProtectType; 
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
            private String hasContainer; 
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
            private String mem; 
            private String namespace; 
            private String os; 
            private String osName; 
            private Integer podCount; 
            private Integer postPaidFlag; 
            private String region; 
            private String regionId; 
            private String regionName; 
            private String riskCount; 
            private String riskStatus; 
            private String safeEventCount; 
            private String serviceId; 
            private String status; 
            private String tag; 
            private String tagId; 
            private String tagResources; 
            private String uuid; 
            private Integer vendor; 
            private String vendorName; 
            private String vendorUid; 
            private String vendorUserName; 
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
                this.bindFileProtectType = model.bindFileProtectType;
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
                this.hasContainer = model.hasContainer;
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
                this.namespace = model.namespace;
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
                this.serviceId = model.serviceId;
                this.status = model.status;
                this.tag = model.tag;
                this.tagId = model.tagId;
                this.tagResources = model.tagResources;
                this.uuid = model.uuid;
                this.vendor = model.vendor;
                this.vendorName = model.vendorName;
                this.vendorUid = model.vendorUid;
                this.vendorUserName = model.vendorUserName;
                this.vpcInstanceId = model.vpcInstanceId;
                this.vulCount = model.vulCount;
                this.vulStatus = model.vulStatus;
            } 

            /**
             * <p>Indicates whether the image has security alerts. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>FC2U0JVHWS49S2OT</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>guokent</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The type of the asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The name of the asset type.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder assetTypeName(String assetTypeName) {
                this.assetTypeName = assetTypeName;
                return this;
            }

            /**
             * <p>The timestamp when the asset was bound for authorization. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1627974044000</p>
             */
            public Builder authModifyTime(Long authModifyTime) {
                this.authModifyTime = authModifyTime;
                return this;
            }

            /**
             * <p>The authorization version of the asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>The authorization version name of the asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Free Edition.</p>
             */
            public Builder authVersionName(String authVersionName) {
                this.authVersionName = authVersionName;
                return this;
            }

            /**
             * <p>Indicates whether the asset is bound with authorization. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>Indicates whether web tamper-proofing authorization is bound. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder bindFileProtectType(String bindFileProtectType) {
                this.bindFileProtectType = bindFileProtectType;
                return this;
            }

            /**
             * <p>The online status of the client on the instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The sub-status of the client on the instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder clientSubStatus(String clientSubStatus) {
                this.clientSubStatus = clientSubStatus;
                return this;
            }

            /**
             * <p>The ID of the cluster where the resource group resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cb703cb0ba6bd40d4a6d8de5bff050fb9</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>auto-cn-heyuan</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The number of CPU cores of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The CPU information of the asset.</p>
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
             * <p>The exposure status of the asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exposedStatus(Integer exposedStatus) {
                this.exposedStatus = exposedStatus;
                return this;
            }

            /**
             * <p>The asset vendor. Separate multiple asset vendors with commas (,). Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0,1,2</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The vendor of the asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder flagName(String flagName) {
                this.flagName = flagName;
                return this;
            }

            /**
             * <p>The ID of the group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>86d30f8b0e124aadb7ef3197f9dbd1f5</p>
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
             * <p>Indicates whether the asset contains containers. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder hasContainer(String hasContainer) {
                this.hasContainer = hasContainer;
                return this;
            }

            /**
             * <p>Indicates whether baseline risks are detected on the instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * <p>The number of baseline risks on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder healthCheckCount(Integer healthCheckCount) {
                this.healthCheckCount = healthCheckCount;
                return this;
            }

            /**
             * <p>The importance level of the asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ls-cn-tl32rf**008</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>ra-supabase-22u1iv3hr**5v9</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>47.1**.52.125</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the current server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.1**.245</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The management IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>114.55.*4.*6</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The list of IP addresses of the system.</p>
             * 
             * <strong>example:</strong>
             * <p>172.31.XX.XX,172.171.XX.XX</p>
             */
            public Builder ipListString(String ipListString) {
                this.ipListString = ipListString;
                return this;
            }

            /**
             * <p>The kernel version information.</p>
             * 
             * <strong>example:</strong>
             * <p>3.10.0-1127.19.1.el7.x86_64</p>
             */
            public Builder kernel(String kernel) {
                this.kernel = kernel;
                return this;
            }

            /**
             * <p>The timestamp when the client last went online. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637592907000</p>
             */
            public Builder lastLoginTimestamp(Long lastLoginTimestamp) {
                this.lastLoginTimestamp = lastLoginTimestamp;
                return this;
            }

            /**
             * <p>The MAC address of the system.</p>
             * 
             * <strong>example:</strong>
             * <p>00:13:3e:31:13:39,02:12:67:b8:<strong>:</strong></p>
             */
            public Builder macListString(String macListString) {
                this.macListString = macListString;
                return this;
            }

            /**
             * <p>The total memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder mem(String mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>slsshpcorlsmetrics</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The operating system of the instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The kernel version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>AliOS7U2-x86-64</p>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>The number of pods.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>The billing method of the protection edition bound to the current asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder postPaidFlag(Integer postPaidFlag) {
                this.postPaidFlag = postPaidFlag;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhouxxxx</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the region where the asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The region name.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The statistics of risk items on the asset. The value is in JSON format and contains the following fields:</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;account&quot;: 0,
             *       &quot;appNum&quot;: 0,
             *       &quot;asapVulCount&quot;: 0,
             *       &quot;baselineHigh&quot;: 0,
             *       &quot;baselineLow&quot;: 0,
             *       &quot;baselineMedium&quot;: 0,
             *       &quot;baselineNum&quot;: 0,
             *       &quot;cmsNum&quot;: 0,
             *       &quot;containerAsap&quot;: 0,
             *       &quot;containerLater&quot;: 0,
             *       &quot;containerNntf&quot;: 0,
             *       &quot;containerRemind&quot;: 0,
             *       &quot;containerSerious&quot;: 0,
             *       &quot;containerSuspicious&quot;: 0,
             *       &quot;cveNum&quot;: 0,
             *       &quot;emgNum&quot;: 0,
             *       &quot;health&quot;: 0,
             *       &quot;imageBaselineHigh&quot;: 0,
             *       &quot;imageBaselineLow&quot;: 0,
             *       &quot;imageBaselineMedium&quot;: 0,
             *       &quot;imageBaselineNum&quot;: 0,
             *       &quot;imageMaliciousFileRemind&quot;: 0,
             *       &quot;imageMaliciousFileSerious&quot;: 0,
             *       &quot;imageMaliciousFileSuspicious&quot;: 0,
             *       &quot;imageVulAsap&quot;: 0,
             *       &quot;imageVulLater&quot;: 0,
             *       &quot;imageVulNntf&quot;: 0,
             *       &quot;laterVulCount&quot;: 0,
             *       &quot;newSuspicious&quot;: 0,
             *       &quot;nntfVulCount&quot;: 0,
             *       &quot;remindNum&quot;: 0,
             *       &quot;scaNum&quot;: 0,
             *       &quot;seriousNum&quot;: 0,
             *       &quot;suspNum&quot;: 0,
             *       &quot;suspicious&quot;: 0,
             *       &quot;sysNum&quot;: 0,
             *       &quot;trojan&quot;: 0,
             *       &quot;uuid&quot;: &quot;inet-37316411-37fe-4b72-b245-346a2721****&quot;,
             *       &quot;vul&quot;: 0,
             *       &quot;weakPWNum&quot;: 0
             * }</p>
             */
            public Builder riskCount(String riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>Indicates whether risks exist. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>The number of security alerts on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder safeEventCount(String safeEventCount) {
                this.safeEventCount = safeEventCount;
                return this;
            }

            /**
             * <p>The service ID. This parameter has a value only when the instance is a serverless instance that belongs to the PAI platform.</p>
             * 
             * <strong>example:</strong>
             * <p>dsw-76jlywunsif09bp15p</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The running status of the instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag name of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pre_20250714_idpt_adjust</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The tag ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>d8586ab8be4549e3815995858d277763</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The custom tags of the Lingjun node. This parameter is returned only when the machine is a Lingjun machine.</p>
             * 
             * <strong>example:</strong>
             * <p>app:test,type:lingjun</p>
             */
            public Builder tagResources(String tagResources) {
                this.tagResources = tagResources;
                return this;
            }

            /**
             * <p>The UUID of the terminal device.</p>
             * 
             * <strong>example:</strong>
             * <p>1f0459ee-ed49-6484-8958-4f10f61e6362</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The vendor of the asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The service provider name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>IDC</p>
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            /**
             * <p>The account ID of the multi-cloud instance.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder vendorUid(String vendorUid) {
                this.vendorUid = vendorUid;
                return this;
            }

            /**
             * <p>The account name of the multi-cloud instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VendorUserName</p>
             */
            public Builder vendorUserName(String vendorUserName) {
                this.vendorUserName = vendorUserName;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zek7v0z4r6lbp02xckei</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * <p>The number of vulnerabilities on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * <p>Indicates whether vulnerabilities exist on the instance. Valid values:</p>
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
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The maximum number of rows per page in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The NextToken value returned when the NextToken method is used.</p>
             * 
             * <strong>example:</strong>
             * <p>m1NGAAAAAABzLzIwMjQwMg==</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeCloudCenterInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudCenterInstancesResponseBody</p>
     */
    public static class DataBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List<Instances> instances;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private DataBody(Builder builder) {
            this.instances = builder.instances;
            this.pageInfo = builder.pageInfo;
            this.requestId = builder.requestId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBody create() {
            return builder().build();
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

            private Builder(DataBody model) {
                this.instances = model.instances;
                this.pageInfo = model.pageInfo;
                this.requestId = model.requestId;
                this.success = model.success;
            } 

            /**
             * <p>The list of asset details.</p>
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
             * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
             * 
             * <strong>example:</strong>
             * <p>20EBDE7B-AA36-5D60-9DCA-151C48EDB9F8</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>Indicates whether the call was successful. Valid values:</p>
             * <ul>
             * <li>true: The call was successful.</li>
             * <li>false: The call failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudCenterInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudCenterInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private DataBody body;

        private Data(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public DataBody getBody() {
            return this.body;
        }

        public static final class Builder {
            private DataBody body; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
            } 

            /**
             * <p>The string of the message body content encoded by using the Base64 algorithm.</p>
             */
            public Builder body(DataBody body) {
                this.body = body;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
