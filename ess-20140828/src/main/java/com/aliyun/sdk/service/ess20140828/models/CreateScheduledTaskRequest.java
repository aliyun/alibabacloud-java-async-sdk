// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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

        private Builder(CreateScheduledTaskRequest response) {
            super(response);
            this.description = response.description;
            this.desiredCapacity = response.desiredCapacity;
            this.launchExpirationTime = response.launchExpirationTime;
            this.launchTime = response.launchTime;
            this.maxValue = response.maxValue;
            this.minValue = response.minValue;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.recurrenceEndTime = response.recurrenceEndTime;
            this.recurrenceType = response.recurrenceType;
            this.recurrenceValue = response.recurrenceValue;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingGroupId = response.scalingGroupId;
            this.scheduledAction = response.scheduledAction;
            this.scheduledTaskName = response.scheduledTaskName;
            this.taskEnabled = response.taskEnabled;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DesiredCapacity.
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * LaunchExpirationTime.
         */
        public Builder launchExpirationTime(Integer launchExpirationTime) {
            this.putQueryParameter("LaunchExpirationTime", launchExpirationTime);
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }

        /**
         * LaunchTime.
         */
        public Builder launchTime(String launchTime) {
            this.putQueryParameter("LaunchTime", launchTime);
            this.launchTime = launchTime;
            return this;
        }

        /**
         * MaxValue.
         */
        public Builder maxValue(Integer maxValue) {
            this.putQueryParameter("MaxValue", maxValue);
            this.maxValue = maxValue;
            return this;
        }

        /**
         * MinValue.
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
         * RecurrenceEndTime.
         */
        public Builder recurrenceEndTime(String recurrenceEndTime) {
            this.putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }

        /**
         * RecurrenceType.
         */
        public Builder recurrenceType(String recurrenceType) {
            this.putQueryParameter("RecurrenceType", recurrenceType);
            this.recurrenceType = recurrenceType;
            return this;
        }

        /**
         * RecurrenceValue.
         */
        public Builder recurrenceValue(String recurrenceValue) {
            this.putQueryParameter("RecurrenceValue", recurrenceValue);
            this.recurrenceValue = recurrenceValue;
            return this;
        }

        /**
         * RegionId.
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScheduledAction.
         */
        public Builder scheduledAction(String scheduledAction) {
            this.putQueryParameter("ScheduledAction", scheduledAction);
            this.scheduledAction = scheduledAction;
            return this;
        }

        /**
         * ScheduledTaskName.
         */
        public Builder scheduledTaskName(String scheduledTaskName) {
            this.putQueryParameter("ScheduledTaskName", scheduledTaskName);
            this.scheduledTaskName = scheduledTaskName;
            return this;
        }

        /**
         * TaskEnabled.
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
