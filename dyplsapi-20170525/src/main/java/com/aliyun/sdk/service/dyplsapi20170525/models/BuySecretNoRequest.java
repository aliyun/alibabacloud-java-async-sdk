// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuySecretNoRequest} extends {@link RequestModel}
 *
 * <p>BuySecretNoRequest</p>
 */
public class BuySecretNoRequest extends Request {
    @Query
    @NameInMap("City")
    @Validation(required = true)
    private String city;

    @Query
    @NameInMap("DisplayPool")
    private Boolean displayPool;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PoolKey")
    @Validation(required = true)
    private String poolKey;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecretNo")
    private String secretNo;

    @Query
    @NameInMap("SpecId")
    @Validation(required = true)
    private Long specId;

    private BuySecretNoRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.displayPool = builder.displayPool;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secretNo = builder.secretNo;
        this.specId = builder.specId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuySecretNoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return displayPool
     */
    public Boolean getDisplayPool() {
        return this.displayPool;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
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
     * @return secretNo
     */
    public String getSecretNo() {
        return this.secretNo;
    }

    /**
     * @return specId
     */
    public Long getSpecId() {
        return this.specId;
    }

    public static final class Builder extends Request.Builder<BuySecretNoRequest, Builder> {
        private String city; 
        private Boolean displayPool; 
        private Long ownerId; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secretNo; 
        private Long specId; 

        private Builder() {
            super();
        } 

        private Builder(BuySecretNoRequest request) {
            super(request);
            this.city = request.city;
            this.displayPool = request.displayPool;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secretNo = request.secretNo;
            this.specId = request.specId;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * DisplayPool.
         */
        public Builder displayPool(Boolean displayPool) {
            this.putQueryParameter("DisplayPool", displayPool);
            this.displayPool = displayPool;
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
         * PoolKey.
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
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
         * SecretNo.
         */
        public Builder secretNo(String secretNo) {
            this.putQueryParameter("SecretNo", secretNo);
            this.secretNo = secretNo;
            return this;
        }

        /**
         * SpecId.
         */
        public Builder specId(Long specId) {
            this.putQueryParameter("SpecId", specId);
            this.specId = specId;
            return this;
        }

        @Override
        public BuySecretNoRequest build() {
            return new BuySecretNoRequest(this);
        } 

    } 

}
