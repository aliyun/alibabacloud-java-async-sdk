// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkInterfaceResponseBody</p>
 */
public class CreateNetworkInterfaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.NameInMap("PrivateIpSets")
    private PrivateIpSets privateIpSets;

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

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateNetworkInterfaceResponseBody(Builder builder) {
        this.description = builder.description;
        this.ipv4PrefixSets = builder.ipv4PrefixSets;
        this.ipv6PrefixSets = builder.ipv6PrefixSets;
        this.ipv6Sets = builder.ipv6Sets;
        this.macAddress = builder.macAddress;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.ownerId = builder.ownerId;
        this.privateIpAddress = builder.privateIpAddress;
        this.privateIpSets = builder.privateIpSets;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.serviceID = builder.serviceID;
        this.serviceManaged = builder.serviceManaged;
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

    public static CreateNetworkInterfaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private String description; 
        private Ipv4PrefixSets ipv4PrefixSets; 
        private Ipv6PrefixSets ipv6PrefixSets; 
        private Ipv6Sets ipv6Sets; 
        private String macAddress; 
        private String networkInterfaceId; 
        private String networkInterfaceName; 
        private String ownerId; 
        private String privateIpAddress; 
        private PrivateIpSets privateIpSets; 
        private String requestId; 
        private String resourceGroupId; 
        private SecurityGroupIds securityGroupIds; 
        private Long serviceID; 
        private Boolean serviceManaged; 
        private String status; 
        private Tags tags; 
        private String type; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

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
         * <p>The IPv4 prefixes assigned to the ENI.</p>
         */
        public Builder ipv4PrefixSets(Ipv4PrefixSets ipv4PrefixSets) {
            this.ipv4PrefixSets = ipv4PrefixSets;
            return this;
        }

        /**
         * <p>The IPv6 prefixes assigned to the ENI.</p>
         */
        public Builder ipv6PrefixSets(Ipv6PrefixSets ipv6PrefixSets) {
            this.ipv6PrefixSets = ipv6PrefixSets;
            return this;
        }

        /**
         * <p>The IPv6 addresses assigned to the ENI.</p>
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
         * <p>eni-bp14v2sdd3v8htln****</p>
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
         * <p><code>172.17.**.**</code></p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The private IP addresses.</p>
         */
        public Builder privateIpSets(PrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the ENI belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-2ze88m67qx5z****</p>
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
         * <p>The state of the ENI.</p>
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
         * <p>The type of the ENI.</p>
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
         * <p>vsw-bp16usj2p27htro3****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the ENI belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1j7w3gc1cexjqd****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public CreateNetworkInterfaceResponseBody build() {
            return new CreateNetworkInterfaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
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
             * <p>The IPv4 prefix assigned to the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
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
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
     */
    public static class Ipv4PrefixSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4PrefixSet")
        private java.util.List < Ipv4PrefixSet> ipv4PrefixSet;

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
        public java.util.List < Ipv4PrefixSet> getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
        }

        public static final class Builder {
            private java.util.List < Ipv4PrefixSet> ipv4PrefixSet; 

            /**
             * Ipv4PrefixSet.
             */
            public Builder ipv4PrefixSet(java.util.List < Ipv4PrefixSet> ipv4PrefixSet) {
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
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
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
             * <p>The IPv6 prefix assigned to the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
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
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
     */
    public static class Ipv6PrefixSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6PrefixSet")
        private java.util.List < Ipv6PrefixSet> ipv6PrefixSet;

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
        public java.util.List < Ipv6PrefixSet> getIpv6PrefixSet() {
            return this.ipv6PrefixSet;
        }

        public static final class Builder {
            private java.util.List < Ipv6PrefixSet> ipv6PrefixSet; 

            /**
             * Ipv6PrefixSet.
             */
            public Builder ipv6PrefixSet(java.util.List < Ipv6PrefixSet> ipv6PrefixSet) {
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
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
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
             * <p>The IPv6 address assigned to the ENI.</p>
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
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
     */
    public static class Ipv6Sets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Set")
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
    /**
     * 
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
     */
    public static class PrivateIpSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSet(Builder builder) {
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
            private Boolean primary; 
            private String privateIpAddress; 

            /**
             * <p>Indicates whether the private IP address is the primary private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * <p>The private IP address of the instance.</p>
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
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
     */
    public static class PrivateIpSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateIpSet")
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
    /**
     * 
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
     */
    public static class SecurityGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
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
    /**
     * 
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
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
     * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
