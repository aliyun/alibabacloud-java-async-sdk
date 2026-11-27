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
 * {@link ListNatRateLimitRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNatRateLimitRulesResponseBody</p>
 */
public class ListNatRateLimitRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleInfos")
    private java.util.List<RuleInfos> ruleInfos;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNatRateLimitRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.natGatewayId = builder.natGatewayId;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.ruleInfos = builder.ruleInfos;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNatRateLimitRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleInfos
     */
    public java.util.List<RuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String natGatewayId; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<RuleInfos> ruleInfos; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNatRateLimitRulesResponseBody model) {
            this.maxResults = model.maxResults;
            this.natGatewayId = model.natGatewayId;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.ruleInfos = model.ruleInfos;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The NAT gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1b0lic8uz4r6vf2****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query is to be sent.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD97C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of rate limiting rules.</p>
         */
        public Builder ruleInfos(java.util.List<RuleInfos> ruleInfos) {
            this.ruleInfos = ruleInfos;
            return this;
        }

        /**
         * <p>The total number of rate limiting rules returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNatRateLimitRulesResponseBody build() {
            return new ListNatRateLimitRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNatRateLimitRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNatRateLimitRulesResponseBody</p>
     */
    public static class RuleInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
        private String bandwidthLimit;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("RuleDescription")
        private String ruleDescription;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SourceCIDRs")
        private java.util.List<String> sourceCIDRs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TunnelIndex")
        private String tunnelIndex;

        private RuleInfos(Builder builder) {
            this.bandwidthLimit = builder.bandwidthLimit;
            this.matchType = builder.matchType;
            this.ruleDescription = builder.ruleDescription;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.sourceCIDRs = builder.sourceCIDRs;
            this.status = builder.status;
            this.tunnelIndex = builder.tunnelIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfos create() {
            return builder().build();
        }

        /**
         * @return bandwidthLimit
         */
        public String getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tunnelIndex
         */
        public String getTunnelIndex() {
            return this.tunnelIndex;
        }

        public static final class Builder {
            private String bandwidthLimit; 
            private String matchType; 
            private String ruleDescription; 
            private String ruleId; 
            private String ruleName; 
            private java.util.List<String> sourceCIDRs; 
            private String status; 
            private String tunnelIndex; 

            private Builder() {
            } 

            private Builder(RuleInfos model) {
                this.bandwidthLimit = model.bandwidthLimit;
                this.matchType = model.matchType;
                this.ruleDescription = model.ruleDescription;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.sourceCIDRs = model.sourceCIDRs;
                this.status = model.status;
                this.tunnelIndex = model.tunnelIndex;
            } 

            /**
             * <p>The bandwidth limit. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bandwidthLimit(String bandwidthLimit) {
                this.bandwidthLimit = bandwidthLimit;
                return this;
            }

            /**
             * <p>The source match type of the rate limiting rule. Valid values:</p>
             * <ul>
             * <li><strong>CIDR</strong>: CIDR block match. This is the default value.</li>
             * <li><strong>TUNNEL</strong>: tunnel match. If this value is specified, a corresponding SNAT rule of the TUNNEL type must exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CIDR</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The description of the rate limiting rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * <p>The ID of the rate limiting rule.</p>
             * 
             * <strong>example:</strong>
             * <p>limit-rule-****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the rate limiting rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The source CIDR blocks of the rate limiting rule.</p>
             */
            public Builder sourceCIDRs(java.util.List<String> sourceCIDRs) {
                this.sourceCIDRs = sourceCIDRs;
                return this;
            }

            /**
             * <p>The status of the rate limiting rule. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong>: The rule is available.</li>
             * <li><strong>Deleting</strong>: The rule is being deleted.</li>
             * <li><strong>Modifying</strong>: The rule is being modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tunnel index. If the MatchType parameter is set to TUNNEL, a corresponding SNAT rule must exist.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tunnelIndex(String tunnelIndex) {
                this.tunnelIndex = tunnelIndex;
                return this;
            }

            public RuleInfos build() {
                return new RuleInfos(this);
            } 

        } 

    }
}
