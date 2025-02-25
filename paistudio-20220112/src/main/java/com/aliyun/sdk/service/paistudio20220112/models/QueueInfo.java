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
 * {@link QueueInfo} extends {@link TeaModel}
 *
 * <p>QueueInfo</p>
 */
public class QueueInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CodeType")
    private String codeType;

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtDequeuedTime")
    private String gmtDequeuedTime;

    @com.aliyun.core.annotation.NameInMap("GmtEnqueuedTime")
    private String gmtEnqueuedTime;

    @com.aliyun.core.annotation.NameInMap("GmtPositionModifiedTime")
    private String gmtPositionModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Position")
    private Long position;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.NameInMap("QueueStrategy")
    private String queueStrategy;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private ResourceAmount resource;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

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

    private QueueInfo(Builder builder) {
        this.code = builder.code;
        this.codeType = builder.codeType;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtDequeuedTime = builder.gmtDequeuedTime;
        this.gmtEnqueuedTime = builder.gmtEnqueuedTime;
        this.gmtPositionModifiedTime = builder.gmtPositionModifiedTime;
        this.name = builder.name;
        this.position = builder.position;
        this.priority = builder.priority;
        this.queueStrategy = builder.queueStrategy;
        this.quotaId = builder.quotaId;
        this.reason = builder.reason;
        this.resource = builder.resource;
        this.status = builder.status;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.workloadId = builder.workloadId;
        this.workloadName = builder.workloadName;
        this.workloadStatus = builder.workloadStatus;
        this.workloadType = builder.workloadType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueueInfo create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeType
     */
    public String getCodeType() {
        return this.codeType;
    }

    /**
     * @return gmtCreatedTime
     */
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    /**
     * @return gmtDequeuedTime
     */
    public String getGmtDequeuedTime() {
        return this.gmtDequeuedTime;
    }

    /**
     * @return gmtEnqueuedTime
     */
    public String getGmtEnqueuedTime() {
        return this.gmtEnqueuedTime;
    }

    /**
     * @return gmtPositionModifiedTime
     */
    public String getGmtPositionModifiedTime() {
        return this.gmtPositionModifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return position
     */
    public Long getPosition() {
        return this.position;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * @return queueStrategy
     */
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return resource
     */
    public ResourceAmount getResource() {
        return this.resource;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
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

    public static final class Builder {
        private String code; 
        private String codeType; 
        private String gmtCreatedTime; 
        private String gmtDequeuedTime; 
        private String gmtEnqueuedTime; 
        private String gmtPositionModifiedTime; 
        private String name; 
        private Long position; 
        private Long priority; 
        private String queueStrategy; 
        private String quotaId; 
        private String reason; 
        private ResourceAmount resource; 
        private String status; 
        private String userId; 
        private String userName; 
        private String workloadId; 
        private String workloadName; 
        private String workloadStatus; 
        private String workloadType; 
        private String workspaceId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CodeType.
         */
        public Builder codeType(String codeType) {
            this.codeType = codeType;
            return this;
        }

        /**
         * GmtCreatedTime.
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }

        /**
         * GmtDequeuedTime.
         */
        public Builder gmtDequeuedTime(String gmtDequeuedTime) {
            this.gmtDequeuedTime = gmtDequeuedTime;
            return this;
        }

        /**
         * GmtEnqueuedTime.
         */
        public Builder gmtEnqueuedTime(String gmtEnqueuedTime) {
            this.gmtEnqueuedTime = gmtEnqueuedTime;
            return this;
        }

        /**
         * GmtPositionModifiedTime.
         */
        public Builder gmtPositionModifiedTime(String gmtPositionModifiedTime) {
            this.gmtPositionModifiedTime = gmtPositionModifiedTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(Long position) {
            this.position = position;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * QueueStrategy.
         */
        public Builder queueStrategy(String queueStrategy) {
            this.queueStrategy = queueStrategy;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(ResourceAmount resource) {
            this.resource = resource;
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
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * WorkloadId.
         */
        public Builder workloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }

        /**
         * WorkloadName.
         */
        public Builder workloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }

        /**
         * WorkloadStatus.
         */
        public Builder workloadStatus(String workloadStatus) {
            this.workloadStatus = workloadStatus;
            return this;
        }

        /**
         * WorkloadType.
         */
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public QueueInfo build() {
            return new QueueInfo(this);
        } 

    } 

}
