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
 * {@link QuerySourceUsageSummaryRequest} extends {@link RequestModel}
 *
 * <p>QuerySourceUsageSummaryRequest</p>
 */
public class QuerySourceUsageSummaryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("scopeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scopeType;

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

    private QuerySourceUsageSummaryRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.endTime = builder.endTime;
        this.eventType = builder.eventType;
        this.knowledgeBaseIds = builder.knowledgeBaseIds;
        this.scopeType = builder.scopeType;
        this.sourceIds = builder.sourceIds;
        this.sourceName = builder.sourceName;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySourceUsageSummaryRequest create() {
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
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
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

    public static final class Builder extends Request.Builder<QuerySourceUsageSummaryRequest, Builder> {
        private String collaborationGroupId; 
        private String endTime; 
        private String eventType; 
        private java.util.List<String> knowledgeBaseIds; 
        private String scopeType; 
        private java.util.List<String> sourceIds; 
        private String sourceName; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySourceUsageSummaryRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.endTime = request.endTime;
            this.eventType = request.eventType;
            this.knowledgeBaseIds = request.knowledgeBaseIds;
            this.scopeType = request.scopeType;
            this.sourceIds = request.sourceIds;
            this.sourceName = request.sourceName;
            this.startTime = request.startTime;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The ID of the collaboration group to which the resource belongs, such as cg_101. If you specify this parameter, a group workspace task is created, and the caller must be a valid group member. If you leave this parameter empty, a personal task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The actual end timestamp of the live stream, in milliseconds.</p>
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
         * <p>UserOperator</p>
         */
        public Builder eventType(String eventType) {
            this.putBodyParameter("eventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The ID of the knowledge base folder.</p>
         */
        public Builder knowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
            String knowledgeBaseIdsShrink = shrink(knowledgeBaseIds, "knowledgeBaseIds", "json");
            this.putBodyParameter("knowledgeBaseIds", knowledgeBaseIdsShrink);
            this.knowledgeBaseIds = knowledgeBaseIds;
            return this;
        }

        /**
         * <p>The role scope type. Valid values:</p>
         * <ul>
         * <li><strong>ALL_VISIBLE</strong>: All members.</li>
         * <li><strong>PART_VISIBLE</strong>: Partial members.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Report perspective: TENANT for enterprise knowledge, GROUP for a single workspace, and ALL_GROUPS for all workspaces of the current tenant (platform super administrator only). Valid values: TENANT, GROUP, and ALL_GROUPS</p>
         */
        public Builder scopeType(String scopeType) {
            this.putBodyParameter("scopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * <p>The source ID.</p>
         */
        public Builder sourceIds(java.util.List<String> sourceIds) {
            String sourceIdsShrink = shrink(sourceIds, "sourceIds", "json");
            this.putBodyParameter("sourceIds", sourceIdsShrink);
            this.sourceIds = sourceIds;
            return this;
        }

        /**
         * <p>The resume channel source.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the source</p>
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
         * <p>2026-09-01T00:00:00+08:00</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The tenant ID, which is a common parameter. If you use winnexo-cli, pass this parameter explicitly by using --tenant-id.</p>
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
        public QuerySourceUsageSummaryRequest build() {
            return new QuerySourceUsageSummaryRequest(this);
        } 

    } 

}
