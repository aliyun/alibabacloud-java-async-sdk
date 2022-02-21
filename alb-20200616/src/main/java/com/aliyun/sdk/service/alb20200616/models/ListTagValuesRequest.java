// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("TagKey")
    @Validation(required = true)
    private String tagKey;

    private ListTagValuesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
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
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<ListTagValuesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String resourceId; 
        private String resourceType; 
        private String tagKey; 

        private Builder() {
            super();
        } 

        private Builder(ListTagValuesRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.resourceId = response.resourceId;
            this.resourceType = response.resourceType;
            this.tagKey = response.tagKey;
        } 

        /**
         * 查询数量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 资源实例Id
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 资源类型
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * 具体的标签Key
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public ListTagValuesRequest build() {
            return new ListTagValuesRequest(this);
        } 

    } 

}
