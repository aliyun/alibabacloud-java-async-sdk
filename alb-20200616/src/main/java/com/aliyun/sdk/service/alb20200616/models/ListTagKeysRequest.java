// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagKeysRequest} extends {@link RequestModel}
 *
 * <p>ListTagKeysRequest</p>
 */
public class ListTagKeysRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private ListTagKeysRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagKeysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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

    public static final class Builder extends Request.Builder<ListTagKeysRequest, Builder> {
        private String category; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListTagKeysRequest request) {
            super(request);
            this.category = request.category;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceType = request.resourceType;
        } 

        /**
         * The type of the tag.
         * <p>
         * 
         * Valid values: **Custom**, **System**, and **All**.
         * 
         * Default value: **All**.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The tag key. The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of **NextToken**.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * *   **acl**: an access control list (ACL)
         * *   **loadbalancer**: an Application Load Balancer (ALB) instance
         * *   **securitypolicy**: a security policy
         * *   **servergroup**: a server group
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListTagKeysRequest build() {
            return new ListTagKeysRequest(this);
        } 

    } 

}
