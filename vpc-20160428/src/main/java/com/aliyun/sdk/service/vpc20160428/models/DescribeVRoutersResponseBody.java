// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVRoutersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVRoutersResponseBody</p>
 */
public class DescribeVRoutersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VRouters")
    private VRouters VRouters;

    private DescribeVRoutersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.VRouters = builder.VRouters;
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
     * @return VRouters
     */
    public VRouters getVRouters() {
        return this.VRouters;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VRouters VRouters; 

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
        public Builder VRouters(VRouters VRouters) {
            this.VRouters = VRouters;
            return this;
        }

        public DescribeVRoutersResponseBody build() {
            return new DescribeVRoutersResponseBody(this);
        } 

    } 

    public static class RouteTableIds extends TeaModel {
        @NameInMap("RouteTableId")
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
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RouteTableIds")
        private RouteTableIds routeTableIds;

        @NameInMap("VRouterId")
        private String VRouterId;

        @NameInMap("VRouterName")
        private String VRouterName;

        @NameInMap("VpcId")
        private String vpcId;

        private VRouter(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.routeTableIds = builder.routeTableIds;
            this.VRouterId = builder.VRouterId;
            this.VRouterName = builder.VRouterName;
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
         * @return VRouterId
         */
        public String getVRouterId() {
            return this.VRouterId;
        }

        /**
         * @return VRouterName
         */
        public String getVRouterName() {
            return this.VRouterName;
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
            private String VRouterId; 
            private String VRouterName; 
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
            public Builder VRouterId(String VRouterId) {
                this.VRouterId = VRouterId;
                return this;
            }

            /**
             * VRouterName.
             */
            public Builder VRouterName(String VRouterName) {
                this.VRouterName = VRouterName;
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
        @NameInMap("VRouter")
        private java.util.List < VRouter> VRouter;

        private VRouters(Builder builder) {
            this.VRouter = builder.VRouter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VRouters create() {
            return builder().build();
        }

        /**
         * @return VRouter
         */
        public java.util.List < VRouter> getVRouter() {
            return this.VRouter;
        }

        public static final class Builder {
            private java.util.List < VRouter> VRouter; 

            /**
             * VRouter.
             */
            public Builder VRouter(java.util.List < VRouter> VRouter) {
                this.VRouter = VRouter;
                return this;
            }

            public VRouters build() {
                return new VRouters(this);
            } 

        } 

    }
}
