// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelBackupJobRequest} extends {@link RequestModel}
 *
 * <p>CancelBackupJobRequest</p>
 */
public class CancelBackupJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private CancelBackupJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelBackupJobRequest create() {
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
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<CancelBackupJobRequest, Builder> {
        private String jobId; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CancelBackupJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.vaultId = request.vaultId;
        } 

        /**
         * The ID of the backup job.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public CancelBackupJobRequest build() {
            return new CancelBackupJobRequest(this);
        } 

    } 

}
