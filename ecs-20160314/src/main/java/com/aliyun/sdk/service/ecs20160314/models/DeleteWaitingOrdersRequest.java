// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWaitingOrdersRequest} extends {@link RequestModel}
 *
 * <p>DeleteWaitingOrdersRequest</p>
 */
public class DeleteWaitingOrdersRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private Long resourceGroupId;

    @Query
    @NameInMap("WaitingOrderId")
    private java.util.List < String > waitingOrderId;

    private DeleteWaitingOrdersRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.waitingOrderId = builder.waitingOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWaitingOrdersRequest create() {
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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
    public Long getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return waitingOrderId
     */
    public java.util.List < String > getWaitingOrderId() {
        return this.waitingOrderId;
    }

    public static final class Builder extends Request.Builder<DeleteWaitingOrdersRequest, Builder> {
        private String clientToken; 
        private String ownerAccount; 
        private String regionId; 
        private Long resourceGroupId; 
        private java.util.List < String > waitingOrderId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWaitingOrdersRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.waitingOrderId = request.waitingOrderId;
        } 

        /**
         * 幂等参数
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(Long resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * WaitingOrderId.
         */
        public Builder waitingOrderId(java.util.List < String > waitingOrderId) {
            this.putQueryParameter("WaitingOrderId", waitingOrderId);
            this.waitingOrderId = waitingOrderId;
            return this;
        }

        @Override
        public DeleteWaitingOrdersRequest build() {
            return new DeleteWaitingOrdersRequest(this);
        } 

    } 

}
