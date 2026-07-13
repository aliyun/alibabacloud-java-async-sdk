// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link ListResourceCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceCategoriesRequest</p>
 */
public class ListResourceCategoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
    private String resourceCategoryId;

    private ListResourceCategoriesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceCategoryId = builder.resourceCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceCategoriesRequest create() {
        return builder().build();
    }

@Override
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
     * @return resourceCategoryId
     */
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public static final class Builder extends Request.Builder<ListResourceCategoriesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String resourceCategoryId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceCategoriesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceCategoryId = request.resourceCategoryId;
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
         * ResourceCategoryId.
         */
        public Builder resourceCategoryId(String resourceCategoryId) {
            this.putQueryParameter("ResourceCategoryId", resourceCategoryId);
            this.resourceCategoryId = resourceCategoryId;
            return this;
        }

        @Override
        public ListResourceCategoriesRequest build() {
            return new ListResourceCategoriesRequest(this);
        } 

    } 

}
