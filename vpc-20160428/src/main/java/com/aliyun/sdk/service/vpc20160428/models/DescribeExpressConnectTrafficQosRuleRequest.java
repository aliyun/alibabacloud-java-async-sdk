// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressConnectTrafficQosRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressConnectTrafficQosRuleRequest</p>
 */
public class DescribeExpressConnectTrafficQosRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QosId")
    private String qosId;

    @Query
    @NameInMap("QueueId")
    private String queueId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("RuleIdList")
    private java.util.List < String > ruleIdList;

    @Query
    @NameInMap("RuleNameList")
    private java.util.List < String > ruleNameList;

    private DescribeExpressConnectTrafficQosRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.qosId = builder.qosId;
        this.queueId = builder.queueId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ruleIdList = builder.ruleIdList;
        this.ruleNameList = builder.ruleNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectTrafficQosRuleRequest create() {
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return ruleIdList
     */
    public java.util.List < String > getRuleIdList() {
        return this.ruleIdList;
    }

    /**
     * @return ruleNameList
     */
    public java.util.List < String > getRuleNameList() {
        return this.ruleNameList;
    }

    public static final class Builder extends Request.Builder<DescribeExpressConnectTrafficQosRuleRequest, Builder> {
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String qosId; 
        private String queueId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private java.util.List < String > ruleIdList; 
        private java.util.List < String > ruleNameList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressConnectTrafficQosRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.qosId = request.qosId;
            this.queueId = request.queueId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.ruleIdList = request.ruleIdList;
            this.ruleNameList = request.ruleNameList;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * RuleIdList.
         */
        public Builder ruleIdList(java.util.List < String > ruleIdList) {
            this.putQueryParameter("RuleIdList", ruleIdList);
            this.ruleIdList = ruleIdList;
            return this;
        }

        /**
         * RuleNameList.
         */
        public Builder ruleNameList(java.util.List < String > ruleNameList) {
            this.putQueryParameter("RuleNameList", ruleNameList);
            this.ruleNameList = ruleNameList;
            return this;
        }

        @Override
        public DescribeExpressConnectTrafficQosRuleRequest build() {
            return new DescribeExpressConnectTrafficQosRuleRequest(this);
        } 

    } 

}
