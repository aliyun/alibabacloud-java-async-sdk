// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitRouteTableAggregationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouteTableAggregationResponseBody</p>
 */
public class DescribeTransitRouteTableAggregationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeTransitRouteTableAggregationResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouteTableAggregationResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < Data> data; 
        private String nextToken; 
        private String requestId; 
        private Integer total; 

        /**
         * The number of entries returned per page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * A list of aggregate routes.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeTransitRouteTableAggregationResponseBody build() {
            return new DescribeTransitRouteTableAggregationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RouteType")
        private String routeType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TrRouteTableId")
        private String trRouteTableId;

        @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationCidr")
        private String transitRouteTableAggregationCidr;

        private Data(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.routeType = builder.routeType;
            this.scope = builder.scope;
            this.status = builder.status;
            this.trRouteTableId = builder.trRouteTableId;
            this.transitRouteTableAggregationCidr = builder.transitRouteTableAggregationCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trRouteTableId
         */
        public String getTrRouteTableId() {
            return this.trRouteTableId;
        }

        /**
         * @return transitRouteTableAggregationCidr
         */
        public String getTransitRouteTableAggregationCidr() {
            return this.transitRouteTableAggregationCidr;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String routeType; 
            private String scope; 
            private String status; 
            private String trRouteTableId; 
            private String transitRouteTableAggregationCidr; 

            /**
             * The description of the aggregate route.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the aggregate route.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the aggregate route.
             * <p>
             * 
             * The valid value is **Static**, which indicates a static route. By default, aggregate routes advertised to a VPC are considered custom routes.
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * The scope of networks that you want to advertise the aggregate route.
             * <p>
             * 
             * The valid value is **VPC**, which indicates that the aggregate route is advertised to all virtual private clouds (VPCs) that are in associated forwarding correlation with the Enterprise Edition transit router and have route synchronization enabled.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The status of the advertisement of the aggregate route. Valid values:
             * <p>
             * 
             * *   **AllConfigured**: The aggregate route is advertised to all VPCs.
             * *   **Configuring**: The aggregate route is being advertised.
             * *   **ConfigFailed**: The aggregate route failed to be advertised.
             * *   **PartialConfigured**: Failed to advertise the aggregate route to some VPCs.
             * *   **Deleting**: The aggregate route is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the route table of the Enterprise Edition transit router.
             */
            public Builder trRouteTableId(String trRouteTableId) {
                this.trRouteTableId = trRouteTableId;
                return this;
            }

            /**
             * The destination CIDR block of the aggregate route.
             */
            public Builder transitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
                this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
