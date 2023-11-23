// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest} extends {@link RequestModel}
 *
 * <p>RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest</p>
 */
public class RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrafficMarkRuleIds")
    private java.util.List < String > trafficMarkRuleIds;

    @Query
    @NameInMap("TrafficMarkingPolicyId")
    @Validation(required = true)
    private String trafficMarkingPolicyId;

    private RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMarkRuleIds = builder.trafficMarkRuleIds;
        this.trafficMarkingPolicyId = builder.trafficMarkingPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest create() {
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
     * @return trafficMarkRuleIds
     */
    public java.util.List < String > getTrafficMarkRuleIds() {
        return this.trafficMarkRuleIds;
    }

    /**
     * @return trafficMarkingPolicyId
     */
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

    public static final class Builder extends Request.Builder<RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > trafficMarkRuleIds; 
        private String trafficMarkingPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMarkRuleIds = request.trafficMarkRuleIds;
            this.trafficMarkingPolicyId = request.trafficMarkingPolicyId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request.
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
         * The ID of the traffic classification rule.
         * <p>
         * 
         * You can specify at most 20 traffic classification rules.
         */
        public Builder trafficMarkRuleIds(java.util.List < String > trafficMarkRuleIds) {
            this.putQueryParameter("TrafficMarkRuleIds", trafficMarkRuleIds);
            this.trafficMarkRuleIds = trafficMarkRuleIds;
            return this;
        }

        /**
         * The ID of the traffic marking policy.
         */
        public Builder trafficMarkingPolicyId(String trafficMarkingPolicyId) {
            this.putQueryParameter("TrafficMarkingPolicyId", trafficMarkingPolicyId);
            this.trafficMarkingPolicyId = trafficMarkingPolicyId;
            return this;
        }

        @Override
        public RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest build() {
            return new RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest(this);
        } 

    } 

}
