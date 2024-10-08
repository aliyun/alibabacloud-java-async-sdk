// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelRestoreJobRequest} extends {@link RequestModel}
 *
 * <p>CancelRestoreJobRequest</p>
 */
public class CancelRestoreJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vaultId;

    private CancelRestoreJobRequest(Builder builder) {
        super(builder);
        this.restoreId = builder.restoreId;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRestoreJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return restoreId
     */
    public String getRestoreId() {
        return this.restoreId;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<CancelRestoreJobRequest, Builder> {
        private String restoreId; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CancelRestoreJobRequest request) {
            super(request);
            this.restoreId = request.restoreId;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The ID of the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>r-*********************</p>
         */
        public Builder restoreId(String restoreId) {
            this.putQueryParameter("RestoreId", restoreId);
            this.restoreId = restoreId;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public CancelRestoreJobRequest build() {
            return new CancelRestoreJobRequest(this);
        } 

    } 

}
