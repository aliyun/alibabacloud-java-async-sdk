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
 * {@link ListSourceUsageStatisticsRequest} extends {@link RequestModel}
 *
 * <p>ListSourceUsageStatisticsRequest</p>
 */
public class ListSourceUsageStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("eventType")
    private String eventType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseIds")
    private java.util.List<String> knowledgeBaseIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scopeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scopeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceIds")
    private java.util.List<String> sourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceName")
    private String sourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListSourceUsageStatisticsRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.endTime = builder.endTime;
        this.eventType = builder.eventType;
        this.knowledgeBaseIds = builder.knowledgeBaseIds;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.scopeType = builder.scopeType;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.sourceIds = builder.sourceIds;
        this.sourceName = builder.sourceName;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSourceUsageStatisticsRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return knowledgeBaseIds
     */
    public java.util.List<String> getKnowledgeBaseIds() {
        return this.knowledgeBaseIds;
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
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return sourceIds
     */
    public java.util.List<String> getSourceIds() {
        return this.sourceIds;
    }

    /**
     * @return sourceName
     */
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListSourceUsageStatisticsRequest, Builder> {
        private String collaborationGroupId; 
        private String endTime; 
        private String eventType; 
        private java.util.List<String> knowledgeBaseIds; 
        private Long page; 
        private Long pageSize; 
        private String scopeType; 
        private String sortBy; 
        private String sortOrder; 
        private java.util.List<String> sourceIds; 
        private String sourceName; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListSourceUsageStatisticsRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.endTime = request.endTime;
            this.eventType = request.eventType;
            this.knowledgeBaseIds = request.knowledgeBaseIds;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.scopeType = request.scopeType;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.sourceIds = request.sourceIds;
            this.sourceName = request.sourceName;
            this.startTime = request.startTime;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The ID of the collaboration group to which the resource belongs, such as cg_101. If you specify this parameter, a group workspace task is created, and the caller must be a valid group member. If you leave this parameter empty, a personal task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1112</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The actual end timestamp, in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T23:59:59+08:00</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>HealthCheck</p>
         */
        public Builder eventType(String eventType) {
            this.putBodyParameter("eventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The root IDs of the enterprise knowledge bases, which are available only for TENANT. The knowledge bases are filtered based on current directory bindings, not historical ownership. Maximum number of items: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;kb_9401&quot;]</p>
         */
        public Builder knowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
            String knowledgeBaseIdsShrink = shrink(knowledgeBaseIds, "knowledgeBaseIds", "json");
            this.putBodyParameter("knowledgeBaseIds", knowledgeBaseIdsShrink);
            this.knowledgeBaseIds = knowledgeBaseIds;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The report perspective. Valid values: TENANT (enterprise knowledge), GROUP (a single workspace), and ALL_GROUPS (all workspaces of the current tenant, only for platform super administrators).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Report perspective: TENANT for enterprise knowledge, GROUP for a single workspace, ALL_GROUPS for all workspaces of the current tenant (platform super administrator only). Valid values: TENANT, GROUP, ALL_GROUPS</p>
         */
        public Builder scopeType(String scopeType) {
            this.putBodyParameter("scopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * <p>The content of the sort clause.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sortBy(String sortBy) {
            this.putBodyParameter("sortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The sort order. This parameter takes effect only when sortBy is specified. Valid values: ASC and DESC. The values are case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("sortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The IDs of the associated sources.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;src_9401&quot;]</p>
         */
        public Builder sourceIds(java.util.List<String> sourceIds) {
            String sourceIdsShrink = shrink(sourceIds, "sourceIds", "json");
            this.putBodyParameter("sourceIds", sourceIdsShrink);
            this.sourceIds = sourceIds;
            return this;
        }

        /**
         * <p>The name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>The naming content of the source</p>
         */
        public Builder sourceName(String sourceName) {
            this.putBodyParameter("sourceName", sourceName);
            this.sourceName = sourceName;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The effective tenant ID.</p>
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
        public ListSourceUsageStatisticsRequest build() {
            return new ListSourceUsageStatisticsRequest(this);
        } 

    } 

}
