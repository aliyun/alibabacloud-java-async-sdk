// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListForwardingRulesResponseBody</p>
 */
public class ListForwardingRulesResponseBody extends TeaModel {
    @NameInMap("ForwardingRules")
    private java.util.List < ForwardingRules> forwardingRules;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListForwardingRulesResponseBody(Builder builder) {
        this.forwardingRules = builder.forwardingRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListForwardingRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return forwardingRules
     */
    public java.util.List < ForwardingRules> getForwardingRules() {
        return this.forwardingRules;
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

    public static final class Builder {
        private java.util.List < ForwardingRules> forwardingRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ForwardingRules.
         */
        public Builder forwardingRules(java.util.List < ForwardingRules> forwardingRules) {
            this.forwardingRules = forwardingRules;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListForwardingRulesResponseBody build() {
            return new ListForwardingRulesResponseBody(this);
        } 

    } 

    public static class ServerGroupTuples extends TeaModel {
        @NameInMap("EndpointGroupId")
        private String endpointGroupId;

        private ServerGroupTuples(Builder builder) {
            this.endpointGroupId = builder.endpointGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupTuples create() {
            return builder().build();
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public static final class Builder {
            private String endpointGroupId; 

            /**
             * EndpointGroupId.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            public ServerGroupTuples build() {
                return new ServerGroupTuples(this);
            } 

        } 

    }
    public static class ForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        private java.util.List < ServerGroupTuples> serverGroupTuples;

        private ForwardGroupConfig(Builder builder) {
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List < ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List < ServerGroupTuples> serverGroupTuples; 

            /**
             * ServerGroupTuples.
             */
            public Builder serverGroupTuples(java.util.List < ServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public ForwardGroupConfig build() {
                return new ForwardGroupConfig(this);
            } 

        } 

    }
    public static class RuleActions extends TeaModel {
        @NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @NameInMap("Order")
        private Integer order;

        @NameInMap("RuleActionType")
        private String ruleActionType;

        private RuleActions(Builder builder) {
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.order = builder.order;
            this.ruleActionType = builder.ruleActionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActions create() {
            return builder().build();
        }

        /**
         * @return forwardGroupConfig
         */
        public ForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return ruleActionType
         */
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public static final class Builder {
            private ForwardGroupConfig forwardGroupConfig; 
            private Integer order; 
            private String ruleActionType; 

            /**
             * ForwardGroupConfig.
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * RuleActionType.
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            public RuleActions build() {
                return new RuleActions(this);
            } 

        } 

    }
    public static class HostConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private HostConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public HostConfig build() {
                return new HostConfig(this);
            } 

        } 

    }
    public static class PathConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private PathConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public PathConfig build() {
                return new PathConfig(this);
            } 

        } 

    }
    public static class RuleConditions extends TeaModel {
        @NameInMap("HostConfig")
        private HostConfig hostConfig;

        @NameInMap("PathConfig")
        private PathConfig pathConfig;

        @NameInMap("RuleConditionType")
        private String ruleConditionType;

        private RuleConditions(Builder builder) {
            this.hostConfig = builder.hostConfig;
            this.pathConfig = builder.pathConfig;
            this.ruleConditionType = builder.ruleConditionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConditions create() {
            return builder().build();
        }

        /**
         * @return hostConfig
         */
        public HostConfig getHostConfig() {
            return this.hostConfig;
        }

        /**
         * @return pathConfig
         */
        public PathConfig getPathConfig() {
            return this.pathConfig;
        }

        /**
         * @return ruleConditionType
         */
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public static final class Builder {
            private HostConfig hostConfig; 
            private PathConfig pathConfig; 
            private String ruleConditionType; 

            /**
             * HostConfig.
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * PathConfig.
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * RuleConditionType.
             */
            public Builder ruleConditionType(String ruleConditionType) {
                this.ruleConditionType = ruleConditionType;
                return this;
            }

            public RuleConditions build() {
                return new RuleConditions(this);
            } 

        } 

    }
    public static class ForwardingRules extends TeaModel {
        @NameInMap("ForwardingRuleId")
        private String forwardingRuleId;

        @NameInMap("ForwardingRuleName")
        private String forwardingRuleName;

        @NameInMap("ForwardingRuleStatus")
        private String forwardingRuleStatus;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RuleActions")
        private java.util.List < RuleActions> ruleActions;

        @NameInMap("RuleConditions")
        private java.util.List < RuleConditions> ruleConditions;

        private ForwardingRules(Builder builder) {
            this.forwardingRuleId = builder.forwardingRuleId;
            this.forwardingRuleName = builder.forwardingRuleName;
            this.forwardingRuleStatus = builder.forwardingRuleStatus;
            this.listenerId = builder.listenerId;
            this.priority = builder.priority;
            this.ruleActions = builder.ruleActions;
            this.ruleConditions = builder.ruleConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardingRules create() {
            return builder().build();
        }

        /**
         * @return forwardingRuleId
         */
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

        /**
         * @return forwardingRuleName
         */
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        /**
         * @return forwardingRuleStatus
         */
        public String getForwardingRuleStatus() {
            return this.forwardingRuleStatus;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return ruleActions
         */
        public java.util.List < RuleActions> getRuleActions() {
            return this.ruleActions;
        }

        /**
         * @return ruleConditions
         */
        public java.util.List < RuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public static final class Builder {
            private String forwardingRuleId; 
            private String forwardingRuleName; 
            private String forwardingRuleStatus; 
            private String listenerId; 
            private Integer priority; 
            private java.util.List < RuleActions> ruleActions; 
            private java.util.List < RuleConditions> ruleConditions; 

            /**
             * ForwardingRuleId.
             */
            public Builder forwardingRuleId(String forwardingRuleId) {
                this.forwardingRuleId = forwardingRuleId;
                return this;
            }

            /**
             * ForwardingRuleName.
             */
            public Builder forwardingRuleName(String forwardingRuleName) {
                this.forwardingRuleName = forwardingRuleName;
                return this;
            }

            /**
             * ForwardingRuleStatus.
             */
            public Builder forwardingRuleStatus(String forwardingRuleStatus) {
                this.forwardingRuleStatus = forwardingRuleStatus;
                return this;
            }

            /**
             * ListenerId.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
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
             * RuleActions.
             */
            public Builder ruleActions(java.util.List < RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * RuleConditions.
             */
            public Builder ruleConditions(java.util.List < RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            public ForwardingRules build() {
                return new ForwardingRules(this);
            } 

        } 

    }
}
