// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAuthorizedSoftwareRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorizedSoftwareRequest</p>
 */
public class ListAuthorizedSoftwareRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsReversed")
    private Boolean isReversed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Search")
    private String search;

    private ListAuthorizedSoftwareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.isReversed = builder.isReversed;
        this.location = builder.location;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.search = builder.search;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedSoftwareRequest create() {
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

    public static final class Builder extends Request.Builder<ListAuthorizedSoftwareRequest, Builder> {
        private String regionId; 
        private Boolean isReversed; 
        private String location; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String search; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthorizedSoftwareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.isReversed = request.isReversed;
            this.location = request.location;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.search = request.search;
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
         * IsReversed.
         */
        public Builder isReversed(Boolean isReversed) {
            this.putQueryParameter("IsReversed", isReversed);
            this.isReversed = isReversed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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

        @Override
        public ListAuthorizedSoftwareRequest build() {
            return new ListAuthorizedSoftwareRequest(this);
        } 

    } 

}
