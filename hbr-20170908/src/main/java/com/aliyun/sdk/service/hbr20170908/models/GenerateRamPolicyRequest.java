// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateRamPolicyRequest} extends {@link RequestModel}
 *
 * <p>GenerateRamPolicyRequest</p>
 */
public class GenerateRamPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireBasePolicy")
    private Boolean requireBasePolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GenerateRamPolicyRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.requireBasePolicy = request.requireBasePolicy;
            this.resourceGroupId = request.resourceGroupId;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The type of the policy that you want to generate. Valid values:</p>
         * <ul>
         * <li>custom: custom policy</li>
         * <li>system: system policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>Specifies whether to generate the policy based on an existing instance-specific rule. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder requireBasePolicy(Boolean requireBasePolicy) {
            this.putQueryParameter("RequireBasePolicy", requireBasePolicy);
            this.requireBasePolicy = requireBasePolicy;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-*********************</p>
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
         * <p>v-0007al3m******7ao</p>
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
