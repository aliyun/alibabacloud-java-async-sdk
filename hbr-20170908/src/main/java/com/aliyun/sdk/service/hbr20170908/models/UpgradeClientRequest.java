// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeClientRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClientRequest</p>
 */
public class UpgradeClientRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    private UpgradeClientRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.resourceGroupId = builder.resourceGroupId;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClientRequest create() {
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

    public static final class Builder extends Request.Builder<UpgradeClientRequest, Builder> {
        private String clientId; 
        private String resourceGroupId; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClientRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.resourceGroupId = request.resourceGroupId;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The ID of the Cloud Backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>c-000boklw******63a9</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy6uja5wyc2i</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-000djw8ci******3ic</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public UpgradeClientRequest build() {
            return new UpgradeClientRequest(this);
        } 

    } 

}
