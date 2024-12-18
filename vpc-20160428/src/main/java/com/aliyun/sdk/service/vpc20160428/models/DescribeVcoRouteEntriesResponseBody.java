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
 * {@link DescribeVcoRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVcoRouteEntriesResponseBody</p>
 */
public class DescribeVcoRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VcoRouteEntries")
    private java.util.List<VcoRouteEntries> vcoRouteEntries;

    @com.aliyun.core.annotation.NameInMap("VpnRouteCounts")
    private java.util.List<VpnRouteCounts> vpnRouteCounts;

    private DescribeVcoRouteEntriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vcoRouteEntries = builder.vcoRouteEntries;
        this.vpnRouteCounts = builder.vpnRouteCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVcoRouteEntriesResponseBody create() {
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
     * @return vcoRouteEntries
     */
    public java.util.List<VcoRouteEntries> getVcoRouteEntries() {
        return this.vcoRouteEntries;
    }

    /**
     * @return vpnRouteCounts
     */
    public java.util.List<VpnRouteCounts> getVpnRouteCounts() {
        return this.vpnRouteCounts;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VcoRouteEntries> vcoRouteEntries; 
        private java.util.List<VpnRouteCounts> vpnRouteCounts; 

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E18980E8-C8C2-31BD-8156-AE2BBDEC87E1</p>
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
         * <p>The list of routes.</p>
         */
        public Builder vcoRouteEntries(java.util.List<VcoRouteEntries> vcoRouteEntries) {
            this.vcoRouteEntries = vcoRouteEntries;
            return this;
        }

        /**
         * VpnRouteCounts.
         */
        public Builder vpnRouteCounts(java.util.List<VpnRouteCounts> vpnRouteCounts) {
            this.vpnRouteCounts = vpnRouteCounts;
            return this;
        }

        public DescribeVcoRouteEntriesResponseBody build() {
            return new DescribeVcoRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVcoRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVcoRouteEntriesResponseBody</p>
     */
    public static class VcoRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPath")
        private String asPath;

        @com.aliyun.core.annotation.NameInMap("Community")
        private String community;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("NextHopTunnelIdList")
        private java.util.List<String> nextHopTunnelIdList;

        @com.aliyun.core.annotation.NameInMap("RouteDest")
        private String routeDest;

        @com.aliyun.core.annotation.NameInMap("RouteEntryType")
        private String routeEntryType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("VpnConnectionId")
        private String vpnConnectionId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private VcoRouteEntries(Builder builder) {
            this.asPath = builder.asPath;
            this.community = builder.community;
            this.createTime = builder.createTime;
            this.nextHop = builder.nextHop;
            this.nextHopTunnelIdList = builder.nextHopTunnelIdList;
            this.routeDest = builder.routeDest;
            this.routeEntryType = builder.routeEntryType;
            this.source = builder.source;
            this.state = builder.state;
            this.vpnConnectionId = builder.vpnConnectionId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoRouteEntries create() {
            return builder().build();
        }

        /**
         * @return asPath
         */
        public String getAsPath() {
            return this.asPath;
        }

        /**
         * @return community
         */
        public String getCommunity() {
            return this.community;
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
         * @return nextHopTunnelIdList
         */
        public java.util.List<String> getNextHopTunnelIdList() {
            return this.nextHopTunnelIdList;
        }

        /**
         * @return routeDest
         */
        public String getRouteDest() {
            return this.routeDest;
        }

        /**
         * @return routeEntryType
         */
        public String getRouteEntryType() {
            return this.routeEntryType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return vpnConnectionId
         */
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String asPath; 
            private String community; 
            private Long createTime; 
            private String nextHop; 
            private java.util.List<String> nextHopTunnelIdList; 
            private String routeDest; 
            private String routeEntryType; 
            private String source; 
            private String state; 
            private String vpnConnectionId; 
            private Integer weight; 

            /**
             * <p>The list of autonomous system (AS) numbers that the BGP route goes through.</p>
             * 
             * <strong>example:</strong>
             * <p>[12000]</p>
             */
            public Builder asPath(String asPath) {
                this.asPath = asPath;
                return this;
            }

            /**
             * <p>The community value carried by the BGP route.</p>
             * 
             * <strong>example:</strong>
             * <p>65535:65510</p>
             */
            public Builder community(String community) {
                this.community = community;
                return this;
            }

            /**
             * <p>The timestamp when the route was created.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1658217008000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The next hop of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>vco-p0w2jpkhi2eeop6q6****</p>
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * NextHopTunnelIdList.
             */
            public Builder nextHopTunnelIdList(java.util.List<String> nextHopTunnelIdList) {
                this.nextHopTunnelIdList = nextHopTunnelIdList;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.0/24</p>
             */
            public Builder routeDest(String routeDest) {
                this.routeDest = routeDest;
                return this;
            }

            /**
             * <p>The route type. Valid values:</p>
             * <ul>
             * <li><strong>custom</strong>: a destination-based route</li>
             * <li><strong>bgp</strong>: a BGP route</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder routeEntryType(String routeEntryType) {
                this.routeEntryType = routeEntryType;
                return this;
            }

            /**
             * <p>The source of the BGP route. Valid values:</p>
             * <ul>
             * <li><strong>CLOUD</strong>: indicates that the current BGP route is learned by the IPsec-VPN connection from the transit router.</li>
             * <li><strong>VPN_BGP</strong>: indicates that the current BGP route is learned by the IPsec-VPN connection from the data center.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the route.</p>
             * <ul>
             * <li><strong>published</strong>: indicates that the current route is advertised to the transit router.</li>
             * <li><strong>Active</strong>: indicates that the current BGP route is available.</li>
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
             * <p>The ID of the IPsec-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>vco-p0w2jpkhi2eeop6q6****</p>
             */
            public Builder vpnConnectionId(String vpnConnectionId) {
                this.vpnConnectionId = vpnConnectionId;
                return this;
            }

            /**
             * <p>The weight of the destination-based route. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: a low priority</li>
             * <li><strong>100</strong>: a high priority</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VcoRouteEntries build() {
                return new VcoRouteEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVcoRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVcoRouteEntriesResponseBody</p>
     */
    public static class VpnRouteCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteCount")
        private Integer routeCount;

        @com.aliyun.core.annotation.NameInMap("RouteEntryType")
        private String routeEntryType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private VpnRouteCounts(Builder builder) {
            this.routeCount = builder.routeCount;
            this.routeEntryType = builder.routeEntryType;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnRouteCounts create() {
            return builder().build();
        }

        /**
         * @return routeCount
         */
        public Integer getRouteCount() {
            return this.routeCount;
        }

        /**
         * @return routeEntryType
         */
        public String getRouteEntryType() {
            return this.routeEntryType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Integer routeCount; 
            private String routeEntryType; 
            private String source; 

            /**
             * RouteCount.
             */
            public Builder routeCount(Integer routeCount) {
                this.routeCount = routeCount;
                return this;
            }

            /**
             * <p>The route type. Valid values:</p>
             * <ul>
             * <li><strong>custom</strong>: a destination-based route</li>
             * <li><strong>bgp</strong>: a BGP route</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder routeEntryType(String routeEntryType) {
                this.routeEntryType = routeEntryType;
                return this;
            }

            /**
             * <p>The source of the BGP route. Valid values:</p>
             * <ul>
             * <li><strong>CLOUD</strong>: indicates that the current BGP route is learned by the IPsec-VPN connection from the transit router.</li>
             * <li><strong>VPN_BGP</strong>: indicates that the current BGP route is learned by the IPsec-VPN connection from the data center.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public VpnRouteCounts build() {
                return new VpnRouteCounts(this);
            } 

        } 

    }
}
