// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6GatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpv6GatewaysResponseBody</p>
 */
public class DescribeIpv6GatewaysResponseBody extends TeaModel {
    @NameInMap("Ipv6Gateways")
    private Ipv6Gateways ipv6Gateways;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIpv6GatewaysResponseBody(Builder builder) {
        this.ipv6Gateways = builder.ipv6Gateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpv6GatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6Gateways
     */
    public Ipv6Gateways getIpv6Gateways() {
        return this.ipv6Gateways;
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
        private Ipv6Gateways ipv6Gateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Ipv6Gateways.
         */
        public Builder ipv6Gateways(Ipv6Gateways ipv6Gateways) {
            this.ipv6Gateways = ipv6Gateways;
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

        public DescribeIpv6GatewaysResponseBody build() {
            return new DescribeIpv6GatewaysResponseBody(this);
        } 

    } 

    public static class Ipv6Gateway extends TeaModel {
        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("Ipv6GatewayId")
        private String ipv6GatewayId;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        private Ipv6Gateway(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.ipv6GatewayId = builder.ipv6GatewayId;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Gateway create() {
            return builder().build();
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return ipv6GatewayId
         */
        public String getIpv6GatewayId() {
            return this.ipv6GatewayId;
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
            private String businessStatus; 
            private String creationTime; 
            private String description; 
            private String expiredTime; 
            private String instanceChargeType; 
            private String ipv6GatewayId; 
            private String name; 
            private String regionId; 
            private String status; 
            private String vpcId; 

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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
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
             * Ipv6GatewayId.
             */
            public Builder ipv6GatewayId(String ipv6GatewayId) {
                this.ipv6GatewayId = ipv6GatewayId;
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

            public Ipv6Gateway build() {
                return new Ipv6Gateway(this);
            } 

        } 

    }
    public static class Ipv6Gateways extends TeaModel {
        @NameInMap("Ipv6Gateway")
        private java.util.List < Ipv6Gateway> ipv6Gateway;

        private Ipv6Gateways(Builder builder) {
            this.ipv6Gateway = builder.ipv6Gateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Gateways create() {
            return builder().build();
        }

        /**
         * @return ipv6Gateway
         */
        public java.util.List < Ipv6Gateway> getIpv6Gateway() {
            return this.ipv6Gateway;
        }

        public static final class Builder {
            private java.util.List < Ipv6Gateway> ipv6Gateway; 

            /**
             * Ipv6Gateway.
             */
            public Builder ipv6Gateway(java.util.List < Ipv6Gateway> ipv6Gateway) {
                this.ipv6Gateway = ipv6Gateway;
                return this;
            }

            public Ipv6Gateways build() {
                return new Ipv6Gateways(this);
            } 

        } 

    }
}
