// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySynchronizationObjectRequest} extends {@link RequestModel}
 *
 * <p>ModifySynchronizationObjectRequest</p>
 */
public class ModifySynchronizationObjectRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

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

    @Body
    @NameInMap("SynchronizationObjects")
    @Validation(required = true)
    private String synchronizationObjects;

    private ModifySynchronizationObjectRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
        this.synchronizationObjects = builder.synchronizationObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySynchronizationObjectRequest create() {
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
     * @return synchronizationObjects
     */
    public String getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    public static final class Builder extends Request.Builder<ModifySynchronizationObjectRequest, Builder> {
        private String accountId; 
        private String ownerId; 
        private String regionId; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 
        private String synchronizationObjects; 

        private Builder() {
            super();
        } 

        private Builder(ModifySynchronizationObjectRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.synchronizationDirection = request.synchronizationDirection;
            this.synchronizationJobId = request.synchronizationJobId;
            this.synchronizationObjects = request.synchronizationObjects;
        } 

        /**
         * The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
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
         * The synchronization direction. Valid values:
         * <p>
         * 
         * *   **Forward**
         * *   **Reverse**
         * 
         * > 
         * *   Default value: **Forward**.
         * *   This parameter is required only when the topology of the data synchronization instance is two-way synchronization.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * The ID of the data synchronization instance. You can call the DescribeSynchronizationJobs operation to query the instance ID.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * SynchronizationObjects.
         */
        public Builder synchronizationObjects(String synchronizationObjects) {
            this.putBodyParameter("SynchronizationObjects", synchronizationObjects);
            this.synchronizationObjects = synchronizationObjects;
            return this;
        }

        @Override
        public ModifySynchronizationObjectRequest build() {
            return new ModifySynchronizationObjectRequest(this);
        } 

    } 

}
