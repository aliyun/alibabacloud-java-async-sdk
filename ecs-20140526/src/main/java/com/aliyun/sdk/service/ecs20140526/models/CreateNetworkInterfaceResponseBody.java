// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkInterfaceResponseBody</p>
 */
public class CreateNetworkInterfaceResponseBody extends TeaModel {
    @NameInMap("Status")
    private String status;

    @NameInMap("Type")
    private String type;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @NameInMap("MacAddress")
    private String macAddress;

    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @NameInMap("ServiceID")
    private Long serviceID;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Description")
    private String description;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ZoneId")
    private String zoneId;

    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @NameInMap("SecurityGroupIds")
    private SecurityGroupIds securityGroupIds;

    @NameInMap("PrivateIpSets")
    private PrivateIpSets privateIpSets;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("Ipv6Sets")
    private Ipv6Sets ipv6Sets;

    private CreateNetworkInterfaceResponseBody(Builder builder) {
        this.status = builder.status;
        this.type = builder.type;
        this.vpcId = builder.vpcId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.macAddress = builder.macAddress;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.serviceID = builder.serviceID;
        this.ownerId = builder.ownerId;
        this.serviceManaged = builder.serviceManaged;
        this.vSwitchId = builder.vSwitchId;
        this.requestId = builder.requestId;
        this.description = builder.description;
        this.resourceGroupId = builder.resourceGroupId;
        this.zoneId = builder.zoneId;
        this.privateIpAddress = builder.privateIpAddress;
        this.securityGroupIds = builder.securityGroupIds;
        this.privateIpSets = builder.privateIpSets;
        this.tags = builder.tags;
        this.ipv6Sets = builder.ipv6Sets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkInterfaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return securityGroupIds
     */
    public SecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return privateIpSets
     */
    public PrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return ipv6Sets
     */
    public Ipv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    public static final class Builder {
        private String status; 
        private String type; 
        private String vpcId; 
        private String networkInterfaceName; 
        private String macAddress; 
        private String networkInterfaceId; 
        private Long serviceID; 
        private String ownerId; 
        private Boolean serviceManaged; 
        private String vSwitchId; 
        private String requestId; 
        private String description; 
        private String resourceGroupId; 
        private String zoneId; 
        private String privateIpAddress; 
        private SecurityGroupIds securityGroupIds; 
        private PrivateIpSets privateIpSets; 
        private Tags tags; 
        private Ipv6Sets ipv6Sets; 

        /**
         * The status of the Eni.
         */
        public Builder status(String status) {
            this.status = status;
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
         * The VPC ID of the VPC to which the Eni belongs.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The description of the Eni.
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
         * SecurityGroupIds.
         */
        public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
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
         * The tag.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The IPv6 address assigned to the Eni.
         */
        public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }

        public CreateNetworkInterfaceResponseBody build() {
            return new CreateNetworkInterfaceResponseBody(this);
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
    public static class PrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("Primary")
        private Boolean primary;

        private PrivateIpSet(Builder builder) {
            this.privateIpAddress = builder.privateIpAddress;
            this.primary = builder.primary;
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

        public static final class Builder {
            private String privateIpAddress; 
            private Boolean primary; 

            /**
             * The private IP address of the instance.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * Indicates whether the private IP address is the primary IP address.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
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
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
             * The IPv6 address.
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
}
