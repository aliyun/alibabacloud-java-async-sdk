// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

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

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
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
        private Instances instances; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the queried instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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
         * The total number of instances queried.
         * <p>
         * 
         * >  If you specify the `MaxResults` and `NextToken` request parameters to perform a paged query, the value of the `TotalCount` response parameter is invalid.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class CpuOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoreCount")
        private Integer coreCount;

        @com.aliyun.core.annotation.NameInMap("Numa")
        private String numa;

        @com.aliyun.core.annotation.NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        @com.aliyun.core.annotation.NameInMap("TopologyType")
        private String topologyType;

        private CpuOptions(Builder builder) {
            this.coreCount = builder.coreCount;
            this.numa = builder.numa;
            this.threadsPerCore = builder.threadsPerCore;
            this.topologyType = builder.topologyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return coreCount
         */
        public Integer getCoreCount() {
            return this.coreCount;
        }

        /**
         * @return numa
         */
        public String getNuma() {
            return this.numa;
        }

        /**
         * @return threadsPerCore
         */
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        /**
         * @return topologyType
         */
        public String getTopologyType() {
            return this.topologyType;
        }

        public static final class Builder {
            private Integer coreCount; 
            private String numa; 
            private Integer threadsPerCore; 
            private String topologyType; 

            /**
             * The number of physical CPU cores.
             */
            public Builder coreCount(Integer coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * >  This parameter is deprecated.
             */
            public Builder numa(String numa) {
                this.numa = numa;
                return this;
            }

            /**
             * The number of threads per CPU core.
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            /**
             * The CPU topology type of the instance. Valid values:
             * <p>
             * 
             * *   ContinuousCoreToHTMapping: Hyper-Threading (HT) continuous CPU topology
             * *   DiscreteCoreToHTMapping: HT discrete CPU topology
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    public static class DedicatedHostAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        private DedicatedHostAttribute(Builder builder) {
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.dedicatedHostName = builder.dedicatedHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostAttribute create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
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

        public static final class Builder {
            private String dedicatedHostClusterId; 
            private String dedicatedHostId; 
            private String dedicatedHostName; 

            /**
             * The ID of the dedicated host cluster.
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

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

            public DedicatedHostAttribute build() {
                return new DedicatedHostAttribute(this);
            } 

        } 

    }
    public static class DedicatedInstanceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Affinity")
        private String affinity;

        @com.aliyun.core.annotation.NameInMap("Tenancy")
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
             * Indicates whether the instance on the dedicated host is associated with the dedicated host. Valid values:
             * <p>
             * 
             * *   default: The instance is not associated with the dedicated host. When the instance is restarted from economical mode, the instance may be automatically deployed on another dedicated host in the automatic deployment resource pool.
             * *   host: The instance is associated with the dedicated host. When the instance is restarted from economical mode, the instance is still deployed on the original dedicated host.
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * Indicates whether the instance is hosted on a dedicated host. Valid values:
             * <p>
             * 
             * *   default: The instance is not hosted on a dedicated host.
             * *   host: The instance is hosted on a dedicated host.
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
    public static class EcsCapacityReservationAttr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityReservationId")
        private String capacityReservationId;

        @com.aliyun.core.annotation.NameInMap("CapacityReservationPreference")
        private String capacityReservationPreference;

        private EcsCapacityReservationAttr(Builder builder) {
            this.capacityReservationId = builder.capacityReservationId;
            this.capacityReservationPreference = builder.capacityReservationPreference;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsCapacityReservationAttr create() {
            return builder().build();
        }

        /**
         * @return capacityReservationId
         */
        public String getCapacityReservationId() {
            return this.capacityReservationId;
        }

        /**
         * @return capacityReservationPreference
         */
        public String getCapacityReservationPreference() {
            return this.capacityReservationPreference;
        }

        public static final class Builder {
            private String capacityReservationId; 
            private String capacityReservationPreference; 

            /**
             * The ID of the capacity reservation.
             */
            public Builder capacityReservationId(String capacityReservationId) {
                this.capacityReservationId = capacityReservationId;
                return this;
            }

            /**
             * The preference of the capacity reservation.
             */
            public Builder capacityReservationPreference(String capacityReservationPreference) {
                this.capacityReservationPreference = capacityReservationPreference;
                return this;
            }

            public EcsCapacityReservationAttr build() {
                return new EcsCapacityReservationAttr(this);
            } 

        } 

    }
    public static class EipAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("IsSupportUnassociate")
        private Boolean isSupportUnassociate;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.bandwidth = builder.bandwidth;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.isSupportUnassociate = builder.isSupportUnassociate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
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
         * @return isSupportUnassociate
         */
        public Boolean getIsSupportUnassociate() {
            return this.isSupportUnassociate;
        }

        public static final class Builder {
            private String allocationId; 
            private Integer bandwidth; 
            private String internetChargeType; 
            private String ipAddress; 
            private Boolean isSupportUnassociate; 

            /**
             * The ID of the EIP.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The maximum public bandwidth of the EIP. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The metering method of the EIP. Valid values:
             * <p>
             * 
             * *   PayByBandwidth
             * *   PayByTraffic
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The EIP.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Indicates whether the EIP can be disassociated.
             */
            public Builder isSupportUnassociate(Boolean isSupportUnassociate) {
                this.isSupportUnassociate = isSupportUnassociate;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    public static class HibernationOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configured")
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
             * >  This parameter is in invitational preview and is not publicly available.
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
    public static class ImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginAsNonRoot")
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
             * Indicates whether the instance that uses the image supports logons of the ecs-user user. Valid values:
             * <p>
             * 
             * *   true
             * *   false
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
    public static class InnerIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
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
             * The EIP.
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
    public static class MetadataOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpEndpoint")
        private String httpEndpoint;

        @com.aliyun.core.annotation.NameInMap("HttpPutResponseHopLimit")
        private Integer httpPutResponseHopLimit;

        @com.aliyun.core.annotation.NameInMap("HttpTokens")
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
             * Indicates whether the access channel is enabled for instance metadata. Valid values:
             * <p>
             * 
             * *   enabled
             * *   disabled
             */
            public Builder httpEndpoint(String httpEndpoint) {
                this.httpEndpoint = httpEndpoint;
                return this;
            }

            /**
             * >  This parameter is not publicly available.
             */
            public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
                this.httpPutResponseHopLimit = httpPutResponseHopLimit;
                return this;
            }

            /**
             * Indicates whether the security hardening mode (IMDSv2) is forcefully used to access instance metadata. Valid values:
             * <p>
             * 
             * *   optional: The security hardening mode (IMDSv2) is not forcefully used.
             * *   required: The security hardening mode (IMDSv2) is forcefully used.
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
             * The IPv4 prefix of the ENI.
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
             * The IPv6 prefix of the ENI.
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
             * The IPv6 address of the ENI.
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
             * Indicates whether the IP address is the primary private IP address. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * The private IP address of the ENI.
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
    public static class NetworkInterface extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @com.aliyun.core.annotation.NameInMap("PrivateIpSets")
        private PrivateIpSets privateIpSets;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NetworkInterface(Builder builder) {
            this.ipv4PrefixSets = builder.ipv4PrefixSets;
            this.ipv6PrefixSets = builder.ipv6PrefixSets;
            this.ipv6Sets = builder.ipv6Sets;
            this.macAddress = builder.macAddress;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.privateIpSets = builder.privateIpSets;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterface create() {
            return builder().build();
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
         * @return primaryIpAddress
         */
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        /**
         * @return privateIpSets
         */
        public PrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Ipv4PrefixSets ipv4PrefixSets; 
            private Ipv6PrefixSets ipv6PrefixSets; 
            private Ipv6Sets ipv6Sets; 
            private String macAddress; 
            private String networkInterfaceId; 
            private String primaryIpAddress; 
            private PrivateIpSets privateIpSets; 
            private String type; 

            /**
             * The IPv4 prefixes of the ENI. This parameter has a value only when `AdditionalAttributes.N` is set to `NETWORK_PRIMARY_ENI_IP`.
             */
            public Builder ipv4PrefixSets(Ipv4PrefixSets ipv4PrefixSets) {
                this.ipv4PrefixSets = ipv4PrefixSets;
                return this;
            }

            /**
             * The IPv6 prefixes of the ENI. This parameter has a value only when `AdditionalAttributes.N` is set to `NETWORK_PRIMARY_ENI_IP`.
             */
            public Builder ipv6PrefixSets(Ipv6PrefixSets ipv6PrefixSets) {
                this.ipv6PrefixSets = ipv6PrefixSets;
                return this;
            }

            /**
             * The IPv6 addresses of the ENI. This parameter has a value only when `AdditionalAttributes.N` is set to `NETWORK_PRIMARY_ENI_IP`.
             */
            public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
                this.ipv6Sets = ipv6Sets;
                return this;
            }

            /**
             * The MAC address of the ENI.
             */
            public Builder macAddress(String macAddress) {
                this.macAddress = macAddress;
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
             * The primary private IP address of the ENI.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * Details about the private IP addresses of the ENI.
             */
            public Builder privateIpSets(PrivateIpSets privateIpSets) {
                this.privateIpSets = privateIpSets;
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

            public NetworkInterface build() {
                return new NetworkInterface(this);
            } 

        } 

    }
    public static class NetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterface")
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
        @com.aliyun.core.annotation.NameInMap("LockMsg")
        private String lockMsg;

        @com.aliyun.core.annotation.NameInMap("LockReason")
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
             * The message returned when the instance was locked.
             */
            public Builder lockMsg(String lockMsg) {
                this.lockMsg = lockMsg;
                return this;
            }

            /**
             * The reason why the instance was locked. Valid values:
             * <p>
             * 
             * *   financial: The instance was locked due to overdue payments.
             * *   security: The instance was locked due to security reasons.
             * *   recycling: The preemptible instance was locked and pending release.
             * *   dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.
             * *   refunded: The instance was locked because a refund was made for the instance.
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
        @com.aliyun.core.annotation.NameInMap("LockReason")
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
             * The reason why the instance was locked. Valid values:
             * <p>
             * 
             * *   financial: The instance was locked due to overdue payments.
             * *   security: The instance was locked due to security reasons.
             * *   recycling: The preemptible instance was locked and pending release.
             * *   dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.
             * *   refunded: The instance was locked because a refund was made for the instance.
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
    public static class PublicIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
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
             * The EIP.
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
    public static class RdmaIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
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
             * The EIP.
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
             * The tag key of the instance.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the instance.
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
    public static class PrivateIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
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
             * The EIP.
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
        @com.aliyun.core.annotation.NameInMap("NatIpAddress")
        private String natIpAddress;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private PrivateIpAddress privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private VpcAttributes(Builder builder) {
            this.natIpAddress = builder.natIpAddress;
            this.privateIpAddress = builder.privateIpAddress;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcAttributes create() {
            return builder().build();
        }

        /**
         * @return natIpAddress
         */
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        /**
         * @return privateIpAddress
         */
        public PrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
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

        public static final class Builder {
            private String natIpAddress; 
            private PrivateIpAddress privateIpAddress; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The NAT IP address of the instance. The NAT IP address is used by ECS instances in different VPCs for communication.
             */
            public Builder natIpAddress(String natIpAddress) {
                this.natIpAddress = natIpAddress;
                return this;
            }

            /**
             * The private IP addresses of the instance.
             */
            public Builder privateIpAddress(PrivateIpAddress privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The ID of the vSwitch to which the instance is connected.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcAttributes build() {
                return new VpcAttributes(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CpuOptions")
        private CpuOptions cpuOptions;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CreditSpecification")
        private String creditSpecification;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostAttribute")
        private DedicatedHostAttribute dedicatedHostAttribute;

        @com.aliyun.core.annotation.NameInMap("DedicatedInstanceAttribute")
        private DedicatedInstanceAttribute dedicatedInstanceAttribute;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetGroupNo")
        private Integer deploymentSetGroupNo;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceAvailable")
        private Boolean deviceAvailable;

        @com.aliyun.core.annotation.NameInMap("EcsCapacityReservationAttr")
        private EcsCapacityReservationAttr ecsCapacityReservationAttr;

        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private EipAddress eipAddress;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GPUAmount")
        private Integer GPUAmount;

        @com.aliyun.core.annotation.NameInMap("GPUSpec")
        private String GPUSpec;

        @com.aliyun.core.annotation.NameInMap("HibernationOptions")
        private HibernationOptions hibernationOptions;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HpcClusterId")
        private String hpcClusterId;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageOptions")
        private ImageOptions imageOptions;

        @com.aliyun.core.annotation.NameInMap("InnerIpAddress")
        private InnerIpAddress innerIpAddress;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("IoOptimized")
        private Boolean ioOptimized;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("MetadataOptions")
        private MetadataOptions metadataOptions;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaces")
        private NetworkInterfaces networkInterfaces;

        @com.aliyun.core.annotation.NameInMap("OSName")
        private String OSName;

        @com.aliyun.core.annotation.NameInMap("OSNameEn")
        private String OSNameEn;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private PublicIpAddress publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("RdmaIpAddress")
        private RdmaIpAddress rdmaIpAddress;

        @com.aliyun.core.annotation.NameInMap("Recyclable")
        private Boolean recyclable;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SaleCycle")
        private String saleCycle;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("SpotDuration")
        private Integer spotDuration;

        @com.aliyun.core.annotation.NameInMap("SpotInterruptionBehavior")
        private String spotInterruptionBehavior;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StoppedMode")
        private String stoppedMode;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VlanId")
        private String vlanId;

        @com.aliyun.core.annotation.NameInMap("VpcAttributes")
        private VpcAttributes vpcAttributes;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instance(Builder builder) {
            this.autoReleaseTime = builder.autoReleaseTime;
            this.clusterId = builder.clusterId;
            this.cpu = builder.cpu;
            this.cpuOptions = builder.cpuOptions;
            this.creationTime = builder.creationTime;
            this.creditSpecification = builder.creditSpecification;
            this.dedicatedHostAttribute = builder.dedicatedHostAttribute;
            this.dedicatedInstanceAttribute = builder.dedicatedInstanceAttribute;
            this.deletionProtection = builder.deletionProtection;
            this.deploymentSetGroupNo = builder.deploymentSetGroupNo;
            this.deploymentSetId = builder.deploymentSetId;
            this.description = builder.description;
            this.deviceAvailable = builder.deviceAvailable;
            this.ecsCapacityReservationAttr = builder.ecsCapacityReservationAttr;
            this.eipAddress = builder.eipAddress;
            this.expiredTime = builder.expiredTime;
            this.GPUAmount = builder.GPUAmount;
            this.GPUSpec = builder.GPUSpec;
            this.hibernationOptions = builder.hibernationOptions;
            this.hostName = builder.hostName;
            this.hpcClusterId = builder.hpcClusterId;
            this.ISP = builder.ISP;
            this.imageId = builder.imageId;
            this.imageOptions = builder.imageOptions;
            this.innerIpAddress = builder.innerIpAddress;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.ioOptimized = builder.ioOptimized;
            this.keyPairName = builder.keyPairName;
            this.localStorageAmount = builder.localStorageAmount;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.memory = builder.memory;
            this.metadataOptions = builder.metadataOptions;
            this.networkInterfaces = builder.networkInterfaces;
            this.OSName = builder.OSName;
            this.OSNameEn = builder.OSNameEn;
            this.OSType = builder.OSType;
            this.operationLocks = builder.operationLocks;
            this.publicIpAddress = builder.publicIpAddress;
            this.rdmaIpAddress = builder.rdmaIpAddress;
            this.recyclable = builder.recyclable;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.saleCycle = builder.saleCycle;
            this.securityGroupIds = builder.securityGroupIds;
            this.serialNumber = builder.serialNumber;
            this.spotDuration = builder.spotDuration;
            this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.stoppedMode = builder.stoppedMode;
            this.tags = builder.tags;
            this.vlanId = builder.vlanId;
            this.vpcAttributes = builder.vpcAttributes;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return cpuOptions
         */
        public CpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return creditSpecification
         */
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        /**
         * @return dedicatedHostAttribute
         */
        public DedicatedHostAttribute getDedicatedHostAttribute() {
            return this.dedicatedHostAttribute;
        }

        /**
         * @return dedicatedInstanceAttribute
         */
        public DedicatedInstanceAttribute getDedicatedInstanceAttribute() {
            return this.dedicatedInstanceAttribute;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return deploymentSetGroupNo
         */
        public Integer getDeploymentSetGroupNo() {
            return this.deploymentSetGroupNo;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceAvailable
         */
        public Boolean getDeviceAvailable() {
            return this.deviceAvailable;
        }

        /**
         * @return ecsCapacityReservationAttr
         */
        public EcsCapacityReservationAttr getEcsCapacityReservationAttr() {
            return this.ecsCapacityReservationAttr;
        }

        /**
         * @return eipAddress
         */
        public EipAddress getEipAddress() {
            return this.eipAddress;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return GPUAmount
         */
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return hibernationOptions
         */
        public HibernationOptions getHibernationOptions() {
            return this.hibernationOptions;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return hpcClusterId
         */
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageOptions
         */
        public ImageOptions getImageOptions() {
            return this.imageOptions;
        }

        /**
         * @return innerIpAddress
         */
        public InnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return ioOptimized
         */
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return localStorageAmount
         */
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        /**
         * @return localStorageCapacity
         */
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return metadataOptions
         */
        public MetadataOptions getMetadataOptions() {
            return this.metadataOptions;
        }

        /**
         * @return networkInterfaces
         */
        public NetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        /**
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return OSNameEn
         */
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return publicIpAddress
         */
        public PublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return rdmaIpAddress
         */
        public RdmaIpAddress getRdmaIpAddress() {
            return this.rdmaIpAddress;
        }

        /**
         * @return recyclable
         */
        public Boolean getRecyclable() {
            return this.recyclable;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return saleCycle
         */
        public String getSaleCycle() {
            return this.saleCycle;
        }

        /**
         * @return securityGroupIds
         */
        public SecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return spotDuration
         */
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        /**
         * @return spotInterruptionBehavior
         */
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stoppedMode
         */
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vlanId
         */
        public String getVlanId() {
            return this.vlanId;
        }

        /**
         * @return vpcAttributes
         */
        public VpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String autoReleaseTime; 
            private String clusterId; 
            private Integer cpu; 
            private CpuOptions cpuOptions; 
            private String creationTime; 
            private String creditSpecification; 
            private DedicatedHostAttribute dedicatedHostAttribute; 
            private DedicatedInstanceAttribute dedicatedInstanceAttribute; 
            private Boolean deletionProtection; 
            private Integer deploymentSetGroupNo; 
            private String deploymentSetId; 
            private String description; 
            private Boolean deviceAvailable; 
            private EcsCapacityReservationAttr ecsCapacityReservationAttr; 
            private EipAddress eipAddress; 
            private String expiredTime; 
            private Integer GPUAmount; 
            private String GPUSpec; 
            private HibernationOptions hibernationOptions; 
            private String hostName; 
            private String hpcClusterId; 
            private String ISP; 
            private String imageId; 
            private ImageOptions imageOptions; 
            private InnerIpAddress innerIpAddress; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceName; 
            private String instanceNetworkType; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private Boolean ioOptimized; 
            private String keyPairName; 
            private Integer localStorageAmount; 
            private Long localStorageCapacity; 
            private Integer memory; 
            private MetadataOptions metadataOptions; 
            private NetworkInterfaces networkInterfaces; 
            private String OSName; 
            private String OSNameEn; 
            private String OSType; 
            private OperationLocks operationLocks; 
            private PublicIpAddress publicIpAddress; 
            private RdmaIpAddress rdmaIpAddress; 
            private Boolean recyclable; 
            private String regionId; 
            private String resourceGroupId; 
            private String saleCycle; 
            private SecurityGroupIds securityGroupIds; 
            private String serialNumber; 
            private Integer spotDuration; 
            private String spotInterruptionBehavior; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String startTime; 
            private String status; 
            private String stoppedMode; 
            private Tags tags; 
            private String vlanId; 
            private VpcAttributes vpcAttributes; 
            private String zoneId; 

            /**
             * The automatic release time of the pay-as-you-go instance.
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * The ID of the cluster to which the instance belongs.
             * <p>
             * 
             * >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Details about the CPU options.
             */
            public Builder cpuOptions(CpuOptions cpuOptions) {
                this.cpuOptions = cpuOptions;
                return this;
            }

            /**
             * The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see [ISO 8601](~~25696~~).
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The performance mode of the burstable instance. Valid values:
             * <p>
             * 
             * *   Standard: the standard mode. For more information, see the "Standard mode" section in [Overview of burstable instances](~~59977~~).
             * *   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Overview of burstable instances](~~59977~~).
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * The information about the dedicated host. The value is an array that consists of DedicatedHostClusterId, DedicatedHostId, and DedicatedHostName.
             */
            public Builder dedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
                this.dedicatedHostAttribute = dedicatedHostAttribute;
                return this;
            }

            /**
             * The attributes of the instance on the dedicated host.
             */
            public Builder dedicatedInstanceAttribute(DedicatedInstanceAttribute dedicatedInstanceAttribute) {
                this.dedicatedInstanceAttribute = dedicatedInstanceAttribute;
                return this;
            }

            /**
             * Indicates whether release protection is enabled for the instance. This parameter determines whether you can use the ECS console or call the DeleteInstance operation to release the instance. Valid values:
             * <p>
             * 
             * *   true: Release protection is enabled for the instance.
             * *   false: Release protection is disabled for the instance.
             * 
             * >  This parameter is applicable only to pay-as-you-go instances. The release protection feature can protect instances against manual releases, but not against automatic releases.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The number of the deployment set group to which the instance belongs in a deployment set.
             */
            public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
                this.deploymentSetGroupNo = deploymentSetGroupNo;
                return this;
            }

            /**
             * The ID of the deployment set to which the instance belongs.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
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
             * Indicates whether data disks can be attached to the instance. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder deviceAvailable(Boolean deviceAvailable) {
                this.deviceAvailable = deviceAvailable;
                return this;
            }

            /**
             * Details about the capacity reservation associated with the instance.
             */
            public Builder ecsCapacityReservationAttr(EcsCapacityReservationAttr ecsCapacityReservationAttr) {
                this.ecsCapacityReservationAttr = ecsCapacityReservationAttr;
                return this;
            }

            /**
             * Details about the EIP associated with the instance.
             */
            public Builder eipAddress(EipAddress eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            /**
             * The expiration time of the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see [ISO 8601](~~25696~~).
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The number of GPUs for the instance type.
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * The category of GPUs for the instance type.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder hibernationOptions(HibernationOptions hibernationOptions) {
                this.hibernationOptions = hibernationOptions;
                return this;
            }

            /**
             * The hostname of the instance.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
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
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * The image ID of the instance.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Details about the image options.
             */
            public Builder imageOptions(ImageOptions imageOptions) {
                this.imageOptions = imageOptions;
                return this;
            }

            /**
             * The internal IP addresses of the instance located in the classic network.
             */
            public Builder innerIpAddress(InnerIpAddress innerIpAddress) {
                this.innerIpAddress = innerIpAddress;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   PrePaid: subscription
             * *   PostPaid: pay-as-you-go
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   classic
             * *   vpc
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * The instance type of the instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The instance family of the instance.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The billing method for network usage. Valid values:
             * <p>
             * 
             * *   PayByBandwidth: pay-by-bandwidth
             * *   PayByTraffic: pay-by-traffic
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
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
             * The maximum outbound public bandwidth. Unit: Mbit/s.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * Indicates whether the instance is an I/O optimized instance. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder ioOptimized(Boolean ioOptimized) {
                this.ioOptimized = ioOptimized;
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
             * The number of local disks attached to the instance.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * The capacity of local disks attached to the instance. Unit: GiB.
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
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
             * Details about the metadata options.
             */
            public Builder metadataOptions(MetadataOptions metadataOptions) {
                this.metadataOptions = metadataOptions;
                return this;
            }

            /**
             * The ENIs attached to the instance.
             */
            public Builder networkInterfaces(NetworkInterfaces networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * The name of the operating system of the instance.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * The English name of the operating system of the instance.
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * The type of the operating system of the instance. Valid values:
             * <p>
             * 
             * *   windows: Windows operating systems
             * *   linux: Linux operating systems
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * The reasons why the instance was locked.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * The public IP addresses of the instance.
             */
            public Builder publicIpAddress(PublicIpAddress publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * The RDMA IP addresses of the instance in the HPC cluster.
             */
            public Builder rdmaIpAddress(RdmaIpAddress rdmaIpAddress) {
                this.rdmaIpAddress = rdmaIpAddress;
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
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * >  The parameter is removed.
             */
            public Builder saleCycle(String saleCycle) {
                this.saleCycle = saleCycle;
                return this;
            }

            /**
             * The IDs of the security groups to which the instance belongs.
             */
            public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The serial number of the instance.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The protection period of the preemptible instance. Unit: hours. Valid values:
             * <p>
             * 
             * *   1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.
             * *   0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.
             * 
             * Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.
             * 
             * >  This parameter is returned when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * The interruption mode of the preemptible instance when the system initiates a preemptible instance interruption operation. Valid values:
             * <p>
             * 
             * *   Terminate: releases the preemptible instance.
             * *   Stop: stops the instance in economical mode.
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * The maximum hourly price of the instance. The value can be accurate to three decimal places. This parameter is valid when SpotStrategy is set to SpotWithPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bidding policy for the pay-as-you-go instance. Valid values:
             * <p>
             * 
             * *   NoSpot: The instance is a regular pay-as-you-go instance.
             * *   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price is automatically used as the bid price. The market price can be up to the pay-as-you-go price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The time when the instance was last started. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see [ISO 8601](~~25696~~).
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * Indicates whether the instance continues to be billed after it is stopped. Valid values:
             * <p>
             * 
             * *   KeepCharging: The instance is stopped in standard mode. Billing for the instance continues after the instance is stopped, and resources are retained for the instance.
             * *   StopCharging: The instance is stopped in economical mode. Billing for some resources of the instance stops after the instance is stopped. When the instance is stopped, its resources such as vCPUs, memory, and public IP addresses are released. The instance may be unable to restart if some required resources are out of stock in the current region.
             * *   Not-applicable: The instance does not support economical mode.
             */
            public Builder stoppedMode(String stoppedMode) {
                this.stoppedMode = stoppedMode;
                return this;
            }

            /**
             * The tags of the instance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The virtual LAN (VLAN) ID of the instance.
             * <p>
             * 
             * >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * The VPC attributes of the instance.
             */
            public Builder vpcAttributes(VpcAttributes vpcAttributes) {
                this.vpcAttributes = vpcAttributes;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
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
