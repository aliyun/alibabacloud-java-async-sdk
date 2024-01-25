// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallClientRequest} extends {@link RequestModel}
 *
 * <p>UninstallClientRequest</p>
 */
public class UninstallClientRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private UninstallClientRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.resourceGroupId = builder.resourceGroupId;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallClientRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
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

    public static final class Builder extends Request.Builder<UninstallClientRequest, Builder> {
        private String clientId; 
        private String resourceGroupId; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallClientRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.resourceGroupId = request.resourceGroupId;
            this.vaultId = request.vaultId;
        } 

        /**
         * The ID of the HBR client.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public UninstallClientRequest build() {
            return new UninstallClientRequest(this);
        } 

    } 

}
