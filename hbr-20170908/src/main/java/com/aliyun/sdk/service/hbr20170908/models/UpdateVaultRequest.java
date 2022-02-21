// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVaultRequest} extends {@link RequestModel}
 *
 * <p>UpdateVaultRequest</p>
 */
public class UpdateVaultRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("VaultId")
    @Validation(required = true)
    private String vaultId;

    @Query
    @NameInMap("VaultName")
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

        private Builder(UpdateVaultRequest response) {
            super(response);
            this.description = response.description;
            this.resourceGroupId = response.resourceGroupId;
            this.vaultId = response.vaultId;
            this.vaultName = response.vaultName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * VaultId.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        /**
         * VaultName.
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
