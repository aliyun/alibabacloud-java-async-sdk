// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterEcrAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterEcrAttachmentsResponseBody</p>
 */
public class ListTransitRouterEcrAttachmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachments")
    private java.util.List < TransitRouterAttachments> transitRouterAttachments;

    private ListTransitRouterEcrAttachmentsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterAttachments = builder.transitRouterAttachments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterEcrAttachmentsResponseBody create() {
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
     * @return transitRouterAttachments
     */
    public java.util.List < TransitRouterAttachments> getTransitRouterAttachments() {
        return this.transitRouterAttachments;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterAttachments> transitRouterAttachments; 

        /**
         * The number of entries per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
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
         * The information about the ECR connections.
         */
        public Builder transitRouterAttachments(java.util.List < TransitRouterAttachments> transitRouterAttachments) {
            this.transitRouterAttachments = transitRouterAttachments;
            return this;
        }

        public ListTransitRouterEcrAttachmentsResponseBody build() {
            return new ListTransitRouterEcrAttachmentsResponseBody(this);
        } 

    } 

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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class TransitRouterAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPublishRouteEnabled")
        private Boolean autoPublishRouteEnabled;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EcrId")
        private String ecrId;

        @com.aliyun.core.annotation.NameInMap("EcrOwnerId")
        private Long ecrOwnerId;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentDescription")
        private String transitRouterAttachmentDescription;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentName")
        private String transitRouterAttachmentName;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRegionId")
        private String transitRouterRegionId;

        private TransitRouterAttachments(Builder builder) {
            this.autoPublishRouteEnabled = builder.autoPublishRouteEnabled;
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.ecrId = builder.ecrId;
            this.ecrOwnerId = builder.ecrOwnerId;
            this.orderType = builder.orderType;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.transitRouterAttachmentDescription = builder.transitRouterAttachmentDescription;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterAttachmentName = builder.transitRouterAttachmentName;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterRegionId = builder.transitRouterRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterAttachments create() {
            return builder().build();
        }

        /**
         * @return autoPublishRouteEnabled
         */
        public Boolean getAutoPublishRouteEnabled() {
            return this.autoPublishRouteEnabled;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ecrId
         */
        public String getEcrId() {
            return this.ecrId;
        }

        /**
         * @return ecrOwnerId
         */
        public Long getEcrOwnerId() {
            return this.ecrOwnerId;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return transitRouterAttachmentDescription
         */
        public String getTransitRouterAttachmentDescription() {
            return this.transitRouterAttachmentDescription;
        }

        /**
         * @return transitRouterAttachmentId
         */
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        /**
         * @return transitRouterAttachmentName
         */
        public String getTransitRouterAttachmentName() {
            return this.transitRouterAttachmentName;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterRegionId
         */
        public String getTransitRouterRegionId() {
            return this.transitRouterRegionId;
        }

        public static final class Builder {
            private Boolean autoPublishRouteEnabled; 
            private String cenId; 
            private String creationTime; 
            private String ecrId; 
            private Long ecrOwnerId; 
            private String orderType; 
            private String resourceType; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String transitRouterAttachmentDescription; 
            private String transitRouterAttachmentId; 
            private String transitRouterAttachmentName; 
            private String transitRouterId; 
            private String transitRouterRegionId; 

            /**
             * Indicates whether the Enterprise Edition transit router can automatically advertise routes to ECRs.
             * <p>
             * 
             * The value is **true**, which indicates that the Enterprise Edition transit router can automatically advertise routes to ECRs.
             */
            public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
                this.autoPublishRouteEnabled = autoPublishRouteEnabled;
                return this;
            }

            /**
             * The ID of the CEN instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The time when the ECR connection was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the ECR with which the ECR connection is associated.
             */
            public Builder ecrId(String ecrId) {
                this.ecrId = ecrId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the ECR connection belongs.
             */
            public Builder ecrOwnerId(Long ecrOwnerId) {
                this.ecrOwnerId = ecrOwnerId;
                return this;
            }

            /**
             * The entity that pays the fees of the network instance. Valid values: Valid values:
             * <p>
             * 
             * *   **PayByCenOwner**: The Alibaba Cloud account to which the transit router belongs pays the connection and data forwarding fees of the ECR.
             * *   **PayByResourceOwner**: The Alibaba Cloud account to which the ECR belongs pays the connection and data forwarding fees of the ECR.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The type of resource to which the transit router is connected. Valid values:
             * <p>
             * 
             * The value is **ECR**, which indicates ECR connections.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The status of the ECR connection. Valid values:
             * <p>
             * 
             * *   **Attached**
             * *   **Attaching**
             * *   **Detaching**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The description of the ECR connection.
             */
            public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
                this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
                return this;
            }

            /**
             * The ID of the ECR connection.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * The name of the ECR connection.
             */
            public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
                this.transitRouterAttachmentName = transitRouterAttachmentName;
                return this;
            }

            /**
             * The ID of the Enterprise Edition transit router.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * The region ID of the transit router.
             * <p>
             * 
             * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
             */
            public Builder transitRouterRegionId(String transitRouterRegionId) {
                this.transitRouterRegionId = transitRouterRegionId;
                return this;
            }

            public TransitRouterAttachments build() {
                return new TransitRouterAttachments(this);
            } 

        } 

    }
}
