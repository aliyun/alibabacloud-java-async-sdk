// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterMulticastDomainAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterMulticastDomainAssociationsResponseBody</p>
 */
public class ListTransitRouterMulticastDomainAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastAssociations")
    private java.util.List < TransitRouterMulticastAssociations> transitRouterMulticastAssociations;

    private ListTransitRouterMulticastDomainAssociationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterMulticastAssociations = builder.transitRouterMulticastAssociations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterMulticastDomainAssociationsResponseBody create() {
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
     * @return transitRouterMulticastAssociations
     */
    public java.util.List < TransitRouterMulticastAssociations> getTransitRouterMulticastAssociations() {
        return this.transitRouterMulticastAssociations;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterMulticastAssociations> transitRouterMulticastAssociations; 

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, it indicates that no subsequent query is to be sent.
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
         * The information about the resource associated with the multicast domain.
         */
        public Builder transitRouterMulticastAssociations(java.util.List < TransitRouterMulticastAssociations> transitRouterMulticastAssociations) {
            this.transitRouterMulticastAssociations = transitRouterMulticastAssociations;
            return this;
        }

        public ListTransitRouterMulticastDomainAssociationsResponseBody build() {
            return new ListTransitRouterMulticastDomainAssociationsResponseBody(this);
        } 

    } 

    public static class TransitRouterMulticastAssociations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainId")
        private String transitRouterMulticastDomainId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private TransitRouterMulticastAssociations(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterMulticastAssociations create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceOwnerId
         */
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
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
         * @return transitRouterMulticastDomainId
         */
        public String getTransitRouterMulticastDomainId() {
            return this.transitRouterMulticastDomainId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String resourceId; 
            private Long resourceOwnerId; 
            private String resourceType; 
            private String status; 
            private String transitRouterAttachmentId; 
            private String transitRouterMulticastDomainId; 
            private String vSwitchId; 

            /**
             * The ID of the resource associated with the multicast domain.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the resource associated with the multicast domain belongs.
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * The type of resource associated with the multicast domain.
             * <p>
             * 
             * Valid value: **VPC**.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The association status. Valid values:
             * <p>
             * 
             * *   **Associated**: The resource is associated with the multicast domain.
             * *   **Associating**: The resource is being associated with the multicast domain.
             * *   **Dissociating**: The resource is being disassociated from the multicast domain.
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
             * The ID of the multicast domain.
             */
            public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
                this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public TransitRouterMulticastAssociations build() {
                return new TransitRouterMulticastAssociations(this);
            } 

        } 

    }
}
