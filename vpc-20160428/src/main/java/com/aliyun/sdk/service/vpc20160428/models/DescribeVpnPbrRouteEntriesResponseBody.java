// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnPbrRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnPbrRouteEntriesResponseBody</p>
 */
public class DescribeVpnPbrRouteEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnPbrRouteEntries")
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
         * TotalCount.
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

    public static class VpnPbrRouteEntry extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("NextHop")
        private String nextHop;

        @NameInMap("RouteDest")
        private String routeDest;

        @NameInMap("RouteSource")
        private String routeSource;

        @NameInMap("State")
        private String state;

        @NameInMap("VpnInstanceId")
        private String vpnInstanceId;

        @NameInMap("Weight")
        private Integer weight;

        private VpnPbrRouteEntry(Builder builder) {
            this.createTime = builder.createTime;
            this.nextHop = builder.nextHop;
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
            private String routeDest; 
            private String routeSource; 
            private String state; 
            private String vpnInstanceId; 
            private Integer weight; 

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
    public static class VpnPbrRouteEntries extends TeaModel {
        @NameInMap("VpnPbrRouteEntry")
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
