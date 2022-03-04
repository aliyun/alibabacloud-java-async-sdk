// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatGatewaysResponseBody</p>
 */
public class DescribeNatGatewaysResponseBody extends TeaModel {
    @NameInMap("NatGateways")
    private NatGateways natGateways;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNatGatewaysResponseBody(Builder builder) {
        this.natGateways = builder.natGateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return natGateways
     */
    public NatGateways getNatGateways() {
        return this.natGateways;
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
        private NatGateways natGateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * NatGateways.
         */
        public Builder natGateways(NatGateways natGateways) {
            this.natGateways = natGateways;
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

        public DescribeNatGatewaysResponseBody build() {
            return new DescribeNatGatewaysResponseBody(this);
        } 

    } 

    public static class BandwidthPackageIds extends TeaModel {
        @NameInMap("BandwidthPackageId")
        private java.util.List < String > bandwidthPackageId;

        private BandwidthPackageIds(Builder builder) {
            this.bandwidthPackageId = builder.bandwidthPackageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthPackageIds create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackageId
         */
        public java.util.List < String > getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public static final class Builder {
            private java.util.List < String > bandwidthPackageId; 

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(java.util.List < String > bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            public BandwidthPackageIds build() {
                return new BandwidthPackageIds(this);
            } 

        } 

    }
    public static class ForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        private java.util.List < String > forwardTableId;

        private ForwardTableIds(Builder builder) {
            this.forwardTableId = builder.forwardTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardTableIds create() {
            return builder().build();
        }

        /**
         * @return forwardTableId
         */
        public java.util.List < String > getForwardTableId() {
            return this.forwardTableId;
        }

        public static final class Builder {
            private java.util.List < String > forwardTableId; 

            /**
             * ForwardTableId.
             */
            public Builder forwardTableId(java.util.List < String > forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            public ForwardTableIds build() {
                return new ForwardTableIds(this);
            } 

        } 

    }
    public static class NatGateway extends TeaModel {
        @NameInMap("BandwidthPackageIds")
        private BandwidthPackageIds bandwidthPackageIds;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ForwardTableIds")
        private ForwardTableIds forwardTableIds;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("Name")
        private String name;

        @NameInMap("NatGatewayId")
        private String natGatewayId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        private NatGateway(Builder builder) {
            this.bandwidthPackageIds = builder.bandwidthPackageIds;
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.forwardTableIds = builder.forwardTableIds;
            this.instanceChargeType = builder.instanceChargeType;
            this.name = builder.name;
            this.natGatewayId = builder.natGatewayId;
            this.regionId = builder.regionId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateway create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackageIds
         */
        public BandwidthPackageIds getBandwidthPackageIds() {
            return this.bandwidthPackageIds;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
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
         * @return forwardTableIds
         */
        public ForwardTableIds getForwardTableIds() {
            return this.forwardTableIds;
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
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private BandwidthPackageIds bandwidthPackageIds; 
            private String businessStatus; 
            private String creationTime; 
            private String description; 
            private ForwardTableIds forwardTableIds; 
            private String instanceChargeType; 
            private String name; 
            private String natGatewayId; 
            private String regionId; 
            private String spec; 
            private String status; 
            private String vpcId; 

            /**
             * BandwidthPackageIds.
             */
            public Builder bandwidthPackageIds(BandwidthPackageIds bandwidthPackageIds) {
                this.bandwidthPackageIds = bandwidthPackageIds;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
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
             * ForwardTableIds.
             */
            public Builder forwardTableIds(ForwardTableIds forwardTableIds) {
                this.forwardTableIds = forwardTableIds;
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
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
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
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NatGateway build() {
                return new NatGateway(this);
            } 

        } 

    }
    public static class NatGateways extends TeaModel {
        @NameInMap("NatGateway")
        private java.util.List < NatGateway> natGateway;

        private NatGateways(Builder builder) {
            this.natGateway = builder.natGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateways create() {
            return builder().build();
        }

        /**
         * @return natGateway
         */
        public java.util.List < NatGateway> getNatGateway() {
            return this.natGateway;
        }

        public static final class Builder {
            private java.util.List < NatGateway> natGateway; 

            /**
             * NatGateway.
             */
            public Builder natGateway(java.util.List < NatGateway> natGateway) {
                this.natGateway = natGateway;
                return this;
            }

            public NatGateways build() {
                return new NatGateways(this);
            } 

        } 

    }
}
