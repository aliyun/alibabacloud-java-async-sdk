// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest</p>
 */
public class ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMarkingPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleDescription")
    private String trafficMatchRuleDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMatchRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleName")
    private String trafficMatchRuleName;

    private ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMarkingPolicyId = builder.trafficMarkingPolicyId;
        this.trafficMatchRuleDescription = builder.trafficMatchRuleDescription;
        this.trafficMatchRuleId = builder.trafficMatchRuleId;
        this.trafficMatchRuleName = builder.trafficMatchRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return trafficMarkingPolicyId
     */
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

    /**
     * @return trafficMatchRuleDescription
     */
    public String getTrafficMatchRuleDescription() {
        return this.trafficMatchRuleDescription;
    }

    /**
     * @return trafficMatchRuleId
     */
    public String getTrafficMatchRuleId() {
        return this.trafficMatchRuleId;
    }

    /**
     * @return trafficMatchRuleName
     */
    public String getTrafficMatchRuleName() {
        return this.trafficMatchRuleName;
    }

    public static final class Builder extends Request.Builder<ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMarkingPolicyId; 
        private String trafficMatchRuleDescription; 
        private String trafficMatchRuleId; 
        private String trafficMatchRuleName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMarkingPolicyId = request.trafficMarkingPolicyId;
            this.trafficMatchRuleDescription = request.trafficMatchRuleDescription;
            this.trafficMatchRuleId = request.trafficMatchRuleId;
            this.trafficMatchRuleName = request.trafficMatchRuleName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-u9nxup5kww5po8****</p>
         */
        public Builder trafficMarkingPolicyId(String trafficMarkingPolicyId) {
            this.putQueryParameter("TrafficMarkingPolicyId", trafficMarkingPolicyId);
            this.trafficMarkingPolicyId = trafficMarkingPolicyId;
            return this;
        }

        /**
         * TrafficMatchRuleDescription.
         */
        public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
            this.putQueryParameter("TrafficMatchRuleDescription", trafficMatchRuleDescription);
            this.trafficMatchRuleDescription = trafficMatchRuleDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-rule-fa9kgq1e90rmhc****</p>
         */
        public Builder trafficMatchRuleId(String trafficMatchRuleId) {
            this.putQueryParameter("TrafficMatchRuleId", trafficMatchRuleId);
            this.trafficMatchRuleId = trafficMatchRuleId;
            return this;
        }

        /**
         * TrafficMatchRuleName.
         */
        public Builder trafficMatchRuleName(String trafficMatchRuleName) {
            this.putQueryParameter("TrafficMatchRuleName", trafficMatchRuleName);
            this.trafficMatchRuleName = trafficMatchRuleName;
            return this;
        }

        @Override
        public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest build() {
            return new ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest(this);
        } 

    } 

}
