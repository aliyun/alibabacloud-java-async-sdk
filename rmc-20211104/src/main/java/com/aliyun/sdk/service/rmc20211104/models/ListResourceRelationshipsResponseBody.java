// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rmc20211104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceRelationshipsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceRelationshipsResponseBody</p>
 */
public class ListResourceRelationshipsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceRelationships")
    private java.util.List < ResourceRelationships> resourceRelationships;

    private ListResourceRelationshipsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceRelationships = builder.resourceRelationships;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceRelationshipsResponseBody create() {
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
     * @return resourceRelationships
     */
    public java.util.List < ResourceRelationships> getResourceRelationships() {
        return this.resourceRelationships;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceRelationships> resourceRelationships; 

        /**
         * The maximum number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to initiate the next request.
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
         * The information of the associated resources.
         */
        public Builder resourceRelationships(java.util.List < ResourceRelationships> resourceRelationships) {
            this.resourceRelationships = resourceRelationships;
            return this;
        }

        public ListResourceRelationshipsResponseBody build() {
            return new ListResourceRelationshipsResponseBody(this);
        } 

    } 

    public static class ResourceRelationships extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("SourceRegionId")
        private String sourceRegionId;

        @NameInMap("SourceResourceId")
        private String sourceResourceId;

        @NameInMap("SourceResourceType")
        private String sourceResourceType;

        @NameInMap("TargetRegionId")
        private String targetRegionId;

        @NameInMap("TargetResourceId")
        private String targetResourceId;

        @NameInMap("TargetResourceType")
        private String targetResourceType;

        private ResourceRelationships(Builder builder) {
            this.accountId = builder.accountId;
            this.sourceRegionId = builder.sourceRegionId;
            this.sourceResourceId = builder.sourceResourceId;
            this.sourceResourceType = builder.sourceResourceType;
            this.targetRegionId = builder.targetRegionId;
            this.targetResourceId = builder.targetResourceId;
            this.targetResourceType = builder.targetResourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceRelationships create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return sourceRegionId
         */
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        /**
         * @return sourceResourceId
         */
        public String getSourceResourceId() {
            return this.sourceResourceId;
        }

        /**
         * @return sourceResourceType
         */
        public String getSourceResourceType() {
            return this.sourceResourceType;
        }

        /**
         * @return targetRegionId
         */
        public String getTargetRegionId() {
            return this.targetRegionId;
        }

        /**
         * @return targetResourceId
         */
        public String getTargetResourceId() {
            return this.targetResourceId;
        }

        /**
         * @return targetResourceType
         */
        public String getTargetResourceType() {
            return this.targetResourceType;
        }

        public static final class Builder {
            private String accountId; 
            private String sourceRegionId; 
            private String sourceResourceId; 
            private String sourceResourceType; 
            private String targetRegionId; 
            private String targetResourceId; 
            private String targetResourceType; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The region ID of the specified resource.
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * The ID of the specified resource.
             */
            public Builder sourceResourceId(String sourceResourceId) {
                this.sourceResourceId = sourceResourceId;
                return this;
            }

            /**
             * The type of the specified resource.
             */
            public Builder sourceResourceType(String sourceResourceType) {
                this.sourceResourceType = sourceResourceType;
                return this;
            }

            /**
             * The region ID of the associated resource.
             */
            public Builder targetRegionId(String targetRegionId) {
                this.targetRegionId = targetRegionId;
                return this;
            }

            /**
             * The ID of the associated resource.
             */
            public Builder targetResourceId(String targetResourceId) {
                this.targetResourceId = targetResourceId;
                return this;
            }

            /**
             * The type of the associated resource.
             */
            public Builder targetResourceType(String targetResourceType) {
                this.targetResourceType = targetResourceType;
                return this;
            }

            public ResourceRelationships build() {
                return new ResourceRelationships(this);
            } 

        } 

    }
}
