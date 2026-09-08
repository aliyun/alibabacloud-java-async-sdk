// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link WorkloadInfo} extends {@link TeaModel}
 *
 * <p>WorkloadInfo</p>
 */
public class WorkloadInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsScheduled")
    private String isScheduled;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("QueueMetas")
    private java.util.List<QueueMeta> queueMetas;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.NameInMap("WorkloadCreatedTime")
    private String workloadCreatedTime;

    @com.aliyun.core.annotation.NameInMap("WorkloadId")
    private String workloadId;

    @com.aliyun.core.annotation.NameInMap("WorkloadName")
    private String workloadName;

    @com.aliyun.core.annotation.NameInMap("WorkloadStatus")
    private String workloadStatus;

    @com.aliyun.core.annotation.NameInMap("WorkloadType")
    private String workloadType;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private WorkloadInfo(Builder builder) {
        this.isScheduled = builder.isScheduled;
        this.priority = builder.priority;
        this.queueMetas = builder.queueMetas;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.workloadCreatedTime = builder.workloadCreatedTime;
        this.workloadId = builder.workloadId;
        this.workloadName = builder.workloadName;
        this.workloadStatus = builder.workloadStatus;
        this.workloadType = builder.workloadType;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkloadInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isScheduled
     */
    public String getIsScheduled() {
        return this.isScheduled;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return queueMetas
     */
    public java.util.List<QueueMeta> getQueueMetas() {
        return this.queueMetas;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return workloadCreatedTime
     */
    public String getWorkloadCreatedTime() {
        return this.workloadCreatedTime;
    }

    /**
     * @return workloadId
     */
    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @return workloadName
     */
    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * @return workloadStatus
     */
    public String getWorkloadStatus() {
        return this.workloadStatus;
    }

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
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
        private String isScheduled; 
        private Integer priority; 
        private java.util.List<QueueMeta> queueMetas; 
        private String tenantId; 
        private String userId; 
        private String userName; 
        private String workloadCreatedTime; 
        private String workloadId; 
        private String workloadName; 
        private String workloadStatus; 
        private String workloadType; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(WorkloadInfo model) {
            this.isScheduled = model.isScheduled;
            this.priority = model.priority;
            this.queueMetas = model.queueMetas;
            this.tenantId = model.tenantId;
            this.userId = model.userId;
            this.userName = model.userName;
            this.workloadCreatedTime = model.workloadCreatedTime;
            this.workloadId = model.workloadId;
            this.workloadName = model.workloadName;
            this.workloadStatus = model.workloadStatus;
            this.workloadType = model.workloadType;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>Specifies whether the workload is scheduled. Valid values are <code>true</code> and <code>false</code>.</p>
         */
        public Builder isScheduled(String isScheduled) {
            this.isScheduled = isScheduled;
            return this;
        }

        /**
         * <p>The scheduling priority of the workload. A higher value indicates a higher priority.</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>A list of metadata for the queues associated with the workload.</p>
         */
        public Builder queueMetas(java.util.List<QueueMeta> queueMetas) {
            this.queueMetas = queueMetas;
            return this;
        }

        /**
         * <p>The ID of the tenant that contains the workload.</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the user who created the workload.</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The name of the user who created the workload.</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * <p>The creation time of the workload, in UTC format.</p>
         */
        public Builder workloadCreatedTime(String workloadCreatedTime) {
            this.workloadCreatedTime = workloadCreatedTime;
            return this;
        }

        /**
         * <p>The unique, system-generated ID for the workload.</p>
         */
        public Builder workloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }

        /**
         * <p>The user-defined name of the workload.</p>
         */
        public Builder workloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }

        /**
         * <p>The current status of the workload. Possible values include <code>Pending</code>, <code>Running</code>, <code>Succeeded</code>, and <code>Failed</code>.</p>
         */
        public Builder workloadStatus(String workloadStatus) {
            this.workloadStatus = workloadStatus;
            return this;
        }

        /**
         * <p>The type of the workload.</p>
         */
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        /**
         * <p>The ID of the workspace that contains the workload.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the workspace that contains the workload.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public WorkloadInfo build() {
            return new WorkloadInfo(this);
        } 

    } 

}
