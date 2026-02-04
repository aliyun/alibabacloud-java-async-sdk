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
 * {@link UpdateAiCallTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateAiCallTaskRequest</p>
 */
public class UpdateAiCallTaskRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskCps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

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

    private UpdateAiCallTaskRequest(Builder builder) {
        super(builder);
        this.callDay = builder.callDay;
        this.callRetryInterval = builder.callRetryInterval;
        this.callRetryReason = builder.callRetryReason;
        this.callRetryTimes = builder.callRetryTimes;
        this.callTime = builder.callTime;
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
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskStartTime = builder.taskStartTime;
        this.virtualNumber = builder.virtualNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiCallTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
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

    public static final class Builder extends Request.Builder<UpdateAiCallTaskRequest, Builder> {
        private java.util.List<String> callDay; 
        private Long callRetryInterval; 
        private java.util.List<String> callRetryReason; 
        private Long callRetryTimes; 
        private java.util.List<String> callTime; 
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
        private String taskId; 
        private String taskName; 
        private Long taskStartTime; 
        private String virtualNumber; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAiCallTaskRequest request) {
            super(request);
            this.callDay = request.callDay;
            this.callRetryInterval = request.callRetryInterval;
            this.callRetryReason = request.callRetryReason;
            this.callRetryTimes = request.callRetryTimes;
            this.callTime = request.callTime;
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
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.taskStartTime = request.taskStartTime;
            this.virtualNumber = request.virtualNumber;
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
         * LineEncoding.
         */
        public Builder lineEncoding(String lineEncoding) {
            this.putQueryParameter("LineEncoding", lineEncoding);
            this.lineEncoding = lineEncoding;
            return this;
        }

        /**
         * LinePhoneNum.
         */
        public Builder linePhoneNum(String linePhoneNum) {
            this.putQueryParameter("LinePhoneNum", linePhoneNum);
            this.linePhoneNum = linePhoneNum;
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
         * PhoneType.
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
         * Source.
         */
        public Builder source(Long source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMMEDIATE</p>
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
         * <p>57</p>
         */
        public Builder taskCps(Long taskCps) {
            this.putQueryParameter("TaskCps", taskCps);
            this.taskCps = taskCps;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1152311212312***</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
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
         * VirtualNumber.
         */
        public Builder virtualNumber(String virtualNumber) {
            this.putQueryParameter("VirtualNumber", virtualNumber);
            this.virtualNumber = virtualNumber;
            return this;
        }

        @Override
        public UpdateAiCallTaskRequest build() {
            return new UpdateAiCallTaskRequest(this);
        } 

    } 

}
