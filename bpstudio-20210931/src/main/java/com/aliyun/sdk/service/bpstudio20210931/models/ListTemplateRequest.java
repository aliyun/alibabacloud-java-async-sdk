// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListTemplateRequest</p>
 */
public class ListTemplateRequest extends Request {
    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer nextToken;

    @Body
    @NameInMap("OrderType")
    @Validation(maximum = 5, minimum = 1)
    private Long orderType;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("TagList")
    @Validation()
    private Integer tagList;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ListTemplateRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderType = builder.orderType;
        this.resourceGroupId = builder.resourceGroupId;
        this.tagList = builder.tagList;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderType
     */
    public Long getOrderType() {
        return this.orderType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tagList
     */
    public Integer getTagList() {
        return this.tagList;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListTemplateRequest, Builder> {
        private String keyword; 
        private Integer maxResults; 
        private Integer nextToken; 
        private Long orderType; 
        private String resourceGroupId; 
        private Integer tagList; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListTemplateRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderType = request.orderType;
            this.resourceGroupId = request.resourceGroupId;
            this.tagList = request.tagList;
            this.type = request.type;
        } 

        /**
         * The keyword that is used to search for templates.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder nextToken(Integer nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The criterion by which the returned templates are sorted. Valid values:
         * <p>
         * 
         * *   1: The templates are sorted by the time when they are updated.
         * *   2: The templates are sorted by the time when they are created.
         * *   3: The templates are sorted by the system.
         * *   4: The templates are sorted by the number of times that they are used.
         * *   If you specify an integer other than 1, 2, 3, and 4 or do not specify any value, the templates are sorted by the system.
         */
        public Builder orderType(Long orderType) {
            this.putBodyParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tag that you want to use to query templates.
         */
        public Builder tagList(Integer tagList) {
            this.putBodyParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * The type of the templates to be returned. Valid values: public and private
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListTemplateRequest build() {
            return new ListTemplateRequest(this);
        } 

    } 

}
