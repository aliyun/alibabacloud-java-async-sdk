// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSynchronizationJobReplicatorCompareRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSynchronizationJobReplicatorCompareRequest</p>
 */
public class ConfigureSynchronizationJobReplicatorCompareRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    @Query
    @NameInMap("SynchronizationReplicatorCompareEnable")
    private Boolean synchronizationReplicatorCompareEnable;

    private ConfigureSynchronizationJobReplicatorCompareRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
        this.synchronizationReplicatorCompareEnable = builder.synchronizationReplicatorCompareEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSynchronizationJobReplicatorCompareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    /**
     * @return synchronizationReplicatorCompareEnable
     */
    public Boolean getSynchronizationReplicatorCompareEnable() {
        return this.synchronizationReplicatorCompareEnable;
    }

    public static final class Builder extends Request.Builder<ConfigureSynchronizationJobReplicatorCompareRequest, Builder> {
        private String accountId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 
        private Boolean synchronizationReplicatorCompareEnable; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSynchronizationJobReplicatorCompareRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.clientToken = response.clientToken;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.synchronizationDirection = response.synchronizationDirection;
            this.synchronizationJobId = response.synchronizationJobId;
            this.synchronizationReplicatorCompareEnable = response.synchronizationReplicatorCompareEnable;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * SynchronizationDirection.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * SynchronizationJobId.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * SynchronizationReplicatorCompareEnable.
         */
        public Builder synchronizationReplicatorCompareEnable(Boolean synchronizationReplicatorCompareEnable) {
            this.putQueryParameter("SynchronizationReplicatorCompareEnable", synchronizationReplicatorCompareEnable);
            this.synchronizationReplicatorCompareEnable = synchronizationReplicatorCompareEnable;
            return this;
        }

        @Override
        public ConfigureSynchronizationJobReplicatorCompareRequest build() {
            return new ConfigureSynchronizationJobReplicatorCompareRequest(this);
        } 

    } 

}
