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
         * <p>The expected number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
         * <blockquote>
         * <p>You must specify the <code>DesiredCapacity</code> parameter when you create a scaling group.</p>
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
         * <p>The time period during which the failed scheduled task is retried. Unit: seconds. Valid values: 0 to 1800.</p>
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
         * <p>The point in time at which the scheduled task is triggered. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot enter a time point later than 90 days from the point in time at which the scheduled task is modified.</p>
         * <ul>
         * <li>If you specify the <code>RecurrenceType</code> parameter, the task is repeatedly executed at the time point that is specified by the LaunchTime parameter.</li>
         * <li>If you do not specify the <code>RecurrenceType</code> parameter, the task is executed only once at the point in time that is specified by the LaunchTime parameter.</li>
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
         * <p>The maximum number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
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
         * <p>The minimum number of instances in the scaling group if you specify the ScalingGroupId parameter.</p>
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
         * <p>The end time of the scheduled task. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. You cannot enter a point in time that is later than 365 days from the point in time at which the scheduled task is modified.</p>
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
         * <p>The interval at which the scheduled task is repeated. Valid values:</p>
         * <ul>
         * <li>Daily: The scheduled task is executed once every specified number of days.</li>
         * <li>Weekly: The scheduled task is executed on each specified day of the week.</li>
         * <li>Monthly: The scheduled task is executed on each specified day of the month.</li>
         * <li>Cron: The scheduled task is executed based on the specified cron expression.</li>
         * </ul>
         * <p>After you modify the scheduled task, the values that you specify for the <code>RecurrenceType</code> and <code>RecurrenceValue</code> parameters must be valid at the same time.</p>
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
         * <p>The number of recurrences of the scheduled task.</p>
         * <ul>
         * <li>If you set the <code>RecurrenceType</code> parameter to <code>Daily</code>, you can specify only one value for this parameter. Valid values: 1 to 31.</li>
         * <li>If you set the <code>RecurrenceType</code> parameter to <code>Weekly</code>, you can specify multiple values for this parameter. Separate the values with commas (,). The values that correspond to Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6.``</li>
         * <li>If you set the <code>RecurrenceType</code> parameter to <code>Monthly</code>, you can specify two values in the <code>A-B</code> format for this parameter. Valid values of A and B: 1 to 31. B must be greater than or equal to A.</li>
         * <li>If you set the <code>RecurrenceType</code> parameter to <code>Cron</code>, you can specify a cron expression. A cron expression is written in UTC time and consists of the following fields: minute, hour, day, month, and week. The expression can contain the letters L and W and the following wildcard characters: commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), and forward slashes (/).</li>
         * </ul>
         * <p>After you modify the scheduled task, the values that you specify for the <code>RecurrenceType</code> and <code>RecurrenceValue</code> parameters must be valid at the same time.</p>
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
         * <p>The ID of the scaling group whose number of instances must be modified when the scheduled task is triggered. If you specify the <code>ScalingGroupId</code> parameter for a scheduled task, you must specify the minimum, maximum, or expected numbers of instances for a scaling group in the scheduled task. That is, you must specify at least one of the <code>MinValue</code>, <code>MaxValue</code>, and <code>DesiredCapacity</code> parameters.</p>
         * <blockquote>
         * <p>You cannot specify the <code>ScheduledAction</code> and <code>ScalingGroupId</code> parameters at the same time.</p>
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
         * <p>The scaling rule that you want to execute when the scheduled task is triggered. Enter the ID of the scaling rule. To obtain the ID of a scaling rule, go to the scaling rule details page. If you specify <code>ScheduledAction</code>, you must select an existing scaling rule for the scheduled task.</p>
         * <blockquote>
         * <p> You can specify only one of <code>ScheduledAction</code> and <code>ScalingGroupId</code>.</p>
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
         * <p>The name of the scheduled task. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or a digit. The name of the scheduled task must be unique in the region and within the Alibaba Cloud account.</p>
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
         * <li>true</li>
         * <li>false</li>
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

        @Override
        public ModifyScheduledTaskRequest build() {
            return new ModifyScheduledTaskRequest(this);
        } 

    } 

}
