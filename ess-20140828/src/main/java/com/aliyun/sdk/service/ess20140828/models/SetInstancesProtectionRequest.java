// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstancesProtectionRequest} extends {@link RequestModel}
 *
 * <p>SetInstancesProtectionRequest</p>
 */
public class SetInstancesProtectionRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProtectedFromScaleIn")
    @Validation(required = true)
    private Boolean protectedFromScaleIn;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    private SetInstancesProtectionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.protectedFromScaleIn = builder.protectedFromScaleIn;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstancesProtectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return protectedFromScaleIn
     */
    public Boolean getProtectedFromScaleIn() {
        return this.protectedFromScaleIn;
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

    public static final class Builder extends Request.Builder<SetInstancesProtectionRequest, Builder> {
        private java.util.List < String > instanceId; 
        private Long ownerId; 
        private Boolean protectedFromScaleIn; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(SetInstancesProtectionRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.ownerId = response.ownerId;
            this.protectedFromScaleIn = response.protectedFromScaleIn;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingGroupId = response.scalingGroupId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
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
         * ProtectedFromScaleIn.
         */
        public Builder protectedFromScaleIn(Boolean protectedFromScaleIn) {
            this.putQueryParameter("ProtectedFromScaleIn", protectedFromScaleIn);
            this.protectedFromScaleIn = protectedFromScaleIn;
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public SetInstancesProtectionRequest build() {
            return new SetInstancesProtectionRequest(this);
        } 

    } 

}
