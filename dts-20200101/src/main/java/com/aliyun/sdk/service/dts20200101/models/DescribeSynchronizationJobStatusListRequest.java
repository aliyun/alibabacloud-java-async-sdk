// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobStatusListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSynchronizationJobStatusListRequest</p>
 */
public class DescribeSynchronizationJobStatusListRequest extends Request {
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
    @NameInMap("SynchronizationJobIdListJsonStr")
    @Validation(required = true)
    private String synchronizationJobIdListJsonStr;

    private DescribeSynchronizationJobStatusListRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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
        private String synchronizationJobIdListJsonStr; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSynchronizationJobStatusListRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.clientToken = response.clientToken;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.synchronizationJobIdListJsonStr = response.synchronizationJobIdListJsonStr;
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
         * SynchronizationJobIdListJsonStr.
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
