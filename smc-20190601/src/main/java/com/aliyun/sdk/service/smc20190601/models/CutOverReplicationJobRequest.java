// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CutOverReplicationJobRequest} extends {@link RequestModel}
 *
 * <p>CutOverReplicationJobRequest</p>
 */
public class CutOverReplicationJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("SyncData")
    private Boolean syncData;

    private CutOverReplicationJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.syncData = builder.syncData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CutOverReplicationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return syncData
     */
    public Boolean getSyncData() {
        return this.syncData;
    }

    public static final class Builder extends Request.Builder<CutOverReplicationJobRequest, Builder> {
        private String jobId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Boolean syncData; 

        private Builder() {
            super();
        } 

        private Builder(CutOverReplicationJobRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.syncData = response.syncData;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
         * SyncData.
         */
        public Builder syncData(Boolean syncData) {
            this.putQueryParameter("SyncData", syncData);
            this.syncData = syncData;
            return this;
        }

        @Override
        public CutOverReplicationJobRequest build() {
            return new CutOverReplicationJobRequest(this);
        } 

    } 

}
