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
 * {@link ListWorkItemsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkItemsRequest</p>
 */
public class ListWorkItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessStatuses")
    private java.util.List<String> businessStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemTypes")
    private java.util.List<String> itemTypes;

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
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListWorkItemsRequest(Builder builder) {
        super(builder);
        this.businessStatuses = builder.businessStatuses;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.itemTypes = builder.itemTypes;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.priorities = builder.priorities;
        this.scope = builder.scope;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkItemsRequest create() {
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListWorkItemsRequest, Builder> {
        private java.util.List<String> businessStatuses; 
        private String collaborationGroupId; 
        private java.util.List<String> itemTypes; 
        private String keyword; 
        private Long maxResults; 
        private String nextToken; 
        private Long page; 
        private Long pageSize; 
        private java.util.List<String> priorities; 
        private String scope; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkItemsRequest request) {
            super(request);
            this.businessStatuses = request.businessStatuses;
            this.collaborationGroupId = request.collaborationGroupId;
            this.itemTypes = request.itemTypes;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.priorities = request.priorities;
            this.scope = request.scope;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The business statuses used for filtering.</p>
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
         * <p>The work item types used for filtering.</p>
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
         * <p>The maximum number of entries to return per page. Valid values: 1 to 100. This parameter takes precedence over pageSize if both are specified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Obtain the token from the nextToken parameter in the previous response. This parameter takes precedence over page if both are specified.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The priorities used for filtering.</p>
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
         * <p>The personal scope used for filtering.</p>
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
        public ListWorkItemsRequest build() {
            return new ListWorkItemsRequest(this);
        } 

    } 

}
