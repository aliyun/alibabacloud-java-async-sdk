// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsRouteEntryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsRouteEntryListResponseBody</p>
 */
public class DescribeEnsRouteEntryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntrys")
    private java.util.List<RouteEntrys> routeEntrys;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEnsRouteEntryListResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routeEntrys = builder.routeEntrys;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRouteEntryListResponseBody create() {
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
     * @return routeEntrys
     */
    public java.util.List<RouteEntrys> getRouteEntrys() {
        return this.routeEntrys;
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
        private java.util.List<RouteEntrys> routeEntrys; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEnsRouteEntryListResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.routeEntrys = model.routeEntrys;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>The information about the routes.</p>
         */
        public Builder routeEntrys(java.util.List<RouteEntrys> routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEnsRouteEntryListResponseBody build() {
            return new DescribeEnsRouteEntryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsRouteEntryListResponseBody</p>
     */
    public static class NextHops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopName")
        private String nextHopName;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        private NextHops(Builder builder) {
            this.nextHopId = builder.nextHopId;
            this.nextHopName = builder.nextHopName;
            this.nextHopType = builder.nextHopType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHops create() {
            return builder().build();
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopName
         */
        public String getNextHopName() {
            return this.nextHopName;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        public static final class Builder {
            private String nextHopId; 
            private String nextHopName; 
            private String nextHopType; 

            private Builder() {
            } 

            private Builder(NextHops model) {
                this.nextHopId = model.nextHopId;
                this.nextHopName = model.nextHopName;
                this.nextHopType = model.nextHopType;
            } 

            /**
             * <p>The ID of the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1111yup9991890woxq</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The instance ID of the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>testInstance</p>
             */
            public Builder nextHopName(String nextHopName) {
                this.nextHopName = nextHopName;
                return this;
            }

            /**
             * <p>The type of the next hop. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            public NextHops build() {
                return new NextHops(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsRouteEntryListResponseBody</p>
     */
    public static class RouteEntrys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("NextHops")
        private java.util.List<NextHops> nextHops;

        @com.aliyun.core.annotation.NameInMap("RouteEntryId")
        private String routeEntryId;

        @com.aliyun.core.annotation.NameInMap("RouteEntryName")
        private String routeEntryName;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RouteEntrys(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.nextHops = builder.nextHops;
            this.routeEntryId = builder.routeEntryId;
            this.routeEntryName = builder.routeEntryName;
            this.routeTableId = builder.routeTableId;
            this.sourceCidrBlock = builder.sourceCidrBlock;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntrys create() {
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
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return nextHops
         */
        public java.util.List<NextHops> getNextHops() {
            return this.nextHops;
        }

        /**
         * @return routeEntryId
         */
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        /**
         * @return routeEntryName
         */
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return sourceCidrBlock
         */
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String destinationCidrBlock; 
            private java.util.List<NextHops> nextHops; 
            private String routeEntryId; 
            private String routeEntryName; 
            private String routeTableId; 
            private String sourceCidrBlock; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(RouteEntrys model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.nextHops = model.nextHops;
                this.routeEntryId = model.routeEntryId;
                this.routeEntryName = model.routeEntryName;
                this.routeTableId = model.routeTableId;
                this.sourceCidrBlock = model.sourceCidrBlock;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The time when the entry was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-16T03:50:05Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Enter a description for the route.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>101.0.45.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The information about the next hop.</p>
             */
            public Builder nextHops(java.util.List<NextHops> nextHops) {
                this.nextHops = nextHops;
                return this;
            }

            /**
             * <p>The ID of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>rte-2zeksx7h436f5unk349m1</p>
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            /**
             * <p>The name of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>test0</p>
             */
            public Builder routeEntryName(String routeEntryName) {
                this.routeEntryName = routeEntryName;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-uf62p9o5cn35fi8xgurnm</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The new source CIDR block of the inbound or outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>10.XXX.XXX.0/24</p>
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * <p>The status of the route entry. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the route entry.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RouteEntrys build() {
                return new RouteEntrys(this);
            } 

        } 

    }
}
