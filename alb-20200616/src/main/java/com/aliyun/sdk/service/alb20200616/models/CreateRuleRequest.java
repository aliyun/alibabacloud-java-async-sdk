// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleActions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RuleActions> ruleActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConditions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RuleConditions> ruleConditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.direction = builder.direction;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
        this.priority = builder.priority;
        this.ruleActions = builder.ruleActions;
        this.ruleConditions = builder.ruleConditions;
        this.ruleName = builder.ruleName;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleRequest create() {
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
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateRuleRequest, Builder> {
        private String clientToken; 
        private String direction; 
        private Boolean dryRun; 
        private String listenerId; 
        private Integer priority; 
        private java.util.List<RuleActions> ruleActions; 
        private java.util.List<RuleConditions> ruleConditions; 
        private String ruleName; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.direction = request.direction;
            this.dryRun = request.dryRun;
            this.listenerId = request.listenerId;
            this.priority = request.priority;
            this.ruleActions = request.ruleActions;
            this.ruleConditions = request.ruleConditions;
            this.ruleName = request.ruleName;
            this.tag = request.tag;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not set this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The direction of the forwarding rule. Valid values:</p>
         * <ul>
         * <li><p><strong>Request</strong> (default): matches and processes packets sent from clients to ALB.</p>
         * </li>
         * <li><p><strong>Response</strong>: matches and processes packets returned from backend server groups to ALB.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>ALB instances of Basic Edition do not support the <strong>Response</strong> type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Request</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs only a dry run and does not create the forwarding rule. The system checks whether the required parameters are set, and validates the request format and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an <code>HTTP 2xx</code> status code is returned and the operation is performed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the listener on the Application Load Balancing (ALB) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-l16uo9y******</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The priority of the rule. Valid values: <strong>1</strong> to <strong>10000</strong>. A smaller value indicates a higher priority.</p>
         * <blockquote>
         * <p>The priority of each rule within the same listener must be unique.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The list of forwarding rule actions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ruleActions(java.util.List<RuleActions> ruleActions) {
            this.putQueryParameter("RuleActions", ruleActions);
            this.ruleActions = ruleActions;
            return this;
        }

        /**
         * <p>The list of forwarding rule conditions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
            this.putQueryParameter("RuleConditions", ruleConditions);
            this.ruleConditions = ruleConditions;
            return this;
        }

        /**
         * <p>The forwarding rule name. </p>
         * <ul>
         * <li>Must be 2 to 128 characters in length.</li>
         * <li>Must start with a letter, Chinese character, or digit. Can contain digits, periods (.), underscores (_), hyphens (-), and spaces.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-doc</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class CorsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCredentials")
        private String allowCredentials;

        @com.aliyun.core.annotation.NameInMap("AllowHeaders")
        private java.util.List<String> allowHeaders;

        @com.aliyun.core.annotation.NameInMap("AllowMethods")
        private java.util.List<String> allowMethods;

        @com.aliyun.core.annotation.NameInMap("AllowOrigin")
        private java.util.List<String> allowOrigin;

        @com.aliyun.core.annotation.NameInMap("ExposeHeaders")
        private java.util.List<String> exposeHeaders;

        @com.aliyun.core.annotation.NameInMap("MaxAge")
        private Long maxAge;

        private CorsConfig(Builder builder) {
            this.allowCredentials = builder.allowCredentials;
            this.allowHeaders = builder.allowHeaders;
            this.allowMethods = builder.allowMethods;
            this.allowOrigin = builder.allowOrigin;
            this.exposeHeaders = builder.exposeHeaders;
            this.maxAge = builder.maxAge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CorsConfig create() {
            return builder().build();
        }

        /**
         * @return allowCredentials
         */
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        /**
         * @return allowHeaders
         */
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        /**
         * @return allowMethods
         */
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        /**
         * @return allowOrigin
         */
        public java.util.List<String> getAllowOrigin() {
            return this.allowOrigin;
        }

        /**
         * @return exposeHeaders
         */
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        /**
         * @return maxAge
         */
        public Long getMaxAge() {
            return this.maxAge;
        }

        public static final class Builder {
            private String allowCredentials; 
            private java.util.List<String> allowHeaders; 
            private java.util.List<String> allowMethods; 
            private java.util.List<String> allowOrigin; 
            private java.util.List<String> exposeHeaders; 
            private Long maxAge; 

            private Builder() {
            } 

            private Builder(CorsConfig model) {
                this.allowCredentials = model.allowCredentials;
                this.allowHeaders = model.allowHeaders;
                this.allowMethods = model.allowMethods;
                this.allowOrigin = model.allowOrigin;
                this.exposeHeaders = model.exposeHeaders;
                this.maxAge = model.maxAge;
            } 

            /**
             * <p>Specifies whether to allow credentials. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: yes.</li>
             * <li><strong>off</strong>: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder allowCredentials(String allowCredentials) {
                this.allowCredentials = allowCredentials;
                return this;
            }

            /**
             * <p>The list of allowed cross-origin headers.</p>
             */
            public Builder allowHeaders(java.util.List<String> allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * <p>The allowed HTTP methods for cross-origin requests.</p>
             */
            public Builder allowMethods(java.util.List<String> allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * <p>The list of allowed origins. You can specify a single asterisk (<code>*</code>) or one or more values.</p>
             * <ul>
             * <li>Each value must start with <code>http://</code> or <code>https://</code>, followed by a valid domain name or a first-level wildcard domain name (example: <code>http://*.test.abc.example.com</code>).</li>
             * <li>You can omit the port or specify a port in the range of <strong>1</strong> to <strong>65535</strong>.</li>
             * </ul>
             */
            public Builder allowOrigin(java.util.List<String> allowOrigin) {
                this.allowOrigin = allowOrigin;
                return this;
            }

            /**
             * <p>The list of exposed headers.</p>
             */
            public Builder exposeHeaders(java.util.List<String> exposeHeaders) {
                this.exposeHeaders = exposeHeaders;
                return this;
            }

            /**
             * <p>The maximum cache time for preflight requests in the browser. Unit: seconds.</p>
             * <p>Valid values: <strong>-1</strong> to <strong>172800</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxAge(Long maxAge) {
                this.maxAge = maxAge;
                return this;
            }

            public CorsConfig build() {
                return new CorsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class FixedResponseConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("HttpCode")
        private String httpCode;

        private FixedResponseConfig(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.httpCode = builder.httpCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FixedResponseConfig create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return httpCode
         */
        public String getHttpCode() {
            return this.httpCode;
        }

        public static final class Builder {
            private String content; 
            private String contentType; 
            private String httpCode; 

            private Builder() {
            } 

            private Builder(FixedResponseConfig model) {
                this.content = model.content;
                this.contentType = model.contentType;
                this.httpCode = model.httpCode;
            } 

            /**
             * <p>The fixed content to return. The maximum size is 1 KB. Only ASCII characters are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>dssacav</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The format of the fixed content to return. Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>text/plain</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The HTTP status code to return. Only numeric strings in the format of <strong>2xx</strong>, <strong>4xx</strong>, or <strong>5xx</strong> are supported, where <strong>x</strong> represents any digit.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            public FixedResponseConfig build() {
                return new FixedResponseConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class ServerGroupStickySession extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private ServerGroupStickySession(Builder builder) {
            this.enabled = builder.enabled;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupStickySession create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(ServerGroupStickySession model) {
                this.enabled = model.enabled;
                this.timeout = model.timeout;
            } 

            /**
             * <p>Specifies whether to enable session persistence. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables session persistence.</li>
             * <li><strong>false</strong> (default): disables session persistence.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The timeout period. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>. Default value: <strong>1000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public ServerGroupStickySession build() {
                return new ServerGroupStickySession(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class ServerGroupTuples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private ServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupTuples create() {
            return builder().build();
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String serverGroupId; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(ServerGroupTuples model) {
                this.serverGroupId = model.serverGroupId;
                this.weight = model.weight;
            } 

            /**
             * <p>The destination server group to which requests are forwarded.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-k86c1ov501id6p****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The weight. A greater value indicates a higher weight, which means that more requests are forwarded to the server group. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
             * <ul>
             * <li>If only one destination server group is specified and the weight is not specified, the default value is <strong>100</strong>.</li>
             * <li>If more than one destination server group is specified, you must specify the weight for each server group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ServerGroupTuples build() {
                return new ServerGroupTuples(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class ForwardGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupStickySession")
        private ServerGroupStickySession serverGroupStickySession;

        @com.aliyun.core.annotation.NameInMap("ServerGroupTuples")
        private java.util.List<ServerGroupTuples> serverGroupTuples;

        private ForwardGroupConfig(Builder builder) {
            this.serverGroupStickySession = builder.serverGroupStickySession;
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupStickySession
         */
        public ServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List<ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private ServerGroupStickySession serverGroupStickySession; 
            private java.util.List<ServerGroupTuples> serverGroupTuples; 

            private Builder() {
            } 

            private Builder(ForwardGroupConfig model) {
                this.serverGroupStickySession = model.serverGroupStickySession;
                this.serverGroupTuples = model.serverGroupTuples;
            } 

            /**
             * <p>The session persistence configuration across server groups.</p>
             */
            public Builder serverGroupStickySession(ServerGroupStickySession serverGroupStickySession) {
                this.serverGroupStickySession = serverGroupStickySession;
                return this;
            }

            /**
             * <p>The list of destination server groups to which requests are forwarded. You can add up to five destination server groups in a forwarding rule.</p>
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
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class InsertHeaderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private InsertHeaderConfig(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsertHeaderConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String key; 
            private String value; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(InsertHeaderConfig model) {
                this.key = model.key;
                this.value = model.value;
                this.valueType = model.valueType;
            } 

            /**
             * <p>The name of the header to insert. The name must be 1 to 40 characters in length and can contain letters, digits, underscores (_), and hyphens (-). Header names in <strong>InsertHeaderConfig</strong> must be unique.</p>
             * <blockquote>
             * <p>You cannot set the header name to any of the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>, and <code>x-forwarded-host</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the header to insert.</p>
             * <ul>
             * <li>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, valid values are:<ul>
             * <li><strong>ClientSrcPort</strong>: the client port.</li>
             * <li><strong>ClientSrcIp</strong>: the client IP address.</li>
             * <li><strong>Protocol</strong>: the protocol used by the client request (HTTP or HTTPS).</li>
             * <li><strong>SLBId</strong>: the instance ID of the application load balancing instance.</li>
             * <li><strong>SLBPort</strong>: the listener port of the application load balancing instance.</li>
             * </ul>
             * </li>
             * <li>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>, you can customize the header value. The value must be 1 to 128 characters in length and can contain asterisks (*), question marks (?), and printable ASCII characters whose ASCII values are <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. Double quotation marks (&quot;) are not supported. The value cannot start or end with a space, and cannot end with a backslash ().</li>
             * <li>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>, you can reference a field in the request header. The value must be 1 to 128 characters in length and can contain lowercase letters, digits, hyphens (-), and underscores (_).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UserDefined</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The content type of the header field. Valid values:</p>
             * <ul>
             * <li><strong>UserDefined</strong>: a custom header value.</li>
             * <li><strong>ReferenceHeader</strong>: a referenced value from a field in the request header.</li>
             * <li><strong>SystemDefined</strong>: a system-defined header value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UserDefined</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public InsertHeaderConfig build() {
                return new InsertHeaderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class RedirectConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("HttpCode")
        private String httpCode;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        private RedirectConfig(Builder builder) {
            this.host = builder.host;
            this.httpCode = builder.httpCode;
            this.path = builder.path;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedirectConfig create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return httpCode
         */
        public String getHttpCode() {
            return this.httpCode;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private String host; 
            private String httpCode; 
            private String path; 
            private String port; 
            private String protocol; 
            private String query; 

            private Builder() {
            } 

            private Builder(RedirectConfig model) {
                this.host = model.host;
                this.httpCode = model.httpCode;
                this.path = model.path;
                this.port = model.port;
                this.protocol = model.protocol;
                this.query = model.query;
            } 

            /**
             * <p>The host to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><strong>${host}</strong> (default): If this value is used, it cannot be concatenated with other characters.</li>
             * <li>Other values: The character set and format requirements are as follows:<ul>
             * <li>The hostname must be 3 to 256 characters in length and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (*), equal signs (=), tildes (~), underscores (_), plus signs (+), backslashes (), carets (^), exclamation marks (!), dollar signs ($), ampersands (&amp;), vertical bars (|), parentheses (()), square brackets ([]), and question marks (?).</li>
             * <li>The hostname must contain at least one period (.), and the period (.) cannot be at the beginning or end.</li>
             * <li>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost <code>domainlabel</code> can be an asterisk (*).</li>
             * <li>A hyphen (-) cannot be at the beginning or end of other domain labels.</li>
             * <li>Asterisks (*) and question marks (?) can appear anywhere in a domain label.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>${host}</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The HTTP status code for the redirect. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>301</p>
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * <p>The path to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><strong>${path}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with strings within the allowed character set listed below.</li>
             * <li>Other values: The character set and format requirements are as follows:<ul>
             * <li>The path must be 1 to 256 characters in length and is case-sensitive. Asterisks (*) and question marks (?) are supported as wildcards.</li>
             * <li>The path must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$-_.+/&amp;~@:\&quot;*?</code>. The following characters are not supported: <code>&quot;</code>, <code>%</code>, <code>#</code>, <code>;</code>, <code>!</code>, <code>(</code>, <code>)</code>, <code>[</code>, <code>]</code>, <code>^</code>, <code>,</code>, and <code>\</code>. Asterisks (*) and question marks (?) are also supported.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><strong>${port}</strong> (default): This value cannot be used together with other characters.</li>
             * <li>Other values: <strong>1</strong> to <strong>63335</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><strong>${protocol}</strong> (default): This value can only be used independently and cannot be modified or concatenated with other characters.</li>
             * <li><strong>HTTP</strong></li>
             * <li><strong>HTTPS</strong><blockquote>
             * <ul>
             * <li>HTTPS listeners support redirection only to the HTTPS protocol.</li>
             * <li>HTTP listeners support redirection to both HTTP and HTTPS protocols.</li>
             * </ul>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The query string to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><strong>${query}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with strings within the allowed character set listed below.</li>
             * <li>Other values: The character set and format requirements are as follows:<ul>
             * <li>The query string must be 1 to 128 characters in length.</li>
             * <li>Visible characters are supported. Spaces and <code>#[]{}\|&lt;&gt;&quot;</code> are not supported. Letters must be lowercase.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>${query}</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public RedirectConfig build() {
                return new RedirectConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class RemoveHeaderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private RemoveHeaderConfig(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveHeaderConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String key; 

            private Builder() {
            } 

            private Builder(RemoveHeaderConfig model) {
                this.key = model.key;
            } 

            /**
             * <p>The name of the header to remove. The name must be 1 to 40 characters in length and can contain letters, digits, underscores (_), and hyphens (-). Header names in RemoveHeader must be unique.</p>
             * <ul>
             * <li>Request direction (when Direction is set to Request): You cannot set the header name to any of the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>, and <code>x-forwarded-host</code>.</li>
             * <li>Response direction (when Direction is set to Response): You cannot set the header name to any of the following fields (case-insensitive): <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, and <code>transfer-encoding</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public RemoveHeaderConfig build() {
                return new RemoveHeaderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class RewriteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        private RewriteConfig(Builder builder) {
            this.host = builder.host;
            this.path = builder.path;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RewriteConfig create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private String host; 
            private String path; 
            private String query; 

            private Builder() {
            } 

            private Builder(RewriteConfig model) {
                this.host = model.host;
                this.path = model.path;
                this.query = model.query;
            } 

            /**
             * <p>The destination host for the internal rewrite. Valid values:</p>
             * <ul>
             * <li><strong>${host}</strong> (default): This value cannot be concatenated with other characters.</li>
             * <li>Other values: The character format requirements are as follows:<ul>
             * <li>The hostname must be 3 to 256 characters in length and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (*), equal signs (=), tildes (~), underscores (_), plus signs (+), backslashes (), carets (^), exclamation marks (!), dollar signs ($), ampersands (&amp;), vertical bars (|), parentheses (()), square brackets ([]), and question marks (?).</li>
             * <li>The hostname must contain at least one period (.), and the period (.) cannot be at the beginning or end.</li>
             * <li>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost <code>domainlabel</code> can be an asterisk (*).</li>
             * <li>A hyphen (-) cannot be at the beginning or end of other domain labels. Asterisks (*) and question marks (?) can appear anywhere in a domain label.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The path to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><strong>${path}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with strings within the allowed character set listed below.</li>
             * <li>Other values: The character set and format requirements are as follows:<ul>
             * <li>The path must be 1 to 256 characters in length and is case-sensitive. Asterisks (*) and question marks (?) are supported as wildcards.</li>
             * <li>The path must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$-_.+/&amp;~@:\&quot;*?</code>. The following characters are not supported: <code>&quot;</code>, <code>%</code>, <code>#</code>, <code>;</code>, <code>!</code>, <code>(</code>, <code>)</code>, <code>[</code>, <code>]</code>, <code>^</code>, <code>,</code>, and <code>\</code>. Asterisks (*) and question marks (?) are also supported.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/tsdf</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The query string for the internal rewrite. Valid values:</p>
             * <ul>
             * <li><strong>${query}</strong> (default): You can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with strings within the allowed character set listed below.</li>
             * <li>Other values: The character set and format requirements are as follows:<ul>
             * <li>The query string must be 1 to 128 characters in length.</li>
             * <li>Visible characters are supported. Spaces and <code>#[]{}\|&lt;&gt;&quot;</code> are not supported. Letters must be lowercase.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>${query}</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public RewriteConfig build() {
                return new RewriteConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class TrafficLimitConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerIpQps")
        private Integer perIpQps;

        @com.aliyun.core.annotation.NameInMap("QPS")
        private Integer QPS;

        private TrafficLimitConfig(Builder builder) {
            this.perIpQps = builder.perIpQps;
            this.QPS = builder.QPS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficLimitConfig create() {
            return builder().build();
        }

        /**
         * @return perIpQps
         */
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        /**
         * @return QPS
         */
        public Integer getQPS() {
            return this.QPS;
        }

        public static final class Builder {
            private Integer perIpQps; 
            private Integer QPS; 

            private Builder() {
            } 

            private Builder(TrafficLimitConfig model) {
                this.perIpQps = model.perIpQps;
                this.QPS = model.QPS;
            } 

            /**
             * <p>The number of queries per second from a single IP address. Valid values: <strong>1</strong> to <strong>1000000</strong>.</p>
             * <blockquote>
             * <p>If the <strong>QPS</strong> parameter is also configured, the value of <strong>PerIpQps</strong> must be less than the value of <strong>QPS</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder perIpQps(Integer perIpQps) {
                this.perIpQps = perIpQps;
                return this;
            }

            /**
             * <p>The number of queries per second (QPS). Valid values: <strong>1</strong> to <strong>1000000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder QPS(Integer QPS) {
                this.QPS = QPS;
                return this;
            }

            public TrafficLimitConfig build() {
                return new TrafficLimitConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class MirrorGroupConfigServerGroupTuples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        private MirrorGroupConfigServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MirrorGroupConfigServerGroupTuples create() {
            return builder().build();
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public static final class Builder {
            private String serverGroupId; 

            private Builder() {
            } 

            private Builder(MirrorGroupConfigServerGroupTuples model) {
                this.serverGroupId = model.serverGroupId;
            } 

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-00mkgijak0w4qgz9****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            public MirrorGroupConfigServerGroupTuples build() {
                return new MirrorGroupConfigServerGroupTuples(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class MirrorGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupTuples")
        private java.util.List<MirrorGroupConfigServerGroupTuples> serverGroupTuples;

        private MirrorGroupConfig(Builder builder) {
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MirrorGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List<MirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List<MirrorGroupConfigServerGroupTuples> serverGroupTuples; 

            private Builder() {
            } 

            private Builder(MirrorGroupConfig model) {
                this.serverGroupTuples = model.serverGroupTuples;
            } 

            /**
             * <p>The configuration for mirroring traffic to a server group.</p>
             */
            public Builder serverGroupTuples(java.util.List<MirrorGroupConfigServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public MirrorGroupConfig build() {
                return new MirrorGroupConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class TrafficMirrorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MirrorGroupConfig")
        private MirrorGroupConfig mirrorGroupConfig;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private TrafficMirrorConfig(Builder builder) {
            this.mirrorGroupConfig = builder.mirrorGroupConfig;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMirrorConfig create() {
            return builder().build();
        }

        /**
         * @return mirrorGroupConfig
         */
        public MirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private MirrorGroupConfig mirrorGroupConfig; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(TrafficMirrorConfig model) {
                this.mirrorGroupConfig = model.mirrorGroupConfig;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The configuration for mirroring traffic to a server group.</p>
             */
            public Builder mirrorGroupConfig(MirrorGroupConfig mirrorGroupConfig) {
                this.mirrorGroupConfig = mirrorGroupConfig;
                return this;
            }

            /**
             * <p>The target type for traffic mirroring. Valid values:</p>
             * <ul>
             * <li><strong>ForwardGroupMirror</strong>: mirrors traffic to a server group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ForwardGroupMirror</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TrafficMirrorConfig build() {
                return new TrafficMirrorConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class RuleActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorsConfig")
        private CorsConfig corsConfig;

        @com.aliyun.core.annotation.NameInMap("FixedResponseConfig")
        private FixedResponseConfig fixedResponseConfig;

        @com.aliyun.core.annotation.NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @com.aliyun.core.annotation.NameInMap("InsertHeaderConfig")
        private InsertHeaderConfig insertHeaderConfig;

        @com.aliyun.core.annotation.NameInMap("Order")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("RedirectConfig")
        private RedirectConfig redirectConfig;

        @com.aliyun.core.annotation.NameInMap("RemoveHeaderConfig")
        private RemoveHeaderConfig removeHeaderConfig;

        @com.aliyun.core.annotation.NameInMap("RewriteConfig")
        private RewriteConfig rewriteConfig;

        @com.aliyun.core.annotation.NameInMap("TrafficLimitConfig")
        private TrafficLimitConfig trafficLimitConfig;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorConfig")
        private TrafficMirrorConfig trafficMirrorConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private RuleActions(Builder builder) {
            this.corsConfig = builder.corsConfig;
            this.fixedResponseConfig = builder.fixedResponseConfig;
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.insertHeaderConfig = builder.insertHeaderConfig;
            this.order = builder.order;
            this.redirectConfig = builder.redirectConfig;
            this.removeHeaderConfig = builder.removeHeaderConfig;
            this.rewriteConfig = builder.rewriteConfig;
            this.trafficLimitConfig = builder.trafficLimitConfig;
            this.trafficMirrorConfig = builder.trafficMirrorConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActions create() {
            return builder().build();
        }

        /**
         * @return corsConfig
         */
        public CorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        /**
         * @return fixedResponseConfig
         */
        public FixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        /**
         * @return forwardGroupConfig
         */
        public ForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        /**
         * @return insertHeaderConfig
         */
        public InsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return redirectConfig
         */
        public RedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        /**
         * @return removeHeaderConfig
         */
        public RemoveHeaderConfig getRemoveHeaderConfig() {
            return this.removeHeaderConfig;
        }

        /**
         * @return rewriteConfig
         */
        public RewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        /**
         * @return trafficLimitConfig
         */
        public TrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        /**
         * @return trafficMirrorConfig
         */
        public TrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private CorsConfig corsConfig; 
            private FixedResponseConfig fixedResponseConfig; 
            private ForwardGroupConfig forwardGroupConfig; 
            private InsertHeaderConfig insertHeaderConfig; 
            private Integer order; 
            private RedirectConfig redirectConfig; 
            private RemoveHeaderConfig removeHeaderConfig; 
            private RewriteConfig rewriteConfig; 
            private TrafficLimitConfig trafficLimitConfig; 
            private TrafficMirrorConfig trafficMirrorConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(RuleActions model) {
                this.corsConfig = model.corsConfig;
                this.fixedResponseConfig = model.fixedResponseConfig;
                this.forwardGroupConfig = model.forwardGroupConfig;
                this.insertHeaderConfig = model.insertHeaderConfig;
                this.order = model.order;
                this.redirectConfig = model.redirectConfig;
                this.removeHeaderConfig = model.removeHeaderConfig;
                this.rewriteConfig = model.rewriteConfig;
                this.trafficLimitConfig = model.trafficLimitConfig;
                this.trafficMirrorConfig = model.trafficMirrorConfig;
                this.type = model.type;
            } 

            /**
             * <p>The CORS configuration.</p>
             */
            public Builder corsConfig(CorsConfig corsConfig) {
                this.corsConfig = corsConfig;
                return this;
            }

            /**
             * <p>The fixed response content configuration.</p>
             */
            public Builder fixedResponseConfig(FixedResponseConfig fixedResponseConfig) {
                this.fixedResponseConfig = fixedResponseConfig;
                return this;
            }

            /**
             * <p>The list of destination server groups to which requests are forwarded. You can add up to five destination server groups in a forwarding rule.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The configuration for inserting an HTTP header.</p>
             */
            public Builder insertHeaderConfig(InsertHeaderConfig insertHeaderConfig) {
                this.insertHeaderConfig = insertHeaderConfig;
                return this;
            }

            /**
             * <p>The execution order of the forwarding rule action. Valid values: <strong>1</strong> to <strong>50000</strong>. Actions are executed in ascending order of their values. The value cannot be empty and must be unique.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The redirect configuration.</p>
             * <blockquote>
             * <p>For the parameters in <strong>RedirectConfig</strong>, you cannot use default values for all parameters except <strong>HttpCode</strong>.</p>
             * </blockquote>
             */
            public Builder redirectConfig(RedirectConfig redirectConfig) {
                this.redirectConfig = redirectConfig;
                return this;
            }

            /**
             * <p>The configuration for removing an HTTP header.</p>
             */
            public Builder removeHeaderConfig(RemoveHeaderConfig removeHeaderConfig) {
                this.removeHeaderConfig = removeHeaderConfig;
                return this;
            }

            /**
             * <p>The rewrite configuration.</p>
             * <blockquote>
             * <p>If multiple actions are configured in the same forwarding rule, the <strong>RewriteConfig</strong> action must be used together with the <strong>ForwardGroup</strong> action type.</p>
             * </blockquote>
             */
            public Builder rewriteConfig(RewriteConfig rewriteConfig) {
                this.rewriteConfig = rewriteConfig;
                return this;
            }

            /**
             * <p>The traffic throttling configuration.</p>
             */
            public Builder trafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
                this.trafficLimitConfig = trafficLimitConfig;
                return this;
            }

            /**
             * <p>The traffic mirroring configuration.</p>
             */
            public Builder trafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
                this.trafficMirrorConfig = trafficMirrorConfig;
                return this;
            }

            /**
             * <p>The action type. Valid values:</p>
             * <ul>
             * <li><p><strong>ForwardGroup</strong>: forward requests to multiple virtual services.</p>
             * </li>
             * <li><p><strong>Redirect</strong>: redirect requests.</p>
             * </li>
             * <li><p><strong>FixedResponse</strong>: return a fixed response.</p>
             * </li>
             * <li><p><strong>Rewrite</strong>: rewrite requests.</p>
             * </li>
             * <li><p><strong>InsertHeader</strong>: insert an HTTP header.</p>
             * </li>
             * <li><p><strong>RemoveHeader</strong>: delete an HTTP header.</p>
             * </li>
             * <li><p><strong>TrafficLimit</strong>: limit traffic.</p>
             * </li>
             * <li><p><strong>TrafficMirror</strong>: mirror traffic.</p>
             * </li>
             * <li><p><strong>Cors</strong>: configure cross-origin resource sharing (CORS).</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>A forwarding rule must contain at least one <strong>ForwardGroup</strong>, <strong>Redirect</strong>, or <strong>FixedResponse</strong> action. If it is used together with other action types, it must be executed last.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ForwardGroup</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RuleActions build() {
                return new RuleActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Values(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Values model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The cookie key.</p>
             * <ul>
             * <li>Must be 1 to 100 characters in length.</li>
             * <li>Supports visible characters, the asterisk (*) wildcard, and the half-width question mark (?). Letters must be lowercase.</li>
             * <li>Does not support spaces or the following characters: <code>;#[]{}\|&lt;&gt;&amp;&quot;</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The cookie value.</p>
             * <ul>
             * <li>Must be 1 to 100 characters in length.</li>
             * <li>Supports visible characters, the asterisk (*) wildcard, and the half-width question mark (?). Letters must be lowercase.</li>
             * <li>Does not support spaces or the following characters: <code>;#[]{}\|&lt;&gt;&amp;&quot;</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class CookieConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Values> values;

        private CookieConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CookieConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List<Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<Values> values; 

            private Builder() {
            } 

            private Builder(CookieConfig model) {
                this.values = model.values;
            } 

            /**
             * <p>The list of cookie values.</p>
             */
            public Builder values(java.util.List<Values> values) {
                this.values = values;
                return this;
            }

            public CookieConfig build() {
                return new CookieConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class HeaderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private HeaderConfig(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(HeaderConfig model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>The header field key.</p>
             * <ul>
             * <li>Supports 1 to 40 characters.</li>
             * <li>Supports lowercase letters a to z, digits, hyphens (-), and underscores (_).</li>
             * <li>Does not support Cookie and Host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Port</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of header field values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public HeaderConfig build() {
                return new HeaderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
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
             * <p>The list of hostnames.</p>
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
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class MethodConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private MethodConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MethodConfig create() {
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

            private Builder(MethodConfig model) {
                this.values = model.values;
            } 

            /**
             * <p>The list of request methods.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public MethodConfig build() {
                return new MethodConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
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
             * <p>The list of forwarding paths.</p>
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
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class QueryStringConfigValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryStringConfigValues(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryStringConfigValues create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(QueryStringConfigValues model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The query string key.</p>
             * <ul>
             * <li>Must be 1 to 100 characters in length.</li>
             * <li>Supports visible characters, wildcard asterisks (*), and half-width question marks (?). Letters must be lowercase. Does not support spaces or the following characters: <code>#[]{}\|&lt;&gt;&amp;&quot;</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The query string value.</p>
             * <ul>
             * <li>Must be 1 to 128 characters in length.</li>
             * <li>Supports lowercase letters, visible characters, wildcard asterisks (*), and half-width question marks (?). Does not support spaces or the following characters: <code>#[]{}\|&lt;&gt;&amp;&quot;</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryStringConfigValues build() {
                return new QueryStringConfigValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class QueryStringConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<QueryStringConfigValues> values;

        private QueryStringConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryStringConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List<QueryStringConfigValues> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<QueryStringConfigValues> values; 

            private Builder() {
            } 

            private Builder(QueryStringConfig model) {
                this.values = model.values;
            } 

            /**
             * <p>The list of query strings.</p>
             */
            public Builder values(java.util.List<QueryStringConfigValues> values) {
                this.values = values;
                return this;
            }

            public QueryStringConfig build() {
                return new QueryStringConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class ResponseHeaderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private ResponseHeaderConfig(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseHeaderConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(ResponseHeaderConfig model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>The header field key.</p>
             * <ul>
             * <li>Must be 1 to 40 characters in length.</li>
             * <li>Supports lowercase letters a to z, digits, hyphens (-), and underscores (_).</li>
             * <li>Does not support Cookie and Host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of header field values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public ResponseHeaderConfig build() {
                return new ResponseHeaderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class ResponseStatusCodeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private ResponseStatusCodeConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseStatusCodeConfig create() {
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

            private Builder(ResponseStatusCodeConfig model) {
                this.values = model.values;
            } 

            /**
             * <p>The list of response status codes.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public ResponseStatusCodeConfig build() {
                return new ResponseStatusCodeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class SourceIpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private SourceIpConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceIpConfig create() {
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

            private Builder(SourceIpConfig model) {
                this.values = model.values;
            } 

            /**
             * <p>The list of source IP-based service traffic matching conditions.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public SourceIpConfig build() {
                return new SourceIpConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class RuleConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CookieConfig")
        private CookieConfig cookieConfig;

        @com.aliyun.core.annotation.NameInMap("HeaderConfig")
        private HeaderConfig headerConfig;

        @com.aliyun.core.annotation.NameInMap("HostConfig")
        private HostConfig hostConfig;

        @com.aliyun.core.annotation.NameInMap("MethodConfig")
        private MethodConfig methodConfig;

        @com.aliyun.core.annotation.NameInMap("PathConfig")
        private PathConfig pathConfig;

        @com.aliyun.core.annotation.NameInMap("QueryStringConfig")
        private QueryStringConfig queryStringConfig;

        @com.aliyun.core.annotation.NameInMap("ResponseHeaderConfig")
        private ResponseHeaderConfig responseHeaderConfig;

        @com.aliyun.core.annotation.NameInMap("ResponseStatusCodeConfig")
        private ResponseStatusCodeConfig responseStatusCodeConfig;

        @com.aliyun.core.annotation.NameInMap("SourceIpConfig")
        private SourceIpConfig sourceIpConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private RuleConditions(Builder builder) {
            this.cookieConfig = builder.cookieConfig;
            this.headerConfig = builder.headerConfig;
            this.hostConfig = builder.hostConfig;
            this.methodConfig = builder.methodConfig;
            this.pathConfig = builder.pathConfig;
            this.queryStringConfig = builder.queryStringConfig;
            this.responseHeaderConfig = builder.responseHeaderConfig;
            this.responseStatusCodeConfig = builder.responseStatusCodeConfig;
            this.sourceIpConfig = builder.sourceIpConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConditions create() {
            return builder().build();
        }

        /**
         * @return cookieConfig
         */
        public CookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        /**
         * @return headerConfig
         */
        public HeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        /**
         * @return hostConfig
         */
        public HostConfig getHostConfig() {
            return this.hostConfig;
        }

        /**
         * @return methodConfig
         */
        public MethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        /**
         * @return pathConfig
         */
        public PathConfig getPathConfig() {
            return this.pathConfig;
        }

        /**
         * @return queryStringConfig
         */
        public QueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        /**
         * @return responseHeaderConfig
         */
        public ResponseHeaderConfig getResponseHeaderConfig() {
            return this.responseHeaderConfig;
        }

        /**
         * @return responseStatusCodeConfig
         */
        public ResponseStatusCodeConfig getResponseStatusCodeConfig() {
            return this.responseStatusCodeConfig;
        }

        /**
         * @return sourceIpConfig
         */
        public SourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private CookieConfig cookieConfig; 
            private HeaderConfig headerConfig; 
            private HostConfig hostConfig; 
            private MethodConfig methodConfig; 
            private PathConfig pathConfig; 
            private QueryStringConfig queryStringConfig; 
            private ResponseHeaderConfig responseHeaderConfig; 
            private ResponseStatusCodeConfig responseStatusCodeConfig; 
            private SourceIpConfig sourceIpConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(RuleConditions model) {
                this.cookieConfig = model.cookieConfig;
                this.headerConfig = model.headerConfig;
                this.hostConfig = model.hostConfig;
                this.methodConfig = model.methodConfig;
                this.pathConfig = model.pathConfig;
                this.queryStringConfig = model.queryStringConfig;
                this.responseHeaderConfig = model.responseHeaderConfig;
                this.responseStatusCodeConfig = model.responseStatusCodeConfig;
                this.sourceIpConfig = model.sourceIpConfig;
                this.type = model.type;
            } 

            /**
             * <p>The cookie configuration.</p>
             */
            public Builder cookieConfig(CookieConfig cookieConfig) {
                this.cookieConfig = cookieConfig;
                return this;
            }

            /**
             * <p>The header field configuration.</p>
             */
            public Builder headerConfig(HeaderConfig headerConfig) {
                this.headerConfig = headerConfig;
                return this;
            }

            /**
             * <p>The host configuration.</p>
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * <p>The request method configuration.</p>
             */
            public Builder methodConfig(MethodConfig methodConfig) {
                this.methodConfig = methodConfig;
                return this;
            }

            /**
             * <p>The forwarding path configuration.</p>
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * <p>The query string configuration.</p>
             */
            public Builder queryStringConfig(QueryStringConfig queryStringConfig) {
                this.queryStringConfig = queryStringConfig;
                return this;
            }

            /**
             * <p>The header condition configuration.</p>
             */
            public Builder responseHeaderConfig(ResponseHeaderConfig responseHeaderConfig) {
                this.responseHeaderConfig = responseHeaderConfig;
                return this;
            }

            /**
             * <p>The response status code configuration.</p>
             */
            public Builder responseStatusCodeConfig(ResponseStatusCodeConfig responseStatusCodeConfig) {
                this.responseStatusCodeConfig = responseStatusCodeConfig;
                return this;
            }

            /**
             * <p>The source IP-based service traffic matching configuration. Required and valid only when <strong>Type</strong> is set to <strong>SourceIP</strong>.</p>
             */
            public Builder sourceIpConfig(SourceIpConfig sourceIpConfig) {
                this.sourceIpConfig = sourceIpConfig;
                return this;
            }

            /**
             * <p>The forwarding rule type. Valid values:</p>
             * <ul>
             * <li><p><strong>Host</strong>: Host.</p>
             * </li>
             * <li><p><strong>Path</strong>: Path.</p>
             * </li>
             * <li><p><strong>Header</strong>: HTTP header fields.</p>
             * </li>
             * <li><p><strong>QueryString</strong>: Query string.</p>
             * </li>
             * <li><p><strong>Method</strong>: Request method.</p>
             * </li>
             * <li><p><strong>Cookie</strong>: Cookie.</p>
             * </li>
             * <li><p><strong>SourceIp</strong>: Source IP address.</p>
             * </li>
             * <li><p><strong>ResponseHeader</strong>: Response HTTP header fields.</p>
             * </li>
             * <li><p><strong>ResponseStatusCode</strong>: Response status code.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Host</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RuleConditions build() {
                return new RuleConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. Can be up to 128 characters in length. Cannot start with <code>aliyun</code> or <code>acs:</code>. Cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. Can be up to 128 characters in length. Cannot start with <code>aliyun</code> or <code>acs:</code>. Cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
