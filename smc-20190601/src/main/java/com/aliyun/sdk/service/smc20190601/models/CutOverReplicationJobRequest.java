// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CutOverReplicationJobRequest} extends {@link RequestModel}
 *
 * <p>CutOverReplicationJobRequest</p>
 */
public class CutOverReplicationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncData")
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

        private Builder(CutOverReplicationJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.syncData = request.syncData;
        } 

        /**
         * <p>The ID of the incremental migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>j-bp1fnx5y3djc4cop****</p>
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
         * <p>Specifies whether to migrate full data for the last time. Valid Values:</p>
         * <ul>
         * <li>true: migrates full data for the last time.</li>
         * <li>false: does not migrate full data for the last time.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
