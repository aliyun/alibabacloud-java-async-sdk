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
 * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfacesResponseBody</p>
 */
public class DescribeNetworkInterfacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceSets")
    private NetworkInterfaceSets networkInterfaceSets;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNetworkInterfacesResponseBody(Builder builder) {
        this.networkInterfaceSets = builder.networkInterfaceSets;
        this.nextToken = builder.nextToken;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkInterfaceSets
     */
    public NetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeNetworkInterfacesResponseBody model) {
            this.networkInterfaceSets = model.networkInterfaceSets;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details of the ENIs.</p>
         */
        public Builder networkInterfaceSets(NetworkInterfaceSets networkInterfaceSets) {
            this.networkInterfaceSets = networkInterfaceSets;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * <blockquote>
         * <p>This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * <blockquote>
         * <p>This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * <p>The total number of ENIs.</p>
         * <blockquote>
         * <p>If you specify the <code>MaxResults</code> and <code>NextToken</code> parameters to perform a paged query, the value of the <code>TotalCount</code> response parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkInterfacesResponseBody build() {
            return new DescribeNetworkInterfacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AssociatedPublicIp model) {
                this.allocationId = model.allocationId;
                this.publicIpAddress = model.publicIpAddress;
            } 

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

            public AssociatedPublicIp build() {
                return new AssociatedPublicIp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
     */
    public static class Attachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceIndex")
        private Integer deviceIndex;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkCardIndex")
        private Integer networkCardIndex;

        @com.aliyun.core.annotation.NameInMap("TrunkNetworkInterfaceId")
        private String trunkNetworkInterfaceId;

        private Attachment(Builder builder) {
            this.deviceIndex = builder.deviceIndex;
            this.instanceId = builder.instanceId;
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
            private Integer networkCardIndex; 
            private String trunkNetworkInterfaceId; 

            private Builder() {
            } 

            private Builder(Attachment model) {
                this.deviceIndex = model.deviceIndex;
                this.instanceId = model.instanceId;
                this.networkCardIndex = model.networkCardIndex;
                this.trunkNetworkInterfaceId = model.trunkNetworkInterfaceId;
            } 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deviceIndex(Integer deviceIndex) {
                this.deviceIndex = deviceIndex;
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
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The index of the network card.</p>
             * <ul>
             * <li>If the ENI is in the Available state or if no network card index was specified when the ENI was attached, this parameter is empty.</li>
             * <li>If the ENI is in the InUse state and a network card index was specified when the ENI was attached, the specified network card index is returned as the value of this parameter.</li>
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
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Ipv4PrefixSet model) {
                this.ipv4Prefix = model.ipv4Prefix;
            } 

            /**
             * <p>The IPv4 prefix of the ENI.</p>
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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Ipv4PrefixSets model) {
                this.ipv4PrefixSet = model.ipv4PrefixSet;
            } 

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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Ipv6PrefixSet model) {
                this.ipv6Prefix = model.ipv6Prefix;
            } 

            /**
             * <p>The IPv6 prefix of the ENI.</p>
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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Ipv6PrefixSets model) {
                this.ipv6PrefixSet = model.ipv6PrefixSet;
            } 

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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Ipv6Set model) {
                this.ipv6Address = model.ipv6Address;
            } 

            /**
             * <p>The IPv6 address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:4321:180:1701:94c7:bc38:3bfa:****</p>
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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Ipv6Sets model) {
                this.ipv6Set = model.ipv6Set;
            } 

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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PrivateIpSetAssociatedPublicIp model) {
                this.allocationId = model.allocationId;
                this.publicIpAddress = model.publicIpAddress;
            } 

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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
     */
    public static class PrivateIpSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedPublicIp")
        private PrivateIpSetAssociatedPublicIp associatedPublicIp;

        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PrivateDnsName")
        private String privateDnsName;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSet(Builder builder) {
            this.associatedPublicIp = builder.associatedPublicIp;
            this.primary = builder.primary;
            this.privateDnsName = builder.privateDnsName;
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
         * @return privateDnsName
         */
        public String getPrivateDnsName() {
            return this.privateDnsName;
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
            private String privateDnsName; 
            private String privateIpAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpSet model) {
                this.associatedPublicIp = model.associatedPublicIp;
                this.primary = model.primary;
                this.privateDnsName = model.privateDnsName;
                this.privateIpAddress = model.privateIpAddress;
            } 

            /**
             * <p>The elastic IP address (EIP) that is associated with the private IP address.</p>
             */
            public Builder associatedPublicIp(PrivateIpSetAssociatedPublicIp associatedPublicIp) {
                this.associatedPublicIp = associatedPublicIp;
                return this;
            }

            /**
             * <p>Indicates whether the private IP address is the primary private IP address. Valid values:</p>
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
             * <p>The private domain name of the ECS instance.</p>
             * <blockquote>
             * <p> A private domain name can be returned in a specific format only when <code>HostnameType</code> is set to <code>IP</code> or <code>InstanceId</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>DnsTestName</p>
             */
            public Builder privateDnsName(String privateDnsName) {
                this.privateDnsName = privateDnsName;
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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PrivateIpSets model) {
                this.privateIpSet = model.privateIpSet;
            } 

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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SecurityGroupIds model) {
                this.securityGroupId = model.securityGroupId;
            } 

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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

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
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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
    /**
     * 
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
     */
    public static class NetworkInterfaceSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedPublicIp")
        private AssociatedPublicIp associatedPublicIp;

        @com.aliyun.core.annotation.NameInMap("Attachment")
        private Attachment attachment;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeleteOnRelease")
        private Boolean deleteOnRelease;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("ServiceID")
        private Long serviceID;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("SourceDestCheck")
        private Boolean sourceDestCheck;

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

        private NetworkInterfaceSet(Builder builder) {
            this.associatedPublicIp = builder.associatedPublicIp;
            this.attachment = builder.attachment;
            this.creationTime = builder.creationTime;
            this.deleteOnRelease = builder.deleteOnRelease;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.ipv4PrefixSets = builder.ipv4PrefixSets;
            this.ipv6PrefixSets = builder.ipv6PrefixSets;
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
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.serviceID = builder.serviceID;
            this.serviceManaged = builder.serviceManaged;
            this.sourceDestCheck = builder.sourceDestCheck;
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

        public static NetworkInterfaceSet create() {
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
            private String creationTime; 
            private Boolean deleteOnRelease; 
            private String description; 
            private String instanceId; 
            private Ipv4PrefixSets ipv4PrefixSets; 
            private Ipv6PrefixSets ipv6PrefixSets; 
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
            private String resourceGroupId; 
            private SecurityGroupIds securityGroupIds; 
            private Long serviceID; 
            private Boolean serviceManaged; 
            private Boolean sourceDestCheck; 
            private String status; 
            private Tags tags; 
            private String type; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(NetworkInterfaceSet model) {
                this.associatedPublicIp = model.associatedPublicIp;
                this.attachment = model.attachment;
                this.creationTime = model.creationTime;
                this.deleteOnRelease = model.deleteOnRelease;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.ipv4PrefixSets = model.ipv4PrefixSets;
                this.ipv6PrefixSets = model.ipv6PrefixSets;
                this.ipv6Sets = model.ipv6Sets;
                this.macAddress = model.macAddress;
                this.networkInterfaceId = model.networkInterfaceId;
                this.networkInterfaceName = model.networkInterfaceName;
                this.networkInterfaceTrafficMode = model.networkInterfaceTrafficMode;
                this.ownerId = model.ownerId;
                this.privateIpAddress = model.privateIpAddress;
                this.privateIpSets = model.privateIpSets;
                this.queueNumber = model.queueNumber;
                this.queuePairNumber = model.queuePairNumber;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.serviceID = model.serviceID;
                this.serviceManaged = model.serviceManaged;
                this.sourceDestCheck = model.sourceDestCheck;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The EIPs that are associated with the secondary private IP addresses of the ENI.</p>
             */
            public Builder associatedPublicIp(AssociatedPublicIp associatedPublicIp) {
                this.associatedPublicIp = associatedPublicIp;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             */
            public Builder attachment(Attachment attachment) {
                this.attachment = attachment;
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
             * <p>DescriptionTest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the Elastic Compute Service (ECS) instance to which the ENI is attached.</p>
             * <blockquote>
             * <p> If the ENI is managed by other Alibaba Cloud services, no instance ID is returned.</p>
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
             * <p>The MAC address of the ENI.</p>
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
             * <p>The communication mode of the ENI. Valid values:</p>
             * <ul>
             * <li>Standard: The TCP communication mode is used.</li>
             * <li>HighPerformance: The Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter can have a value of HighPerformance only when the ENI is attached to a c7re RDMA-enhanced instance that resides in Beijing Zone K.</p>
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
             * <p>The primary private IP address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.17.**.**</code></p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>Details about the private IP addresses of the ENI.</p>
             */
            public Builder privateIpSets(PrivateIpSets privateIpSets) {
                this.privateIpSets = privateIpSets;
                return this;
            }

            /**
             * <p>The number of queues supported by the ENI.</p>
             * <ul>
             * <li>If the ENI is a secondary ENI in the InUse state and the number of queues supported by the ENI has never been modified, the default number of queues per secondary ENI that the instance type supports is returned.</li>
             * <li>If the ENI is a secondary ENI and the number of queues supported by the ENI has been modified, the new number of queues is returned.</li>
             * <li>If the ENI is a secondary ENI in the Available state and the number of queues supported by the ENI has never been modified, an empty value is returned.</li>
             * <li>If the ENI is a primary ENI, the default number of queues per primary ENI that the instance type supports is returned.</li>
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
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
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
             * <p>The security groups to which the ENI belongs.</p>
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
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sourceDestCheck(Boolean sourceDestCheck) {
                this.sourceDestCheck = sourceDestCheck;
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
             * <p>The ID of the vSwitch.</p>
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

            public NetworkInterfaceSet build() {
                return new NetworkInterfaceSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacesResponseBody</p>
     */
    public static class NetworkInterfaceSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceSet")
        private java.util.List<NetworkInterfaceSet> networkInterfaceSet;

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
        public java.util.List<NetworkInterfaceSet> getNetworkInterfaceSet() {
            return this.networkInterfaceSet;
        }

        public static final class Builder {
            private java.util.List<NetworkInterfaceSet> networkInterfaceSet; 

            private Builder() {
            } 

            private Builder(NetworkInterfaceSets model) {
                this.networkInterfaceSet = model.networkInterfaceSet;
            } 

            /**
             * NetworkInterfaceSet.
             */
            public Builder networkInterfaceSet(java.util.List<NetworkInterfaceSet> networkInterfaceSet) {
                this.networkInterfaceSet = networkInterfaceSet;
                return this;
            }

            public NetworkInterfaceSets build() {
                return new NetworkInterfaceSets(this);
            } 

        } 

    }
}
