// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficMarkingPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficMarkingPolicyRequest</p>
 */
public class CreateTrafficMarkingPolicyRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("MarkingDscp")
    @Validation(required = true)
    private Integer markingDscp;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Priority")
    @Validation(required = true)
    private Integer priority;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrafficMarkingPolicyDescription")
    private String trafficMarkingPolicyDescription;

    @Query
    @NameInMap("TrafficMarkingPolicyName")
    private String trafficMarkingPolicyName;

    @Query
    @NameInMap("TrafficMatchRules")
    private java.util.List < TrafficMatchRules> trafficMatchRules;

    @Query
    @NameInMap("TransitRouterId")
    @Validation(required = true)
    private String transitRouterId;

    private CreateTrafficMarkingPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.markingDscp = builder.markingDscp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMarkingPolicyDescription = builder.trafficMarkingPolicyDescription;
        this.trafficMarkingPolicyName = builder.trafficMarkingPolicyName;
        this.trafficMatchRules = builder.trafficMatchRules;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMarkingPolicyRequest create() {
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
     * @return markingDscp
     */
    public Integer getMarkingDscp() {
        return this.markingDscp;
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
     * @return trafficMarkingPolicyDescription
     */
    public String getTrafficMarkingPolicyDescription() {
        return this.trafficMarkingPolicyDescription;
    }

    /**
     * @return trafficMarkingPolicyName
     */
    public String getTrafficMarkingPolicyName() {
        return this.trafficMarkingPolicyName;
    }

    /**
     * @return trafficMatchRules
     */
    public java.util.List < TrafficMatchRules> getTrafficMatchRules() {
        return this.trafficMatchRules;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<CreateTrafficMarkingPolicyRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Integer markingDscp; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMarkingPolicyDescription; 
        private String trafficMarkingPolicyName; 
        private java.util.List < TrafficMatchRules> trafficMatchRules; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficMarkingPolicyRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.markingDscp = response.markingDscp;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.priority = response.priority;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.trafficMarkingPolicyDescription = response.trafficMarkingPolicyDescription;
            this.trafficMarkingPolicyName = response.trafficMarkingPolicyName;
            this.trafficMatchRules = response.trafficMatchRules;
            this.transitRouterId = response.transitRouterId;
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
         * MarkingDscp.
         */
        public Builder markingDscp(Integer markingDscp) {
            this.putQueryParameter("MarkingDscp", markingDscp);
            this.markingDscp = markingDscp;
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
         * TrafficMarkingPolicyDescription.
         */
        public Builder trafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
            this.putQueryParameter("TrafficMarkingPolicyDescription", trafficMarkingPolicyDescription);
            this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
            return this;
        }

        /**
         * TrafficMarkingPolicyName.
         */
        public Builder trafficMarkingPolicyName(String trafficMarkingPolicyName) {
            this.putQueryParameter("TrafficMarkingPolicyName", trafficMarkingPolicyName);
            this.trafficMarkingPolicyName = trafficMarkingPolicyName;
            return this;
        }

        /**
         * TrafficMatchRules.
         */
        public Builder trafficMatchRules(java.util.List < TrafficMatchRules> trafficMatchRules) {
            this.putQueryParameter("TrafficMatchRules", trafficMatchRules);
            this.trafficMatchRules = trafficMatchRules;
            return this;
        }

        /**
         * TransitRouterId.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public CreateTrafficMarkingPolicyRequest build() {
            return new CreateTrafficMarkingPolicyRequest(this);
        } 

    } 

    public static class TrafficMatchRules extends TeaModel {
        @NameInMap("DstCidr")
        private String dstCidr;

        @NameInMap("DstPortRange")
        private java.util.List < Integer > dstPortRange;

        @NameInMap("MatchDscp")
        private Integer matchDscp;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SrcCidr")
        private String srcCidr;

        @NameInMap("SrcPortRange")
        private java.util.List < Integer > srcPortRange;

        @NameInMap("TrafficMatchRuleDescription")
        private String trafficMatchRuleDescription;

        @NameInMap("TrafficMatchRuleName")
        private String trafficMatchRuleName;

        private TrafficMatchRules(Builder builder) {
            this.dstCidr = builder.dstCidr;
            this.dstPortRange = builder.dstPortRange;
            this.matchDscp = builder.matchDscp;
            this.protocol = builder.protocol;
            this.srcCidr = builder.srcCidr;
            this.srcPortRange = builder.srcPortRange;
            this.trafficMatchRuleDescription = builder.trafficMatchRuleDescription;
            this.trafficMatchRuleName = builder.trafficMatchRuleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMatchRules create() {
            return builder().build();
        }

        /**
         * @return dstCidr
         */
        public String getDstCidr() {
            return this.dstCidr;
        }

        /**
         * @return dstPortRange
         */
        public java.util.List < Integer > getDstPortRange() {
            return this.dstPortRange;
        }

        /**
         * @return matchDscp
         */
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return srcCidr
         */
        public String getSrcCidr() {
            return this.srcCidr;
        }

        /**
         * @return srcPortRange
         */
        public java.util.List < Integer > getSrcPortRange() {
            return this.srcPortRange;
        }

        /**
         * @return trafficMatchRuleDescription
         */
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        /**
         * @return trafficMatchRuleName
         */
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

        public static final class Builder {
            private String dstCidr; 
            private java.util.List < Integer > dstPortRange; 
            private Integer matchDscp; 
            private String protocol; 
            private String srcCidr; 
            private java.util.List < Integer > srcPortRange; 
            private String trafficMatchRuleDescription; 
            private String trafficMatchRuleName; 

            /**
             * DstCidr.
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * DstPortRange.
             */
            public Builder dstPortRange(java.util.List < Integer > dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * MatchDscp.
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * SrcCidr.
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * SrcPortRange.
             */
            public Builder srcPortRange(java.util.List < Integer > srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * TrafficMatchRuleDescription.
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * TrafficMatchRuleName.
             */
            public Builder trafficMatchRuleName(String trafficMatchRuleName) {
                this.trafficMatchRuleName = trafficMatchRuleName;
                return this;
            }

            public TrafficMatchRules build() {
                return new TrafficMatchRules(this);
            } 

        } 

    }
}
