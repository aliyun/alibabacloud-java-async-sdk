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
 * {@link ModifyActiveOperationTasksRequest} extends {@link RequestModel}
 *
 * <p>ModifyActiveOperationTasksRequest</p>
 */
public class ModifyActiveOperationTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImmediateStart")
    private Integer immediateStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String switchTime;

    private ModifyActiveOperationTasksRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.immediateStart = builder.immediateStart;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchTime = builder.switchTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return immediateStart
     */
    public Integer getImmediateStart() {
        return this.immediateStart;
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
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    public static final class Builder extends Request.Builder<ModifyActiveOperationTasksRequest, Builder> {
        private String ids; 
        private Integer immediateStart; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String switchTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyActiveOperationTasksRequest request) {
            super(request);
            this.ids = request.ids;
            this.immediateStart = request.immediateStart;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchTime = request.switchTime;
        } 

        /**
         * <p>The IDs of the O&amp;M tasks. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the DescribeActiveOperationTasks operation to retrieve the O&amp;M task IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11111,22222</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>Specifies whether to immediately enter the execution scheduling phase. Valid values:</p>
         * <ul>
         * <li>0: No. This is the default value.</li>
         * <li>1: Yes.<blockquote>
         * <ul>
         * <li>If this parameter is set to 0, SwitchTime takes effect. If this parameter is set to 1, SwitchTime does not take effect, the task start time is set to the current time, and the switchover time is automatically calculated based on the new start time.</li>
         * <li>Immediately entering the execution scheduling phase does not mean an immediate switchover. Instead, the task immediately enters the preparing state, and the switchover is performed after the preparation is complete. You can call the DescribeActiveOperationTasks operation and check the value of the PrepareInterval response parameter to obtain the preparation time.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder immediateStart(Integer immediateStart) {
            this.putQueryParameter("ImmediateStart", immediateStart);
            this.immediateStart = immediateStart;
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
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
         * <p>The scheduled switchover time to be set. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The time cannot be later than the latest operation time. You can call the DescribeActiveOperationTasks operation and check the value of the Deadline response parameter to obtain the latest operation time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-17T18:50:00Z</p>
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        @Override
        public ModifyActiveOperationTasksRequest build() {
            return new ModifyActiveOperationTasksRequest(this);
        } 

    } 

}
