// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link DebuggerJob} extends {@link TeaModel}
 *
 * <p>DebuggerJob</p>
 */
public class DebuggerJob extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DebuggerJobId")
    private String debuggerJobId;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtFailedTime")
    private String gmtFailedTime;

    @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @com.aliyun.core.annotation.NameInMap("GmtRunningTime")
    private String gmtRunningTime;

    @com.aliyun.core.annotation.NameInMap("GmtStoppedTime")
    private String gmtStoppedTime;

    @com.aliyun.core.annotation.NameInMap("GmtSubmittedTime")
    private String gmtSubmittedTime;

    @com.aliyun.core.annotation.NameInMap("GmtSucceedTime")
    private String gmtSucceedTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private DebuggerJob(Builder builder) {
        this.debuggerJobId = builder.debuggerJobId;
        this.displayName = builder.displayName;
        this.duration = builder.duration;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFailedTime = builder.gmtFailedTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtRunningTime = builder.gmtRunningTime;
        this.gmtStoppedTime = builder.gmtStoppedTime;
        this.gmtSubmittedTime = builder.gmtSubmittedTime;
        this.gmtSucceedTime = builder.gmtSucceedTime;
        this.status = builder.status;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebuggerJob create() {
        return builder().build();
    }

    /**
     * @return debuggerJobId
     */
    public String getDebuggerJobId() {
        return this.debuggerJobId;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtFailedTime
     */
    public String getGmtFailedTime() {
        return this.gmtFailedTime;
    }

    /**
     * @return gmtFinishTime
     */
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    /**
     * @return gmtRunningTime
     */
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    /**
     * @return gmtStoppedTime
     */
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    /**
     * @return gmtSubmittedTime
     */
    public String getGmtSubmittedTime() {
        return this.gmtSubmittedTime;
    }

    /**
     * @return gmtSucceedTime
     */
    public String getGmtSucceedTime() {
        return this.gmtSucceedTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder {
        private String debuggerJobId; 
        private String displayName; 
        private String duration; 
        private String gmtCreateTime; 
        private String gmtFailedTime; 
        private String gmtFinishTime; 
        private String gmtRunningTime; 
        private String gmtStoppedTime; 
        private String gmtSubmittedTime; 
        private String gmtSucceedTime; 
        private String status; 
        private String userId; 
        private String workspaceId; 
        private String workspaceName; 

        /**
         * DebuggerJobId.
         */
        public Builder debuggerJobId(String debuggerJobId) {
            this.debuggerJobId = debuggerJobId;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtFailedTime.
         */
        public Builder gmtFailedTime(String gmtFailedTime) {
            this.gmtFailedTime = gmtFailedTime;
            return this;
        }

        /**
         * GmtFinishTime.
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * GmtRunningTime.
         */
        public Builder gmtRunningTime(String gmtRunningTime) {
            this.gmtRunningTime = gmtRunningTime;
            return this;
        }

        /**
         * GmtStoppedTime.
         */
        public Builder gmtStoppedTime(String gmtStoppedTime) {
            this.gmtStoppedTime = gmtStoppedTime;
            return this;
        }

        /**
         * GmtSubmittedTime.
         */
        public Builder gmtSubmittedTime(String gmtSubmittedTime) {
            this.gmtSubmittedTime = gmtSubmittedTime;
            return this;
        }

        /**
         * GmtSucceedTime.
         */
        public Builder gmtSucceedTime(String gmtSucceedTime) {
            this.gmtSucceedTime = gmtSucceedTime;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WorkspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public DebuggerJob build() {
            return new DebuggerJob(this);
        } 

    } 

}
