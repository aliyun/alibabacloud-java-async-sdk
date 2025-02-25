// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instance = builder.instance;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
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
        private String errorCode; 
        private String errorMessage; 
        private String httpStatusCode; 
        private Instance instance; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The error code that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal server error.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The information about the instance.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>865A02C2-B374-5DD4-9B34-0CA15DA1AEBD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request result, which indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlternativeEndpoints")
        private String alternativeEndpoints;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private Endpoints(Builder builder) {
            this.alternativeEndpoints = builder.alternativeEndpoints;
            this.enabled = builder.enabled;
            this.endpoint = builder.endpoint;
            this.type = builder.type;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return alternativeEndpoints
         */
        public String getAlternativeEndpoints() {
            return this.alternativeEndpoints;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String alternativeEndpoints; 
            private Boolean enabled; 
            private String endpoint; 
            private String type; 
            private String vSwitchId; 
            private String vpcId; 
            private String vpcInstanceId; 

            /**
             * <p>The endpoint. This parameter is returned if both the AnyTunnel and SingleTunnel modes are enabled for an instance, and the instance is switched from the AnyTunnel mode to the SingleTunnel mode. In this case, two endpoints are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>hgprecn-cn-uqm362o1b001-cn-hangzhou-internal.hologres.aliyuncs.com:80</p>
             */
            public Builder alternativeEndpoints(String alternativeEndpoints) {
                this.alternativeEndpoints = alternativeEndpoints;
                return this;
            }

            /**
             * <p>Indicates whether the network is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>hgprecn-cn-uqm362o1b001-cn-hangzhou-internal.hologres.aliyuncs.com:80</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The network type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>VPCSingleTunnel</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>virtual private cloud (VPC)</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>Intranet</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>internal network</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>VPCAnyTunnel</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>not supported by new instances</p>
             * <!-- -->
             * </li>
             * <li><p>Internet</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>Internet</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1jqwp2ys6kp7tc9t983</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf66jjber3hgvwhki3wna</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the instance that is deployed in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>hgprecn-cn-uqm362o1b001-frontend-st</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
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

            /**
             * <p>The key of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>tag</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewal")
        private String autoRenewal;

        @com.aliyun.core.annotation.NameInMap("ColdStorage")
        private Long coldStorage;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ComputeNodeCount")
        private Long computeNodeCount;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Long cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private String disk;

        @com.aliyun.core.annotation.NameInMap("EnableHiveAccess")
        private String enableHiveAccess;

        @com.aliyun.core.annotation.NameInMap("EnableServerless")
        private Boolean enableServerless;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List<Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("GatewayCount")
        private Long gatewayCount;

        @com.aliyun.core.annotation.NameInMap("GatewayCpu")
        private Long gatewayCpu;

        @com.aliyun.core.annotation.NameInMap("GatewayMemory")
        private Long gatewayMemory;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceOwner")
        private String instanceOwner;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("LeaderInstanceId")
        private String leaderInstanceId;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplicaRole")
        private String replicaRole;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("SuspendReason")
        private String suspendReason;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instance(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.coldStorage = builder.coldStorage;
            this.commodityCode = builder.commodityCode;
            this.computeNodeCount = builder.computeNodeCount;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.disk = builder.disk;
            this.enableHiveAccess = builder.enableHiveAccess;
            this.enableServerless = builder.enableServerless;
            this.endpoints = builder.endpoints;
            this.expirationTime = builder.expirationTime;
            this.gatewayCount = builder.gatewayCount;
            this.gatewayCpu = builder.gatewayCpu;
            this.gatewayMemory = builder.gatewayMemory;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceOwner = builder.instanceOwner;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.leaderInstanceId = builder.leaderInstanceId;
            this.memory = builder.memory;
            this.regionId = builder.regionId;
            this.replicaRole = builder.replicaRole;
            this.resourceGroupId = builder.resourceGroupId;
            this.storageType = builder.storageType;
            this.suspendReason = builder.suspendReason;
            this.tags = builder.tags;
            this.version = builder.version;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return autoRenewal
         */
        public String getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return coldStorage
         */
        public Long getColdStorage() {
            return this.coldStorage;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return computeNodeCount
         */
        public Long getComputeNodeCount() {
            return this.computeNodeCount;
        }

        /**
         * @return cpu
         */
        public Long getCpu() {
            return this.cpu;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return disk
         */
        public String getDisk() {
            return this.disk;
        }

        /**
         * @return enableHiveAccess
         */
        public String getEnableHiveAccess() {
            return this.enableHiveAccess;
        }

        /**
         * @return enableServerless
         */
        public Boolean getEnableServerless() {
            return this.enableServerless;
        }

        /**
         * @return endpoints
         */
        public java.util.List<Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return gatewayCount
         */
        public Long getGatewayCount() {
            return this.gatewayCount;
        }

        /**
         * @return gatewayCpu
         */
        public Long getGatewayCpu() {
            return this.gatewayCpu;
        }

        /**
         * @return gatewayMemory
         */
        public Long getGatewayMemory() {
            return this.gatewayMemory;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
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
         * @return instanceOwner
         */
        public String getInstanceOwner() {
            return this.instanceOwner;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return leaderInstanceId
         */
        public String getLeaderInstanceId() {
            return this.leaderInstanceId;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replicaRole
         */
        public String getReplicaRole() {
            return this.replicaRole;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return suspendReason
         */
        public String getSuspendReason() {
            return this.suspendReason;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String autoRenewal; 
            private Long coldStorage; 
            private String commodityCode; 
            private Long computeNodeCount; 
            private Long cpu; 
            private String creationTime; 
            private String disk; 
            private String enableHiveAccess; 
            private Boolean enableServerless; 
            private java.util.List<Endpoints> endpoints; 
            private String expirationTime; 
            private Long gatewayCount; 
            private Long gatewayCpu; 
            private Long gatewayMemory; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceName; 
            private String instanceOwner; 
            private String instanceStatus; 
            private String instanceType; 
            private String leaderInstanceId; 
            private Long memory; 
            private String regionId; 
            private String replicaRole; 
            private String resourceGroupId; 
            private String storageType; 
            private String suspendReason; 
            private java.util.List<Tags> tags; 
            private String version; 
            private String zoneId; 

            /**
             * <p>Indicates whether auto-renewal is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenewal(String autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * <p>The cold storage capacity of the instance. Unit: GB. Standard SSD is used for hot storage, and HDD is used for cold storage.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder coldStorage(Long coldStorage) {
                this.coldStorage = coldStorage;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>hologram_maxcomputeAccelerate_public_cn</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>China site/Lakehouse Acceleration Edition</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>hologram_combo_public_cn</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>China site/Subscription</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>hologram_prepay_public_intl</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>International site/Subscription</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>hologram_storage_dp_cn</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>China site/Storage plan</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>hologram_postpay_public_cn</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>China site/Pay-as-you-go</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>hologram_postpay_public_intl</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>International site/Pay-as-you-go</p>
             * <!-- -->
             * </li>
             * <li><p>hologram_maxcomputeAccelerate_public_intl</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>International site/Lakehouse Acceleration Edition</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>hologram_cu_dp_cn</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>China site/Compute plan</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hologram_combo_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The number of compute nodes. In a typical configuration, a node has 16 CPU cores and 32 GB of memory.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder computeNodeCount(Long computeNodeCount) {
                this.computeNodeCount = computeNodeCount;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-03T13:06:06Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The amount of data that can be stored in the disk of the Standard storage class. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder disk(String disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>Indicates whether data lake acceleration is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableHiveAccess(String enableHiveAccess) {
                this.enableHiveAccess = enableHiveAccess;
                return this;
            }

            /**
             * EnableServerless.
             */
            public Builder enableServerless(Boolean enableServerless) {
                this.enableServerless = enableServerless;
                return this;
            }

            /**
             * <p>The list of endpoints.</p>
             */
            public Builder endpoints(java.util.List<Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The expiration time. This parameter is invalid for pay-as-you-go instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-03T13:06:06Z</p>
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The number of gateway nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder gatewayCount(Long gatewayCount) {
                this.gatewayCount = gatewayCount;
                return this;
            }

            /**
             * <p>The number of CPU cores of the gateway. Unit: core.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder gatewayCpu(Long gatewayCpu) {
                this.gatewayCpu = gatewayCpu;
                return this;
            }

            /**
             * <p>The size of memory resources of the gateway. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder gatewayMemory(Long gatewayMemory) {
                this.gatewayMemory = gatewayMemory;
                return this;
            }

            /**
             * <p>The billing method of the instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>PostPaid</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>pay-as-you-go</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>PrePaid</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>subscription</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hgpostcn-cn-tl32s6cgw00b</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name. The instance name must be 2 to 64 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The owner of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678900000</p>
             */
            public Builder instanceOwner(String instanceOwner) {
                this.instanceOwner = instanceOwner;
                return this;
            }

            /**
             * <p>The status of the instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Creating</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Running</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Suspended</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Allocating</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Follower</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>read-only secondary instance</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>Standard</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>normal instance</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The ID of the primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hgpostcn-cn-i7m2ncd6w002</p>
             */
            public Builder leaderInstanceId(String leaderInstanceId) {
                this.leaderInstanceId = leaderInstanceId;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The ID of the region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReplicaRole.
             */
            public Builder replicaRole(String replicaRole) {
                this.replicaRole = replicaRole;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzuq7hpybze2i</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The reason for the suspension.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Indebet</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>The instance has an overdue payment</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>Manual</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>The instance is manually suspended</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>Overdue</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>The instance has expired</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder suspendReason(String suspendReason) {
                this.suspendReason = suspendReason;
                return this;
            }

            /**
             * <p>The instance tag.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The instance version.</p>
             * 
             * <strong>example:</strong>
             * <p>r1.3.37</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The ID of the zone where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
