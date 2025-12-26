// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseType")
    private String knowledgeBaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListKnowledgeBasesRequest(Builder builder) {
        super(builder);
        this.creator = builder.creator;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseType = builder.knowledgeBaseType;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.workspaceId = builder.workspaceId;
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
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeBaseType
     */
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListKnowledgeBasesRequest, Builder> {
        private String creator; 
        private String knowledgeBaseId; 
        private String knowledgeBaseType; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgeBasesRequest request) {
            super(request);
            this.creator = request.creator;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.knowledgeBaseType = request.knowledgeBaseType;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * KnowledgeBaseType.
         */
        public Builder knowledgeBaseType(String knowledgeBaseType) {
            this.putQueryParameter("KnowledgeBaseType", knowledgeBaseType);
            this.knowledgeBaseType = knowledgeBaseType;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListKnowledgeBasesRequest build() {
            return new ListKnowledgeBasesRequest(this);
        } 

    } 

}
