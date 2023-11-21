// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationTasksRequest} extends {@link RequestModel}
 *
 * <p>ModifyActiveOperationTasksRequest</p>
 */
public class ModifyActiveOperationTasksRequest extends Request {
    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private String ids;

    @Query
    @NameInMap("ImmediateStart")
    private Integer immediateStart;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SwitchTime")
    @Validation(required = true)
    private String switchTime;

    private ModifyActiveOperationTasksRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.immediateStart = builder.immediateStart;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
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
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
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
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.switchTime = request.switchTime;
        } 

        /**
         * The ID of the O\&M task. Separate multiple IDs with commas (,).
         * <p>
         * 
         * > You can call the DescribeActiveOperationTask operation to query the IDs of O\&M tasks.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * Specifies whether to immediately start scheduling. The value 0 indicates that scheduling is not immediately started. This is the default value. The value 1 indicates that scheduling is immediately started. If you set this parameter to 0, SwitchTime takes effect. If you set this parameter to 1, SwitchTimer does not take effect. In this case, the start time of the task is set to the current time, and the system determines the switching time based on the start time.
         * <p>
         * 
         * > Immediate scheduling indicates that the task enters the preparation state instead of the immediate switchover. After the preparation is complete, the switchover is performed. You can call the DescribeActiveOperationTasks operation to obtain the period of time for preparation. The period of time for preparation is returned in PrepareInterva.
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The scheduled switching time that you want to specify. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * > The time that you specify cannot be later than the deadline for performing the O\&M task. You can call DescribeActiveOperationTasks to query the deadlines of O\&M tasks. The deadline of a task is returned in Deadline.
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
