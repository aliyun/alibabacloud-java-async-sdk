// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitRouteTableAggregationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouteTableAggregationResponseBody</p>
 */
public class DescribeTransitRouteTableAggregationResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Total.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("RouteType")
        private String routeType;

        @NameInMap("Scop")
        private String scop;

        @NameInMap("Status")
        private String status;

        @NameInMap("TrRouteTableId")
        private String trRouteTableId;

        @NameInMap("TransitRouteTableAggregationCidr")
        private String transitRouteTableAggregationCidr;

        private Data(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.routeType = builder.routeType;
            this.scop = builder.scop;
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
         * @return scop
         */
        public String getScop() {
            return this.scop;
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
            private String scop; 
            private String status; 
            private String trRouteTableId; 
            private String transitRouteTableAggregationCidr; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RouteType.
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * Scop.
             */
            public Builder scop(String scop) {
                this.scop = scop;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TrRouteTableId.
             */
            public Builder trRouteTableId(String trRouteTableId) {
                this.trRouteTableId = trRouteTableId;
                return this;
            }

            /**
             * TransitRouteTableAggregationCidr.
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
