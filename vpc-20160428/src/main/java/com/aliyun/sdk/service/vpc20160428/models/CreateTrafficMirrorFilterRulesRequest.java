// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficMirrorFilterRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficMirrorFilterRulesRequest</p>
 */
public class CreateTrafficMirrorFilterRulesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EgressRules")
    private java.util.List < EgressRules> egressRules;

    @Query
    @NameInMap("IngressRules")
    private java.util.List < IngressRules> ingressRules;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
    @NameInMap("TrafficMirrorFilterId")
    @Validation(required = true)
    private String trafficMirrorFilterId;

    private CreateTrafficMirrorFilterRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressRules = builder.egressRules;
        this.ingressRules = builder.ingressRules;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMirrorFilterRulesRequest create() {
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
     * @return egressRules
     */
    public java.util.List < EgressRules> getEgressRules() {
        return this.egressRules;
    }

    /**
     * @return ingressRules
     */
    public java.util.List < IngressRules> getIngressRules() {
        return this.ingressRules;
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
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public static final class Builder extends Request.Builder<CreateTrafficMirrorFilterRulesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < EgressRules> egressRules; 
        private java.util.List < IngressRules> ingressRules; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMirrorFilterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficMirrorFilterRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressRules = request.egressRules;
            this.ingressRules = request.ingressRules;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMirrorFilterId = request.trafficMirrorFilterId;
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
         * EgressRules.
         */
        public Builder egressRules(java.util.List < EgressRules> egressRules) {
            this.putQueryParameter("EgressRules", egressRules);
            this.egressRules = egressRules;
            return this;
        }

        /**
         * IngressRules.
         */
        public Builder ingressRules(java.util.List < IngressRules> ingressRules) {
            this.putQueryParameter("IngressRules", ingressRules);
            this.ingressRules = ingressRules;
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
         * TrafficMirrorFilterId.
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.putQueryParameter("TrafficMirrorFilterId", trafficMirrorFilterId);
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        @Override
        public CreateTrafficMirrorFilterRulesRequest build() {
            return new CreateTrafficMirrorFilterRulesRequest(this);
        } 

    } 

    public static class EgressRules extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("DestinationPortRange")
        private String destinationPortRange;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        private EgressRules(Builder builder) {
            this.action = builder.action;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.destinationPortRange = builder.destinationPortRange;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.sourceCidrBlock = builder.sourceCidrBlock;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
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

        public static final class Builder {
            private String action; 
            private String destinationCidrBlock; 
            private String destinationPortRange; 
            private Integer priority; 
            private String protocol; 
            private String sourceCidrBlock; 
            private String sourcePortRange; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * DestinationPortRange.
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
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
             * SourceCidrBlock.
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public EgressRules build() {
                return new EgressRules(this);
            } 

        } 

    }
    public static class IngressRules extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("DestinationPortRange")
        private String destinationPortRange;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        private IngressRules(Builder builder) {
            this.action = builder.action;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.destinationPortRange = builder.destinationPortRange;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.sourceCidrBlock = builder.sourceCidrBlock;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
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

        public static final class Builder {
            private String action; 
            private String destinationCidrBlock; 
            private String destinationPortRange; 
            private Integer priority; 
            private String protocol; 
            private String sourceCidrBlock; 
            private String sourcePortRange; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * DestinationPortRange.
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
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
             * SourceCidrBlock.
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public IngressRules build() {
                return new IngressRules(this);
            } 

        } 

    }
}
