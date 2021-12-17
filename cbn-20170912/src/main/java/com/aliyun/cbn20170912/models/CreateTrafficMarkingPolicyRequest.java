// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    private Integer markingDscp;

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

    public static final class Builder extends Request.Builder<Builder> {
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

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>DryRun.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>MarkingDscp.</p>
         */
        public Builder markingDscp(Integer markingDscp) {
            this.putQueryParameter("MarkingDscp", markingDscp);
            this.markingDscp = markingDscp;
            return this;
        }

        /**
         * <p>OwnerAccount.</p>
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * <p>OwnerId.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Priority.</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>ResourceOwnerAccount.</p>
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>TrafficMarkingPolicyDescription.</p>
         */
        public Builder trafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
            this.putQueryParameter("TrafficMarkingPolicyDescription", trafficMarkingPolicyDescription);
            this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
            return this;
        }

        /**
         * <p>TrafficMarkingPolicyName.</p>
         */
        public Builder trafficMarkingPolicyName(String trafficMarkingPolicyName) {
            this.putQueryParameter("TrafficMarkingPolicyName", trafficMarkingPolicyName);
            this.trafficMarkingPolicyName = trafficMarkingPolicyName;
            return this;
        }

        /**
         * <p>TrafficMatchRules.</p>
         */
        public Builder trafficMatchRules(java.util.List < TrafficMatchRules> trafficMatchRules) {
            this.putQueryParameter("TrafficMatchRules", trafficMatchRules);
            this.trafficMatchRules = trafficMatchRules;
            return this;
        }

        /**
         * <p>TransitRouterId.</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

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
             * <p>DstCidr.</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>DstPortRange.</p>
             */
            public Builder dstPortRange(java.util.List < Integer > dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * <p>MatchDscp.</p>
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * <p>Protocol.</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>SrcCidr.</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>SrcPortRange.</p>
             */
            public Builder srcPortRange(java.util.List < Integer > srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * <p>TrafficMatchRuleDescription.</p>
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * <p>TrafficMatchRuleName.</p>
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
