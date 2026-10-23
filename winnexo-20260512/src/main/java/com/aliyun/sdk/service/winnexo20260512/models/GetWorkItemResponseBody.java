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
 * {@link GetWorkItemResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkItemResponseBody</p>
 */
public class GetWorkItemResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

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

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

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

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

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

    private GetWorkItemResponseBody(Builder builder) {
        this.acceptanceCriteria = builder.acceptanceCriteria;
        this.appliedStatusVersion = builder.appliedStatusVersion;
        this.attachments = builder.attachments;
        this.businessStatus = builder.businessStatus;
        this.canDelete = builder.canDelete;
        this.canManage = builder.canManage;
        this.canManageVisibility = builder.canManageVisibility;
        this.canRename = builder.canRename;
        this.code = builder.code;
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
        this.message = builder.message;
        this.modifiedAt = builder.modifiedAt;
        this.ownerUserId = builder.ownerUserId;
        this.pinned = builder.pinned;
        this.priority = builder.priority;
        this.progressCompleted = builder.progressCompleted;
        this.progressTotal = builder.progressTotal;
        this.requestId = builder.requestId;
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

    public static GetWorkItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String code; 
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
        private String message; 
        private String modifiedAt; 
        private Long ownerUserId; 
        private Boolean pinned; 
        private String priority; 
        private Long progressCompleted; 
        private Long progressTotal; 
        private String requestId; 
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

        private Builder(GetWorkItemResponseBody model) {
            this.acceptanceCriteria = model.acceptanceCriteria;
            this.appliedStatusVersion = model.appliedStatusVersion;
            this.attachments = model.attachments;
            this.businessStatus = model.businessStatus;
            this.canDelete = model.canDelete;
            this.canManage = model.canManage;
            this.canManageVisibility = model.canManageVisibility;
            this.canRename = model.canRename;
            this.code = model.code;
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
            this.message = model.message;
            this.modifiedAt = model.modifiedAt;
            this.ownerUserId = model.ownerUserId;
            this.pinned = model.pinned;
            this.priority = model.priority;
            this.progressCompleted = model.progressCompleted;
            this.progressTotal = model.progressTotal;
            this.requestId = model.requestId;
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
         * <p>Indicates whether the caller can delete the work item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder canDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }

        /**
         * <p>Indicates whether the caller can manage the work item.</p>
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
         * <p>Indicates whether the caller can rename the work item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder canRename(Boolean canRename) {
            this.canRename = canRename;
            return this;
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
         * <p>The ID of the collaboration space.</p>
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
         * <p>The ID of the associated session.</p>
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
         * <p>The creation source. Valid values: DEFAULT, TASK.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder creationType(String creationType) {
            this.creationType = creationType;
            return this;
        }

        /**
         * <p>The ID of the current physical plan.</p>
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
         * <p>The ID of the current run.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder currentRunId(String currentRunId) {
            this.currentRunId = currentRunId;
            return this;
        }

        /**
         * <p>The sequence number of the current run.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentRunSeq(Long currentRunSeq) {
            this.currentRunSeq = currentRunSeq;
            return this;
        }

        /**
         * <p>The name of the current step.</p>
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
         * <p>The type of the work item.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        public Builder itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>The time when the work item last entered the processing state, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder lastProcessingAt(String lastProcessingAt) {
            this.lastProcessingAt = lastProcessingAt;
            return this;
        }

        /**
         * <p>Indicates whether it is a legacy free exploration topic.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder legacyTopic(Boolean legacyTopic) {
            this.legacyTopic = legacyTopic;
            return this;
        }

        /**
         * <p>The list of user IDs of the visible members.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder memberUserIds(java.util.List<Long> memberUserIds) {
            this.memberUserIds = memberUserIds;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>The personal pin status for the caller.</p>
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
         * <p>The execution ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceExecutionId(String sourceExecutionId) {
            this.sourceExecutionId = sourceExecutionId;
            return this;
        }

        /**
         * <p>The source ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceTaskId(String sourceTaskId) {
            this.sourceTaskId = sourceTaskId;
            return this;
        }

        /**
         * <p>The source name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceTaskName(String sourceTaskName) {
            this.sourceTaskName = sourceTaskName;
            return this;
        }

        /**
         * <p>The trigger key of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceTriggerKey(String sourceTriggerKey) {
            this.sourceTriggerKey = sourceTriggerKey;
            return this;
        }

        /**
         * <p>The source type of the task.</p>
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
         * <p>The trigger time of the task, in ISO 8601 format.</p>
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
         * <p>The source of the visibility scope. Valid values: SELF, TASK, TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF</p>
         */
        public Builder visibilitySource(String visibilitySource) {
            this.visibilitySource = visibilitySource;
            return this;
        }

        /**
         * <p>The ID of the work item.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder workItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }

        /**
         * <p>The four-state projection of the workflow status.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder workflowStatus(String workflowStatus) {
            this.workflowStatus = workflowStatus;
            return this;
        }

        /**
         * <p>The list of IDs of the bound workflow templates.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder workflowTemplateIds(java.util.List<String> workflowTemplateIds) {
            this.workflowTemplateIds = workflowTemplateIds;
            return this;
        }

        public GetWorkItemResponseBody build() {
            return new GetWorkItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemResponseBody</p>
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
             * <p>The ID of the attachment.</p>
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
             * <p>The access URL for the attachment (prefixed with an OpenAPI 302 redirect).</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder refUrl(String refUrl) {
                this.refUrl = refUrl;
                return this;
            }

            /**
             * <p>The resource ID of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * <p>The size of the attachment in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>The title of the attachment.</p>
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
}
