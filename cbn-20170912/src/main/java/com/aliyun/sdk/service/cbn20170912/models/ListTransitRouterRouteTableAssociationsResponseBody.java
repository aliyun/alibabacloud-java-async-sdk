// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteTableAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTableAssociationsResponseBody</p>
 */
public class ListTransitRouterRouteTableAssociationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouterAssociations")
    private java.util.List < TransitRouterAssociations> transitRouterAssociations;

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
    public java.util.List < TransitRouterAssociations> getTransitRouterAssociations() {
        return this.transitRouterAssociations;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterAssociations> transitRouterAssociations; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If **NextToken** was not returned, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of associated forwarding correlations.
         */
        public Builder transitRouterAssociations(java.util.List < TransitRouterAssociations> transitRouterAssociations) {
            this.transitRouterAssociations = transitRouterAssociations;
            return this;
        }

        public ListTransitRouterRouteTableAssociationsResponseBody build() {
            return new ListTransitRouterRouteTableAssociationsResponseBody(this);
        } 

    } 

    public static class TransitRouterAssociations extends TeaModel {
        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @NameInMap("TransitRouterRouteTableId")
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

            /**
             * The ID of the next hop.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of next hop. Valid values:
             * <p>
             * 
             * *   **VPC**: VPC
             * *   **VBR**: VBR
             * *   **TR**: transit router
             * *   **VPN** :VPN attachment
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The status of the associated forwarding correlation. Valid values:
             * <p>
             * 
             * *   **Active**: The associated forwarding correlation is available.
             * *   **Associating**: The associated forwarding correlation is being created.
             * *   **Dissociating**: The associated forwarding correlation is being deleted.
             * *   **Deleted**: The associated forwarding correlation is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the network instance connection.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * The ID of the route table of the Enterprise Edition transit router.
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
