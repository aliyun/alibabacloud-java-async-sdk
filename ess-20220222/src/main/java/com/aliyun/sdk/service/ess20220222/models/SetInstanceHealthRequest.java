// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstanceHealthRequest} extends {@link RequestModel}
 *
 * <p>SetInstanceHealthRequest</p>
 */
public class SetInstanceHealthRequest extends Request {
    @Query
    @NameInMap("HealthStatus")
    @Validation(required = true)
    private String healthStatus;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private SetInstanceHealthRequest(Builder builder) {
        super(builder);
        this.healthStatus = builder.healthStatus;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstanceHealthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<SetInstanceHealthRequest, Builder> {
        private String healthStatus; 
        private String instanceId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(SetInstanceHealthRequest request) {
            super(request);
            this.healthStatus = request.healthStatus;
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * The health status of the ECS instance in the scaling group. If ECS instances do not run as expected, Auto Scaling considers the ECS instances unhealthy. Valid values:
         * <p>
         * 
         * *   Healthy
         * *   Unhealthy
         * 
         * Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.
         * 
         * Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the instance lifecycles. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.
         * 
         * >  Make sure that you have sufficient balance within your Alibaba Cloud account. If you have overdue payments within your Alibaba Cloud account, pay-as-you-go and preemptible instances are stopped or released. For information about how the states of ECS instances change when you have overdue payments within your Alibaba Cloud account, see [Overdue payments](~~170589~~).
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * The ID of the instance.
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        @Override
        public SetInstanceHealthRequest build() {
            return new SetInstanceHealthRequest(this);
        } 

    } 

}
