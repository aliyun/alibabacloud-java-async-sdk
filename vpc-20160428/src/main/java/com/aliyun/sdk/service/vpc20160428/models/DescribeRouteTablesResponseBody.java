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
         * <p>The detailed information about the route tables.</p>
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

            /**
             * <p>Indicates whether the route is available. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unavailable</li>
             * <li><strong>1</strong>: available</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-2zeo3xzyf38r4urzdpvqw</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The type of the next hop. Valid values:</p>
             * <ul>
             * <li><strong>Instance</strong>: an ECS instance</li>
             * <li><strong>HaVip</strong>: an HAVIP</li>
             * <li><strong>VpnGateway</strong>: a VPN gateway</li>
             * <li><strong>NatGateway</strong>: a NAT gateway</li>
             * <li><strong>NetworkInterface</strong>: a secondary ENI</li>
             * <li><strong>RouterInterface</strong>: a router interface</li>
             * <li><strong>IPv6Gateway</strong>: an IPv6 gateway</li>
             * <li><strong>Attachment</strong>: a transit router</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HaVip</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The weight of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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

            /**
             * <p>The description of the route. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>RouteEntryDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route. The destination CIDR block supports IPv4 and IPv6. Make sure that the destination CIDR block meets the following requirements:</p>
             * <ul>
             * <li>The destination CIDR block is not 100.64.0.0/10 or a subset of 100.64.0.0/10.</li>
             * <li>The destination CIDR block of each route in the route table is unique.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the instance associated with the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-2zeo3xzyf38r4urzd****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the next hop. Valid values:</p>
             * <ul>
             * <li><strong>Instance</strong> (default): an Elastic Compute Service (ECS) instance</li>
             * <li><strong>HaVip</strong>: a high-availability virtual IP address (HAVIP).</li>
             * <li><strong>VpnGateway</strong>: a VPN gateway</li>
             * <li><strong>NatGateway</strong>: a NAT gateway</li>
             * <li><strong>NetworkInterface</strong>: a secondary elastic network interface (ENI)</li>
             * <li><strong>RouterInterface</strong>: a router interface</li>
             * <li><strong>IPv6Gateway</strong>: an IPv6 gateway</li>
             * <li><strong>Attachment</strong>: a transit router</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>local</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The information about the next hop.</p>
             */
            public Builder nextHops(NextHops nextHops) {
                this.nextHops = nextHops;
                return this;
            }

            /**
             * <p>The ID of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>rte-bp1mnnr2al0naomnpxxx</p>
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            /**
             * <p>The route name.</p>
             * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder routeEntryName(String routeEntryName) {
                this.routeEntryName = routeEntryName;
                return this;
            }

            /**
             * <p>The route table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp145q7glnuzdvzu2****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The route status. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Modifying</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The route type. Valid values:</p>
             * <ul>
             * <li><strong>Custom</strong></li>
             * <li><strong>System</strong></li>
             * <li><strong>BGP</strong></li>
             * <li><strong>CEN</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
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

            /**
             * <p>The time when the route table was created.</p>
             * <p>The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-08-22T10:40:25Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the route table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The information about the route.</p>
             */
            public Builder routeEntrys(RouteEntrys routeEntrys) {
                this.routeEntrys = routeEntrys;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp145q7glnuzdvzu2****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The type of the route table. Valid values:</p>
             * <ul>
             * <li><strong>Custom</strong></li>
             * <li><strong>System</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder routeTableType(String routeTableType) {
                this.routeTableType = routeTableType;
                return this;
            }

            /**
             * <p>The status of the route table. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Available</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vRouter ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-bp1lhl0taikrteen8****</p>
             */
            public Builder vRouterId(String vRouterId) {
                this.vRouterId = vRouterId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
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
