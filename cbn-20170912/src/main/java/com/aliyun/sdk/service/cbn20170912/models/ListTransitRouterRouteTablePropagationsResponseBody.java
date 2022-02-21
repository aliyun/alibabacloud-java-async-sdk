// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteTablePropagationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTablePropagationsResponseBody</p>
 */
public class ListTransitRouterRouteTablePropagationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouterPropagations")
    private java.util.List < TransitRouterPropagations> transitRouterPropagations;

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
    public java.util.List < TransitRouterPropagations> getTransitRouterPropagations() {
        return this.transitRouterPropagations;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterPropagations> transitRouterPropagations; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TransitRouterPropagations.
         */
        public Builder transitRouterPropagations(java.util.List < TransitRouterPropagations> transitRouterPropagations) {
            this.transitRouterPropagations = transitRouterPropagations;
            return this;
        }

        public ListTransitRouterRouteTablePropagationsResponseBody build() {
            return new ListTransitRouterRouteTablePropagationsResponseBody(this);
        } 

    } 

    public static class TransitRouterPropagations extends TeaModel {
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

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
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
             * TransitRouterAttachmentId.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * TransitRouterRouteTableId.
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
