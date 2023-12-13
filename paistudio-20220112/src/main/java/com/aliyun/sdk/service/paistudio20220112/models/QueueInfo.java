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
    @NameInMap("GmtEnqueuedTime")
    private String gmtEnqueuedTime;

    @NameInMap("GmtPositionModifiedTime")
    private String gmtPositionModifiedTime;

    @NameInMap("Position")
    private Long position;

    @NameInMap("Priority")
    private Long priority;

    @NameInMap("QueueStrategy")
    private String queueStrategy;

    @NameInMap("QuotaId")
    private String quotaId;

    @NameInMap("WorkloadId")
    private String workloadId;

    @NameInMap("WorkloadType")
    private String workloadType;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    private QueueInfo(Builder builder) {
        this.gmtEnqueuedTime = builder.gmtEnqueuedTime;
        this.gmtPositionModifiedTime = builder.gmtPositionModifiedTime;
        this.position = builder.position;
        this.priority = builder.priority;
        this.queueStrategy = builder.queueStrategy;
        this.quotaId = builder.quotaId;
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
        private String gmtEnqueuedTime; 
        private String gmtPositionModifiedTime; 
        private Long position; 
        private Long priority; 
        private String queueStrategy; 
        private String quotaId; 
        private String workloadId; 
        private String workloadType; 
        private String workspaceId; 

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
