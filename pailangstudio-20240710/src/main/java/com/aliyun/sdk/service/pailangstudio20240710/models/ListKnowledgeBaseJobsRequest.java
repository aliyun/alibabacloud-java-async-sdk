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
 * {@link ListKnowledgeBaseJobsRequest} extends {@link RequestModel}
 *
 * <p>ListKnowledgeBaseJobsRequest</p>
 */
public class ListKnowledgeBaseJobsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobAction")
    private String jobAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseJobId")
    private String knowledgeBaseJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListKnowledgeBaseJobsRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.jobAction = builder.jobAction;
        this.knowledgeBaseJobId = builder.knowledgeBaseJobId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return jobAction
     */
    public String getJobAction() {
        return this.jobAction;
    }

    /**
     * @return knowledgeBaseJobId
     */
    public String getKnowledgeBaseJobId() {
        return this.knowledgeBaseJobId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListKnowledgeBaseJobsRequest, Builder> {
        private String knowledgeBaseId; 
        private String jobAction; 
        private String knowledgeBaseJobId; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String status; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgeBaseJobsRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.jobAction = request.jobAction;
            this.knowledgeBaseJobId = request.knowledgeBaseJobId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * JobAction.
         */
        public Builder jobAction(String jobAction) {
            this.putQueryParameter("JobAction", jobAction);
            this.jobAction = jobAction;
            return this;
        }

        /**
         * KnowledgeBaseJobId.
         */
        public Builder knowledgeBaseJobId(String knowledgeBaseJobId) {
            this.putQueryParameter("KnowledgeBaseJobId", knowledgeBaseJobId);
            this.knowledgeBaseJobId = knowledgeBaseJobId;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public ListKnowledgeBaseJobsRequest build() {
            return new ListKnowledgeBaseJobsRequest(this);
        } 

    } 

}
