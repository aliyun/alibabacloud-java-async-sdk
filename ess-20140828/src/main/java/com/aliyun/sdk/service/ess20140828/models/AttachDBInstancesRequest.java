// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDBInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachDBInstancesRequest</p>
 */
public class AttachDBInstancesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstance")
    @Validation(required = true)
    private java.util.List < String > DBInstance;

    @Query
    @NameInMap("ForceAttach")
    private Boolean forceAttach;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    private AttachDBInstancesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstance = builder.DBInstance;
        this.forceAttach = builder.forceAttach;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDBInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstance
     */
    public java.util.List < String > getDBInstance() {
        return this.DBInstance;
    }

    /**
     * @return forceAttach
     */
    public Boolean getForceAttach() {
        return this.forceAttach;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<AttachDBInstancesRequest, Builder> {
        private String clientToken; 
        private java.util.List < String > DBInstance; 
        private Boolean forceAttach; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDBInstancesRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.DBInstance = response.DBInstance;
            this.forceAttach = response.forceAttach;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingGroupId = response.scalingGroupId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DBInstance.
         */
        public Builder DBInstance(java.util.List < String > DBInstance) {
            this.putQueryParameter("DBInstance", DBInstance);
            this.DBInstance = DBInstance;
            return this;
        }

        /**
         * ForceAttach.
         */
        public Builder forceAttach(Boolean forceAttach) {
            this.putQueryParameter("ForceAttach", forceAttach);
            this.forceAttach = forceAttach;
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public AttachDBInstancesRequest build() {
            return new AttachDBInstancesRequest(this);
        } 

    } 

}
