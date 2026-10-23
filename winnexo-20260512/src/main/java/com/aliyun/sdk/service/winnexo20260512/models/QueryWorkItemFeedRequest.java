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
 * {@link QueryWorkItemFeedRequest} extends {@link RequestModel}
 *
 * <p>QueryWorkItemFeedRequest</p>
 */
public class QueryWorkItemFeedRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessStatuses")
    private java.util.List<String> businessStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cursor")
    private String cursor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemTypes")
    private java.util.List<String> itemTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priorities")
    private java.util.List<String> priorities;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTaskId")
    private String sourceTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("view")
    private String view;

    private QueryWorkItemFeedRequest(Builder builder) {
        super(builder);
        this.businessStatuses = builder.businessStatuses;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.cursor = builder.cursor;
        this.itemTypes = builder.itemTypes;
        this.keyword = builder.keyword;
        this.pageSize = builder.pageSize;
        this.priorities = builder.priorities;
        this.scope = builder.scope;
        this.sourceTaskId = builder.sourceTaskId;
        this.tenantId = builder.tenantId;
        this.view = builder.view;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorkItemFeedRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessStatuses
     */
    public java.util.List<String> getBusinessStatuses() {
        return this.businessStatuses;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return itemTypes
     */
    public java.util.List<String> getItemTypes() {
        return this.itemTypes;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return sourceTaskId
     */
    public String getSourceTaskId() {
        return this.sourceTaskId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return view
     */
    public String getView() {
        return this.view;
    }

    public static final class Builder extends Request.Builder<QueryWorkItemFeedRequest, Builder> {
        private java.util.List<String> businessStatuses; 
        private String collaborationGroupId; 
        private String cursor; 
        private java.util.List<String> itemTypes; 
        private String keyword; 
        private Long pageSize; 
        private java.util.List<String> priorities; 
        private String scope; 
        private String sourceTaskId; 
        private String tenantId; 
        private String view; 

        private Builder() {
            super();
        } 

        private Builder(QueryWorkItemFeedRequest request) {
            super(request);
            this.businessStatuses = request.businessStatuses;
            this.collaborationGroupId = request.collaborationGroupId;
            this.cursor = request.cursor;
            this.itemTypes = request.itemTypes;
            this.keyword = request.keyword;
            this.pageSize = request.pageSize;
            this.priorities = request.priorities;
            this.scope = request.scope;
            this.sourceTaskId = request.sourceTaskId;
            this.tenantId = request.tenantId;
            this.view = request.view;
        } 

        /**
         * <p>The business status filter (seven states).</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder businessStatuses(java.util.List<String> businessStatuses) {
            String businessStatusesShrink = shrink(businessStatuses, "businessStatuses", "json");
            this.putBodyParameter("businessStatuses", businessStatusesShrink);
            this.businessStatuses = businessStatuses;
            return this;
        }

        /**
         * <p>The ID of the collaboration workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The pagination cursor. Use the nextCursor value from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder cursor(String cursor) {
            this.putBodyParameter("cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>The work item type filter.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder itemTypes(java.util.List<String> itemTypes) {
            String itemTypesShrink = shrink(itemTypes, "itemTypes", "json");
            this.putBodyParameter("itemTypes", itemTypesShrink);
            this.itemTypes = itemTypes;
            return this;
        }

        /**
         * <p>The keyword for fuzzy search in the title or description.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The priority filter.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder priorities(java.util.List<String> priorities) {
            String prioritiesShrink = shrink(priorities, "priorities", "json");
            this.putBodyParameter("priorities", prioritiesShrink);
            this.priorities = priorities;
            return this;
        }

        /**
         * <p>The personal scope filter.</p>
         * 
         * <strong>example:</strong>
         * <p>ASSIGNED_TO_ME</p>
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The ID of the source task. If specified, the flat sub-items of the task are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceTaskId(String sourceTaskId) {
            this.putBodyParameter("sourceTaskId", sourceTaskId);
            this.sourceTaskId = sourceTaskId;
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

        /**
         * <p>The view type. Valid values: FLAT (flat view) and TREE (task grouping).</p>
         * 
         * <strong>example:</strong>
         * <p>FLAT</p>
         */
        public Builder view(String view) {
            this.putBodyParameter("view", view);
            this.view = view;
            return this;
        }

        @Override
        public QueryWorkItemFeedRequest build() {
            return new QueryWorkItemFeedRequest(this);
        } 

    } 

}
