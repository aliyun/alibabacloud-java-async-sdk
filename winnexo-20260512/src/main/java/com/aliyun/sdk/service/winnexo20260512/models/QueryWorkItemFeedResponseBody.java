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
 * {@link QueryWorkItemFeedResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWorkItemFeedResponseBody</p>
 */
public class QueryWorkItemFeedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("entries")
    private java.util.List<Entries> entries;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private String nextCursor;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scopeCounts")
    private java.util.Map<String, ?> scopeCounts;

    @com.aliyun.core.annotation.NameInMap("statusCounts")
    private java.util.Map<String, ?> statusCounts;

    @com.aliyun.core.annotation.NameInMap("totalEntryCount")
    private Long totalEntryCount;

    @com.aliyun.core.annotation.NameInMap("totalWorkItemCount")
    private Long totalWorkItemCount;

    private QueryWorkItemFeedResponseBody(Builder builder) {
        this.code = builder.code;
        this.entries = builder.entries;
        this.hasMore = builder.hasMore;
        this.message = builder.message;
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
        this.scopeCounts = builder.scopeCounts;
        this.statusCounts = builder.statusCounts;
        this.totalEntryCount = builder.totalEntryCount;
        this.totalWorkItemCount = builder.totalWorkItemCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorkItemFeedResponseBody create() {
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
     * @return entries
     */
    public java.util.List<Entries> getEntries() {
        return this.entries;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextCursor
     */
    public String getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scopeCounts
     */
    public java.util.Map<String, ?> getScopeCounts() {
        return this.scopeCounts;
    }

    /**
     * @return statusCounts
     */
    public java.util.Map<String, ?> getStatusCounts() {
        return this.statusCounts;
    }

    /**
     * @return totalEntryCount
     */
    public Long getTotalEntryCount() {
        return this.totalEntryCount;
    }

    /**
     * @return totalWorkItemCount
     */
    public Long getTotalWorkItemCount() {
        return this.totalWorkItemCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Entries> entries; 
        private Boolean hasMore; 
        private String message; 
        private String nextCursor; 
        private String requestId; 
        private java.util.Map<String, ?> scopeCounts; 
        private java.util.Map<String, ?> statusCounts; 
        private Long totalEntryCount; 
        private Long totalWorkItemCount; 

        private Builder() {
        } 

        private Builder(QueryWorkItemFeedResponseBody model) {
            this.code = model.code;
            this.entries = model.entries;
            this.hasMore = model.hasMore;
            this.message = model.message;
            this.nextCursor = model.nextCursor;
            this.requestId = model.requestId;
            this.scopeCounts = model.scopeCounts;
            this.statusCounts = model.statusCounts;
            this.totalEntryCount = model.totalEntryCount;
            this.totalWorkItemCount = model.totalWorkItemCount;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The entries on the current page. The entryType determines the effective fields: WORK_ITEM maps to item, and TASK_GROUP maps to aggregation fields.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder entries(java.util.List<Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * <p>Indicates whether more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The cursor for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of items in the visible pool by personal scope.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder scopeCounts(java.util.Map<String, ?> scopeCounts) {
            this.scopeCounts = scopeCounts;
            return this;
        }

        /**
         * <p>The number of items in the visible pool by business status.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder statusCounts(java.util.Map<String, ?> statusCounts) {
            this.statusCounts = statusCounts;
            return this;
        }

        /**
         * <p>The total number of entries in the visible pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalEntryCount(Long totalEntryCount) {
            this.totalEntryCount = totalEntryCount;
            return this;
        }

        /**
         * <p>The total number of work items in the visible pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalWorkItemCount(Long totalWorkItemCount) {
            this.totalWorkItemCount = totalWorkItemCount;
            return this;
        }

        public QueryWorkItemFeedResponseBody build() {
            return new QueryWorkItemFeedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryWorkItemFeedResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkItemFeedResponseBody</p>
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
             * <p>The attachment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * <p>The content type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The access URL of the attachment (prefixed with an OpenAPI 302 redirect).</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder refUrl(String refUrl) {
                this.refUrl = refUrl;
                return this;
            }

            /**
             * <p>The attachment resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The attachment resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * <p>The attachment size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>The attachment title.</p>
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
     * {@link QueryWorkItemFeedResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkItemFeedResponseBody</p>
     */
    public static class Item extends TeaModel {
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

        private Item(Builder builder) {
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

        public static Item create() {
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

            private Builder(Item model) {
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
             * <p>The acceptance criteria.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder acceptanceCriteria(String acceptanceCriteria) {
                this.acceptanceCriteria = acceptanceCriteria;
                return this;
            }

            /**
             * <p>The applied status version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appliedStatusVersion(Long appliedStatusVersion) {
                this.appliedStatusVersion = appliedStatusVersion;
                return this;
            }

            /**
             * <p>The list of input attachments.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder attachments(java.util.List<Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * <p>The business status (seven states).</p>
             * 
             * <strong>example:</strong>
             * <p>PROCESSING</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>Indicates whether the caller can delete the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * <p>Indicates whether the caller can manage the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canManage(Boolean canManage) {
                this.canManage = canManage;
                return this;
            }

            /**
             * <p>Indicates whether the visibility scope can be adjusted independently.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canManageVisibility(Boolean canManageVisibility) {
                this.canManageVisibility = canManageVisibility;
                return this;
            }

            /**
             * <p>Indicates whether the caller can rename the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canRename(Boolean canRename) {
                this.canRename = canRename;
                return this;
            }

            /**
             * <p>The collaboration workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>The list of user IDs of the collaborators.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder collaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
                this.collaboratorUserIds = collaboratorUserIds;
                return this;
            }

            /**
             * <p>The associated conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The creation time, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createdByUserId(Long createdByUserId) {
                this.createdByUserId = createdByUserId;
                return this;
            }

            /**
             * <p>The creation source. Valid values: DEFAULT and TASK.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * <p>The current physical plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentPlanId(String currentPlanId) {
                this.currentPlanId = currentPlanId;
                return this;
            }

            /**
             * <p>The current revision number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentRevision(Long currentRevision) {
                this.currentRevision = currentRevision;
                return this;
            }

            /**
             * <p>The current run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentRunId(String currentRunId) {
                this.currentRunId = currentRunId;
                return this;
            }

            /**
             * <p>The current run sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentRunSeq(Long currentRunSeq) {
                this.currentRunSeq = currentRunSeq;
                return this;
            }

            /**
             * <p>The current step name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The input snapshot version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inputVersion(Long inputVersion) {
                this.inputVersion = inputVersion;
                return this;
            }

            /**
             * <p>The work item type.</p>
             * 
             * <strong>example:</strong>
             * <p>WORKFLOW</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>The time when the item last entered the processing state, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder lastProcessingAt(String lastProcessingAt) {
                this.lastProcessingAt = lastProcessingAt;
                return this;
            }

            /**
             * <p>Indicates whether the topic is a free exploration topic during the compatibility period.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder legacyTopic(Boolean legacyTopic) {
                this.legacyTopic = legacyTopic;
                return this;
            }

            /**
             * <p>The list of user IDs of visible members.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder memberUserIds(java.util.List<Long> memberUserIds) {
                this.memberUserIds = memberUserIds;
                return this;
            }

            /**
             * <p>The modification time, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * <p>The user ID of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ownerUserId(Long ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The pinned status for the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder pinned(Boolean pinned) {
                this.pinned = pinned;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The completed progress.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progressCompleted(Long progressCompleted) {
                this.progressCompleted = progressCompleted;
                return this;
            }

            /**
             * <p>The total progress.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progressTotal(Long progressTotal) {
                this.progressTotal = progressTotal;
                return this;
            }

            /**
             * <p>The task execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceExecutionId(String sourceExecutionId) {
                this.sourceExecutionId = sourceExecutionId;
                return this;
            }

            /**
             * <p>The task source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTaskId(String sourceTaskId) {
                this.sourceTaskId = sourceTaskId;
                return this;
            }

            /**
             * <p>The task source name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTaskName(String sourceTaskName) {
                this.sourceTaskName = sourceTaskName;
                return this;
            }

            /**
             * <p>The task trigger key.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTriggerKey(String sourceTriggerKey) {
                this.sourceTriggerKey = sourceTriggerKey;
                return this;
            }

            /**
             * <p>The task source type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The time zone when the task is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder triggerTimezone(String triggerTimezone) {
                this.triggerTimezone = triggerTimezone;
                return this;
            }

            /**
             * <p>The task trigger time, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder triggeredAt(String triggeredAt) {
                this.triggeredAt = triggeredAt;
                return this;
            }

            /**
             * <p>The optimistic version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The visibility scope.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            /**
             * <p>The source of the visibility scope. Valid values: SELF, TASK, and TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>SELF</p>
             */
            public Builder visibilitySource(String visibilitySource) {
                this.visibilitySource = visibilitySource;
                return this;
            }

            /**
             * <p>The work item ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workItemId(String workItemId) {
                this.workItemId = workItemId;
                return this;
            }

            /**
             * <p>The workflow status projection (four states).</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workflowStatus(String workflowStatus) {
                this.workflowStatus = workflowStatus;
                return this;
            }

            /**
             * <p>The list of bound workflow template IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workflowTemplateIds(java.util.List<String> workflowTemplateIds) {
                this.workflowTemplateIds = workflowTemplateIds;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryWorkItemFeedResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkItemFeedResponseBody</p>
     */
    public static class ItemsAttachments extends TeaModel {
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

        private ItemsAttachments(Builder builder) {
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

        public static ItemsAttachments create() {
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

            private Builder(ItemsAttachments model) {
                this.attachmentId = model.attachmentId;
                this.contentType = model.contentType;
                this.refUrl = model.refUrl;
                this.resourceId = model.resourceId;
                this.resourceKind = model.resourceKind;
                this.sizeBytes = model.sizeBytes;
                this.title = model.title;
            } 

            /**
             * <p>The attachment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * <p>The content type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The access URL of the attachment (prefixed with an OpenAPI 302 redirect).</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder refUrl(String refUrl) {
                this.refUrl = refUrl;
                return this;
            }

            /**
             * <p>The attachment resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The attachment resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * <p>The attachment size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>The attachment title.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ItemsAttachments build() {
                return new ItemsAttachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryWorkItemFeedResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkItemFeedResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acceptanceCriteria")
        private String acceptanceCriteria;

        @com.aliyun.core.annotation.NameInMap("appliedStatusVersion")
        private Long appliedStatusVersion;

        @com.aliyun.core.annotation.NameInMap("attachments")
        private java.util.List<ItemsAttachments> attachments;

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
        public java.util.List<ItemsAttachments> getAttachments() {
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
            private java.util.List<ItemsAttachments> attachments; 
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
             * <p>The acceptance criteria.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder acceptanceCriteria(String acceptanceCriteria) {
                this.acceptanceCriteria = acceptanceCriteria;
                return this;
            }

            /**
             * <p>The applied status version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appliedStatusVersion(Long appliedStatusVersion) {
                this.appliedStatusVersion = appliedStatusVersion;
                return this;
            }

            /**
             * <p>The list of input attachments.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder attachments(java.util.List<ItemsAttachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * <p>The business status (seven states).</p>
             * 
             * <strong>example:</strong>
             * <p>PROCESSING</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>Indicates whether the caller can delete the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * <p>Indicates whether the caller can manage the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canManage(Boolean canManage) {
                this.canManage = canManage;
                return this;
            }

            /**
             * <p>Indicates whether the visibility scope can be adjusted independently.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canManageVisibility(Boolean canManageVisibility) {
                this.canManageVisibility = canManageVisibility;
                return this;
            }

            /**
             * <p>Indicates whether the caller can rename the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canRename(Boolean canRename) {
                this.canRename = canRename;
                return this;
            }

            /**
             * <p>The collaboration workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>The list of user IDs of the collaborators.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder collaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
                this.collaboratorUserIds = collaboratorUserIds;
                return this;
            }

            /**
             * <p>The associated conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The creation time, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createdByUserId(Long createdByUserId) {
                this.createdByUserId = createdByUserId;
                return this;
            }

            /**
             * <p>The creation source. Valid values: DEFAULT and TASK.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * <p>The current physical plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentPlanId(String currentPlanId) {
                this.currentPlanId = currentPlanId;
                return this;
            }

            /**
             * <p>The current revision number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentRevision(Long currentRevision) {
                this.currentRevision = currentRevision;
                return this;
            }

            /**
             * <p>The current run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentRunId(String currentRunId) {
                this.currentRunId = currentRunId;
                return this;
            }

            /**
             * <p>The current run sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentRunSeq(Long currentRunSeq) {
                this.currentRunSeq = currentRunSeq;
                return this;
            }

            /**
             * <p>The current step name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder currentStepName(String currentStepName) {
                this.currentStepName = currentStepName;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The input snapshot version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inputVersion(Long inputVersion) {
                this.inputVersion = inputVersion;
                return this;
            }

            /**
             * <p>The work item type.</p>
             * 
             * <strong>example:</strong>
             * <p>WORKFLOW</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>The time when the item last entered the processing state, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder lastProcessingAt(String lastProcessingAt) {
                this.lastProcessingAt = lastProcessingAt;
                return this;
            }

            /**
             * <p>Indicates whether the topic is a free exploration topic during the compatibility period.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder legacyTopic(Boolean legacyTopic) {
                this.legacyTopic = legacyTopic;
                return this;
            }

            /**
             * <p>The list of user IDs of visible members.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder memberUserIds(java.util.List<Long> memberUserIds) {
                this.memberUserIds = memberUserIds;
                return this;
            }

            /**
             * <p>The modification time, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * <p>The user ID of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ownerUserId(Long ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The pinned status for the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder pinned(Boolean pinned) {
                this.pinned = pinned;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The completed progress.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progressCompleted(Long progressCompleted) {
                this.progressCompleted = progressCompleted;
                return this;
            }

            /**
             * <p>The total progress.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progressTotal(Long progressTotal) {
                this.progressTotal = progressTotal;
                return this;
            }

            /**
             * <p>The task execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceExecutionId(String sourceExecutionId) {
                this.sourceExecutionId = sourceExecutionId;
                return this;
            }

            /**
             * <p>The task source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTaskId(String sourceTaskId) {
                this.sourceTaskId = sourceTaskId;
                return this;
            }

            /**
             * <p>The task source name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTaskName(String sourceTaskName) {
                this.sourceTaskName = sourceTaskName;
                return this;
            }

            /**
             * <p>The task trigger key.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTriggerKey(String sourceTriggerKey) {
                this.sourceTriggerKey = sourceTriggerKey;
                return this;
            }

            /**
             * <p>The task source type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The time zone when the task is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder triggerTimezone(String triggerTimezone) {
                this.triggerTimezone = triggerTimezone;
                return this;
            }

            /**
             * <p>The task trigger time, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder triggeredAt(String triggeredAt) {
                this.triggeredAt = triggeredAt;
                return this;
            }

            /**
             * <p>The optimistic version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The visibility scope.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            /**
             * <p>The source of the visibility scope. Valid values: SELF, TASK, and TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>SELF</p>
             */
            public Builder visibilitySource(String visibilitySource) {
                this.visibilitySource = visibilitySource;
                return this;
            }

            /**
             * <p>The work item ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workItemId(String workItemId) {
                this.workItemId = workItemId;
                return this;
            }

            /**
             * <p>The workflow status projection (four states).</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workflowStatus(String workflowStatus) {
                this.workflowStatus = workflowStatus;
                return this;
            }

            /**
             * <p>The list of bound workflow template IDs.</p>
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
    /**
     * 
     * {@link QueryWorkItemFeedResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkItemFeedResponseBody</p>
     */
    public static class Entries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entryType")
        private String entryType;

        @com.aliyun.core.annotation.NameInMap("hasMoreChildren")
        private Boolean hasMoreChildren;

        @com.aliyun.core.annotation.NameInMap("item")
        private Item item;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("latestWorkItemAt")
        private String latestWorkItemAt;

        @com.aliyun.core.annotation.NameInMap("matchedWorkItemCount")
        private Long matchedWorkItemCount;

        @com.aliyun.core.annotation.NameInMap("sourceTaskId")
        private String sourceTaskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        private Entries(Builder builder) {
            this.entryType = builder.entryType;
            this.hasMoreChildren = builder.hasMoreChildren;
            this.item = builder.item;
            this.items = builder.items;
            this.latestWorkItemAt = builder.latestWorkItemAt;
            this.matchedWorkItemCount = builder.matchedWorkItemCount;
            this.sourceTaskId = builder.sourceTaskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return entryType
         */
        public String getEntryType() {
            return this.entryType;
        }

        /**
         * @return hasMoreChildren
         */
        public Boolean getHasMoreChildren() {
            return this.hasMoreChildren;
        }

        /**
         * @return item
         */
        public Item getItem() {
            return this.item;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return latestWorkItemAt
         */
        public String getLatestWorkItemAt() {
            return this.latestWorkItemAt;
        }

        /**
         * @return matchedWorkItemCount
         */
        public Long getMatchedWorkItemCount() {
            return this.matchedWorkItemCount;
        }

        /**
         * @return sourceTaskId
         */
        public String getSourceTaskId() {
            return this.sourceTaskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String entryType; 
            private Boolean hasMoreChildren; 
            private Item item; 
            private java.util.List<Items> items; 
            private String latestWorkItemAt; 
            private Long matchedWorkItemCount; 
            private String sourceTaskId; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(Entries model) {
                this.entryType = model.entryType;
                this.hasMoreChildren = model.hasMoreChildren;
                this.item = model.item;
                this.items = model.items;
                this.latestWorkItemAt = model.latestWorkItemAt;
                this.matchedWorkItemCount = model.matchedWorkItemCount;
                this.sourceTaskId = model.sourceTaskId;
                this.taskName = model.taskName;
            } 

            /**
             * <p>The entry type.</p>
             * 
             * <strong>example:</strong>
             * <p>WORK_ITEM</p>
             */
            public Builder entryType(String entryType) {
                this.entryType = entryType;
                return this;
            }

            /**
             * <p>Indicates whether more child items are available.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMoreChildren(Boolean hasMoreChildren) {
                this.hasMoreChildren = hasMoreChildren;
                return this;
            }

            /**
             * <p>The content of a regular work item row.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder item(Item item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The latest five work items in the task aggregation row.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The time of the latest work item, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder latestWorkItemAt(String latestWorkItemAt) {
                this.latestWorkItemAt = latestWorkItemAt;
                return this;
            }

            /**
             * <p>The total number of matched work items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchedWorkItemCount(Long matchedWorkItemCount) {
                this.matchedWorkItemCount = matchedWorkItemCount;
                return this;
            }

            /**
             * <p>The source task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceTaskId(String sourceTaskId) {
                this.sourceTaskId = sourceTaskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}
