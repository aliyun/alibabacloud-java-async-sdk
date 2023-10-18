// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateEipAddressBatchRequest} extends {@link RequestModel}
 *
 * <p>AssociateEipAddressBatchRequest</p>
 */
public class AssociateEipAddressBatchRequest extends Request {
    @Query
    @NameInMap("BindedInstanceId")
    @Validation(required = true)
    private String bindedInstanceId;

    @Query
    @NameInMap("BindedInstanceType")
    @Validation(required = true)
    private String bindedInstanceType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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

    private AssociateEipAddressBatchRequest(Builder builder) {
        super(builder);
        this.bindedInstanceId = builder.bindedInstanceId;
        this.bindedInstanceType = builder.bindedInstanceType;
        this.clientToken = builder.clientToken;
        this.instanceIds = builder.instanceIds;
        this.mode = builder.mode;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateEipAddressBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindedInstanceId
     */
    public String getBindedInstanceId() {
        return this.bindedInstanceId;
    }

    /**
     * @return bindedInstanceType
     */
    public String getBindedInstanceType() {
        return this.bindedInstanceType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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

    public static final class Builder extends Request.Builder<AssociateEipAddressBatchRequest, Builder> {
        private String bindedInstanceId; 
        private String bindedInstanceType; 
        private String clientToken; 
        private java.util.List < String > instanceIds; 
        private String mode; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateEipAddressBatchRequest request) {
            super(request);
            this.bindedInstanceId = request.bindedInstanceId;
            this.bindedInstanceType = request.bindedInstanceType;
            this.clientToken = request.clientToken;
            this.instanceIds = request.instanceIds;
            this.mode = request.mode;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ID of the instance with which you want to associate the EIPs.
         * <p>
         * 
         * The instance can be a NAT gateway or a secondary ENI.
         */
        public Builder bindedInstanceId(String bindedInstanceId) {
            this.putQueryParameter("BindedInstanceId", bindedInstanceId);
            this.bindedInstanceId = bindedInstanceId;
            return this;
        }

        /**
         * The type of the instance with which you want to associate the EIPs. Valid values:
         * <p>
         * 
         * *   **Nat**: NAT gateway
         * *   **NetworkInterface**: secondary ENI
         */
        public Builder bindedInstanceType(String bindedInstanceType) {
            this.putQueryParameter("BindedInstanceType", bindedInstanceType);
            this.bindedInstanceType = bindedInstanceType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The EIPs to be associated with the instance.
         * <p>
         * 
         * You must enter at least one EIP. You can enter up to 50 EIPs.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The association mode. Set the value to **MULTI_BINDED**, which specifies the Multi-EIP-to-ENI mode.
         * <p>
         * 
         * This parameter is required only when **BindedInstanceType** is set to **NetworkInterface**.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * The ID of the region to which the EIPs belong. You can call the [DescribeRegions](~~36063~~) operation to query the region ID.
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

        @Override
        public AssociateEipAddressBatchRequest build() {
            return new AssociateEipAddressBatchRequest(this);
        } 

    } 

}
