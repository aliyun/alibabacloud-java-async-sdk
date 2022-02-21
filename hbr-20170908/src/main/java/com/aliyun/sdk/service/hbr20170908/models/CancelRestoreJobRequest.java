// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRestoreJobRequest} extends {@link RequestModel}
 *
 * <p>CancelRestoreJobRequest</p>
 */
public class CancelRestoreJobRequest extends Request {
    @Query
    @NameInMap("RestoreId")
    @Validation(required = true)
    private String restoreId;

    @Query
    @NameInMap("VaultId")
    @Validation(required = true)
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

        private Builder(CancelRestoreJobRequest response) {
            super(response);
            this.restoreId = response.restoreId;
            this.vaultId = response.vaultId;
        } 

        /**
         * RestoreId.
         */
        public Builder restoreId(String restoreId) {
            this.putQueryParameter("RestoreId", restoreId);
            this.restoreId = restoreId;
            return this;
        }

        /**
         * VaultId.
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
