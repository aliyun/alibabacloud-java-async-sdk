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
 * {@link CreateScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledTaskRequest</p>
 */
public class CreateScheduledTaskRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledAction")
    private String scheduledAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTaskName")
    private String scheduledTaskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskEnabled")
    private Boolean taskEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarmPoolCapacityOptions")
    private WarmPoolCapacityOptions warmPoolCapacityOptions;

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
        this.warmPoolCapacityOptions = builder.warmPoolCapacityOptions;
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

    /**
     * @return warmPoolCapacityOptions
     */
    public WarmPoolCapacityOptions getWarmPoolCapacityOptions() {
        return this.warmPoolCapacityOptions;
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
        private WarmPoolCapacityOptions warmPoolCapacityOptions; 

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
         * <p>The expected number of instances in the scaling group when the scaling method of the scheduled task is set to specifying the number of instances in the scaling group.</p>
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
         * <p>The period within which the scheduled task retries after a trigger failure. Unit: seconds. Valid values: 0 to 1800.</p>
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
         * <p>The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot specify a time that is later than 90 days from the creation date. </p>
         * <ul>
         * <li><p>If RecurrenceType is specified, the time specified by this parameter is the default time for recurring execution.</p>
         * </li>
         * <li><p>If RecurrenceType is not specified, the task is executed only once at the specified date and time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2014-08-17T16:52Z</p>
         */
        public Builder launchTime(String launchTime) {
            this.putQueryParameter("LaunchTime", launchTime);
            this.launchTime = launchTime;
            return this;
        }

        /**
         * <p>The maximum number of instances in the scaling group when the scaling method of the scheduled task is set to specifying the number of instances in the scaling group.</p>
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
         * <p>The minimum number of instances in the scaling group when the scaling method of the scheduled task is set to specifying the number of instances in the scaling group.</p>
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
         * <p>The end time of the scheduled task that is executed repeatedly. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot specify a time that is later than 365 days from the creation date.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-17T16:55Z</p>
         */
        public Builder recurrenceEndTime(String recurrenceEndTime) {
            this.putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }

        /**
         * <p>The recurrence type of the scheduled task. Valid values: </p>
         * <ul>
         * <li>Daily: The scheduled task is executed once every specified number of days. </li>
         * <li>Weekly: The scheduled task is executed on specified days of each week. </li>
         * <li>Monthly: The scheduled task is executed on specified days of each month. </li>
         * <li>Cron: The scheduled task is executed based on the specified cron expression.</li>
         * </ul>
         * <p>You must specify both RecurrenceType and RecurrenceValue.</p>
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
         * <p>The recurrence value of the scheduled task. </p>
         * <ul>
         * <li>If RecurrenceType is set to Daily, you can specify only one value. Valid values: 1 to 31. </li>
         * <li>If RecurrenceType is set to Weekly, you can specify multiple values separated by commas (,). For example, the values for Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0,1,2,3,4,5,6.  </li>
         * <li>If RecurrenceType is set to Monthly, the format is A-B. Valid values of A and B: 1 to 31. B must be greater than or equal to A. </li>
         * <li>If RecurrenceType is set to Cron, the value represents UTC time and supports a five-field expression for minutes, hours, days, months, and days of the week. The expression supports the following wildcards: commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), L, and W.</li>
         * </ul>
         * <p>You must specify both RecurrenceType and RecurrenceValue.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recurrenceValue(String recurrenceValue) {
            this.putQueryParameter("RecurrenceValue", recurrenceValue);
            this.recurrenceValue = recurrenceValue;
            return this;
        }

        /**
         * <p>The ID of the region to which the scheduled task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
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
         * <p>The ID of the scaling group in which you want to modify the number of instances or adjust the warm pool capacity when the scheduled task is triggered.</p>
         * <p>After you specify ScalingGroupId, the scaling method of the scheduled task is set to specifying the number of instances in the scaling group or adjusting the warm pool capacity.</p>
         * <ul>
         * <li>To specify the number of instances in the scaling group, you must specify a value for at least one of the following parameters: MinValue, MaxValue, and DesiredCapacity.</li>
         * <li>To adjust the warm pool capacity, you must configure WarmPoolCapacityOptions.</li>
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
         * <p>The unique identifier of the scaling rule to be executed when the scheduled task is triggered.</p>
         * <p>After you specify ScheduledAction, the scaling method of the scheduled task is set to selecting an existing scaling rule. You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>ari:acs:ess:cn-hangzhou:140692647****:scalingrule/asr-bp12tcnol686y1ik****</p>
         */
        public Builder scheduledAction(String scheduledAction) {
            this.putQueryParameter("ScheduledAction", scheduledAction);
            this.scheduledAction = scheduledAction;
            return this;
        }

        /**
         * <p>The name of the scheduled task. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter, digit, or Chinese character. The name must be unique within the same region and Alibaba Cloud account. </p>
         * <p>Default value: the value of ScheduledTaskId.</p>
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
         * <p>Specifies whether to enable the scheduled task. Valid values: </p>
         * <ul>
         * <li>true: enables the task.</li>
         * <li>false: disables the task.</li>
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
         * <p>The warm pool capacity configurations of the scaling group. This parameter takes effect only when a warm pool is configured for the scaling group.</p>
         * <blockquote>
         * <p>When you configure this parameter, you must specify ScalingGroupId.</p>
         * </blockquote>
         */
        public Builder warmPoolCapacityOptions(WarmPoolCapacityOptions warmPoolCapacityOptions) {
            this.putQueryParameter("WarmPoolCapacityOptions", warmPoolCapacityOptions);
            this.warmPoolCapacityOptions = warmPoolCapacityOptions;
            return this;
        }

        @Override
        public CreateScheduledTaskRequest build() {
            return new CreateScheduledTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
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
             * <p>The expected number of prepared instances to be covered. The system maintains the sum of the current number of instances in the scaling group and the number of instances in the warm pool at this value. Default value: the maximum number of instances in the scaling group, which is specified by MaxSize.</p>
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
