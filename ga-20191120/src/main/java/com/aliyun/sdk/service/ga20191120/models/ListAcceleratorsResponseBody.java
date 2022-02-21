// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAcceleratorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAcceleratorsResponseBody</p>
 */
public class ListAcceleratorsResponseBody extends TeaModel {
    @NameInMap("Accelerators")
    private java.util.List < Accelerators> accelerators;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAcceleratorsResponseBody(Builder builder) {
        this.accelerators = builder.accelerators;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAcceleratorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerators
     */
    public java.util.List < Accelerators> getAccelerators() {
        return this.accelerators;
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
        private java.util.List < Accelerators> accelerators; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Accelerators.
         */
        public Builder accelerators(java.util.List < Accelerators> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAcceleratorsResponseBody build() {
            return new ListAcceleratorsResponseBody(this);
        } 

    } 

    public static class BasicBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BandwidthType")
        private String bandwidthType;

        @NameInMap("InstanceId")
        private String instanceId;

        private BasicBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthType = builder.bandwidthType;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String bandwidthType; 
            private String instanceId; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * BandwidthType.
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public BasicBandwidthPackage build() {
                return new BasicBandwidthPackage(this);
            } 

        } 

    }
    public static class CrossDomainBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("InstanceId")
        private String instanceId;

        private CrossDomainBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossDomainBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String instanceId; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public CrossDomainBandwidthPackage build() {
                return new CrossDomainBandwidthPackage(this);
            } 

        } 

    }
    public static class Accelerators extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BasicBandwidthPackage")
        private BasicBandwidthPackage basicBandwidthPackage;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CrossDomainBandwidthPackage")
        private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

        @NameInMap("DdosId")
        private String ddosId;

        @NameInMap("Description")
        private String description;

        @NameInMap("DnsName")
        private String dnsName;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecondDnsName")
        private String secondDnsName;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("State")
        private String state;

        @NameInMap("Type")
        private String type;

        private Accelerators(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.bandwidth = builder.bandwidth;
            this.basicBandwidthPackage = builder.basicBandwidthPackage;
            this.cenId = builder.cenId;
            this.createTime = builder.createTime;
            this.crossDomainBandwidthPackage = builder.crossDomainBandwidthPackage;
            this.ddosId = builder.ddosId;
            this.description = builder.description;
            this.dnsName = builder.dnsName;
            this.expiredTime = builder.expiredTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.secondDnsName = builder.secondDnsName;
            this.spec = builder.spec;
            this.state = builder.state;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accelerators create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return basicBandwidthPackage
         */
        public BasicBandwidthPackage getBasicBandwidthPackage() {
            return this.basicBandwidthPackage;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return crossDomainBandwidthPackage
         */
        public CrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
            return this.crossDomainBandwidthPackage;
        }

        /**
         * @return ddosId
         */
        public String getDdosId() {
            return this.ddosId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dnsName
         */
        public String getDnsName() {
            return this.dnsName;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return secondDnsName
         */
        public String getSecondDnsName() {
            return this.secondDnsName;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String acceleratorId; 
            private Integer bandwidth; 
            private BasicBandwidthPackage basicBandwidthPackage; 
            private String cenId; 
            private Long createTime; 
            private CrossDomainBandwidthPackage crossDomainBandwidthPackage; 
            private String ddosId; 
            private String description; 
            private String dnsName; 
            private Long expiredTime; 
            private String instanceChargeType; 
            private String name; 
            private String regionId; 
            private String secondDnsName; 
            private String spec; 
            private String state; 
            private String type; 

            /**
             * AcceleratorId.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
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
             * BasicBandwidthPackage.
             */
            public Builder basicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
                this.basicBandwidthPackage = basicBandwidthPackage;
                return this;
            }

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CrossDomainBandwidthPackage.
             */
            public Builder crossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
                this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
                return this;
            }

            /**
             * DdosId.
             */
            public Builder ddosId(String ddosId) {
                this.ddosId = ddosId;
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
             * DnsName.
             */
            public Builder dnsName(String dnsName) {
                this.dnsName = dnsName;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * SecondDnsName.
             */
            public Builder secondDnsName(String secondDnsName) {
                this.secondDnsName = secondDnsName;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Accelerators build() {
                return new Accelerators(this);
            } 

        } 

    }
}
