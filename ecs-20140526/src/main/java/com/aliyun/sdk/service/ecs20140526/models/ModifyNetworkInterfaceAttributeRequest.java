// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    private java.util.List<String> securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDestCheck")
    private Boolean sourceDestCheck;

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
        this.sourceDestCheck = builder.sourceDestCheck;
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
    public java.util.List<String> getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return sourceDestCheck
     */
    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
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
        private java.util.List<String> securityGroupId; 
        private Boolean sourceDestCheck; 
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
            this.sourceDestCheck = request.sourceDestCheck;
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
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         */
        public Builder connectionTrackingConfiguration(ConnectionTrackingConfiguration connectionTrackingConfiguration) {
            this.putQueryParameter("ConnectionTrackingConfiguration", connectionTrackingConfiguration);
            this.connectionTrackingConfiguration = connectionTrackingConfiguration;
            return this;
        }

        /**
         * <p>Specifies whether to release the ENI when the associated instance is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteOnRelease(Boolean deleteOnRelease) {
            this.putQueryParameter("DeleteOnRelease", deleteOnRelease);
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }

        /**
         * <p>The description of the ENI. The description must be 2 to 255 characters in length and cannot start with <a href="http://https://%E3%80%82">http:// or https://</a>.</p>
         * <p>This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is not publicly available.</p>
         */
        public Builder enhancedNetwork(EnhancedNetwork enhancedNetwork) {
            this.putQueryParameter("EnhancedNetwork", enhancedNetwork);
            this.enhancedNetwork = enhancedNetwork;
            return this;
        }

        /**
         * <p>The ID of the ENI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp67acfmxazb4p****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * <p>The name of the ENI. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>eniTestName</p>
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * <p>The communication parameters of the ENI.</p>
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
         * <p>The number of queues supported by the ENI. Valid values: 1 to 2048.</p>
         * <ul>
         * <li>You can change only the number of queues supported by the secondary ENI.</li>
         * <li>You can change the number of queues supported by the secondary ENI only when the ENI is in the <code>Available</code> state or the ENI is attached (<code>InUse</code>) to an instance that is in the <code>Stopped</code> state.</li>
         * <li>The number of queues supported by the secondary ENI cannot exceed the maximum number of queues that the instance allows for each ENI. The total number of queues for all ENIs on the instance cannot exceed the queue quota that the instance allows. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and check the values of <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> in the response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder queueNumber(Integer queueNumber) {
            this.putQueryParameter("QueueNumber", queueNumber);
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * <p>The region ID of the ENI. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The receive (Rx) queue depth of the ENI.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The Rx queue depth of an ENI must be the same as the transmit (Tx) queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</li>
         * <li>A larger Rx queue depth yields higher inbound throughput but consumes more memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        public Builder rxQueueSize(Integer rxQueueSize) {
            this.putQueryParameter("RxQueueSize", rxQueueSize);
            this.rxQueueSize = rxQueueSize;
            return this;
        }

        /**
         * <p>The IDs of the security groups to which to add the secondary ENI. The secondary ENI is added to the specified security groups and removed from the original security groups.</p>
         * <ul>
         * <li>The valid values of N vary based on the maximum number of security groups to which an ENI can be added. For more information, see the <a href="~~25412#SecurityGroupQuota~~">Security group limits</a> section of the &quot;Limits and quotas&quot; topic.</li>
         * <li>The new security groups take effect after a short delay.</li>
         * </ul>
         */
        public Builder securityGroupId(java.util.List<String> securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sourceDestCheck(Boolean sourceDestCheck) {
            this.putQueryParameter("SourceDestCheck", sourceDestCheck);
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        /**
         * <p>The Tx queue depth of the ENI.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The Tx queue depth of an ENI must be the same as the Rx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</li>
         * <li>A larger Tx queue depth yields higher outbound throughput but consumes more memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
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

    /**
     * 
     * {@link ModifyNetworkInterfaceAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyNetworkInterfaceAttributeRequest</p>
     */
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
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder tcpClosedAndTimeWaitTimeout(Integer tcpClosedAndTimeWaitTimeout) {
                this.tcpClosedAndTimeWaitTimeout = tcpClosedAndTimeWaitTimeout;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>910</p>
             */
            public Builder tcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
                this.tcpEstablishedTimeout = tcpEstablishedTimeout;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
    /**
     * 
     * {@link ModifyNetworkInterfaceAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyNetworkInterfaceAttributeRequest</p>
     */
    public static class EnhancedNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableRss")
        private Boolean enableRss;

        @com.aliyun.core.annotation.NameInMap("EnableSriov")
        private Boolean enableSriov;

        private EnhancedNetwork(Builder builder) {
            this.enableRss = builder.enableRss;
            this.enableSriov = builder.enableSriov;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnhancedNetwork create() {
            return builder().build();
        }

        /**
         * @return enableRss
         */
        public Boolean getEnableRss() {
            return this.enableRss;
        }

        /**
         * @return enableSriov
         */
        public Boolean getEnableSriov() {
            return this.enableSriov;
        }

        public static final class Builder {
            private Boolean enableRss; 
            private Boolean enableSriov; 

            /**
             * EnableRss.
             */
            public Builder enableRss(Boolean enableRss) {
                this.enableRss = enableRss;
                return this;
            }

            /**
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ModifyNetworkInterfaceAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyNetworkInterfaceAttributeRequest</p>
     */
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
             * <p>The communication mode of the ENI. Valid values:</p>
             * <ul>
             * <li>Standard: uses the TCP communication mode.</li>
             * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
             * </ul>
             * <p>When the ENI is in the InUse state, take note of the following items:</p>
             * <ul>
             * <li>The total number of ERIs attached to the instance cannot exceed the ERI quota for the instance type. To query the ERI quota for an instance type, call the DescribeInstanceTypes operation and check the EriQuantity value in the response.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HighPerformance</p>
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * <p>The number of queues supported by the ENI. When the ENI is in the InUse state, take note of the following items:</p>
             * <ul>
             * <li>The value of this parameter cannot exceed the maximum number of queues allowed per ENI for the instance type.</li>
             * <li>The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, call the DescribeInstanceTypes operation and check the MaximumQueueNumberPerEnig and TotalEniQueueQuantity values in the response.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder queueNumber(Integer queueNumber) {
                this.queueNumber = queueNumber;
                return this;
            }

            /**
             * <p>The number of queues supported by the ERI. When the ERI is in the InUse state, take note of the following items:</p>
             * <ul>
             * <li>The value of this parameter cannot exceed the maximum number of queues allowed per ERI for the instance type. To query the maximum number of queues allowed per ERI for an instance type, call the DescribeInstanceTypes operation and check the QueuePairNumber value in the response.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * <p>The receive (Rx) queue depth of the ENI.</p>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>The Rx queue depth of an ENI must be the same as the transmit (Tx) queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</li>
             * <li>A larger Rx queue depth yields higher inbound throughput but consumes more memory.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder rxQueueSize(Integer rxQueueSize) {
                this.rxQueueSize = rxQueueSize;
                return this;
            }

            /**
             * <p>The Tx queue depth of the ENI.</p>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>The Tx queue depth of an ENI must be the same as the Rx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</li>
             * <li>A larger Tx queue depth yields higher outbound throughput but consumes more memory.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
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
