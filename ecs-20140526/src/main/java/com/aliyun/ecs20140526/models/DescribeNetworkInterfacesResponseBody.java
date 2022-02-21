// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfacesResponseBody</p>
 */
public class DescribeNetworkInterfacesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("NetworkInterfaceSets")
    private NetworkInterfaceSets networkInterfaceSets;

    private DescribeNetworkInterfacesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.networkInterfaceSets = builder.networkInterfaceSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfacesResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return networkInterfaceSets
     */
    public NetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageSize; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 
        private NetworkInterfaceSets networkInterfaceSets; 

        /**
         * The query credential value returned by this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The parameters of the paged query.
         * <p>
         * 
         * > This parameter is about to be offline. We recommend that you use the NextToken and MaxResults to complete the paging query.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The parameters of the paged query.
         * <p>
         * 
         * > This parameter is about to be offline. We recommend that you use the NextToken and MaxResults to complete the paging query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of Enis returned.
         * <p>
         * > If you use the "maxresule" and "NextToken" parameters for paging query, the returned "TotalCount" parameter is meaningless.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of Enis.
         */
        public Builder networkInterfaceSets(NetworkInterfaceSets networkInterfaceSets) {
            this.networkInterfaceSets = networkInterfaceSets;
            return this;
        }

        public DescribeNetworkInterfacesResponseBody build() {
            return new DescribeNetworkInterfacesResponseBody(this);
        } 

    } 

    public static class AssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @NameInMap("AllocationId")
        private String allocationId;

        private AssociatedPublicIp(Builder builder) {
            this.publicIpAddress = builder.publicIpAddress;
            this.allocationId = builder.allocationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedPublicIp create() {
            return builder().build();
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        public static final class Builder {
            private String publicIpAddress; 
            private String allocationId; 

            /**
             * The elastic IP address.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            public AssociatedPublicIp build() {
                return new AssociatedPublicIp(this);
            } 

        } 

    }
    public static class PrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("Primary")
        private Boolean primary;

        @NameInMap("AssociatedPublicIp")
        private AssociatedPublicIp associatedPublicIp;

        private PrivateIpSet(Builder builder) {
            this.privateIpAddress = builder.privateIpAddress;
            this.primary = builder.primary;
            this.associatedPublicIp = builder.associatedPublicIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSet create() {
            return builder().build();
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return associatedPublicIp
         */
        public AssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public static final class Builder {
            private String privateIpAddress; 
            private Boolean primary; 
            private AssociatedPublicIp associatedPublicIp; 

            /**
             * The private IP address of the instance.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * Indicates whether the private IP address is the primary IP address. Possible values:
             * <p>
             * -true: primary and private IP addresses
             * -false: secondary private IP address
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * The EIP associated with the Eni.
             */
            public Builder associatedPublicIp(AssociatedPublicIp associatedPublicIp) {
                this.associatedPublicIp = associatedPublicIp;
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
             * The IPv6 address specified for the Eni.
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
    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * The value of the tag.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
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
    public static class NetworkInterfaceSetAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @NameInMap("AllocationId")
        private String allocationId;

        private NetworkInterfaceSetAssociatedPublicIp(Builder builder) {
            this.publicIpAddress = builder.publicIpAddress;
            this.allocationId = builder.allocationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceSetAssociatedPublicIp create() {
            return builder().build();
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        public static final class Builder {
            private String publicIpAddress; 
            private String allocationId; 

            /**
             * The elastic IP address.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            public NetworkInterfaceSetAssociatedPublicIp build() {
                return new NetworkInterfaceSetAssociatedPublicIp(this);
            } 

        } 

    }
    public static class Attachment extends TeaModel {
        @NameInMap("DeviceIndex")
        private Integer deviceIndex;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TrunkNetworkInterfaceId")
        private String trunkNetworkInterfaceId;

        private Attachment(Builder builder) {
            this.deviceIndex = builder.deviceIndex;
            this.instanceId = builder.instanceId;
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
         * @return trunkNetworkInterfaceId
         */
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

        public static final class Builder {
            private Integer deviceIndex; 
            private String instanceId; 
            private String trunkNetworkInterfaceId; 

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder deviceIndex(Integer deviceIndex) {
                this.deviceIndex = deviceIndex;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
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
    public static class NetworkInterfaceSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Status")
        private String status;

        @NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @NameInMap("MacAddress")
        private String macAddress;

        @NameInMap("QueuePairNumber")
        private Integer queuePairNumber;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("ServiceID")
        private Long serviceID;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("Description")
        private String description;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("QueueNumber")
        private Integer queueNumber;

        @NameInMap("PrivateIpSets")
        private PrivateIpSets privateIpSets;

        @NameInMap("Ipv6Sets")
        private Ipv6Sets ipv6Sets;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @NameInMap("AssociatedPublicIp")
        private NetworkInterfaceSetAssociatedPublicIp associatedPublicIp;

        @NameInMap("Attachment")
        private Attachment attachment;

        private NetworkInterfaceSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.vpcId = builder.vpcId;
            this.type = builder.type;
            this.status = builder.status;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.macAddress = builder.macAddress;
            this.queuePairNumber = builder.queuePairNumber;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.serviceID = builder.serviceID;
            this.instanceId = builder.instanceId;
            this.ownerId = builder.ownerId;
            this.serviceManaged = builder.serviceManaged;
            this.vSwitchId = builder.vSwitchId;
            this.description = builder.description;
            this.resourceGroupId = builder.resourceGroupId;
            this.zoneId = builder.zoneId;
            this.privateIpAddress = builder.privateIpAddress;
            this.queueNumber = builder.queueNumber;
            this.privateIpSets = builder.privateIpSets;
            this.ipv6Sets = builder.ipv6Sets;
            this.tags = builder.tags;
            this.securityGroupIds = builder.securityGroupIds;
            this.associatedPublicIp = builder.associatedPublicIp;
            this.attachment = builder.attachment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceSet create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return macAddress
         */
        public String getMacAddress() {
            return this.macAddress;
        }

        /**
         * @return queuePairNumber
         */
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return serviceID
         */
        public Long getServiceID() {
            return this.serviceID;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return queueNumber
         */
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        /**
         * @return privateIpSets
         */
        public PrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        /**
         * @return ipv6Sets
         */
        public Ipv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return securityGroupIds
         */
        public SecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return associatedPublicIp
         */
        public NetworkInterfaceSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        /**
         * @return attachment
         */
        public Attachment getAttachment() {
            return this.attachment;
        }

        public static final class Builder {
            private String creationTime; 
            private String vpcId; 
            private String type; 
            private String status; 
            private String networkInterfaceTrafficMode; 
            private String networkInterfaceName; 
            private String macAddress; 
            private Integer queuePairNumber; 
            private String networkInterfaceId; 
            private Long serviceID; 
            private String instanceId; 
            private String ownerId; 
            private Boolean serviceManaged; 
            private String vSwitchId; 
            private String description; 
            private String resourceGroupId; 
            private String zoneId; 
            private String privateIpAddress; 
            private Integer queueNumber; 
            private PrivateIpSets privateIpSets; 
            private Ipv6Sets ipv6Sets; 
            private Tags tags; 
            private SecurityGroupIds securityGroupIds; 
            private NetworkInterfaceSetAssociatedPublicIp associatedPublicIp; 
            private Attachment attachment; 

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The VPC ID of the VPC to which the Eni belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The type of the Eni.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The status of the Eni.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The communication mode of the Eni. Possible values:
             * <p>
             * 
             * -Standard: TCP communication mode is used.
             * -HighPerformance: enable ERI(Elastic RDMA Interface) Interface and use RDMA communication mode.
             * > HighPerformance parameter value only supports the c7re instance family with RDMA performance-enhanced performance. Currently, this parameter value can only be set in Zone K of China (Beijing).
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * The name of the Eni.
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * The MAC address of the Eni.
             */
            public Builder macAddress(String macAddress) {
                this.macAddress = macAddress;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * The ID of the Eni.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The ID of the virtual merchant corresponding to the Eni.
             */
            public Builder serviceID(Long serviceID) {
                this.serviceID = serviceID;
                return this;
            }

            /**
             * The ID of the instance to which the Eni is bound.
             * <p>
             * 
             * > Enis managed and controlled by other Alibaba Cloud services do not return the instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the account to which the Eni belongs.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Whether the user of the Eni is a cloud product or a virtual merchant.
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The vSwitch ID of the VPC.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The private IP address of the Eni.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The number of Eni queues.
             * <p>
             * 
             * -If the secondary Eni is in the InUse state and the number of queues has not been changed, the default number of secondary Eni queues of the instance type is returned.
             * -If the secondary Eni has modified the number of queues, the modified number of queues is returned.
             * -If the secondary Eni is in the Available state and the number of queues has not been modified, the return value is null.
             * -The default number of queues for the primary Eni returned by the primary Eni.
             */
            public Builder queueNumber(Integer queueNumber) {
                this.queueNumber = queueNumber;
                return this;
            }

            /**
             * A collection of PrivateIpSet.
             */
            public Builder privateIpSets(PrivateIpSets privateIpSets) {
                this.privateIpSets = privateIpSets;
                return this;
            }

            /**
             * The set of IPv6 addresses assigned to the Eni.
             */
            public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
                this.ipv6Sets = ipv6Sets;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
             * The EIP associated with the secondary private IP address of the Eni.
             */
            public Builder associatedPublicIp(NetworkInterfaceSetAssociatedPublicIp associatedPublicIp) {
                this.associatedPublicIp = associatedPublicIp;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder attachment(Attachment attachment) {
                this.attachment = attachment;
                return this;
            }

            public NetworkInterfaceSet build() {
                return new NetworkInterfaceSet(this);
            } 

        } 

    }
    public static class NetworkInterfaceSets extends TeaModel {
        @NameInMap("NetworkInterfaceSet")
        private java.util.List < NetworkInterfaceSet> networkInterfaceSet;

        private NetworkInterfaceSets(Builder builder) {
            this.networkInterfaceSet = builder.networkInterfaceSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceSets create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceSet
         */
        public java.util.List < NetworkInterfaceSet> getNetworkInterfaceSet() {
            return this.networkInterfaceSet;
        }

        public static final class Builder {
            private java.util.List < NetworkInterfaceSet> networkInterfaceSet; 

            /**
             * NetworkInterfaceSet.
             */
            public Builder networkInterfaceSet(java.util.List < NetworkInterfaceSet> networkInterfaceSet) {
                this.networkInterfaceSet = networkInterfaceSet;
                return this;
            }

            public NetworkInterfaceSets build() {
                return new NetworkInterfaceSets(this);
            } 

        } 

    }
}
