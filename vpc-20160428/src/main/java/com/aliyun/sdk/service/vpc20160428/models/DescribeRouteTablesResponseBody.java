// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
         * Details about the route table.
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
             * Indicates whether the next hop feature is enabled.
             * <p>
             * 
             * *   **0**: The next hop feature is disabled.
             * *   **1**: The next hop feature is enabled.
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The ID of the next hop.
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * The type of the next hop.
             * <p>
             * 
             * *   **Instance**: The next hop is an Elastic Compute Service (ECS) instance.
             * *   **HaVip**: The next hop is a high-availability virtual IP address (HAVIP).
             * *   **VpnGateway**: The next hop is a VPN gateway.
             * *   **NatGateway**: The next hop is a NAT gateway.
             * *   **NetworkInterface**: The next hop is a secondary elastic network interface (ENI).
             * *   **RouterInterface**: The next hop is a router interface.
             * *   **IPv6Gateway**: The next hop is an IPv6 gateway.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * The route weight of the next hop.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("NextHops")
        private NextHops nextHops;

        @NameInMap("RouteEntryId")
        private String routeEntryId;

        @NameInMap("RouteEntryName")
        private String routeEntryName;

        @NameInMap("RouteTableId")
        private String routeTableId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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

            /**
             * The description of the router entry.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination CIDR block of the route entry.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The ID of the next hop.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the route.
             * <p>
             * 
             * *   **local**: a vSwitch route
             * *   **service**: a cloud service route
             * *   **classicLink**: a route added by the system after ClassicLink is enabled
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * The list of next hops of equal-cost multi-path routing (ECMP) routes.
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
             * The name of the route entry.
             */
            public Builder routeEntryName(String routeEntryName) {
                this.routeEntryName = routeEntryName;
                return this;
            }

            /**
             * The ID of the route table to which the route entry belongs.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * The state of the route entry.
             * <p>
             * 
             * *   **Pending**: The route entry is being configured.
             * *   **Available**: The route entry is available.
             * *   **Modifying**: The route entry is being modified.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the route entry.
             * <p>
             * 
             * *   **System** : a system route entry
             * *   **Custom**: a custom route entry
             * *   **BGP**: a BGP route entry
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
    public static class VSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        private java.util.List < String > vSwitchId;

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
        public java.util.List < String > getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List < String > vSwitchId; 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List < String > vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
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

        @NameInMap("Status")
        private String status;

        @NameInMap("VRouterId")
        private String vRouterId;

        @NameInMap("VSwitchIds")
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

            /**
             * The time when the route table was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the resource group to which the elastic IP address (EIP) belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Detailed information about the route entry.
             */
            public Builder routeEntrys(RouteEntrys routeEntrys) {
                this.routeEntrys = routeEntrys;
                return this;
            }

            /**
             * The ID of the route table to which the route entry belongs.
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
             * The state of the route table.
             * <p>
             * 
             * *   **Pending**: The route table is being configured.
             * *   **Available**: The route table is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the vRouter.
             */
            public Builder vRouterId(String vRouterId) {
                this.vRouterId = vRouterId;
                return this;
            }

            /**
             * The list of vSwitches that belong to the VPC.
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
