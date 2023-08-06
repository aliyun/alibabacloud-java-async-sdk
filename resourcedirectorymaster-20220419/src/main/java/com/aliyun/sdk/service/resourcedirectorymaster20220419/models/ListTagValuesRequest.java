// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagValuesRequest} extends {@link RequestModel}
 *
 * <p>ListTagValuesRequest</p>
 */
public class ListTagValuesRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("TagKey")
    @Validation(required = true)
    private String tagKey;

    @Query
    @NameInMap("ValueFilter")
    private String valueFilter;

    private ListTagValuesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
        this.valueFilter = builder.valueFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagValuesRequest create() {
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * @return valueFilter
     */
    public String getValueFilter() {
        return this.valueFilter;
    }

    public static final class Builder extends Request.Builder<ListTagValuesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String resourceType; 
        private String tagKey; 
        private String valueFilter; 

        private Builder() {
            super();
        } 

        private Builder(ListTagValuesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceType = request.resourceType;
            this.tagKey = request.tagKey;
            this.valueFilter = request.valueFilter;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TagKey.
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * ValueFilter.
         */
        public Builder valueFilter(String valueFilter) {
            this.putQueryParameter("ValueFilter", valueFilter);
            this.valueFilter = valueFilter;
            return this;
        }

        @Override
        public ListTagValuesRequest build() {
            return new ListTagValuesRequest(this);
        } 

    } 

}
