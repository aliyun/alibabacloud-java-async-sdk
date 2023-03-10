// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficMirrorFilterRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficMirrorFilterRequest</p>
 */
public class CreateTrafficMirrorFilterRequest extends Request {
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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrafficMirrorFilterDescription")
    private String trafficMirrorFilterDescription;

    @Query
    @NameInMap("TrafficMirrorFilterName")
    private String trafficMirrorFilterName;

    private CreateTrafficMirrorFilterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressRules = builder.egressRules;
        this.ingressRules = builder.ingressRules;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMirrorFilterDescription = builder.trafficMirrorFilterDescription;
        this.trafficMirrorFilterName = builder.trafficMirrorFilterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMirrorFilterRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return trafficMirrorFilterDescription
     */
    public String getTrafficMirrorFilterDescription() {
        return this.trafficMirrorFilterDescription;
    }

    /**
     * @return trafficMirrorFilterName
     */
    public String getTrafficMirrorFilterName() {
        return this.trafficMirrorFilterName;
    }

    public static final class Builder extends Request.Builder<CreateTrafficMirrorFilterRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < EgressRules> egressRules; 
        private java.util.List < IngressRules> ingressRules; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMirrorFilterDescription; 
        private String trafficMirrorFilterName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficMirrorFilterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressRules = request.egressRules;
            this.ingressRules = request.ingressRules;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMirrorFilterDescription = request.trafficMirrorFilterDescription;
            this.trafficMirrorFilterName = request.trafficMirrorFilterName;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * TrafficMirrorFilterDescription.
         */
        public Builder trafficMirrorFilterDescription(String trafficMirrorFilterDescription) {
            this.putQueryParameter("TrafficMirrorFilterDescription", trafficMirrorFilterDescription);
            this.trafficMirrorFilterDescription = trafficMirrorFilterDescription;
            return this;
        }

        /**
         * TrafficMirrorFilterName.
         */
        public Builder trafficMirrorFilterName(String trafficMirrorFilterName) {
            this.putQueryParameter("TrafficMirrorFilterName", trafficMirrorFilterName);
            this.trafficMirrorFilterName = trafficMirrorFilterName;
            return this;
        }

        @Override
        public CreateTrafficMirrorFilterRequest build() {
            return new CreateTrafficMirrorFilterRequest(this);
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
