// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListForwardingRulesResponseBody</p>
 */
public class ListForwardingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardingRules")
    private java.util.List<ForwardingRules> forwardingRules;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardingRules
     */
    public java.util.List<ForwardingRules> getForwardingRules() {
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
        private java.util.List<ForwardingRules> forwardingRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListForwardingRulesResponseBody model) {
            this.forwardingRules = model.forwardingRules;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The forwarding rules.</p>
         */
        public Builder forwardingRules(java.util.List<ForwardingRules> forwardingRules) {
            this.forwardingRules = forwardingRules;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CFC67ED9-4AB1-431F-B6E3-A752B7B8CCD4</p>
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

        public ListForwardingRulesResponseBody build() {
            return new ListForwardingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardingRulesResponseBody</p>
     */
    public static class ServerGroupTuples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
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

            private Builder() {
            } 

            private Builder(ServerGroupTuples model) {
                this.endpointGroupId = model.endpointGroupId;
            } 

            /**
             * <p>The endpoint group ID.</p>
             * <blockquote>
             * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>epg-bp1enpdcrqhl78g6r****</p>
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
    /**
     * 
     * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardingRulesResponseBody</p>
     */
    public static class ForwardGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupTuples")
        private java.util.List<ServerGroupTuples> serverGroupTuples;

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
        public java.util.List<ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List<ServerGroupTuples> serverGroupTuples; 

            private Builder() {
            } 

            private Builder(ForwardGroupConfig model) {
                this.serverGroupTuples = model.serverGroupTuples;
            } 

            /**
             * <p>The information about the endpoint groups.</p>
             * <blockquote>
             * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
             * </blockquote>
             */
            public Builder serverGroupTuples(java.util.List<ServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public ForwardGroupConfig build() {
                return new ForwardGroupConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardingRulesResponseBody</p>
     */
    public static class RuleActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("RuleActionType")
        private String ruleActionType;

        @com.aliyun.core.annotation.NameInMap("RuleActionValue")
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

            private Builder() {
            } 

            private Builder(RuleActions model) {
                this.forwardGroupConfig = model.forwardGroupConfig;
                this.order = model.order;
                this.ruleActionType = model.ruleActionType;
                this.ruleActionValue = model.ruleActionValue;
            } 

            /**
             * <p>The forwarding action configuration.</p>
             * <blockquote>
             * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
             * </blockquote>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The forwarding priority.</p>
             * <blockquote>
             * <p> This parameter does not take effect.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The type of the forwarding action. Valid values:</p>
             * <ul>
             * <li><strong>ForwardGroup</strong>: forwards a request.</li>
             * <li><strong>Redirect</strong>: redirects a request.</li>
             * <li><strong>FixResponse</strong>: returns a fixed response.</li>
             * <li><strong>Rewrite</strong>: rewrites a request.</li>
             * <li><strong>AddHeader</strong>: adds a header to a request.</li>
             * <li><strong>RemoveHeaderConfig</strong>: deletes the header from a request.</li>
             * <li><strong>Drop</strong>: drops a request.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ForwardGroup</p>
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * <p>The value of the forwarding action.</p>
             * <p>Different JSON strings are returned based on the value of <strong>RuleActionType</strong>.</p>
             * <ul>
             * <li><p>If you set <strong>RuleActionType</strong> to <strong>ForwardGroup</strong>, the information about a virtual endpoint group is returned. The following section describes the parameters:</p>
             * <ul>
             * <li><code>type</code>: <code>endpointgroup</code> is returned.</li>
             * <li><code>value</code>: the ID of the virtual endpoint group.</li>
             * </ul>
             * </li>
             * <li><p>If you set <strong>RuleActionType</strong> to <strong>Redirect</strong>, the redirecting configuration is returned. The following section describes the parameters:</p>
             * <ul>
             * <li><code>protocol</code>: the protocol of requests after the requests are redirected.</li>
             * <li><code>domain</code>: the domain name to which requests are redirected.</li>
             * <li><code>port</code>: the port to which requests are redirected.</li>
             * <li><code>path</code>: the path to which requests are redirected.</li>
             * <li><code>query</code>: the query string of the requests that are redirected.</li>
             * <li><code>code</code>: the redirecting code.</li>
             * </ul>
             * </li>
             * <li><p>If you set <strong>RuleActionType</strong> to <strong>FixResponse</strong>, the information about the fixed response that you configured is returned. The following section describes the parameters:</p>
             * <ul>
             * <li><code>code</code>: the HTTP status code.</li>
             * <li><code>type</code>: the content type of the response.</li>
             * <li><code>content</code>: the content of the response.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleActionType</strong> is set to <strong>AddHeader</strong>, the information about the HTTP header that is added is returned. The following section describes the parameters:</p>
             * <ul>
             * <li><code>name</code>: the name of the HTTP header.</li>
             * <li><code>type</code>: the content type of the HTTP header.</li>
             * <li><code>value</code>: the content of the HTTP header.</li>
             * </ul>
             * </li>
             * <li><p>If you set <strong>RuleActionType</strong> to <strong>RemoveHeader</strong>, the information about the HTTP header that is deleted is returned.</p>
             * </li>
             * <li><p>If you set <strong>RuleActionType</strong> to <strong>Rewrite</strong>, the rewriting configuration is returned. The following section describes the parameters:</p>
             * <ul>
             * <li><code>domain</code>: the domain name to which requests are redirected.</li>
             * <li><code>path</code>: the path to which requests are redirected.</li>
             * <li><code>query</code>: the query string of the requests that are redirected.</li>
             * </ul>
             * </li>
             * <li><p>If you set <strong>RuleActionType</strong> to <strong>Drop</strong>, an empty string is returned.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;endpointgroup&quot;, &quot;value&quot;:&quot;epg-bp1enpdcrqhl78g6r****&quot;}]</p>
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
    /**
     * 
     * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardingRulesResponseBody</p>
     */
    public static class HostConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

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
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(HostConfig model) {
                this.values = model.values;
            } 

            /**
             * <p>The domain name configuration.</p>
             * <blockquote>
             * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
             * </blockquote>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public HostConfig build() {
                return new HostConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardingRulesResponseBody</p>
     */
    public static class PathConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

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
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(PathConfig model) {
                this.values = model.values;
            } 

            /**
             * <p>The path configuration.</p>
             * <blockquote>
             * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
             * </blockquote>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public PathConfig build() {
                return new PathConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardingRulesResponseBody</p>
     */
    public static class RuleConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostConfig")
        private HostConfig hostConfig;

        @com.aliyun.core.annotation.NameInMap("PathConfig")
        private PathConfig pathConfig;

        @com.aliyun.core.annotation.NameInMap("RuleConditionType")
        private String ruleConditionType;

        @com.aliyun.core.annotation.NameInMap("RuleConditionValue")
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

            private Builder() {
            } 

            private Builder(RuleConditions model) {
                this.hostConfig = model.hostConfig;
                this.pathConfig = model.pathConfig;
                this.ruleConditionType = model.ruleConditionType;
                this.ruleConditionValue = model.ruleConditionValue;
            } 

            /**
             * <p>The domain name configuration.</p>
             * <blockquote>
             * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
             * </blockquote>
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * <p>The path configuration.</p>
             * <blockquote>
             * <p> GA instances created after July 12, 2022 support all forwarding condition types and action types. We recommend that you query forwarding conditions and actions by calling the <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> operations.</p>
             * </blockquote>
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * <p>The type of the forwarding condition. Valid values:</p>
             * <ul>
             * <li><strong>Host:</strong> domain name.</li>
             * <li><strong>Path:</strong> path.</li>
             * <li><strong>RequestHeader:</strong> HTTP header.</li>
             * <li><strong>Query:</strong> query string.</li>
             * <li><strong>Method:</strong> HTTP method.</li>
             * <li><strong>Cookie:</strong> cookie.</li>
             * <li><strong>SourceIP:</strong> source IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Host</p>
             */
            public Builder ruleConditionType(String ruleConditionType) {
                this.ruleConditionType = ruleConditionType;
                return this;
            }

            /**
             * <p>The value of the forwarding condition type.</p>
             * <p>Different JSON strings are returned based on the value of the <strong>RuleConditionType</strong> parameter.</p>
             * <ul>
             * <li>If you set <strong>RuleConditionType</strong> to <strong>Host</strong>, a domain name condition is returned. If multiple domain names are returned in a forwarding condition, the relationship between the domain names is OR.</li>
             * <li>If you set <strong>RuleConditionType</strong> to <strong>Path</strong>, a path condition is returned. If multiple forwarding conditions of the path type are returned in a forwarding rule, the relationship between the forwarding conditions is OR. If multiple paths are returned in a forwarding condition, the relationship between the paths is OR.</li>
             * <li>If you set <strong>RuleConditionType</strong> to <strong>RequestHeader</strong>, an HTTP header condition that consists of key-value pairs is returned.</li>
             * <li>If you set <strong>RuleConditionType</strong> to <strong>Query</strong>, a query string condition that consists of key-value pairs is returned.</li>
             * <li>If you set <strong>RuleConditionType</strong> to <strong>Method</strong>, an HTTP method condition is returned.</li>
             * <li>If you set <strong>RuleConditionType</strong> to <strong>Cookie</strong>, a cookie condition that consists of key-value pairs is returned.</li>
             * <li>If you set <strong>RuleConditionType</strong> to <strong>SourceIP</strong>, a source IP address condition is returned. If multiple source IP addresses are returned in a forwarding condition, the relationship between the source IP addresses is OR.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;<a href="http://www.example.com">www.example.com</a>&quot;, &quot;<a href="http://www.aliyun.com%22%5D">www.aliyun.com&quot;]</a></p>
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
    /**
     * 
     * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardingRulesResponseBody</p>
     */
    public static class ServiceManagedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ChildType")
        private String childType;

        @com.aliyun.core.annotation.NameInMap("IsManaged")
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

            private Builder() {
            } 

            private Builder(ServiceManagedInfos model) {
                this.action = model.action;
                this.childType = model.childType;
                this.isManaged = model.isManaged;
            } 

            /**
             * <p>The name of the action that you can perform on the managed instance. Valid values:</p>
             * <ul>
             * <li><strong>Create</strong>: Create an instance.</li>
             * <li><strong>Update</strong>: Update the current instance.</li>
             * <li><strong>Delete</strong>: Delete the current instance.</li>
             * <li><strong>Associate</strong>: Reference the current instance.</li>
             * <li><strong>UserUnmanaged</strong>: Unmanage the instance.</li>
             * <li><strong>CreateChild</strong>: Create a child resource on the current instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Update</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The type of the child resource. Valid values:</p>
             * <ul>
             * <li><strong>Listener</strong>: listener.</li>
             * <li><strong>IpSet</strong>: acceleration region.</li>
             * <li><strong>EndpointGroup</strong>: endpoint group.</li>
             * <li><strong>ForwardingRule</strong>: forwarding rule.</li>
             * <li><strong>Endpoint</strong>: endpoint.</li>
             * <li><strong>EndpointGroupDestination</strong>: the protocol mapping of an endpoint group associated with a custom routing listener.</li>
             * <li><strong>EndpointPolicy</strong>: the traffic policy of an endpoint associated with a custom routing listener.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Listener</p>
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * <p>Indicates whether the specified actions are managed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The specified actions are managed, and users cannot perform the specified actions on the managed instance.</li>
             * <li><strong>false</strong>: The specified actions are not managed, and users can perform the specified actions on the managed instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link ListForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardingRulesResponseBody</p>
     */
    public static class ForwardingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardingRuleDirection")
        private String forwardingRuleDirection;

        @com.aliyun.core.annotation.NameInMap("ForwardingRuleId")
        private String forwardingRuleId;

        @com.aliyun.core.annotation.NameInMap("ForwardingRuleName")
        private String forwardingRuleName;

        @com.aliyun.core.annotation.NameInMap("ForwardingRuleStatus")
        private String forwardingRuleStatus;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RuleActions")
        private java.util.List<RuleActions> ruleActions;

        @com.aliyun.core.annotation.NameInMap("RuleConditions")
        private java.util.List<RuleConditions> ruleConditions;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
        private java.util.List<ServiceManagedInfos> serviceManagedInfos;

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
        public java.util.List<RuleActions> getRuleActions() {
            return this.ruleActions;
        }

        /**
         * @return ruleConditions
         */
        public java.util.List<RuleConditions> getRuleConditions() {
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
        public java.util.List<ServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public static final class Builder {
            private String forwardingRuleDirection; 
            private String forwardingRuleId; 
            private String forwardingRuleName; 
            private String forwardingRuleStatus; 
            private String listenerId; 
            private Integer priority; 
            private java.util.List<RuleActions> ruleActions; 
            private java.util.List<RuleConditions> ruleConditions; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List<ServiceManagedInfos> serviceManagedInfos; 

            private Builder() {
            } 

            private Builder(ForwardingRules model) {
                this.forwardingRuleDirection = model.forwardingRuleDirection;
                this.forwardingRuleId = model.forwardingRuleId;
                this.forwardingRuleName = model.forwardingRuleName;
                this.forwardingRuleStatus = model.forwardingRuleStatus;
                this.listenerId = model.listenerId;
                this.priority = model.priority;
                this.ruleActions = model.ruleActions;
                this.ruleConditions = model.ruleConditions;
                this.serviceId = model.serviceId;
                this.serviceManaged = model.serviceManaged;
                this.serviceManagedInfos = model.serviceManagedInfos;
            } 

            /**
             * <p>The direction in which the forwarding rule takes effect.</p>
             * <p>By default, <strong>request</strong> is returned, which indicates that the forwarding rule takes effect on requests.</p>
             * 
             * <strong>example:</strong>
             * <p>request</p>
             */
            public Builder forwardingRuleDirection(String forwardingRuleDirection) {
                this.forwardingRuleDirection = forwardingRuleDirection;
                return this;
            }

            /**
             * <p>The forwarding rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>frule-bp19a3t3yzr21q3****</p>
             */
            public Builder forwardingRuleId(String forwardingRuleId) {
                this.forwardingRuleId = forwardingRuleId;
                return this;
            }

            /**
             * <p>The forwarding rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_named_rule</p>
             */
            public Builder forwardingRuleName(String forwardingRuleName) {
                this.forwardingRuleName = forwardingRuleName;
                return this;
            }

            /**
             * <p>The state of the forwarding rule. Valid values:</p>
             * <ul>
             * <li><strong>active:</strong> The forwarding rule is normal.</li>
             * <li><strong>configuring:</strong> The forwarding rule is being modified.</li>
             * <li><strong>deleting:</strong> The forwarding rule is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder forwardingRuleStatus(String forwardingRuleStatus) {
                this.forwardingRuleStatus = forwardingRuleStatus;
                return this;
            }

            /**
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsr-bp1s0vzbi5bxlx5****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The priority of the forwarding rule.</p>
             * <p>A value between <strong>1</strong> and <strong>10000</strong> is returned. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The forwarding actions.</p>
             */
            public Builder ruleActions(java.util.List<RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>The conditions that trigger the forwarding rule.</p>
             */
            public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * <p>The ID of the service that manages the instance.</p>
             * <blockquote>
             * <p> This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ALB</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Indicates whether the GA instance is managed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The GA instance is managed.</li>
             * <li><strong>false</strong>: The GA instance is not managed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The actions that you can perform on the managed instance.</p>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
             * </blockquote>
             * <ul>
             * <li>You can perform only specific actions on the managed instance.</li>
             * </ul>
             */
            public Builder serviceManagedInfos(java.util.List<ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            public ForwardingRules build() {
                return new ForwardingRules(this);
            } 

        } 

    }
}
