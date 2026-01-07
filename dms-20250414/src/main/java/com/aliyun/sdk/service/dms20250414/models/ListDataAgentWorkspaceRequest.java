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
 * {@link ListDataAgentWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>ListDataAgentWorkspaceRequest</p>
 */
public class ListDataAgentWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

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
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceType;

    private ListDataAgentWorkspaceRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.workspaceName = builder.workspaceName;
        this.workspaceType = builder.workspaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
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
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return workspaceType
     */
    public String getWorkspaceType() {
        return this.workspaceType;
    }

    public static final class Builder extends Request.Builder<ListDataAgentWorkspaceRequest, Builder> {
        private String DMSUnit; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private String orderBy; 
        private String pageNumber; 
        private String pageSize; 
        private String workspaceName; 
        private String workspaceType; 

        private Builder() {
            super();
        } 

        private Builder(ListDataAgentWorkspaceRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.workspaceName = request.workspaceName;
            this.workspaceType = request.workspaceType;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
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
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * WorkspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MY</p>
         */
        public Builder workspaceType(String workspaceType) {
            this.putQueryParameter("WorkspaceType", workspaceType);
            this.workspaceType = workspaceType;
            return this;
        }

        @Override
        public ListDataAgentWorkspaceRequest build() {
            return new ListDataAgentWorkspaceRequest(this);
        } 

    } 

}
