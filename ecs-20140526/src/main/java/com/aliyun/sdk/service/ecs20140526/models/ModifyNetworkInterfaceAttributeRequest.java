// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkInterfaceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkInterfaceAttributeRequest</p>
 */
public class ModifyNetworkInterfaceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionTrackingConfiguration")
    private ConnectionTrackingConfiguration connectionTrackingConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteOnRelease")
    private Boolean deleteOnRelease;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnhancedNetwork")
    private EnhancedNetwork enhancedNetwork;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficConfig")
    private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueNumber")
    private Integer queueNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RxQueueSize")
    private Integer rxQueueSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private java.util.List < String > securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TxQueueSize")
    private Integer txQueueSize;

    private ModifyNetworkInterfaceAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.connectionTrackingConfiguration = builder.connectionTrackingConfiguration;
        this.deleteOnRelease = builder.deleteOnRelease;
        this.description = builder.description;
        this.enhancedNetwork = builder.enhancedNetwork;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.networkInterfaceTrafficConfig = builder.networkInterfaceTrafficConfig;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.queueNumber = builder.queueNumber;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rxQueueSize = builder.rxQueueSize;
        this.securityGroupId = builder.securityGroupId;
        this.txQueueSize = builder.txQueueSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkInterfaceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return connectionTrackingConfiguration
     */
    public ConnectionTrackingConfiguration getConnectionTrackingConfiguration() {
        return this.connectionTrackingConfiguration;
    }

    /**
     * @return deleteOnRelease
     */
    public Boolean getDeleteOnRelease() {
        return this.deleteOnRelease;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enhancedNetwork
     */
    public EnhancedNetwork getEnhancedNetwork() {
        return this.enhancedNetwork;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return networkInterfaceName
     */
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * @return networkInterfaceTrafficConfig
     */
    public NetworkInterfaceTrafficConfig getNetworkInterfaceTrafficConfig() {
        return this.networkInterfaceTrafficConfig;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queueNumber
     */
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return rxQueueSize
     */
    public Integer getRxQueueSize() {
        return this.rxQueueSize;
    }

    /**
     * @return securityGroupId
     */
    public java.util.List < String > getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return txQueueSize
     */
    public Integer getTxQueueSize() {
        return this.txQueueSize;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkInterfaceAttributeRequest, Builder> {
        private String sourceRegionId; 
        private ConnectionTrackingConfiguration connectionTrackingConfiguration; 
        private Boolean deleteOnRelease; 
        private String description; 
        private EnhancedNetwork enhancedNetwork; 
        private String networkInterfaceId; 
        private String networkInterfaceName; 
        private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer queueNumber; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer rxQueueSize; 
        private java.util.List < String > securityGroupId; 
        private Integer txQueueSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkInterfaceAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.connectionTrackingConfiguration = request.connectionTrackingConfiguration;
            this.deleteOnRelease = request.deleteOnRelease;
            this.description = request.description;
            this.enhancedNetwork = request.enhancedNetwork;
            this.networkInterfaceId = request.networkInterfaceId;
            this.networkInterfaceName = request.networkInterfaceName;
            this.networkInterfaceTrafficConfig = request.networkInterfaceTrafficConfig;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.queueNumber = request.queueNumber;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rxQueueSize = request.rxQueueSize;
            this.securityGroupId = request.securityGroupId;
            this.txQueueSize = request.txQueueSize;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * This parameter is unavailable for public use.
         */
        public Builder connectionTrackingConfiguration(ConnectionTrackingConfiguration connectionTrackingConfiguration) {
            this.putQueryParameter("ConnectionTrackingConfiguration", connectionTrackingConfiguration);
            this.connectionTrackingConfiguration = connectionTrackingConfiguration;
            return this;
        }

        /**
         * Specifies whether to release the ENI when the associated instance is released. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder deleteOnRelease(Boolean deleteOnRelease) {
            this.putQueryParameter("DeleteOnRelease", deleteOnRelease);
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }

        /**
         * The description of the ENI. The description must be 2 to 255 characters in length and cannot start with [http:// or https://](http://https://。).
         * <p>
         * 
         * This parameter is left empty by default.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * This parameter is unavailable for public use.
         */
        public Builder enhancedNetwork(EnhancedNetwork enhancedNetwork) {
            this.putQueryParameter("EnhancedNetwork", enhancedNetwork);
            this.enhancedNetwork = enhancedNetwork;
            return this;
        }

        /**
         * The ID of the ENI.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The name of the ENI. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
         * <p>
         * 
         * This parameter is left empty by default.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * The communication parameters of the ENI.
         */
        public Builder networkInterfaceTrafficConfig(NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
            this.putQueryParameter("NetworkInterfaceTrafficConfig", networkInterfaceTrafficConfig);
            this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of queues supported by the ENI. Valid values: 1 to 2048.
         * <p>
         * 
         * *   You can change only the number of queues supported by the secondary ENI.
         * *   You can change the number of queues supported by the secondary ENI only when the ENI is in the `Available` state or the ENI is attached (`InUse`) to an instance that is in the `Stopped` state.
         * *   The number of queues supported by the secondary ENI cannot exceed the maximum number of queues that the instance allows for each ENI. The total number of queues for all ENIs on the instance cannot exceed the queue quota that the instance allows. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and check the values of `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` in the response.
         */
        public Builder queueNumber(Integer queueNumber) {
            this.putQueryParameter("QueueNumber", queueNumber);
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * The region ID of the ENI. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The receive (Rx) queue depth of the ENI.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   The Rx queue depth of an ENI must be the same as the transmit (Tx) queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.
         * *   A larger Rx queue depth yields higher inbound throughput but consumes more memory.
         */
        public Builder rxQueueSize(Integer rxQueueSize) {
            this.putQueryParameter("RxQueueSize", rxQueueSize);
            this.rxQueueSize = rxQueueSize;
            return this;
        }

        /**
         * The IDs of the security groups to which to add the secondary ENI. The secondary ENI is added to the specified security groups and are removed from its original security groups.
         * <p>
         * 
         * *   The valid value range of N varies based on the number of security groups to which an ENI can be added. For more information, see [Limits](~~25412#SecurityGroupQuota~~).
         * *   The new security groups take effect after a short delay.
         */
        public Builder securityGroupId(java.util.List < String > securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The Tx queue depth of the ENI.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   The Tx queue depth of an ENI must be the same as the Rx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.
         * *   A larger Tx queue depth yields higher outbound throughput but consumes more memory.
         */
        public Builder txQueueSize(Integer txQueueSize) {
            this.putQueryParameter("TxQueueSize", txQueueSize);
            this.txQueueSize = txQueueSize;
            return this;
        }

        @Override
        public ModifyNetworkInterfaceAttributeRequest build() {
            return new ModifyNetworkInterfaceAttributeRequest(this);
        } 

    } 

    public static class ConnectionTrackingConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TcpClosedAndTimeWaitTimeout")
        private Integer tcpClosedAndTimeWaitTimeout;

        @com.aliyun.core.annotation.NameInMap("TcpEstablishedTimeout")
        private Integer tcpEstablishedTimeout;

        @com.aliyun.core.annotation.NameInMap("UdpTimeout")
        private Integer udpTimeout;

        private ConnectionTrackingConfiguration(Builder builder) {
            this.tcpClosedAndTimeWaitTimeout = builder.tcpClosedAndTimeWaitTimeout;
            this.tcpEstablishedTimeout = builder.tcpEstablishedTimeout;
            this.udpTimeout = builder.udpTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionTrackingConfiguration create() {
            return builder().build();
        }

        /**
         * @return tcpClosedAndTimeWaitTimeout
         */
        public Integer getTcpClosedAndTimeWaitTimeout() {
            return this.tcpClosedAndTimeWaitTimeout;
        }

        /**
         * @return tcpEstablishedTimeout
         */
        public Integer getTcpEstablishedTimeout() {
            return this.tcpEstablishedTimeout;
        }

        /**
         * @return udpTimeout
         */
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

        public static final class Builder {
            private Integer tcpClosedAndTimeWaitTimeout; 
            private Integer tcpEstablishedTimeout; 
            private Integer udpTimeout; 

            /**
             * This parameter is unavailable for public use.
             */
            public Builder tcpClosedAndTimeWaitTimeout(Integer tcpClosedAndTimeWaitTimeout) {
                this.tcpClosedAndTimeWaitTimeout = tcpClosedAndTimeWaitTimeout;
                return this;
            }

            /**
             * This parameter is unavailable for public use.
             */
            public Builder tcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
                this.tcpEstablishedTimeout = tcpEstablishedTimeout;
                return this;
            }

            /**
             * This parameter is unavailable for public use.
             */
            public Builder udpTimeout(Integer udpTimeout) {
                this.udpTimeout = udpTimeout;
                return this;
            }

            public ConnectionTrackingConfiguration build() {
                return new ConnectionTrackingConfiguration(this);
            } 

        } 

    }
    public static class EnhancedNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSriov")
        private Boolean enableSriov;

        private EnhancedNetwork(Builder builder) {
            this.enableSriov = builder.enableSriov;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnhancedNetwork create() {
            return builder().build();
        }

        /**
         * @return enableSriov
         */
        public Boolean getEnableSriov() {
            return this.enableSriov;
        }

        public static final class Builder {
            private Boolean enableSriov; 

            /**
             * This parameter is unavailable for public use.
             */
            public Builder enableSriov(Boolean enableSriov) {
                this.enableSriov = enableSriov;
                return this;
            }

            public EnhancedNetwork build() {
                return new EnhancedNetwork(this);
            } 

        } 

    }
    public static class NetworkInterfaceTrafficConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("QueueNumber")
        private Integer queueNumber;

        @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
        private Integer queuePairNumber;

        @com.aliyun.core.annotation.NameInMap("RxQueueSize")
        private Integer rxQueueSize;

        @com.aliyun.core.annotation.NameInMap("TxQueueSize")
        private Integer txQueueSize;

        private NetworkInterfaceTrafficConfig(Builder builder) {
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.queueNumber = builder.queueNumber;
            this.queuePairNumber = builder.queuePairNumber;
            this.rxQueueSize = builder.rxQueueSize;
            this.txQueueSize = builder.txQueueSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceTrafficConfig create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return queueNumber
         */
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        /**
         * @return queuePairNumber
         */
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        /**
         * @return rxQueueSize
         */
        public Integer getRxQueueSize() {
            return this.rxQueueSize;
        }

        /**
         * @return txQueueSize
         */
        public Integer getTxQueueSize() {
            return this.txQueueSize;
        }

        public static final class Builder {
            private String networkInterfaceTrafficMode; 
            private Integer queueNumber; 
            private Integer queuePairNumber; 
            private Integer rxQueueSize; 
            private Integer txQueueSize; 

            /**
             * The communication mode of the ENI. Valid values:
             * <p>
             * 
             * *   Standard: uses the TCP communication mode.
             * *   HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.
             * 
             * When the ENI is in the InUse state, take note of the following items:
             * 
             * *   The total number of ERIs attached to the instance cannot exceed the ERI quota for the instance type. To query the ERI quota for an instance type, call the DescribeInstanceTypes operation and check the EriQuantity value in the response.
             * 
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * The number of queues supported by the ENI. When the ENI is in the InUse state, take note of the following items:
             * <p>
             * 
             * *   The value of this parameter cannot exceed the maximum number of queues allowed per ENI for the instance type.
             * *   The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, call the DescribeInstanceTypes operation and check the MaximumQueueNumberPerEnig and TotalEniQueueQuantity values in the response.
             * 
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder queueNumber(Integer queueNumber) {
                this.queueNumber = queueNumber;
                return this;
            }

            /**
             * The number of queues supported by the ERI. When the ERI is in the InUse state, take note of the following items:
             * <p>
             * 
             * *   The value of this parameter cannot exceed the maximum number of queues allowed per ERI for the instance type. To query the maximum number of queues allowed per ERI for an instance type, call the DescribeInstanceTypes operation and check the QueuePairNumber value in the response.
             * 
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * The receive (Rx) queue depth of the ENI.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   The Rx queue depth of an ENI must be the same as the transmit (Tx) queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.
             * *   A larger Rx queue depth yields higher inbound throughput but consumes more memory.
             * 
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder rxQueueSize(Integer rxQueueSize) {
                this.rxQueueSize = rxQueueSize;
                return this;
            }

            /**
             * The Tx queue depth of the ENI.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   The Tx queue depth of an ENI must be the same as the Rx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.
             * *   A larger Tx queue depth yields higher outbound throughput but consumes more memory.
             * 
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder txQueueSize(Integer txQueueSize) {
                this.txQueueSize = txQueueSize;
                return this;
            }

            public NetworkInterfaceTrafficConfig build() {
                return new NetworkInterfaceTrafficConfig(this);
            } 

        } 

    }
}
