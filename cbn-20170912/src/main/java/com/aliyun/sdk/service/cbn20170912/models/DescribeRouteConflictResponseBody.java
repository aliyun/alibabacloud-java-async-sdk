// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeRouteConflictResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteConflictResponseBody</p>
 */
public class DescribeRouteConflictResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteConflicts")
    private RouteConflicts routeConflicts;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRouteConflictResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.routeConflicts = model.routeConflicts;
            this.totalCount = model.totalCount;
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
         * <p>The number of entries per page during paging.</p>
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
         * <p>EE3A2CC7-41F1-58DB-8306-CFC99D9C747B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouteConflicts.
         */
        public Builder routeConflicts(RouteConflicts routeConflicts) {
            this.routeConflicts = routeConflicts;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouteConflictResponseBody build() {
            return new DescribeRouteConflictResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRouteConflictResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteConflictResponseBody</p>
     */
    public static class RouteConflict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(RouteConflict model) {
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
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

            public RouteConflict build() {
                return new RouteConflict(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteConflictResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteConflictResponseBody</p>
     */
    public static class RouteConflicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteConflict")
        private java.util.List<RouteConflict> routeConflict;

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
        public java.util.List<RouteConflict> getRouteConflict() {
            return this.routeConflict;
        }

        public static final class Builder {
            private java.util.List<RouteConflict> routeConflict; 

            private Builder() {
            } 

            private Builder(RouteConflicts model) {
                this.routeConflict = model.routeConflict;
            } 

            /**
             * RouteConflict.
             */
            public Builder routeConflict(java.util.List<RouteConflict> routeConflict) {
                this.routeConflict = routeConflict;
                return this;
            }

            public RouteConflicts build() {
                return new RouteConflicts(this);
            } 

        } 

    }
}
