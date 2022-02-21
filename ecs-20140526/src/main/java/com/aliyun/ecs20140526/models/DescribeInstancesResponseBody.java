// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
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

    @NameInMap("Instances")
    private Instances instances;

    private DescribeInstancesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
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
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageSize; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 
        private Instances instances; 

        /**
         * The query credential value returned by this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the instance list.
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
         * The total number of queried instances.
         * <p>
         * 
         * > If you use the "maxresule" and "NextToken" parameters for paging query, the returned "TotalCount" parameter is meaningless.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * An array consisting of Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
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
    public static class NetworkInterface extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("MacAddress")
        private String macAddress;

        @NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("PrivateIpSets")
        private PrivateIpSets privateIpSets;

        @NameInMap("Ipv6Sets")
        private Ipv6Sets ipv6Sets;

        private NetworkInterface(Builder builder) {
            this.type = builder.type;
            this.macAddress = builder.macAddress;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.privateIpSets = builder.privateIpSets;
            this.ipv6Sets = builder.ipv6Sets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterface create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return macAddress
         */
        public String getMacAddress() {
            return this.macAddress;
        }

        /**
         * @return primaryIpAddress
         */
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
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
        public PrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        /**
         * @return ipv6Sets
         */
        public Ipv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        public static final class Builder {
            private String type; 
            private String macAddress; 
            private String primaryIpAddress; 
            private String networkInterfaceId; 
            private PrivateIpSets privateIpSets; 
            private Ipv6Sets ipv6Sets; 

            /**
             * The type of the Eni. Possible values:
             * <p>
             * -Primary: The Primary Eni.
             * -Secondary: Secondary Eni.
             */
            public Builder type(String type) {
                this.type = type;
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
             * The primary private IP address of the Eni.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
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
             * A collection of PrivateIpSet.
             */
            public Builder privateIpSets(PrivateIpSets privateIpSets) {
                this.privateIpSets = privateIpSets;
                return this;
            }

            /**
             * The set of IPv6 addresses assigned to the Eni. Only when the request parameter "additionalattributes. n" value for "NETWORK_PRIMARY_ENI_IP when, will return the parameter value.
             */
            public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
                this.ipv6Sets = ipv6Sets;
                return this;
            }

            public NetworkInterface build() {
                return new NetworkInterface(this);
            } 

        } 

    }
    public static class NetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        private java.util.List < NetworkInterface> networkInterface;

        private NetworkInterfaces(Builder builder) {
            this.networkInterface = builder.networkInterface;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaces create() {
            return builder().build();
        }

        /**
         * @return networkInterface
         */
        public java.util.List < NetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

        public static final class Builder {
            private java.util.List < NetworkInterface> networkInterface; 

            /**
             * NetworkInterface.
             */
            public Builder networkInterface(java.util.List < NetworkInterface> networkInterface) {
                this.networkInterface = networkInterface;
                return this;
            }

            public NetworkInterfaces build() {
                return new NetworkInterfaces(this);
            } 

        } 

    }
    public static class LockReason extends TeaModel {
        @NameInMap("LockMsg")
        private String lockMsg;

        @NameInMap("LockReason")
        private String lockReason;

        private LockReason(Builder builder) {
            this.lockMsg = builder.lockMsg;
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockReason create() {
            return builder().build();
        }

        /**
         * @return lockMsg
         */
        public String getLockMsg() {
            return this.lockMsg;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockMsg; 
            private String lockReason; 

            /**
             * The description of the locked instance.
             */
            public Builder lockMsg(String lockMsg) {
                this.lockMsg = lockMsg;
                return this;
            }

            /**
             * Locking type. Possible values:
             * <p>
             * 
             * -financial: locked due to overdue payments.
             * -security: locked for security reasons.
             * -Recycling: Preemptive instance stay release lock status.
             * -dedicatedhostfinancial: the ECS instance is locked because the dedicated host is overdue.
             * -refunded: refund locked.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public LockReason build() {
                return new LockReason(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @NameInMap("LockReason")
        private java.util.List < LockReason> lockReason;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public java.util.List < LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List < LockReason> lockReason; 

            /**
             * Locking type. Possible values:
             * <p>
             * 
             * -financial: locked due to overdue payments.
             * -security: locked for security reasons.
             * -Recycling: Preemptive instance stay release lock status.
             * -dedicatedhostfinancial: the ECS instance is locked because the dedicated host is overdue.
             * -refunded: refund locked.
             */
            public Builder lockReason(java.util.List < LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
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
             * The tag value of the instance.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The tag key of the instance.
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
    public static class RdmaIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private RdmaIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdmaIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public RdmaIpAddress build() {
                return new RdmaIpAddress(this);
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
    public static class PublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private PublicIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PublicIpAddress build() {
                return new PublicIpAddress(this);
            } 

        } 

    }
    public static class InnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private InnerIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InnerIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public InnerIpAddress build() {
                return new InnerIpAddress(this);
            } 

        } 

    }
    public static class PrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private PrivateIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PrivateIpAddress build() {
                return new PrivateIpAddress(this);
            } 

        } 

    }
    public static class VpcAttributes extends TeaModel {
        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("NatIpAddress")
        private String natIpAddress;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("PrivateIpAddress")
        private PrivateIpAddress privateIpAddress;

        private VpcAttributes(Builder builder) {
            this.vpcId = builder.vpcId;
            this.natIpAddress = builder.natIpAddress;
            this.vSwitchId = builder.vSwitchId;
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcAttributes create() {
            return builder().build();
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return natIpAddress
         */
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return privateIpAddress
         */
        public PrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private String vpcId; 
            private String natIpAddress; 
            private String vSwitchId; 
            private PrivateIpAddress privateIpAddress; 

            /**
             * VPC VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The IP address of the cloud product, which is used for network communication between VPC cloud products.
             */
            public Builder natIpAddress(String natIpAddress) {
                this.natIpAddress = natIpAddress;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The private IP address of the instance.
             */
            public Builder privateIpAddress(PrivateIpAddress privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public VpcAttributes build() {
                return new VpcAttributes(this);
            } 

        } 

    }
    public static class EipAddress extends TeaModel {
        @NameInMap("IsSupportUnassociate")
        private Boolean isSupportUnassociate;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("AllocationId")
        private String allocationId;

        private EipAddress(Builder builder) {
            this.isSupportUnassociate = builder.isSupportUnassociate;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.bandwidth = builder.bandwidth;
            this.allocationId = builder.allocationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return isSupportUnassociate
         */
        public Boolean getIsSupportUnassociate() {
            return this.isSupportUnassociate;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        public static final class Builder {
            private Boolean isSupportUnassociate; 
            private String internetChargeType; 
            private String ipAddress; 
            private Integer bandwidth; 
            private String allocationId; 

            /**
             * Indicates whether the EIP can be unbound.
             */
            public Builder isSupportUnassociate(Boolean isSupportUnassociate) {
                this.isSupportUnassociate = isSupportUnassociate;
                return this;
            }

            /**
             * Elastic public network IP billing.
             * <p>
             * 
             * -PayByBandwidth: bandwidth billing.
             * 
             * -PayByTraffic: metered.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * Elastic public network IP.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Elastic public network IP public bandwidth speed limit, unit for Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * Elastic public network IP ID.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    public static class HibernationOptions extends TeaModel {
        @NameInMap("Configured")
        private Boolean configured;

        private HibernationOptions(Builder builder) {
            this.configured = builder.configured;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HibernationOptions create() {
            return builder().build();
        }

        /**
         * @return configured
         */
        public Boolean getConfigured() {
            return this.configured;
        }

        public static final class Builder {
            private Boolean configured; 

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder configured(Boolean configured) {
                this.configured = configured;
                return this;
            }

            public HibernationOptions build() {
                return new HibernationOptions(this);
            } 

        } 

    }
    public static class DedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        @NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        private DedicatedHostAttribute(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
            this.dedicatedHostName = builder.dedicatedHostName;
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostAttribute create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        /**
         * @return dedicatedHostName
         */
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        /**
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public static final class Builder {
            private String dedicatedHostId; 
            private String dedicatedHostName; 
            private String dedicatedHostClusterId; 

            /**
             * The ID of the dedicated host.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * The name of the dedicated host.
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
                return this;
            }

            /**
             * The ID of the DDH cluster.
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            public DedicatedHostAttribute build() {
                return new DedicatedHostAttribute(this);
            } 

        } 

    }
    public static class EcsCapacityReservationAttr extends TeaModel {
        @NameInMap("CapacityReservationPreference")
        private String capacityReservationPreference;

        @NameInMap("CapacityReservationId")
        private String capacityReservationId;

        private EcsCapacityReservationAttr(Builder builder) {
            this.capacityReservationPreference = builder.capacityReservationPreference;
            this.capacityReservationId = builder.capacityReservationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsCapacityReservationAttr create() {
            return builder().build();
        }

        /**
         * @return capacityReservationPreference
         */
        public String getCapacityReservationPreference() {
            return this.capacityReservationPreference;
        }

        /**
         * @return capacityReservationId
         */
        public String getCapacityReservationId() {
            return this.capacityReservationId;
        }

        public static final class Builder {
            private String capacityReservationPreference; 
            private String capacityReservationId; 

            /**
             * Capacity reservation preferences.
             */
            public Builder capacityReservationPreference(String capacityReservationPreference) {
                this.capacityReservationPreference = capacityReservationPreference;
                return this;
            }

            /**
             * Capacity reservation ID.
             */
            public Builder capacityReservationId(String capacityReservationId) {
                this.capacityReservationId = capacityReservationId;
                return this;
            }

            public EcsCapacityReservationAttr build() {
                return new EcsCapacityReservationAttr(this);
            } 

        } 

    }
    public static class DedicatedInstanceAttribute extends TeaModel {
        @NameInMap("Affinity")
        private String affinity;

        @NameInMap("Tenancy")
        private String tenancy;

        private DedicatedInstanceAttribute(Builder builder) {
            this.affinity = builder.affinity;
            this.tenancy = builder.tenancy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedInstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return affinity
         */
        public String getAffinity() {
            return this.affinity;
        }

        /**
         * @return tenancy
         */
        public String getTenancy() {
            return this.tenancy;
        }

        public static final class Builder {
            private String affinity; 
            private String tenancy; 

            /**
             * Indicates whether the DDH instance is associated with the DDH. Possible values:
             * <p>
             * 
             * -default: proprietary host instance does not with proprietary host associated. After an instance is restarted, it may be placed on another dedicated host in the automatic resource deployment pool.
             * 
             * -host: proprietary host instance with proprietary host associated. Downtime no charge instance restart rear, still place original proprietary on host.
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * Indicates whether the host type of the instance is dedicated. Possible values:
             * <p>
             * 
             * -default: The host type of the instance is not a dedicated host.
             * 
             * -host: The host type of the instance is dedicated.
             */
            public Builder tenancy(String tenancy) {
                this.tenancy = tenancy;
                return this;
            }

            public DedicatedInstanceAttribute build() {
                return new DedicatedInstanceAttribute(this);
            } 

        } 

    }
    public static class CpuOptions extends TeaModel {
        @NameInMap("Numa")
        private String numa;

        @NameInMap("CoreCount")
        private Integer coreCount;

        @NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        private CpuOptions(Builder builder) {
            this.numa = builder.numa;
            this.coreCount = builder.coreCount;
            this.threadsPerCore = builder.threadsPerCore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return numa
         */
        public String getNuma() {
            return this.numa;
        }

        /**
         * @return coreCount
         */
        public Integer getCoreCount() {
            return this.coreCount;
        }

        /**
         * @return threadsPerCore
         */
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public static final class Builder {
            private String numa; 
            private Integer coreCount; 
            private Integer threadsPerCore; 

            /**
             * Number of threads allocated. Possible value to 2.
             */
            public Builder numa(String numa) {
                this.numa = numa;
                return this;
            }

            /**
             * Physical CPU cores.
             */
            public Builder coreCount(Integer coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * The number of CPU threads.
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    public static class MetadataOptions extends TeaModel {
        @NameInMap("HttpEndpoint")
        private String httpEndpoint;

        @NameInMap("HttpPutResponseHopLimit")
        private Integer httpPutResponseHopLimit;

        @NameInMap("HttpTokens")
        private String httpTokens;

        private MetadataOptions(Builder builder) {
            this.httpEndpoint = builder.httpEndpoint;
            this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
            this.httpTokens = builder.httpTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetadataOptions create() {
            return builder().build();
        }

        /**
         * @return httpEndpoint
         */
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        /**
         * @return httpPutResponseHopLimit
         */
        public Integer getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

        /**
         * @return httpTokens
         */
        public String getHttpTokens() {
            return this.httpTokens;
        }

        public static final class Builder {
            private String httpEndpoint; 
            private Integer httpPutResponseHopLimit; 
            private String httpTokens; 

            /**
             * Specifies whether to enable the access channel for instance metadata. Possible values:
             * <p>
             * -enabled: enabled.
             * -disabled: disabled.
             */
            public Builder httpEndpoint(String httpEndpoint) {
                this.httpEndpoint = httpEndpoint;
                return this;
            }

            /**
             * > This parameter is not available.
             */
            public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
                this.httpPutResponseHopLimit = httpPutResponseHopLimit;
                return this;
            }

            /**
             * Specifies whether to use the enhanced mode (IMDSv2) when accessing instance metadata. Possible values:
             * <p>
             * -optional: not mandatory.
             * -required: force use.
             */
            public Builder httpTokens(String httpTokens) {
                this.httpTokens = httpTokens;
                return this;
            }

            public MetadataOptions build() {
                return new MetadataOptions(this);
            } 

        } 

    }
    public static class ImageOptions extends TeaModel {
        @NameInMap("LoginAsNonRoot")
        private Boolean loginAsNonRoot;

        private ImageOptions(Builder builder) {
            this.loginAsNonRoot = builder.loginAsNonRoot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageOptions create() {
            return builder().build();
        }

        /**
         * @return loginAsNonRoot
         */
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        public static final class Builder {
            private Boolean loginAsNonRoot; 

            /**
             * > This parameter is not available.
             */
            public Builder loginAsNonRoot(Boolean loginAsNonRoot) {
                this.loginAsNonRoot = loginAsNonRoot;
                return this;
            }

            public ImageOptions build() {
                return new ImageOptions(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Status")
        private String status;

        @NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @NameInMap("KeyPairName")
        private String keyPairName;

        @NameInMap("SaleCycle")
        private String saleCycle;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("DeviceAvailable")
        private Boolean deviceAvailable;

        @NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @NameInMap("Description")
        private String description;

        @NameInMap("SpotDuration")
        private Integer spotDuration;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("OSNameEn")
        private String OSNameEn;

        @NameInMap("HpcClusterId")
        private String hpcClusterId;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("DeploymentSetGroupNo")
        private Integer deploymentSetGroupNo;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("VlanId")
        private String vlanId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("GPUSpec")
        private String GPUSpec;

        @NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @NameInMap("StoppedMode")
        private String stoppedMode;

        @NameInMap("GPUAmount")
        private Integer GPUAmount;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("IoOptimized")
        private Boolean ioOptimized;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("Recyclable")
        private Boolean recyclable;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("CreditSpecification")
        private String creditSpecification;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("OSType")
        private String OSType;

        @NameInMap("NetworkInterfaces")
        private NetworkInterfaces networkInterfaces;

        @NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("RdmaIpAddress")
        private RdmaIpAddress rdmaIpAddress;

        @NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @NameInMap("PublicIpAddress")
        private PublicIpAddress publicIpAddress;

        @NameInMap("InnerIpAddress")
        private InnerIpAddress innerIpAddress;

        @NameInMap("VpcAttributes")
        private VpcAttributes vpcAttributes;

        @NameInMap("EipAddress")
        private EipAddress eipAddress;

        @NameInMap("HibernationOptions")
        private HibernationOptions hibernationOptions;

        @NameInMap("DedicatedHostAttribute")
        private DedicatedHostAttribute dedicatedHostAttribute;

        @NameInMap("EcsCapacityReservationAttr")
        private EcsCapacityReservationAttr ecsCapacityReservationAttr;

        @NameInMap("DedicatedInstanceAttribute")
        private DedicatedInstanceAttribute dedicatedInstanceAttribute;

        @NameInMap("CpuOptions")
        private CpuOptions cpuOptions;

        @NameInMap("MetadataOptions")
        private MetadataOptions metadataOptions;

        @NameInMap("ImageOptions")
        private ImageOptions imageOptions;

        private Instance(Builder builder) {
            this.creationTime = builder.creationTime;
            this.serialNumber = builder.serialNumber;
            this.status = builder.status;
            this.deploymentSetId = builder.deploymentSetId;
            this.keyPairName = builder.keyPairName;
            this.saleCycle = builder.saleCycle;
            this.spotStrategy = builder.spotStrategy;
            this.deviceAvailable = builder.deviceAvailable;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.description = builder.description;
            this.spotDuration = builder.spotDuration;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.instanceName = builder.instanceName;
            this.OSNameEn = builder.OSNameEn;
            this.hpcClusterId = builder.hpcClusterId;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.memory = builder.memory;
            this.OSName = builder.OSName;
            this.deploymentSetGroupNo = builder.deploymentSetGroupNo;
            this.imageId = builder.imageId;
            this.vlanId = builder.vlanId;
            this.clusterId = builder.clusterId;
            this.GPUSpec = builder.GPUSpec;
            this.autoReleaseTime = builder.autoReleaseTime;
            this.deletionProtection = builder.deletionProtection;
            this.stoppedMode = builder.stoppedMode;
            this.GPUAmount = builder.GPUAmount;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.instanceType = builder.instanceType;
            this.instanceChargeType = builder.instanceChargeType;
            this.regionId = builder.regionId;
            this.ioOptimized = builder.ioOptimized;
            this.startTime = builder.startTime;
            this.cpu = builder.cpu;
            this.localStorageAmount = builder.localStorageAmount;
            this.expiredTime = builder.expiredTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.internetChargeType = builder.internetChargeType;
            this.zoneId = builder.zoneId;
            this.recyclable = builder.recyclable;
            this.ISP = builder.ISP;
            this.creditSpecification = builder.creditSpecification;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.OSType = builder.OSType;
            this.networkInterfaces = builder.networkInterfaces;
            this.operationLocks = builder.operationLocks;
            this.tags = builder.tags;
            this.rdmaIpAddress = builder.rdmaIpAddress;
            this.securityGroupIds = builder.securityGroupIds;
            this.publicIpAddress = builder.publicIpAddress;
            this.innerIpAddress = builder.innerIpAddress;
            this.vpcAttributes = builder.vpcAttributes;
            this.eipAddress = builder.eipAddress;
            this.hibernationOptions = builder.hibernationOptions;
            this.dedicatedHostAttribute = builder.dedicatedHostAttribute;
            this.ecsCapacityReservationAttr = builder.ecsCapacityReservationAttr;
            this.dedicatedInstanceAttribute = builder.dedicatedInstanceAttribute;
            this.cpuOptions = builder.cpuOptions;
            this.metadataOptions = builder.metadataOptions;
            this.imageOptions = builder.imageOptions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return saleCycle
         */
        public String getSaleCycle() {
            return this.saleCycle;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return deviceAvailable
         */
        public Boolean getDeviceAvailable() {
            return this.deviceAvailable;
        }

        /**
         * @return localStorageCapacity
         */
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return spotDuration
         */
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return OSNameEn
         */
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        /**
         * @return hpcClusterId
         */
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return deploymentSetGroupNo
         */
        public Integer getDeploymentSetGroupNo() {
            return this.deploymentSetGroupNo;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return vlanId
         */
        public String getVlanId() {
            return this.vlanId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return stoppedMode
         */
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        /**
         * @return GPUAmount
         */
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return ioOptimized
         */
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return localStorageAmount
         */
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return recyclable
         */
        public Boolean getRecyclable() {
            return this.recyclable;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return creditSpecification
         */
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return networkInterfaces
         */
        public NetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return rdmaIpAddress
         */
        public RdmaIpAddress getRdmaIpAddress() {
            return this.rdmaIpAddress;
        }

        /**
         * @return securityGroupIds
         */
        public SecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return publicIpAddress
         */
        public PublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return innerIpAddress
         */
        public InnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
        }

        /**
         * @return vpcAttributes
         */
        public VpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
        }

        /**
         * @return eipAddress
         */
        public EipAddress getEipAddress() {
            return this.eipAddress;
        }

        /**
         * @return hibernationOptions
         */
        public HibernationOptions getHibernationOptions() {
            return this.hibernationOptions;
        }

        /**
         * @return dedicatedHostAttribute
         */
        public DedicatedHostAttribute getDedicatedHostAttribute() {
            return this.dedicatedHostAttribute;
        }

        /**
         * @return ecsCapacityReservationAttr
         */
        public EcsCapacityReservationAttr getEcsCapacityReservationAttr() {
            return this.ecsCapacityReservationAttr;
        }

        /**
         * @return dedicatedInstanceAttribute
         */
        public DedicatedInstanceAttribute getDedicatedInstanceAttribute() {
            return this.dedicatedInstanceAttribute;
        }

        /**
         * @return cpuOptions
         */
        public CpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        /**
         * @return metadataOptions
         */
        public MetadataOptions getMetadataOptions() {
            return this.metadataOptions;
        }

        /**
         * @return imageOptions
         */
        public ImageOptions getImageOptions() {
            return this.imageOptions;
        }

        public static final class Builder {
            private String creationTime; 
            private String serialNumber; 
            private String status; 
            private String deploymentSetId; 
            private String keyPairName; 
            private String saleCycle; 
            private String spotStrategy; 
            private Boolean deviceAvailable; 
            private Long localStorageCapacity; 
            private String description; 
            private Integer spotDuration; 
            private String instanceNetworkType; 
            private String instanceName; 
            private String OSNameEn; 
            private String hpcClusterId; 
            private Float spotPriceLimit; 
            private Integer memory; 
            private String OSName; 
            private Integer deploymentSetGroupNo; 
            private String imageId; 
            private String vlanId; 
            private String clusterId; 
            private String GPUSpec; 
            private String autoReleaseTime; 
            private Boolean deletionProtection; 
            private String stoppedMode; 
            private Integer GPUAmount; 
            private String hostName; 
            private String instanceId; 
            private Integer internetMaxBandwidthOut; 
            private Integer internetMaxBandwidthIn; 
            private String instanceType; 
            private String instanceChargeType; 
            private String regionId; 
            private Boolean ioOptimized; 
            private String startTime; 
            private Integer cpu; 
            private Integer localStorageAmount; 
            private String expiredTime; 
            private String resourceGroupId; 
            private String internetChargeType; 
            private String zoneId; 
            private Boolean recyclable; 
            private String ISP; 
            private String creditSpecification; 
            private String instanceTypeFamily; 
            private String OSType; 
            private NetworkInterfaces networkInterfaces; 
            private OperationLocks operationLocks; 
            private Tags tags; 
            private RdmaIpAddress rdmaIpAddress; 
            private SecurityGroupIds securityGroupIds; 
            private PublicIpAddress publicIpAddress; 
            private InnerIpAddress innerIpAddress; 
            private VpcAttributes vpcAttributes; 
            private EipAddress eipAddress; 
            private HibernationOptions hibernationOptions; 
            private DedicatedHostAttribute dedicatedHostAttribute; 
            private EcsCapacityReservationAttr ecsCapacityReservationAttr; 
            private DedicatedInstanceAttribute dedicatedInstanceAttribute; 
            private CpuOptions cpuOptions; 
            private MetadataOptions metadataOptions; 
            private ImageOptions imageOptions; 

            /**
             * The time when the instance was created. The time follows the ISO 8601 standard and uses UTC +0. The format is yyyy-MM-ddTHH:mmZ. For more information, see [ISO8601](~~ 25696 ~~).
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Instance serial number.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The status of the instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the deployment set.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * The name of the key pair.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * Instance cycle billing.
             */
            public Builder saleCycle(String saleCycle) {
                this.saleCycle = saleCycle;
                return this;
            }

            /**
             * The preemptible policy of the preemptible instance. Possible values:
             * <p>
             * 
             * -NoSpot: a pay-as-you-go instance.
             * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
             * -SpotAsPriceGo: The system automatically bids at the highest pay-as-you-go price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * Whether the instance can mount data plate.
             */
            public Builder deviceAvailable(Boolean deviceAvailable) {
                this.deviceAvailable = deviceAvailable;
                return this;
            }

            /**
             * The local storage capacity of the instance.
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The retention period of a preemptible instance. Unit: hours. Possible values are 0~6.
             * <p>
             * 
             * -The retention period is 2 to 6 and is being invited for testing. If you want to activate the service, submit a ticket.
             * -If the value is 0, no protection period is used.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * The network type of the instance. Possible values:
             * <p>
             * 
             * -classic: classic network.
             * -vpc: VPC.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Instance operating system English name.
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * The ID of the HPC cluster to which the instance belongs.
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * Instance per hour highest price. Support maximum 3 decimals, parameter SpotStrategy = SpotWithPriceLimit when the parameter entered into force.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The memory size. Unit: MiB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Instance of the operating system name.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * ECS instance binding deployment set distribute the deployment instance deployment centralized grouping location.
             */
            public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
                this.deploymentSetGroupNo = deploymentSetGroupNo;
                return this;
            }

            /**
             * The ID of the running image of the instance.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Instance VLAN ID.
             * <p>
             * 
             * > This parameter will be deprecated soon. To improve compatibility, try to use other parameters.
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * The ID of the cluster to which the instance belongs.
             * <p>
             * 
             * > This parameter will be deprecated soon. To improve compatibility, try to use other parameters.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Instance dimension included with the GPU type.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * The automatic release time of the pay-as-you-go instance.
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * Instance release protection attribute, specifies whether support pass console or API(DeleteInstance) release instance.
             * <p>
             * 
             * -true: open instance release protection.
             * -false: is not open instance release protection.
             * 
             * > This property only applies to quantity pay instance, and only limit manual release operation, the system release operation no effect.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * Specifies whether to continue charging after the instance is stopped. Possible values:
             * <p>
             * 
             * -KeepCharging: After downtime continue to charge for you to keep inventory resources.
             * -StopCharging: No fees are charged after the instance is stopped. After the instance is stopped, we release the resources corresponding to the instance, such as vCPU, memory, and public IP. Restart is successful or not depends on current zone in the still have the resources inventory.
             * -Not-applicable: This instance does Not support downtime no charge function.
             */
            public Builder stoppedMode(String stoppedMode) {
                this.stoppedMode = stoppedMode;
                return this;
            }

            /**
             * Instance dimension included with the number of GPUS.
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * Instance host name.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The maximum outbound public bandwidth. Unit: Mbit/s.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * The maximum inbound public bandwidth. Unit: Mbit/s.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The billing method of the instance. Possible values:
             * <p>
             * 
             * -PrePaid: subscription.
             * -PostPaid: pay-as-you-go.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * Instance belongs geo ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether the instance is I/O optimized.
             */
            public Builder ioOptimized(Boolean ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * Instance a recent start-up time. The time follows the ISO 8601 standard and uses UTC +0. The format is yyyy-MM-ddTHH:mmZ. For more information, see [ISO8601](~~ 25696 ~~).
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * vCPU number.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The number of local disks attached to the instance.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * The expiration time. The time follows the ISO 8601 standard and uses UTC +0. The format is yyyy-MM-ddTHH:mmZ. For more information, see [ISO8601](~~ 25696 ~~).
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * Instance belongs enterprise resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The billing method of the network. Possible values:
             * <p>
             * 
             * -PayByBandwidth: pay-by-bandwidth.
             * -PayByTraffic: pay by traffic.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The zone to which the instance belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * Indicates whether the instance can be recycled.
             */
            public Builder recyclable(Boolean recyclable) {
                this.recyclable = recyclable;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * Modify the running mode of a burstable instance. Possible values:
             * <p>
             * 
             * -Standard: Standard mode. About instance performance for more information, see [what is burst performance instance](~~ 59977 ~~) in performance constraints mode chapters.
             * -Unlimited: no performance constraints mode for instance performance for more information, see [what is burst performance instance](~~ 59977 ~~) in no performance constraints mode chapters.
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * The instance type family.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * Instance type of operating system, divided into Windows Server And Linux Two kinds. Possible values:
             * <p>
             * 
             * -windows.
             * -linux.
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * Instance contains the elastic network card collection.
             */
            public Builder networkInterfaces(NetworkInterfaces networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * Instance lock reason.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * Instance label collection.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * RdmaIpAddress.
             */
            public Builder rdmaIpAddress(RdmaIpAddress rdmaIpAddress) {
                this.rdmaIpAddress = rdmaIpAddress;
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
             * PublicIpAddress.
             */
            public Builder publicIpAddress(PublicIpAddress publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * InnerIpAddress.
             */
            public Builder innerIpAddress(InnerIpAddress innerIpAddress) {
                this.innerIpAddress = innerIpAddress;
                return this;
            }

            /**
             * Proprietary Network VPC properties.
             */
            public Builder vpcAttributes(VpcAttributes vpcAttributes) {
                this.vpcAttributes = vpcAttributes;
                return this;
            }

            /**
             * Elastic public network IP binding information.
             */
            public Builder eipAddress(EipAddress eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder hibernationOptions(HibernationOptions hibernationOptions) {
                this.hibernationOptions = hibernationOptions;
                return this;
            }

            /**
             * By proprietary host cluster ID(DedicatedHostClusterId), proprietary Host ID(DedicatedHostId) and name (DedicatedHostName) of host property array.
             */
            public Builder dedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
                this.dedicatedHostAttribute = dedicatedHostAttribute;
                return this;
            }

            /**
             * Cloud server ECS capacity reservation related parameters.
             */
            public Builder ecsCapacityReservationAttr(EcsCapacityReservationAttr ecsCapacityReservationAttr) {
                this.ecsCapacityReservationAttr = ecsCapacityReservationAttr;
                return this;
            }

            /**
             * Proprietary host the properties of an instance.
             */
            public Builder dedicatedInstanceAttribute(DedicatedInstanceAttribute dedicatedInstanceAttribute) {
                this.dedicatedInstanceAttribute = dedicatedInstanceAttribute;
                return this;
            }

            /**
             * CPU configuration details.
             */
            public Builder cpuOptions(CpuOptions cpuOptions) {
                this.cpuOptions = cpuOptions;
                return this;
            }

            /**
             * Metadata options collection.
             */
            public Builder metadataOptions(MetadataOptions metadataOptions) {
                this.metadataOptions = metadataOptions;
                return this;
            }

            /**
             * > This parameter is not available.
             */
            public Builder imageOptions(ImageOptions imageOptions) {
                this.imageOptions = imageOptions;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
