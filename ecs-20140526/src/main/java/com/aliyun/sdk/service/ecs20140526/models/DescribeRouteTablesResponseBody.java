// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteTablesResponseBody</p>
 */
public class DescribeRouteTablesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteTables")
    private RouteTables routeTables;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRouteTablesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routeTables = builder.routeTables;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteTablesResponseBody create() {
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
     * @return routeTables
     */
    public RouteTables getRouteTables() {
        return this.routeTables;
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
        private RouteTables routeTables; 
        private Integer totalCount; 

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
         * RouteTables.
         */
        public Builder routeTables(RouteTables routeTables) {
            this.routeTables = routeTables;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouteTablesResponseBody build() {
            return new DescribeRouteTablesResponseBody(this);
        } 

    } 

    public static class NextHop extends TeaModel {
        @NameInMap("Enabled")
        private Integer enabled;

        @NameInMap("NextHopId")
        private String nextHopId;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("Weight")
        private Integer weight;

        private NextHop(Builder builder) {
            this.enabled = builder.enabled;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHop create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer enabled; 
            private String nextHopId; 
            private String nextHopType; 
            private Integer weight; 

            /**
             * Enabled.
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * NextHopId.
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * NextHopType.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public NextHop build() {
                return new NextHop(this);
            } 

        } 

    }
    public static class NextHops extends TeaModel {
        @NameInMap("NextHop")
        private java.util.List < NextHop> nextHop;

        private NextHops(Builder builder) {
            this.nextHop = builder.nextHop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHops create() {
            return builder().build();
        }

        /**
         * @return nextHop
         */
        public java.util.List < NextHop> getNextHop() {
            return this.nextHop;
        }

        public static final class Builder {
            private java.util.List < NextHop> nextHop; 

            /**
             * NextHop.
             */
            public Builder nextHop(java.util.List < NextHop> nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            public NextHops build() {
                return new NextHops(this);
            } 

        } 

    }
    public static class RouteEntry extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("NextHops")
        private NextHops nextHops;

        @NameInMap("RouteTableId")
        private String routeTableId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private RouteEntry(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.instanceId = builder.instanceId;
            this.nextHopType = builder.nextHopType;
            this.nextHops = builder.nextHops;
            this.routeTableId = builder.routeTableId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntry create() {
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
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return nextHops
         */
        public NextHops getNextHops() {
            return this.nextHops;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
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
            private String destinationCidrBlock; 
            private String instanceId; 
            private String nextHopType; 
            private NextHops nextHops; 
            private String routeTableId; 
            private String status; 
            private String type; 

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
             * NextHopType.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * NextHops.
             */
            public Builder nextHops(NextHops nextHops) {
                this.nextHops = nextHops;
                return this;
            }

            /**
             * RouteTableId.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RouteEntry build() {
                return new RouteEntry(this);
            } 

        } 

    }
    public static class RouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        private java.util.List < RouteEntry> routeEntry;

        private RouteEntrys(Builder builder) {
            this.routeEntry = builder.routeEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntrys create() {
            return builder().build();
        }

        /**
         * @return routeEntry
         */
        public java.util.List < RouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

        public static final class Builder {
            private java.util.List < RouteEntry> routeEntry; 

            /**
             * RouteEntry.
             */
            public Builder routeEntry(java.util.List < RouteEntry> routeEntry) {
                this.routeEntry = routeEntry;
                return this;
            }

            public RouteEntrys build() {
                return new RouteEntrys(this);
            } 

        } 

    }
    public static class RouteTable extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RouteEntrys")
        private RouteEntrys routeEntrys;

        @NameInMap("RouteTableId")
        private String routeTableId;

        @NameInMap("RouteTableType")
        private String routeTableType;

        @NameInMap("VRouterId")
        private String vRouterId;

        private RouteTable(Builder builder) {
            this.creationTime = builder.creationTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeEntrys = builder.routeEntrys;
            this.routeTableId = builder.routeTableId;
            this.routeTableType = builder.routeTableType;
            this.vRouterId = builder.vRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTable create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routeEntrys
         */
        public RouteEntrys getRouteEntrys() {
            return this.routeEntrys;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return routeTableType
         */
        public String getRouteTableType() {
            return this.routeTableType;
        }

        /**
         * @return vRouterId
         */
        public String getVRouterId() {
            return this.vRouterId;
        }

        public static final class Builder {
            private String creationTime; 
            private String resourceGroupId; 
            private RouteEntrys routeEntrys; 
            private String routeTableId; 
            private String routeTableType; 
            private String vRouterId; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * RouteEntrys.
             */
            public Builder routeEntrys(RouteEntrys routeEntrys) {
                this.routeEntrys = routeEntrys;
                return this;
            }

            /**
             * RouteTableId.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * RouteTableType.
             */
            public Builder routeTableType(String routeTableType) {
                this.routeTableType = routeTableType;
                return this;
            }

            /**
             * VRouterId.
             */
            public Builder vRouterId(String vRouterId) {
                this.vRouterId = vRouterId;
                return this;
            }

            public RouteTable build() {
                return new RouteTable(this);
            } 

        } 

    }
    public static class RouteTables extends TeaModel {
        @NameInMap("RouteTable")
        private java.util.List < RouteTable> routeTable;

        private RouteTables(Builder builder) {
            this.routeTable = builder.routeTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTables create() {
            return builder().build();
        }

        /**
         * @return routeTable
         */
        public java.util.List < RouteTable> getRouteTable() {
            return this.routeTable;
        }

        public static final class Builder {
            private java.util.List < RouteTable> routeTable; 

            /**
             * RouteTable.
             */
            public Builder routeTable(java.util.List < RouteTable> routeTable) {
                this.routeTable = routeTable;
                return this;
            }

            public RouteTables build() {
                return new RouteTables(this);
            } 

        } 

    }
}
