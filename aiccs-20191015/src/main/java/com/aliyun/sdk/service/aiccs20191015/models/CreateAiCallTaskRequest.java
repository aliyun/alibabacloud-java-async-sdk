// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link CreateAiCallTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAiCallTaskRequest</p>
 */
public class CreateAiCallTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> callDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallRetryInterval")
    private Long callRetryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallRetryReason")
    private java.util.List<String> callRetryReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallRetryTimes")
    private Long callRetryTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> callTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MissCallRetry")
    private Boolean missCallRetry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStartTime")
    private Long taskStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualNumber;

    private CreateAiCallTaskRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.callDay = builder.callDay;
        this.callRetryInterval = builder.callRetryInterval;
        this.callRetryReason = builder.callRetryReason;
        this.callRetryTimes = builder.callRetryTimes;
        this.callTime = builder.callTime;
        this.missCallRetry = builder.missCallRetry;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startType = builder.startType;
        this.taskName = builder.taskName;
        this.taskStartTime = builder.taskStartTime;
        this.virtualNumber = builder.virtualNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiCallTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return callDay
     */
    public java.util.List<String> getCallDay() {
        return this.callDay;
    }

    /**
     * @return callRetryInterval
     */
    public Long getCallRetryInterval() {
        return this.callRetryInterval;
    }

    /**
     * @return callRetryReason
     */
    public java.util.List<String> getCallRetryReason() {
        return this.callRetryReason;
    }

    /**
     * @return callRetryTimes
     */
    public Long getCallRetryTimes() {
        return this.callRetryTimes;
    }

    /**
     * @return callTime
     */
    public java.util.List<String> getCallTime() {
        return this.callTime;
    }

    /**
     * @return missCallRetry
     */
    public Boolean getMissCallRetry() {
        return this.missCallRetry;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startType
     */
    public String getStartType() {
        return this.startType;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskStartTime
     */
    public Long getTaskStartTime() {
        return this.taskStartTime;
    }

    /**
     * @return virtualNumber
     */
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

    public static final class Builder extends Request.Builder<CreateAiCallTaskRequest, Builder> {
        private String agentId; 
        private java.util.List<String> callDay; 
        private Long callRetryInterval; 
        private java.util.List<String> callRetryReason; 
        private Long callRetryTimes; 
        private java.util.List<String> callTime; 
        private Boolean missCallRetry; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startType; 
        private String taskName; 
        private Long taskStartTime; 
        private String virtualNumber; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiCallTaskRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.callDay = request.callDay;
            this.callRetryInterval = request.callRetryInterval;
            this.callRetryReason = request.callRetryReason;
            this.callRetryTimes = request.callRetryTimes;
            this.callTime = request.callTime;
            this.missCallRetry = request.missCallRetry;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startType = request.startType;
            this.taskName = request.taskName;
            this.taskStartTime = request.taskStartTime;
            this.virtualNumber = request.virtualNumber;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121223123123****</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callDay(java.util.List<String> callDay) {
            String callDayShrink = shrink(callDay, "CallDay", "json");
            this.putQueryParameter("CallDay", callDayShrink);
            this.callDay = callDay;
            return this;
        }

        /**
         * CallRetryInterval.
         */
        public Builder callRetryInterval(Long callRetryInterval) {
            this.putQueryParameter("CallRetryInterval", callRetryInterval);
            this.callRetryInterval = callRetryInterval;
            return this;
        }

        /**
         * CallRetryReason.
         */
        public Builder callRetryReason(java.util.List<String> callRetryReason) {
            String callRetryReasonShrink = shrink(callRetryReason, "CallRetryReason", "json");
            this.putQueryParameter("CallRetryReason", callRetryReasonShrink);
            this.callRetryReason = callRetryReason;
            return this;
        }

        /**
         * CallRetryTimes.
         */
        public Builder callRetryTimes(Long callRetryTimes) {
            this.putQueryParameter("CallRetryTimes", callRetryTimes);
            this.callRetryTimes = callRetryTimes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callTime(java.util.List<String> callTime) {
            String callTimeShrink = shrink(callTime, "CallTime", "json");
            this.putQueryParameter("CallTime", callTimeShrink);
            this.callTime = callTime;
            return this;
        }

        /**
         * MissCallRetry.
         */
        public Builder missCallRetry(Boolean missCallRetry) {
            this.putQueryParameter("MissCallRetry", missCallRetry);
            this.missCallRetry = missCallRetry;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCHEDULE</p>
         */
        public Builder startType(String startType) {
            this.putQueryParameter("StartType", startType);
            this.startType = startType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskStartTime.
         */
        public Builder taskStartTime(Long taskStartTime) {
            this.putQueryParameter("TaskStartTime", taskStartTime);
            this.taskStartTime = taskStartTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>032712122*****</p>
         */
        public Builder virtualNumber(String virtualNumber) {
            this.putQueryParameter("VirtualNumber", virtualNumber);
            this.virtualNumber = virtualNumber;
            return this;
        }

        @Override
        public CreateAiCallTaskRequest build() {
            return new CreateAiCallTaskRequest(this);
        } 

    } 

}
