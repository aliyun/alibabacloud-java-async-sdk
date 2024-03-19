// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueueInfo} extends {@link TeaModel}
 *
 * <p>QueueInfo</p>
 */
public class QueueInfo extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CodeType")
    private String codeType;

    @NameInMap("GmtDequeuedTime")
    private String gmtDequeuedTime;

    @NameInMap("GmtEnqueuedTime")
    private String gmtEnqueuedTime;

    @NameInMap("GmtPositionModifiedTime")
    private String gmtPositionModifiedTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("Position")
    private Long position;

    @NameInMap("Priority")
    private Long priority;

    @NameInMap("QueueStrategy")
    private String queueStrategy;

    @NameInMap("QuotaId")
    private String quotaId;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("Resource")
    private ResourceAmount resource;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubStatus")
    private String subStatus;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("WorkloadId")
    private String workloadId;

    @NameInMap("WorkloadType")
    private String workloadType;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    private QueueInfo(Builder builder) {
        this.code = builder.code;
        this.codeType = builder.codeType;
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
        this.subStatus = builder.subStatus;
        this.userId = builder.userId;
        this.workloadId = builder.workloadId;
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
     * @return subStatus
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workloadId
     */
    public String getWorkloadId() {
        return this.workloadId;
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
        private String subStatus; 
        private String userId; 
        private String workloadId; 
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
         * SubStatus.
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
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
         * WorkloadId.
         */
        public Builder workloadId(String workloadId) {
            this.workloadId = workloadId;
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
