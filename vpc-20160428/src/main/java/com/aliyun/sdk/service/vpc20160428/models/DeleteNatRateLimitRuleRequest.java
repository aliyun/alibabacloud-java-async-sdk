// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteNatRateLimitRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteNatRateLimitRuleRequest</p>
 */
public class DeleteNatRateLimitRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List<String> ruleIds;

    private DeleteNatRateLimitRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.natGatewayId = builder.natGatewayId;
        this.regionId = builder.regionId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNatRateLimitRuleRequest create() {
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
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleIds
     */
    public java.util.List<String> getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder extends Request.Builder<DeleteNatRateLimitRuleRequest, Builder> {
        private String clientToken; 
        private String natGatewayId; 
        private String regionId; 
        private java.util.List<String> ruleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNatRateLimitRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.natGatewayId = request.natGatewayId;
            this.regionId = request.regionId;
            this.ruleIds = request.ruleIds;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway to which the rate limiting rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1uewa15k4iy5770****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The region ID of the NAT gateway.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IDs of the rate limiting rules to be deleted.</p>
         */
        public Builder ruleIds(java.util.List<String> ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        @Override
        public DeleteNatRateLimitRuleRequest build() {
            return new DeleteNatRateLimitRuleRequest(this);
        } 

    } 

}
