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
 * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
 */
public class DescribeNetworkInterfaceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociatedPublicIp")
    private AssociatedPublicIp associatedPublicIp;

    @com.aliyun.core.annotation.NameInMap("Attachment")
    private Attachment attachment;

    @com.aliyun.core.annotation.NameInMap("BondInterfaceSpecification")
    private BondInterfaceSpecification bondInterfaceSpecification;

    @com.aliyun.core.annotation.NameInMap("ConnectionTrackingConfiguration")
    private ConnectionTrackingConfiguration connectionTrackingConfiguration;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DeleteOnRelease")
    private Boolean deleteOnRelease;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnhancedNetwork")
    private EnhancedNetwork enhancedNetwork;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Ipv4PrefixSets")
    private Ipv4PrefixSets ipv4PrefixSets;

    @com.aliyun.core.annotation.NameInMap("Ipv6PrefixSets")
    private Ipv6PrefixSets ipv6PrefixSets;

    @com.aliyun.core.annotation.NameInMap("Ipv6Sets")
    private Ipv6Sets ipv6Sets;

    @com.aliyun.core.annotation.NameInMap("MacAddress")
    private String macAddress;

    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficConfig")
    private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.NameInMap("PrivateIpSets")
    private PrivateIpSets privateIpSets;

    @com.aliyun.core.annotation.NameInMap("QueueNumber")
    private Integer queueNumber;

    @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
    private Integer queuePairNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private SecurityGroupIds securityGroupIds;

    @com.aliyun.core.annotation.NameInMap("ServiceID")
    private Long serviceID;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("SlaveInterfaceSpecification")
    private SlaveInterfaceSpecification slaveInterfaceSpecification;

    @com.aliyun.core.annotation.NameInMap("SourceDestCheck")
    private Boolean sourceDestCheck;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("TcpOptionAddressEnabled")
    private String tcpOptionAddressEnabled;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeNetworkInterfaceAttributeResponseBody(Builder builder) {
        this.associatedPublicIp = builder.associatedPublicIp;
        this.attachment = builder.attachment;
        this.bondInterfaceSpecification = builder.bondInterfaceSpecification;
        this.connectionTrackingConfiguration = builder.connectionTrackingConfiguration;
        this.creationTime = builder.creationTime;
        this.deleteOnRelease = builder.deleteOnRelease;
        this.description = builder.description;
        this.enhancedNetwork = builder.enhancedNetwork;
        this.instanceId = builder.instanceId;
        this.ipv4PrefixSets = builder.ipv4PrefixSets;
        this.ipv6PrefixSets = builder.ipv6PrefixSets;
        this.ipv6Sets = builder.ipv6Sets;
        this.macAddress = builder.macAddress;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.networkInterfaceTrafficConfig = builder.networkInterfaceTrafficConfig;
        this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
        this.ownerId = builder.ownerId;
        this.privateIpAddress = builder.privateIpAddress;
        this.privateIpSets = builder.privateIpSets;
        this.queueNumber = builder.queueNumber;
        this.queuePairNumber = builder.queuePairNumber;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.serviceID = builder.serviceID;
        this.serviceManaged = builder.serviceManaged;
        this.slaveInterfaceSpecification = builder.slaveInterfaceSpecification;
        this.sourceDestCheck = builder.sourceDestCheck;
        this.status = builder.status;
        this.tags = builder.tags;
        this.tcpOptionAddressEnabled = builder.tcpOptionAddressEnabled;
        this.type = builder.type;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfaceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return associatedPublicIp
     */
    public AssociatedPublicIp getAssociatedPublicIp() {
        return this.associatedPublicIp;
    }

    /**
     * @return attachment
     */
    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * @return bondInterfaceSpecification
     */
    public BondInterfaceSpecification getBondInterfaceSpecification() {
        return this.bondInterfaceSpecification;
    }

    /**
     * @return connectionTrackingConfiguration
     */
    public ConnectionTrackingConfiguration getConnectionTrackingConfiguration() {
        return this.connectionTrackingConfiguration;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipv4PrefixSets
     */
    public Ipv4PrefixSets getIpv4PrefixSets() {
        return this.ipv4PrefixSets;
    }

    /**
     * @return ipv6PrefixSets
     */
    public Ipv6PrefixSets getIpv6PrefixSets() {
        return this.ipv6PrefixSets;
    }

    /**
     * @return ipv6Sets
     */
    public Ipv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    /**
     * @return macAddress
     */
    public String getMacAddress() {
        return this.macAddress;
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
     * @return networkInterfaceTrafficMode
     */
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return privateIpSets
     */
    public PrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityGroupIds
     */
    public SecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return serviceID
     */
    public Long getServiceID() {
        return this.serviceID;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return slaveInterfaceSpecification
     */
    public SlaveInterfaceSpecification getSlaveInterfaceSpecification() {
        return this.slaveInterfaceSpecification;
    }

    /**
     * @return sourceDestCheck
     */
    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return tcpOptionAddressEnabled
     */
    public String getTcpOptionAddressEnabled() {
        return this.tcpOptionAddressEnabled;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private AssociatedPublicIp associatedPublicIp; 
        private Attachment attachment; 
        private BondInterfaceSpecification bondInterfaceSpecification; 
        private ConnectionTrackingConfiguration connectionTrackingConfiguration; 
        private String creationTime; 
        private Boolean deleteOnRelease; 
        private String description; 
        private EnhancedNetwork enhancedNetwork; 
        private String instanceId; 
        private Ipv4PrefixSets ipv4PrefixSets; 
        private Ipv6PrefixSets ipv6PrefixSets; 
        private Ipv6Sets ipv6Sets; 
        private String macAddress; 
        private String networkInterfaceId; 
        private String networkInterfaceName; 
        private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig; 
        private String networkInterfaceTrafficMode; 
        private String ownerId; 
        private String privateIpAddress; 
        private PrivateIpSets privateIpSets; 
        private Integer queueNumber; 
        private Integer queuePairNumber; 
        private String requestId; 
        private String resourceGroupId; 
        private SecurityGroupIds securityGroupIds; 
        private Long serviceID; 
        private Boolean serviceManaged; 
        private SlaveInterfaceSpecification slaveInterfaceSpecification; 
        private Boolean sourceDestCheck; 
        private String status; 
        private Tags tags; 
        private String tcpOptionAddressEnabled; 
        private String type; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        /**
         * <p>Details about the elastic IP address (EIP) that is associated with the secondary private IP address of the ENI.</p>
         */
        public Builder associatedPublicIp(AssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and unavailable for general users.</p>
         * </blockquote>
         */
        public Builder attachment(Attachment attachment) {
            this.attachment = attachment;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and unavailable for general users.</p>
         * </blockquote>
         */
        public Builder bondInterfaceSpecification(BondInterfaceSpecification bondInterfaceSpecification) {
            this.bondInterfaceSpecification = bondInterfaceSpecification;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         */
        public Builder connectionTrackingConfiguration(ConnectionTrackingConfiguration connectionTrackingConfiguration) {
            this.connectionTrackingConfiguration = connectionTrackingConfiguration;
            return this;
        }

        /**
         * <p>The time when the ENI was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-25T12:31:31Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>Indicates whether to retain the ENI when the associated instance is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteOnRelease(Boolean deleteOnRelease) {
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }

        /**
         * <p>The description of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is not publicly available.</p>
         */
        public Builder enhancedNetwork(EnhancedNetwork enhancedNetwork) {
            this.enhancedNetwork = enhancedNetwork;
            return this;
        }

        /**
         * <p>The ID of the instance to which the ENI is attached.</p>
         * <blockquote>
         * <p> If the ENI is managed and controlled by other Alibaba Cloud services, no instance ID is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-bp1e2l6djkndyuli****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IPv4 prefixes of the ENI.</p>
         */
        public Builder ipv4PrefixSets(Ipv4PrefixSets ipv4PrefixSets) {
            this.ipv4PrefixSets = ipv4PrefixSets;
            return this;
        }

        /**
         * <p>The IPv6 prefixes of the ENI.</p>
         */
        public Builder ipv6PrefixSets(Ipv6PrefixSets ipv6PrefixSets) {
            this.ipv6PrefixSets = ipv6PrefixSets;
            return this;
        }

        /**
         * <p>The IPv6 addresses of the ENI.</p>
         */
        public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }

        /**
         * <p>The media access control (MAC) address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:3e:12:<strong>:</strong></p>
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        /**
         * <p>The ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp125p95hhdhn3ot****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * <p>The name of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>my-eni-name</p>
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * <p>The communication settings of the ENI.</p>
         */
        public Builder networkInterfaceTrafficConfig(NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
            this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;
            return this;
        }

        /**
         * <p>The communication mode of the ENI. Valid values:</p>
         * <ul>
         * <li>Standard: The TCP communication mode is used.</li>
         * <li>HighPerformance: The Elastic RDMA Interface (ERI) feature is enabled and the remote direct memory access (RDMA) communication mode is used.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter can have a value of HighPerformance only when the ENI is attached to a c7re RDMA-enhanced instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * <p>The ID of the account to which the ENI belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The private IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p><code>10.1.**.**</code></p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The private IP addresses of the ENI.</p>
         */
        public Builder privateIpSets(PrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }

        /**
         * <p>The number of queues supported by the ENI.</p>
         * <ul>
         * <li><p>For a primary ENI: The default number of queues that the instance type supports for the ENI is returned.</p>
         * </li>
         * <li><p>For a secondary ENI:</p>
         * <ul>
         * <li><p>When the ENI is in the InUse state, the following situations occur for the QueueNumber parameter:</p>
         * <ul>
         * <li>If the number of queues supported by the ENI has not been modified, the default number of queues that the instance type supports for the ENI is returned.</li>
         * <li>If the number of queues supported by the ENI has been modified, the new number of queues is returned.</li>
         * </ul>
         * </li>
         * <li><p>When the ENI is in the Available state, the following situations occur for the QueueNumber parameter:</p>
         * <ul>
         * <li>If the number of queues supported by the ENI has not been modified, the return value is empty.</li>
         * <li>If the number of queues supported by the ENI has been modified, the new number of queues is returned.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder queueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and unavailable for general users.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder queuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs. If this parameter is specified to query ENIs, up to 1,000 ENIs that belong to the specified resource group can be displayed in the response.</p>
         * <blockquote>
         * <p> ENIs in the default resource group are displayed in the response regardless of how this parameter is set.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The IDs of the security groups to which the ENI belongs.</p>
         */
        public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The ID of the distributor to which the ENI belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
         */
        public Builder serviceID(Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        /**
         * <p>Indicates whether the user of the ENI is an Alibaba Cloud service or a distributor.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and unavailable for general users.</p>
         * </blockquote>
         */
        public Builder slaveInterfaceSpecification(SlaveInterfaceSpecification slaveInterfaceSpecification) {
            this.slaveInterfaceSpecification = slaveInterfaceSpecification;
            return this;
        }

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sourceDestCheck(Boolean sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        /**
         * <p>The state of the ENI. Valid values:</p>
         * <ul>
         * <li>Available: The ENI is not attached to an instance.</li>
         * <li>Attaching: The ENI is being attached to an instance.</li>
         * <li>InUse: The ENI is attached to an instance.</li>
         * <li>Detaching: The ENI is being detached from an instance.</li>
         * <li>Deleting: The ENI is being deleted.</li>
         * </ul>
         * <p>This parameter is empty by default, which indicates that all states are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The tags of the ENI.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder tcpOptionAddressEnabled(String tcpOptionAddressEnabled) {
            this.tcpOptionAddressEnabled = tcpOptionAddressEnabled;
            return this;
        }

        /**
         * <p>The type of the ENI. Valid values:</p>
         * <ul>
         * <li>Primary</li>
         * <li>Secondary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Secondary</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the ENI is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1s5fnvk4gn2tws0****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the ENI belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp67acfmxazb4p****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeNetworkInterfaceAttributeResponseBody build() {
            return new DescribeNetworkInterfaceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class AssociatedPublicIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        private AssociatedPublicIp(Builder builder) {
            this.allocationId = builder.allocationId;
            this.publicIpAddress = builder.publicIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedPublicIp create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public static final class Builder {
            private String allocationId; 
            private String publicIpAddress; 

            /**
             * <p>The ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p><code>116.62.**.**</code></p>
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            public AssociatedPublicIp build() {
                return new AssociatedPublicIp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class MemberNetworkInterfaceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberNetworkInterfaceId")
        private java.util.List<String> memberNetworkInterfaceId;

        private MemberNetworkInterfaceIds(Builder builder) {
            this.memberNetworkInterfaceId = builder.memberNetworkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberNetworkInterfaceIds create() {
            return builder().build();
        }

        /**
         * @return memberNetworkInterfaceId
         */
        public java.util.List<String> getMemberNetworkInterfaceId() {
            return this.memberNetworkInterfaceId;
        }

        public static final class Builder {
            private java.util.List<String> memberNetworkInterfaceId; 

            /**
             * MemberNetworkInterfaceId.
             */
            public Builder memberNetworkInterfaceId(java.util.List<String> memberNetworkInterfaceId) {
                this.memberNetworkInterfaceId = memberNetworkInterfaceId;
                return this;
            }

            public MemberNetworkInterfaceIds build() {
                return new MemberNetworkInterfaceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Attachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceIndex")
        private Integer deviceIndex;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MemberNetworkInterfaceIds")
        private MemberNetworkInterfaceIds memberNetworkInterfaceIds;

        @com.aliyun.core.annotation.NameInMap("NetworkCardIndex")
        private Integer networkCardIndex;

        @com.aliyun.core.annotation.NameInMap("TrunkNetworkInterfaceId")
        private String trunkNetworkInterfaceId;

        private Attachment(Builder builder) {
            this.deviceIndex = builder.deviceIndex;
            this.instanceId = builder.instanceId;
            this.memberNetworkInterfaceIds = builder.memberNetworkInterfaceIds;
            this.networkCardIndex = builder.networkCardIndex;
            this.trunkNetworkInterfaceId = builder.trunkNetworkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachment create() {
            return builder().build();
        }

        /**
         * @return deviceIndex
         */
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return memberNetworkInterfaceIds
         */
        public MemberNetworkInterfaceIds getMemberNetworkInterfaceIds() {
            return this.memberNetworkInterfaceIds;
        }

        /**
         * @return networkCardIndex
         */
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        /**
         * @return trunkNetworkInterfaceId
         */
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

        public static final class Builder {
            private Integer deviceIndex; 
            private String instanceId; 
            private MemberNetworkInterfaceIds memberNetworkInterfaceIds; 
            private Integer networkCardIndex; 
            private String trunkNetworkInterfaceId; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder deviceIndex(Integer deviceIndex) {
                this.deviceIndex = deviceIndex;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             */
            public Builder memberNetworkInterfaceIds(MemberNetworkInterfaceIds memberNetworkInterfaceIds) {
                this.memberNetworkInterfaceIds = memberNetworkInterfaceIds;
                return this;
            }

            /**
             * <p>The index of the network interface controller (NIC).</p>
             * <ul>
             * <li>If the ENI is in the Available state or if no NIC index was specified when the ENI was attached, this parameter has no value.</li>
             * <li>If the ENI is in the InUse state and an NIC index was specified when the ENI was attached, the specified NIC index is returned as the value of this parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder networkCardIndex(Integer networkCardIndex) {
                this.networkCardIndex = networkCardIndex;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder trunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
                this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
                return this;
            }

            public Attachment build() {
                return new Attachment(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class SlaveInterfaceSpecificationSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondNetworkInterfaceId")
        private String bondNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("SlaveNetworkInterfaceId")
        private String slaveNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("WorkState")
        private String workState;

        private SlaveInterfaceSpecificationSet(Builder builder) {
            this.bondNetworkInterfaceId = builder.bondNetworkInterfaceId;
            this.slaveNetworkInterfaceId = builder.slaveNetworkInterfaceId;
            this.workState = builder.workState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveInterfaceSpecificationSet create() {
            return builder().build();
        }

        /**
         * @return bondNetworkInterfaceId
         */
        public String getBondNetworkInterfaceId() {
            return this.bondNetworkInterfaceId;
        }

        /**
         * @return slaveNetworkInterfaceId
         */
        public String getSlaveNetworkInterfaceId() {
            return this.slaveNetworkInterfaceId;
        }

        /**
         * @return workState
         */
        public String getWorkState() {
            return this.workState;
        }

        public static final class Builder {
            private String bondNetworkInterfaceId; 
            private String slaveNetworkInterfaceId; 
            private String workState; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder bondNetworkInterfaceId(String bondNetworkInterfaceId) {
                this.bondNetworkInterfaceId = bondNetworkInterfaceId;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder slaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
                this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder workState(String workState) {
                this.workState = workState;
                return this;
            }

            public SlaveInterfaceSpecificationSet build() {
                return new SlaveInterfaceSpecificationSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class BondInterfaceSpecificationSlaveInterfaceSpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlaveInterfaceSpecificationSet")
        private java.util.List<SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet;

        private BondInterfaceSpecificationSlaveInterfaceSpecification(Builder builder) {
            this.slaveInterfaceSpecificationSet = builder.slaveInterfaceSpecificationSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BondInterfaceSpecificationSlaveInterfaceSpecification create() {
            return builder().build();
        }

        /**
         * @return slaveInterfaceSpecificationSet
         */
        public java.util.List<SlaveInterfaceSpecificationSet> getSlaveInterfaceSpecificationSet() {
            return this.slaveInterfaceSpecificationSet;
        }

        public static final class Builder {
            private java.util.List<SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet; 

            /**
             * SlaveInterfaceSpecificationSet.
             */
            public Builder slaveInterfaceSpecificationSet(java.util.List<SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet) {
                this.slaveInterfaceSpecificationSet = slaveInterfaceSpecificationSet;
                return this;
            }

            public BondInterfaceSpecificationSlaveInterfaceSpecification build() {
                return new BondInterfaceSpecificationSlaveInterfaceSpecification(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class BondInterfaceSpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondMode")
        private String bondMode;

        @com.aliyun.core.annotation.NameInMap("SlaveInterfaceSpecification")
        private BondInterfaceSpecificationSlaveInterfaceSpecification slaveInterfaceSpecification;

        private BondInterfaceSpecification(Builder builder) {
            this.bondMode = builder.bondMode;
            this.slaveInterfaceSpecification = builder.slaveInterfaceSpecification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BondInterfaceSpecification create() {
            return builder().build();
        }

        /**
         * @return bondMode
         */
        public String getBondMode() {
            return this.bondMode;
        }

        /**
         * @return slaveInterfaceSpecification
         */
        public BondInterfaceSpecificationSlaveInterfaceSpecification getSlaveInterfaceSpecification() {
            return this.slaveInterfaceSpecification;
        }

        public static final class Builder {
            private String bondMode; 
            private BondInterfaceSpecificationSlaveInterfaceSpecification slaveInterfaceSpecification; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder bondMode(String bondMode) {
                this.bondMode = bondMode;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             */
            public Builder slaveInterfaceSpecification(BondInterfaceSpecificationSlaveInterfaceSpecification slaveInterfaceSpecification) {
                this.slaveInterfaceSpecification = slaveInterfaceSpecification;
                return this;
            }

            public BondInterfaceSpecification build() {
                return new BondInterfaceSpecification(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
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
             * <p> This parameter is not publicly available.</p>
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
             * <p> This parameter is not publicly available.</p>
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
             * <p> This parameter is not publicly available.</p>
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
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
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
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Ipv4PrefixSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4Prefix")
        private String ipv4Prefix;

        private Ipv4PrefixSet(Builder builder) {
            this.ipv4Prefix = builder.ipv4Prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4PrefixSet create() {
            return builder().build();
        }

        /**
         * @return ipv4Prefix
         */
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

        public static final class Builder {
            private String ipv4Prefix; 

            /**
             * <p>The IPv4 prefix of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.**.0/28</p>
             */
            public Builder ipv4Prefix(String ipv4Prefix) {
                this.ipv4Prefix = ipv4Prefix;
                return this;
            }

            public Ipv4PrefixSet build() {
                return new Ipv4PrefixSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Ipv4PrefixSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4PrefixSet")
        private java.util.List<Ipv4PrefixSet> ipv4PrefixSet;

        private Ipv4PrefixSets(Builder builder) {
            this.ipv4PrefixSet = builder.ipv4PrefixSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4PrefixSets create() {
            return builder().build();
        }

        /**
         * @return ipv4PrefixSet
         */
        public java.util.List<Ipv4PrefixSet> getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
        }

        public static final class Builder {
            private java.util.List<Ipv4PrefixSet> ipv4PrefixSet; 

            /**
             * Ipv4PrefixSet.
             */
            public Builder ipv4PrefixSet(java.util.List<Ipv4PrefixSet> ipv4PrefixSet) {
                this.ipv4PrefixSet = ipv4PrefixSet;
                return this;
            }

            public Ipv4PrefixSets build() {
                return new Ipv4PrefixSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Ipv6PrefixSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Prefix")
        private String ipv6Prefix;

        private Ipv6PrefixSet(Builder builder) {
            this.ipv6Prefix = builder.ipv6Prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6PrefixSet create() {
            return builder().build();
        }

        /**
         * @return ipv6Prefix
         */
        public String getIpv6Prefix() {
            return this.ipv6Prefix;
        }

        public static final class Builder {
            private String ipv6Prefix; 

            /**
             * <p>The IPv6 prefix of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:db8:1234:1a00:****::/80</p>
             */
            public Builder ipv6Prefix(String ipv6Prefix) {
                this.ipv6Prefix = ipv6Prefix;
                return this;
            }

            public Ipv6PrefixSet build() {
                return new Ipv6PrefixSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Ipv6PrefixSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6PrefixSet")
        private java.util.List<Ipv6PrefixSet> ipv6PrefixSet;

        private Ipv6PrefixSets(Builder builder) {
            this.ipv6PrefixSet = builder.ipv6PrefixSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6PrefixSets create() {
            return builder().build();
        }

        /**
         * @return ipv6PrefixSet
         */
        public java.util.List<Ipv6PrefixSet> getIpv6PrefixSet() {
            return this.ipv6PrefixSet;
        }

        public static final class Builder {
            private java.util.List<Ipv6PrefixSet> ipv6PrefixSet; 

            /**
             * Ipv6PrefixSet.
             */
            public Builder ipv6PrefixSet(java.util.List<Ipv6PrefixSet> ipv6PrefixSet) {
                this.ipv6PrefixSet = ipv6PrefixSet;
                return this;
            }

            public Ipv6PrefixSets build() {
                return new Ipv6PrefixSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Ipv6Set extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        private Ipv6Set(Builder builder) {
            this.ipv6Address = builder.ipv6Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Set create() {
            return builder().build();
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private String ipv6Address; 

            /**
             * <p>The IPv6 address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:db8:1234:1a00::****</p>
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            public Ipv6Set build() {
                return new Ipv6Set(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Ipv6Sets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Set")
        private java.util.List<Ipv6Set> ipv6Set;

        private Ipv6Sets(Builder builder) {
            this.ipv6Set = builder.ipv6Set;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Sets create() {
            return builder().build();
        }

        /**
         * @return ipv6Set
         */
        public java.util.List<Ipv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

        public static final class Builder {
            private java.util.List<Ipv6Set> ipv6Set; 

            /**
             * Ipv6Set.
             */
            public Builder ipv6Set(java.util.List<Ipv6Set> ipv6Set) {
                this.ipv6Set = ipv6Set;
                return this;
            }

            public Ipv6Sets build() {
                return new Ipv6Sets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class NetworkInterfaceTrafficConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("QueueNumber")
        private Integer queueNumber;

        @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
        private Integer queuePairNumber;

        private NetworkInterfaceTrafficConfig(Builder builder) {
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.queueNumber = builder.queueNumber;
            this.queuePairNumber = builder.queuePairNumber;
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

        public static final class Builder {
            private String networkInterfaceTrafficMode; 
            private Integer queueNumber; 
            private Integer queuePairNumber; 

            /**
             * <p>The communication mode of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>HighPerformance</p>
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * <p>The number of queues supported by the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder queueNumber(Integer queueNumber) {
                this.queueNumber = queueNumber;
                return this;
            }

            /**
             * <p>The number of queues supported by the ERI.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            public NetworkInterfaceTrafficConfig build() {
                return new NetworkInterfaceTrafficConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class PrivateIpSetAssociatedPublicIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        private PrivateIpSetAssociatedPublicIp(Builder builder) {
            this.allocationId = builder.allocationId;
            this.publicIpAddress = builder.publicIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSetAssociatedPublicIp create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public static final class Builder {
            private String allocationId; 
            private String publicIpAddress; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p><code>116.62.**.**</code></p>
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            public PrivateIpSetAssociatedPublicIp build() {
                return new PrivateIpSetAssociatedPublicIp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class PrivateIpSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedPublicIp")
        private PrivateIpSetAssociatedPublicIp associatedPublicIp;

        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSet(Builder builder) {
            this.associatedPublicIp = builder.associatedPublicIp;
            this.primary = builder.primary;
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSet create() {
            return builder().build();
        }

        /**
         * @return associatedPublicIp
         */
        public PrivateIpSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private PrivateIpSetAssociatedPublicIp associatedPublicIp; 
            private Boolean primary; 
            private String privateIpAddress; 

            /**
             * <p>The EIP that is associated with the secondary private IP address of the ENI.</p>
             */
            public Builder associatedPublicIp(PrivateIpSetAssociatedPublicIp associatedPublicIp) {
                this.associatedPublicIp = associatedPublicIp;
                return this;
            }

            /**
             * <p>Indicates whether the IP address is the primary private IP address. Valid values:</p>
             * <ul>
             * <li>true: The IP address is the primary private IP address.</li>
             * <li>false: The IP address is a secondary private IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * <p>The private IP address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.17.**.**</code></p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public PrivateIpSet build() {
                return new PrivateIpSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class PrivateIpSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateIpSet")
        private java.util.List<PrivateIpSet> privateIpSet;

        private PrivateIpSets(Builder builder) {
            this.privateIpSet = builder.privateIpSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSets create() {
            return builder().build();
        }

        /**
         * @return privateIpSet
         */
        public java.util.List<PrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

        public static final class Builder {
            private java.util.List<PrivateIpSet> privateIpSet; 

            /**
             * PrivateIpSet.
             */
            public Builder privateIpSet(java.util.List<PrivateIpSet> privateIpSet) {
                this.privateIpSet = privateIpSet;
                return this;
            }

            public PrivateIpSets build() {
                return new PrivateIpSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class SecurityGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private java.util.List<String> securityGroupId;

        private SecurityGroupIds(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List<String> securityGroupId; 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List<String> securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class SlaveInterfaceSpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondNetworkInterfaceId")
        private String bondNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("SlaveNetworkInterfaceId")
        private String slaveNetworkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("WorkState")
        private String workState;

        private SlaveInterfaceSpecification(Builder builder) {
            this.bondNetworkInterfaceId = builder.bondNetworkInterfaceId;
            this.slaveNetworkInterfaceId = builder.slaveNetworkInterfaceId;
            this.workState = builder.workState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveInterfaceSpecification create() {
            return builder().build();
        }

        /**
         * @return bondNetworkInterfaceId
         */
        public String getBondNetworkInterfaceId() {
            return this.bondNetworkInterfaceId;
        }

        /**
         * @return slaveNetworkInterfaceId
         */
        public String getSlaveNetworkInterfaceId() {
            return this.slaveNetworkInterfaceId;
        }

        /**
         * @return workState
         */
        public String getWorkState() {
            return this.workState;
        }

        public static final class Builder {
            private String bondNetworkInterfaceId; 
            private String slaveNetworkInterfaceId; 
            private String workState; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder bondNetworkInterfaceId(String bondNetworkInterfaceId) {
                this.bondNetworkInterfaceId = bondNetworkInterfaceId;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder slaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
                this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and unavailable for general users.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder workState(String workState) {
                this.workState = workState;
                return this;
            }

            public SlaveInterfaceSpecification build() {
                return new SlaveInterfaceSpecification(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
