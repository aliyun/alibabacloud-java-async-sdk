// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
 */
public class DescribeNetworkInterfaceAttributeResponseBody extends TeaModel {
    @NameInMap("AssociatedPublicIp")
    private AssociatedPublicIp associatedPublicIp;

    @NameInMap("Attachment")
    private Attachment attachment;

    @NameInMap("BondInterfaceSpecification")
    private BondInterfaceSpecification bondInterfaceSpecification;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Ipv6Sets")
    private Ipv6Sets ipv6Sets;

    @NameInMap("MacAddress")
    private String macAddress;

    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @NameInMap("PrivateIpSets")
    private PrivateIpSets privateIpSets;

    @NameInMap("QueueNumber")
    private Integer queueNumber;

    @NameInMap("QueuePairNumber")
    private Integer queuePairNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SecurityGroupIds")
    private SecurityGroupIds securityGroupIds;

    @NameInMap("ServiceID")
    private Long serviceID;

    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @NameInMap("SlaveInterfaceSpecification")
    private SlaveInterfaceSpecification slaveInterfaceSpecification;

    @NameInMap("Status")
    private String status;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("Type")
    private String type;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeNetworkInterfaceAttributeResponseBody(Builder builder) {
        this.associatedPublicIp = builder.associatedPublicIp;
        this.attachment = builder.attachment;
        this.bondInterfaceSpecification = builder.bondInterfaceSpecification;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.ipv6Sets = builder.ipv6Sets;
        this.macAddress = builder.macAddress;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.networkInterfaceName = builder.networkInterfaceName;
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
        this.status = builder.status;
        this.tags = builder.tags;
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
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String creationTime; 
        private String description; 
        private String instanceId; 
        private Ipv6Sets ipv6Sets; 
        private String macAddress; 
        private String networkInterfaceId; 
        private String networkInterfaceName; 
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
        private String status; 
        private Tags tags; 
        private String type; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        /**
         * AssociatedPublicIp.
         */
        public Builder associatedPublicIp(AssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }

        /**
         * Attachment.
         */
        public Builder attachment(Attachment attachment) {
            this.attachment = attachment;
            return this;
        }

        /**
         * BondInterfaceSpecification.
         */
        public Builder bondInterfaceSpecification(BondInterfaceSpecification bondInterfaceSpecification) {
            this.bondInterfaceSpecification = bondInterfaceSpecification;
            return this;
        }

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * Ipv6Sets.
         */
        public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }

        /**
         * MacAddress.
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        /**
         * NetworkInterfaceId.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * NetworkInterfaceName.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * NetworkInterfaceTrafficMode.
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * PrivateIpSets.
         */
        public Builder privateIpSets(PrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }

