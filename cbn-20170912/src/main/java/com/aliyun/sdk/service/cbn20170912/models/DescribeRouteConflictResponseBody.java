// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteConflictResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteConflictResponseBody</p>
 */
public class DescribeRouteConflictResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteConflicts")
    private RouteConflicts routeConflicts;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRouteConflictResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routeConflicts = builder.routeConflicts;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteConflictResponseBody create() {
        return builder().build();
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
     * @return routeConflicts
     */
    public RouteConflicts getRouteConflicts() {
        return this.routeConflicts;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private RouteConflicts routeConflicts; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * A list of overlapping routes.
         */
        public Builder routeConflicts(RouteConflicts routeConflicts) {
            this.routeConflicts = routeConflicts;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouteConflictResponseBody build() {
            return new DescribeRouteConflictResponseBody(this);
        } 

    } 

    public static class RouteConflict extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        private RouteConflict(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteConflict create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
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

        public static final class Builder {
            private String destinationCidrBlock; 
            private String instanceId; 
            private String instanceType; 
            private String regionId; 
            private String status; 

            /**
             * The destination CIDR block of the overlapping route.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The ID of the peer network instance on which the overlapping routes are found.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the peer network instance on which the overlapping routes are found.
             * <p>
             * 
             * *   **VPC**: VPC
             * *   **VBR**: VBR
             * *   **CCN**: CCN instance
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The region ID of the peer network instance on which the overlapping routes are found is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The cause of the route error. Valid values:
             * <p>
             * 
             * *   **conflict**: The routes have the same destination CIDR block.
             * *   **overflow**: The number of routes in the route table configured on another network instance has reached the upper limit.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RouteConflict build() {
                return new RouteConflict(this);
            } 

        } 

    }
    public static class RouteConflicts extends TeaModel {
        @NameInMap("RouteConflict")
        private java.util.List < RouteConflict> routeConflict;

        private RouteConflicts(Builder builder) {
            this.routeConflict = builder.routeConflict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteConflicts create() {
            return builder().build();
        }

        /**
         * @return routeConflict
         */
        public java.util.List < RouteConflict> getRouteConflict() {
            return this.routeConflict;
        }

        public static final class Builder {
            private java.util.List < RouteConflict> routeConflict; 

            /**
             * RouteConflict.
             */
            public Builder routeConflict(java.util.List < RouteConflict> routeConflict) {
                this.routeConflict = routeConflict;
                return this;
            }

            public RouteConflicts build() {
                return new RouteConflicts(this);
            } 

        } 

    }
}
