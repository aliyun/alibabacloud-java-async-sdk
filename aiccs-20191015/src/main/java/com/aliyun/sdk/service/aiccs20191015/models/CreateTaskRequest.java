// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @Query
    @NameInMap("CallString")
    private String callString;

    @Query
    @NameInMap("CallStringType")
    @Validation(required = true)
    private String callStringType;

    @Query
    @NameInMap("Caller")
    @Validation(required = true)
    private String caller;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RetryCount")
    private Integer retryCount;

    @Query
    @NameInMap("RetryFlag")
    private Integer retryFlag;

    @Query
    @NameInMap("RetryInterval")
    private Integer retryInterval;

    @Query
    @NameInMap("RetryStatusCode")
    private String retryStatusCode;

    @Query
    @NameInMap("RobotId")
    @Validation(required = true)
    private String robotId;

    @Query
    @NameInMap("SeatCount")
    @Validation(required = true)
    private String seatCount;

    @Query
    @NameInMap("StartNow")
    private Boolean startNow;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("WorkDay")
    @Validation(required = true)
    private String workDay;

    @Query
    @NameInMap("WorkTimeList")
    @Validation(required = true)
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

        private Builder(CreateTaskRequest response) {
            super(response);
            this.callString = response.callString;
            this.callStringType = response.callStringType;
            this.caller = response.caller;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.retryCount = response.retryCount;
            this.retryFlag = response.retryFlag;
            this.retryInterval = response.retryInterval;
            this.retryStatusCode = response.retryStatusCode;
            this.robotId = response.robotId;
            this.seatCount = response.seatCount;
            this.startNow = response.startNow;
            this.taskName = response.taskName;
            this.workDay = response.workDay;
            this.workTimeList = response.workTimeList;
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
         * CallStringType.
         */
        public Builder callStringType(String callStringType) {
            this.putQueryParameter("CallStringType", callStringType);
            this.callStringType = callStringType;
            return this;
        }

        /**
         * Caller.
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
         * RobotId.
         */
        public Builder robotId(String robotId) {
            this.putQueryParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        /**
         * SeatCount.
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
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * WorkDay.
         */
        public Builder workDay(String workDay) {
            this.putQueryParameter("WorkDay", workDay);
            this.workDay = workDay;
            return this;
        }

        /**
         * WorkTimeList.
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
