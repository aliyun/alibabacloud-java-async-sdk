// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGlobalAppsRequest} extends {@link RequestModel}
 *
 * <p>ListGlobalAppsRequest</p>
 */
public class ListGlobalAppsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppScope")
    private String appScope;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("IsReversed")
    private Boolean isReversed;

    @Query
    @NameInMap("Location")
    private String location;

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
    @NameInMap("Toolkit")
    private String toolkit;

    private ListGlobalAppsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appScope = builder.appScope;
        this.category = builder.category;
        this.isReversed = builder.isReversed;
        this.location = builder.location;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.search = builder.search;
        this.toolkit = builder.toolkit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGlobalAppsRequest create() {
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
     * @return appScope
     */
    public String getAppScope() {
        return this.appScope;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return isReversed
     */
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
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
     * @return toolkit
     */
    public String getToolkit() {
        return this.toolkit;
    }

    public static final class Builder extends Request.Builder<ListGlobalAppsRequest, Builder> {
        private String regionId; 
        private String appScope; 
        private String category; 
        private Boolean isReversed; 
        private String location; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String search; 
        private String toolkit; 

        private Builder() {
            super();
        } 

        private Builder(ListGlobalAppsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appScope = request.appScope;
            this.category = request.category;
            this.isReversed = request.isReversed;
            this.location = request.location;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.search = request.search;
            this.toolkit = request.toolkit;
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
         * AppScope.
         */
        public Builder appScope(String appScope) {
            this.putQueryParameter("AppScope", appScope);
            this.appScope = appScope;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
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
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
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
         * Toolkit.
         */
        public Builder toolkit(String toolkit) {
            this.putQueryParameter("Toolkit", toolkit);
            this.toolkit = toolkit;
            return this;
        }

        @Override
        public ListGlobalAppsRequest build() {
            return new ListGlobalAppsRequest(this);
        } 

    } 

}
