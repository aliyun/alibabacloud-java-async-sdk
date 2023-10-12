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
         * The forwarding rules.
         */
        public Builder forwardingRules(java.util.List < ForwardingRules> forwardingRules) {
            this.forwardingRules = forwardingRules;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is not returned, it indicates that no additional results exist.
         * *   If **NextToken** is returned, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
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
             * The endpoint group ID.
             * <p>
             * 
             * >  GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the **RuleActionType** and **RuleActionValue** operations.
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
             * The information about the endpoint groups.
             * <p>
             * 
             * >  GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the **RuleActionType** and **RuleActionValue** operations.
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

        @NameInMap("RuleActionValue")
        private String ruleActionValue;

        private RuleActions(Builder builder) {
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.order = builder.order;
            this.ruleActionType = builder.ruleActionType;
            this.ruleActionValue = builder.ruleActionValue;
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

        /**
         * @return ruleActionValue
         */
        public String getRuleActionValue() {
            return this.ruleActionValue;
        }

        public static final class Builder {
            private ForwardGroupConfig forwardGroupConfig; 
            private Integer order; 
            private String ruleActionType; 
            private String ruleActionValue; 

            /**
             * The forwarding action configuration.
             * <p>
             * 
             * >  GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the **RuleActionType** and **RuleActionValue** operations.
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * The forwarding priority.
             * <p>
             * 
             * >  This parameter does not take effect.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The type of the forwarding action. Valid values:
             * <p>
             * 
             * *   **ForwardGroup:** forwards a request.
             * *   **Redirect:** redirects a request.
             * *   **FixResponse:** returns a fixed response.
             * *   **Rewrite:** rewrites a request.
             * *   **AddHeader:** adds a header to a request.
             * *   **RemoveHeaderConfig:** deletes the header of a request.
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * The value of the forwarding action type.
             * <p>
             * 
             * Different JSON strings are returned based on the value of the **RuleActionType** parameter.
             * 
             * *   If you set **RuleActionType** to **ForwardGroup**, the information about a virtual endpoint group is returned. Parameter configuration:
             * 
             *     *   `type:` the type of the resource that is returned. The value is `endpointgroup`.
             *     *   `value:` the ID of the virtual endpoint group that is returned.
             * 
             * *   If you set **RuleActionType** to **Redirect**, the redirecting configuration is returned. Parameter configuration:
             * 
             *     *   `protocol:` the protocol of requests after the requests are redirected.
             *     *   `domain:` the domain name to which requests are redirected.
             *     *   `port:` the port to which requests are redirected.
             *     *   `path:` the path to which requests are redirected.
             *     *   `query:` the query string of the requests that are redirected.
             *     *   `code:` the redirecting code.
             * 
             * *   If you set **RuleActionType** to **FixResponse**, the information about the fixed response that you configured is returned. Parameter configuration:
             * 
             *     *   `code:` the HTTP status code that is returned.
             *     *   `type:` the type of the response content that is returned.
             *     *   `content:` the response content that is returned.
             * 
             * *   If **RuleActionType** is set to **AddHeader**, the information about the HTTP header that is added is returned. Parameter configuration:
             * 
             *     *   `name:` the name of the HTTP header that is returned.
             *     *   `type:` the content type of the HTTP header that is returned.
             *     *   `value:` the content of the HTTP header that is returned.
             * 
             * *   If you set **RuleActionType** to **RemoveHeader**, the information about the HTTP header that is deleted is returned.
             * 
             * *   If you set **RuleActionType** to **Rewrite**, the rewriting configuration is returned. Parameter configuration:
             * 
             *     *   `domain:` the domain name to which requests are redirected.
             *     *   `path:` the path to which requests are redirected.
             *     *   `query:` the query string of the requests that are redirected.
             */
            public Builder ruleActionValue(String ruleActionValue) {
                this.ruleActionValue = ruleActionValue;
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
             * The domain name configuration.
             * <p>
             * 
             * >  GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the **RuleActionType** and **RuleActionValue** operations.
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
             * The path configuration.
             * <p>
             * 
             * >  GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the **RuleActionType** and **RuleActionValue** operations.
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

        @NameInMap("RuleConditionValue")
        private String ruleConditionValue;

        private RuleConditions(Builder builder) {
            this.hostConfig = builder.hostConfig;
            this.pathConfig = builder.pathConfig;
            this.ruleConditionType = builder.ruleConditionType;
            this.ruleConditionValue = builder.ruleConditionValue;
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

        /**
         * @return ruleConditionValue
         */
        public String getRuleConditionValue() {
            return this.ruleConditionValue;
        }

        public static final class Builder {
            private HostConfig hostConfig; 
            private PathConfig pathConfig; 
            private String ruleConditionType; 
            private String ruleConditionValue; 

            /**
             * The domain name configuration.
             * <p>
             * 
             * >  GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the **RuleActionType** and **RuleActionValue** operations.
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * The path configuration.
             * <p>
             * 
             * >  GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the **RuleActionType** and **RuleActionValue** operations.
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * The type of the forwarding condition. Valid values:
             * <p>
             * 
             * *   **Host:** domain name.
             * *   **Path:** path.
             * *   **RequestHeader:** HTTP header.
             * *   **Query:** query string.
             * *   **Method:** HTTP method.
             * *   **Cookie:** cookie.
             * *   **SourceIP:** source IP address.
             */
            public Builder ruleConditionType(String ruleConditionType) {
                this.ruleConditionType = ruleConditionType;
                return this;
            }

            /**
             * The value of the forwarding condition type.
             * <p>
             * 
             * Different JSON strings are returned based on the value of the **RuleConditionType** parameter.
             * 
             * *   If you set **RuleConditionType** to **Host**, a domain name condition is returned. If multiple domain names are returned in a forwarding condition, the relationship between the domain names is OR.
             * *   If you set **RuleConditionType** to **Path**, a path condition is returned. If multiple forwarding conditions of the path type are returned in a forwarding rule, the relationship between the forwarding conditions is OR. If multiple paths are returned in a forwarding condition, the relationship between the paths is OR.
             * *   If you set **RuleConditionType** to **RequestHeader**, an HTTP header condition that consists of key-value pairs is returned.
             * *   If you set **RuleConditionType** to **Query**, a query string condition that consists of key-value pairs is returned.
             * *   If you set **RuleConditionType** to **Method**, an HTTP method condition is returned.
             * *   If you set **RuleConditionType** to **Cookie**, a cookie condition that consists of key-value pairs is returned.
             * *   If you set **RuleConditionType** to **SourceIP**, a source IP address condition is returned. If multiple source IP addresses are returned in a forwarding condition, the relationship between the source IP addresses is OR.
             */
            public Builder ruleConditionValue(String ruleConditionValue) {
                this.ruleConditionValue = ruleConditionValue;
                return this;
            }

            public RuleConditions build() {
                return new RuleConditions(this);
            } 

        } 

    }
    public static class ServiceManagedInfos extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ChildType")
        private String childType;

        @NameInMap("IsManaged")
        private Boolean isManaged;

        private ServiceManagedInfos(Builder builder) {
            this.action = builder.action;
            this.childType = builder.childType;
            this.isManaged = builder.isManaged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceManagedInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return childType
         */
        public String getChildType() {
            return this.childType;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public static final class Builder {
            private String action; 
            private String childType; 
            private Boolean isManaged; 

            /**
             * Managed policy action name, Valid values:
             * <p>
             * - Create
             * - Update
             * - Delete
             * - Associate
             * - UserUnmanaged
             * - CreateChild
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Sub resource type, Valid values:
             * <p>
             * 
             * - Listener
             * - IpSet
             * - EndpointGroup
             * - ForwardingRule
             * - Endpoint
             * - EndpointGroupDestination
             * - EndpointPolicy
             * 
             * >Only valid when the Action parameter is CreateChild.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Is the managed policy action managed, Valid values:
             * <p>
             * 
             * - true: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.
             * 
             * - false: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            public ServiceManagedInfos build() {
                return new ServiceManagedInfos(this);
            } 

        } 

    }
    public static class ForwardingRules extends TeaModel {
        @NameInMap("ForwardingRuleDirection")
        private String forwardingRuleDirection;

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

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        private ForwardingRules(Builder builder) {
            this.forwardingRuleDirection = builder.forwardingRuleDirection;
            this.forwardingRuleId = builder.forwardingRuleId;
            this.forwardingRuleName = builder.forwardingRuleName;
            this.forwardingRuleStatus = builder.forwardingRuleStatus;
            this.listenerId = builder.listenerId;
            this.priority = builder.priority;
            this.ruleActions = builder.ruleActions;
            this.ruleConditions = builder.ruleConditions;
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardingRules create() {
            return builder().build();
        }

        /**
         * @return forwardingRuleDirection
         */
        public String getForwardingRuleDirection() {
            return this.forwardingRuleDirection;
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

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return serviceManagedInfos
         */
        public java.util.List < ServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public static final class Builder {
            private String forwardingRuleDirection; 
            private String forwardingRuleId; 
            private String forwardingRuleName; 
            private String forwardingRuleStatus; 
            private String listenerId; 
            private Integer priority; 
            private java.util.List < RuleActions> ruleActions; 
            private java.util.List < RuleConditions> ruleConditions; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List < ServiceManagedInfos> serviceManagedInfos; 

            /**
             * The direction in which the forwarding rule takes effect.
             * <p>
             * 
             * By default, **request** is returned, which indicates that the forwarding rule takes effect on requests.
             */
            public Builder forwardingRuleDirection(String forwardingRuleDirection) {
                this.forwardingRuleDirection = forwardingRuleDirection;
                return this;
            }

            /**
             * The forwarding rule ID.
             */
            public Builder forwardingRuleId(String forwardingRuleId) {
                this.forwardingRuleId = forwardingRuleId;
                return this;
            }

            /**
             * The forwarding rule name.
             */
            public Builder forwardingRuleName(String forwardingRuleName) {
                this.forwardingRuleName = forwardingRuleName;
                return this;
            }

            /**
             * The state of the forwarding rule. Valid values:
             * <p>
             * 
             * *   **active:** The forwarding rule is normal.
             * *   **configuring:** The forwarding rule is being modified.
             * *   **deleting:** The forwarding rule is being deleted.
             */
            public Builder forwardingRuleStatus(String forwardingRuleStatus) {
                this.forwardingRuleStatus = forwardingRuleStatus;
                return this;
            }

            /**
             * The listener ID.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The priority of the forwarding rule.
             * <p>
             * 
             * A value between **1** and **10000** is returned. A smaller value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The forwarding actions.
             */
            public Builder ruleActions(java.util.List < RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * The conditions that trigger the forwarding rule.
             */
            public Builder ruleConditions(java.util.List < RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * The service ID to which the managed instance belongs.
             * <p>
             * 
             * >  Valid only when the ServiceManaged parameter is True.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Is it a managed instance. Valid values:
             * <p>
             * 
             * - true
             * - false
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * A list of action policies that users can execute on this managed instance.
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            public ForwardingRules build() {
                return new ForwardingRules(this);
            } 

        } 

    }
}
