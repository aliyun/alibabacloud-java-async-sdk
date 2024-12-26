// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateVaultRequest} extends {@link RequestModel}
 *
 * <p>UpdateVaultRequest</p>
 */
public class UpdateVaultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vaultId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultName")
    private String vaultName;

    private UpdateVaultRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.resourceGroupId = builder.resourceGroupId;
        this.vaultId = builder.vaultId;
        this.vaultName = builder.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVaultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    /**
     * @return vaultName
     */
    public String getVaultName() {
        return this.vaultName;
    }

    public static final class Builder extends Request.Builder<UpdateVaultRequest, Builder> {
        private String description; 
        private String resourceGroupId; 
        private String vaultId; 
        private String vaultName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVaultRequest request) {
            super(request);
            this.description = request.description;
            this.resourceGroupId = request.resourceGroupId;
            this.vaultId = request.vaultId;
            this.vaultName = request.vaultName;
        } 

        /**
         * <p>The description of the backup vault. The description must be 0 to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>vault description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2fa2xeiebyy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        /**
         * <p>The name of the backup vault. The name must be 1 to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>vaultname</p>
         */
        public Builder vaultName(String vaultName) {
            this.putQueryParameter("VaultName", vaultName);
            this.vaultName = vaultName;
            return this;
        }

        @Override
        public UpdateVaultRequest build() {
            return new UpdateVaultRequest(this);
        } 

    } 

}
