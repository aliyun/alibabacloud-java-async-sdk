// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link ListProtectedResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListProtectedResourcesRequest</p>
 */
public class ListProtectedResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedByProduct")
    private String createdByProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ListProtectedResourcesRequest(Builder builder) {
        super(builder);
        this.createdByProduct = builder.createdByProduct;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceId = builder.resourceId;
        this.skip = builder.skip;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectedResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdByProduct
     */
    public String getCreatedByProduct() {
        return this.createdByProduct;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListProtectedResourcesRequest, Builder> {
        private String createdByProduct; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceId; 
        private Integer skip; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListProtectedResourcesRequest request) {
            super(request);
            this.createdByProduct = request.createdByProduct;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceId = request.resourceId;
            this.skip = request.skip;
            this.sourceType = request.sourceType;
        } 

        /**
         * CreatedByProduct.
         */
        public Builder createdByProduct(String createdByProduct) {
            this.putQueryParameter("CreatedByProduct", createdByProduct);
            this.createdByProduct = createdByProduct;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Skip.
         */
        public Builder skip(Integer skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListProtectedResourcesRequest build() {
            return new ListProtectedResourcesRequest(this);
        } 

    } 

}
