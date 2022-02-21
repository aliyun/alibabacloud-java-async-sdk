// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateRamPolicyRequest} extends {@link RequestModel}
 *
 * <p>GenerateRamPolicyRequest</p>
 */
public class GenerateRamPolicyRequest extends Request {
    @Query
    @NameInMap("ActionType")
    @Validation(required = true)
    private String actionType;

    @Query
    @NameInMap("RequireBasePolicy")
    private Boolean requireBasePolicy;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("VaultId")
    @Validation(required = true)
    private String vaultId;

    private GenerateRamPolicyRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.requireBasePolicy = builder.requireBasePolicy;
        this.resourceGroupId = builder.resourceGroupId;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateRamPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return requireBasePolicy
     */
    public Boolean getRequireBasePolicy() {
        return this.requireBasePolicy;
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

    public static final class Builder extends Request.Builder<GenerateRamPolicyRequest, Builder> {
        private String actionType; 
        private Boolean requireBasePolicy; 
        private String resourceGroupId; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateRamPolicyRequest response) {
            super(response);
            this.actionType = response.actionType;
            this.requireBasePolicy = response.requireBasePolicy;
            this.resourceGroupId = response.resourceGroupId;
            this.vaultId = response.vaultId;
        } 

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * RequireBasePolicy.
         */
        public Builder requireBasePolicy(Boolean requireBasePolicy) {
            this.putQueryParameter("RequireBasePolicy", requireBasePolicy);
            this.requireBasePolicy = requireBasePolicy;
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

        @Override
        public GenerateRamPolicyRequest build() {
            return new GenerateRamPolicyRequest(this);
        } 

    } 

}
