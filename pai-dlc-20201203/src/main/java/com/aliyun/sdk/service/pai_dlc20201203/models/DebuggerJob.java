// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebuggerJob} extends {@link TeaModel}
 *
 * <p>DebuggerJob</p>
 */
public class DebuggerJob extends TeaModel {
    @NameInMap("DebuggerJobId")
    private String debuggerJobId;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("Duration")
    private String duration;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtFailedTime")
    private String gmtFailedTime;

    @NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @NameInMap("GmtRunningTime")
    private String gmtRunningTime;

    @NameInMap("GmtStoppedTime")
    private String gmtStoppedTime;

    @NameInMap("GmtSubmittedTime")
    private String gmtSubmittedTime;

    @NameInMap("GmtSucceedTime")
    private String gmtSucceedTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    @NameInMap("WorkspaceName")
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
         * debugger分析作业ID
         */
        public Builder debuggerJobId(String debuggerJobId) {
            this.debuggerJobId = debuggerJobId;
            return this;
        }

        /**
         * 作业显示名
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * 作业运行的时长（单位秒）
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * 创建时间（UTC）
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * 失败时间（UTC）
         */
        public Builder gmtFailedTime(String gmtFailedTime) {
            this.gmtFailedTime = gmtFailedTime;
            return this;
        }

        /**
         * 任务完成时间（UTC）
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * 运行开始时间（UTC）
         */
        public Builder gmtRunningTime(String gmtRunningTime) {
            this.gmtRunningTime = gmtRunningTime;
            return this;
        }

        /**
         * 结束时间（UTC）
         */
        public Builder gmtStoppedTime(String gmtStoppedTime) {
            this.gmtStoppedTime = gmtStoppedTime;
            return this;
        }

        /**
         * 提交时间（UTC）
         */
        public Builder gmtSubmittedTime(String gmtSubmittedTime) {
            this.gmtSubmittedTime = gmtSubmittedTime;
            return this;
        }

        /**
         * 成功结束时间（UTC）
         */
        public Builder gmtSucceedTime(String gmtSucceedTime) {
            this.gmtSucceedTime = gmtSucceedTime;
            return this;
        }

        /**
         * 作业运行状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 用户ID
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * 作业所属的运行工作空间
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * 作业所属的运行工作空间名称
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
