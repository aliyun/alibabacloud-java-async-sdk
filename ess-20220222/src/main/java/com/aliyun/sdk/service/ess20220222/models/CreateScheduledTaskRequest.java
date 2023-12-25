// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledTaskRequest</p>
 */
public class CreateScheduledTaskRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DesiredCapacity")
    private Integer desiredCapacity;

    @Query
    @NameInMap("LaunchExpirationTime")
    @Validation(maximum = 86400)
    private Integer launchExpirationTime;

    @Query
    @NameInMap("LaunchTime")
    private String launchTime;

    @Query
    @NameInMap("MaxValue")
    private Integer maxValue;

    @Query
    @NameInMap("MinValue")
    private Integer minValue;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RecurrenceEndTime")
    private String recurrenceEndTime;

    @Query
    @NameInMap("RecurrenceType")
    private String recurrenceType;

    @Query
    @NameInMap("RecurrenceValue")
    private String recurrenceValue;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @Query
    @NameInMap("ScheduledAction")
    private String scheduledAction;

    @Query
    @NameInMap("ScheduledTaskName")
    private String scheduledTaskName;

    @Query
    @NameInMap("TaskEnabled")
    private Boolean taskEnabled;

    private CreateScheduledTaskRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.desiredCapacity = builder.desiredCapacity;
        this.launchExpirationTime = builder.launchExpirationTime;
        this.launchTime = builder.launchTime;
        this.maxValue = builder.maxValue;
        this.minValue = builder.minValue;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.recurrenceEndTime = builder.recurrenceEndTime;
        this.recurrenceType = builder.recurrenceType;
        this.recurrenceValue = builder.recurrenceValue;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.scheduledAction = builder.scheduledAction;
        this.scheduledTaskName = builder.scheduledTaskName;
        this.taskEnabled = builder.taskEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return desiredCapacity
     */
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * @return launchExpirationTime
     */
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    /**
     * @return launchTime
     */
    public String getLaunchTime() {
        return this.launchTime;
    }

    /**
     * @return maxValue
     */
    public Integer getMaxValue() {
        return this.maxValue;
    }

    /**
     * @return minValue
     */
    public Integer getMinValue() {
        return this.minValue;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recurrenceEndTime
     */
    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
    }

    /**
     * @return recurrenceType
     */
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    /**
     * @return recurrenceValue
     */
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return scheduledAction
     */
    public String getScheduledAction() {
        return this.scheduledAction;
    }

    /**
     * @return scheduledTaskName
     */
    public String getScheduledTaskName() {
        return this.scheduledTaskName;
    }

    /**
     * @return taskEnabled
     */
    public Boolean getTaskEnabled() {
        return this.taskEnabled;
    }

    public static final class Builder extends Request.Builder<CreateScheduledTaskRequest, Builder> {
        private String description; 
        private Integer desiredCapacity; 
        private Integer launchExpirationTime; 
        private String launchTime; 
        private Integer maxValue; 
        private Integer minValue; 
        private String ownerAccount; 
        private Long ownerId; 
        private String recurrenceEndTime; 
        private String recurrenceType; 
        private String recurrenceValue; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private String scheduledAction; 
        private String scheduledTaskName; 
        private Boolean taskEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledTaskRequest request) {
            super(request);
            this.description = request.description;
            this.desiredCapacity = request.desiredCapacity;
            this.launchExpirationTime = request.launchExpirationTime;
            this.launchTime = request.launchTime;
            this.maxValue = request.maxValue;
            this.minValue = request.minValue;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.recurrenceEndTime = request.recurrenceEndTime;
            this.recurrenceType = request.recurrenceType;
            this.recurrenceValue = request.recurrenceValue;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.scheduledAction = request.scheduledAction;
            this.scheduledTaskName = request.scheduledTaskName;
            this.taskEnabled = request.taskEnabled;
        } 

        /**
         * The description of the scheduled task. The description must be 2 to 200 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The expected number of instances in the scaling group if you specify the ScalingGroupId parameter.
         * <p>
         * 
         * > You must specify the `DesiredCapacity` parameter when you create a scaling group.
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * The time period during which the failed scheduled task can be retried. Unit: seconds. Valid values: 0 to 1800.
         * <p>
         * 
         * Default value: 600.
         */
        public Builder launchExpirationTime(Integer launchExpirationTime) {
            this.putQueryParameter("LaunchExpirationTime", launchExpirationTime);
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }

        /**
         * The point in time at which the scheduled task is triggered. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot enter a point in time that is later than 90 days from the point in time at which the scheduled task is created.
         * <p>
         * 
         * *   If you specify the `RecurrenceType` parameter, the scheduled task is repeatedly executed at the point in time that is specified by the LaunchTime parameter.
         * *   If you do not specify the `RecurrenceType` parameter, the task is executed only once at the point in time that is specified by the LaunchTime parameter.
         */
        public Builder launchTime(String launchTime) {
            this.putQueryParameter("LaunchTime", launchTime);
            this.launchTime = launchTime;
            return this;
        }

        /**
         * The maximum number of instances in the scaling group if you specify the ScalingGroupId parameter.
         */
        public Builder maxValue(Integer maxValue) {
            this.putQueryParameter("MaxValue", maxValue);
            this.maxValue = maxValue;
            return this;
        }

        /**
         * The minimum number of instances in the scaling group if you specify the ScalingGroupId parameter.
         */
        public Builder minValue(Integer minValue) {
            this.putQueryParameter("MinValue", minValue);
            this.minValue = minValue;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The end time of the scheduled task. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format.
         * <p>
         * 
         * The time must be in UTC. You cannot enter a point in time that is later than 365 days from the point in time at which the scheduled task is created.
         */
        public Builder recurrenceEndTime(String recurrenceEndTime) {
            this.putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }

        /**
         * The interval at which the scheduled task is repeated. Valid values:
         * <p>
         * 
         * *   Daily: The scheduled task is executed once every specified number of days.
         * *   Weekly: The scheduled task is executed on each specified day of the week.
         * *   Monthly: The scheduled task is executed on each specified day of the month.
         * *   Cron: The scheduled task is executed based on the specified cron expression.
         * 
         * You must specify the `RecurrenceType` and `RecurrenceValue` parameters at the same time.
         */
        public Builder recurrenceType(String recurrenceType) {
            this.putQueryParameter("RecurrenceType", recurrenceType);
            this.recurrenceType = recurrenceType;
            return this;
        }

        /**
         * The number of recurrences of the scheduled task.
         * <p>
         * 
         * *   If you set the `RecurrenceType` parameter to `Daily`, you can specify only one value for this parameter. Valid values: 1 to 31.
         * *   If you set the `RecurrenceType` parameter to `Weekly`, you can specify multiple values for this parameter. Separate the values with commas (,). The values that correspond to Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6.``
         * *   If you set the `RecurrenceType` parameter to `Monthly`, you can specify two values in the `A-B` format for this parameter. Valid values of A and B: 1 to 31. B must be greater than or equal to A.
         * *   If you set the `RecurrenceType` parameter to `Cron`, you can specify a cron expression. A cron expression is written in UTC time and consists of the following fields: minute, hour, day, month, and week. The expression can contain the letters L and W and the following wildcard characters: commas (,), question marks (?), hyphens (-), asterisks (\*), number signs (#), and forward slashes (/).
         * 
         * You must specify both the `RecurrenceType` parameter and the `RecurrenceValue` parameter.
         */
        public Builder recurrenceValue(String recurrenceValue) {
            this.putQueryParameter("RecurrenceValue", recurrenceValue);
            this.recurrenceValue = recurrenceValue;
            return this;
        }

        /**
         * The region ID of the scheduled task.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the scaling group whose number of instances must be modified when the scheduled task is triggered. If you specify the `ScalingGroupId` parameter for a scheduled task, you must specify the minimum, maximum, or expected numbers of instances for a scaling group in the scheduled task. That is, you must specify at least one of the `MinValue`, `MaxValue`, and `DesiredCapacity` parameters.
         * <p>
         * 
         * > You cannot specify the `ScheduledAction` and `ScalingGroupId` parameters at the same time.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The scaling rule that you want to execute when the scheduled task is triggered. Specify the unique identifier of the scaling rule. If you specify the `ScheduledAction` parameter, you must select an existing scaling rule for the scheduled task.
         * <p>
         * 
         * > You cannot specify the `ScheduledAction` and `ScalingGroupId` parameters at the same time.
         */
        public Builder scheduledAction(String scheduledAction) {
            this.putQueryParameter("ScheduledAction", scheduledAction);
            this.scheduledAction = scheduledAction;
            return this;
        }

        /**
         * The name of the scheduled task. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit. The name of the scheduled task must be unique in the region and within the Alibaba Cloud account.
         * <p>
         * 
         * If you do not specify this parameter, the value of the `ScheduledTaskId` parameter is used.
         */
        public Builder scheduledTaskName(String scheduledTaskName) {
            this.putQueryParameter("ScheduledTaskName", scheduledTaskName);
            this.scheduledTaskName = scheduledTaskName;
            return this;
        }

        /**
         * Specifies whether to enable the scheduled task.
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: true.
         */
        public Builder taskEnabled(Boolean taskEnabled) {
            this.putQueryParameter("TaskEnabled", taskEnabled);
            this.taskEnabled = taskEnabled;
            return this;
        }

        @Override
        public CreateScheduledTaskRequest build() {
            return new CreateScheduledTaskRequest(this);
        } 

    } 

}
