// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableCenVbrHealthCheckRequest} extends {@link RequestModel}
 *
 * <p>DisableCenVbrHealthCheckRequest</p>
 */
public class DisableCenVbrHealthCheckRequest extends Request {
    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

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
    @NameInMap("VbrInstanceId")
    @Validation(required = true)
    private String vbrInstanceId;

    @Query
    @NameInMap("VbrInstanceOwnerId")
    private Long vbrInstanceOwnerId;

    @Query
    @NameInMap("VbrInstanceRegionId")
    @Validation(required = true)
    private String vbrInstanceRegionId;

    private DisableCenVbrHealthCheckRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vbrInstanceId = builder.vbrInstanceId;
        this.vbrInstanceOwnerId = builder.vbrInstanceOwnerId;
        this.vbrInstanceRegionId = builder.vbrInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableCenVbrHealthCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
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
     * @return vbrInstanceId
     */
    public String getVbrInstanceId() {
        return this.vbrInstanceId;
    }

    /**
     * @return vbrInstanceOwnerId
     */
    public Long getVbrInstanceOwnerId() {
        return this.vbrInstanceOwnerId;
    }

    /**
     * @return vbrInstanceRegionId
     */
    public String getVbrInstanceRegionId() {
        return this.vbrInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<DisableCenVbrHealthCheckRequest, Builder> {
        private String cenId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vbrInstanceId; 
        private Long vbrInstanceOwnerId; 
        private String vbrInstanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DisableCenVbrHealthCheckRequest response) {
            super(response);
            this.cenId = response.cenId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.vbrInstanceId = response.vbrInstanceId;
            this.vbrInstanceOwnerId = response.vbrInstanceOwnerId;
            this.vbrInstanceRegionId = response.vbrInstanceRegionId;
        } 

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
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
         * VbrInstanceId.
         */
        public Builder vbrInstanceId(String vbrInstanceId) {
            this.putQueryParameter("VbrInstanceId", vbrInstanceId);
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }

        /**
         * VbrInstanceOwnerId.
         */
        public Builder vbrInstanceOwnerId(Long vbrInstanceOwnerId) {
            this.putQueryParameter("VbrInstanceOwnerId", vbrInstanceOwnerId);
            this.vbrInstanceOwnerId = vbrInstanceOwnerId;
            return this;
        }

        /**
         * VbrInstanceRegionId.
         */
        public Builder vbrInstanceRegionId(String vbrInstanceRegionId) {
            this.putQueryParameter("VbrInstanceRegionId", vbrInstanceRegionId);
            this.vbrInstanceRegionId = vbrInstanceRegionId;
            return this;
        }

        @Override
        public DisableCenVbrHealthCheckRequest build() {
            return new DisableCenVbrHealthCheckRequest(this);
        } 

    } 

}
