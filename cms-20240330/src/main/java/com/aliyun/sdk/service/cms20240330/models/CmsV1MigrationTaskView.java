// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CmsV1MigrationTaskView} extends {@link TeaModel}
 *
 * <p>CmsV1MigrationTaskView</p>
 */
public class CmsV1MigrationTaskView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("batchId")
    private String batchId;

    @com.aliyun.core.annotation.NameInMap("canRecover")
    private Boolean canRecover;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("observeGroupId")
    private String observeGroupId;

    @com.aliyun.core.annotation.NameInMap("originGroupId")
    private String originGroupId;

    @com.aliyun.core.annotation.NameInMap("sourceReadOnly")
    private Boolean sourceReadOnly;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("takeoverStage")
    private String takeoverStage;

    @com.aliyun.core.annotation.NameInMap("targetGroupName")
    private String targetGroupName;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private CmsV1MigrationTaskView(Builder builder) {
        this.batchId = builder.batchId;
        this.canRecover = builder.canRecover;
        this.errorMessage = builder.errorMessage;
        this.groupName = builder.groupName;
        this.observeGroupId = builder.observeGroupId;
        this.originGroupId = builder.originGroupId;
        this.sourceReadOnly = builder.sourceReadOnly;
        this.status = builder.status;
        this.takeoverStage = builder.takeoverStage;
        this.targetGroupName = builder.targetGroupName;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CmsV1MigrationTaskView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return canRecover
     */
    public Boolean getCanRecover() {
        return this.canRecover;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return observeGroupId
     */
    public String getObserveGroupId() {
        return this.observeGroupId;
    }

    /**
     * @return originGroupId
     */
    public String getOriginGroupId() {
        return this.originGroupId;
    }

    /**
     * @return sourceReadOnly
     */
    public Boolean getSourceReadOnly() {
        return this.sourceReadOnly;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return takeoverStage
     */
    public String getTakeoverStage() {
        return this.takeoverStage;
    }

    /**
     * @return targetGroupName
     */
    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String batchId; 
        private Boolean canRecover; 
        private String errorMessage; 
        private String groupName; 
        private String observeGroupId; 
        private String originGroupId; 
        private Boolean sourceReadOnly; 
        private String status; 
        private String takeoverStage; 
        private String targetGroupName; 
        private Long taskId; 

        private Builder() {
        } 

        private Builder(CmsV1MigrationTaskView model) {
            this.batchId = model.batchId;
            this.canRecover = model.canRecover;
            this.errorMessage = model.errorMessage;
            this.groupName = model.groupName;
            this.observeGroupId = model.observeGroupId;
            this.originGroupId = model.originGroupId;
            this.sourceReadOnly = model.sourceReadOnly;
            this.status = model.status;
            this.takeoverStage = model.takeoverStage;
            this.targetGroupName = model.targetGroupName;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The migration batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00112233-4455-4677-8899-aabbccddeeff</p>
         */
        public Builder batchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>Indicates whether to provide a recovery prompt for existing frozen tasks. This field does not grant authorization. Each recovery re-verifies the original bindings. Tasks with the SUCCESS status are not retried.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder canRecover(Boolean canRecover) {
            this.canRecover = canRecover;
            return this;
        }

        /**
         * <p>The task failure description.</p>
         * 
         * <strong>example:</strong>
         * <p>UNSUPPORTED_RESOURCE: source members cannot be translated without loss</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The source application group name.</p>
         * 
         * <strong>example:</strong>
         * <p>order-service</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The target observation group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>og-0123456789abcdef</p>
         */
        public Builder observeGroupId(String observeGroupId) {
            this.observeGroupId = observeGroupId;
            return this;
        }

        /**
         * <p>The source CloudMonitor 1.0 application group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>247675311</p>
         */
        public Builder originGroupId(String originGroupId) {
            this.originGroupId = originGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the source 1.0 group is persistently set to read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sourceReadOnly(Boolean sourceReadOnly) {
            this.sourceReadOnly = sourceReadOnly;
            return this;
        }

        /**
         * <p>The migration task status. Valid values: PENDING, RUNNING, SUCCESS, SKIPPED, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The takeover stage. Valid values: PENDING, SOURCE_LOCKED, TARGET_CREATED, READ_ONLY, and NEEDS_REVIEW.</p>
         * 
         * <strong>example:</strong>
         * <p>SOURCE_LOCKED</p>
         */
        public Builder takeoverStage(String takeoverStage) {
            this.takeoverStage = takeoverStage;
            return this;
        }

        /**
         * <p>The target observation group name.</p>
         * 
         * <strong>example:</strong>
         * <p>order-service</p>
         */
        public Builder targetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }

        /**
         * <p>The migration task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public CmsV1MigrationTaskView build() {
            return new CmsV1MigrationTaskView(this);
        } 

    } 

}
