// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListTemplateRequest</p>
 */
public class ListTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Integer nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(maximum = 5, minimum = 1)
    private Long orderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagList")
    @com.aliyun.core.annotation.Validation()
    private Integer tagList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The keyword that is used to search for templates.</p>
         * 
         * <strong>example:</strong>
         * <p>cadt</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(Integer nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The criterion by which the returned templates are sorted. Valid values:</p>
         * <ul>
         * <li>1: The templates are sorted by the time when they are updated.</li>
         * <li>2: The templates are sorted by the time when they are created.</li>
         * <li>3: The templates are sorted by the system.</li>
         * <li>4: The templates are sorted by the number of times that they are used.</li>
         * <li>If you specify an integer other than 1, 2, 3, and 4 or do not specify any value, the templates are sorted by the system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderType(Long orderType) {
            this.putBodyParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyjt3c5om3hi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tag that you want to use to query templates.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tagList(Integer tagList) {
            this.putBodyParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>The type of the templates to be returned. Valid values: public and private</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
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
