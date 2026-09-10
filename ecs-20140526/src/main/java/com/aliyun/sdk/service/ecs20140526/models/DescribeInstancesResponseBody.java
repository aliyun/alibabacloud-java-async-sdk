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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstancesResponseBody model) {
            this.instances = model.instances;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page that was specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The total number of queried instances.</p>
         * <blockquote>
         * <p>When you use the <code>MaxResults</code> and <code>NextToken</code> parameters for paging query, the returned <code>TotalCount</code> parameter value is meaningless.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class AdditionalInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableHighDensityMode")
        private Boolean enableHighDensityMode;

        @com.aliyun.core.annotation.NameInMap("ManagedHostId")
        private String managedHostId;

        @com.aliyun.core.annotation.NameInMap("NodeSerialNumber")
        private String nodeSerialNumber;

        private AdditionalInfo(Builder builder) {
            this.enableHighDensityMode = builder.enableHighDensityMode;
            this.managedHostId = builder.managedHostId;
            this.nodeSerialNumber = builder.nodeSerialNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalInfo create() {
            return builder().build();
        }

        /**
         * @return enableHighDensityMode
         */
        public Boolean getEnableHighDensityMode() {
            return this.enableHighDensityMode;
        }

        /**
         * @return managedHostId
         */
        public String getManagedHostId() {
            return this.managedHostId;
        }

        /**
         * @return nodeSerialNumber
         */
        public String getNodeSerialNumber() {
            return this.nodeSerialNumber;
        }

        public static final class Builder {
            private Boolean enableHighDensityMode; 
            private String managedHostId; 
            private String nodeSerialNumber; 

            private Builder() {
            } 

            private Builder(AdditionalInfo model) {
                this.enableHighDensityMode = model.enableHighDensityMode;
                this.managedHostId = model.managedHostId;
                this.nodeSerialNumber = model.nodeSerialNumber;
            } 

            /**
             * EnableHighDensityMode.
             */
            public Builder enableHighDensityMode(Boolean enableHighDensityMode) {
                this.enableHighDensityMode = enableHighDensityMode;
                return this;
            }

            /**
             * ManagedHostId.
             */
            public Builder managedHostId(String managedHostId) {
                this.managedHostId = managedHostId;
                return this;
            }

            /**
             * NodeSerialNumber.
             */
            public Builder nodeSerialNumber(String nodeSerialNumber) {
                this.nodeSerialNumber = nodeSerialNumber;
                return this;
            }

            public AdditionalInfo build() {
                return new AdditionalInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class ClockOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PtpStatus")
        private String ptpStatus;

        private ClockOptions(Builder builder) {
            this.ptpStatus = builder.ptpStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClockOptions create() {
            return builder().build();
        }

        /**
         * @return ptpStatus
         */
        public String getPtpStatus() {
            return this.ptpStatus;
        }

        public static final class Builder {
            private String ptpStatus; 

            private Builder() {
            } 

            private Builder(ClockOptions model) {
                this.ptpStatus = model.ptpStatus;
            } 

            /**
             * PtpStatus.
             */
            public Builder ptpStatus(String ptpStatus) {
                this.ptpStatus = ptpStatus;
                return this;
            }

            public ClockOptions build() {
                return new ClockOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class CpuOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoreCount")
        private Integer coreCount;

        @com.aliyun.core.annotation.NameInMap("EnableVISST")
        private Boolean enableVISST;

        @com.aliyun.core.annotation.NameInMap("EnableVRDT")
        private Boolean enableVRDT;

        @com.aliyun.core.annotation.NameInMap("NestedVirtualization")
        private String nestedVirtualization;

        @com.aliyun.core.annotation.NameInMap("Numa")
        private String numa;

        @com.aliyun.core.annotation.NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        @com.aliyun.core.annotation.NameInMap("TopologyType")
        private String topologyType;

        @com.aliyun.core.annotation.NameInMap("TurboMode")
        private String turboMode;

        private CpuOptions(Builder builder) {
            this.coreCount = builder.coreCount;
            this.enableVISST = builder.enableVISST;
            this.enableVRDT = builder.enableVRDT;
            this.nestedVirtualization = builder.nestedVirtualization;
            this.numa = builder.numa;
            this.threadsPerCore = builder.threadsPerCore;
            this.topologyType = builder.topologyType;
            this.turboMode = builder.turboMode;
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
         * @return enableVISST
         */
        public Boolean getEnableVISST() {
            return this.enableVISST;
        }

        /**
         * @return enableVRDT
         */
        public Boolean getEnableVRDT() {
            return this.enableVRDT;
        }

        /**
         * @return nestedVirtualization
         */
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
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

        /**
         * @return turboMode
         */
        public String getTurboMode() {
            return this.turboMode;
        }

        public static final class Builder {
            private Integer coreCount; 
            private Boolean enableVISST; 
            private Boolean enableVRDT; 
            private String nestedVirtualization; 
            private String numa; 
            private Integer threadsPerCore; 
            private String topologyType; 
            private String turboMode; 

            private Builder() {
            } 

            private Builder(CpuOptions model) {
                this.coreCount = model.coreCount;
                this.enableVISST = model.enableVISST;
                this.enableVRDT = model.enableVRDT;
                this.nestedVirtualization = model.nestedVirtualization;
                this.numa = model.numa;
                this.threadsPerCore = model.threadsPerCore;
                this.topologyType = model.topologyType;
                this.turboMode = model.turboMode;
            } 

            /**
             * CoreCount.
             */
            public Builder coreCount(Integer coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * EnableVISST.
             */
            public Builder enableVISST(Boolean enableVISST) {
                this.enableVISST = enableVISST;
                return this;
            }

            /**
             * EnableVRDT.
             */
            public Builder enableVRDT(Boolean enableVRDT) {
                this.enableVRDT = enableVRDT;
                return this;
            }

            /**
             * NestedVirtualization.
             */
            public Builder nestedVirtualization(String nestedVirtualization) {
                this.nestedVirtualization = nestedVirtualization;
                return this;
            }

            /**
             * Numa.
             */
            public Builder numa(String numa) {
                this.numa = numa;
                return this;
            }

            /**
             * ThreadsPerCore.
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            /**
             * TopologyType.
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            /**
             * TurboMode.
             */
            public Builder turboMode(String turboMode) {
                this.turboMode = turboMode;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DedicatedHostAttribute model) {
                this.dedicatedHostClusterId = model.dedicatedHostClusterId;
                this.dedicatedHostId = model.dedicatedHostId;
                this.dedicatedHostName = model.dedicatedHostName;
            } 

            /**
             * DedicatedHostClusterId.
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * DedicatedHostName.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DedicatedInstanceAttribute model) {
                this.affinity = model.affinity;
                this.tenancy = model.tenancy;
            } 

            /**
             * Affinity.
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * Tenancy.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(EcsCapacityReservationAttr model) {
                this.capacityReservationId = model.capacityReservationId;
                this.capacityReservationPreference = model.capacityReservationPreference;
            } 

            /**
             * CapacityReservationId.
             */
            public Builder capacityReservationId(String capacityReservationId) {
                this.capacityReservationId = capacityReservationId;
                return this;
            }

            /**
             * CapacityReservationPreference.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(EipAddress model) {
                this.allocationId = model.allocationId;
                this.bandwidth = model.bandwidth;
                this.internetChargeType = model.internetChargeType;
                this.ipAddress = model.ipAddress;
                this.isSupportUnassociate = model.isSupportUnassociate;
            } 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * IsSupportUnassociate.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HibernationOptions model) {
                this.configured = model.configured;
            } 

            /**
             * Configured.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class ImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentOSNVMeSupported")
        private Boolean currentOSNVMeSupported;

        @com.aliyun.core.annotation.NameInMap("LoginAsNonRoot")
        private Boolean loginAsNonRoot;

        private ImageOptions(Builder builder) {
            this.currentOSNVMeSupported = builder.currentOSNVMeSupported;
            this.loginAsNonRoot = builder.loginAsNonRoot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageOptions create() {
            return builder().build();
        }

        /**
         * @return currentOSNVMeSupported
         */
        public Boolean getCurrentOSNVMeSupported() {
            return this.currentOSNVMeSupported;
        }

        /**
         * @return loginAsNonRoot
         */
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        public static final class Builder {
            private Boolean currentOSNVMeSupported; 
            private Boolean loginAsNonRoot; 

            private Builder() {
            } 

            private Builder(ImageOptions model) {
                this.currentOSNVMeSupported = model.currentOSNVMeSupported;
                this.loginAsNonRoot = model.loginAsNonRoot;
            } 

            /**
             * CurrentOSNVMeSupported.
             */
            public Builder currentOSNVMeSupported(Boolean currentOSNVMeSupported) {
                this.currentOSNVMeSupported = currentOSNVMeSupported;
                return this;
            }

            /**
             * LoginAsNonRoot.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InnerIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

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
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(InnerIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public InnerIpAddress build() {
                return new InnerIpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class MetadataOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpEndpoint")
        private String httpEndpoint;

        @com.aliyun.core.annotation.NameInMap("HttpPutResponseHopLimit")
        private Integer httpPutResponseHopLimit;

        @com.aliyun.core.annotation.NameInMap("HttpTokens")
        private String httpTokens;

        @com.aliyun.core.annotation.NameInMap("InstanceMetadataTags")
        private String instanceMetadataTags;

        private MetadataOptions(Builder builder) {
            this.httpEndpoint = builder.httpEndpoint;
            this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
            this.httpTokens = builder.httpTokens;
            this.instanceMetadataTags = builder.instanceMetadataTags;
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

        /**
         * @return instanceMetadataTags
         */
        public String getInstanceMetadataTags() {
            return this.instanceMetadataTags;
        }

        public static final class Builder {
            private String httpEndpoint; 
            private Integer httpPutResponseHopLimit; 
            private String httpTokens; 
            private String instanceMetadataTags; 

            private Builder() {
            } 

            private Builder(MetadataOptions model) {
                this.httpEndpoint = model.httpEndpoint;
                this.httpPutResponseHopLimit = model.httpPutResponseHopLimit;
                this.httpTokens = model.httpTokens;
                this.instanceMetadataTags = model.instanceMetadataTags;
            } 

            /**
             * HttpEndpoint.
             */
            public Builder httpEndpoint(String httpEndpoint) {
                this.httpEndpoint = httpEndpoint;
                return this;
            }

            /**
             * HttpPutResponseHopLimit.
             */
            public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
                this.httpPutResponseHopLimit = httpPutResponseHopLimit;
                return this;
            }

            /**
             * HttpTokens.
             */
            public Builder httpTokens(String httpTokens) {
                this.httpTokens = httpTokens;
                return this;
            }

            /**
             * InstanceMetadataTags.
             */
            public Builder instanceMetadataTags(String instanceMetadataTags) {
                this.instanceMetadataTags = instanceMetadataTags;
                return this;
            }

            public MetadataOptions build() {
                return new MetadataOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
             * Ipv4Prefix.
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
             * Ipv6Prefix.
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Ipv6Set extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        private Ipv6Set(Builder builder) {
            this.ipv6Address = builder.ipv6Address;
            this.primary = builder.primary;
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

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        public static final class Builder {
            private String ipv6Address; 
            private Boolean primary; 

            private Builder() {
            } 

            private Builder(Ipv6Set model) {
                this.ipv6Address = model.ipv6Address;
                this.primary = model.primary;
            } 

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            public Ipv6Set build() {
                return new Ipv6Set(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateIpSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PrivateDnsName")
        private String privateDnsName;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSet(Builder builder) {
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
            private Boolean primary; 
            private String privateDnsName; 
            private String privateIpAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpSet model) {
                this.primary = model.primary;
                this.privateDnsName = model.privateDnsName;
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
             * PrivateDnsName.
             */
            public Builder privateDnsName(String privateDnsName) {
                this.privateDnsName = privateDnsName;
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NetworkInterface model) {
                this.ipv4PrefixSets = model.ipv4PrefixSets;
                this.ipv6PrefixSets = model.ipv6PrefixSets;
                this.ipv6Sets = model.ipv6Sets;
                this.macAddress = model.macAddress;
                this.networkInterfaceId = model.networkInterfaceId;
                this.primaryIpAddress = model.primaryIpAddress;
                this.privateIpSets = model.privateIpSets;
                this.type = model.type;
            } 

            /**
             * Ipv4PrefixSets.
             */
            public Builder ipv4PrefixSets(Ipv4PrefixSets ipv4PrefixSets) {
                this.ipv4PrefixSets = ipv4PrefixSets;
                return this;
            }

            /**
             * Ipv6PrefixSets.
             */
            public Builder ipv6PrefixSets(Ipv6PrefixSets ipv6PrefixSets) {
                this.ipv6PrefixSets = ipv6PrefixSets;
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
             * PrimaryIpAddress.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
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
             * Type.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class NetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterface")
        private java.util.List<NetworkInterface> networkInterface;

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
        public java.util.List<NetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

        public static final class Builder {
            private java.util.List<NetworkInterface> networkInterface; 

            private Builder() {
            } 

            private Builder(NetworkInterfaces model) {
                this.networkInterface = model.networkInterface;
            } 

            /**
             * NetworkInterface.
             */
            public Builder networkInterface(java.util.List<NetworkInterface> networkInterface) {
                this.networkInterface = networkInterface;
                return this;
            }

            public NetworkInterfaces build() {
                return new NetworkInterfaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(LockReason model) {
                this.lockMsg = model.lockMsg;
                this.lockReason = model.lockReason;
            } 

            /**
             * LockMsg.
             */
            public Builder lockMsg(String lockMsg) {
                this.lockMsg = lockMsg;
                return this;
            }

            /**
             * LockReason.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private java.util.List<LockReason> lockReason;

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
        public java.util.List<LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List<LockReason> lockReason; 

            private Builder() {
            } 

            private Builder(OperationLocks model) {
                this.lockReason = model.lockReason;
            } 

            /**
             * LockReason.
             */
            public Builder lockReason(java.util.List<LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateDnsNameOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableInstanceIdDnsAAAARecord")
        private Boolean enableInstanceIdDnsAAAARecord;

        @com.aliyun.core.annotation.NameInMap("EnableInstanceIdDnsARecord")
        private Boolean enableInstanceIdDnsARecord;

        @com.aliyun.core.annotation.NameInMap("EnableIpDnsARecord")
        private Boolean enableIpDnsARecord;

        @com.aliyun.core.annotation.NameInMap("EnableIpDnsPtrRecord")
        private Boolean enableIpDnsPtrRecord;

        @com.aliyun.core.annotation.NameInMap("HostnameType")
        private String hostnameType;

        private PrivateDnsNameOptions(Builder builder) {
            this.enableInstanceIdDnsAAAARecord = builder.enableInstanceIdDnsAAAARecord;
            this.enableInstanceIdDnsARecord = builder.enableInstanceIdDnsARecord;
            this.enableIpDnsARecord = builder.enableIpDnsARecord;
            this.enableIpDnsPtrRecord = builder.enableIpDnsPtrRecord;
            this.hostnameType = builder.hostnameType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateDnsNameOptions create() {
            return builder().build();
        }

        /**
         * @return enableInstanceIdDnsAAAARecord
         */
        public Boolean getEnableInstanceIdDnsAAAARecord() {
            return this.enableInstanceIdDnsAAAARecord;
        }

        /**
         * @return enableInstanceIdDnsARecord
         */
        public Boolean getEnableInstanceIdDnsARecord() {
            return this.enableInstanceIdDnsARecord;
        }

        /**
         * @return enableIpDnsARecord
         */
        public Boolean getEnableIpDnsARecord() {
            return this.enableIpDnsARecord;
        }

        /**
         * @return enableIpDnsPtrRecord
         */
        public Boolean getEnableIpDnsPtrRecord() {
            return this.enableIpDnsPtrRecord;
        }

        /**
         * @return hostnameType
         */
        public String getHostnameType() {
            return this.hostnameType;
        }

        public static final class Builder {
            private Boolean enableInstanceIdDnsAAAARecord; 
            private Boolean enableInstanceIdDnsARecord; 
            private Boolean enableIpDnsARecord; 
            private Boolean enableIpDnsPtrRecord; 
            private String hostnameType; 

            private Builder() {
            } 

            private Builder(PrivateDnsNameOptions model) {
                this.enableInstanceIdDnsAAAARecord = model.enableInstanceIdDnsAAAARecord;
                this.enableInstanceIdDnsARecord = model.enableInstanceIdDnsARecord;
                this.enableIpDnsARecord = model.enableIpDnsARecord;
                this.enableIpDnsPtrRecord = model.enableIpDnsPtrRecord;
                this.hostnameType = model.hostnameType;
            } 

            /**
             * EnableInstanceIdDnsAAAARecord.
             */
            public Builder enableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
                this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
                return this;
            }

            /**
             * EnableInstanceIdDnsARecord.
             */
            public Builder enableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
                this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
                return this;
            }

            /**
             * EnableIpDnsARecord.
             */
            public Builder enableIpDnsARecord(Boolean enableIpDnsARecord) {
                this.enableIpDnsARecord = enableIpDnsARecord;
                return this;
            }

            /**
             * EnableIpDnsPtrRecord.
             */
            public Builder enableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
                this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
                return this;
            }

            /**
             * HostnameType.
             */
            public Builder hostnameType(String hostnameType) {
                this.hostnameType = hostnameType;
                return this;
            }

            public PrivateDnsNameOptions build() {
                return new PrivateDnsNameOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PublicIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

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
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(PublicIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PublicIpAddress build() {
                return new PublicIpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class RdmaIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

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
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(RdmaIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public RdmaIpAddress build() {
                return new RdmaIpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class SecurityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSecureBoot")
        private Boolean enableSecureBoot;

        private SecurityOptions(Builder builder) {
            this.enableSecureBoot = builder.enableSecureBoot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityOptions create() {
            return builder().build();
        }

        /**
         * @return enableSecureBoot
         */
        public Boolean getEnableSecureBoot() {
            return this.enableSecureBoot;
        }

        public static final class Builder {
            private Boolean enableSecureBoot; 

            private Builder() {
            } 

            private Builder(SecurityOptions model) {
                this.enableSecureBoot = model.enableSecureBoot;
            } 

            /**
             * EnableSecureBoot.
             */
            public Builder enableSecureBoot(Boolean enableSecureBoot) {
                this.enableSecureBoot = enableSecureBoot;
                return this;
            }

            public SecurityOptions build() {
                return new SecurityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

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
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PrivateIpAddress build() {
                return new PrivateIpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VpcAttributes model) {
                this.natIpAddress = model.natIpAddress;
                this.privateIpAddress = model.privateIpAddress;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * NatIpAddress.
             */
            public Builder natIpAddress(String natIpAddress) {
                this.natIpAddress = natIpAddress;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(PrivateIpAddress privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
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

            public VpcAttributes build() {
                return new VpcAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalInfo")
        private AdditionalInfo additionalInfo;

        @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @com.aliyun.core.annotation.NameInMap("ClockOptions")
        private ClockOptions clockOptions;

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

        @com.aliyun.core.annotation.NameInMap("EnableNVS")
        private Boolean enableNVS;

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

        @com.aliyun.core.annotation.NameInMap("PrivateDnsNameOptions")
        private PrivateDnsNameOptions privateDnsNameOptions;

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

        @com.aliyun.core.annotation.NameInMap("SecurityOptions")
        private SecurityOptions securityOptions;

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
            this.additionalInfo = builder.additionalInfo;
            this.autoReleaseTime = builder.autoReleaseTime;
            this.clockOptions = builder.clockOptions;
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
            this.enableNVS = builder.enableNVS;
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
            this.privateDnsNameOptions = builder.privateDnsNameOptions;
            this.publicIpAddress = builder.publicIpAddress;
            this.rdmaIpAddress = builder.rdmaIpAddress;
            this.recyclable = builder.recyclable;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.saleCycle = builder.saleCycle;
            this.securityGroupIds = builder.securityGroupIds;
            this.securityOptions = builder.securityOptions;
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
         * @return additionalInfo
         */
        public AdditionalInfo getAdditionalInfo() {
            return this.additionalInfo;
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return clockOptions
         */
        public ClockOptions getClockOptions() {
            return this.clockOptions;
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
         * @return enableNVS
         */
        public Boolean getEnableNVS() {
            return this.enableNVS;
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
         * @return privateDnsNameOptions
         */
        public PrivateDnsNameOptions getPrivateDnsNameOptions() {
            return this.privateDnsNameOptions;
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
         * @return securityOptions
         */
        public SecurityOptions getSecurityOptions() {
            return this.securityOptions;
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
            private AdditionalInfo additionalInfo; 
            private String autoReleaseTime; 
            private ClockOptions clockOptions; 
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
            private Boolean enableNVS; 
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
            private PrivateDnsNameOptions privateDnsNameOptions; 
            private PublicIpAddress publicIpAddress; 
            private RdmaIpAddress rdmaIpAddress; 
            private Boolean recyclable; 
            private String regionId; 
            private String resourceGroupId; 
            private String saleCycle; 
            private SecurityGroupIds securityGroupIds; 
            private SecurityOptions securityOptions; 
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

            private Builder() {
            } 

            private Builder(Instance model) {
                this.additionalInfo = model.additionalInfo;
                this.autoReleaseTime = model.autoReleaseTime;
                this.clockOptions = model.clockOptions;
                this.clusterId = model.clusterId;
                this.cpu = model.cpu;
                this.cpuOptions = model.cpuOptions;
                this.creationTime = model.creationTime;
                this.creditSpecification = model.creditSpecification;
                this.dedicatedHostAttribute = model.dedicatedHostAttribute;
                this.dedicatedInstanceAttribute = model.dedicatedInstanceAttribute;
                this.deletionProtection = model.deletionProtection;
                this.deploymentSetGroupNo = model.deploymentSetGroupNo;
                this.deploymentSetId = model.deploymentSetId;
                this.description = model.description;
                this.deviceAvailable = model.deviceAvailable;
                this.ecsCapacityReservationAttr = model.ecsCapacityReservationAttr;
                this.eipAddress = model.eipAddress;
                this.enableNVS = model.enableNVS;
                this.expiredTime = model.expiredTime;
                this.GPUAmount = model.GPUAmount;
                this.GPUSpec = model.GPUSpec;
                this.hibernationOptions = model.hibernationOptions;
                this.hostName = model.hostName;
                this.hpcClusterId = model.hpcClusterId;
                this.ISP = model.ISP;
                this.imageId = model.imageId;
                this.imageOptions = model.imageOptions;
                this.innerIpAddress = model.innerIpAddress;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceNetworkType = model.instanceNetworkType;
                this.instanceType = model.instanceType;
                this.instanceTypeFamily = model.instanceTypeFamily;
                this.internetChargeType = model.internetChargeType;
                this.internetMaxBandwidthIn = model.internetMaxBandwidthIn;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.ioOptimized = model.ioOptimized;
                this.keyPairName = model.keyPairName;
                this.localStorageAmount = model.localStorageAmount;
                this.localStorageCapacity = model.localStorageCapacity;
                this.memory = model.memory;
                this.metadataOptions = model.metadataOptions;
                this.networkInterfaces = model.networkInterfaces;
                this.OSName = model.OSName;
                this.OSNameEn = model.OSNameEn;
                this.OSType = model.OSType;
                this.operationLocks = model.operationLocks;
                this.privateDnsNameOptions = model.privateDnsNameOptions;
                this.publicIpAddress = model.publicIpAddress;
                this.rdmaIpAddress = model.rdmaIpAddress;
                this.recyclable = model.recyclable;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.saleCycle = model.saleCycle;
                this.securityGroupIds = model.securityGroupIds;
                this.securityOptions = model.securityOptions;
                this.serialNumber = model.serialNumber;
                this.spotDuration = model.spotDuration;
                this.spotInterruptionBehavior = model.spotInterruptionBehavior;
                this.spotPriceLimit = model.spotPriceLimit;
                this.spotStrategy = model.spotStrategy;
                this.startTime = model.startTime;
                this.status = model.status;
                this.stoppedMode = model.stoppedMode;
                this.tags = model.tags;
                this.vlanId = model.vlanId;
                this.vpcAttributes = model.vpcAttributes;
                this.zoneId = model.zoneId;
            } 

            /**
             * AdditionalInfo.
             */
            public Builder additionalInfo(AdditionalInfo additionalInfo) {
                this.additionalInfo = additionalInfo;
                return this;
            }

            /**
             * AutoReleaseTime.
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * ClockOptions.
             */
            public Builder clockOptions(ClockOptions clockOptions) {
                this.clockOptions = clockOptions;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CpuOptions.
             */
            public Builder cpuOptions(CpuOptions cpuOptions) {
                this.cpuOptions = cpuOptions;
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
             * CreditSpecification.
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * DedicatedHostAttribute.
             */
            public Builder dedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
                this.dedicatedHostAttribute = dedicatedHostAttribute;
                return this;
            }

            /**
             * DedicatedInstanceAttribute.
             */
            public Builder dedicatedInstanceAttribute(DedicatedInstanceAttribute dedicatedInstanceAttribute) {
                this.dedicatedInstanceAttribute = dedicatedInstanceAttribute;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * DeploymentSetGroupNo.
             */
            public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
                this.deploymentSetGroupNo = deploymentSetGroupNo;
                return this;
            }

            /**
             * DeploymentSetId.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
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
             * DeviceAvailable.
             */
            public Builder deviceAvailable(Boolean deviceAvailable) {
                this.deviceAvailable = deviceAvailable;
                return this;
            }

            /**
             * EcsCapacityReservationAttr.
             */
            public Builder ecsCapacityReservationAttr(EcsCapacityReservationAttr ecsCapacityReservationAttr) {
                this.ecsCapacityReservationAttr = ecsCapacityReservationAttr;
                return this;
            }

            /**
             * EipAddress.
             */
            public Builder eipAddress(EipAddress eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            /**
             * EnableNVS.
             */
            public Builder enableNVS(Boolean enableNVS) {
                this.enableNVS = enableNVS;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GPUAmount.
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * GPUSpec.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * HibernationOptions.
             */
            public Builder hibernationOptions(HibernationOptions hibernationOptions) {
                this.hibernationOptions = hibernationOptions;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * HpcClusterId.
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageOptions.
             */
            public Builder imageOptions(ImageOptions imageOptions) {
                this.imageOptions = imageOptions;
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
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceNetworkType.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * InternetMaxBandwidthIn.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * InternetMaxBandwidthOut.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * IoOptimized.
             */
            public Builder ioOptimized(Boolean ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * LocalStorageAmount.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * LocalStorageCapacity.
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * MetadataOptions.
             */
            public Builder metadataOptions(MetadataOptions metadataOptions) {
                this.metadataOptions = metadataOptions;
                return this;
            }

            /**
             * NetworkInterfaces.
             */
            public Builder networkInterfaces(NetworkInterfaces networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * OSName.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * OSNameEn.
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * OSType.
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * OperationLocks.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * PrivateDnsNameOptions.
             */
            public Builder privateDnsNameOptions(PrivateDnsNameOptions privateDnsNameOptions) {
                this.privateDnsNameOptions = privateDnsNameOptions;
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
             * RdmaIpAddress.
             */
            public Builder rdmaIpAddress(RdmaIpAddress rdmaIpAddress) {
                this.rdmaIpAddress = rdmaIpAddress;
                return this;
            }

            /**
             * Recyclable.
             */
            public Builder recyclable(Boolean recyclable) {
                this.recyclable = recyclable;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * SaleCycle.
             */
            public Builder saleCycle(String saleCycle) {
                this.saleCycle = saleCycle;
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
             * SecurityOptions.
             */
            public Builder securityOptions(SecurityOptions securityOptions) {
                this.securityOptions = securityOptions;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * SpotDuration.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * SpotInterruptionBehavior.
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * StoppedMode.
             */
            public Builder stoppedMode(String stoppedMode) {
                this.stoppedMode = stoppedMode;
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
             * VlanId.
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * VpcAttributes.
             */
            public Builder vpcAttributes(VpcAttributes vpcAttributes) {
                this.vpcAttributes = vpcAttributes;
                return this;
            }

            /**
             * ZoneId.
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

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
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instance = model.instance;
            } 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
