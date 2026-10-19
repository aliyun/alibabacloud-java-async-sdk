// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private Long resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

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
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
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
     * @return resourceOwnerAccount
     */
    public Long getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
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
        private Long resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
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
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.status = request.status;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
            this.toExecTime = request.toExecTime;
            this.toStartTime = request.toStartTime;
        } 

        /**
         * <p>The minimum execution duration. This parameter is used to filter tasks whose execution duration is greater than the specified value. Unit: seconds. Default value: 0, which indicates no restriction.</p>
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
         * <p>The earliest start time for querying tasks. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC). You can query data from up to 30 days ago.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-02T11:31:03Z</p>
         */
        public Builder fromStartTime(String fromStartTime) {
            this.putQueryParameter("FromStartTime", fromStartTime);
            this.fromStartTime = fromStartTime;
            return this;
        }

        /**
         * <p>The instance ID. This parameter is used to query tasks for the specified instance. The default value is empty, which indicates no restriction. To specify multiple instances, separate them with commas (,). A maximum of 30 instances are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>r-uf62br2491p5l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Currently fixed as Instance.</p>
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
         * <p>The page number of the query results. Valid values: positive integers. Default value: 1.</p>
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
         * <p>The region ID of the pending event. You can call <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> to query the region ID.</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(Long resourceOwnerAccount) {
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The task status. This parameter is used to filter tasks by status. Valid values:</p>
         * <ul>
         * <li><strong>Scheduled</strong>: Waiting for execution.</li>
         * <li><strong>Running</strong>: Running.</li>
         * <li><strong>Succeed</strong>: Succeeded.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Cancelling</strong>: Being stopped.</li>
         * <li><strong>Canceled</strong>: Stopped.</li>
         * <li><strong>Waiting</strong>: Waiting for the scheduled time.<blockquote>
         * <p>The default value is empty, which indicates all statuses. To specify multiple statuses, separate them with commas (,).</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID. This parameter is used to query tasks with known IDs. The default value is empty, which indicates no restriction. To specify multiple task IDs, separate them with commas (,). A maximum of 30 task IDs are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>t-83br18hloy3faf****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task type. This parameter is used to query tasks of a specific type. The default value is empty, which indicates no restriction. Valid values:</p>
         * <ul>
         * <li><strong>ModifyInsSpec</strong>: Specification change or migration.</li>
         * <li><strong>DeleteInsNode</strong>: Shard deletion.</li>
         * <li><strong>AddInsNode</strong>: Shard addition.</li>
         * <li><strong>HaSwitch</strong>: Primary/secondary switchover.</li>
         * <li><strong>RestartIns</strong>: Instance restart.</li>
         * <li><strong>CreateIns</strong>: Instance creation.</li>
         * <li><strong>ModifyInsConfig</strong>: Configuration change.<blockquote>
         * <p>To specify multiple task types, separate them with commas (,).</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ModifyInsSpec</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The maximum execution duration. This parameter is used to filter tasks whose execution duration is not less than the specified value. Unit: seconds. Default value: 0, which indicates no restriction.</p>
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
         * <p>The latest start time for querying tasks. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC). The value must be later than the earliest start time of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-02T11:31:03Z</p>
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
