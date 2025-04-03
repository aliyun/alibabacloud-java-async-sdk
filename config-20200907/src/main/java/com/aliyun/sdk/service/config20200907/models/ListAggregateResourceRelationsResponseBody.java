// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListAggregateResourceRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateResourceRelationsResponseBody</p>
 */
public class ListAggregateResourceRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceRelations")
    private ResourceRelations resourceRelations;

    private ListAggregateResourceRelationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceRelations = builder.resourceRelations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateResourceRelationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAggregateResourceRelationsResponseBody model) {
            this.requestId = model.requestId;
            this.resourceRelations = model.resourceRelations;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A25F9DE-4C8B-5AD3-A241-FFF5A259E5A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the relationship.</p>
         */
        public Builder resourceRelations(ResourceRelations resourceRelations) {
            this.resourceRelations = resourceRelations;
            return this;
        }

        public ListAggregateResourceRelationsResponseBody build() {
            return new ListAggregateResourceRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregateResourceRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateResourceRelationsResponseBody</p>
     */
    public static class ResourceRelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("SourceResourceId")
        private String sourceResourceId;

        @com.aliyun.core.annotation.NameInMap("SourceResourceRegionId")
        private String sourceResourceRegionId;

        @com.aliyun.core.annotation.NameInMap("SourceResourceType")
        private String sourceResourceType;

        @com.aliyun.core.annotation.NameInMap("TargetResourceId")
        private String targetResourceId;

        @com.aliyun.core.annotation.NameInMap("TargetResourceType")
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

            private Builder() {
            } 

            private Builder(ResourceRelationList model) {
                this.accountId = model.accountId;
                this.relationType = model.relationType;
                this.sourceResourceId = model.sourceResourceId;
                this.sourceResourceRegionId = model.sourceResourceRegionId;
                this.sourceResourceType = model.sourceResourceType;
                this.targetResourceId = model.targetResourceId;
                this.targetResourceType = model.targetResourceType;
            } 

            /**
             * <p>The Alibaba Cloud account ID of the resource owner.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The type of the relationship between the resource and the object.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>IsContained: The object is included as part of the resource.</li>
             * <li>IsAttachedTo: The object is added to the resource.</li>
             * <li>IsAssociatedIn: The object is associated with the resource.</li>
             * <li>Contains: The object contains the resource.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IsAttachedTo</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>The resource ID of the current resource.</p>
             * 
             * <strong>example:</strong>
             * <p>i-j6cajg9yrfoh4sas****</p>
             */
            public Builder sourceResourceId(String sourceResourceId) {
                this.sourceResourceId = sourceResourceId;
                return this;
            }

            /**
             * <p>The region ID of the current resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder sourceResourceRegionId(String sourceResourceRegionId) {
                this.sourceResourceRegionId = sourceResourceRegionId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Instance</p>
             */
            public Builder sourceResourceType(String sourceResourceType) {
                this.sourceResourceType = sourceResourceType;
                return this;
            }

            /**
             * <p>The resource ID of the resource that is associated with the object.</p>
             * 
             * <strong>example:</strong>
             * <p>d-j6c8k731qbrc7fxi****</p>
             */
            public Builder targetResourceId(String targetResourceId) {
                this.targetResourceId = targetResourceId;
                return this;
            }

            /**
             * <p>The type of the resource that is associated with the object.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Disk</p>
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
    /**
     * 
     * {@link ListAggregateResourceRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateResourceRelationsResponseBody</p>
     */
    public static class ResourceRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("ResourceRelationList")
        private java.util.List<ResourceRelationList> resourceRelationList;

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
        public java.util.List<ResourceRelationList> getResourceRelationList() {
            return this.resourceRelationList;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<ResourceRelationList> resourceRelationList; 

            private Builder() {
            } 

            private Builder(ResourceRelations model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.resourceRelationList = model.resourceRelationList;
            } 

            /**
             * <p>The maximum number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token that was used to initiate the next request.</p>
             * 
             * <strong>example:</strong>
             * <p>AcBjqMYSy0is7zSMGu16****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>An array that contains the relationships.</p>
             */
            public Builder resourceRelationList(java.util.List<ResourceRelationList> resourceRelationList) {
                this.resourceRelationList = resourceRelationList;
                return this;
            }

            public ResourceRelations build() {
                return new ResourceRelations(this);
            } 

        } 

    }
}
