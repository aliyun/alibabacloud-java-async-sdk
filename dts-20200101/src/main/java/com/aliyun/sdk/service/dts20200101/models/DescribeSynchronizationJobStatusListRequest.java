// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobStatusListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSynchronizationJobStatusListRequest</p>
 */
public class DescribeSynchronizationJobStatusListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationJobIdListJsonStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String synchronizationJobIdListJsonStr;

    private DescribeSynchronizationJobStatusListRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.synchronizationJobIdListJsonStr = builder.synchronizationJobIdListJsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobStatusListRequest create() {
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
     * @return synchronizationJobIdListJsonStr
     */
    public String getSynchronizationJobIdListJsonStr() {
        return this.synchronizationJobIdListJsonStr;
    }

    public static final class Builder extends Request.Builder<DescribeSynchronizationJobStatusListRequest, Builder> {
        private String accountId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String synchronizationJobIdListJsonStr; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSynchronizationJobStatusListRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.synchronizationJobIdListJsonStr = request.synchronizationJobIdListJsonStr;
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
         * The IDs of the data synchronization instances. The value is a JSON array. You can call the [DescribeSynchronizationJobs](~~49454~~) operation to query the instance IDs.
         */
        public Builder synchronizationJobIdListJsonStr(String synchronizationJobIdListJsonStr) {
            this.putQueryParameter("SynchronizationJobIdListJsonStr", synchronizationJobIdListJsonStr);
            this.synchronizationJobIdListJsonStr = synchronizationJobIdListJsonStr;
            return this;
        }

        @Override
        public DescribeSynchronizationJobStatusListRequest build() {
            return new DescribeSynchronizationJobStatusListRequest(this);
        } 

    } 

}
