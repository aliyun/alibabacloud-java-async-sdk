// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link ListAllEndEntityInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListAllEndEntityInstanceRequest</p>
 */
public class ListAllEndEntityInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private Long parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecursiveChildren")
    private Integer recursiveChildren;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private ListAllEndEntityInstanceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentId = builder.parentId;
        this.recursiveChildren = builder.recursiveChildren;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllEndEntityInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return recursiveChildren
     */
    public Integer getRecursiveChildren() {
        return this.recursiveChildren;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListAllEndEntityInstanceRequest, Builder> {
        private Integer currentPage; 
        private Integer maxResults; 
        private String nextToken; 
        private Long parentId; 
        private Integer recursiveChildren; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAllEndEntityInstanceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentId = request.parentId;
            this.recursiveChildren = request.recursiveChildren;
            this.showSize = request.showSize;
        } 

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for this call.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results. You can get this token from the \<code>NextToken\\</code> response parameter of the previous query.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86sca4384811e0b5e8707e68181f</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the parent instance.</p>
         * 
         * <strong>example:</strong>
         * <p>37633</p>
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>Specifies whether to return information about the billing type in the response. Valid values: -<strong>0</strong>: The information is not returned. -<strong>1</strong>: The information is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder recursiveChildren(Integer recursiveChildren) {
            this.putQueryParameter("RecursiveChildren", recursiveChildren);
            this.recursiveChildren = recursiveChildren;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListAllEndEntityInstanceRequest build() {
            return new ListAllEndEntityInstanceRequest(this);
        } 

    } 

}
