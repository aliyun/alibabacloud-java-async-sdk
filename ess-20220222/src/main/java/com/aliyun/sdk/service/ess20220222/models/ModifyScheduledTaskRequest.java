// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link ModifyScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyScheduledTaskRequest</p>
 */
public class ModifyScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
    private Integer desiredCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchExpirationTime")
    @com.aliyun.core.annotation.Validation(maximum = 86400)
    private Integer launchExpirationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTime")
    private String launchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxValue")
    private Integer maxValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinValue")
    private Integer minValue;

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
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledAction")
    private String scheduledAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTaskName")
    private String scheduledTaskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskEnabled")
    private Boolean taskEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarmPoolCapacityOptions")
    private WarmPoolCapacityOptions warmPoolCapacityOptions;

    private ModifyScheduledTaskRequest(Builder builder) {
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
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scheduledAction = builder.scheduledAction;
        this.scheduledTaskId = builder.scheduledTaskId;
        this.scheduledTaskName = builder.scheduledTaskName;
        this.taskEnabled = builder.taskEnabled;
        this.warmPoolCapacityOptions = builder.warmPoolCapacityOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScheduledTaskRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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
     * @return scheduledTaskId
     */
    public String getScheduledTaskId() {
        return this.scheduledTaskId;
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

    /**
     * @return warmPoolCapacityOptions
     */
    public WarmPoolCapacityOptions getWarmPoolCapacityOptions() {
        return this.warmPoolCapacityOptions;
    }

    public static final class Builder extends Request.Builder<ModifyScheduledTaskRequest, Builder> {
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
        private Long resourceOwnerId; 
        private String scalingGroupId; 
        private String scheduledAction; 
        private String scheduledTaskId; 
        private String scheduledTaskName; 
        private Boolean taskEnabled; 
        private WarmPoolCapacityOptions warmPoolCapacityOptions; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScheduledTaskRequest request) {
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
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
            this.scheduledAction = request.scheduledAction;
            this.scheduledTaskId = request.scheduledTaskId;
            this.scheduledTaskName = request.scheduledTaskName;
            this.taskEnabled = request.taskEnabled;
            this.warmPoolCapacityOptions = request.warmPoolCapacityOptions;
        } 

        /**
         * <p>The description of the scheduled task. The description must be 2 to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Test scheduled task.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The expected number of instances in the scaling group. This parameter is required when the scaling method of the scheduled task is set to specify the number of instances in the scaling group.</p>
         * <blockquote>
         * <p>The scaling group must support the expected number of instances. This means that DesiredCapacity must be specified when the scaling group is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * <p>The retry period during which Auto Scaling continues to attempt to execute the scheduled task after the triggered operation fails. Unit: seconds. Valid values: 0 to 1800.</p>
         * <p>Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder launchExpirationTime(Integer launchExpirationTime) {
            this.putQueryParameter("LaunchExpirationTime", launchExpirationTime);
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }

        /**
         * <p>The time at which the scheduled task is executed. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot specify a time that is later than 90 days from the date of modification.</p>
         * <ul>
         * <li><p>If RecurrenceType is specified, the time specified by this parameter is the default time for recurring execution.</p>
         * </li>
         * <li><p>If RecurrenceType is not specified, the task is executed only once at the specified date and time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2014-08-18T10:52Z</p>
         */
        public Builder launchTime(String launchTime) {
            this.putQueryParameter("LaunchTime", launchTime);
            this.launchTime = launchTime;
            return this;
        }

        /**
         * <p>The maximum number of instances in the scaling group. This parameter is required when the scaling method of the scheduled task is set to specify the number of instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxValue(Integer maxValue) {
            this.putQueryParameter("MaxValue", maxValue);
            this.maxValue = maxValue;
            return this;
        }

        /**
         * <p>The minimum number of instances in the scaling group. This parameter is required when the scaling method of the scheduled task is set to specify the number of instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The end time of the scheduled task that is executed repeatedly. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot specify a time that is later than 365 days from the date of modification.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-20T16:55Z</p>
         */
        public Builder recurrenceEndTime(String recurrenceEndTime) {
            this.putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }

        /**
         * <p>The recurrence type of the scheduled task. Valid values:</p>
         * <ul>
         * <li>Daily: The scheduled task is executed once every specified number of days.</li>
         * <li>Weekly: The scheduled task is executed on specified days of each week.</li>
         * <li>Monthly: The scheduled task is executed on specified days of each month.</li>
         * <li>Cron: The scheduled task is executed based on the specified cron expression.</li>
         * </ul>
         * <p>After modification, both RecurrenceType and RecurrenceValue must be valid.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        public Builder recurrenceType(String recurrenceType) {
            this.putQueryParameter("RecurrenceType", recurrenceType);
            this.recurrenceType = recurrenceType;
            return this;
        }

        /**
         * <p>The recurrence value of the scheduled task.</p>
         * <ul>
         * <li>If RecurrenceType is set to Daily, you can specify only one value. Valid values: 1 to 31.</li>
         * <li>If RecurrenceType is set to Weekly, you can specify multiple values separated by commas (,). For example, the values for Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0,1,2,3,4,5,6.</li>
         * <li>If RecurrenceType is set to Monthly, the format is A-B. Valid values of A and B: 1 to 31. B must be greater than or equal to A.</li>
         * <li>If RecurrenceType is set to Cron, the value specifies a cron expression in UTC. The expression supports five fields: minute, hour, day, month, and week. It supports wildcards such as commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), L, and W.</li>
         * </ul>
         * <p>After modification, both RecurrenceType and RecurrenceValue must be valid.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder recurrenceValue(String recurrenceValue) {
            this.putQueryParameter("RecurrenceValue", recurrenceValue);
            this.recurrenceValue = recurrenceValue;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The ID of the scaling group in which you want to modify the number of instances or adjust the warm pool capacity when the scheduled task is triggered.</p>
         * <p>After you specify ScalingGroupId, the scaling method of the scheduled task is set to specify the number of instances in the scaling group or adjust the warm pool capacity.</p>
         * <ul>
         * <li>Specify the number of instances in the scaling group: You must specify at least one of the MinValue, MaxValue, and DesiredCapacity parameters.</li>
         * <li>Adjust the warm pool capacity: You must specify WarmPoolCapacityOptions.</li>
         * </ul>
         * <blockquote>
         * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The ID of the scaling rule to execute. This parameter is available only when the scaling method is set to execute an existing scaling rule. You can view the ID on the details page of the scaling rule.</p>
         * <blockquote>
         * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ari:acs:ess:cn-hangzhou:14069264****:scalingrule/asr-bp12tcnol686y1ik****</p>
         */
        public Builder scheduledAction(String scheduledAction) {
            this.putQueryParameter("ScheduledAction", scheduledAction);
            this.scheduledAction = scheduledAction;
            return this;
        }

        /**
         * <p>The ID of the scheduled task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>edRtShc57WGXdt8TlPbr****</p>
         */
        public Builder scheduledTaskId(String scheduledTaskId) {
            this.putQueryParameter("ScheduledTaskId", scheduledTaskId);
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }

        /**
         * <p>The name of the scheduled task. The name must be 2 to 64 characters in length and can contain periods (.), underscores (_), and hyphens (-). It must start with a letter, digit, or Chinese character. The name must be unique within the same region and Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>scheduled****</p>
         */
        public Builder scheduledTaskName(String scheduledTaskName) {
            this.putQueryParameter("ScheduledTaskName", scheduledTaskName);
            this.scheduledTaskName = scheduledTaskName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the scheduled task. Valid values:</p>
         * <ul>
         * <li>true: enables the scheduled task.</li>
         * <li>false: disables the scheduled task.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder taskEnabled(Boolean taskEnabled) {
            this.putQueryParameter("TaskEnabled", taskEnabled);
            this.taskEnabled = taskEnabled;
            return this;
        }

        /**
         * <p>The warm pool capacity configuration of the scaling group. This parameter is valid only when a warm pool is configured for the scaling group.</p>
         * <blockquote>
         * <p>You must specify ScalingGroupId when you specify this parameter.</p>
         * </blockquote>
         */
        public Builder warmPoolCapacityOptions(WarmPoolCapacityOptions warmPoolCapacityOptions) {
            this.putQueryParameter("WarmPoolCapacityOptions", warmPoolCapacityOptions);
            this.warmPoolCapacityOptions = warmPoolCapacityOptions;
            return this;
        }

        @Override
        public ModifyScheduledTaskRequest build() {
            return new ModifyScheduledTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyScheduledTaskRequest</p>
     */
    public static class WarmPoolCapacityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesiredGroupPreparedCapacity")
        private Integer desiredGroupPreparedCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Integer minCapacity;

        private WarmPoolCapacityOptions(Builder builder) {
            this.desiredGroupPreparedCapacity = builder.desiredGroupPreparedCapacity;
            this.minCapacity = builder.minCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmPoolCapacityOptions create() {
            return builder().build();
        }

        /**
         * @return desiredGroupPreparedCapacity
         */
        public Integer getDesiredGroupPreparedCapacity() {
            return this.desiredGroupPreparedCapacity;
        }

        /**
         * @return minCapacity
         */
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

        public static final class Builder {
            private Integer desiredGroupPreparedCapacity; 
            private Integer minCapacity; 

            private Builder() {
            } 

            private Builder(WarmPoolCapacityOptions model) {
                this.desiredGroupPreparedCapacity = model.desiredGroupPreparedCapacity;
                this.minCapacity = model.minCapacity;
            } 

            /**
             * <p>The expected number of prepared instances. The system maintains the sum of the current number of instances in the scaling group and the number of instances in the warm pool at this value. Default value: the maximum number of instances in the scaling group, which is specified by MaxSize.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder desiredGroupPreparedCapacity(Integer desiredGroupPreparedCapacity) {
                this.desiredGroupPreparedCapacity = desiredGroupPreparedCapacity;
                return this;
            }

            /**
             * <p>The minimum number of instances in the warm pool. The system always retains at least this number of prepared instances in the warm pool to ensure that instances can be quickly added from the warm pool during scale-out. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minCapacity(Integer minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            public WarmPoolCapacityOptions build() {
                return new WarmPoolCapacityOptions(this);
            } 

        } 

    }
}
