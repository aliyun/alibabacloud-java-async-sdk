// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeHistoryTasksStatRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryTasksStatRequest</p>
 */
public class DescribeHistoryTasksStatRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

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

    private DescribeHistoryTasksStatRequest(Builder builder) {
        super(builder);
        this.fromExecTime = builder.fromExecTime;
        this.fromStartTime = builder.fromStartTime;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<DescribeHistoryTasksStatRequest, Builder> {
        private Integer fromExecTime; 
        private String fromStartTime; 
        private String instanceId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
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

        private Builder(DescribeHistoryTasksStatRequest request) {
            super(request);
            this.fromExecTime = request.fromExecTime;
            this.fromStartTime = request.fromStartTime;
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
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
         * FromExecTime.
         */
        public Builder fromExecTime(Integer fromExecTime) {
            this.putQueryParameter("FromExecTime", fromExecTime);
            this.fromExecTime = fromExecTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02T11:31:03Z</p>
         */
        public Builder fromStartTime(String fromStartTime) {
            this.putQueryParameter("FromStartTime", fromStartTime);
            this.fromStartTime = fromStartTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>This parameter is required.</p>
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * ToExecTime.
         */
        public Builder toExecTime(Integer toExecTime) {
            this.putQueryParameter("ToExecTime", toExecTime);
            this.toExecTime = toExecTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-03T12:31:03Z</p>
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
