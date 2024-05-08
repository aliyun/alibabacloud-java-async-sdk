// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVRoutersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVRoutersResponseBody</p>
 */
public class DescribeVRoutersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VRouters")
    private VRouters vRouters;

    private DescribeVRoutersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vRouters = builder.vRouters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVRoutersResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vRouters
     */
    public VRouters getVRouters() {
        return this.vRouters;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VRouters vRouters; 

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

        /**
         * VRouters.
         */
        public Builder vRouters(VRouters vRouters) {
            this.vRouters = vRouters;
            return this;
        }

        public DescribeVRoutersResponseBody build() {
            return new DescribeVRoutersResponseBody(this);
        } 

    } 

    public static class RouteTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private java.util.List < String > routeTableId;

        private RouteTableIds(Builder builder) {
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTableIds create() {
            return builder().build();
        }

        /**
         * @return routeTableId
         */
        public java.util.List < String > getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List < String > routeTableId; 

            /**
             * RouteTableId.
             */
            public Builder routeTableId(java.util.List < String > routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public RouteTableIds build() {
                return new RouteTableIds(this);
            } 

        } 

    }
    public static class VRouter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteTableIds")
        private RouteTableIds routeTableIds;

        @com.aliyun.core.annotation.NameInMap("VRouterId")
        private String vRouterId;

        @com.aliyun.core.annotation.NameInMap("VRouterName")
        private String vRouterName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private VRouter(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.routeTableIds = builder.routeTableIds;
            this.vRouterId = builder.vRouterId;
            this.vRouterName = builder.vRouterName;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VRouter create() {
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeTableIds
         */
        public RouteTableIds getRouteTableIds() {
            return this.routeTableIds;
        }

        /**
         * @return vRouterId
         */
        public String getVRouterId() {
            return this.vRouterId;
        }

        /**
         * @return vRouterName
         */
        public String getVRouterName() {
            return this.vRouterName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String regionId; 
            private RouteTableIds routeTableIds; 
            private String vRouterId; 
            private String vRouterName; 
            private String vpcId; 

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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RouteTableIds.
             */
            public Builder routeTableIds(RouteTableIds routeTableIds) {
                this.routeTableIds = routeTableIds;
                return this;
            }

            /**
             * VRouterId.
             */
            public Builder vRouterId(String vRouterId) {
                this.vRouterId = vRouterId;
                return this;
            }

            /**
             * VRouterName.
             */
            public Builder vRouterName(String vRouterName) {
                this.vRouterName = vRouterName;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VRouter build() {
                return new VRouter(this);
            } 

        } 

    }
    public static class VRouters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VRouter")
        private java.util.List < VRouter> vRouter;

        private VRouters(Builder builder) {
            this.vRouter = builder.vRouter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VRouters create() {
            return builder().build();
        }

        /**
         * @return vRouter
         */
        public java.util.List < VRouter> getVRouter() {
            return this.vRouter;
        }

        public static final class Builder {
            private java.util.List < VRouter> vRouter; 

            /**
             * VRouter.
             */
            public Builder vRouter(java.util.List < VRouter> vRouter) {
                this.vRouter = vRouter;
                return this;
            }

            public VRouters build() {
                return new VRouters(this);
            } 

        } 

    }
}
