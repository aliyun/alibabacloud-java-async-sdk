// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobReplicatorCompareRequest} extends {@link RequestModel}
 *
 * <p>DescribeSynchronizationJobReplicatorCompareRequest</p>
 */
public class DescribeSynchronizationJobReplicatorCompareRequest extends Request {
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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    private DescribeSynchronizationJobReplicatorCompareRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobReplicatorCompareRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<DescribeSynchronizationJobReplicatorCompareRequest, Builder> {
        private String accountId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSynchronizationJobReplicatorCompareRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.synchronizationDirection = request.synchronizationDirection;
            this.synchronizationJobId = request.synchronizationJobId;
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The **ClientToken** parameter can contain only ASCII characters and cannot exceed 64 characters in length.
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The ID of the data synchronization instance. You can call the [DescribeSynchronizationJobs](~~49454~~) operation to query the instance ID.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        @Override
        public DescribeSynchronizationJobReplicatorCompareRequest build() {
            return new DescribeSynchronizationJobReplicatorCompareRequest(this);
        } 

    } 

}
