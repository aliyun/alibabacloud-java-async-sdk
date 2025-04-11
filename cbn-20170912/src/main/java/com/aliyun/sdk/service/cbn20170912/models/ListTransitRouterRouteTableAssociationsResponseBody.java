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
 * {@link ListTransitRouterRouteTableAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTableAssociationsResponseBody</p>
 */
public class ListTransitRouterRouteTableAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterAssociations")
    private java.util.List<TransitRouterAssociations> transitRouterAssociations;

    private ListTransitRouterRouteTableAssociationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterAssociations = builder.transitRouterAssociations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteTableAssociationsResponseBody create() {
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
     * @return transitRouterAssociations
     */
    public java.util.List<TransitRouterAssociations> getTransitRouterAssociations() {
        return this.transitRouterAssociations;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TransitRouterAssociations> transitRouterAssociations; 

        private Builder() {
        } 

        private Builder(ListTransitRouterRouteTableAssociationsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.transitRouterAssociations = model.transitRouterAssociations;
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
         * <p>The token that determines the start point of the query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> was not returned, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>a415****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F6B1D9AB-176D-4399-801D-8BC576F4EB0D</p>
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
         * <p>A list of associated forwarding correlations.</p>
         */
        public Builder transitRouterAssociations(java.util.List<TransitRouterAssociations> transitRouterAssociations) {
            this.transitRouterAssociations = transitRouterAssociations;
            return this;
        }

        public ListTransitRouterRouteTableAssociationsResponseBody build() {
            return new ListTransitRouterRouteTableAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterRouteTableAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteTableAssociationsResponseBody</p>
     */
    public static class TransitRouterAssociations extends TeaModel {
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

        private TransitRouterAssociations(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterAssociations create() {
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

            private Builder(TransitRouterAssociations model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.transitRouterAttachmentId = model.transitRouterAttachmentId;
                this.transitRouterRouteTableId = model.transitRouterRouteTableId;
            } 

            /**
             * <p>The ID of the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1h8vbrbcgohcju5****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of next hop. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: VPC</li>
             * <li><strong>VBR</strong>: VBR</li>
             * <li><strong>TR</strong>: transit router</li>
             * <li><strong>VPN</strong> :VPN attachment</li>
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
             * <p>The status of the associated forwarding correlation. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: The associated forwarding correlation is available.</li>
             * <li><strong>Associating</strong>: The associated forwarding correlation is being created.</li>
             * <li><strong>Dissociating</strong>: The associated forwarding correlation is being deleted.</li>
             * <li><strong>Deleted</strong>: The associated forwarding correlation is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Associating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the network instance connection.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-nls9fzkfat8934****</p>
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

            public TransitRouterAssociations build() {
                return new TransitRouterAssociations(this);
            } 

        } 

    }
}
