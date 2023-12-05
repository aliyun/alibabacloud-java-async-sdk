// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRulesResponseBody</p>
 */
public class ListRulesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rules")
    private java.util.List < Rules> rules;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRulesResponseBody create() {
        return builder().build();
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
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Rules> rules; 
        private Integer totalCount; 

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The forwarding rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRulesResponseBody build() {
            return new ListRulesResponseBody(this);
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
             * Indicates whether credentials can be carried in CORS requests. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
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
             * The content of the custom response. The content is up to 1 KB in size, and can contain only ASCII characters.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The content type.
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
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Timeout.
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
             * The server group to which requests are forwarded.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The weight. Valid values: **0** to **100**.
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
             * ServerGroupStickySession.
             */
            public Builder serverGroupStickySession(ServerGroupStickySession serverGroupStickySession) {
                this.serverGroupStickySession = serverGroupStickySession;
                return this;
            }

            /**
             * The server groups to which requests are forwarded.
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
             * The key of the header. The key must be 1 to 40 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The key specified in `InsertHeader` must be unique.
             * <p>
             * 
             * > **Cookie** and **Host** are not supported.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the header.
             * <p>
             * 
             * *   If **ValueType** is set to **SystemDefined**, one of the following values is supported:
             * 
             *     *   **ClientSrcPort**: the client port.
             *     *   **ClientSrcIp**: the client IP address.
             *     *   **Protocol**: the request protocol (HTTP or HTTPS).
             *     *   **SLBId**: the ID of the ALB instance.
             *     *   **SLBPort**: the listener port.
             * 
             * *   If **ValueType** is set to **UserDefined**, a custom header value is supported. The header value must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and lower than 127`. You can use asterisks (\*) and question marks (?) as wildcard characters. The header value cannot start or end with a space character.
             * 
             * *   If **ValueType** is set to **ReferenceHeader**, one of the request headers is referenced. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, underscores (\_), and hyphens (-).
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The type of the header. Valid values:
             * <p>
             * 
             * *   **UserDefined**: a user-defined header.
             * *   **ReferenceHeader**: a header that is referenced from a request header.
             * *   **SystemDefined**: a system-defined header.
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
             * *   **${host}** (default): If ${host} is returned, no other character is appended.
             * 
             * *   Limits on a custom value:
             * 
             *     *   The hostname is 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). Asterisks (\*) and question marks (?) can be used as wildcard characters.
             *     *   The hostname contains at least one period (.) but does not start or end with a period (.).
             *     *   The rightmost domain label contains only letters and wildcard characters. It does not contain digits or hyphens (-).
             *     *   The domain labels do not start or end with hyphens (-).
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
             * *   **${path}** (default): You can reference \*\*${host}**, **${protocol}**, and**${port}**. The path can consist of **${host}**,**${protocol}**, and **${port}\*\*. Each variable can be used only once. The preceding variables can be used at the same time or combined with a custom value.
             * 
             * *   Limits on a custom value:
             * 
             *     *   The value is 1 to 128 characters in length.
             *     *   It starts with a forward slash (/) and contains letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It does not contain the following special characters: `" % # ; ! ( ) [ ] ^ , "`. You can use asterisks (\*) and question marks (?) as wildcard characters.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The port to which requests are redirected. Valid values:
             * <p>
             * 
             * *   **${port}** (default): If ${port} is returned, no other character is appended.
             * *   Other valid values: **1 to 63335**.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The redirect protocol. Valid values:
             * <p>
             * 
             * *   **${protocol}** (default): If ${protocol} is returned, no other character is appended.
             * *   **HTTP** or **HTTPS**.
             * 
             * > HTTPS listeners support only HTTP to HTTPS redirection.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The query string to which requests are redirected. The query string must be 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: `# [ ] { } \ | < > &`.
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
    public static class RemoveHeaderConfig extends TeaModel {
        @NameInMap("Key")
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

            /**
             * The key of the header to be removed. The key must be 1 to 40 characters in length and can contain letters, digits, underscores, and hyphens (-). The header key must be unique.
             * <p>
             * 
             * *   You cannot specify the following header keys for an inbound forwarding rule: `slb-id`, `slb-ip`, `x-forwarded-for`, `x-forwarded-proto`, `x-forwarded-eip`, `x-forwarded-port`, `x-forwarded-client-srcport`, `connection`, `upgrade`, `content-length`, `transfer-encoding`, `keep-alive`, `te`, `host`, `cookie`, `remoteip`, and `authority`. The preceding keys are case-insensitive.
             * *   You cannot specify the following header keys for an outbound forwarding rule: `connection`, `upgrade`, `content-length`, and `transfer-encoding`. The preceding keys are case-insensitive.
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
             * The hostname to which requests are forwarded. Valid values:
             * <p>
             * 
             * *   **${host}** (default): If ${host} is returned, no other character is appended.
             * 
             * *   Limits on a custom value:
             * 
             *     *   The hostname is 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). Asterisks (\*) and question marks (?) can be used as wildcard characters.
             *     *   The hostname contains at least one period (.) but does not start or end with a period (.).
             *     *   The rightmost domain label contains only letters and wildcard characters. It does not contain digits or hyphens (-).
             *     *   The domain labels do not start or end with hyphens (-).
             *     *   You can use asterisks (\*) and question marks (?) anywhere in a domain label as wildcard characters.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The path to which requests are forwarded. The path is 1 to 128 characters in length and starts with a forward slash (/). The path can contain letters, digits, asterisks (\*), question marks (?), and the following special characters: `$ - _ . + / & ~ @ :`. The path does not contain the following special characters: `" % # ; ! ( ) [ ] ^ , "`.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The query string of the URL to which requests are forwarded. The query string is 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: `# [ ] { } \ | < > &`.
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
             * > If you specify this parameter and **QPS**, the value of **PerIpQps** must be smaller than the value of **QPS**.
             */
            public Builder perIpQps(Integer perIpQps) {
                this.perIpQps = perIpQps;
                return this;
            }

            /**
             * The number of queries per second (QPS). Valid values: **1** to **100000**.
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

        @NameInMap("Weight")
        private Integer weight;

        private MirrorGroupConfigServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
            this.weight = builder.weight;
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
             * The server group ID.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The weight. Valid values: **0** to **100**.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
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
             * The server group to which traffic is mirrored.
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
             * TargetType.
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
        private Integer order;

        @NameInMap("RedirectConfig")
        private RedirectConfig redirectConfig;

        @NameInMap("RemoveHeaderConfig")
        private RemoveHeaderConfig removeHeaderConfig;

        @NameInMap("RewriteConfig")
        private RewriteConfig rewriteConfig;

        @NameInMap("TrafficLimitConfig")
        private TrafficLimitConfig trafficLimitConfig;

        @NameInMap("TrafficMirrorConfig")
        private TrafficMirrorConfig trafficMirrorConfig;

        @NameInMap("Type")
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

            /**
             * The CORS configuration.
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
             * The configurations of the server groups.
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
             * The priority of the action. Valid values: **1 to 50000**. A smaller value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter is not empty. The priority of each action within a forwarding rule is unique.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The configuration of the redirect action.
             */
            public Builder redirectConfig(RedirectConfig redirectConfig) {
                this.redirectConfig = redirectConfig;
                return this;
            }

            /**
             * The configuration of the header to be removed.
             */
            public Builder removeHeaderConfig(RemoveHeaderConfig removeHeaderConfig) {
                this.removeHeaderConfig = removeHeaderConfig;
                return this;
            }

            /**
             * The configuration of the rewrite action.
             */
            public Builder rewriteConfig(RewriteConfig rewriteConfig) {
                this.rewriteConfig = rewriteConfig;
                return this;
            }

            /**
             * The configuration of the action to throttle traffic.
             */
            public Builder trafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
                this.trafficLimitConfig = trafficLimitConfig;
                return this;
            }

            /**
             * The configuration of the action to mirror traffic.
             */
            public Builder trafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
                this.trafficMirrorConfig = trafficMirrorConfig;
                return this;
            }

            /**
             * The action. Valid values:
             * <p>
             * 
             * *   **ForwardGroup**: distributes requests to multiple vServer groups.
             * *   **Redirect**: redirects a request.
             * *   **FixedResponse**: returns a custom response.
             * *   **Rewrite**: rewrites a request.
             * *   **InsertHeader**: inserts a header.
             * *   **RemoveHeaderConfig**: deletes a header.
             * *   **TrafficLimitConfig**: throttles network traffic.
             * *   **TrafficMirrorConfig**: mirrors traffic.
             * *   **CorsConfig**: forwards requests based on CORS.
             * 
             * The preceding actions can be classified into two broad types:
             * 
             * *   **FinalType**: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify a **ForwardGroup**, **Redirect**, or **FixedResponse** action as the FinalType action.
             * *   **ExtType**: one or more actions to be performed before the **FinalType** action. A forwarding rule can contain one or more **ExtType** actions. To specify an ExtType action, you must specify a **FinalType** action. You can specify multiple **InsertHeader** actions or one **Rewrite** action.
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
             * The key of the cookie. The key is 1 to 100 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). The key cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \ | < > &`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the cookie. The value is 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). Uppercase letters, space characters, and the following special characters are not supported: `# [ ] { } \ | < > &`.
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
             * The key-value pair of the cookie.
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
             * The key of the header. The key must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (\_). Cookie and Host are not supported.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The values of the header.
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
             * The hostnames.
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
             * The paths.
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
             * They key of the query string. The key must be 1 to 100 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). The key cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \ | < > &`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the query string. The value must be 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). However, uppercase letters, space characters, and the following special characters are not supported: `# [ ] { } \ | < > &`.
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
             * The query string.
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
    public static class ResponseHeaderConfig extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > values; 

            /**
             * The header key. The key must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (\_). Cookie and Host are not supported.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The header values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public ResponseHeaderConfig build() {
                return new ResponseHeaderConfig(this);
            } 

        } 

    }
    public static class ResponseStatusCodeConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * The response status codes.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public ResponseStatusCodeConfig build() {
                return new ResponseStatusCodeConfig(this);
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
             * The source IP addresses.
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

        @NameInMap("ResponseHeaderConfig")
        private ResponseHeaderConfig responseHeaderConfig;

        @NameInMap("ResponseStatusCodeConfig")
        private ResponseStatusCodeConfig responseStatusCodeConfig;

        @NameInMap("SourceIpConfig")
        private SourceIpConfig sourceIpConfig;

        @NameInMap("Type")
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

            /**
             * The configuration of the cookie.
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
             * The configurations of the hosts.
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
             * The configurations of the paths.
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
             * The configuration of the HTTP response header.
             */
            public Builder responseHeaderConfig(ResponseHeaderConfig responseHeaderConfig) {
                this.responseHeaderConfig = responseHeaderConfig;
                return this;
            }

            /**
             * The configurations of the response status codes.
             */
            public Builder responseStatusCodeConfig(ResponseStatusCodeConfig responseStatusCodeConfig) {
                this.responseStatusCodeConfig = responseStatusCodeConfig;
                return this;
            }

            /**
             * The configuration of the source IP addresses based on which user traffic is matched.
             */
            public Builder sourceIpConfig(SourceIpConfig sourceIpConfig) {
                this.sourceIpConfig = sourceIpConfig;
                return this;
            }

            /**
             * The type of forwarding rule. Valid values:
             * <p>
             * 
             * *   **Host**: Requests are forwarded based on hosts.
             * *   **Path**: Requests are forwarded based on paths.
             * *   **Header**: Requests are forwarded based on HTTP headers.
             * *   **QueryString**: Requests are forwarded based on query strings.
             * *   **Method**: Requests are forwarded based on request methods.
             * *   **Cookie**: Requests are forwarded based on cookies.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The header key. The key must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (\_). Cookie and Host are not supported.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the query string. The value must be 1 to 128 characters in length, and can contain printable characters such as lowercase letters, asterisks (\*), and question marks (?). However, uppercase letters, space characters, and the following special characters are not supported: `# [ ] { } \ | < > &`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Direction")
        private String direction;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RuleActions")
        private java.util.List < RuleActions> ruleActions;

        @NameInMap("RuleConditions")
        private java.util.List < RuleConditions> ruleConditions;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleStatus")
        private String ruleStatus;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Rules(Builder builder) {
            this.direction = builder.direction;
            this.listenerId = builder.listenerId;
            this.loadBalancerId = builder.loadBalancerId;
            this.priority = builder.priority;
            this.ruleActions = builder.ruleActions;
            this.ruleConditions = builder.ruleConditions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
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
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String direction; 
            private String listenerId; 
            private String loadBalancerId; 
            private Integer priority; 
            private java.util.List < RuleActions> ruleActions; 
            private java.util.List < RuleConditions> ruleConditions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private java.util.List < Tags> tags; 

            /**
             * The direction to which the forwarding rule is applied. Valid values:
             * <p>
             * 
             * *   Request (default): The rule applies to client requests.
             * *   Response: The rule applies to responses from backend servers.
             * 
             * > Response is not supported by basic ALB instances.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * The ID of the listener to which the forwarding rule belongs.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The ID of the ALB instance to which the forwarding rule belongs.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The priority of the forwarding rule. Valid values: **1 to 10000**. A smaller value indicates a higher priority.
             * <p>
             * 
             * > The priority of each forwarding rule added to a listener must be unique.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The action of the forwarding rule.
             */
            public Builder ruleActions(java.util.List < RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * The conditions of the forwarding rule.
             */
            public Builder ruleConditions(java.util.List < RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * The forwarding rule ID.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the forwarding rule. Valid values:
             * <p>
             * 
             * *   **Provisioning**
             * *   **Configuring**
             * *   **Available**
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
