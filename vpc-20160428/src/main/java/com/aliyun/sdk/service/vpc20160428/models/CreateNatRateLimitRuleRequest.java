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
 * {@link CreateNatRateLimitRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateNatRateLimitRuleRequest</p>
 */
public class CreateNatRateLimitRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
    private String bandwidthLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleDescription")
    private String ruleDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCIDRs")
    private java.util.List<String> sourceCIDRs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TunnelIndex")
    private String tunnelIndex;

    private CreateNatRateLimitRuleRequest(Builder builder) {
        super(builder);
        this.bandwidthLimit = builder.bandwidthLimit;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.matchType = builder.matchType;
        this.natGatewayId = builder.natGatewayId;
        this.regionId = builder.regionId;
        this.ruleDescription = builder.ruleDescription;
        this.ruleName = builder.ruleName;
        this.sourceCIDRs = builder.sourceCIDRs;
        this.tunnelIndex = builder.tunnelIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatRateLimitRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidthLimit
     */
    public String getBandwidthLimit() {
        return this.bandwidthLimit;
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
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
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
     * @return sourceCIDRs
     */
    public java.util.List<String> getSourceCIDRs() {
        return this.sourceCIDRs;
    }

    /**
     * @return tunnelIndex
     */
    public String getTunnelIndex() {
        return this.tunnelIndex;
    }

    public static final class Builder extends Request.Builder<CreateNatRateLimitRuleRequest, Builder> {
        private String bandwidthLimit; 
        private String clientToken; 
        private String dryRun; 
        private String matchType; 
        private String natGatewayId; 
        private String regionId; 
        private String ruleDescription; 
        private String ruleName; 
        private java.util.List<String> sourceCIDRs; 
        private String tunnelIndex; 

        private Builder() {
            super();
        } 

        private Builder(CreateNatRateLimitRuleRequest request) {
            super(request);
            this.bandwidthLimit = request.bandwidthLimit;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.matchType = request.matchType;
            this.natGatewayId = request.natGatewayId;
            this.regionId = request.regionId;
            this.ruleDescription = request.ruleDescription;
            this.ruleName = request.ruleName;
            this.sourceCIDRs = request.sourceCIDRs;
            this.tunnelIndex = request.tunnelIndex;
        } 

        /**
         * <p>The bandwidth limit. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder bandwidthLimit(String bandwidthLimit) {
            this.putQueryParameter("BandwidthLimit", bandwidthLimit);
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The system prechecks the request without creating the rate limiting rule. The system checks whether the required parameters are specified, and validates the request format and limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): The system sends a normal request. If the request passes the precheck, the rate limiting rule is created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The source match type for rate limiting. Valid values:</p>
         * <p>CIDR: CIDR block match. This is the default value.
         * TUNNEL: tunnel match. If you set the value to TUNNEL, a corresponding SNAT rule of the TUNNEL type must exist.</p>
         * 
         * <strong>example:</strong>
         * <p>CIDR</p>
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway to which the rate limiting rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The region ID of the NAT gateway.</p>
         * <p>You can call the DescribeRegions operation to query region IDs.</p>
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
         * <p>The description of the rate limiting rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test rule description</p>
         */
        public Builder ruleDescription(String ruleDescription) {
            this.putQueryParameter("RuleDescription", ruleDescription);
            this.ruleDescription = ruleDescription;
            return this;
        }

        /**
         * <p>The name of the rate limiting rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-rule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The list of source CIDR blocks to which the rate limiting rule applies.</p>
         */
        public Builder sourceCIDRs(java.util.List<String> sourceCIDRs) {
            this.putQueryParameter("SourceCIDRs", sourceCIDRs);
            this.sourceCIDRs = sourceCIDRs;
            return this;
        }

        /**
         * <p>The tunnel index. If MatchType is set to TUNNEL, a corresponding SNAT rule must exist.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tunnelIndex(String tunnelIndex) {
            this.putQueryParameter("TunnelIndex", tunnelIndex);
            this.tunnelIndex = tunnelIndex;
            return this;
        }

        @Override
        public CreateNatRateLimitRuleRequest build() {
            return new CreateNatRateLimitRuleRequest(this);
        } 

    } 

}
