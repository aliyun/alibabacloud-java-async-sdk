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
 * {@link ListTransitRouterRouteTablePropagationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTablePropagationsResponseBody</p>
 */
public class ListTransitRouterRouteTablePropagationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterPropagations")
    private java.util.List<TransitRouterPropagations> transitRouterPropagations;

    private ListTransitRouterRouteTablePropagationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterPropagations = builder.transitRouterPropagations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteTablePropagationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return transitRouterPropagations
     */
    public java.util.List<TransitRouterPropagations> getTransitRouterPropagations() {
        return this.transitRouterPropagations;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TransitRouterPropagations> transitRouterPropagations; 

        private Builder() {
        } 

        private Builder(ListTransitRouterRouteTablePropagationsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.transitRouterPropagations = model.transitRouterPropagations;
        } 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query.</p>
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
         * <p>04C81E0D-945E-4D61-A561-3DEA322F243B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>A list of route learning correlations.</p>
         */
        public Builder transitRouterPropagations(java.util.List<TransitRouterPropagations> transitRouterPropagations) {
            this.transitRouterPropagations = transitRouterPropagations;
            return this;
        }

        public ListTransitRouterRouteTablePropagationsResponseBody build() {
            return new ListTransitRouterRouteTablePropagationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterRouteTablePropagationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteTablePropagationsResponseBody</p>
     */
    public static class TransitRouterPropagations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
        private String transitRouterRouteTableId;

        private TransitRouterPropagations(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterPropagations create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transitRouterAttachmentId
         */
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        /**
         * @return transitRouterRouteTableId
         */
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 
            private String status; 
            private String transitRouterAttachmentId; 
            private String transitRouterRouteTableId; 

            private Builder() {
            } 

            private Builder(TransitRouterPropagations model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.transitRouterAttachmentId = model.transitRouterAttachmentId;
                this.transitRouterRouteTableId = model.transitRouterRouteTableId;
            } 

            /**
             * <p>The ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1h8vbrbcgohcju5****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the network instance. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: VPC</li>
             * <li><strong>VBR</strong>: VBR</li>
             * <li><strong>TR</strong>: transit router</li>
             * <li><strong>VPN</strong>: VPN connection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The status of the route learning correlation. Valid values:</p>
             * <ul>
             * <li><strong>Enabling</strong>: being enabled</li>
             * <li><strong>Disabling</strong>: being disabled</li>
             * <li><strong>Active</strong>: available</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the network instance connection.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-vx6iwhjr1x1j78****</p>
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * <p>The ID of the route table of the Enterprise Edition transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp1dudbh2d5na6b50****</p>
             */
            public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
                this.transitRouterRouteTableId = transitRouterRouteTableId;
                return this;
            }

            public TransitRouterPropagations build() {
                return new TransitRouterPropagations(this);
            } 

        } 

    }
}
