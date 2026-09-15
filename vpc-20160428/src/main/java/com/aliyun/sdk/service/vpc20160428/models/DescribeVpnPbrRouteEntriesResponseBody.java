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
         * <p>The number of entries per page in a paged query.</p>
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
         * VpnPbrRouteEntries.
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
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
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
             * RouteSource.
             */
            public Builder routeSource(String routeSource) {
                this.routeSource = routeSource;
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
