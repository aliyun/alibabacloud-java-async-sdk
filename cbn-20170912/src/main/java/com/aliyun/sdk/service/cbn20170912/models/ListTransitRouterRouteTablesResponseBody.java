// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTransitRouterRouteTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTablesResponseBody</p>
 */
public class ListTransitRouterRouteTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTables")
    private java.util.List < TransitRouterRouteTables> transitRouterRouteTables;

    private ListTransitRouterRouteTablesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterRouteTables = builder.transitRouterRouteTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return transitRouterRouteTables
     */
    public java.util.List < TransitRouterRouteTables> getTransitRouterRouteTables() {
        return this.transitRouterRouteTables;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterRouteTables> transitRouterRouteTables; 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * <li>If a value of <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dd20****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>82678F4A-C9F7-4CC1-8BF0-D619A63BFC57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        /**
         * <p>A list of route tables.</p>
         */
        public Builder transitRouterRouteTables(java.util.List < TransitRouterRouteTables> transitRouterRouteTables) {
            this.transitRouterRouteTables = transitRouterRouteTables;
            return this;
        }

        public ListTransitRouterRouteTablesResponseBody build() {
            return new ListTransitRouterRouteTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteTablesResponseBody</p>
     */
    public static class RouteTableOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MultiRegionECMP")
        private String multiRegionECMP;

        private RouteTableOptions(Builder builder) {
            this.multiRegionECMP = builder.multiRegionECMP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTableOptions create() {
            return builder().build();
        }

        /**
         * @return multiRegionECMP
         */
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

        public static final class Builder {
            private String multiRegionECMP; 

            /**
             * <p>Indicates whether ECMP routing is enabled. Valid values:</p>
             * <ul>
             * <li><strong>disable</strong> If ECMP routing is disabled, routes that are learned from different regions but have the same prefix and attributes select the transit router with the smallest region ID as the next hop. Region IDs are sorted in alphabetic order. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.</li>
             * <li><strong>enable</strong> If ECMP routing is enabled, routes that are learned from different regions but have the same prefix and attributes form an ECMP route. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disable</p>
             */
            public Builder multiRegionECMP(String multiRegionECMP) {
                this.multiRegionECMP = multiRegionECMP;
                return this;
            }

            public RouteTableOptions build() {
                return new RouteTableOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTransitRouterRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteTablesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTransitRouterRouteTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteTablesResponseBody</p>
     */
    public static class TransitRouterRouteTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteTableOptions")
        private RouteTableOptions routeTableOptions;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableDescription")
        private String transitRouterRouteTableDescription;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
        private String transitRouterRouteTableId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableName")
        private String transitRouterRouteTableName;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableStatus")
        private String transitRouterRouteTableStatus;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableType")
        private String transitRouterRouteTableType;

        private TransitRouterRouteTables(Builder builder) {
            this.createTime = builder.createTime;
            this.regionId = builder.regionId;
            this.routeTableOptions = builder.routeTableOptions;
            this.tags = builder.tags;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterRouteTableDescription = builder.transitRouterRouteTableDescription;
            this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
            this.transitRouterRouteTableName = builder.transitRouterRouteTableName;
            this.transitRouterRouteTableStatus = builder.transitRouterRouteTableStatus;
            this.transitRouterRouteTableType = builder.transitRouterRouteTableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterRouteTables create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeTableOptions
         */
        public RouteTableOptions getRouteTableOptions() {
            return this.routeTableOptions;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterRouteTableDescription
         */
        public String getTransitRouterRouteTableDescription() {
            return this.transitRouterRouteTableDescription;
        }

        /**
         * @return transitRouterRouteTableId
         */
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

        /**
         * @return transitRouterRouteTableName
         */
        public String getTransitRouterRouteTableName() {
            return this.transitRouterRouteTableName;
        }

        /**
         * @return transitRouterRouteTableStatus
         */
        public String getTransitRouterRouteTableStatus() {
            return this.transitRouterRouteTableStatus;
        }

        /**
         * @return transitRouterRouteTableType
         */
        public String getTransitRouterRouteTableType() {
            return this.transitRouterRouteTableType;
        }

        public static final class Builder {
            private String createTime; 
            private String regionId; 
            private RouteTableOptions routeTableOptions; 
            private java.util.List < Tags> tags; 
            private String transitRouterId; 
            private String transitRouterRouteTableDescription; 
            private String transitRouterRouteTableId; 
            private String transitRouterRouteTableName; 
            private String transitRouterRouteTableStatus; 
            private String transitRouterRouteTableType; 

            /**
             * <p>The time when the route table was created.</p>
             * <p>The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T09:39Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The region ID of the Enterprise Edition transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The features of the route table.</p>
             */
            public Builder routeTableOptions(RouteTableOptions routeTableOptions) {
                this.routeTableOptions = routeTableOptions;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The transit router ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-8vb8bie2koduo5awz****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The description of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>testdesc</p>
             */
            public Builder transitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
                this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp1dudbh2d5na6b50****</p>
             */
            public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
                this.transitRouterRouteTableId = transitRouterRouteTableId;
                return this;
            }

            /**
             * <p>The name of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder transitRouterRouteTableName(String transitRouterRouteTableName) {
                this.transitRouterRouteTableName = transitRouterRouteTableName;
                return this;
            }

            /**
             * <p>The status of the route table. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Deleting</strong></li>
             * <li><strong>Active</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder transitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
                this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
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
            public Builder transitRouterRouteTableType(String transitRouterRouteTableType) {
                this.transitRouterRouteTableType = transitRouterRouteTableType;
                return this;
            }

            public TransitRouterRouteTables build() {
                return new TransitRouterRouteTables(this);
            } 

        } 

    }
}
