// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("Priority")
    @Validation(required = true)
    private Integer priority;

    @Query
    @NameInMap("RuleActions")
    @Validation(required = true)
    private java.util.List < RuleActions> ruleActions;

    @Query
    @NameInMap("RuleConditions")
    @Validation(required = true)
    private java.util.List < RuleConditions> ruleConditions;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

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
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateRuleRequest, Builder> {
        private String clientToken; 
        private String direction; 
        private Boolean dryRun; 
        private String listenerId; 
        private Integer priority; 
        private java.util.List < RuleActions> ruleActions; 
        private java.util.List < RuleConditions> ruleConditions; 
        private String ruleName; 
        private java.util.List < Tag> tag; 

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
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The direction to which the forwarding rule is applied. Valid values:
         * <p>
         * 
         * *   **Request** (default): The forwarding rule is applied to the requests received by ALB.
         * *   **Response**: The forwarding rule is applied to the responses returned by backend servers.
         * 
         * > Basic ALB instances do not support the **Response** value.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The listener ID of the ALB instance.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The priority of the forwarding rule. Valid values: **1 to 10000**. A smaller value indicates a higher priority.
         * <p>
         * 
         * > The priorities of the forwarding rules created for the same listener must be unique.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The maximum cache time of dry run requests in the browser. Unit: seconds.
         * <p>
         * 
         * Valid values: **-1** to **172800**.
         */
        public Builder ruleActions(java.util.List < RuleActions> ruleActions) {
            this.putQueryParameter("RuleActions", ruleActions);
            this.ruleActions = ruleActions;
            return this;
        }

        /**
         * The configuration of the source IP-based forwarding rule.
         */
        public Builder ruleConditions(java.util.List < RuleConditions> ruleConditions) {
            this.putQueryParameter("RuleConditions", ruleConditions);
            this.ruleConditions = ruleConditions;
            return this;
        }

        /**
         * The name of the forwarding rule.
         * <p>
         * 
         * *   The name must be 2 to 128 characters in length.
         * *   It can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

    public static class CorsConfig extends TeaModel {
        @NameInMap("AllowCredentials")
        private String allowCredentials;

        @NameInMap("AllowHeaders")
        private java.util.List < String > allowHeaders;

        @NameInMap("AllowMethods")
        private java.util.List < String > allowMethods;

        @NameInMap("AllowOrigin")
        private java.util.List < String > allowOrigin;

        @NameInMap("ExposeHeaders")
        private java.util.List < String > exposeHeaders;

        @NameInMap("MaxAge")
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
        public java.util.List < String > getAllowHeaders() {
            return this.allowHeaders;
        }

        /**
         * @return allowMethods
         */
        public java.util.List < String > getAllowMethods() {
            return this.allowMethods;
        }

        /**
         * @return allowOrigin
         */
        public java.util.List < String > getAllowOrigin() {
            return this.allowOrigin;
        }

        /**
         * @return exposeHeaders
         */
        public java.util.List < String > getExposeHeaders() {
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
            private java.util.List < String > allowHeaders; 
            private java.util.List < String > allowMethods; 
            private java.util.List < String > allowOrigin; 
            private java.util.List < String > exposeHeaders; 
            private Long maxAge; 

            /**
             * Specifies whether credentials can be carried in CORS requests. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder allowCredentials(String allowCredentials) {
                this.allowCredentials = allowCredentials;
                return this;
            }

            /**
             * The allowed headers for CORS requests.
             */
            public Builder allowHeaders(java.util.List < String > allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * The allowed HTTP methods for CORS requests.
             */
            public Builder allowMethods(java.util.List < String > allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * The allowed origins of CORS requests.
             */
            public Builder allowOrigin(java.util.List < String > allowOrigin) {
                this.allowOrigin = allowOrigin;
                return this;
            }

            /**
             * The headers that can be exposed.
             */
            public Builder exposeHeaders(java.util.List < String > exposeHeaders) {
                this.exposeHeaders = exposeHeaders;
                return this;
            }

            /**
             * The maximum cache time of dry run requests in the browser. Unit: seconds.
             * <p>
             * 
             * Valid values: **-1** to **172800**.
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
    public static class FixedResponseConfig extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("HttpCode")
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

            /**
             * The content of the custom response. The content can be up to 1 KB in size and can contain only ASCII characters.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The format of the response.
             * <p>
             * 
             * Valid values: **text/plain**, **text/css**, **text/html**, **application/javascript**, and **application/json**.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * The HTTP status code in the response. Valid values: **HTTP\_2xx**, **HTTP\_4xx**, and **HTTP\_5xx**. **x** must be a digit.
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
    public static class ServerGroupStickySession extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Timeout")
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

            /**
             * Specifies whether to enable session persistence. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The timeout period of sessions. Unit: seconds. Valid values: **1** to **86400**. Default value: **1000**.
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
    public static class ServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        private String serverGroupId;

        @NameInMap("Weight")
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

            /**
             * The server group to which requests are distributed.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The weight of the server group. A larger value specifies a higher weight. A server group with a higher weight receives more requests. Valid values: **0** to **100**.
             * <p>
             * 
             * *   If only one destination server group exists and you do not specify a weight, the default value **100** is used.
             * *   If more than one destination server group exists, you must specify weights.
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
    public static class ForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupStickySession")
        private ServerGroupStickySession serverGroupStickySession;

        @NameInMap("ServerGroupTuples")
        private java.util.List < ServerGroupTuples> serverGroupTuples;

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
        public java.util.List < ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private ServerGroupStickySession serverGroupStickySession; 
            private java.util.List < ServerGroupTuples> serverGroupTuples; 

            /**
             * The configuration of session persistence for server groups.
             */
            public Builder serverGroupStickySession(ServerGroupStickySession serverGroupStickySession) {
                this.serverGroupStickySession = serverGroupStickySession;
                return this;
            }

            /**
             * The server groups to which requests are distributed. Each forwarding rule supports at most five server groups.
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
    public static class InsertHeaderConfig extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueType")
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

            /**
             * The key of the header. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The header key specified by **InsertHeaderConfig** must be unique.
             * <p>
             * 
             * > You cannot specify the following header keys (case-insensitive): `slb-id`, `slb-ip`, `x-forwarded-for`, `x-forwarded-proto`, `x-forwarded-eip`, `x-forwarded-port`, `x-forwarded-client-srcport`, `connection`, `upgrade`, `content-length`, `transfer-encoding`, `keep-alive`, `te`, `host`, `cookie`, `remoteip`, and `authority`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the header to be inserted.
             * <p>
             * 
             * *   If **ValueType** is set to **SystemDefined**, you can specify one of the following header values:
             * 
             *     *   **ClientSrcPort**: the client port.
             *     *   **ClientSrcIp**: the client IP address.
             *     *   **Protocol**: the request protocol (HTTP or HTTPS).
             *     *   **SLBId**: the ID of the ALB instance.
             *     *   **SLBPort**: the listening port.
             * 
             * *   If **ValueType** is set to **UserDefined**, you can specify a custom header value. The header value must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and lower than 127`. You can use asterisks (\*) and question marks (?) as wildcards. The value cannot start or end with a space character.
             * 
             * *   If **ValueType** is set to **ReferenceHeader**, you can reference one of the request headers. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, underscores (\_), and hyphens (-).
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The type of header. Valid values:
             * <p>
             * 
             * *   **UserDefined**: a custom header
             * *   **ReferenceHeader**: a header that references one of the request headers
             * *   **SystemDefined**: a header predefined by the system
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
    public static class RedirectConfig extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("HttpCode")
        private String httpCode;

        @NameInMap("Path")
        private String path;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Query")
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

            /**
             * The hostname to which requests are redirected. Valid values:
             * <p>
             * 
             * *   **${host}** (default): If you set the value to ${host}, you cannot append other characters.
             * 
             * *   A custom value. Make sure that the custom value meets the following requirements:
             * 
             *     *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \* = ~ \_ + \ ^ ! $ & | ( ) \[ ] ?.
             *     *   The hostname must contain at least one period (.) but cannot start or end with a period (.).
             *     *   The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost `domain label` can be an asterisk (\*).
             *     *   The domain labels cannot start or end with a hyphen (-).
             *     *   You can use asterisks (\*) and question marks (?) anywhere in a domain label as wildcard characters.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The redirect type. Valid values: **301**, **302**, **303**, **307**, and **308**.
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * The path to which requests are redirected. Valid values:
             * <p>
             * 
             * *   Default value: **${path}**. \*\*${host}**, **${protocol}**, and **${port}\*\* are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.
             * 
             * *   A custom value. You must make sure that the custom value meets the following requirements:
             * 
             *     *   The value must be 1 to 128 characters in length, and can contain asterisks (\*) and question marks (?) as wildcards. The value is case-sensitive.
             *     *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ] ^ , "`. You can use asterisks (\*) and question marks (?) as wildcard characters.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The port to which requests are redirected.
             * <p>
             * 
             * *   **${port}** (default): If you set the value to ${port}, you cannot add other characters to the value.
             * *   You can also enter a port number. Valid values: **1 to 63335**.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The redirect protocol. Valid values:
             * <p>
             * 
             * *   **${protocol}** (default): If you set the value to ${protocol}, you cannot add other characters to the value.
             * *   **HTTP** or **HTTPS**.
             * 
             * > HTTPS listeners support only HTTPS to HTTPS redirects.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The query string of the URL to which requests are redirected.
             * <p>
             * 
             * *   Default value: **${query}**. \*\*${host}**, **${protocol}**, and **${port}\*\* are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.
             * 
             * *   A custom value. You must make sure that the custom value meets the following requirements:
             * 
             *     *   The value must be 1 to 128 characters in length.
             *     *   It can contain printable characters, except space characters, the special characters `# [ ] { } \ | < > &`, and uppercase letters.
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
    public static class RewriteConfig extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Path")
        private String path;

        @NameInMap("Query")
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

            /**
             * The hostname to which requests are redirected. Valid values:
             * <p>
             * 
             * *   **${host}** (default): If you set the value to ${host}, you cannot append other characters.
             * 
             * *   If you want to specify a custom value, make sure that the following requirements are met:
             * 
             *     *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, and the following special characters: - . \* = ~ \_ + \ ^ ! $ & | ( ) \[ ] ?.
             *     *   The hostname must contain at least one period (.) but cannot start or end with a period (.).
             *     *   The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-). The leftmost `domain label` can be an asterisk (\*).
             *     *   The domain labels cannot start or end with a hyphen (-). You can use asterisks (\*) and question marks (?) anywhere in a domain label as wildcard characters.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The path to which requests are redirected. Valid values:
             * <p>
             * 
             * *   Default value: **${path}**. \*\*${host}**, **${protocol}**, and **${port}\*\* are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.
             * 
             * *   A custom value. You must make sure that the custom value meets the following requirements:
             * 
             *     *   The value must be 1 to 128 characters in length, and can contain asterisks (\*) and question marks (?) as wildcards. The value is case-sensitive.
             *     *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ] ^ , "`. You can use asterisks (\*) and question marks (?) as wildcard characters.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The query string of the URL to which requests are redirected.
             * <p>
             * 
             * *   Default value: **${query}**. \*\*${host}**, **${protocol}**, and **${port}\*\* are also supported. Each variable can be specified only once. You can specify one or more of the preceding variables in each request. You can also combine them with a custom value.
             * 
             * *   A custom value. You must make sure that the custom value meets the following requirements:
             * 
             *     *   The value must be 1 to 128 characters in length.
             *     *   It can contain printable characters, except space characters, the special characters `# [ ] { } \ | < > &`, and uppercase letters.
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
    public static class TrafficLimitConfig extends TeaModel {
        @NameInMap("PerIpQps")
        private Integer perIpQps;

        @NameInMap("QPS")
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

            /**
             * The QPS of each IP address. Valid values: **1 to 100000**.
             * <p>
             * 
             * > If both the **QPS** and **PerIpQps** properties are specified, make sure that the value of the **QPS** property is smaller than the value of the PerIpQps property.
             */
            public Builder perIpQps(Integer perIpQps) {
                this.perIpQps = perIpQps;
                return this;
            }

            /**
             * The queries per second (QPS). Valid values: **1 to 100000**.
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
    public static class MirrorGroupConfigServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
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

            /**
             * The ID of the server group.
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
    public static class MirrorGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        private java.util.List < MirrorGroupConfigServerGroupTuples> serverGroupTuples;

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
        public java.util.List < MirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List < MirrorGroupConfigServerGroupTuples> serverGroupTuples; 

            /**
             * The configuration of the server group to which traffic is mirrored.
             */
            public Builder serverGroupTuples(java.util.List < MirrorGroupConfigServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public MirrorGroupConfig build() {
                return new MirrorGroupConfig(this);
            } 

        } 

    }
    public static class TrafficMirrorConfig extends TeaModel {
        @NameInMap("MirrorGroupConfig")
        private MirrorGroupConfig mirrorGroupConfig;

        @NameInMap("TargetType")
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

            /**
             * The configuration of the server group to which traffic is mirrored.
             */
            public Builder mirrorGroupConfig(MirrorGroupConfig mirrorGroupConfig) {
                this.mirrorGroupConfig = mirrorGroupConfig;
                return this;
            }

            /**
             * The type of destination to which network traffic is mirrored. Valid values:
             * <p>
             * 
             * *   **ForwardGroupMirror**: a server group
             * *   **SlsMirror**: Log Service
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
    public static class RuleActions extends TeaModel {
        @NameInMap("CorsConfig")
        private CorsConfig corsConfig;

        @NameInMap("FixedResponseConfig")
        private FixedResponseConfig fixedResponseConfig;

        @NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @NameInMap("InsertHeaderConfig")
        private InsertHeaderConfig insertHeaderConfig;

        @NameInMap("Order")
        @Validation(required = true)
        private Integer order;

        @NameInMap("RedirectConfig")
        private RedirectConfig redirectConfig;

        @NameInMap("RewriteConfig")
        private RewriteConfig rewriteConfig;

        @NameInMap("TrafficLimitConfig")
        private TrafficLimitConfig trafficLimitConfig;

        @NameInMap("TrafficMirrorConfig")
        private TrafficMirrorConfig trafficMirrorConfig;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private RuleActions(Builder builder) {
            this.corsConfig = builder.corsConfig;
            this.fixedResponseConfig = builder.fixedResponseConfig;
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.insertHeaderConfig = builder.insertHeaderConfig;
            this.order = builder.order;
            this.redirectConfig = builder.redirectConfig;
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
            private RewriteConfig rewriteConfig; 
            private TrafficLimitConfig trafficLimitConfig; 
            private TrafficMirrorConfig trafficMirrorConfig; 
            private String type; 

            /**
             * The origins allowed.
             */
            public Builder corsConfig(CorsConfig corsConfig) {
                this.corsConfig = corsConfig;
                return this;
            }

            /**
             * The configuration of the custom response.
             */
            public Builder fixedResponseConfig(FixedResponseConfig fixedResponseConfig) {
                this.fixedResponseConfig = fixedResponseConfig;
                return this;
            }

            /**
             * The server groups to which requests are distributed. Each forwarding rule supports at most five server groups.
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * The configuration of the header to be inserted.
             */
            public Builder insertHeaderConfig(InsertHeaderConfig insertHeaderConfig) {
                this.insertHeaderConfig = insertHeaderConfig;
                return this;
            }

            /**
             * The priority of the action. Valid values: **1 to 50000**. A smaller value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter is required. The priority of each action within a forwarding rule must be unique.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The redirect configuration.
             * <p>
             * 
             * > When you configure the **RedirectConfig** action, you can use the default value only for the **httpCode** parameter. Do not use the default values for the other parameters.
             */
            public Builder redirectConfig(RedirectConfig redirectConfig) {
                this.redirectConfig = redirectConfig;
                return this;
            }

            /**
             * The rewrite configuration.
             * <p>
             * 
             * > If multiple actions are configured within a forwarding rule, you must set **RewriteConfig** to the value of **ForwardGroup**.
             */
            public Builder rewriteConfig(RewriteConfig rewriteConfig) {
                this.rewriteConfig = rewriteConfig;
                return this;
            }

            /**
             * The action to throttle traffic.
             */
            public Builder trafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
                this.trafficLimitConfig = trafficLimitConfig;
                return this;
            }

            /**
             * The action to mirror traffic.
             */
            public Builder trafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
                this.trafficMirrorConfig = trafficMirrorConfig;
                return this;
            }

            /**
             * The action type. Valid values:
             * <p>
             * 
             * *   **ForwardGroup**: forwards a request to multiple vServer groups.
             * *   **Redirect**: redirects a request.
             * *   **FixedResponse**: returns a custom response.
             * *   **Rewrite**: rewrites a request.
             * *   **InsertHeader**: inserts a header.
             * *   **RemoveHeaderConfig**: deletes a header.
             * *   **TrafficLimitConfig**: throttles network traffic.
             * *   **TrafficMirrorConfig**: mirrors traffic.
             * *   **CorsConfig**: forwards requests based on CORS.
             * 
             * The following action types are supported:
             * 
             * *   **FinalType**: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify the **ForwardGroup**, **Redirect**, or **FixedResponse** action as the FinalType action.
             * *   **ExtType**: the action or the actions to be performed before the **FinalType** action. A forwarding rule can contain one or more **ExtType** actions. To specify this parameter, you must also specify **FinalType**. You can specify multiple **InsertHeader** actions or one **Rewrite** action.
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
    public static class Values extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The key of the cookie.
             * <p>
             * 
             * *   The key must be 1 to 100 characters in length.
             * *   You can use asterisks (\*) and question marks (?) as wildcard characters.
             * *   The key can contain printable characters, except uppercase letters, space characters, and the following special characters: `; # [ ] { } \ | < > &`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the cookie.
             * <p>
             * 
             * *   The value must be 1 to 100 characters in length.
             * *   You can use asterisks (\*) and question marks (?) as wildcard characters.
             * *   The value can contain printable characters, except uppercase letters, space characters, and the following special characters: `; # [ ] { } \ | < > &`.
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
    public static class CookieConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < Values> values;

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
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < Values> values; 

            /**
             * The cookie values.
             */
            public Builder values(java.util.List < Values> values) {
                this.values = values;
                return this;
            }

            public CookieConfig build() {
                return new CookieConfig(this);
            } 

        } 

    }
    public static class HeaderConfig extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > values; 

            /**
             * The key of the header.
             * <p>
             * 
             * *   The key must be 1 to 40 characters in length.
             * *   It can contain lowercase letters, digits, hyphens (-), and underscores (\_).
             * *   Cookie and Host are not supported.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the header.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public HeaderConfig build() {
                return new HeaderConfig(this);
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
             * The hostname.
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
    public static class MethodConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * The request methods.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public MethodConfig build() {
                return new MethodConfig(this);
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
             * The path.
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
    public static class QueryStringConfigValues extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The key of the query string.
             * <p>
             * 
             * *   The key must be 1 to 100 characters in length.
             * *   You can use asterisks (\*) and question marks (?) as wildcards. The key can contain printable characters, except uppercase letters, space characters, and the following special characters: `# [ ] { } \ | < > &`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the query string.
             * <p>
             * 
             * *   The value must be 1 to 128 characters in length.
             * *   It can contain printable characters, except uppercase letters, space characters, and the following special characters: `# [ ] { } \ | < > &`. You can use asterisks (\*) and question marks (?) as wildcard characters.
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
    public static class QueryStringConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < QueryStringConfigValues> values;

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
        public java.util.List < QueryStringConfigValues> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < QueryStringConfigValues> values; 

            /**
             * The query strings.
             */
            public Builder values(java.util.List < QueryStringConfigValues> values) {
                this.values = values;
                return this;
            }

            public QueryStringConfig build() {
                return new QueryStringConfig(this);
            } 

        } 

    }
    public static class SourceIpConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * The configuration of the source IP-based forwarding rule.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public SourceIpConfig build() {
                return new SourceIpConfig(this);
            } 

        } 

    }
    public static class RuleConditions extends TeaModel {
        @NameInMap("CookieConfig")
        private CookieConfig cookieConfig;

        @NameInMap("HeaderConfig")
        private HeaderConfig headerConfig;

        @NameInMap("HostConfig")
        private HostConfig hostConfig;

        @NameInMap("MethodConfig")
        private MethodConfig methodConfig;

        @NameInMap("PathConfig")
        private PathConfig pathConfig;

        @NameInMap("QueryStringConfig")
        private QueryStringConfig queryStringConfig;

        @NameInMap("SourceIpConfig")
        private SourceIpConfig sourceIpConfig;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private RuleConditions(Builder builder) {
            this.cookieConfig = builder.cookieConfig;
            this.headerConfig = builder.headerConfig;
            this.hostConfig = builder.hostConfig;
            this.methodConfig = builder.methodConfig;
            this.pathConfig = builder.pathConfig;
            this.queryStringConfig = builder.queryStringConfig;
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
            private SourceIpConfig sourceIpConfig; 
            private String type; 

            /**
             * The configurations of the cookies.
             */
            public Builder cookieConfig(CookieConfig cookieConfig) {
                this.cookieConfig = cookieConfig;
                return this;
            }

            /**
             * The configuration of the header.
             */
            public Builder headerConfig(HeaderConfig headerConfig) {
                this.headerConfig = headerConfig;
                return this;
            }

            /**
             * The configurations of the host.
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * The configurations of the request methods.
             */
            public Builder methodConfig(MethodConfig methodConfig) {
                this.methodConfig = methodConfig;
                return this;
            }

            /**
             * The configurations of the URLs.
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * The configurations of the query strings.
             */
            public Builder queryStringConfig(QueryStringConfig queryStringConfig) {
                this.queryStringConfig = queryStringConfig;
                return this;
            }

            /**
             * The configuration of the source IP-based forwarding rule. This parameter is required and takes effect only when **Type** is set to **SourceIP**.
             */
            public Builder sourceIpConfig(SourceIpConfig sourceIpConfig) {
                this.sourceIpConfig = sourceIpConfig;
                return this;
            }

            /**
             * The type of forwarding rule. Valid values:
             * <p>
             * 
             * *   **Host**: Requests are distributed based on hosts.
             * *   **Path**: Requests are distributed based on paths.
             * *   **Header**: Requests are distributed based on HTTP headers.
             * *   **QueryString**: Requests are distributed based on query strings.
             * *   **Method**: Requests are distributed based on request methods.
             * *   **Cookie**: Requests are distributed based on cookies.
             * *   **SourceIp**: Requests are distributed based on source IP addresses.
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
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The key of the query string.
             * <p>
             * 
             * *   The key must be 1 to 100 characters in length.
             * *   You can use asterisks (\*) and question marks (?) as wildcards. The key can contain printable characters, except uppercase letters, space characters, and the following special characters: `# [ ] { } \ | < > &`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the query string.
             * <p>
             * 
             * *   The value must be 1 to 128 characters in length.
             * *   It can contain printable characters, except uppercase letters, space characters, and the following special characters: `# [ ] { } \ | < > &`. You can use asterisks (\*) and question marks (?) as wildcard characters.
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
