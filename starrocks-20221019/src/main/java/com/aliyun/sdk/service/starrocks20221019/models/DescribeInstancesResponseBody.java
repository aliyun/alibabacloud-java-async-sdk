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
         * <p>The query results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParams</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid params: [instance not exists].</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
             * <p>Indicates whether this is the primary vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1p0mldwx5av55v0xXXX</p>
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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

        @com.aliyun.core.annotation.NameInMap("AiFunctionClusterId")
        private String aiFunctionClusterId;

        @com.aliyun.core.annotation.NameInMap("AiFunctionEndpoint")
        private String aiFunctionEndpoint;

        @com.aliyun.core.annotation.NameInMap("AiFunctionInstanceId")
        private String aiFunctionInstanceId;

        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("EnableAiFunction")
        private Boolean enableAiFunction;

        @com.aliyun.core.annotation.NameInMap("EnableAutoMinorVersionUpgrade")
        private Boolean enableAutoMinorVersionUpgrade;

        @com.aliyun.core.annotation.NameInMap("EnableMultiAz")
        private Boolean enableMultiAz;

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
            this.aiFunctionClusterId = builder.aiFunctionClusterId;
            this.aiFunctionEndpoint = builder.aiFunctionEndpoint;
            this.aiFunctionInstanceId = builder.aiFunctionInstanceId;
            this.architecture = builder.architecture;
            this.beginTime = builder.beginTime;
            this.enableAiFunction = builder.enableAiFunction;
            this.enableAutoMinorVersionUpgrade = builder.enableAutoMinorVersionUpgrade;
            this.enableMultiAz = builder.enableMultiAz;
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
         * @return aiFunctionClusterId
         */
        public String getAiFunctionClusterId() {
            return this.aiFunctionClusterId;
        }

        /**
         * @return aiFunctionEndpoint
         */
        public String getAiFunctionEndpoint() {
            return this.aiFunctionEndpoint;
        }

        /**
         * @return aiFunctionInstanceId
         */
        public String getAiFunctionInstanceId() {
            return this.aiFunctionInstanceId;
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
         * @return enableAiFunction
         */
        public Boolean getEnableAiFunction() {
            return this.enableAiFunction;
        }

        /**
         * @return enableAutoMinorVersionUpgrade
         */
        public Boolean getEnableAutoMinorVersionUpgrade() {
            return this.enableAutoMinorVersionUpgrade;
        }

        /**
         * @return enableMultiAz
         */
        public Boolean getEnableMultiAz() {
            return this.enableMultiAz;
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
            private String aiFunctionClusterId; 
            private String aiFunctionEndpoint; 
            private String aiFunctionInstanceId; 
            private String architecture; 
            private Long beginTime; 
            private Boolean enableAiFunction; 
            private Boolean enableAutoMinorVersionUpgrade; 
            private Boolean enableMultiAz; 
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
                this.aiFunctionClusterId = model.aiFunctionClusterId;
                this.aiFunctionEndpoint = model.aiFunctionEndpoint;
                this.aiFunctionInstanceId = model.aiFunctionInstanceId;
                this.architecture = model.architecture;
                this.beginTime = model.beginTime;
                this.enableAiFunction = model.enableAiFunction;
                this.enableAutoMinorVersionUpgrade = model.enableAutoMinorVersionUpgrade;
                this.enableMultiAz = model.enableMultiAz;
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
             * <p>The network access control list (ACL) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-bp1xc6b9vs013jjtp****</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The AI dedicated cluster ID, prefixed with af-. This value is returned if an unreleased dedicated cluster exists (including clusters being created). This value is empty if no dedicated cluster has been created.</p>
             * 
             * <strong>example:</strong>
             * <p>af-498ae4af</p>
             */
            public Builder aiFunctionClusterId(String aiFunctionClusterId) {
                this.aiFunctionClusterId = aiFunctionClusterId;
                return this;
            }

            /**
             * <p>The internal network connection endpoint of the AI dedicated cluster, in the format fe-{AiFunctionClusterId}-internal.starrocks.aliyuncs.com. This value is returned only after the dedicated cluster is created. This value is empty if no dedicated cluster has been created.</p>
             * 
             * <strong>example:</strong>
             * <p>fe-af-498ae4af-internal.starrocks.aliyuncs.com</p>
             */
            public Builder aiFunctionEndpoint(String aiFunctionEndpoint) {
                this.aiFunctionEndpoint = aiFunctionEndpoint;
                return this;
            }

            /**
             * <p>The billing instance ID for the AI function.</p>
             */
            public Builder aiFunctionInstanceId(String aiFunctionInstanceId) {
                this.aiFunctionInstanceId = aiFunctionInstanceId;
                return this;
            }

            /**
             * <p>The instance architecture. Valid values:</p>
             * <ul>
             * <li>onEci: deployed on Elastic Container Instance (ECI).</li>
             * <li>onECS: deployed on Elastic Compute Service (ECS).</li>
             * <li>onBareMetal: deployed on a bare metal resource pool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>onECS</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1733292921000</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>Indicates whether the AI center is enabled. Default value: false.</p>
             */
            public Builder enableAiFunction(Boolean enableAiFunction) {
                this.enableAiFunction = enableAiFunction;
                return this;
            }

            /**
             * <p>Indicates whether automatic minor version upgrades are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAutoMinorVersionUpgrade(Boolean enableAutoMinorVersionUpgrade) {
                this.enableAutoMinorVersionUpgrade = enableAutoMinorVersionUpgrade;
                return this;
            }

            /**
             * EnableMultiAz.
             */
            public Builder enableMultiAz(Boolean enableMultiAz) {
                this.enableMultiAz = enableMultiAz;
                return this;
            }

            /**
             * <p>Indicates whether SSL is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSSL(Boolean enableSSL) {
                this.enableSSL = enableSSL;
                return this;
            }

            /**
             * <p>Indicates whether the audit plug-in is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabledAuditLoader(Boolean enabledAuditLoader) {
                this.enabledAuditLoader = enabledAuditLoader;
                return this;
            }

            /**
             * <p>Indicates whether encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The time when the cluster expires.</p>
             * 
             * <strong>example:</strong>
             * <p>4889001600000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-d4be777ff5e8cXXX</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>sr_test_1</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li>not_init: Not initialized.</li>
             * <li>unpaid: Pending payment.</li>
             * <li>paid: Paid.</li>
             * <li>creating: Being created.</li>
             * <li>creating_failed: Creation failed.</li>
             * <li>created: Created.</li>
             * <li>running: Running.</li>
             * <li>updating: Being upgraded.</li>
             * <li>agent_creating: Agent is being created.</li>
             * <li>agent_scaling_up: Agent specifications are being upgraded.</li>
             * <li>modifying_config: Configuration is being updated.</li>
             * <li>scaling_out: Scaling out.</li>
             * <li>restarting: Restarting.</li>
             * <li>scaling_in: Scaling in.</li>
             * <li>scaling_up: Specifications are being upgraded.</li>
             * <li>scaling_down: Specifications are being downgraded.</li>
             * <li>upgrading: Version is being upgraded.</li>
             * <li>enable_public_network: Public network access is being enabled.</li>
             * <li>disable_public_network: Public network access is being disabled.</li>
             * <li>convert_from_trial_to_official: Edition is being converted.</li>
             * <li>migration_cluster_to_serverless: Cluster is being migrated.</li>
             * <li>modifying_timezone: Time zone is being modified.</li>
             * <li>switch_az: Primary/secondary zone switchover is in progress.</li>
             * <li>enabling: Being resumed.</li>
             * <li>disable: Unavailable.</li>
             * <li>actively_disabled: Unavailable.</li>
             * <li>deleting: Being deleted.</li>
             * <li>deleting_failed: Deletion failed.</li>
             * <li>deleted_with_error: Creation failed and terminated.</li>
             * <li>deleted: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>Indicates whether read/write splitting is enabled. When enabled, the Leader FE node handles write requests and other nodes handle read requests.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isolateLeader(Boolean isolateLeader) {
                this.isolateLeader = isolateLeader;
                return this;
            }

            /**
             * <p>The KMS key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rewqfds****</p>
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * <p>The maintenance window of the instance. Valid values:</p>
             * <ul>
             * <li>00:00-06:00</li>
             * <li>06:00-07:00</li>
             * <li>07:00-08:00</li>
             * <li>08:00-09:00</li>
             * <li>09:00-10:00</li>
             * <li>10:00-11:00</li>
             * <li>11:00-12:00</li>
             * <li>12:00-13:00</li>
             * <li>13:00-14:00</li>
             * <li>14:00-15:00</li>
             * <li>15:00-16:00</li>
             * <li>16:00-17:00</li>
             * <li>17:00-18:00</li>
             * <li>18:00-19:00</li>
             * <li>19:00-20:00</li>
             * <li>20:00-21:00</li>
             * <li>21:00-22:00</li>
             * <li>22:00-23:00</li>
             * <li>23:00-24:00</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>00:00-06:00</p>
             */
            public Builder maintainablePeriod(String maintainablePeriod) {
                this.maintainablePeriod = maintainablePeriod;
                return this;
            }

            /**
             * <p>The minor version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3.2.11-1.79-1.6.5</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>The monitoring service type.</p>
             * 
             * <strong>example:</strong>
             * <p>cms</p>
             */
            public Builder monitorType(String monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * <p>The OSS path.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://sr-c-****</p>
             */
            public Builder ossLocation(String ossLocation) {
                this.ossLocation = ossLocation;
                return this;
            }

            /**
             * <p>The instance edition. Valid values:</p>
             * <ul>
             * <li>trial: Trial Edition.</li>
             * <li>official: Standard Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>official</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>prePaid: subscription.</li>
             * <li>postPaid: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>postPaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmytyuofb****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The running mode of the cluster. Valid values:</p>
             * <ul>
             * <li>shared_nothing: Shared-nothing architecture.</li>
             * <li>shared_data: Storage-compute disaggregation.</li>
             * <li>lakehouse: Data lakehouse analytics.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>shared_nothing</p>
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * <p>The duration that the cluster has been running. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3645445</p>
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * <p>Indicates whether the security group is a managed security group.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder securityGroupManaged(Boolean securityGroupManaged) {
                this.securityGroupManaged = securityGroupManaged;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-8vbaz2etr66a62b9****</p>
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * <p>The tags that are bound to the instance.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The vSwitches.</p>
             */
            public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * <p>The cluster version.</p>
             * 
             * <strong>example:</strong>
             * <p>3.2</p>
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
