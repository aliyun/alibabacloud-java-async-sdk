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
 * {@link UpdateForwardingRulesRequest} extends {@link RequestModel}
 *
 * <p>UpdateForwardingRulesRequest</p>
 */
public class UpdateForwardingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardingRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ForwardingRules> forwardingRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateForwardingRulesRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.forwardingRules = builder.forwardingRules;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateForwardingRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return forwardingRules
     */
    public java.util.List<ForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateForwardingRulesRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private java.util.List<ForwardingRules> forwardingRules; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateForwardingRulesRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.forwardingRules = request.forwardingRules;
            this.listenerId = request.listenerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The GA instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp17frjjh0udz4q****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configurations of the forwarding rules.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder forwardingRules(java.util.List<ForwardingRules> forwardingRules) {
            this.putQueryParameter("ForwardingRules", forwardingRules);
            this.forwardingRules = forwardingRules;
            return this;
        }

        /**
         * <p>The listener ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1s0vzbi5bxlx5****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateForwardingRulesRequest build() {
            return new UpdateForwardingRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateForwardingRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateForwardingRulesRequest</p>
     */
    public static class ServerGroupTuples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The ID of the endpoint group.</p>
             * <blockquote>
             * <p> We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> rather than this parameter to configure forwarding actions.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>epg-bp1ieei9664r5nv****</p>
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
     * {@link UpdateForwardingRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateForwardingRulesRequest</p>
     */
    public static class ForwardGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupTuples")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The configuration of an endpoint group.</p>
             * <blockquote>
             * <p> We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> rather than this parameter to configure forwarding actions.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
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
     * {@link UpdateForwardingRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateForwardingRulesRequest</p>
     */
    public static class RuleActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @com.aliyun.core.annotation.NameInMap("Order")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("RuleActionType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The forwarding configuration.</p>
             * <blockquote>
             * <p> We recommend that you use <strong>RuleActionType</strong> and <strong>RuleActionValue</strong> rather than this parameter to configure forwarding actions.</p>
             * </blockquote>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The forwarding priority.</p>
             * <blockquote>
             * <p> This parameter does not take effect. Ignore this parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
             * <li><strong>RemoveHeaderConfig</strong>: deletes the header of a request.</li>
             * <li><strong>Drop</strong>: drops a request.</li>
             * </ul>
             * <p>This parameter is required.</p>
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
             * <p>You must specify different JSON strings based on <strong>RuleActionType</strong>.</p>
             * <p>A forwarding rule can contain only one forwarding action whose type is <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixResponse</strong>. You must specify a forwarding action whose type is <strong>Rewrite</strong>, <strong>AddHeader</strong>, or <strong>RemoveHeader</strong> before a forwarding action whose type is <strong>ForwardGroup</strong>.</p>
             * <ul>
             * <li><p>If <strong>RuleActionType</strong> is set to <strong>ForwardGroup</strong>, this parameter specifies the information of a virtual endpoint group. You can forward requests to only one virtual endpoint group. Example: <code>{&quot;type&quot;:&quot;endpointgroup&quot;, &quot;value&quot;:&quot;epg-bp1enpdcrqhl78g6r****&quot;}</code>.</p>
             * <ul>
             * <li><code>type</code>: Set this parameter to <code>endpointgroup</code>.</li>
             * <li><code>value</code>: Set this parameter to the ID of a virtual endpoint group.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleActionType</strong> is set to <strong>Redirect</strong>, this parameter specifies redirecting configurations. You cannot leave the following parameters empty or use the default values for the following parameters for a forwarding action whose type is <strong>Redirect</strong>: <code>protocol</code>, <code>domain</code>, <code>port</code>, <code>path</code>, and <code>query</code>. Example: <code>{&quot;protocol&quot;:&quot;HTTP&quot;, &quot;domain&quot;:&quot;www.example.com&quot;, &quot;port&quot;:&quot;80&quot;, &quot;path&quot;:&quot;/a&quot;,&quot;query&quot;:&quot;value1&quot;, &quot;code&quot;:&quot;301&quot; }</code>.</p>
             * <ul>
             * <li><code>protocol</code>: the protocol of requests after the requests are redirected. Valid values: <code>${protocol}</code> (default), <code>HTTP</code>, and <code>HTTPS</code>.</li>
             * <li><code>domain</code>: the domain name to which requests are redirected. Default value: <code>${host}</code>. You can also enter a domain name. The domain name must be 3 to 128 characters in length, and can contain only letters, digits, and the following special characters: <code>. - ? = ~ _ - + / ^ * ! $ &amp; | ( ) [ ]</code>.</li>
             * <li><code>port</code>: the port to which requests are redirected. Default value: <code>${port}</code>. You can enter a port number from 1 to 63335.</li>
             * <li><code>path</code>: the path to which requests are redirected. Default value: <code>${path}</code>. The path must be 1 to 128 characters in length. To use a regular expression, the path can contain letters, digits, and the following special characters: <code>. - _ / = ? ~ ^ * $ : ( ) [ ] + |</code>. The path must start with a tilde (~). If you do not want to use a regular expression, the path can contain letters, digits, and the following special characters: <code>. - _ / = ? :</code>. The path must start with a forward slash (/).</li>
             * <li><code>query</code>: the query string of the requests that are redirected. Default value: <code>${query}</code>. You can also specify a query string. The query string must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and smaller than 127</code>. The query string cannot contain uppercase letters, space characters, or the following special characters: <code>[ ] { } &lt; &gt; # | &amp;</code>.</li>
             * <li><code>code</code>: the redirect code. Valid values: <code>301</code>, <code>302</code>, <code>303</code>, <code>307</code>, and <code>308</code>.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleActionType</strong> is set to <strong>FixResponse</strong>, this parameter specifies a fixed response. Example: <code>{&quot;code&quot;:&quot;200&quot;, &quot;type&quot;:&quot;text/plain&quot;, &quot;content&quot;:&quot;dssacav&quot; }</code>.</p>
             * <ul>
             * <li><code>code</code>: the HTTP response status code. The response status code must be one of the following numeric strings: <code>2xx</code>, <code>4xx</code>, and <code>5xx</code>. The letter <code>x</code> indicates a number from 0 to 9.</li>
             * <li><code>type</code>: the type of the response content. Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</li>
             * <li><code>content</code>: the response content. The response content cannot exceed 1,000 characters in length, and does not support Chinese characters.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleActionType</strong> is set to <strong>AddHeader</strong>, this parameter specifies an HTTP header to be added. If a forwarding rule contains a forwarding action whose type is <strong>AddHeader</strong>, you must specify another forwarding action whose type is <strong>ForwardGroup</strong>. Example: <code>[{&quot;name&quot;:&quot;header1&quot;,&quot;type&quot;:&quot;userdefined&quot;, &quot;value&quot;:&quot;value&quot;}]</code>.</p>
             * <ul>
             * <li><code>name</code>: the name of the HTTP header. The name must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). The name of the HTTP header specified by <strong>AddHeader</strong> must be unique and cannot be the same as the name of the HTTP header specified by <strong>RemoveHeader</strong>.</li>
             * <li><code>type</code>: the content type of the HTTP header. Valid values: <code>user-defined</code>, <code>ref</code>, and <code>system-defined</code>.</li>
             * <li><code>value</code>: the content of the HTTP header. You cannot leave this parameter empty. If you set <code>type</code> to <code>user-defined</code>, the content must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and smaller than 127</code>. The content can contain letters, digits, hyphens (-), and underscores (<em>*). The content cannot start or end with a space character. If you set <code>type</code> to <code>ref</code>, the content must be 1 to 128 characters in length, and can contain letters, digits, hyphens (-), and underscores (</em>*). The content cannot start or end with a space character. If you set <code>type</code> to <code>system-defined</code>, only <code>ClientSrcIp</code> is supported.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleActionType</strong> is set to <strong>RemoveHeader</strong>, this parameter specifies an HTTP header to be removed. If a forwarding rule contains a forwarding action whose type is <strong>RemoveHeader</strong>, you must specify another forwarding action whose type is <strong>ForwardGroup</strong>. The header must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). Example: <code>[&quot;header1&quot;]</code>.</p>
             * </li>
             * <li><p>If <strong>RuleActionType</strong> is set to <strong>Rewrite</strong>, this parameter specifies the rewriting configuration. If a forwarding rule contains a forwarding action whose type is <strong>Rewrite</strong>, you must specify another forwarding action whose type is <strong>ForwardGroup</strong>. Example: <code>{&quot;domain&quot;:&quot;value1&quot;, &quot;path&quot;:&quot;value2&quot;, &quot;query&quot;:&quot;value3&quot;}</code>.</p>
             * <ul>
             * <li><code>domain</code>: the domain name to which requests are redirected. Default value: <code>${host}</code>. You can also enter a domain name. The domain name must be 3 to 128 characters in length, and can contain only lowercase letters, digits, and the following special characters: <code>. - ? = ~ _ - + / ^ * ! $ &amp; | ( ) [ ]</code>.</li>
             * <li><code>path</code>: the path to which requests are redirected. Default value: <code>${path}</code>. The path must be 1 to 128 characters in length. To use a regular expression, the path can contain letters, digits, and the following special characters: <code>. - _ / = ? ~ ^ * $ : ( ) [ ] + |</code>. The path must start with a tilde (~). If you do not want to use a regular expression, the path can contain letters, digits, and the following special characters: <code>. - _ / = ? :</code>. The path must start with a forward slash (/).</li>
             * <li><code>query</code>: the query string of the requests that are redirected. Default value: <code>${query}</code>. You can also specify a query string. The query string must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are <code>greater than or equal to 32 and smaller than 127</code>. The query string cannot contain uppercase letters, space characters, or the following special characters: <code>[ ] { } &lt; &gt; # | &amp;</code>.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleActionType</strong> is set to <strong>Drop</strong>, you do not need to specify this parameter.</p>
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
     * {@link UpdateForwardingRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateForwardingRulesRequest</p>
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
             * <p> We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> rather than this parameter to configure forwarding conditions.</p>
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
     * {@link UpdateForwardingRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateForwardingRulesRequest</p>
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
             * <p> We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> rather than this parameter to configure forwarding conditions.</p>
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
     * {@link UpdateForwardingRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateForwardingRulesRequest</p>
     */
    public static class RuleConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostConfig")
        private HostConfig hostConfig;

        @com.aliyun.core.annotation.NameInMap("PathConfig")
        private PathConfig pathConfig;

        @com.aliyun.core.annotation.NameInMap("RuleConditionType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p> We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> rather than this parameter to configure forwarding conditions.</p>
             * </blockquote>
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * <p>The path configuration.</p>
             * <blockquote>
             * <p> We recommend that you use <strong>RuleConditionType</strong> and <strong>RuleConditionValue</strong> rather than this parameter to configure forwarding conditions.</p>
             * </blockquote>
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * <p>The type of the forwarding condition. Valid values:</p>
             * <ul>
             * <li><strong>Host</strong>: Requests are forwarded based on domain names.</li>
             * <li><strong>Path</strong>: Requests are forwarded based on paths.</li>
             * <li><strong>RequestHeader</strong>: Requests are forwarded based on HTTP headers.</li>
             * <li><strong>Query</strong>: Requests are forwarded based on query strings.</li>
             * <li><strong>Method</strong>: Requests are forwarded based on HTTP request methods.</li>
             * <li><strong>Cookie</strong>: Requests are forwarded based on cookies.</li>
             * <li><strong>SourceIp</strong>: Requests are forwarded based on source IP addresses.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Host</p>
             */
            public Builder ruleConditionType(String ruleConditionType) {
                this.ruleConditionType = ruleConditionType;
                return this;
            }

            /**
             * <p>The value of the forwarding condition. You must specify different JSON strings based on <strong>RuleConditionType</strong>.</p>
             * <ul>
             * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Host</strong>, RuleConditionValue specifies a domain name condition. A forwarding rule can contain only one forwarding condition of the host type. You can specify multiple domain names in a forwarding condition. The relationship between multiple domain names is OR. The domain name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), and periods (.). You can use asterisks (*) and question marks (?) as wildcard characters. Example: <code>[&quot;www.example.com&quot;, &quot;www.aliyun.com&quot;]</code>.</p>
             * </li>
             * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Path</strong>, RuleConditionValue specifies a path condition. A forwarding rule can contain multiple forwarding conditions of the path type. The relationship between multiple path conditions is OR. You can specify multiple paths in a forwarding condition. The relationship between multiple paths is OR. The path must be 1 to 128 characters in length, and must start with a forward slash (/). The path can contain letters, digits, and the following special characters: $ - _ . + / &amp; ~ @ : &quot;. Supported wildcard characters are asterisks (*) and question marks (?). Example: <code>[&quot;/a&quot;, &quot;/b/&quot;]</code>.</p>
             * </li>
             * <li><p>If <strong>RuleConditionType</strong> is set to <strong>RequestHeader</strong>, RuleConditionValue specifies an HTTP header condition. An HTTP header consists of a key and a value. The header values in a forwarding condition must be unique. Example: <code>[{&quot;header1&quot;:[&quot;value1&quot;,&quot;value2&quot;]}]</code>.</p>
             * <ul>
             * <li>Key: The key of an HTTP header must be 1 to 40 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</li>
             * <li>Value: The value of an HTTP header must be 1 to 128 characters in length and can contain printable characters whose ASCII values <code>are larger than or equal to 32 and smaller than 127</code>. The value cannot start or end with a space.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Query</strong>, RuleConditionValue specifies a query string condition. A query string consists of a key and a value. Example: <code>[{&quot;query1&quot;:[&quot;value1&quot;]}, {&quot;query2&quot;:[&quot;value2&quot;]}]</code>.</p>
             * <ul>
             * <li>Key: The key must be 1 to 100 characters in length and can contain printable characters whose ASCII values <code>are larger than or equal to 32 and smaller than 127</code>, excluding uppercase letters, spaces, and the following special characters: <code>[ ] { } &lt; &gt; \ ; / ? : @ &amp; = + , $ % &quot; ^ ~</code>.</li>
             * <li>Value: The value must be 1 to 128 characters in length and can contain printable characters whose ASCII values <code>are larger than or equal to 32 and smaller than 127</code>, excluding uppercase letters, spaces, and the following special characters: <code>[ ] { } &lt; &gt; \ ; / ? : @ &amp; = + , $ % &quot; ^ ~</code>.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Method</strong>, RuleConditionValue specifies an HTTP method condition. Valid values: <strong>HEAD</strong>, <strong>GET</strong>, <strong>POST</strong>, <strong>OPTIONS</strong>, <strong>PUT</strong>, <strong>PATCH</strong>, and <strong>DELETE</strong>. Example: <code>[&quot;GET&quot;, &quot;OPTIONS&quot;, &quot;POST&quot;]</code>.</p>
             * </li>
             * <li><p>If <strong>RuleConditionType</strong> is set to <strong>Cookie</strong>, RuleConditionValue specifies a cookie condition. A cookie consists of a key and a value. Example: <code>[{&quot;cookie1&quot;:[&quot;value1&quot;]}, {&quot;cookie2&quot;:[&quot;value2&quot;]}]</code>.</p>
             * <ul>
             * <li>Key: The key of a cookie must be 1 to 100 characters in length and can contain printable characters whose ASCII values <code>are larger than or equal to 32 and smaller than 127</code>, excluding uppercase letters, spaces, and the following special characters: <code># [ ] { } \ &lt; &gt; &amp;</code>.</li>
             * <li>Value: The value of a cookie must be 1 to 128 characters in length and can contain printable characters whose ASCII values <code>are larger than or equal to 32 and smaller than 127</code>, excluding uppercase letters, spaces, and the following special characters: <code># [ ] { } \ &lt; &gt; &amp;</code>.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>RuleConditionType</strong> is set to <strong>SourceIP</strong>, RuleConditionValue specifies a source IP address condition. IP addresses, such as 1.1.XX.XX/32, and CIDR blocks, such as 2.2.XX.XX/24, are supported. A forwarding rule can contain only one forwarding condition of the SourceIP type. You can specify multiple source IP addresses or CIDR blocks in a forwarding condition. The relationship between multiple IP addresses or CIDR blocks is OR. Example: <code>[&quot;1.1.XX.XX/32&quot;, &quot;2.2.XX.XX/24&quot;]</code>.</p>
             * </li>
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
     * {@link UpdateForwardingRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateForwardingRulesRequest</p>
     */
    public static class ForwardingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardingRuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String forwardingRuleId;

        @com.aliyun.core.annotation.NameInMap("ForwardingRuleName")
        private String forwardingRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RuleActions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<RuleActions> ruleActions;

        @com.aliyun.core.annotation.NameInMap("RuleConditions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<RuleConditions> ruleConditions;

        @com.aliyun.core.annotation.NameInMap("RuleDirection")
        private String ruleDirection;

        private ForwardingRules(Builder builder) {
            this.forwardingRuleId = builder.forwardingRuleId;
            this.forwardingRuleName = builder.forwardingRuleName;
            this.priority = builder.priority;
            this.ruleActions = builder.ruleActions;
            this.ruleConditions = builder.ruleConditions;
            this.ruleDirection = builder.ruleDirection;
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
         * @return ruleDirection
         */
        public String getRuleDirection() {
            return this.ruleDirection;
        }

        public static final class Builder {
            private String forwardingRuleId; 
            private String forwardingRuleName; 
            private Integer priority; 
            private java.util.List<RuleActions> ruleActions; 
            private java.util.List<RuleConditions> ruleConditions; 
            private String ruleDirection; 

            private Builder() {
            } 

            private Builder(ForwardingRules model) {
                this.forwardingRuleId = model.forwardingRuleId;
                this.forwardingRuleName = model.forwardingRuleName;
                this.priority = model.priority;
                this.ruleActions = model.ruleActions;
                this.ruleConditions = model.ruleConditions;
                this.ruleDirection = model.ruleDirection;
            } 

            /**
             * <p>The forwarding rule ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>frule-bp1dii16gu9qdvb34****</p>
             */
            public Builder forwardingRuleId(String forwardingRuleId) {
                this.forwardingRuleId = forwardingRuleId;
                return this;
            }

            /**
             * <p>The forwarding rule name.</p>
             * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder forwardingRuleName(String forwardingRuleName) {
                this.forwardingRuleName = forwardingRuleName;
                return this;
            }

            /**
             * <p>The priority of the forwarding rule. Valid values: <strong>1</strong> to <strong>10000</strong>. A smaller value specifies a higher priority.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The configurations of the forwarding actions.</p>
             * <p>This parameter is required.</p>
             */
            public Builder ruleActions(java.util.List<RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>The conditions that trigger the forwarding rule.</p>
             * <p>This parameter is required.</p>
             */
            public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * <p>The direction in which the rule takes effect. You do not need to specify this parameter.</p>
             * <p>By default, this parameter is set to <strong>request</strong>, which specifies that the rule takes effect on requests.</p>
             * 
             * <strong>example:</strong>
             * <p>request</p>
             */
            public Builder ruleDirection(String ruleDirection) {
                this.ruleDirection = ruleDirection;
                return this;
            }

            public ForwardingRules build() {
                return new ForwardingRules(this);
            } 

        } 

    }
}
