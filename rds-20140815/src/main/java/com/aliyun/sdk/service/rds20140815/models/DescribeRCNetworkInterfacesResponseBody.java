// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCNetworkInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCNetworkInterfacesResponseBody</p>
 */
public class DescribeRCNetworkInterfacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceSets")
    private java.util.List<NetworkInterfaceSets> networkInterfaceSets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCNetworkInterfacesResponseBody(Builder builder) {
        this.networkInterfaceSets = builder.networkInterfaceSets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCNetworkInterfacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkInterfaceSets
     */
    public java.util.List<NetworkInterfaceSets> getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<NetworkInterfaceSets> networkInterfaceSets; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRCNetworkInterfacesResponseBody model) {
            this.networkInterfaceSets = model.networkInterfaceSets;
            this.requestId = model.requestId;
        } 

        /**
         * NetworkInterfaceSets.
         */
        public Builder networkInterfaceSets(java.util.List<NetworkInterfaceSets> networkInterfaceSets) {
            this.networkInterfaceSets = networkInterfaceSets;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCNetworkInterfacesResponseBody build() {
            return new DescribeRCNetworkInterfacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNetworkInterfacesResponseBody</p>
     */
    public static class AssociatedPublicIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        private AssociatedPublicIp(Builder builder) {
            this.publicIpAddress = builder.publicIpAddress;
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

        public static final class Builder {
            private String publicIpAddress; 

            private Builder() {
            } 

            private Builder(AssociatedPublicIp model) {
                this.publicIpAddress = model.publicIpAddress;
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
    /**
     * 
     * {@link DescribeRCNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNetworkInterfacesResponseBody</p>
     */
    public static class Ipv6Sets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        private Ipv6Sets(Builder builder) {
            this.ipv6Address = builder.ipv6Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Sets create() {
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

            private Builder() {
            } 

            private Builder(Ipv6Sets model) {
                this.ipv6Address = model.ipv6Address;
            } 

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            public Ipv6Sets build() {
                return new Ipv6Sets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNetworkInterfacesResponseBody</p>
     */
    public static class PrivateIpSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSets(Builder builder) {
            this.primary = builder.primary;
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSets create() {
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

            private Builder() {
            } 

            private Builder(PrivateIpSets model) {
                this.primary = model.primary;
                this.privateIpAddress = model.privateIpAddress;
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

            public PrivateIpSets build() {
                return new PrivateIpSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNetworkInterfacesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNetworkInterfacesResponseBody</p>
     */
    public static class NetworkInterfaceSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedPublicIp")
        private AssociatedPublicIp associatedPublicIp;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ipv6Sets")
        private java.util.List<Ipv6Sets> ipv6Sets;

        @com.aliyun.core.annotation.NameInMap("MacAddress")
        private String macAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpSets")
        private java.util.List<PrivateIpSets> privateIpSets;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private NetworkInterfaceSets(Builder builder) {
            this.associatedPublicIp = builder.associatedPublicIp;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.ipv6Sets = builder.ipv6Sets;
            this.macAddress = builder.macAddress;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.privateIpSets = builder.privateIpSets;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupIds = builder.securityGroupIds;
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

        public static NetworkInterfaceSets create() {
            return builder().build();
        }

        /**
         * @return associatedPublicIp
         */
        public AssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
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
        public java.util.List<Ipv6Sets> getIpv6Sets() {
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
         * @return privateIpSets
         */
        public java.util.List<PrivateIpSets> getPrivateIpSets() {
            return this.privateIpSets;
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
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
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
        public java.util.List<Tags> getTags() {
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
            private String creationTime; 
            private String description; 
            private String instanceId; 
            private java.util.List<Ipv6Sets> ipv6Sets; 
            private String macAddress; 
            private String networkInterfaceId; 
            private java.util.List<PrivateIpSets> privateIpSets; 
            private String resourceGroupId; 
            private java.util.List<String> securityGroupIds; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String type; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(NetworkInterfaceSets model) {
                this.associatedPublicIp = model.associatedPublicIp;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.ipv6Sets = model.ipv6Sets;
                this.macAddress = model.macAddress;
                this.networkInterfaceId = model.networkInterfaceId;
                this.privateIpSets = model.privateIpSets;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AssociatedPublicIp.
             */
            public Builder associatedPublicIp(AssociatedPublicIp associatedPublicIp) {
                this.associatedPublicIp = associatedPublicIp;
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
            public Builder ipv6Sets(java.util.List<Ipv6Sets> ipv6Sets) {
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
             * PrivateIpSets.
             */
            public Builder privateIpSets(java.util.List<PrivateIpSets> privateIpSets) {
                this.privateIpSets = privateIpSets;
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
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
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
            public Builder tags(java.util.List<Tags> tags) {
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

            public NetworkInterfaceSets build() {
                return new NetworkInterfaceSets(this);
            } 

        } 

    }
}
