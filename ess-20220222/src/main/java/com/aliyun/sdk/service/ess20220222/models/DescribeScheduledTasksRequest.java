// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScheduledTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeScheduledTasksRequest</p>
 */
public class DescribeScheduledTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer pageSize;

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
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledActions")
    private java.util.List < String > scheduledActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTaskIds")
    private java.util.List < String > scheduledTaskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTaskNames")
    private java.util.List < String > scheduledTaskNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskEnabled")
    private Boolean taskEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private DescribeScheduledTasksRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recurrenceType = builder.recurrenceType;
        this.recurrenceValue = builder.recurrenceValue;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scheduledActions = builder.scheduledActions;
        this.scheduledTaskIds = builder.scheduledTaskIds;
        this.scheduledTaskNames = builder.scheduledTaskNames;
        this.taskEnabled = builder.taskEnabled;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduledTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return scheduledActions
     */
    public java.util.List < String > getScheduledActions() {
        return this.scheduledActions;
    }

    /**
     * @return scheduledTaskIds
     */
    public java.util.List < String > getScheduledTaskIds() {
        return this.scheduledTaskIds;
    }

    /**
     * @return scheduledTaskNames
     */
    public java.util.List < String > getScheduledTaskNames() {
        return this.scheduledTaskNames;
    }

    /**
     * @return taskEnabled
     */
    public Boolean getTaskEnabled() {
        return this.taskEnabled;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DescribeScheduledTasksRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String recurrenceType; 
        private String recurrenceValue; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 
        private java.util.List < String > scheduledActions; 
        private java.util.List < String > scheduledTaskIds; 
        private java.util.List < String > scheduledTaskNames; 
        private Boolean taskEnabled; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScheduledTasksRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.recurrenceType = request.recurrenceType;
            this.recurrenceValue = request.recurrenceValue;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
            this.scheduledActions = request.scheduledActions;
            this.scheduledTaskIds = request.scheduledTaskIds;
            this.scheduledTaskNames = request.scheduledTaskNames;
            this.taskEnabled = request.taskEnabled;
            this.taskName = request.taskName;
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
         * <p>The page number. Pages start from page 1.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * <p>The region ID of the scaling group to which the scheduled task belongs.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the scaling group to which the scheduled task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1bo5tca4m56nap****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The scaling rules of the scheduled tasks. Once the scheduled tasks are triggered, the scaling rules are executed.</p>
         */
        public Builder scheduledActions(java.util.List < String > scheduledActions) {
            this.putQueryParameter("ScheduledActions", scheduledActions);
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * <p>The IDs of the scheduled tasks that you want to query.</p>
         */
        public Builder scheduledTaskIds(java.util.List < String > scheduledTaskIds) {
            this.putQueryParameter("ScheduledTaskIds", scheduledTaskIds);
            this.scheduledTaskIds = scheduledTaskIds;
            return this;
        }

        /**
         * <p>The names of the scheduled tasks that you want to query.</p>
         */
        public Builder scheduledTaskNames(java.util.List < String > scheduledTaskNames) {
            this.putQueryParameter("ScheduledTaskNames", scheduledTaskNames);
            this.scheduledTaskNames = scheduledTaskNames;
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

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DescribeScheduledTasksRequest build() {
            return new DescribeScheduledTasksRequest(this);
        } 

    } 

}
