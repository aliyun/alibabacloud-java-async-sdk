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
 * {@link ListDataAgentWorkspaceMemberRequest} extends {@link RequestModel}
 *
 * <p>ListDataAgentWorkspaceMemberRequest</p>
 */
public class ListDataAgentWorkspaceMemberRequest extends Request {
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
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMemberId")
    private String searchMemberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRoleName")
    private String searchRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListDataAgentWorkspaceMemberRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchMemberId = builder.searchMemberId;
        this.searchRoleName = builder.searchRoleName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentWorkspaceMemberRequest create() {
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchMemberId
     */
    public String getSearchMemberId() {
        return this.searchMemberId;
    }

    /**
     * @return searchRoleName
     */
    public String getSearchRoleName() {
        return this.searchRoleName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDataAgentWorkspaceMemberRequest, Builder> {
        private String DMSUnit; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private String searchMemberId; 
        private String searchRoleName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataAgentWorkspaceMemberRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchMemberId = request.searchMemberId;
            this.searchRoleName = request.searchRoleName;
            this.workspaceId = request.workspaceId;
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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchMemberId.
         */
        public Builder searchMemberId(String searchMemberId) {
            this.putQueryParameter("SearchMemberId", searchMemberId);
            this.searchMemberId = searchMemberId;
            return this;
        }

        /**
         * SearchRoleName.
         */
        public Builder searchRoleName(String searchRoleName) {
            this.putQueryParameter("SearchRoleName", searchRoleName);
            this.searchRoleName = searchRoleName;
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
        public ListDataAgentWorkspaceMemberRequest build() {
            return new ListDataAgentWorkspaceMemberRequest(this);
        } 

    } 

}
