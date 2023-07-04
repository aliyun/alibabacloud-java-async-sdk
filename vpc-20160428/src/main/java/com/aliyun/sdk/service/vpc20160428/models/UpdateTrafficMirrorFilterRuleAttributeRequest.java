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
         * The new priority of the inbound or outbound rule. A smaller value indicates a higher priority.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The new destination port range of the inbound or outbound traffic.
         * <p>
         * 
         * >  If you set **Protocol** to **ICMP**, you cannot change the port range.
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * The ID of the region to which the mirrored traffic belongs.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list. For more information about regions that support traffic mirroring, see [Overview of traffic mirroring](~~207513~~).
         */
        public Builder destinationPortRange(String destinationPortRange) {
            this.putQueryParameter("DestinationPortRange", destinationPortRange);
            this.destinationPortRange = destinationPortRange;
            return this;
        }

        /**
         * The new protocol that is used by the traffic to be mirrored by the inbound or outbound rule. Valid values:
         * <p>
         * 
         * *   **ALL**: all protocols
         * *   **ICMP**: Internet Control Message Protocol (ICMP)
         * *   **TCP**: TCP
         * *   **UDP**: User Datagram Protocol (UDP)
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
         * The new action of the inbound or outbound rule. Valid values:
         * <p>
         * 
         * *   **accept**: accepts network traffic.
         * *   **drop**: drops network traffic.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The new destination CIDR block of the inbound or outbound traffic.
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
         * The new source CIDR block of the inbound or outbound traffic.
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * The new source port range of the inbound or outbound traffic.
         * <p>
         * 
         * >  If you set **Protocol** to **ICMP**, you cannot change the port range.
         */
        public Builder sourceCidrBlock(String sourceCidrBlock) {
            this.putQueryParameter("SourceCidrBlock", sourceCidrBlock);
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * Specifies whether to check the request without performing the operation. Valid values:
         * <p>
         * 
         * *   **true**: only checks the API request. The configuration of the inbound or outbound rule is not modified. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false**: sends the request. This is the default value. If the request passes the check, a 2xx HTTP status code is returned and the configuration of the inbound or outbound rule is modified.
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
