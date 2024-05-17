// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterCidrAllocationResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterCidrAllocationResponseBody</p>
 */
public class ListTransitRouterCidrAllocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterCidrAllocations")
    private java.util.List < TransitRouterCidrAllocations> transitRouterCidrAllocations;

    private ListTransitRouterCidrAllocationResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterCidrAllocations = builder.transitRouterCidrAllocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterCidrAllocationResponseBody create() {
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
     * @return transitRouterCidrAllocations
     */
    public java.util.List < TransitRouterCidrAllocations> getTransitRouterCidrAllocations() {
        return this.transitRouterCidrAllocations;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterCidrAllocations> transitRouterCidrAllocations; 

        /**
         * The number of entries returned per page.
         * <p>
         * 
         * *   If no value is specified for **MaxResults**, query results are returned in one batch. The value of **MaxResults** indicates the total number of entries.
         * *   If a value is specified for **MaxResults**, query results are returned in batches. The value of **MaxResults** in the response indicates the number of entries in the current batch.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. Valid values:
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
         * The information about the CIDR blocks that have IP addresses allocated to network instances.
         */
        public Builder transitRouterCidrAllocations(java.util.List < TransitRouterCidrAllocations> transitRouterCidrAllocations) {
            this.transitRouterCidrAllocations = transitRouterCidrAllocations;
            return this;
        }

        public ListTransitRouterCidrAllocationResponseBody build() {
            return new ListTransitRouterCidrAllocationResponseBody(this);
        } 

    } 

    public static class TransitRouterCidrAllocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocatedCidrBlock")
        private String allocatedCidrBlock;

        @com.aliyun.core.annotation.NameInMap("AttachmentId")
        private String attachmentId;

        @com.aliyun.core.annotation.NameInMap("AttachmentName")
        private String attachmentName;

        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("TransitRouterCidrId")
        private String transitRouterCidrId;

        private TransitRouterCidrAllocations(Builder builder) {
            this.allocatedCidrBlock = builder.allocatedCidrBlock;
            this.attachmentId = builder.attachmentId;
            this.attachmentName = builder.attachmentName;
            this.cidr = builder.cidr;
            this.transitRouterCidrId = builder.transitRouterCidrId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterCidrAllocations create() {
            return builder().build();
        }

        /**
         * @return allocatedCidrBlock
         */
        public String getAllocatedCidrBlock() {
            return this.allocatedCidrBlock;
        }

        /**
         * @return attachmentId
         */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /**
         * @return attachmentName
         */
        public String getAttachmentName() {
            return this.attachmentName;
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return transitRouterCidrId
         */
        public String getTransitRouterCidrId() {
            return this.transitRouterCidrId;
        }

        public static final class Builder {
            private String allocatedCidrBlock; 
            private String attachmentId; 
            private String attachmentName; 
            private String cidr; 
            private String transitRouterCidrId; 

            /**
             * The CIDR blocks that have IP addresses allocated to network instances.
             */
            public Builder allocatedCidrBlock(String allocatedCidrBlock) {
                this.allocatedCidrBlock = allocatedCidrBlock;
                return this;
            }

            /**
             * The ID of the network instance connection.
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * The name of the network instance connection.
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * The CIDR block of the transit router.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * The ID of the CIDR block.
             */
            public Builder transitRouterCidrId(String transitRouterCidrId) {
                this.transitRouterCidrId = transitRouterCidrId;
                return this;
            }

            public TransitRouterCidrAllocations build() {
                return new TransitRouterCidrAllocations(this);
            } 

        } 

    }
}
