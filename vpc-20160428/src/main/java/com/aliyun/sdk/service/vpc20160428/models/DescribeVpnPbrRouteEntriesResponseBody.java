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

        private Builder() {
        } 

        private Builder(DescribeVpnPbrRouteEntriesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpnPbrRouteEntries = model.vpnPbrRouteEntries;
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
         * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of policy-based routes.</p>
         */
        public Builder vpnPbrRouteEntries(VpnPbrRouteEntries vpnPbrRouteEntries) {
            this.vpnPbrRouteEntries = vpnPbrRouteEntries;
            return this;
        }

        public DescribeVpnPbrRouteEntriesResponseBody build() {
            return new DescribeVpnPbrRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpnPbrRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnPbrRouteEntriesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VpnPbrRouteEntry model) {
                this.createTime = model.createTime;
                this.nextHop = model.nextHop;
                this.nextHopTunnelId = model.nextHopTunnelId;
                this.priority = model.priority;
                this.routeDest = model.routeDest;
                this.routeSource = model.routeSource;
                this.state = model.state;
                this.vpnInstanceId = model.vpnInstanceId;
                this.weight = model.weight;
            } 

            /**
             * <p>The time when the policy-based route was created. Unit: millisecond.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1492747187000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The next hop of the policy-based route.</p>
             * 
             * <strong>example:</strong>
             * <p>vco-bp15oes1py4i66rmd****</p>
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * <p>The ID of the tunnel associated with the next hop of the policy-based route.</p>
             * <p>This parameter is returned only if the VPN gateway supports IPsec-VPN connections in dual-tunnel mode.</p>
             * 
             * <strong>example:</strong>
             * <p>tun-opsqc4d97wni2****</p>
             */
            public Builder nextHopTunnelId(String nextHopTunnelId) {
                this.nextHopTunnelId = nextHopTunnelId;
                return this;
            }

            /**
             * <p>The priority of the policy-based route.</p>
             * <p>A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The destination CIDR block of the policy-based route.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder routeDest(String routeDest) {
                this.routeDest = routeDest;
                return this;
            }

            /**
             * <p>The source CIDR block of the policy-based route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/24</p>
             */
            public Builder routeSource(String routeSource) {
                this.routeSource = routeSource;
                return this;
            }

            /**
             * <p>The status of the policy-based route. Valid values:</p>
             * <ul>
             * <li><strong>published</strong>: advertised to the VPC route table.</li>
             * <li><strong>normal</strong>: not advertised to the VPC route table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>published</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The ID of the VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>vpn-bp1a3kqjiiq9legfx****</p>
             */
            public Builder vpnInstanceId(String vpnInstanceId) {
                this.vpnInstanceId = vpnInstanceId;
                return this;
            }

            /**
             * <p>The weight of the policy-based route.</p>
             * <p>For a VPN gateway that supports IPsec-VPN connections in single-tunnel mode, the weight of a policy-based route indicates the priority of the route.</p>
             * <ul>
             * <li><strong>100</strong>: a high priority If multiple policy-based routes with the same source CIDR block and destination CIDR block exist, the IPsec-VPN connection associated with the policy-based route is the active connection.</li>
             * <li><strong>0</strong>: a low priority If multiple policy-based routes with the same source CIDR block and destination CIDR block exist, the IPsec-VPN connection associated with the policy-based route is the standby connection.</li>
             * </ul>
             * <blockquote>
             * <p> For a VPN gateway that does not support IPsec-VPN connections in single-tunnel mode, this parameter does not take effect.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeVpnPbrRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnPbrRouteEntriesResponseBody</p>
     */
    public static class VpnPbrRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpnPbrRouteEntry")
        private java.util.List<VpnPbrRouteEntry> vpnPbrRouteEntry;

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
        public java.util.List<VpnPbrRouteEntry> getVpnPbrRouteEntry() {
            return this.vpnPbrRouteEntry;
        }

        public static final class Builder {
            private java.util.List<VpnPbrRouteEntry> vpnPbrRouteEntry; 

            private Builder() {
            } 

            private Builder(VpnPbrRouteEntries model) {
                this.vpnPbrRouteEntry = model.vpnPbrRouteEntry;
            } 

            /**
             * VpnPbrRouteEntry.
             */
            public Builder vpnPbrRouteEntry(java.util.List<VpnPbrRouteEntry> vpnPbrRouteEntry) {
                this.vpnPbrRouteEntry = vpnPbrRouteEntry;
                return this;
            }

            public VpnPbrRouteEntries build() {
                return new VpnPbrRouteEntries(this);
            } 

        } 

    }
}
