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
 * {@link ModifyNatRateLimitRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyNatRateLimitRuleRequest</p>
 */
public class ModifyNatRateLimitRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleDescription")
    private String ruleDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCIDRs")
    private java.util.List<String> sourceCIDRs;

    private ModifyNatRateLimitRuleRequest(Builder builder) {
        super(builder);
        this.bandwidthLimit = builder.bandwidthLimit;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.natGatewayId = builder.natGatewayId;
        this.regionId = builder.regionId;
        this.ruleDescription = builder.ruleDescription;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.sourceCIDRs = builder.sourceCIDRs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNatRateLimitRuleRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
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

    public static final class Builder extends Request.Builder<ModifyNatRateLimitRuleRequest, Builder> {
        private String bandwidthLimit; 
        private String clientToken; 
        private String dryRun; 
        private String natGatewayId; 
        private String regionId; 
        private String ruleDescription; 
        private String ruleId; 
        private String ruleName; 
        private java.util.List<String> sourceCIDRs; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNatRateLimitRuleRequest request) {
            super(request);
            this.bandwidthLimit = request.bandwidthLimit;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.natGatewayId = request.natGatewayId;
            this.regionId = request.regionId;
            this.ruleDescription = request.ruleDescription;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.sourceCIDRs = request.sourceCIDRs;
        } 

        /**
         * <p>The new bandwidth limit. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder bandwidthLimit(String bandwidthLimit) {
            this.putQueryParameter("BandwidthLimit", bandwidthLimit);
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run and does not query the resource status. The system checks whether your AccessKey pair is valid, the authorization of Resource Access Management (RAM) users, and whether required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
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
         * <p>The ID of the NAT gateway to which the rate limit rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1b0lic8uz4r6vf2****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The region ID of the NAT gateway.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
         * <p>The new description of the rate limit rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ruleDescription(String ruleDescription) {
            this.putQueryParameter("RuleDescription", ruleDescription);
            this.ruleDescription = ruleDescription;
            return this;
        }

        /**
         * <p>The ID of the rate limit rule.</p>
         * 
         * <strong>example:</strong>
         * <p>limit-rule-****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The new name of the rate limit rule.</p>
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
         * <p>The new list of source CIDR blocks for the rate limit rule.</p>
         */
        public Builder sourceCIDRs(java.util.List<String> sourceCIDRs) {
            this.putQueryParameter("SourceCIDRs", sourceCIDRs);
            this.sourceCIDRs = sourceCIDRs;
            return this;
        }

        @Override
        public ModifyNatRateLimitRuleRequest build() {
            return new ModifyNatRateLimitRuleRequest(this);
        } 

    } 

}
