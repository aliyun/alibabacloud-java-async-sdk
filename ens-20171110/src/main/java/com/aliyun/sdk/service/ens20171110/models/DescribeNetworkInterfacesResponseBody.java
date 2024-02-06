// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @NameInMap("NetworkInterfaceSets")
    private NetworkInterfaceSets networkInterfaceSets;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNetworkInterfacesResponseBody(Builder builder) {
        this.networkInterfaceSets = builder.networkInterfaceSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkInterfaceSets
     */
    public NetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder {
        private NetworkInterfaceSets networkInterfaceSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the ENIs.
         */
        public Builder networkInterfaceSets(NetworkInterfaceSets networkInterfaceSets) {
            this.networkInterfaceSets = networkInterfaceSets;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries in the list.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkInterfacesResponseBody build() {
            return new DescribeNetworkInterfacesResponseBody(this);
        } 

    } 

    public static class PrivateIpSet extends TeaModel {
        @NameInMap("Primary")
        private Boolean primary;

        @NameInMap("PrivateIpAddress")
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
             * Indicates whether the IP address is the primary private IP address. Valid values:
             * <p>
             * 
             * *   true: The IP address is the primary private IP address.
             * *   false: The IP address is the secondary private IP address.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * The private IP address.
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
        @NameInMap("SecurityGroup")
        private java.util.List < String > securityGroup;

        private SecurityGroupIds(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public java.util.List < String > getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List < String > securityGroup; 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List < String > securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    public static class NetworkInterfaceSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MacAddress")
        private String macAddress;

        @NameInMap("NetworkId")
        private String networkId;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @NameInMap("PrimaryIp")
        private String primaryIp;

        @NameInMap("PrimaryIpType")
        private String primaryIpType;

        @NameInMap("PrivateIpSets")
        private PrivateIpSets privateIpSets;

        @NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkInterfaceSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
            this.macAddress = builder.macAddress;
            this.networkId = builder.networkId;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.primaryIp = builder.primaryIp;
            this.primaryIpType = builder.primaryIpType;
            this.privateIpSets = builder.privateIpSets;
            this.securityGroupIds = builder.securityGroupIds;
            this.status = builder.status;
            this.type = builder.type;
            this.vSwitchId = builder.vSwitchId;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return macAddress
         */
        public String getMacAddress() {
            return this.macAddress;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
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
         * @return primaryIp
         */
        public String getPrimaryIp() {
            return this.primaryIp;
        }

        /**
         * @return primaryIpType
         */
        public String getPrimaryIpType() {
            return this.primaryIpType;
        }

        /**
         * @return privateIpSets
         */
        public PrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        /**
         * @return securityGroupIds
         */
        public SecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String ensRegionId; 
            private String instanceId; 
            private String macAddress; 
            private String networkId; 
            private String networkInterfaceId; 
            private String networkInterfaceName; 
            private String primaryIp; 
            private String primaryIpType; 
            private PrivateIpSets privateIpSets; 
            private SecurityGroupIds securityGroupIds; 
            private String status; 
            private String type; 
            private String vSwitchId; 

            /**
             * The time when the ENI was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC. The format is yyyy-MM-ddThh:mmZ.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the ENI.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the edge node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the instance to which the ENI is attached.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The media access control (MAC) address of the ENI.
             */
            public Builder macAddress(String macAddress) {
                this.macAddress = macAddress;
                return this;
            }

            /**
             * The ID of the network.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * The ID of the ENI.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The name of the ENI.
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * The primary private IP address.
             */
            public Builder primaryIp(String primaryIp) {
                this.primaryIp = primaryIp;
                return this;
            }

            /**
             * The type of the primary IP address. Valid values:
             * <p>
             * 
             * *   **Public**: public endpoint.
             * *   **Private**: internal endpoint.
             */
            public Builder primaryIpType(String primaryIpType) {
                this.primaryIpType = primaryIpType;
                return this;
            }

            /**
             * Details about the private IP addresses.
             */
            public Builder privateIpSets(PrivateIpSets privateIpSets) {
                this.privateIpSets = privateIpSets;
                return this;
            }

            /**
             * IDs of security groups.
             */
            public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The status of the ENI. Valid values:
             * <p>
             * 
             * *   Available: The ENI is available.
             * *   Attaching: The ENI is being attached to an instance.
             * *   InUse: The ENI is attached to an instance.
             * *   Detaching: The ENI is being detached from an instance.
             * *   Deleting: The ENI is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the ENI. Valid values:
             * <p>
             * 
             * *   Primary
             * *   Secondary
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
