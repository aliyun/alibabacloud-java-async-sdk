// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateResourceRelationsRequest} extends {@link RequestModel}
 *
 * <p>ListAggregateResourceRelationsRequest</p>
 */
public class ListAggregateResourceRelationsRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("RelationType")
    private String relationType;

    @Query
    @NameInMap("ResourceAccountId")
    @Validation(required = true)
    private Long resourceAccountId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("TargetResourceId")
    private String targetResourceId;

    @Query
    @NameInMap("TargetResourceType")
    private String targetResourceType;

    private ListAggregateResourceRelationsRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.region = builder.region;
        this.relationType = builder.relationType;
        this.resourceAccountId = builder.resourceAccountId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.targetResourceId = builder.targetResourceId;
        this.targetResourceType = builder.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateResourceRelationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
    }

    /**
     * @return resourceAccountId
     */
    public Long getResourceAccountId() {
        return this.resourceAccountId;
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

    public static final class Builder extends Request.Builder<ListAggregateResourceRelationsRequest, Builder> {
        private String aggregatorId; 
        private Integer maxResults; 
        private String nextToken; 
        private String region; 
        private String relationType; 
        private Long resourceAccountId; 
        private String resourceId; 
        private String resourceType; 
        private String targetResourceId; 
        private String targetResourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListAggregateResourceRelationsRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.region = request.region;
            this.relationType = request.relationType;
            this.resourceAccountId = request.resourceAccountId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.targetResourceId = request.targetResourceId;
            this.targetResourceType = request.targetResourceType;
        } 

        /**
         * The ID of the account group.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The maximum number of entries to return for a single request. Valid values: 1 to 1000.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region in which the resource resides.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
        public Builder relationType(String relationType) {
            this.putQueryParameter("RelationType", relationType);
            this.relationType = relationType;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the resources in the account group belong.
         */
        public Builder resourceAccountId(Long resourceAccountId) {
            this.putQueryParameter("ResourceAccountId", resourceAccountId);
            this.resourceAccountId = resourceAccountId;
            return this;
        }

        /**
         * The resource ID.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The type of the resource.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The ID of the resource that is associated with the object.
         */
        public Builder targetResourceId(String targetResourceId) {
            this.putQueryParameter("TargetResourceId", targetResourceId);
            this.targetResourceId = targetResourceId;
            return this;
        }

        /**
         * The type of the resource that is associated with the object.
         */
        public Builder targetResourceType(String targetResourceType) {
            this.putQueryParameter("TargetResourceType", targetResourceType);
            this.targetResourceType = targetResourceType;
            return this;
        }

        @Override
        public ListAggregateResourceRelationsRequest build() {
            return new ListAggregateResourceRelationsRequest(this);
        } 

    } 

}
