// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeTransitRouteTableAggregationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouteTableAggregationResponseBody</p>
 */
public class DescribeTransitRouteTableAggregationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String nextToken; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeTransitRouteTableAggregationResponseBody model) {
            this.count = model.count;
            this.data = model.data;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The number of entries per page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of aggregate route information.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
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
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeTransitRouteTableAggregationResponseBody build() {
            return new DescribeTransitRouteTableAggregationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransitRouteTableAggregationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouteTableAggregationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RouteType")
        private String routeType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("ScopeList")
        private java.util.List<String> scopeList;

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
            this.scopeList = builder.scopeList;
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
         * @return scopeList
         */
        public java.util.List<String> getScopeList() {
            return this.scopeList;
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
            private java.util.List<String> scopeList; 
            private String status; 
            private String trRouteTableId; 
            private String transitRouteTableAggregationCidr; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.name = model.name;
                this.routeType = model.routeType;
                this.scope = model.scope;
                this.scopeList = model.scopeList;
                this.status = model.status;
                this.trRouteTableId = model.trRouteTableId;
                this.transitRouteTableAggregationCidr = model.transitRouteTableAggregationCidr;
            } 

            /**
             * <p>The description of the aggregate route.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the aggregate route.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The routing type of the aggregation route.</p>
             * <p>The value is <strong>Static</strong> only, which indicates a static route. After the aggregation route is propagated to a VPC-connected instance, it becomes a custom route entry by default.</p>
             * 
             * <strong>example:</strong>
             * <p>Static</p>
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * <p>The propagation scope of the aggregation route.</p>
             * <p>The value is <strong>VPC</strong> only, which indicates that the aggregation route is propagated to all VPC-connected instances that have established associated forwarding relationships with the current Enterprise Edition transit router route table and have the route synchronization feature enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The propagation scope list of the aggregate route.</p>
             * <blockquote>
             * <p>You must specify at least one of the propagation scope or the propagation scope list for the aggregate route. We recommend that you use the propagation scope list. Elements in the propagation scope list cannot duplicate the value of the propagation scope.</p>
             * </blockquote>
             */
            public Builder scopeList(java.util.List<String> scopeList) {
                this.scopeList = scopeList;
                return this;
            }

            /**
             * <p>The propagation status of the aggregation route.</p>
             * <ul>
             * <li><strong>AllConfigured</strong>: The aggregation routing has been propagated to all VPC-connected instances.</li>
             * <li><strong>Configuring</strong>: The aggregation routing is being propagated.</li>
             * <li><strong>ConfigFailed</strong>: The aggregation routing failed to be propagated.</li>
             * <li><strong>PartialConfigured</strong>: The aggregation routing failed to be propagated to some VPC-connected instances.</li>
             * <li><strong>Deleting</strong>: The aggregation routing is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AllConfigured</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the Enterprise Edition transit router route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-6ehgc262hr170qgyc****</p>
             */
            public Builder trRouteTableId(String trRouteTableId) {
                this.trRouteTableId = trRouteTableId;
                return this;
            }

            /**
             * <p>The destination CIDR block of the aggregate route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.0/24</p>
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
