// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppsRequest} extends {@link RequestModel}
 *
 * <p>ListAppsRequest</p>
 */
public class ListAppsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("IsReversed")
    private Boolean isReversed;

    @Query
    @NameInMap("LabelSelector")
    private String labelSelector;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("Search")
    private String search;

    @Query
    @NameInMap("Workspace")
    @Validation(required = true)
    private String workspace;

    private ListAppsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appType = builder.appType;
        this.isReversed = builder.isReversed;
        this.labelSelector = builder.labelSelector;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.scope = builder.scope;
        this.search = builder.search;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsRequest create() {
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
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return isReversed
     */
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    /**
     * @return labelSelector
     */
    public String getLabelSelector() {
        return this.labelSelector;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
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

    public static final class Builder extends Request.Builder<ListAppsRequest, Builder> {
        private String regionId; 
        private String appType; 
        private Boolean isReversed; 
        private String labelSelector; 
        private String language; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String scope; 
        private String search; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListAppsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appType = request.appType;
            this.isReversed = request.isReversed;
            this.labelSelector = request.labelSelector;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.scope = request.scope;
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
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
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
         * LabelSelector.
         */
        public Builder labelSelector(String labelSelector) {
            this.putQueryParameter("LabelSelector", labelSelector);
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
         * Next Token
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
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
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
        public ListAppsRequest build() {
            return new ListAppsRequest(this);
        } 

    } 

}
