// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEntityItemsRequest} extends {@link RequestModel}
 *
 * <p>ListEntityItemsRequest</p>
 */
public class ListEntityItemsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EntityType")
    @Validation(required = true)
    private String entityType;

    @Query
    @NameInMap("IsReversed")
    private Boolean isReversed;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("Search")
    private String search;

    @Query
    @NameInMap("Workspace")
    @Validation(required = true)
    private String workspace;

    private ListEntityItemsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityType = builder.entityType;
        this.isReversed = builder.isReversed;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.search = builder.search;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEntityItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return isReversed
     */
    public Boolean getIsReversed() {
        return this.isReversed;
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
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListEntityItemsRequest, Builder> {
        private String regionId; 
        private String entityType; 
        private Boolean isReversed; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String search; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListEntityItemsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityType = request.entityType;
            this.isReversed = request.isReversed;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.search = request.search;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * IsReversed.
         */
        public Builder isReversed(Boolean isReversed) {
            this.putQueryParameter("IsReversed", isReversed);
            this.isReversed = isReversed;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * Search.
         */
        public Builder search(String search) {
            this.putQueryParameter("Search", search);
            this.search = search;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListEntityItemsRequest build() {
            return new ListEntityItemsRequest(this);
        } 

    } 

}
