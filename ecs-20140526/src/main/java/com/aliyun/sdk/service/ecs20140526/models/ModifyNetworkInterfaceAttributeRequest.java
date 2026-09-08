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
    @com.aliyun.core.annotation.NameInMap("EnablePrimaryIPv6")
    private Boolean enablePrimaryIPv6;

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
        this.enablePrimaryIPv6 = builder.enablePrimaryIPv6;
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
     * @return enablePrimaryIPv6
     */
    public Boolean getEnablePrimaryIPv6() {
        return this.enablePrimaryIPv6;
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
        private Boolean enablePrimaryIPv6; 
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
            this.enablePrimaryIPv6 = request.enablePrimaryIPv6;
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
         * <p>The network connectivity tracking configuration.</p>
         * <p>Before you use this parameter, read <a href="https://help.aliyun.com/document_detail/2865958.html">Connection timeout management</a>.</p>
         */
        public Builder connectionTrackingConfiguration(ConnectionTrackingConfiguration connectionTrackingConfiguration) {
            this.putQueryParameter("ConnectionTrackingConfiguration", connectionTrackingConfiguration);
            this.connectionTrackingConfiguration = connectionTrackingConfiguration;
            return this;
        }

        /**
         * <p>Specifies whether to retain the ENI when the associated instance is released. Valid values:</p>
         * <ul>
         * <li><p>true: The ENI is not retained.</p>
         * </li>
         * <li><p>false: The ENI is retained.</p>
         * </li>
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
         * <p>The description of the network interface controller (NIC). The description must be 2 to 255 characters in length and cannot start with http:// or https://.</p>
         * <p>Default value: empty.</p>
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
         * EnablePrimaryIPv6.
         */
        public Builder enablePrimaryIPv6(Boolean enablePrimaryIPv6) {
            this.putQueryParameter("EnablePrimaryIPv6", enablePrimaryIPv6);
            this.enablePrimaryIPv6 = enablePrimaryIPv6;
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
         * <p>The ID of the network interface controller (NIC).</p>
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
         * <p>The name of the network interface controller (NIC). The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. The name can contain characters under the categorization of letter in Unicode, including English letters, Chinese characters, and digits. The name can also contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
         * <p>Default value: empty.</p>
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
         * <p>The communication parameter of the network interface controller (NIC).</p>
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
         * <p>The number of queues for the ENI. Valid values: 1 to 2048.</p>
         * <ul>
         * <li><p>You can modify the queue number of an ENI that is in the Available state, or an ENI that is in the InUse state but attached to an instance in the Stopped state.</p>
         * </li>
         * <li><p>The queue number cannot exceed the maximum number of queues per ENI allowed by the instance type. The total number of queues across all ENIs of an instance cannot exceed the total queue quota allowed by the instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the MaximumQueueNumberPerEni and TotalEniQueueQuantity fields for the instance type.</p>
         * </li>
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
         * <p>The region ID of the network interface controller (NIC). You can invoke <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The inbound queue depth of the network interface controller (NIC).</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available. To use this parameter, submit a ticket to request access.</p>
         * </blockquote>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter applies only to instances of the seventh generation or later.</li>
         * <li>This parameter currently applies only to Linux images.</li>
         * <li>A larger inbound queue depth can improve inbound throughput and reduce packet loss, but consumes more memory.</li>
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
         * <p>The list of security group IDs. The secondary network interface controller (NIC) joins the specified security groups and is removed from the existing security groups.</p>
         * <ul>
         * <li><p>Valid values of N depend on the maximum number of security groups to which a network interface controller (NIC) can belong. For more information, see <a href="~~25412#SecurityGroupQuota~~">Limits</a>.</p>
         * </li>
         * <li><p>The modification takes effect shortly, but a slight delay may occur.</p>
         * </li>
         * </ul>
         */
        public Builder securityGroupId(java.util.List<String> securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable source/destination checking. We recommend that you enable this feature to improve network security. Valid values:</p>
         * <ul>
         * <li><p>true: enabled.</p>
         * </li>
         * <li><p>false: disabled.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>Only specific regions support this feature. Before using this feature, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination checking</a>.</p>
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
         * <p>The outbound queue depth of the network interface controller (NIC).</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available. To use this parameter, submit a ticket to request access.</p>
         * </blockquote>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter applies only to instances of the seventh generation or later.</li>
         * <li>This parameter currently applies only to Linux images.</li>
         * <li>A larger outbound queue depth can improve outbound throughput and reduce packet loss, but consumes more memory.</li>
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

            private Builder() {
            } 

            private Builder(ConnectionTrackingConfiguration model) {
                this.tcpClosedAndTimeWaitTimeout = model.tcpClosedAndTimeWaitTimeout;
                this.tcpEstablishedTimeout = model.tcpEstablishedTimeout;
                this.udpTimeout = model.udpTimeout;
            } 

            /**
             * <p>The timeout period for TCP connections in the TIME_WAIT and CLOSED states. Unit: seconds. Valid values: integers from 3 to 15.</p>
             * <p>Default value: 3.</p>
             * <blockquote>
             * <p>If your ECS instance is used with NLB or CLB, the default timeout period for connections in the <code>TIME_WAIT</code> state is 15 seconds.</p>
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
             * <p>The timeout period for established TCP connections. Unit: seconds. Valid values: [30, 60, 80, 100, 200, 300, 500, 700, 910].</p>
             * <p>Default value: 910.</p>
             * 
             * <strong>example:</strong>
             * <p>910</p>
             */
            public Builder tcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
                this.tcpEstablishedTimeout = tcpEstablishedTimeout;
                return this;
            }

            /**
             * <p>The timeout period for UDP flows. Unit: seconds. Valid values: [10, 20, 30, 60, 80, 100].</p>
             * <p>Default value: 30.</p>
             * <blockquote>
             * <p>If your ECS instance is used with NLB or CLB, the default value is 100 seconds.</p>
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
        @com.aliyun.core.annotation.NameInMap("EnableExpress")
        private Boolean enableExpress;

        @com.aliyun.core.annotation.NameInMap("EnableRss")
        private Boolean enableRss;

        @com.aliyun.core.annotation.NameInMap("EnableSriov")
        private Boolean enableSriov;

        @com.aliyun.core.annotation.NameInMap("VirtualFunctionQuantity")
        private Integer virtualFunctionQuantity;

        @com.aliyun.core.annotation.NameInMap("VirtualFunctionTotalQueueNumber")
        private Integer virtualFunctionTotalQueueNumber;

        private EnhancedNetwork(Builder builder) {
            this.enableExpress = builder.enableExpress;
            this.enableRss = builder.enableRss;
            this.enableSriov = builder.enableSriov;
            this.virtualFunctionQuantity = builder.virtualFunctionQuantity;
            this.virtualFunctionTotalQueueNumber = builder.virtualFunctionTotalQueueNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnhancedNetwork create() {
            return builder().build();
        }

        /**
         * @return enableExpress
         */
        public Boolean getEnableExpress() {
            return this.enableExpress;
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

        /**
         * @return virtualFunctionQuantity
         */
        public Integer getVirtualFunctionQuantity() {
            return this.virtualFunctionQuantity;
        }

        /**
         * @return virtualFunctionTotalQueueNumber
         */
        public Integer getVirtualFunctionTotalQueueNumber() {
            return this.virtualFunctionTotalQueueNumber;
        }

        public static final class Builder {
            private Boolean enableExpress; 
            private Boolean enableRss; 
            private Boolean enableSriov; 
            private Integer virtualFunctionQuantity; 
            private Integer virtualFunctionTotalQueueNumber; 

            private Builder() {
            } 

            private Builder(EnhancedNetwork model) {
                this.enableExpress = model.enableExpress;
                this.enableRss = model.enableRss;
                this.enableSriov = model.enableSriov;
                this.virtualFunctionQuantity = model.virtualFunctionQuantity;
                this.virtualFunctionTotalQueueNumber = model.virtualFunctionTotalQueueNumber;
            } 

            /**
             * EnableExpress.
             */
            public Builder enableExpress(Boolean enableExpress) {
                this.enableExpress = enableExpress;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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

            /**
             * VirtualFunctionQuantity.
             */
            public Builder virtualFunctionQuantity(Integer virtualFunctionQuantity) {
                this.virtualFunctionQuantity = virtualFunctionQuantity;
                return this;
            }

            /**
             * VirtualFunctionTotalQueueNumber.
             */
            public Builder virtualFunctionTotalQueueNumber(Integer virtualFunctionTotalQueueNumber) {
                this.virtualFunctionTotalQueueNumber = virtualFunctionTotalQueueNumber;
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

            private Builder() {
            } 

            private Builder(NetworkInterfaceTrafficConfig model) {
                this.networkInterfaceTrafficMode = model.networkInterfaceTrafficMode;
                this.queueNumber = model.queueNumber;
                this.queuePairNumber = model.queuePairNumber;
                this.rxQueueSize = model.rxQueueSize;
                this.txQueueSize = model.txQueueSize;
            } 

            /**
             * <p>The communication pattern of the network interface controller (NIC). Valid values:</p>
             * <ul>
             * <li>Standard: uses the TCP communication pattern.</li>
             * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication pattern.</li>
             * </ul>
             * <p>When the network interface controller (NIC) is in the attached state, take note of the following items:</p>
             * <ul>
             * <li>The total number of RDMA network interface controllers (NICs) of an instance cannot exceed the RDMA network interface controller (NIC) quota allowed by the instance type. You can call DescribeInstanceTypes to query the EriQuantity field for the RDMA network interface controller (NIC) quota.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
             * <p>The number of queues for the network interface controller (NIC).
             * When the network interface controller (NIC) is in the attached state, take note of the following items:</p>
             * <ul>
             * <li>The value cannot exceed the maximum number of queues per network interface controller (NIC) allowed by the instance type.</li>
             * <li>The total number of queues across all network interface controllers (NICs) of an instance cannot exceed the total queue quota allowed by the instance type. You can call DescribeInstanceTypes to query the MaximumQueueNumberPerEni and TotalEniQueueQuantity fields.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
             * <p>The number of RDMA queues for the network interface controller (NIC).
             * When the network interface controller (NIC) is in the attached state, take note of the following items:</p>
             * <ul>
             * <li>The value cannot exceed the maximum number of queues per RDMA network interface controller (NIC) allowed by the instance type. You can call DescribeInstanceTypes to query the QueuePairNumber field for the maximum number of queues per RDMA network interface controller (NIC).</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
             * <p>The inbound queue depth of the network interface controller (NIC).</p>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available. To use this parameter, submit a ticket to request access.</p>
             * </blockquote>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>This parameter applies only to instances of the seventh generation or later.</li>
             * <li>This parameter currently applies only to Linux images.</li>
             * <li>A larger inbound queue depth can improve inbound throughput and reduce packet loss, but consumes more memory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder rxQueueSize(Integer rxQueueSize) {
                this.rxQueueSize = rxQueueSize;
                return this;
            }

            /**
             * <p>The outbound queue depth of the network interface controller (NIC).</p>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available. To use this parameter, submit a ticket to request access.</p>
             * </blockquote>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>This parameter applies only to instances of the seventh generation or later.</li>
             * <li>This parameter currently applies only to Linux images.</li>
             * <li>A larger outbound queue depth can improve outbound throughput and reduce packet loss, but consumes more memory.</li>
             * </ul>
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
