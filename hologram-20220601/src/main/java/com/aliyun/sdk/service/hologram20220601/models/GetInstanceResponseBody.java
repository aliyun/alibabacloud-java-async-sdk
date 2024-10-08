// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The error code that is returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The information about the instance.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The request result, which indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

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
             * The endpoint. This parameter is returned if both the AnyTunnel and SingleTunnel modes are enabled for an instance, and the instance is switched from the AnyTunnel mode to the SingleTunnel mode. In this case, two endpoints are returned.
             */
            public Builder alternativeEndpoints(String alternativeEndpoints) {
                this.alternativeEndpoints = alternativeEndpoints;
                return this;
            }

            /**
             * Indicates whether the network is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The network type.
             * <p>
             * 
             * Valid values:
             * 
             * *   VPCSingleTunnel
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     virtual private cloud (VPC)
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   Intranet
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     internal network
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   VPCAnyTunnel
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     not supported by new instances
             * 
             *     <!-- -->
             * 
             * *   Internet
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Internet
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC to which the instance belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the instance that is deployed in the VPC.
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
             * The key of tag N.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N.
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
        private java.util.List < Endpoints> endpoints;

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

        @com.aliyun.core.annotation.NameInMap("SuspendReason")
        private String suspendReason;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

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
        public java.util.List < Endpoints> getEndpoints() {
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
         * @return suspendReason
         */
        public String getSuspendReason() {
            return this.suspendReason;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
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
            private java.util.List < Endpoints> endpoints; 
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
            private String suspendReason; 
            private java.util.List < Tags> tags; 
            private String version; 
            private String zoneId; 

            /**
             * Indicates whether auto-renewal is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder autoRenewal(String autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * The cold storage capacity of the instance. Unit: GB. Standard SSD is used for hot storage, and HDD is used for cold storage.
             */
            public Builder coldStorage(Long coldStorage) {
                this.coldStorage = coldStorage;
                return this;
            }

            /**
             * The commodity code.
             * <p>
             * 
             * Valid values:
             * 
             * *   hologram_maxcomputeAccelerate_public_cn
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     China site/Lakehouse Acceleration Edition
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   hologram_combo_public_cn
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     China site/Subscription
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   hologram_prepay_public_intl
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     International site/Subscription
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   hologram_storage_dp_cn
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     China site/Storage plan
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   hologram_postpay_public_cn
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     China site/Pay-as-you-go
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   hologram_postpay_public_intl
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     International site/Pay-as-you-go
             * 
             *     <!-- -->
             * 
             * *   hologram_maxcomputeAccelerate_public_intl
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     International site/Lakehouse Acceleration Edition
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   hologram_cu_dp_cn
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     China site/Compute plan
             * 
             *     <!-- -->
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The number of compute nodes. In a typical configuration, a node has 16 CPU cores and 32 GB of memory.
             */
            public Builder computeNodeCount(Long computeNodeCount) {
                this.computeNodeCount = computeNodeCount;
                return this;
            }

            /**
             * The number of CPU cores.
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The amount of data that can be stored in the disk of the Standard storage class. Unit: GB.
             */
            public Builder disk(String disk) {
                this.disk = disk;
                return this;
            }

            /**
             * Indicates whether data lake acceleration is enabled.
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
             * The list of endpoints.
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The expiration time. This parameter is invalid for pay-as-you-go instances.
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * The number of gateway nodes.
             */
            public Builder gatewayCount(Long gatewayCount) {
                this.gatewayCount = gatewayCount;
                return this;
            }

            /**
             * The number of CPU cores of the gateway. Unit: core.
             */
            public Builder gatewayCpu(Long gatewayCpu) {
                this.gatewayCpu = gatewayCpu;
                return this;
            }

            /**
             * The size of memory resources of the gateway. Unit: GB.
             */
            public Builder gatewayMemory(Long gatewayMemory) {
                this.gatewayMemory = gatewayMemory;
                return this;
            }

            /**
             * The billing method of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   PostPaid
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     pay-as-you-go
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   PrePaid
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     subscription
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name. The instance name must be 2 to 64 characters in length.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The owner of the instance.
             */
            public Builder instanceOwner(String instanceOwner) {
                this.instanceOwner = instanceOwner;
                return this;
            }

            /**
             * The status of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   Creating
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Running
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Suspended
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Allocating
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The type of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   Follower
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     read-only secondary instance
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   Standard
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     normal instance
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The ID of the primary instance.
             */
            public Builder leaderInstanceId(String leaderInstanceId) {
                this.leaderInstanceId = leaderInstanceId;
                return this;
            }

            /**
             * The memory size. Unit: GB.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
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
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The reason for the suspension.
             * <p>
             * 
             * Valid values:
             * 
             * *   Indebet
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The instance has an overdue payment
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   Manual
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The instance is manually suspended
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   Overdue
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The instance has expired
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder suspendReason(String suspendReason) {
                this.suspendReason = suspendReason;
                return this;
            }

            /**
             * The instance tag.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The instance version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The ID of the zone where the instance resides.
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
