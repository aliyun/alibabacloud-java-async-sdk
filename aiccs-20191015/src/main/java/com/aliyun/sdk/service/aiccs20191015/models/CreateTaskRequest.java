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
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallString")
    private String callString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallStringType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callStringType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

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
    @com.aliyun.core.annotation.NameInMap("RetryCount")
    private Integer retryCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryFlag")
    private Integer retryFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInterval")
    private Integer retryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryStatusCode")
    private String retryStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String seatCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartNow")
    private Boolean startNow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkTimeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workTimeList;

    private CreateTaskRequest(Builder builder) {
        super(builder);
        this.callString = builder.callString;
        this.callStringType = builder.callStringType;
        this.caller = builder.caller;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retryCount = builder.retryCount;
        this.retryFlag = builder.retryFlag;
        this.retryInterval = builder.retryInterval;
        this.retryStatusCode = builder.retryStatusCode;
        this.robotId = builder.robotId;
        this.seatCount = builder.seatCount;
        this.startNow = builder.startNow;
        this.taskName = builder.taskName;
        this.workDay = builder.workDay;
        this.workTimeList = builder.workTimeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callString
     */
    public String getCallString() {
        return this.callString;
    }

    /**
     * @return callStringType
     */
    public String getCallStringType() {
        return this.callStringType;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
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
     * @return retryCount
     */
    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * @return retryFlag
     */
    public Integer getRetryFlag() {
        return this.retryFlag;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return retryStatusCode
     */
    public String getRetryStatusCode() {
        return this.retryStatusCode;
    }

    /**
     * @return robotId
     */
    public String getRobotId() {
        return this.robotId;
    }

    /**
     * @return seatCount
     */
    public String getSeatCount() {
        return this.seatCount;
    }

    /**
     * @return startNow
     */
    public Boolean getStartNow() {
        return this.startNow;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return workDay
     */
    public String getWorkDay() {
        return this.workDay;
    }

    /**
     * @return workTimeList
     */
    public String getWorkTimeList() {
        return this.workTimeList;
    }

    public static final class Builder extends Request.Builder<CreateTaskRequest, Builder> {
        private String callString; 
        private String callStringType; 
        private String caller; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retryCount; 
        private Integer retryFlag; 
        private Integer retryInterval; 
        private String retryStatusCode; 
        private String robotId; 
        private String seatCount; 
        private Boolean startNow; 
        private String taskName; 
        private String workDay; 
        private String workTimeList; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskRequest request) {
            super(request);
            this.callString = request.callString;
            this.callStringType = request.callStringType;
            this.caller = request.caller;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retryCount = request.retryCount;
            this.retryFlag = request.retryFlag;
            this.retryInterval = request.retryInterval;
            this.retryStatusCode = request.retryStatusCode;
            this.robotId = request.robotId;
            this.seatCount = request.seatCount;
            this.startNow = request.startNow;
            this.taskName = request.taskName;
            this.workDay = request.workDay;
            this.workTimeList = request.workTimeList;
        } 

        /**
         * CallString.
         */
        public Builder callString(String callString) {
            this.putQueryParameter("CallString", callString);
            this.callString = callString;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder callStringType(String callStringType) {
            this.putQueryParameter("CallStringType", callStringType);
            this.callStringType = callStringType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0571<strong><strong>5678,0571</strong></strong>5679</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
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
         * RetryCount.
         */
        public Builder retryCount(Integer retryCount) {
            this.putQueryParameter("RetryCount", retryCount);
            this.retryCount = retryCount;
            return this;
        }

        /**
         * RetryFlag.
         */
        public Builder retryFlag(Integer retryFlag) {
            this.putQueryParameter("RetryFlag", retryFlag);
            this.retryFlag = retryFlag;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * RetryStatusCode.
         */
        public Builder retryStatusCode(String retryStatusCode) {
            this.putQueryParameter("RetryStatusCode", retryStatusCode);
            this.retryStatusCode = retryStatusCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder robotId(String robotId) {
            this.putQueryParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder seatCount(String seatCount) {
            this.putQueryParameter("SeatCount", seatCount);
            this.seatCount = seatCount;
            return this;
        }

        /**
         * StartNow.
         */
        public Builder startNow(Boolean startNow) {
            this.putQueryParameter("StartNow", startNow);
            this.startNow = startNow;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workDay(String workDay) {
            this.putQueryParameter("WorkDay", workDay);
            this.workDay = workDay;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00-12:00,13:00-14:00</p>
         */
        public Builder workTimeList(String workTimeList) {
            this.putQueryParameter("WorkTimeList", workTimeList);
            this.workTimeList = workTimeList;
            return this;
        }

        @Override
        public CreateTaskRequest build() {
            return new CreateTaskRequest(this);
        } 

    } 

}
