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
 * {@link DeleteVaultRequest} extends {@link RequestModel}
 *
 * <p>DeleteVaultRequest</p>
 */
public class DeleteVaultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    private DeleteVaultRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
        this.token = builder.token;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVaultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<DeleteVaultRequest, Builder> {
        private String resourceGroupId; 
        private String token; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVaultRequest request) {
            super(request);
            this.resourceGroupId = request.resourceGroupId;
            this.token = request.token;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmoiyerpacj4q</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The token.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a*</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
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
        public DeleteVaultRequest build() {
            return new DeleteVaultRequest(this);
        } 

    } 

}
