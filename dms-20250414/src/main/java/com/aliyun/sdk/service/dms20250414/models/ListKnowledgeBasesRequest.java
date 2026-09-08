// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListKnowledgeBasesRequest} extends {@link RequestModel}
 *
 * <p>ListKnowledgeBasesRequest</p>
 */
public class ListKnowledgeBasesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filters")
    private String filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamePattern")
    private String namePattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortFieldName")
    private String sortFieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tag;

    private ListKnowledgeBasesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.namePattern = builder.namePattern;
        this.nextToken = builder.nextToken;
        this.sortFieldName = builder.sortFieldName;
        this.sortOrder = builder.sortOrder;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBasesRequest create() {
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
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return namePattern
     */
    public String getNamePattern() {
        return this.namePattern;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sortFieldName
     */
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListKnowledgeBasesRequest, Builder> {
        private String regionId; 
        private String filters; 
        private Integer maxResults; 
        private String namePattern; 
        private String nextToken; 
        private String sortFieldName; 
        private String sortOrder; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgeBasesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.filters = request.filters;
            this.maxResults = request.maxResults;
            this.namePattern = request.namePattern;
            this.nextToken = request.nextToken;
            this.sortFieldName = request.sortFieldName;
            this.sortOrder = request.sortOrder;
            this.tag = request.tag;
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
         * <p>The filter conditions for the knowledge bases, specified as a JSON string. The only supported key is <code>state</code>. Valid values are <code>0</code> and <code>1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;state&quot;:1}</p>
         */
        public Builder filters(String filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page. Use this parameter with the <code>NextToken</code> parameter to implement pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A keyword to search for in the names of knowledge bases.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder namePattern(String namePattern) {
            this.putBodyParameter("NamePattern", namePattern);
            this.namePattern = namePattern;
            return this;
        }

        /**
         * <p>The token used to retrieve the next page of results. Valid values:</p>
         * <ul>
         * <li><p>Omit this parameter for the first request.</p>
         * </li>
         * <li><p>If the previous response returned a <strong>NextToken</strong> value, use it to retrieve the next page of results.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zCXSmY0CJbybp6FZV7vo0Wjw64X-*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort field. Valid values:</p>
         * <ul>
         * <li><p><code>id</code>: Sorts by knowledge base ID. This is the default.</p>
         * </li>
         * <li><p><code>name</code>: Sorts by knowledge base name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder sortFieldName(String sortFieldName) {
            this.putBodyParameter("SortFieldName", sortFieldName);
            this.sortFieldName = sortFieldName;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p><strong>ASC</strong>: Ascending order. This is the default.</p>
         * </li>
         * <li><p><strong>DESC</strong>: Descending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The tag of the knowledge base. In DataAgent, this is the space ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1dq7qod8hxtt1***</p>
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListKnowledgeBasesRequest build() {
            return new ListKnowledgeBasesRequest(this);
        } 

    } 

}