        /**
         * QueueNumber.
         */
        public Builder queueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * QueuePairNumber.
         */
        public Builder queuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SecurityGroupIds.
         */
        public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * ServiceID.
         */
        public Builder serviceID(Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        /**
         * ServiceManaged.
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * SlaveInterfaceSpecification.
         */
        public Builder slaveInterfaceSpecification(SlaveInterfaceSpecification slaveInterfaceSpecification) {
            this.slaveInterfaceSpecification = slaveInterfaceSpecification;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeNetworkInterfaceAttributeResponseBody build() {
            return new DescribeNetworkInterfaceAttributeResponseBody(this);
        } 

    } 

    public static class AssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("PublicIpAddress")
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
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * PublicIpAddress.
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
    public static class MemberNetworkInterfaceIds extends TeaModel {
        @NameInMap("MemberNetworkInterfaceId")
        private java.util.List < String > memberNetworkInterfaceId;

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
        public java.util.List < String > getMemberNetworkInterfaceId() {
            return this.memberNetworkInterfaceId;
        }

        public static final class Builder {
            private java.util.List < String > memberNetworkInterfaceId; 

            /**
             * MemberNetworkInterfaceId.
             */
            public Builder memberNetworkInterfaceId(java.util.List < String > memberNetworkInterfaceId) {
                this.memberNetworkInterfaceId = memberNetworkInterfaceId;
                return this;
            }

            public MemberNetworkInterfaceIds build() {
                return new MemberNetworkInterfaceIds(this);
            } 

        } 

    }
    public static class Attachment extends TeaModel {
        @NameInMap("DeviceIndex")
        private Integer deviceIndex;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MemberNetworkInterfaceIds")
        private MemberNetworkInterfaceIds memberNetworkInterfaceIds;

        @NameInMap("TrunkNetworkInterfaceId")
        private String trunkNetworkInterfaceId;

        private Attachment(Builder builder) {
            this.deviceIndex = builder.deviceIndex;
            this.instanceId = builder.instanceId;
            this.memberNetworkInterfaceIds = builder.memberNetworkInterfaceIds;
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
         * @return trunkNetworkInterfaceId
         */
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

        public static final class Builder {
            private Integer deviceIndex; 
            private String instanceId; 
            private MemberNetworkInterfaceIds memberNetworkInterfaceIds; 
            private String trunkNetworkInterfaceId; 

            /**
             * DeviceIndex.
             */
            public Builder deviceIndex(Integer deviceIndex) {
                this.deviceIndex = deviceIndex;
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
             * MemberNetworkInterfaceIds.
             */
            public Builder memberNetworkInterfaceIds(MemberNetworkInterfaceIds memberNetworkInterfaceIds) {
                this.memberNetworkInterfaceIds = memberNetworkInterfaceIds;
                return this;
            }

            /**
             * TrunkNetworkInterfaceId.
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
    public static class SlaveInterfaceSpecificationSet extends TeaModel {
        @NameInMap("BondNetworkInterfaceId")
        private String bondNetworkInterfaceId;

        @NameInMap("SlaveNetworkInterfaceId")
        private String slaveNetworkInterfaceId;

        @NameInMap("WorkState")
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
             * BondNetworkInterfaceId.
             */
            public Builder bondNetworkInterfaceId(String bondNetworkInterfaceId) {
                this.bondNetworkInterfaceId = bondNetworkInterfaceId;
                return this;
            }

            /**
             * SlaveNetworkInterfaceId.
             */
            public Builder slaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
                this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
                return this;
            }

            /**
             * WorkState.
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
    public static class BondInterfaceSpecificationSlaveInterfaceSpecification extends TeaModel {
        @NameInMap("SlaveInterfaceSpecificationSet")
        private java.util.List < SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet;

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
        public java.util.List < SlaveInterfaceSpecificationSet> getSlaveInterfaceSpecificationSet() {
            return this.slaveInterfaceSpecificationSet;
        }

        public static final class Builder {
            private java.util.List < SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet; 

            /**
             * SlaveInterfaceSpecificationSet.
             */
            public Builder slaveInterfaceSpecificationSet(java.util.List < SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet) {
                this.slaveInterfaceSpecificationSet = slaveInterfaceSpecificationSet;
                return this;
            }

            public BondInterfaceSpecificationSlaveInterfaceSpecification build() {
                return new BondInterfaceSpecificationSlaveInterfaceSpecification(this);
            } 

        } 

    }
    public static class BondInterfaceSpecification extends TeaModel {
        @NameInMap("BondMode")
        private String bondMode;

        @NameInMap("SlaveInterfaceSpecification")
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
             * BondMode.
             */
            public Builder bondMode(String bondMode) {
                this.bondMode = bondMode;
                return this;
            }

            /**
             * SlaveInterfaceSpecification.
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
    public static class Ipv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
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
             * Ipv6Address.
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
    public static class Ipv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        private java.util.List < Ipv6Set> ipv6Set;

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
        public java.util.List < Ipv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

        public static final class Builder {
            private java.util.List < Ipv6Set> ipv6Set; 

            /**
             * Ipv6Set.
             */
            public Builder ipv6Set(java.util.List < Ipv6Set> ipv6Set) {
                this.ipv6Set = ipv6Set;
                return this;
            }

            public Ipv6Sets build() {
                return new Ipv6Sets(this);
            } 

        } 

    }
    public static class PrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("PublicIpAddress")
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
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * PublicIpAddress.
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
    public static class PrivateIpSet extends TeaModel {
        @NameInMap("AssociatedPublicIp")
        private PrivateIpSetAssociatedPublicIp associatedPublicIp;

        @NameInMap("Primary")
        private Boolean primary;

        @NameInMap("PrivateIpAddress")
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
             * AssociatedPublicIp.
             */
            public Builder associatedPublicIp(PrivateIpSetAssociatedPublicIp associatedPublicIp) {
                this.associatedPublicIp = associatedPublicIp;
                return this;
            }

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * PrivateIpAddress.
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
    public static class PrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        private java.util.List < PrivateIpSet> privateIpSet;

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
        public java.util.List < PrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

        public static final class Builder {
            private java.util.List < PrivateIpSet> privateIpSet; 

            /**
             * PrivateIpSet.
             */
            public Builder privateIpSet(java.util.List < PrivateIpSet> privateIpSet) {
                this.privateIpSet = privateIpSet;
                return this;
            }

            public PrivateIpSets build() {
                return new PrivateIpSets(this);
            } 

        } 

    }
    public static class SecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        private java.util.List < String > securityGroupId;

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
        public java.util.List < String > getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupId; 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List < String > securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    public static class SlaveInterfaceSpecification extends TeaModel {
        @NameInMap("BondNetworkInterfaceId")
        private String bondNetworkInterfaceId;

        @NameInMap("SlaveNetworkInterfaceId")
        private String slaveNetworkInterfaceId;

        @NameInMap("WorkState")
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
             * BondNetworkInterfaceId.
             */
            public Builder bondNetworkInterfaceId(String bondNetworkInterfaceId) {
                this.bondNetworkInterfaceId = bondNetworkInterfaceId;
                return this;
            }

            /**
             * SlaveNetworkInterfaceId.
             */
            public Builder slaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
                this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
                return this;
            }

            /**
             * WorkState.
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

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
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
