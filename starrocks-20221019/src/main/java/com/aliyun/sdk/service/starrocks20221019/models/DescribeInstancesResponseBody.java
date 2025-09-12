// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeInstancesResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("VswId")
        private String vswId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VSwitches(Builder builder) {
            this.primary = builder.primary;
            this.vswId = builder.vswId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean primary; 
            private String vswId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.primary = model.primary;
                this.vswId = model.vswId;
                this.zoneId = model.zoneId;
            } 

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * VswId.
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("EnableAutoMinorVersionUpgrade")
        private Boolean enableAutoMinorVersionUpgrade;

        @com.aliyun.core.annotation.NameInMap("EnableSSL")
        private Boolean enableSSL;

        @com.aliyun.core.annotation.NameInMap("EnabledAuditLoader")
        private Boolean enabledAuditLoader;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("IsolateLeader")
        private Boolean isolateLeader;

        @com.aliyun.core.annotation.NameInMap("KmsKeyId")
        private String kmsKeyId;

        @com.aliyun.core.annotation.NameInMap("MaintainablePeriod")
        private String maintainablePeriod;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("MonitorType")
        private String monitorType;

        @com.aliyun.core.annotation.NameInMap("OssLocation")
        private String ossLocation;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private String runMode;

        @com.aliyun.core.annotation.NameInMap("RunningTime")
        private Long runningTime;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupManaged")
        private Boolean securityGroupManaged;

        @com.aliyun.core.annotation.NameInMap("SgId")
        private String sgId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VSwitches")
        private java.util.List<VSwitches> vSwitches;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.aclId = builder.aclId;
            this.architecture = builder.architecture;
            this.beginTime = builder.beginTime;
            this.enableAutoMinorVersionUpgrade = builder.enableAutoMinorVersionUpgrade;
            this.enableSSL = builder.enableSSL;
            this.enabledAuditLoader = builder.enabledAuditLoader;
            this.encrypted = builder.encrypted;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.isolateLeader = builder.isolateLeader;
            this.kmsKeyId = builder.kmsKeyId;
            this.maintainablePeriod = builder.maintainablePeriod;
            this.minorVersion = builder.minorVersion;
            this.monitorType = builder.monitorType;
            this.ossLocation = builder.ossLocation;
            this.packageType = builder.packageType;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.runMode = builder.runMode;
            this.runningTime = builder.runningTime;
            this.securityGroupManaged = builder.securityGroupManaged;
            this.sgId = builder.sgId;
            this.tags = builder.tags;
            this.vSwitches = builder.vSwitches;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return enableAutoMinorVersionUpgrade
         */
        public Boolean getEnableAutoMinorVersionUpgrade() {
            return this.enableAutoMinorVersionUpgrade;
        }

        /**
         * @return enableSSL
         */
        public Boolean getEnableSSL() {
            return this.enableSSL;
        }

        /**
         * @return enabledAuditLoader
         */
        public Boolean getEnabledAuditLoader() {
            return this.enabledAuditLoader;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
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
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return isolateLeader
         */
        public Boolean getIsolateLeader() {
            return this.isolateLeader;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        /**
         * @return maintainablePeriod
         */
        public String getMaintainablePeriod() {
            return this.maintainablePeriod;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return monitorType
         */
        public String getMonitorType() {
            return this.monitorType;
        }

        /**
         * @return ossLocation
         */
        public String getOssLocation() {
            return this.ossLocation;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return runMode
         */
        public String getRunMode() {
            return this.runMode;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return securityGroupManaged
         */
        public Boolean getSecurityGroupManaged() {
            return this.securityGroupManaged;
        }

        /**
         * @return sgId
         */
        public String getSgId() {
            return this.sgId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vSwitches
         */
        public java.util.List<VSwitches> getVSwitches() {
            return this.vSwitches;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String aclId; 
            private String architecture; 
            private Long beginTime; 
            private Boolean enableAutoMinorVersionUpgrade; 
            private Boolean enableSSL; 
            private Boolean enabledAuditLoader; 
            private Boolean encrypted; 
            private Long expireTime; 
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private Boolean isolateLeader; 
            private String kmsKeyId; 
            private String maintainablePeriod; 
            private String minorVersion; 
            private String monitorType; 
            private String ossLocation; 
            private String packageType; 
            private String payType; 
            private String regionId; 
            private String resourceGroupId; 
            private String runMode; 
            private Long runningTime; 
            private Boolean securityGroupManaged; 
            private String sgId; 
            private java.util.List<Tags> tags; 
            private java.util.List<VSwitches> vSwitches; 
            private String version; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aclId = model.aclId;
                this.architecture = model.architecture;
                this.beginTime = model.beginTime;
                this.enableAutoMinorVersionUpgrade = model.enableAutoMinorVersionUpgrade;
                this.enableSSL = model.enableSSL;
                this.enabledAuditLoader = model.enabledAuditLoader;
                this.encrypted = model.encrypted;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceStatus = model.instanceStatus;
                this.isolateLeader = model.isolateLeader;
                this.kmsKeyId = model.kmsKeyId;
                this.maintainablePeriod = model.maintainablePeriod;
                this.minorVersion = model.minorVersion;
                this.monitorType = model.monitorType;
                this.ossLocation = model.ossLocation;
                this.packageType = model.packageType;
                this.payType = model.payType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.runMode = model.runMode;
                this.runningTime = model.runningTime;
                this.securityGroupManaged = model.securityGroupManaged;
                this.sgId = model.sgId;
                this.tags = model.tags;
                this.vSwitches = model.vSwitches;
                this.version = model.version;
                this.vpcId = model.vpcId;
            } 

            /**
             * AclId.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EnableAutoMinorVersionUpgrade.
             */
            public Builder enableAutoMinorVersionUpgrade(Boolean enableAutoMinorVersionUpgrade) {
                this.enableAutoMinorVersionUpgrade = enableAutoMinorVersionUpgrade;
                return this;
            }

            /**
             * EnableSSL.
             */
            public Builder enableSSL(Boolean enableSSL) {
                this.enableSSL = enableSSL;
                return this;
            }

            /**
             * EnabledAuditLoader.
             */
            public Builder enabledAuditLoader(Boolean enabledAuditLoader) {
                this.enabledAuditLoader = enabledAuditLoader;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * IsolateLeader.
             */
            public Builder isolateLeader(Boolean isolateLeader) {
                this.isolateLeader = isolateLeader;
                return this;
            }

            /**
             * KmsKeyId.
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * MaintainablePeriod.
             */
            public Builder maintainablePeriod(String maintainablePeriod) {
                this.maintainablePeriod = maintainablePeriod;
                return this;
            }

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * MonitorType.
             */
            public Builder monitorType(String monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * OssLocation.
             */
            public Builder ossLocation(String ossLocation) {
                this.ossLocation = ossLocation;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RunMode.
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * RunningTime.
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * SecurityGroupManaged.
             */
            public Builder securityGroupManaged(Boolean securityGroupManaged) {
                this.securityGroupManaged = securityGroupManaged;
                return this;
            }

            /**
             * SgId.
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VSwitches.
             */
            public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1rbvag1cafkj4prwXXX</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
