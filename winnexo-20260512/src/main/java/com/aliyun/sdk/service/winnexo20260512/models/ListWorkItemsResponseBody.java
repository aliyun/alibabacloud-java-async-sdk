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
 * {@link ListWorkItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkItemsResponseBody</p>
 */
public class ListWorkItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListWorkItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private Long maxResults; 
        private String message; 
        private String nextToken; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListWorkItemsResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>是否还有更多数据</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>当前页工作项列表</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>本次生效的单页最大返回数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>下一页翻页令牌；无更多数据时为空字符串</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>生效单页条数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>筛选条件下可见总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListWorkItemsResponseBody build() {
            return new ListWorkItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkItemsResponseBody</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachmentId")
        private String attachmentId;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("refUrl")
        private String refUrl;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceKind")
        private String resourceKind;

        @com.aliyun.core.annotation.NameInMap("sizeBytes")
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Attachments(Builder builder) {
            this.attachmentId = builder.attachmentId;
            this.contentType = builder.contentType;
            this.refUrl = builder.refUrl;
            this.resourceId = builder.resourceId;
            this.resourceKind = builder.resourceKind;
            this.sizeBytes = builder.sizeBytes;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return attachmentId
         */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return refUrl
         */
        public String getRefUrl() {
            return this.refUrl;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceKind
         */
        public String getResourceKind() {
            return this.resourceKind;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String attachmentId; 
            private String contentType; 
            private String refUrl; 
            private String resourceId; 
            private String resourceKind; 
            private Long sizeBytes; 
            private String title; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.attachmentId = model.attachmentId;
                this.contentType = model.contentType;
                this.refUrl = model.refUrl;
                this.resourceId = model.resourceId;
                this.resourceKind = model.resourceKind;
                this.sizeBytes = model.sizeBytes;
                this.title = model.title;
            } 

            /**
             * <p>附件ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * <p>内容类型</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>附件访问入口（OpenAPI 302 前置）</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder refUrl(String refUrl) {
                this.refUrl = refUrl;
                return this;
            }

            /**
             * <p>附件资源ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>附件资源类型</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * <p>附件大小(字节)</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>附件标题</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkItemsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acceptanceCriteria")
        private String acceptanceCriteria;

        @com.aliyun.core.annotation.NameInMap("appliedStatusVersion")
        private Long appliedStatusVersion;

        @com.aliyun.core.annotation.NameInMap("attachments")
        private java.util.List<Attachments> attachments;

        @com.aliyun.core.annotation.NameInMap("businessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("canDelete")
        private Boolean canDelete;

        @com.aliyun.core.annotation.NameInMap("canManage")
        private Boolean canManage;

        @com.aliyun.core.annotation.NameInMap("canManageVisibility")
        private Boolean canManageVisibility;

        @com.aliyun.core.annotation.NameInMap("canRename")
        private Boolean canRename;

        @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
        private String collaborationGroupId;

        @com.aliyun.core.annotation.NameInMap("collaboratorUserIds")
        private java.util.List<Long> collaboratorUserIds;

        @com.aliyun.core.annotation.NameInMap("conversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("createdByUserId")
        private Long createdByUserId;

        @com.aliyun.core.annotation.NameInMap("creationType")
        private String creationType;

        @com.aliyun.core.annotation.NameInMap("currentPlanId")
        private String currentPlanId;

        @com.aliyun.core.annotation.NameInMap("currentRevision")
        private Long currentRevision;

        @com.aliyun.core.annotation.NameInMap("currentRunId")
        private String currentRunId;

        @com.aliyun.core.annotation.NameInMap("currentRunSeq")
        private Long currentRunSeq;

        @com.aliyun.core.annotation.NameInMap("currentStepName")
        private String currentStepName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("inputVersion")
        private Long inputVersion;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("lastProcessingAt")
        private String lastProcessingAt;

        @com.aliyun.core.annotation.NameInMap("legacyTopic")
        private Boolean legacyTopic;

        @com.aliyun.core.annotation.NameInMap("memberUserIds")
        private java.util.List<Long> memberUserIds;

        @com.aliyun.core.annotation.NameInMap("modifiedAt")
        private String modifiedAt;

        @com.aliyun.core.annotation.NameInMap("ownerUserId")
        private Long ownerUserId;

        @com.aliyun.core.annotation.NameInMap("pinned")
        private Boolean pinned;

        @com.aliyun.core.annotation.NameInMap("priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("progressCompleted")
        private Long progressCompleted;

        @com.aliyun.core.annotation.NameInMap("progressTotal")
        private Long progressTotal;

        @com.aliyun.core.annotation.NameInMap("sourceExecutionId")
        private String sourceExecutionId;

        @com.aliyun.core.annotation.NameInMap("sourceTaskId")
        private String sourceTaskId;

        @com.aliyun.core.annotation.NameInMap("sourceTaskName")
        private String sourceTaskName;

        @com.aliyun.core.annotation.NameInMap("sourceTriggerKey")
        private String sourceTriggerKey;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("triggerTimezone")
        private String triggerTimezone;

        @com.aliyun.core.annotation.NameInMap("triggeredAt")
        private String triggeredAt;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        @com.aliyun.core.annotation.NameInMap("visibility")
        private String visibility;

        @com.aliyun.core.annotation.NameInMap("visibilitySource")
        private String visibilitySource;

        @com.aliyun.core.annotation.NameInMap("workItemId")
        private String workItemId;

        @com.aliyun.core.annotation.NameInMap("workflowStatus")
        private String workflowStatus;

        @com.aliyun.core.annotation.NameInMap("workflowTemplateIds")
        private java.util.List<String> workflowTemplateIds;

        private Items(Builder builder) {
            this.acceptanceCriteria = builder.acceptanceCriteria;
            this.appliedStatusVersion = builder.appliedStatusVersion;
            this.attachments = builder.attachments;
            this.businessStatus = builder.businessStatus;
            this.canDelete = builder.canDelete;
            this.canManage = builder.canManage;
            this.canManageVisibility = builder.canManageVisibility;
            this.canRename = builder.canRename;
            this.collaborationGroupId = builder.collaborationGroupId;
            this.collaboratorUserIds = builder.collaboratorUserIds;
            this.conversationId = builder.conversationId;
            this.createdAt = builder.createdAt;
            this.createdByUserId = builder.createdByUserId;
            this.creationType = builder.creationType;
            this.currentPlanId = builder.currentPlanId;
            this.currentRevision = builder.currentRevision;
            this.currentRunId = builder.currentRunId;
            this.currentRunSeq = builder.currentRunSeq;
            this.currentStepName = builder.currentStepName;
            this.description = builder.description;
            this.inputVersion = builder.inputVersion;
            this.itemType = builder.itemType;
            this.lastProcessingAt = builder.lastProcessingAt;
            this.legacyTopic = builder.legacyTopic;
            this.memberUserIds = builder.memberUserIds;
            this.modifiedAt = builder.modifiedAt;
            this.ownerUserId = builder.ownerUserId;
            this.pinned = builder.pinned;
            this.priority = builder.priority;
            this.progressCompleted = builder.progressCompleted;
            this.progressTotal = builder.progressTotal;
            this.sourceExecutionId = builder.sourceExecutionId;
            this.sourceTaskId = builder.sourceTaskId;
            this.sourceTaskName = builder.sourceTaskName;
            this.sourceTriggerKey = builder.sourceTriggerKey;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.triggerTimezone = builder.triggerTimezone;
            this.triggeredAt = builder.triggeredAt;
            this.version = builder.version;
            this.visibility = builder.visibility;
            this.visibilitySource = builder.visibilitySource;
            this.workItemId = builder.workItemId;
            this.workflowStatus = builder.workflowStatus;
            this.workflowTemplateIds = builder.workflowTemplateIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return acceptanceCriteria
         */
        public String getAcceptanceCriteria() {
            return this.acceptanceCriteria;
        }

        /**
         * @return appliedStatusVersion
         */
        public Long getAppliedStatusVersion() {
            return this.appliedStatusVersion;
        }

        /**
         * @return attachments
         */
        public java.util.List<Attachments> getAttachments() {
            return this.attachments;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return canDelete
         */
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        /**
         * @return canManage
         */
        public Boolean getCanManage() {
            return this.canManage;
        }

        /**
         * @return canManageVisibility
         */
        public Boolean getCanManageVisibility() {
            return this.canManageVisibility;
        }

        /**
         * @return canRename
         */
        public Boolean getCanRename() {
            return this.canRename;
        }

        /**
         * @return collaborationGroupId
         */
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        /**
         * @return collaboratorUserIds
         */
        public java.util.List<Long> getCollaboratorUserIds() {
            return this.collaboratorUserIds;
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return createdByUserId
         */
        public Long getCreatedByUserId() {
            return this.createdByUserId;
        }

        /**
         * @return creationType
         */
        public String getCreationType() {
            return this.creationType;
        }

        /**
         * @return currentPlanId
         */
        public String getCurrentPlanId() {
            return this.currentPlanId;
        }

        /**
         * @return currentRevision
         */
        public Long getCurrentRevision() {
            return this.currentRevision;
        }

        /**
         * @return currentRunId
         */
        public String getCurrentRunId() {
            return this.currentRunId;
        }

        /**
         * @return currentRunSeq
         */
        public Long getCurrentRunSeq() {
            return this.currentRunSeq;
        }

        /**
         * @return currentStepName
         */
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputVersion
         */
        public Long getInputVersion() {
            return this.inputVersion;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return lastProcessingAt
         */
        public String getLastProcessingAt() {
            return this.lastProcessingAt;
        }

        /**
         * @return legacyTopic
         */
        public Boolean getLegacyTopic() {
            return this.legacyTopic;
        }

        /**
         * @return memberUserIds
         */
        public java.util.List<Long> getMemberUserIds() {
            return this.memberUserIds;
        }

        /**
         * @return modifiedAt
         */
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        /**
         * @return ownerUserId
         */
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return pinned
         */
        public Boolean getPinned() {
            return this.pinned;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return progressCompleted
         */
        public Long getProgressCompleted() {
            return this.progressCompleted;
        }

        /**
         * @return progressTotal
         */
        public Long getProgressTotal() {
            return this.progressTotal;
        }

        /**
         * @return sourceExecutionId
         */
        public String getSourceExecutionId() {
            return this.sourceExecutionId;
        }

        /**
         * @return sourceTaskId
         */
        public String getSourceTaskId() {
            return this.sourceTaskId;
        }

        /**
         * @return sourceTaskName
         */
        public String getSourceTaskName() {
            return this.sourceTaskName;
        }

        /**
         * @return sourceTriggerKey
         */
        public String getSourceTriggerKey() {
            return this.sourceTriggerKey;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return triggerTimezone
         */
        public String getTriggerTimezone() {
            return this.triggerTimezone;
        }

        /**
         * @return triggeredAt
         */
        public String getTriggeredAt() {
            return this.triggeredAt;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        /**
         * @return visibilitySource
         */
        public String getVisibilitySource() {
            return this.visibilitySource;
        }

        /**
         * @return workItemId
         */
        public String getWorkItemId() {
            return this.workItemId;
        }

        /**
         * @return workflowStatus
         */
        public String getWorkflowStatus() {
            return this.workflowStatus;
        }

        /**
         * @return workflowTemplateIds
         */
        public java.util.List<String> getWorkflowTemplateIds() {
            return this.workflowTemplateIds;
        }

        public static final class Builder {
            private String acceptanceCriteria; 
            private Long appliedStatusVersion; 
            private java.util.List<Attachments> attachments; 
            private String businessStatus; 
            private Boolean canDelete; 
            private Boolean canManage; 
            private Boolean canManageVisibility; 
            private Boolean canRename; 
            private String collaborationGroupId; 
            private java.util.List<Long> collaboratorUserIds; 
            private String conversationId; 
            private String createdAt; 
            private Long createdByUserId; 
            private String creationType; 
            private String currentPlanId; 
            private Long currentRevision; 
            private String currentRunId; 
            private Long currentRunSeq; 
            private String currentStepName; 
            private String description; 
            private Long inputVersion; 
            private String itemType; 
            private String lastProcessingAt; 
            private Boolean legacyTopic; 
            private java.util.List<Long> memberUserIds; 
            private String modifiedAt; 
            private Long ownerUserId; 
            private Boolean pinned; 
            private String priority; 
            private Long progressCompleted; 
            private Long progressTotal; 
            private String sourceExecutionId; 
            private String sourceTaskId; 
            private String sourceTaskName; 
            private String sourceTriggerKey; 
            private String sourceType; 
            private String title; 
            private String triggerTimezone; 
            private String triggeredAt; 
            private Long version; 
            private String visibility; 
            private String visibilitySource; 
            private String workItemId; 
            private String workflowStatus; 
            private java.util.List<String> workflowTemplateIds; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.acceptanceCriteria = model.acceptanceCriteria;
                this.appliedStatusVersion = model.appliedStatusVersion;
                this.attachments = model.attachments;
                this.businessStatus = model.businessStatus;
                this.canDelete = model.canDelete;
                this.canManage = model.canManage;
                this.canManageVisibility = model.canManageVisibility;
                this.canRename = model.canRename;
                this.collaborationGroupId = model.collaborationGroupId;
                this.collaboratorUserIds = model.collaboratorUserIds;
                this.conversationId = model.conversationId;
                this.createdAt = model.createdAt;
                this.createdByUserId = model.createdByUserId;
                this.creationType = model.creationType;
                this.currentPlanId = model.currentPlanId;
                this.currentRevision = model.currentRevision;
                this.currentRunId = model.currentRunId;
                this.currentRunSeq = model.currentRunSeq;
                this.currentStepName = model.currentStepName;
                this.description = model.description;
                this.inputVersion = model.inputVersion;
                this.itemType = model.itemType;
                this.lastProcessingAt = model.lastProcessingAt;
                this.legacyTopic = model.legacyTopic;
                this.memberUserIds = model.memberUserIds;
                this.modifiedAt = model.modifiedAt;
                this.ownerUserId = model.ownerUserId;
                this.pinned = model.pinned;
                this.priority = model.priority;
                this.progressCompleted = model.progressCompleted;
                this.progressTotal = model.progressTotal;
                this.sourceExecutionId = model.sourceExecutionId;
                this.sourceTaskId = model.sourceTaskId;
                this.sourceTaskName = model.sourceTaskName;
                this.sourceTriggerKey = model.sourceTriggerKey;
                this.sourceType = model.sourceType;
                this.title = model.title;
                this.triggerTimezone = model.triggerTimezone;
                this.triggeredAt = model.triggeredAt;
                this.version = model.version;
                this.visibility = model.visibility;
                this.visibilitySource = model.visibilitySource;
                this.workItemId = model.workItemId;
                this.workflowStatus = model.workflowStatus;
                this.workflowTemplateIds = model.workflowTemplateIds;
            } 

            /**
             * <p>验收标准</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder acceptanceCriteria(String acceptanceCriteria) {
                this.acceptanceCriteria = acceptanceCriteria;
                return this;
            }

            /**
             * <p>已应用的状态版本</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appliedStatusVersion(Long appliedStatusVersion) {
                this.appliedStatusVersion = appliedStatusVersion;
                return this;
            }

            /**
             * <p>输入附件列表</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder attachments(java.util.List<Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * <p>业务状态（七态）</p>
             * 
             * <strong>example:</strong>
             * <p>PROCESSING</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>调用者是否可删除</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * <p>调用者是否可管理</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canManage(Boolean canManage) {
                this.canManage = canManage;
                return this;
            }

            /**
             * <p>是否可独立调整可见范围</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canManageVisibility(Boolean canManageVisibility) {
                this.canManageVisibility = canManageVisibility;
                return this;
            }

            /**
             * <p>调用者是否可重命名</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canRename(Boolean canRename) {
                this.canRename = canRename;
                return this;
            }

            /**
             * <p>协作空间ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>协作人用户ID列表</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder collaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
                this.collaboratorUserIds = collaboratorUserIds;
                return this;
            }

            /**
             * <p>关联会话ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>创建时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>创建人用户ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createdByUserId(Long createdByUserId) {
                this.createdByUserId = createdByUserId;
                return this;
            }

            /**
             * <p>创建来源：DEFAULT/TASK</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * <p>当前物理计划ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentPlanId(String currentPlanId) {
                this.currentPlanId = currentPlanId;
                return this;
            }

            /**
             * <p>当前修订号</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentRevision(Long currentRevision) {
                this.currentRevision = currentRevision;
                return this;
            }

            /**
             * <p>当前运行ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentRunId(String currentRunId) {
                this.currentRunId = currentRunId;
                return this;
            }

            /**
             * <p>当前运行序号</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentRunSeq(Long currentRunSeq) {
                this.currentRunSeq = currentRunSeq;
                return this;
            }

            /**
             * <p>当前步骤名称</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * <p>描述</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>输入快照版本</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inputVersion(Long inputVersion) {
                this.inputVersion = inputVersion;
                return this;
            }

            /**
             * <p>工作项类型</p>
             * 
             * <strong>example:</strong>
             * <p>WORKFLOW</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>最近进入处理中的时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder lastProcessingAt(String lastProcessingAt) {
                this.lastProcessingAt = lastProcessingAt;
                return this;
            }

            /**
             * <p>是否为兼容期自由探索话题</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder legacyTopic(Boolean legacyTopic) {
                this.legacyTopic = legacyTopic;
                return this;
            }

            /**
             * <p>可见成员用户ID列表</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder memberUserIds(java.util.List<Long> memberUserIds) {
                this.memberUserIds = memberUserIds;
                return this;
            }

            /**
             * <p>修改时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * <p>负责人用户ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ownerUserId(Long ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>调用者个人置顶状态</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder pinned(Boolean pinned) {
                this.pinned = pinned;
                return this;
            }

            /**
             * <p>优先级</p>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>已完成进度</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progressCompleted(Long progressCompleted) {
                this.progressCompleted = progressCompleted;
                return this;
            }

            /**
             * <p>总进度</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progressTotal(Long progressTotal) {
                this.progressTotal = progressTotal;
                return this;
            }

            /**
             * <p>任务执行ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceExecutionId(String sourceExecutionId) {
                this.sourceExecutionId = sourceExecutionId;
                return this;
            }

            /**
             * <p>任务来源ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTaskId(String sourceTaskId) {
                this.sourceTaskId = sourceTaskId;
                return this;
            }

            /**
             * <p>任务来源名称</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTaskName(String sourceTaskName) {
                this.sourceTaskName = sourceTaskName;
                return this;
            }

            /**
             * <p>任务触发键</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTriggerKey(String sourceTriggerKey) {
                this.sourceTriggerKey = sourceTriggerKey;
                return this;
            }

            /**
             * <p>任务来源类型</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>标题</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>任务触发时区</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder triggerTimezone(String triggerTimezone) {
                this.triggerTimezone = triggerTimezone;
                return this;
            }

            /**
             * <p>任务触发时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder triggeredAt(String triggeredAt) {
                this.triggeredAt = triggeredAt;
                return this;
            }

            /**
             * <p>乐观版本号</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * <p>可见范围</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            /**
             * <p>可见范围来源：SELF/TASK/TEMPLATE</p>
             * 
             * <strong>example:</strong>
             * <p>SELF</p>
             */
            public Builder visibilitySource(String visibilitySource) {
                this.visibilitySource = visibilitySource;
                return this;
            }

            /**
             * <p>工作项ID</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workItemId(String workItemId) {
                this.workItemId = workItemId;
                return this;
            }

            /**
             * <p>Workflow四态投影</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workflowStatus(String workflowStatus) {
                this.workflowStatus = workflowStatus;
                return this;
            }

            /**
             * <p>绑定的工作流模板ID列表</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workflowTemplateIds(java.util.List<String> workflowTemplateIds) {
                this.workflowTemplateIds = workflowTemplateIds;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
