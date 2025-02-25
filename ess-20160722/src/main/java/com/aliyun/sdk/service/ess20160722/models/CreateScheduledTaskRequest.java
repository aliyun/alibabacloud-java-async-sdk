// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledTaskRequest</p>
 */
public class CreateScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchExpirationTime")
    @com.aliyun.core.annotation.Validation(maximum = 86400)
    private Integer launchExpirationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTime")
    private String launchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecurrenceEndTime")
    private String recurrenceEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecurrenceType")
    private String recurrenceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
    private String recurrenceValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTaskName")
    private String scheduledTaskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskEnabled")
    private Boolean taskEnabled;

    private CreateScheduledTaskRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.launchExpirationTime = builder.launchExpirationTime;
        this.launchTime = builder.launchTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.recurrenceEndTime = builder.recurrenceEndTime;
        this.recurrenceType = builder.recurrenceType;
        this.recurrenceValue = builder.recurrenceValue;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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
        private Integer launchExpirationTime; 
        private String launchTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String recurrenceEndTime; 
        private String recurrenceType; 
        private String recurrenceValue; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scheduledAction; 
        private String scheduledTaskName; 
        private Boolean taskEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledTaskRequest request) {
            super(request);
            this.description = request.description;
            this.launchExpirationTime = request.launchExpirationTime;
            this.launchTime = request.launchTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.recurrenceEndTime = request.recurrenceEndTime;
            this.recurrenceType = request.recurrenceType;
            this.recurrenceValue = request.recurrenceValue;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scheduledAction = request.scheduledAction;
            this.scheduledTaskName = request.scheduledTaskName;
            this.taskEnabled = request.taskEnabled;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
