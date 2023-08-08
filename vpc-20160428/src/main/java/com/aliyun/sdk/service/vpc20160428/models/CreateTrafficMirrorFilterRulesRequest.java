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
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to check the request without performing the operation. Valid values:
         * <p>
         * 
         * *   **true**: checks the request without performing the operation. The system checks the required parameters, request format, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the request. After the request passes the check, the operation is performed.
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
         * The ID of the region to which the mirrored traffic belongs.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list. For more information about regions that support traffic mirroring, see [Overview of traffic mirroring](~~207513~~).
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
         * The ID of the filter.
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
             * The action of the outbound rule. Valid values:
             * <p>
             * 
             * *   **accept**: accepts network traffic.
             * *   **drop**: drops network traffic.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The destination CIDR block of the outbound traffic.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The destination port range of the outbound traffic. Valid values for a port: **1** to **65535**. Separate the first port and the last port with a forward slash (/). Examples: **1/200** and **80/80**. You cannot set this parameter to only **-1/-1**, which specifies all ports.
             * <p>
             * 
             * >  If you set **EgressRules.N.Protocol** to **ALL** or **ICMP**, you do not need to set this parameter. In this case, all ports are available.
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * The priority of the outbound rule. A smaller value indicates a higher priority. The maximum value of **N** is **10**. You can configure up to 10 outbound rules for a filter.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The protocol that is used by the outbound traffic to be mirrored. Valid values:
             * <p>
             * 
             * *   **ALL**: all protocols
             * *   **ICMP**: ICMP
             * *   **TCP**: TCP
             * *   **UDP**: UDP
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The source CIDR block of the outbound traffic.
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * The source port range of the outbound traffic. Valid values for a port: **1** to **65535**. Separate the first port and the last port with a forward slash (/). Examples: **1/200** and **80/80**. You cannot set this parameter to only **-1/-1**, which specifies all ports.
             * <p>
             * 
             * >  If you set **EgressRules.N.Protocol** to **ALL** or **ICMP**, you do not need to set this parameter. In this case, all ports are available.
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
             * The action of the inbound rule. Valid values:
             * <p>
             * 
             * *   **accept**: accepts network traffic.
             * *   **drop**: drops network traffic.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The destination CIDR block of the inbound traffic.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The destination port range of the inbound traffic. Valid values for a port: **1** to **65535**. Separate the first port and the last port with a forward slash (/). Examples: **1/200** and **80/80**.
             * <p>
             * 
             * >  If you set **IngressRules.N.Protocol** to **ALL** or **ICMP**, you do not need to set this parameter. In this case, all ports are available.
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value of **N** is **10**. You can configure up to 10 inbound rules for a filter.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The protocol that is used by the inbound traffic to be mirrored. Valid values:
             * <p>
             * 
             * *   **ALL**: all protocols
             * *   **ICMP**: Internet Control Message Protocol (ICMP)
             * *   **TCP**: TCP
             * *   **UDP**: User Datagram Protocol (UDP)
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The source CIDR block of the inbound traffic.
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * The source port range of the inbound traffic. Valid values for a port: **1** to **65535**. Separate the first port and the last port with a forward slash (/). Examples: **1/200** and **80/80**. You cannot set this parameter to only **-1/-1**, which specifies all ports.
             * <p>
             * 
             * >  If you set **IngressRules.N.Protocol** to **ALL** or **ICMP**, you do not need to set this parameter. In this case, all ports are available.
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
