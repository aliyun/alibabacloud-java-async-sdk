// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListTrafficMarkingPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficMarkingPoliciesResponseBody</p>
 */
public class ListTrafficMarkingPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicies")
    private java.util.List<TrafficMarkingPolicies> trafficMarkingPolicies;

    private ListTrafficMarkingPoliciesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficMarkingPolicies = builder.trafficMarkingPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficMarkingPoliciesResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trafficMarkingPolicies
     */
    public java.util.List<TrafficMarkingPolicies> getTrafficMarkingPolicies() {
        return this.trafficMarkingPolicies;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TrafficMarkingPolicies> trafficMarkingPolicies; 

        private Builder() {
        } 

        private Builder(ListTrafficMarkingPoliciesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trafficMarkingPolicies = model.trafficMarkingPolicies;
        } 

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query.</p>
         * <ul>
         * <li>If <strong>NextToken</strong> was not returned in the previous query, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>699989E4-64A0-5F78-8B93-CDB32D98971F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the traffic marking policy.</p>
         */
        public Builder trafficMarkingPolicies(java.util.List<TrafficMarkingPolicies> trafficMarkingPolicies) {
            this.trafficMarkingPolicies = trafficMarkingPolicies;
            return this;
        }

        public ListTrafficMarkingPoliciesResponseBody build() {
            return new ListTrafficMarkingPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrafficMarkingPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficMarkingPoliciesResponseBody</p>
     */
    public static class TrafficMatchRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressFamily")
        private String addressFamily;

        @com.aliyun.core.annotation.NameInMap("DstCidr")
        private String dstCidr;

        @com.aliyun.core.annotation.NameInMap("DstPortRange")
        private java.util.List<Integer> dstPortRange;

        @com.aliyun.core.annotation.NameInMap("MatchDscp")
        private Integer matchDscp;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SrcCidr")
        private String srcCidr;

        @com.aliyun.core.annotation.NameInMap("SrcPortRange")
        private java.util.List<Integer> srcPortRange;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleDescription")
        private String trafficMatchRuleDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleId")
        private String trafficMatchRuleId;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleName")
        private String trafficMatchRuleName;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleStatus")
        private String trafficMatchRuleStatus;

        private TrafficMatchRules(Builder builder) {
            this.addressFamily = builder.addressFamily;
            this.dstCidr = builder.dstCidr;
            this.dstPortRange = builder.dstPortRange;
            this.matchDscp = builder.matchDscp;
            this.protocol = builder.protocol;
            this.srcCidr = builder.srcCidr;
            this.srcPortRange = builder.srcPortRange;
            this.trafficMatchRuleDescription = builder.trafficMatchRuleDescription;
            this.trafficMatchRuleId = builder.trafficMatchRuleId;
            this.trafficMatchRuleName = builder.trafficMatchRuleName;
            this.trafficMatchRuleStatus = builder.trafficMatchRuleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMatchRules create() {
            return builder().build();
        }

        /**
         * @return addressFamily
         */
        public String getAddressFamily() {
            return this.addressFamily;
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
        public java.util.List<Integer> getDstPortRange() {
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
        public java.util.List<Integer> getSrcPortRange() {
            return this.srcPortRange;
        }

        /**
         * @return trafficMatchRuleDescription
         */
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        /**
         * @return trafficMatchRuleId
         */
        public String getTrafficMatchRuleId() {
            return this.trafficMatchRuleId;
        }

        /**
         * @return trafficMatchRuleName
         */
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

        /**
         * @return trafficMatchRuleStatus
         */
        public String getTrafficMatchRuleStatus() {
            return this.trafficMatchRuleStatus;
        }

        public static final class Builder {
            private String addressFamily; 
            private String dstCidr; 
            private java.util.List<Integer> dstPortRange; 
            private Integer matchDscp; 
            private String protocol; 
            private String srcCidr; 
            private java.util.List<Integer> srcPortRange; 
            private String trafficMatchRuleDescription; 
            private String trafficMatchRuleId; 
            private String trafficMatchRuleName; 
            private String trafficMatchRuleStatus; 

            private Builder() {
            } 

            private Builder(TrafficMatchRules model) {
                this.addressFamily = model.addressFamily;
                this.dstCidr = model.dstCidr;
                this.dstPortRange = model.dstPortRange;
                this.matchDscp = model.matchDscp;
                this.protocol = model.protocol;
                this.srcCidr = model.srcCidr;
                this.srcPortRange = model.srcPortRange;
                this.trafficMatchRuleDescription = model.trafficMatchRuleDescription;
                this.trafficMatchRuleId = model.trafficMatchRuleId;
                this.trafficMatchRuleName = model.trafficMatchRuleName;
                this.trafficMatchRuleStatus = model.trafficMatchRuleStatus;
            } 

            /**
             * <p>The address family. You can set the value to IPv4 or IPv6, or leave the value empty.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * <p>The destination CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.120.0/24</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>The destination port range used to match data packets.</p>
             */
            public Builder dstPortRange(java.util.List<Integer> dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * <p>The DSCP value used to match data packets.</p>
             * <blockquote>
             * <p> If the value of the <strong>MatchDscp</strong> parameter is -1, data packets are considered a match regardless of the DSCP value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * <p>The protocol that is used to match packets.</p>
             * <blockquote>
             * <p> Traffic marking policies support multiple protocols. For more information, see the documentation of CEN.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of packets. IPv6 and IPv4 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.0/24</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>The source port range used to match data packets.</p>
             */
            public Builder srcPortRange(java.util.List<Integer> srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * <p>The description of the traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * <p>The ID of the traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tm-rule-fa9kgq1e90rmhc****</p>
             */
            public Builder trafficMatchRuleId(String trafficMatchRuleId) {
                this.trafficMatchRuleId = trafficMatchRuleId;
                return this;
            }

            /**
             * <p>The name of the traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder trafficMatchRuleName(String trafficMatchRuleName) {
                this.trafficMatchRuleName = trafficMatchRuleName;
                return this;
            }

            /**
             * <p>The status of the traffic classification rule. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The rule is being created.</li>
             * <li><strong>Active</strong>: The rule is available.</li>
             * <li><strong>Deleting</strong>: The rule is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder trafficMatchRuleStatus(String trafficMatchRuleStatus) {
                this.trafficMatchRuleStatus = trafficMatchRuleStatus;
                return this;
            }

            public TrafficMatchRules build() {
                return new TrafficMatchRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTrafficMarkingPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficMarkingPoliciesResponseBody</p>
     */
    public static class TrafficMarkingPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MarkingDscp")
        private Integer markingDscp;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyDescription")
        private String trafficMarkingPolicyDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyId")
        private String trafficMarkingPolicyId;

        @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyName")
        private String trafficMarkingPolicyName;

        @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyStatus")
        private String trafficMarkingPolicyStatus;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRules")
        private java.util.List<TrafficMatchRules> trafficMatchRules;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private TrafficMarkingPolicies(Builder builder) {
            this.markingDscp = builder.markingDscp;
            this.priority = builder.priority;
            this.trafficMarkingPolicyDescription = builder.trafficMarkingPolicyDescription;
            this.trafficMarkingPolicyId = builder.trafficMarkingPolicyId;
            this.trafficMarkingPolicyName = builder.trafficMarkingPolicyName;
            this.trafficMarkingPolicyStatus = builder.trafficMarkingPolicyStatus;
            this.trafficMatchRules = builder.trafficMatchRules;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMarkingPolicies create() {
            return builder().build();
        }

        /**
         * @return markingDscp
         */
        public Integer getMarkingDscp() {
            return this.markingDscp;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return trafficMarkingPolicyDescription
         */
        public String getTrafficMarkingPolicyDescription() {
            return this.trafficMarkingPolicyDescription;
        }

        /**
         * @return trafficMarkingPolicyId
         */
        public String getTrafficMarkingPolicyId() {
            return this.trafficMarkingPolicyId;
        }

        /**
         * @return trafficMarkingPolicyName
         */
        public String getTrafficMarkingPolicyName() {
            return this.trafficMarkingPolicyName;
        }

        /**
         * @return trafficMarkingPolicyStatus
         */
        public String getTrafficMarkingPolicyStatus() {
            return this.trafficMarkingPolicyStatus;
        }

        /**
         * @return trafficMatchRules
         */
        public java.util.List<TrafficMatchRules> getTrafficMatchRules() {
            return this.trafficMatchRules;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private Integer markingDscp; 
            private Integer priority; 
            private String trafficMarkingPolicyDescription; 
            private String trafficMarkingPolicyId; 
            private String trafficMarkingPolicyName; 
            private String trafficMarkingPolicyStatus; 
            private java.util.List<TrafficMatchRules> trafficMatchRules; 
            private String transitRouterId; 

            private Builder() {
            } 

            private Builder(TrafficMarkingPolicies model) {
                this.markingDscp = model.markingDscp;
                this.priority = model.priority;
                this.trafficMarkingPolicyDescription = model.trafficMarkingPolicyDescription;
                this.trafficMarkingPolicyId = model.trafficMarkingPolicyId;
                this.trafficMarkingPolicyName = model.trafficMarkingPolicyName;
                this.trafficMarkingPolicyStatus = model.trafficMarkingPolicyStatus;
                this.trafficMatchRules = model.trafficMatchRules;
                this.transitRouterId = model.transitRouterId;
            } 

            /**
             * <p>The Differentiated Service Code Point (DSCP) value of the traffic marking policy.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder markingDscp(Integer markingDscp) {
                this.markingDscp = markingDscp;
                return this;
            }

            /**
             * <p>The priority of the traffic marking policy.</p>
             * <p>A lower value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The description of the traffic marking policy.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder trafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
                this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
                return this;
            }

            /**
             * <p>The ID of the traffic marking policy.</p>
             * 
             * <strong>example:</strong>
             * <p>tm-iz5egnyitxiroq****</p>
             */
            public Builder trafficMarkingPolicyId(String trafficMarkingPolicyId) {
                this.trafficMarkingPolicyId = trafficMarkingPolicyId;
                return this;
            }

            /**
             * <p>The name of the traffic marking policy.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder trafficMarkingPolicyName(String trafficMarkingPolicyName) {
                this.trafficMarkingPolicyName = trafficMarkingPolicyName;
                return this;
            }

            /**
             * <p>The status of the traffic marking policy. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The policy is being created.</li>
             * <li><strong>Active</strong>: The policy is available.</li>
             * <li><strong>Modifying</strong>: The policy is being modified.</li>
             * <li><strong>Deleting</strong>: The policy is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder trafficMarkingPolicyStatus(String trafficMarkingPolicyStatus) {
                this.trafficMarkingPolicyStatus = trafficMarkingPolicyStatus;
                return this;
            }

            /**
             * <p>The traffic classification rules.</p>
             */
            public Builder trafficMatchRules(java.util.List<TrafficMatchRules> trafficMatchRules) {
                this.trafficMatchRules = trafficMatchRules;
                return this;
            }

            /**
             * <p>The ID of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-ccni***</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public TrafficMarkingPolicies build() {
                return new TrafficMarkingPolicies(this);
            } 

        } 

    }
}
