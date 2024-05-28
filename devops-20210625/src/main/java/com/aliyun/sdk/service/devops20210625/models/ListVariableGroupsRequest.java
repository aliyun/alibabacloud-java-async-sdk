// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVariableGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListVariableGroupsRequest</p>
 */
public class ListVariableGroupsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageOrder")
    private String pageOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSort")
    private String pageSort;

    private ListVariableGroupsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageOrder = builder.pageOrder;
        this.pageSort = builder.pageSort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVariableGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
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
     * @return pageOrder
     */
    public String getPageOrder() {
        return this.pageOrder;
    }

    /**
     * @return pageSort
     */
    public String getPageSort() {
        return this.pageSort;
    }

    public static final class Builder extends Request.Builder<ListVariableGroupsRequest, Builder> {
        private String organizationId; 
        private Integer maxResults; 
        private String nextToken; 
        private String pageOrder; 
        private String pageSort; 

        private Builder() {
            super();
        } 

        private Builder(ListVariableGroupsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageOrder = request.pageOrder;
            this.pageSort = request.pageSort;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * pageOrder.
         */
        public Builder pageOrder(String pageOrder) {
            this.putQueryParameter("pageOrder", pageOrder);
            this.pageOrder = pageOrder;
            return this;
        }

        /**
         * pageSort.
         */
        public Builder pageSort(String pageSort) {
            this.putQueryParameter("pageSort", pageSort);
            this.pageSort = pageSort;
            return this;
        }

        @Override
        public ListVariableGroupsRequest build() {
            return new ListVariableGroupsRequest(this);
        } 

    } 

}
