// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteTablesResponseBody</p>
 */
public class DescribeRouteTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteTables")
    private RouteTables routeTables;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

        private Builder() {
        } 

        private Builder(DescribeRouteTablesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.routeTables = model.routeTables;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
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
         * <p>DC668356-BCB4-42FD-9BC3-FA2B2E04B634</p>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouteTablesResponseBody build() {
            return new DescribeRouteTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteTablesResponseBody</p>
     */
    public static class NextHop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Integer enabled;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("Weight")
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

            private Builder() {
            } 

            private Builder(NextHop model) {
                this.enabled = model.enabled;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.weight = model.weight;
            } 

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
    /**
     * 
     * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteTablesResponseBody</p>
     */
    public static class NextHops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextHop")
        private java.util.List<NextHop> nextHop;

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
        public java.util.List<NextHop> getNextHop() {
            return this.nextHop;
        }

        public static final class Builder {
            private java.util.List<NextHop> nextHop; 

            private Builder() {
            } 

            private Builder(NextHops model) {
                this.nextHop = model.nextHop;
            } 

            /**
             * NextHop.
             */
            public Builder nextHop(java.util.List<NextHop> nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            public NextHops build() {
                return new NextHops(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteTablesResponseBody</p>
     */
    public static class RouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("NextHops")
        private NextHops nextHops;

        @com.aliyun.core.annotation.NameInMap("RouteEntryId")
        private String routeEntryId;

        @com.aliyun.core.annotation.NameInMap("RouteEntryName")
        private String routeEntryName;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RouteEntry(Builder builder) {
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.instanceId = builder.instanceId;
            this.nextHopType = builder.nextHopType;
            this.nextHops = builder.nextHops;
            this.routeEntryId = builder.routeEntryId;
            this.routeEntryName = builder.routeEntryName;
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
            private String description; 
            private String destinationCidrBlock; 
            private String instanceId; 
            private String nextHopType; 
            private NextHops nextHops; 
            private String routeEntryId; 
            private String routeEntryName; 
            private String routeTableId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(RouteEntry model) {
                this.description = model.description;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.instanceId = model.instanceId;
                this.nextHopType = model.nextHopType;
                this.nextHops = model.nextHops;
                this.routeEntryId = model.routeEntryId;
                this.routeEntryName = model.routeEntryName;
                this.routeTableId = model.routeTableId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
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
             * RouteEntryId.
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            /**
             * RouteEntryName.
             */
            public Builder routeEntryName(String routeEntryName) {
                this.routeEntryName = routeEntryName;
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
    /**
     * 
     * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteTablesResponseBody</p>
     */
    public static class RouteEntrys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntry")
        private java.util.List<RouteEntry> routeEntry;

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
        public java.util.List<RouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

        public static final class Builder {
            private java.util.List<RouteEntry> routeEntry; 

            private Builder() {
            } 

            private Builder(RouteEntrys model) {
                this.routeEntry = model.routeEntry;
            } 

            /**
             * RouteEntry.
             */
            public Builder routeEntry(java.util.List<RouteEntry> routeEntry) {
                this.routeEntry = routeEntry;
                return this;
            }

            public RouteEntrys build() {
                return new RouteEntrys(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteTablesResponseBody</p>
     */
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private java.util.List<String> vSwitchId;

        private VSwitchIds(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchId; 

            private Builder() {
            } 

            private Builder(VSwitchIds model) {
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List<String> vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteTablesResponseBody</p>
     */
    public static class RouteTable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RouteEntrys")
        private RouteEntrys routeEntrys;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("RouteTableType")
        private String routeTableType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VRouterId")
        private String vRouterId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private VSwitchIds vSwitchIds;

        private RouteTable(Builder builder) {
            this.creationTime = builder.creationTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeEntrys = builder.routeEntrys;
            this.routeTableId = builder.routeTableId;
            this.routeTableType = builder.routeTableType;
            this.status = builder.status;
            this.vRouterId = builder.vRouterId;
            this.vSwitchIds = builder.vSwitchIds;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vRouterId
         */
        public String getVRouterId() {
            return this.vRouterId;
        }

        /**
         * @return vSwitchIds
         */
        public VSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String creationTime; 
            private String resourceGroupId; 
            private RouteEntrys routeEntrys; 
            private String routeTableId; 
            private String routeTableType; 
            private String status; 
            private String vRouterId; 
            private VSwitchIds vSwitchIds; 

            private Builder() {
            } 

            private Builder(RouteTable model) {
                this.creationTime = model.creationTime;
                this.resourceGroupId = model.resourceGroupId;
                this.routeEntrys = model.routeEntrys;
                this.routeTableId = model.routeTableId;
                this.routeTableType = model.routeTableType;
                this.status = model.status;
                this.vRouterId = model.vRouterId;
                this.vSwitchIds = model.vSwitchIds;
            } 

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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * VSwitchIds.
             */
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public RouteTable build() {
                return new RouteTable(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteTablesResponseBody</p>
     */
    public static class RouteTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteTable")
        private java.util.List<RouteTable> routeTable;

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
        public java.util.List<RouteTable> getRouteTable() {
            return this.routeTable;
        }

        public static final class Builder {
            private java.util.List<RouteTable> routeTable; 

            private Builder() {
            } 

            private Builder(RouteTables model) {
                this.routeTable = model.routeTable;
            } 

            /**
             * RouteTable.
             */
            public Builder routeTable(java.util.List<RouteTable> routeTable) {
                this.routeTable = routeTable;
                return this;
            }

            public RouteTables build() {
                return new RouteTables(this);
            } 

        } 

    }
}
