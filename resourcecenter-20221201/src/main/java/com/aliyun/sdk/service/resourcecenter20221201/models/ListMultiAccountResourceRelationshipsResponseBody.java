// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link ListMultiAccountResourceRelationshipsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiAccountResourceRelationshipsResponseBody</p>
 */
public class ListMultiAccountResourceRelationshipsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceRelationships")
    private java.util.List<ResourceRelationships> resourceRelationships;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private ListMultiAccountResourceRelationshipsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceRelationships = builder.resourceRelationships;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountResourceRelationshipsResponseBody create() {
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
     * @return resourceRelationships
     */
    public java.util.List<ResourceRelationships> getResourceRelationships() {
        return this.resourceRelationships;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ResourceRelationships> resourceRelationships; 
        private String scope; 

        private Builder() {
        } 

        private Builder(ListMultiAccountResourceRelationshipsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resourceRelationships = model.resourceRelationships;
            this.scope = model.scope;
        } 

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
         * ResourceRelationships.
         */
        public Builder resourceRelationships(java.util.List<ResourceRelationships> resourceRelationships) {
            this.resourceRelationships = resourceRelationships;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public ListMultiAccountResourceRelationshipsResponseBody build() {
            return new ListMultiAccountResourceRelationshipsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMultiAccountResourceRelationshipsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiAccountResourceRelationshipsResponseBody</p>
     */
    public static class ResourceRelationships extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceId")
        private String relatedResourceId;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceRegionId")
        private String relatedResourceRegionId;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceType")
        private String relatedResourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceRelationships(Builder builder) {
            this.accountId = builder.accountId;
            this.regionId = builder.regionId;
            this.relatedResourceId = builder.relatedResourceId;
            this.relatedResourceRegionId = builder.relatedResourceRegionId;
            this.relatedResourceType = builder.relatedResourceType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relatedResourceId
         */
        public String getRelatedResourceId() {
            return this.relatedResourceId;
        }

        /**
         * @return relatedResourceRegionId
         */
        public String getRelatedResourceRegionId() {
            return this.relatedResourceRegionId;
        }

        /**
         * @return relatedResourceType
         */
        public String getRelatedResourceType() {
            return this.relatedResourceType;
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

        public static final class Builder {
            private String accountId; 
            private String regionId; 
            private String relatedResourceId; 
            private String relatedResourceRegionId; 
            private String relatedResourceType; 
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceRelationships model) {
                this.accountId = model.accountId;
                this.regionId = model.regionId;
                this.relatedResourceId = model.relatedResourceId;
                this.relatedResourceRegionId = model.relatedResourceRegionId;
                this.relatedResourceType = model.relatedResourceType;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RelatedResourceId.
             */
            public Builder relatedResourceId(String relatedResourceId) {
                this.relatedResourceId = relatedResourceId;
                return this;
            }

            /**
             * RelatedResourceRegionId.
             */
            public Builder relatedResourceRegionId(String relatedResourceRegionId) {
                this.relatedResourceRegionId = relatedResourceRegionId;
                return this;
            }

            /**
             * RelatedResourceType.
             */
            public Builder relatedResourceType(String relatedResourceType) {
                this.relatedResourceType = relatedResourceType;
                return this;
            }

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

            public ResourceRelationships build() {
                return new ResourceRelationships(this);
            } 

        } 

    }
}
