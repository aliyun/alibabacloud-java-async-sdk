// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnPbrRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnPbrRouteEntriesResponseBody</p>
 */
public class DescribeVpnPbrRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpnPbrRouteEntries")
    private VpnPbrRouteEntries vpnPbrRouteEntries;

    private DescribeVpnPbrRouteEntriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnPbrRouteEntries = builder.vpnPbrRouteEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnPbrRouteEntriesResponseBody create() {
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
     * @return vpnPbrRouteEntries
     */
    public VpnPbrRouteEntries getVpnPbrRouteEntries() {
        return this.vpnPbrRouteEntries;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VpnPbrRouteEntries vpnPbrRouteEntries; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of policy-based routes.
         */
        public Builder vpnPbrRouteEntries(VpnPbrRouteEntries vpnPbrRouteEntries) {
            this.vpnPbrRouteEntries = vpnPbrRouteEntries;
            return this;
        }

        public DescribeVpnPbrRouteEntriesResponseBody build() {
            return new DescribeVpnPbrRouteEntriesResponseBody(this);
        } 

    } 

    public static class VpnPbrRouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("NextHopTunnelId")
        private String nextHopTunnelId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RouteDest")
        private String routeDest;

        @com.aliyun.core.annotation.NameInMap("RouteSource")
        private String routeSource;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("VpnInstanceId")
        private String vpnInstanceId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private VpnPbrRouteEntry(Builder builder) {
            this.createTime = builder.createTime;
            this.nextHop = builder.nextHop;
            this.nextHopTunnelId = builder.nextHopTunnelId;
            this.priority = builder.priority;
            this.routeDest = builder.routeDest;
            this.routeSource = builder.routeSource;
            this.state = builder.state;
            this.vpnInstanceId = builder.vpnInstanceId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnPbrRouteEntry create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return nextHop
         */
        public String getNextHop() {
            return this.nextHop;
        }

        /**
         * @return nextHopTunnelId
         */
        public String getNextHopTunnelId() {
            return this.nextHopTunnelId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return routeDest
         */
        public String getRouteDest() {
            return this.routeDest;
        }

        /**
         * @return routeSource
         */
        public String getRouteSource() {
            return this.routeSource;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return vpnInstanceId
         */
        public String getVpnInstanceId() {
            return this.vpnInstanceId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Long createTime; 
            private String nextHop; 
            private String nextHopTunnelId; 
            private Integer priority; 
            private String routeDest; 
            private String routeSource; 
            private String state; 
            private String vpnInstanceId; 
            private Integer weight; 

            /**
             * The time when the policy-based route was created. Unit: milliseconds.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The next hop of the policy-based route.
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * The ID of the tunnel associated with the next hop of the policy-based route.
             * <p>
             * 
             * This parameter is returned only if the VPN gateway supports the dual-tunnel mode.
             */
            public Builder nextHopTunnelId(String nextHopTunnelId) {
                this.nextHopTunnelId = nextHopTunnelId;
                return this;
            }

            /**
             * The priority of the policy-based route.
             * <p>
             * 
             * A smaller value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The destination CIDR block of the policy-based route.
             */
            public Builder routeDest(String routeDest) {
                this.routeDest = routeDest;
                return this;
            }

            /**
             * The source CIDR block of the policy-based route.
             */
            public Builder routeSource(String routeSource) {
                this.routeSource = routeSource;
                return this;
            }

            /**
             * The status of the policy-based route. Valid values:
             * <p>
             * 
             * *   **published**: advertised to the VPC route table.
             * *   **normal**: not advertised to the VPC route table.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The VPN gateway ID.
             */
            public Builder vpnInstanceId(String vpnInstanceId) {
                this.vpnInstanceId = vpnInstanceId;
                return this;
            }

            /**
             * The weight of the policy-based route. Valid values:
             * <p>
             * 
             * *   For a VPN gateway that supports the dual-tunnel mode, the default value is **100**.
             * 
             * *   For a VPN gateway that supports the single-tunnel mode, the weight specifies the priority of the policy-based route.
             * 
             *     *   **100**: a high priority If multiple policy-based routes with the same source CIDR block and destination CIDR block exist, the IPsec-VPN connection associated with the policy-based route is the active connection.
             *     *   **0**: a low priority If multiple policy-based routes with the same source CIDR block and destination CIDR block exist, the IPsec-VPN connection associated with the policy-based route is the standby connection.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VpnPbrRouteEntry build() {
                return new VpnPbrRouteEntry(this);
            } 

        } 

    }
    public static class VpnPbrRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpnPbrRouteEntry")
        private java.util.List < VpnPbrRouteEntry> vpnPbrRouteEntry;

        private VpnPbrRouteEntries(Builder builder) {
            this.vpnPbrRouteEntry = builder.vpnPbrRouteEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnPbrRouteEntries create() {
            return builder().build();
        }

        /**
         * @return vpnPbrRouteEntry
         */
        public java.util.List < VpnPbrRouteEntry> getVpnPbrRouteEntry() {
            return this.vpnPbrRouteEntry;
        }

        public static final class Builder {
            private java.util.List < VpnPbrRouteEntry> vpnPbrRouteEntry; 

            /**
             * VpnPbrRouteEntry.
             */
            public Builder vpnPbrRouteEntry(java.util.List < VpnPbrRouteEntry> vpnPbrRouteEntry) {
                this.vpnPbrRouteEntry = vpnPbrRouteEntry;
                return this;
            }

            public VpnPbrRouteEntries build() {
                return new VpnPbrRouteEntries(this);
            } 

        } 

    }
}
