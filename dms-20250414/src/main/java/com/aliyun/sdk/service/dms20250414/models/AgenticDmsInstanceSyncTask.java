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
 * {@link AgenticDmsInstanceSyncTask} extends {@link TeaModel}
 *
 * <p>AgenticDmsInstanceSyncTask</p>
 */
public class AgenticDmsInstanceSyncTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActorId")
    private String actorId;

    @com.aliyun.core.annotation.NameInMap("ActorName")
    private String actorName;

    @com.aliyun.core.annotation.NameInMap("ActorType")
    private String actorType;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorSummary")
    private String errorSummary;

    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("OperatorMode")
    private String operatorMode;

    @com.aliyun.core.annotation.NameInMap("RequestedOperatorMode")
    private String requestedOperatorMode;

    @com.aliyun.core.annotation.NameInMap("SkippedCount")
    private Integer skippedCount;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("SyncUserDataPermission")
    private Boolean syncUserDataPermission;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private AgenticDmsInstanceSyncTask(Builder builder) {
        this.actorId = builder.actorId;
        this.actorName = builder.actorName;
        this.actorType = builder.actorType;
        this.errorCode = builder.errorCode;
        this.errorSummary = builder.errorSummary;
        this.failedCount = builder.failedCount;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.operatorMode = builder.operatorMode;
        this.requestedOperatorMode = builder.requestedOperatorMode;
        this.skippedCount = builder.skippedCount;
        this.status = builder.status;
        this.successCount = builder.successCount;
        this.syncUserDataPermission = builder.syncUserDataPermission;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticDmsInstanceSyncTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actorId
     */
    public String getActorId() {
        return this.actorId;
    }

    /**
     * @return actorName
     */
    public String getActorName() {
        return this.actorName;
    }

    /**
     * @return actorType
     */
    public String getActorType() {
        return this.actorType;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorSummary
     */
    public String getErrorSummary() {
        return this.errorSummary;
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return operatorMode
     */
    public String getOperatorMode() {
        return this.operatorMode;
    }

    /**
     * @return requestedOperatorMode
     */
    public String getRequestedOperatorMode() {
        return this.requestedOperatorMode;
    }

    /**
     * @return skippedCount
     */
    public Integer getSkippedCount() {
        return this.skippedCount;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return syncUserDataPermission
     */
    public Boolean getSyncUserDataPermission() {
        return this.syncUserDataPermission;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String actorId; 
        private String actorName; 
        private String actorType; 
        private String errorCode; 
        private String errorSummary; 
        private Integer failedCount; 
        private String gmtCreate; 
        private String gmtModified; 
        private String operatorMode; 
        private String requestedOperatorMode; 
        private Integer skippedCount; 
        private String status; 
        private Integer successCount; 
        private Boolean syncUserDataPermission; 
        private String taskId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(AgenticDmsInstanceSyncTask model) {
            this.actorId = model.actorId;
            this.actorName = model.actorName;
            this.actorType = model.actorType;
            this.errorCode = model.errorCode;
            this.errorSummary = model.errorSummary;
            this.failedCount = model.failedCount;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.operatorMode = model.operatorMode;
            this.requestedOperatorMode = model.requestedOperatorMode;
            this.skippedCount = model.skippedCount;
            this.status = model.status;
            this.successCount = model.successCount;
            this.syncUserDataPermission = model.syncUserDataPermission;
            this.taskId = model.taskId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ActorId.
         */
        public Builder actorId(String actorId) {
            this.actorId = actorId;
            return this;
        }

        /**
         * ActorName.
         */
        public Builder actorName(String actorName) {
            this.actorName = actorName;
            return this;
        }

        /**
         * ActorType.
         */
        public Builder actorType(String actorType) {
            this.actorType = actorType;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorSummary.
         */
        public Builder errorSummary(String errorSummary) {
            this.errorSummary = errorSummary;
            return this;
        }

        /**
         * FailedCount.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * OperatorMode.
         */
        public Builder operatorMode(String operatorMode) {
            this.operatorMode = operatorMode;
            return this;
        }

        /**
         * RequestedOperatorMode.
         */
        public Builder requestedOperatorMode(String requestedOperatorMode) {
            this.requestedOperatorMode = requestedOperatorMode;
            return this;
        }

        /**
         * SkippedCount.
         */
        public Builder skippedCount(Integer skippedCount) {
            this.skippedCount = skippedCount;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * SyncUserDataPermission.
         */
        public Builder syncUserDataPermission(Boolean syncUserDataPermission) {
            this.syncUserDataPermission = syncUserDataPermission;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public AgenticDmsInstanceSyncTask build() {
            return new AgenticDmsInstanceSyncTask(this);
        } 

    } 

}
