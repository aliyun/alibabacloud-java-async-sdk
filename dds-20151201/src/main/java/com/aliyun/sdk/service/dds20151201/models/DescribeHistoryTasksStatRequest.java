// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryTasksStatRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryTasksStatRequest</p>
 */
public class DescribeHistoryTasksStatRequest extends Request {
    @Query
    @NameInMap("FromExecTime")
    private Integer fromExecTime;

    @Query
    @NameInMap("FromStartTime")
    @Validation(required = true)
    private String fromStartTime;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    @Query
    @NameInMap("ToExecTime")
    private Integer toExecTime;

    @Query
    @NameInMap("ToStartTime")
    @Validation(required = true)
    private String toStartTime;

    private DescribeHistoryTasksStatRequest(Builder builder) {
        super(builder);
        this.fromExecTime = builder.fromExecTime;
        this.fromStartTime = builder.fromStartTime;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
        this.toExecTime = builder.toExecTime;
        this.toStartTime = builder.toStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryTasksStatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromExecTime
     */
    public Integer getFromExecTime() {
        return this.fromExecTime;
    }

    /**
     * @return fromStartTime
     */
    public String getFromStartTime() {
        return this.fromStartTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return toExecTime
     */
    public Integer getToExecTime() {
        return this.toExecTime;
    }

    /**
     * @return toStartTime
     */
    public String getToStartTime() {
        return this.toStartTime;
    }

    public static final class Builder extends Request.Builder<DescribeHistoryTasksStatRequest, Builder> {
        private Integer fromExecTime; 
        private String fromStartTime; 
        private String instanceId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 
        private String taskId; 
        private String taskType; 
        private Integer toExecTime; 
        private String toStartTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHistoryTasksStatRequest request) {
            super(request);
            this.fromExecTime = request.fromExecTime;
            this.fromStartTime = request.fromStartTime;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
            this.toExecTime = request.toExecTime;
            this.toStartTime = request.toStartTime;
        } 

        /**
         * The minimum execution duration of the task. This parameter is used to filter tasks whose execution duration is longer than the minimum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed for the query.
         */
        public Builder fromExecTime(Integer fromExecTime) {
            this.putQueryParameter("FromExecTime", fromExecTime);
            this.fromExecTime = fromExecTime;
            return this;
        }

        /**
         * The start time of the O\&M task to perform. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data within the last 30 days.
         */
        public Builder fromStartTime(String fromStartTime) {
            this.putQueryParameter("FromStartTime", fromStartTime);
            this.fromStartTime = fromStartTime;
            return this;
        }

        /**
         * The instance ID. Separate multiple instance IDs with commas (,). You can specify up to 30 instance IDs. This parameter is empty by default, which indicates that the tasks of all instances are queried.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the pending event. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.
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
         * The task status. Valid values:
         * <p>
         * 
         * *   Scheduled: The task is waiting to be executed.
         * *   Running: The task is running.
         * *   Succeed: The task is successful.
         * *   Failed: The task failed.
         * *   Cancelling: The task is being terminated.
         * *   Canceled: The task has been terminated.
         * *   Waiting: The task is waiting for scheduled time.
         * 
         * Separate multiple states with commas (,). This parameter is empty by default, which indicates that tasks in all states are queried.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The task ID. Separate multiple task IDs with commas (,). You can specify up to 30 task IDs. This parameter is empty by default, which indicates that all tasks are queried.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The task type. This parameter is left empty by default, which indicates that all types of tasks are queried. Valid values:
         * <p>
         * 
         * *   CreateIns: Create an instance.
         * *   DeleteIns: Delete an instance.
         * *   ChangeVariable: Modify parameter settings for an instance.
         * *   ModifyInsConfig: Change the configurations of an instance.
         * *   RestartIns: Restart an instance.
         * *   HaSwitch: Perform a primary/secondary switchover on an instance.
         * *   CloneIns: Clone an instance.
         * *   KernelVersionUpgrade: Update the minor version of an instance.
         * *   ProxyVersionUpgrade: Upgrade the agent version of an instance.
         * *   ModifyAccount: Change the account of an instance.
         * *   ModifyInsSpec: Change the specifications of an instance or perform a data migration on the instance.
         * *   CreateReadIns: Create a read-only instance.
         * *   StartIns: Start an instance.
         * *   StopIns: Stop an instance.
         * *   ModifyNetwork: Modify the network type for an instance.
         * *   LockIns: Lock an instance.
         * *   UnlockIns: Unlock an instance.
         * *   DiskOnlineExpansion: Scale out the disks of an instance online.
         * *   StorageOnlineExpansion: Expend the storage capacity of an instance online.
         * *   AddInsNode: Add a node to an instance.
         * *   DeleteInsNode: Delete a node from an instance.
         * *   ManualBackupIns: Manually back up an instance.
         * *   ModifyInsStorageType: Modify the storage type for an instance.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * The maximum execution duration of the task. This parameter is used to filter tasks whose execution duration is shorter than or equal to the maximum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed for the query.
         */
        public Builder toExecTime(Integer toExecTime) {
            this.putQueryParameter("ToExecTime", toExecTime);
            this.toExecTime = toExecTime;
            return this;
        }

        /**
         * The end time of the O\&M task to perform. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data within the last 30 days.
         */
        public Builder toStartTime(String toStartTime) {
            this.putQueryParameter("ToStartTime", toStartTime);
            this.toStartTime = toStartTime;
            return this;
        }

        @Override
        public DescribeHistoryTasksStatRequest build() {
            return new DescribeHistoryTasksStatRequest(this);
        } 

    } 

}
