// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceRelationsResponseBody</p>
 */
public class ListResourceRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceRelations")
    private ResourceRelations resourceRelations;

    private ListResourceRelationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceRelations = builder.resourceRelations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceRelationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceRelations
     */
    public ResourceRelations getResourceRelations() {
        return this.resourceRelations;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceRelations resourceRelations; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of the relationship.
         */
        public Builder resourceRelations(ResourceRelations resourceRelations) {
            this.resourceRelations = resourceRelations;
            return this;
        }

        public ListResourceRelationsResponseBody build() {
            return new ListResourceRelationsResponseBody(this);
        } 

    } 

    public static class ResourceRelationList extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("RelationType")
        private String relationType;

        @NameInMap("SourceResourceId")
        private String sourceResourceId;

        @NameInMap("SourceResourceRegionId")
        private String sourceResourceRegionId;

        @NameInMap("SourceResourceType")
        private String sourceResourceType;

        @NameInMap("TargetResourceId")
        private String targetResourceId;

        @NameInMap("TargetResourceType")
        private String targetResourceType;

        private ResourceRelationList(Builder builder) {
            this.accountId = builder.accountId;
            this.relationType = builder.relationType;
            this.sourceResourceId = builder.sourceResourceId;
            this.sourceResourceRegionId = builder.sourceResourceRegionId;
            this.sourceResourceType = builder.sourceResourceType;
            this.targetResourceId = builder.targetResourceId;
            this.targetResourceType = builder.targetResourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceRelationList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return sourceResourceId
         */
        public String getSourceResourceId() {
            return this.sourceResourceId;
        }

        /**
         * @return sourceResourceRegionId
         */
        public String getSourceResourceRegionId() {
            return this.sourceResourceRegionId;
        }

        /**
         * @return sourceResourceType
         */
        public String getSourceResourceType() {
            return this.sourceResourceType;
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
            private Long accountId; 
            private String relationType; 
            private String sourceResourceId; 
            private String sourceResourceRegionId; 
            private String sourceResourceType; 
            private String targetResourceId; 
            private String targetResourceType; 

            /**
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The type of the relationship between the resource and the object.
             * <p>
             * 
             * Valid values:
             * 
             * *   IsContained: The object is included as part of the resource.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   IsAttachedTo: The object is added to the resource.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   IsAssociatedIn: The object is associated with the resource.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Contains: The object contains the resource.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder sourceResourceId(String sourceResourceId) {
                this.sourceResourceId = sourceResourceId;
                return this;
            }

            /**
             * The ID of the region to which the current resource belongs.
             */
            public Builder sourceResourceRegionId(String sourceResourceRegionId) {
                this.sourceResourceRegionId = sourceResourceRegionId;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder sourceResourceType(String sourceResourceType) {
                this.sourceResourceType = sourceResourceType;
                return this;
            }

            /**
             * The ID of the resource that is associated with the object.
             */
            public Builder targetResourceId(String targetResourceId) {
                this.targetResourceId = targetResourceId;
                return this;
            }

            /**
             * The type of the resource that is associated with the object.
             */
            public Builder targetResourceType(String targetResourceType) {
                this.targetResourceType = targetResourceType;
                return this;
            }

            public ResourceRelationList build() {
                return new ResourceRelationList(this);
            } 

        } 

    }
    public static class ResourceRelations extends TeaModel {
        @NameInMap("MaxResults")
        @Validation(maximum = 100, minimum = 10)
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("ResourceRelationList")
        private java.util.List < ResourceRelationList> resourceRelationList;

        private ResourceRelations(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.resourceRelationList = builder.resourceRelationList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceRelations create() {
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
         * @return resourceRelationList
         */
        public java.util.List < ResourceRelationList> getResourceRelationList() {
            return this.resourceRelationList;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List < ResourceRelationList> resourceRelationList; 

            /**
             * The maximum number of entries returned on each page.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The token that was used to initiate the next request.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The type of the relationship between the resource and the object.
             * <p>
             * 
             * Valid values:
             * 
             * *   IsContained: The object is included as part of the resource.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   IsAttachedTo: The object is added to the resource.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   IsAssociatedIn: The object is associated with the resource.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Contains: The actual value contains the expected value.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder resourceRelationList(java.util.List < ResourceRelationList> resourceRelationList) {
                this.resourceRelationList = resourceRelationList;
                return this;
            }

            public ResourceRelations build() {
                return new ResourceRelations(this);
            } 

        } 

    }
}
