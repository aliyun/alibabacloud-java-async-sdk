// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListTodosRequest} extends {@link RequestModel}
 *
 * <p>ListTodosRequest</p>
 */
public class ListTodosRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priorities")
    private java.util.List<String> priorities;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("readStatus")
    private java.util.List<String> readStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTypes")
    private java.util.List<String> sourceTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("statuses")
    private java.util.List<String> statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListTodosRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.priorities = builder.priorities;
        this.readStatus = builder.readStatus;
        this.sortBy = builder.sortBy;
        this.sourceTypes = builder.sourceTypes;
        this.statuses = builder.statuses;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTodosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
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
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return priorities
     */
    public java.util.List<String> getPriorities() {
        return this.priorities;
    }

    /**
     * @return readStatus
     */
    public java.util.List<String> getReadStatus() {
        return this.readStatus;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sourceTypes
     */
    public java.util.List<String> getSourceTypes() {
        return this.sourceTypes;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListTodosRequest, Builder> {
        private String collaborationGroupId; 
        private String keyword; 
        private Long maxResults; 
        private String nextToken; 
        private Long page; 
        private Long pageSize; 
        private java.util.List<String> priorities; 
        private java.util.List<String> readStatus; 
        private String sortBy; 
        private java.util.List<String> sourceTypes; 
        private java.util.List<String> statuses; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListTodosRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.priorities = request.priorities;
            this.readStatus = request.readStatus;
            this.sortBy = request.sortBy;
            this.sourceTypes = request.sourceTypes;
            this.statuses = request.statuses;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The collaboration workspace ID. This is an optional filter. If not specified, items from all workspaces are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_123</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The keyword for fuzzy search in the title or summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Approval</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page. Valid values: 1 to 100. This parameter takes precedence over pageSize if both are specified.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Use the nextToken value returned in the previous response. This parameter takes precedence over page if both are specified.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. This parameter is ignored if nextToken is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The priority filter. Valid values: HIGH, MEDIUM, and LOW.</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        public Builder priorities(java.util.List<String> priorities) {
            String prioritiesShrink = shrink(priorities, "priorities", "json");
            this.putBodyParameter("priorities", prioritiesShrink);
            this.priorities = priorities;
            return this;
        }

        /**
         * <p>The read status filter. Valid values: UNREAD and READ. The status is determined by the readAt field of the assignee.</p>
         * 
         * <strong>example:</strong>
         * <p>UNREAD</p>
         */
        public Builder readStatus(java.util.List<String> readStatus) {
            String readStatusShrink = shrink(readStatus, "readStatus", "json");
            this.putBodyParameter("readStatus", readStatusShrink);
            this.readStatus = readStatus;
            return this;
        }

        /**
         * <p>The sorting method.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder sortBy(String sortBy) {
            this.putBodyParameter("sortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The to-do type filter. Valid values: WORKFLOW and OPEN_API.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        public Builder sourceTypes(java.util.List<String> sourceTypes) {
            String sourceTypesShrink = shrink(sourceTypes, "sourceTypes", "json");
            this.putBodyParameter("sourceTypes", sourceTypesShrink);
            this.sourceTypes = sourceTypes;
            return this;
        }

        /**
         * <p>The to-do status filter. Valid values: PENDING, COMPLETED, and CANCELLED.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            String statusesShrink = shrink(statuses, "statuses", "json");
            this.putBodyParameter("statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListTodosRequest build() {
            return new ListTodosRequest(this);
        } 

    } 

}
