// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeHistoryTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryTasksRequest</p>
 */
public class DescribeHistoryTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromExecTime")
    private Integer fromExecTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToExecTime")
    private Integer toExecTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toStartTime;

    private DescribeHistoryTasksRequest(Builder builder) {
        super(builder);
        this.fromExecTime = builder.fromExecTime;
        this.fromStartTime = builder.fromStartTime;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
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

    public static DescribeHistoryTasksRequest create() {
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<DescribeHistoryTasksRequest, Builder> {
        private Integer fromExecTime; 
        private String fromStartTime; 
        private String instanceId; 
        private String instanceType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
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

        private Builder(DescribeHistoryTasksRequest request) {
            super(request);
            this.fromExecTime = request.fromExecTime;
            this.fromStartTime = request.fromStartTime;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
            this.toExecTime = request.toExecTime;
            this.toStartTime = request.toStartTime;
        } 

        /**
         * <p>The minimum execution duration of the task. This parameter is used to filter tasks whose execution duration is longer than the minimum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder fromExecTime(Integer fromExecTime) {
            this.putQueryParameter("FromExecTime", fromExecTime);
            this.fromExecTime = fromExecTime;
            return this;
        }

        /**
         * <p>The start time of the O\&amp;M task to perform. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data within the last 30 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-15T03:41:26Z</p>
         */
        public Builder fromStartTime(String fromStartTime) {
            this.putQueryParameter("FromStartTime", fromStartTime);
            this.fromStartTime = fromStartTime;
            return this;
        }

        /**
         * <p>The instance ID. Separate multiple instance IDs with commas (,). You can specify up to 30 instance IDs. This parameter is empty by default, which indicates that tasks of all instances are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-8vb38f0e7933xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance type of the instance. Set the value to Instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The number of the page to return. The value must be a positive integer. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 10 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the pending event. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2inrfrnw3xby</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><p>Scheduled: The task is waiting to be executed.</p>
         * </li>
         * <li><p>Running: The task is running.</p>
         * </li>
         * <li><p>Succeed: The task is successful.</p>
         * </li>
         * <li><p>Failed: The task failed.</p>
         * </li>
         * <li><p>Cancelling: The task is being terminated.</p>
         * </li>
         * <li><p>Canceled: The task has been terminated.</p>
         * </li>
         * <li><p>Waiting: The task is waiting for scheduled time.</p>
         * </li>
         * </ul>
         * <p>Separate multiple states with commas (,). This parameter is empty by default, which indicates that tasks in all states are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeed,Running,Waiting</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID. Separate multiple task IDs with commas (,). You can specify up to 30 task IDs. This parameter is empty by default, which indicates that all tasks are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>t-0mq1yyhm3ffl2bxxxx</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task type. This parameter is left empty by default, which indicates that all types of tasks are queried. Valid values:</p>
         * <ul>
         * <li><p>CreateIns: Create an instance.</p>
         * </li>
         * <li><p>DeleteIns: Delete an instance.</p>
         * </li>
         * <li><p>ChangeVariable: Modify parameter settings for an instance.</p>
         * </li>
         * <li><p>ModifyInsConfig: Change the configurations of an instance.</p>
         * </li>
         * <li><p>RestartIns: Restart an instance.</p>
         * </li>
         * <li><p>HaSwitch: Perform a primary/secondary switchover on an instance.</p>
         * </li>
         * <li><p>CloneIns: Clone an instance.</p>
         * </li>
         * <li><p>KernelVersionUpgrade: Update the minor version of an instance.</p>
         * </li>
         * <li><p>ProxyVersionUpgrade: Upgrade the agent version of an instance.</p>
         * </li>
         * <li><p>ModifyAccount: Change the account of an instance.</p>
         * </li>
         * <li><p>ModifyInsSpec: Change the specifications of an instance or perform a data migration on the instance.</p>
         * </li>
         * <li><p>CreateReadIns: Create a read-only instance.</p>
         * </li>
         * <li><p>StartIns: Start an instance.</p>
         * </li>
         * <li><p>StopIns: Stop an instance.</p>
         * </li>
         * <li><p>ModifyNetwork: Modify the network type for an instance.</p>
         * </li>
         * <li><p>LockIns: Lock an instance.</p>
         * </li>
         * <li><p>UnlockIns: Unlock an instance.</p>
         * </li>
         * <li><p>DiskOnlineExpansion: Scale out the disks of an instance online.</p>
         * </li>
         * <li><p>StorageOnlineExpansion: Expend the storage capacity of an instance online.</p>
         * </li>
         * <li><p>AddInsNode: Add a node to an instance.</p>
         * </li>
         * <li><p>DeleteInsNode: Delete a node from an instance.</p>
         * </li>
         * <li><p>ManualBackupIns: Manually back up an instance.</p>
         * </li>
         * <li><p>ModifyInsStorageType: Modify the storage type for an instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DeleteInsNode</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The maximum execution duration of the task. This parameter is used to filter tasks whose execution duration is shorter than or equal to the maximum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder toExecTime(Integer toExecTime) {
            this.putQueryParameter("ToExecTime", toExecTime);
            this.toExecTime = toExecTime;
            return this;
        }

        /**
         * <p>The end time of the O\&amp;M task to perform. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data within the last 30 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-16T07:21:31Z</p>
         */
        public Builder toStartTime(String toStartTime) {
            this.putQueryParameter("ToStartTime", toStartTime);
            this.toStartTime = toStartTime;
            return this;
        }

        @Override
        public DescribeHistoryTasksRequest build() {
            return new DescribeHistoryTasksRequest(this);
        } 

    } 

}
