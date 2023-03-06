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
         * You can use the client to generate the value, but you must ensure that it is unique among all requests. The client token can contain only ASCII characters.  
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether only to precheck the request. Valid values:
         * <p>
         * 
         * - **true**: prechecks the request but does not delete the traffic classification rules. The system checks the required parameters, the request format, and the service limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * - **false** (default): sends the request and deletes the specified traffic classification rules after the request passes the precheck.
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
         * The IDs of the traffic classification rules.
         * <p>
         * 
         * You can specify at most 20 traffic classification rules.
         * 
         * You can call the ListTrafficMarkingPolicies operation to query the IDs of traffic classification rules in a specified traffic marking policy.
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
