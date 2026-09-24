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
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCode")
    private String applicationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> callDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallExpireDate")
    private String callExpireDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallExpireMinutes")
    private Long callExpireMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallExpireType")
    private Long callExpireType;

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
    @com.aliyun.core.annotation.NameInMap("CallableTime")
    private java.util.List<String> callableTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineEncoding")
    private String lineEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinePhoneNum")
    private String linePhoneNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MissCallRetry")
    private Boolean missCallRetry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneType")
    private Long phoneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private Long source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskCps")
    private Long taskCps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStartTime")
    private Long taskStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNumber")
    private String virtualNumber;

    private CreateAiCallTaskRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationCode = builder.applicationCode;
        this.callDay = builder.callDay;
        this.callExpireDate = builder.callExpireDate;
        this.callExpireMinutes = builder.callExpireMinutes;
        this.callExpireType = builder.callExpireType;
        this.callRetryInterval = builder.callRetryInterval;
        this.callRetryReason = builder.callRetryReason;
        this.callRetryTimes = builder.callRetryTimes;
        this.callTime = builder.callTime;
        this.callableTime = builder.callableTime;
        this.lineEncoding = builder.lineEncoding;
        this.linePhoneNum = builder.linePhoneNum;
        this.missCallRetry = builder.missCallRetry;
        this.ownerId = builder.ownerId;
        this.phoneType = builder.phoneType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.source = builder.source;
        this.startType = builder.startType;
        this.taskCps = builder.taskCps;
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
     * @return applicationCode
     */
    public String getApplicationCode() {
        return this.applicationCode;
    }

    /**
     * @return callDay
     */
    public java.util.List<String> getCallDay() {
        return this.callDay;
    }

    /**
     * @return callExpireDate
     */
    public String getCallExpireDate() {
        return this.callExpireDate;
    }

    /**
     * @return callExpireMinutes
     */
    public Long getCallExpireMinutes() {
        return this.callExpireMinutes;
    }

    /**
     * @return callExpireType
     */
    public Long getCallExpireType() {
        return this.callExpireType;
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
     * @return callableTime
     */
    public java.util.List<String> getCallableTime() {
        return this.callableTime;
    }

    /**
     * @return lineEncoding
     */
    public String getLineEncoding() {
        return this.lineEncoding;
    }

    /**
     * @return linePhoneNum
     */
    public String getLinePhoneNum() {
        return this.linePhoneNum;
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
     * @return phoneType
     */
    public Long getPhoneType() {
        return this.phoneType;
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
     * @return source
     */
    public Long getSource() {
        return this.source;
    }

    /**
     * @return startType
     */
    public String getStartType() {
        return this.startType;
    }

    /**
     * @return taskCps
     */
    public Long getTaskCps() {
        return this.taskCps;
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
        private String applicationCode; 
        private java.util.List<String> callDay; 
        private String callExpireDate; 
        private Long callExpireMinutes; 
        private Long callExpireType; 
        private Long callRetryInterval; 
        private java.util.List<String> callRetryReason; 
        private Long callRetryTimes; 
        private java.util.List<String> callTime; 
        private java.util.List<String> callableTime; 
        private String lineEncoding; 
        private String linePhoneNum; 
        private Boolean missCallRetry; 
        private Long ownerId; 
        private Long phoneType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long source; 
        private String startType; 
        private Long taskCps; 
        private String taskName; 
        private Long taskStartTime; 
        private String virtualNumber; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiCallTaskRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationCode = request.applicationCode;
            this.callDay = request.callDay;
            this.callExpireDate = request.callExpireDate;
            this.callExpireMinutes = request.callExpireMinutes;
            this.callExpireType = request.callExpireType;
            this.callRetryInterval = request.callRetryInterval;
            this.callRetryReason = request.callRetryReason;
            this.callRetryTimes = request.callRetryTimes;
            this.callTime = request.callTime;
            this.callableTime = request.callableTime;
            this.lineEncoding = request.lineEncoding;
            this.linePhoneNum = request.linePhoneNum;
            this.missCallRetry = request.missCallRetry;
            this.ownerId = request.ownerId;
            this.phoneType = request.phoneType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.source = request.source;
            this.startType = request.startType;
            this.taskCps = request.taskCps;
            this.taskName = request.taskName;
            this.taskStartTime = request.taskStartTime;
            this.virtualNumber = request.virtualNumber;
        } 

        /**
         * <p>The code of the agent that has been published.</p>
         * 
         * <strong>example:</strong>
         * <p>1180**************</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The application code. This parameter is used when the creation source is engine.</p>
         * 
         * <strong>example:</strong>
         * <p>025****C98</p>
         */
        public Builder applicationCode(String applicationCode) {
            this.putQueryParameter("ApplicationCode", applicationCode);
            this.applicationCode = applicationCode;
            return this;
        }

        /**
         * <p>The list of callable days.</p>
         * <p>This parameter is required.</p>
         */
        public Builder callDay(java.util.List<String> callDay) {
            String callDayShrink = shrink(callDay, "CallDay", "json");
            this.putQueryParameter("CallDay", callDayShrink);
            this.callDay = callDay;
            return this;
        }

        /**
         * <p>The expiration date of outbound call details (specific deadline). Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-30 20:00:20</p>
         */
        public Builder callExpireDate(String callExpireDate) {
            this.putQueryParameter("CallExpireDate", callExpireDate);
            this.callExpireDate = callExpireDate;
            return this;
        }

        /**
         * <p>The expiration duration of outbound call details. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder callExpireMinutes(Long callExpireMinutes) {
            this.putQueryParameter("CallExpireMinutes", callExpireMinutes);
            this.callExpireMinutes = callExpireMinutes;
            return this;
        }

        /**
         * <p>The outbound call validity type. Valid values:</p>
         * <p>0: Permanently valid.
         * 1: Valid for a specified duration after import.
         * 2: Valid until a specified date.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder callExpireType(Long callExpireType) {
            this.putQueryParameter("CallExpireType", callExpireType);
            this.callExpireType = callExpireType;
            return this;
        }

        /**
         * <p>The retry interval. Unit: minutes. The maximum value is 720 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder callRetryInterval(Long callRetryInterval) {
            this.putQueryParameter("CallRetryInterval", callRetryInterval);
            this.callRetryInterval = callRetryInterval;
            return this;
        }

        /**
         * <p>The list of retry reasons for failed calls.</p>
         */
        public Builder callRetryReason(java.util.List<String> callRetryReason) {
            String callRetryReasonShrink = shrink(callRetryReason, "CallRetryReason", "json");
            this.putQueryParameter("CallRetryReason", callRetryReasonShrink);
            this.callRetryReason = callRetryReason;
            return this;
        }

        /**
         * <p>The number of retries. The maximum value is 3.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder callRetryTimes(Long callRetryTimes) {
            this.putQueryParameter("CallRetryTimes", callRetryTimes);
            this.callRetryTimes = callRetryTimes;
            return this;
        }

        /**
         * <p>The list of callable time periods.</p>
         * <p>This parameter is required.</p>
         */
        public Builder callTime(java.util.List<String> callTime) {
            String callTimeShrink = shrink(callTime, "CallTime", "json");
            this.putQueryParameter("CallTime", callTimeShrink);
            this.callTime = callTime;
            return this;
        }

        /**
         * CallableTime.
         */
        public Builder callableTime(java.util.List<String> callableTime) {
            String callableTimeShrink = shrink(callableTime, "CallableTime", "json");
            this.putQueryParameter("CallableTime", callableTimeShrink);
            this.callableTime = callableTime;
            return this;
        }

        /**
         * <p>The line encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>JILIANG_***_***_NET</p>
         */
        public Builder lineEncoding(String lineEncoding) {
            this.putQueryParameter("LineEncoding", lineEncoding);
            this.lineEncoding = lineEncoding;
            return this;
        }

        /**
         * <p>The customer-provided line number.</p>
         * 
         * <strong>example:</strong>
         * <p>152****3120</p>
         */
        public Builder linePhoneNum(String linePhoneNum) {
            this.putQueryParameter("LinePhoneNum", linePhoneNum);
            this.linePhoneNum = linePhoneNum;
            return this;
        }

        /**
         * <p>Specifies whether to enable retry. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false (default): Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The number type. This parameter is used when the creation source is engine. Valid values:</p>
         * <ul>
         * <li><p>0: Alibaba Cloud number.</p>
         * </li>
         * <li><p>1: Customer-provided line.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder phoneType(Long phoneType) {
            this.putQueryParameter("PhoneType", phoneType);
            this.phoneType = phoneType;
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
         * <p>The creation source. Valid values:</p>
         * <ul>
         * <li><p>0: Created by an agent.</p>
         * </li>
         * <li><p>1: Created by an engine.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder source(Long source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The start type. Valid values:</p>
         * <ul>
         * <li><p>IMMEDIATE: Start immediately.</p>
         * </li>
         * <li><p>SCHEDULE: Start at a scheduled time.</p>
         * </li>
         * </ul>
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
         * <p>The task concurrency. The maximum value is 500.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        public Builder taskCps(Long taskCps) {
            this.putQueryParameter("TaskCps", taskCps);
            this.taskCps = taskCps;
            return this;
        }

        /**
         * <p>The task name. The name must be unique within the same account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTask</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The preset start time of the task. The value is a UNIX timestamp in milliseconds. This parameter is valid and required when StartType is set to SCHEDULE. The task automatically starts at the time specified by this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>12313123133</p>
         */
        public Builder taskStartTime(Long taskStartTime) {
            this.putQueryParameter("TaskStartTime", taskStartTime);
            this.taskStartTime = taskStartTime;
            return this;
        }

        /**
         * <p>The service instance used for outbound calls.</p>
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
