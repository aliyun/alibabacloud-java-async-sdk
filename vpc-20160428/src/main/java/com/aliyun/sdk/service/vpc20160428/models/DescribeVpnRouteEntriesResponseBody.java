// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnRouteEntriesResponseBody</p>
 */
public class DescribeVpnRouteEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnRouteEntries")
    private VpnRouteEntries vpnRouteEntries;

    private DescribeVpnRouteEntriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnRouteEntries = builder.vpnRouteEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnRouteEntriesResponseBody create() {
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
     * @return vpnRouteEntries
     */
    public VpnRouteEntries getVpnRouteEntries() {
        return this.vpnRouteEntries;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VpnRouteEntries vpnRouteEntries; 

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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of route entries.
         */
        public Builder vpnRouteEntries(VpnRouteEntries vpnRouteEntries) {
            this.vpnRouteEntries = vpnRouteEntries;
            return this;
        }

        public DescribeVpnRouteEntriesResponseBody build() {
            return new DescribeVpnRouteEntriesResponseBody(this);
        } 

    } 

    public static class VpnRouteEntry extends TeaModel {
        @NameInMap("AsPath")
        private String asPath;

        @NameInMap("Community")
        private String community;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("NextHop")
        private String nextHop;

        @NameInMap("NextHopTunnelId")
        private String nextHopTunnelId;

        @NameInMap("RouteDest")
        private String routeDest;

        @NameInMap("RouteEntryType")
        private String routeEntryType;

        @NameInMap("Source")
        private String source;

        @NameInMap("State")
        private String state;

        @NameInMap("VpnInstanceId")
        private String vpnInstanceId;

        @NameInMap("Weight")
        private Integer weight;

        private VpnRouteEntry(Builder builder) {
            this.asPath = builder.asPath;
            this.community = builder.community;
            this.createTime = builder.createTime;
            this.nextHop = builder.nextHop;
            this.nextHopTunnelId = builder.nextHopTunnelId;
            this.routeDest = builder.routeDest;
            this.routeEntryType = builder.routeEntryType;
            this.source = builder.source;
            this.state = builder.state;
            this.vpnInstanceId = builder.vpnInstanceId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnRouteEntry create() {
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
         * @return nextHopTunnelId
         */
        public String getNextHopTunnelId() {
            return this.nextHopTunnelId;
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
            private String asPath; 
            private String community; 
            private Long createTime; 
            private String nextHop; 
            private String nextHopTunnelId; 
            private String routeDest; 
            private String routeEntryType; 
            private String source; 
            private String state; 
            private String vpnInstanceId; 
            private Integer weight; 

            /**
             * The AS path of the route entry.
             */
            public Builder asPath(String asPath) {
                this.asPath = asPath;
                return this;
            }

            /**
             * The community attributes of the route entry.
             */
            public Builder community(String community) {
                this.community = community;
                return this;
            }

            /**
             * The timestamp when the route entry was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The next hop of the route entry.
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * The ID of the tunnel associated with the next hop. 
             * <p>
             * 
             * 
             * > This parameter is returned only if the VPN gateway supports the dual-tunnel mode.
             */
            public Builder nextHopTunnelId(String nextHopTunnelId) {
                this.nextHopTunnelId = nextHopTunnelId;
                return this;
            }

            /**
             * The destination CIDR block of the route entry.
             */
            public Builder routeDest(String routeDest) {
                this.routeDest = routeDest;
                return this;
            }

            /**
             * The type of the route entry. Valid values:
             * <p>
             * 
             * *   **Custom**: custom
             * *   **System**: system
             */
            public Builder routeEntryType(String routeEntryType) {
                this.routeEntryType = routeEntryType;
                return this;
            }

            /**
             * The source CIDR block of the route entry.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The status of the route entry. Valid values:
             * <p>
             * 
             * *   **published**: advertised
             * *   **normal**: not advertised
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The ID of the VPN gateway.
             */
            public Builder vpnInstanceId(String vpnInstanceId) {
                this.vpnInstanceId = vpnInstanceId;
                return this;
            }

            /**
             * The weight of the route entry. Valid values: **0** and **100**.
             * <p>
             * 
             * *   **0**: a low priority
             * *   **100**: a high priority
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VpnRouteEntry build() {
                return new VpnRouteEntry(this);
            } 

        } 

    }
    public static class VpnRouteEntries extends TeaModel {
        @NameInMap("VpnRouteEntry")
        private java.util.List < VpnRouteEntry> vpnRouteEntry;

        private VpnRouteEntries(Builder builder) {
            this.vpnRouteEntry = builder.vpnRouteEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnRouteEntries create() {
            return builder().build();
        }

        /**
         * @return vpnRouteEntry
         */
        public java.util.List < VpnRouteEntry> getVpnRouteEntry() {
            return this.vpnRouteEntry;
        }

        public static final class Builder {
            private java.util.List < VpnRouteEntry> vpnRouteEntry; 

            /**
             * VpnRouteEntry.
             */
            public Builder vpnRouteEntry(java.util.List < VpnRouteEntry> vpnRouteEntry) {
                this.vpnRouteEntry = vpnRouteEntry;
                return this;
            }

            public VpnRouteEntries build() {
                return new VpnRouteEntries(this);
            } 

        } 

    }
}
