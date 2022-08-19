// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrafficMirrorFilterRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficMirrorFilterRuleAttributeRequest</p>
 */
public class UpdateTrafficMirrorFilterRuleAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @Query
    @NameInMap("DestinationPortRange")
    private String destinationPortRange;

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
    @NameInMap("Priority")
    private Integer priority;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RuleAction")
    private String ruleAction;

    @Query
    @NameInMap("SourceCidrBlock")
    private String sourceCidrBlock;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("TrafficMirrorFilterRuleId")
    @Validation(required = true)
    private String trafficMirrorFilterRuleId;

    private UpdateTrafficMirrorFilterRuleAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.destinationPortRange = builder.destinationPortRange;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleAction = builder.ruleAction;
        this.sourceCidrBlock = builder.sourceCidrBlock;
        this.sourcePortRange = builder.sourcePortRange;
        this.trafficMirrorFilterRuleId = builder.trafficMirrorFilterRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficMirrorFilterRuleAttributeRequest create() {
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
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return destinationPortRange
     */
    public String getDestinationPortRange() {
        return this.destinationPortRange;
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return sourceCidrBlock
     */
    public String getSourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return trafficMirrorFilterRuleId
     */
    public String getTrafficMirrorFilterRuleId() {
        return this.trafficMirrorFilterRuleId;
    }

    public static final class Builder extends Request.Builder<UpdateTrafficMirrorFilterRuleAttributeRequest, Builder> {
        private String clientToken; 
        private String destinationCidrBlock; 
        private String destinationPortRange; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private String protocol; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ruleAction; 
        private String sourceCidrBlock; 
        private String sourcePortRange; 
        private String trafficMirrorFilterRuleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrafficMirrorFilterRuleAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.destinationPortRange = request.destinationPortRange;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleAction = request.ruleAction;
            this.sourceCidrBlock = request.sourceCidrBlock;
            this.sourcePortRange = request.sourcePortRange;
            this.trafficMirrorFilterRuleId = request.trafficMirrorFilterRuleId;
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
         * DestinationCidrBlock.
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * DestinationPortRange.
         */
        public Builder destinationPortRange(String destinationPortRange) {
            this.putQueryParameter("DestinationPortRange", destinationPortRange);
            this.destinationPortRange = destinationPortRange;
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
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * RuleAction.
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * SourceCidrBlock.
         */
        public Builder sourceCidrBlock(String sourceCidrBlock) {
            this.putQueryParameter("SourceCidrBlock", sourceCidrBlock);
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }

        /**
         * SourcePortRange.
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * TrafficMirrorFilterRuleId.
         */
        public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
            this.putQueryParameter("TrafficMirrorFilterRuleId", trafficMirrorFilterRuleId);
            this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
            return this;
        }

        @Override
        public UpdateTrafficMirrorFilterRuleAttributeRequest build() {
            return new UpdateTrafficMirrorFilterRuleAttributeRequest(this);
        } 

    } 

}
