// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressConnectTrafficQosRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressConnectTrafficQosRuleRequest</p>
 */
public class CreateExpressConnectTrafficQosRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DstCidr")
    private String dstCidr;

    @Query
    @NameInMap("DstIPv6Cidr")
    private String dstIPv6Cidr;

    @Query
    @NameInMap("DstPortRange")
    private String dstPortRange;

    @Query
    @NameInMap("MatchDscp")
    private Integer matchDscp;

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
    @NameInMap("Protocol")
    @Validation(required = true)
    private String protocol;

    @Query
    @NameInMap("QosId")
    @Validation(required = true)
    private String qosId;

    @Query
    @NameInMap("QueueId")
    @Validation(required = true)
    private String queueId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemarkingDscp")
    private Integer remarkingDscp;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("RuleDescription")
    private String ruleDescription;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    @Query
    @NameInMap("SrcCidr")
    private String srcCidr;

    @Query
    @NameInMap("SrcIPv6Cidr")
    private String srcIPv6Cidr;

    @Query
    @NameInMap("SrcPortRange")
    private String srcPortRange;

    private CreateExpressConnectTrafficQosRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dstCidr = builder.dstCidr;
        this.dstIPv6Cidr = builder.dstIPv6Cidr;
        this.dstPortRange = builder.dstPortRange;
        this.matchDscp = builder.matchDscp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.protocol = builder.protocol;
        this.qosId = builder.qosId;
        this.queueId = builder.queueId;
        this.regionId = builder.regionId;
        this.remarkingDscp = builder.remarkingDscp;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ruleDescription = builder.ruleDescription;
        this.ruleName = builder.ruleName;
        this.srcCidr = builder.srcCidr;
        this.srcIPv6Cidr = builder.srcIPv6Cidr;
        this.srcPortRange = builder.srcPortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressConnectTrafficQosRuleRequest create() {
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
     * @return dstCidr
     */
    public String getDstCidr() {
        return this.dstCidr;
    }

    /**
     * @return dstIPv6Cidr
     */
    public String getDstIPv6Cidr() {
        return this.dstIPv6Cidr;
    }

    /**
     * @return dstPortRange
     */
    public String getDstPortRange() {
        return this.dstPortRange;
    }

    /**
     * @return matchDscp
     */
    public Integer getMatchDscp() {
        return this.matchDscp;
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
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remarkingDscp
     */
    public Integer getRemarkingDscp() {
        return this.remarkingDscp;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return ruleDescription
     */
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return srcCidr
     */
    public String getSrcCidr() {
        return this.srcCidr;
    }

    /**
     * @return srcIPv6Cidr
     */
    public String getSrcIPv6Cidr() {
        return this.srcIPv6Cidr;
    }

    /**
     * @return srcPortRange
     */
    public String getSrcPortRange() {
        return this.srcPortRange;
    }

    public static final class Builder extends Request.Builder<CreateExpressConnectTrafficQosRuleRequest, Builder> {
        private String clientToken; 
        private String dstCidr; 
        private String dstIPv6Cidr; 
        private String dstPortRange; 
        private Integer matchDscp; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private String protocol; 
        private String qosId; 
        private String queueId; 
        private String regionId; 
        private Integer remarkingDscp; 
        private String resourceOwnerAccount; 
        private String ruleDescription; 
        private String ruleName; 
        private String srcCidr; 
        private String srcIPv6Cidr; 
        private String srcPortRange; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressConnectTrafficQosRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dstCidr = request.dstCidr;
            this.dstIPv6Cidr = request.dstIPv6Cidr;
            this.dstPortRange = request.dstPortRange;
            this.matchDscp = request.matchDscp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.protocol = request.protocol;
            this.qosId = request.qosId;
            this.queueId = request.queueId;
            this.regionId = request.regionId;
            this.remarkingDscp = request.remarkingDscp;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.ruleDescription = request.ruleDescription;
            this.ruleName = request.ruleName;
            this.srcCidr = request.srcCidr;
            this.srcIPv6Cidr = request.srcIPv6Cidr;
            this.srcPortRange = request.srcPortRange;
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
         * DstCidr.
         */
        public Builder dstCidr(String dstCidr) {
            this.putQueryParameter("DstCidr", dstCidr);
            this.dstCidr = dstCidr;
            return this;
        }

        /**
         * DstIPv6Cidr.
         */
        public Builder dstIPv6Cidr(String dstIPv6Cidr) {
            this.putQueryParameter("DstIPv6Cidr", dstIPv6Cidr);
            this.dstIPv6Cidr = dstIPv6Cidr;
            return this;
        }

        /**
         * DstPortRange.
         */
        public Builder dstPortRange(String dstPortRange) {
            this.putQueryParameter("DstPortRange", dstPortRange);
            this.dstPortRange = dstPortRange;
            return this;
        }

        /**
         * MatchDscp.
         */
        public Builder matchDscp(Integer matchDscp) {
            this.putQueryParameter("MatchDscp", matchDscp);
            this.matchDscp = matchDscp;
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
         * QosId.
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * QueueId.
         */
        public Builder queueId(String queueId) {
            this.putQueryParameter("QueueId", queueId);
            this.queueId = queueId;
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
         * RemarkingDscp.
         */
        public Builder remarkingDscp(Integer remarkingDscp) {
            this.putQueryParameter("RemarkingDscp", remarkingDscp);
            this.remarkingDscp = remarkingDscp;
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
         * RuleDescription.
         */
        public Builder ruleDescription(String ruleDescription) {
            this.putQueryParameter("RuleDescription", ruleDescription);
            this.ruleDescription = ruleDescription;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * SrcCidr.
         */
        public Builder srcCidr(String srcCidr) {
            this.putQueryParameter("SrcCidr", srcCidr);
            this.srcCidr = srcCidr;
            return this;
        }

        /**
         * SrcIPv6Cidr.
         */
        public Builder srcIPv6Cidr(String srcIPv6Cidr) {
            this.putQueryParameter("SrcIPv6Cidr", srcIPv6Cidr);
            this.srcIPv6Cidr = srcIPv6Cidr;
            return this;
        }

        /**
         * SrcPortRange.
         */
        public Builder srcPortRange(String srcPortRange) {
            this.putQueryParameter("SrcPortRange", srcPortRange);
            this.srcPortRange = srcPortRange;
            return this;
        }

        @Override
        public CreateExpressConnectTrafficQosRuleRequest build() {
            return new CreateExpressConnectTrafficQosRuleRequest(this);
        } 

    } 

}
