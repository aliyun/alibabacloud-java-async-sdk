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
 * {@link DescribeVpnRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnRouteEntriesResponseBody</p>
 */
public class DescribeVpnRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpnRouteCounts")
    private VpnRouteCounts vpnRouteCounts;

    @com.aliyun.core.annotation.NameInMap("VpnRouteEntries")
    private VpnRouteEntries vpnRouteEntries;

    private DescribeVpnRouteEntriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnRouteCounts = builder.vpnRouteCounts;
        this.vpnRouteEntries = builder.vpnRouteEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnRouteEntriesResponseBody create() {
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
     * @return vpnRouteCounts
     */
    public VpnRouteCounts getVpnRouteCounts() {
        return this.vpnRouteCounts;
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
        private VpnRouteCounts vpnRouteCounts; 
        private VpnRouteEntries vpnRouteEntries; 

        private Builder() {
        } 

        private Builder(DescribeVpnRouteEntriesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpnRouteCounts = model.vpnRouteCounts;
            this.vpnRouteEntries = model.vpnRouteEntries;
        } 

        /**
         * <p>The page number of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paging queries.</p>
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
         * <p>BF3995A6-FA4F-4C74-B90F-89ECF4BFF4D5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VpnRouteCounts.
         */
        public Builder vpnRouteCounts(VpnRouteCounts vpnRouteCounts) {
            this.vpnRouteCounts = vpnRouteCounts;
            return this;
        }

        /**
         * VpnRouteEntries.
         */
        public Builder vpnRouteEntries(VpnRouteEntries vpnRouteEntries) {
            this.vpnRouteEntries = vpnRouteEntries;
            return this;
        }

        public DescribeVpnRouteEntriesResponseBody build() {
            return new DescribeVpnRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpnRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnRouteEntriesResponseBody</p>
     */
    public static class VpnRouteCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteCount")
        private Integer routeCount;

        @com.aliyun.core.annotation.NameInMap("RouteEntryType")
        private String routeEntryType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private VpnRouteCount(Builder builder) {
            this.routeCount = builder.routeCount;
            this.routeEntryType = builder.routeEntryType;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnRouteCount create() {
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

            private Builder() {
            } 

            private Builder(VpnRouteCount model) {
                this.routeCount = model.routeCount;
                this.routeEntryType = model.routeEntryType;
                this.source = model.source;
            } 

            /**
             * RouteCount.
             */
            public Builder routeCount(Integer routeCount) {
                this.routeCount = routeCount;
                return this;
            }

            /**
             * RouteEntryType.
             */
            public Builder routeEntryType(String routeEntryType) {
                this.routeEntryType = routeEntryType;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public VpnRouteCount build() {
                return new VpnRouteCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnRouteEntriesResponseBody</p>
     */
    public static class VpnRouteCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpnRouteCount")
        private java.util.List<VpnRouteCount> vpnRouteCount;

        private VpnRouteCounts(Builder builder) {
            this.vpnRouteCount = builder.vpnRouteCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnRouteCounts create() {
            return builder().build();
        }

        /**
         * @return vpnRouteCount
         */
        public java.util.List<VpnRouteCount> getVpnRouteCount() {
            return this.vpnRouteCount;
        }

        public static final class Builder {
            private java.util.List<VpnRouteCount> vpnRouteCount; 

            private Builder() {
            } 

            private Builder(VpnRouteCounts model) {
                this.vpnRouteCount = model.vpnRouteCount;
            } 

            /**
             * VpnRouteCount.
             */
            public Builder vpnRouteCount(java.util.List<VpnRouteCount> vpnRouteCount) {
                this.vpnRouteCount = vpnRouteCount;
                return this;
            }

            public VpnRouteCounts build() {
                return new VpnRouteCounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnRouteEntriesResponseBody</p>
     */
    public static class VpnRouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPath")
        private String asPath;

        @com.aliyun.core.annotation.NameInMap("Community")
        private String community;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("NextHopTunnelId")
        private String nextHopTunnelId;

        @com.aliyun.core.annotation.NameInMap("RouteDest")
        private String routeDest;

        @com.aliyun.core.annotation.NameInMap("RouteEntryType")
        private String routeEntryType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("VpnInstanceId")
        private String vpnInstanceId;

        @com.aliyun.core.annotation.NameInMap("Weight")
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

            private Builder() {
            } 

            private Builder(VpnRouteEntry model) {
                this.asPath = model.asPath;
                this.community = model.community;
                this.createTime = model.createTime;
                this.nextHop = model.nextHop;
                this.nextHopTunnelId = model.nextHopTunnelId;
                this.routeDest = model.routeDest;
                this.routeEntryType = model.routeEntryType;
                this.source = model.source;
                this.state = model.state;
                this.vpnInstanceId = model.vpnInstanceId;
                this.weight = model.weight;
            } 

            /**
             * AsPath.
             */
            public Builder asPath(String asPath) {
                this.asPath = asPath;
                return this;
            }

            /**
             * Community.
             */
            public Builder community(String community) {
                this.community = community;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * NextHop.
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * NextHopTunnelId.
             */
            public Builder nextHopTunnelId(String nextHopTunnelId) {
                this.nextHopTunnelId = nextHopTunnelId;
                return this;
            }

            /**
             * RouteDest.
             */
            public Builder routeDest(String routeDest) {
                this.routeDest = routeDest;
                return this;
            }

            /**
             * RouteEntryType.
             */
            public Builder routeEntryType(String routeEntryType) {
                this.routeEntryType = routeEntryType;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * VpnInstanceId.
             */
            public Builder vpnInstanceId(String vpnInstanceId) {
                this.vpnInstanceId = vpnInstanceId;
                return this;
            }

            /**
             * Weight.
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
    /**
     * 
     * {@link DescribeVpnRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnRouteEntriesResponseBody</p>
     */
    public static class VpnRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpnRouteEntry")
        private java.util.List<VpnRouteEntry> vpnRouteEntry;

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
        public java.util.List<VpnRouteEntry> getVpnRouteEntry() {
            return this.vpnRouteEntry;
        }

        public static final class Builder {
            private java.util.List<VpnRouteEntry> vpnRouteEntry; 

            private Builder() {
            } 

            private Builder(VpnRouteEntries model) {
                this.vpnRouteEntry = model.vpnRouteEntry;
            } 

            /**
             * VpnRouteEntry.
             */
            public Builder vpnRouteEntry(java.util.List<VpnRouteEntry> vpnRouteEntry) {
                this.vpnRouteEntry = vpnRouteEntry;
                return this;
            }

            public VpnRouteEntries build() {
                return new VpnRouteEntries(this);
            } 

        } 

    }
}
