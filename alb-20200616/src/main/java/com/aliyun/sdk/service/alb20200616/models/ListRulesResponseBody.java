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
 * {@link ListRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRulesResponseBody</p>
 */
public class ListRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
     * @return rules
     */
    public java.util.List<Rules> getRules() {
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
        private java.util.List<Rules> rules; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRulesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of records returned for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Indicates whether a next query exists. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
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
         * <p>CEF72CEB-54B6-4AE8-B225-F876F******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of forwarding rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of data records returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRulesResponseBody build() {
            return new ListRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>Specifies whether credentials are allowed. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: Credentials are allowed.</li>
             * <li><strong>off</strong>: Credentials are not allowed.</li>
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
             * <p>The allowed cross-origin headers.</p>
             */
            public Builder allowHeaders(java.util.List<String> allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * <p>The HTTP methods allowed for cross-origin access.</p>
             */
            public Builder allowMethods(java.util.List<String> allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * <p>The allowed origins.</p>
             */
            public Builder allowOrigin(java.util.List<String> allowOrigin) {
                this.allowOrigin = allowOrigin;
                return this;
            }

            /**
             * <p>The headers that can be exposed.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The fixed content to return. The content can be up to 1 KB in size and can contain only ASCII characters.</p>
             * 
             * <strong>example:</strong>
             * <p>dssacav</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The format of the fixed content to return.</p>
             * <p>Valid values: <strong>text/plain</strong>, <strong>text/css</strong>, <strong>text/html</strong>, <strong>application/javascript</strong>, and <strong>application/json</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>text/plain</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The HTTP response code to return. Only numeric strings in the format of <strong>HTTP_2xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong> are supported, where <strong>x</strong> is any digit.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP_2xx</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>Specifies whether to enable session persistence across server groups when multiple server groups are specified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The timeout period for session persistence when Enabled is set to true. Unit: seconds. Valid values: 1 to 86400.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The ID of the destination server group to which requests are forwarded.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-atstuj3rtoptyui****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The weight. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The list of destination server groups to which requests are forwarded.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The name of the header field to insert. The name must be 1 to 40 characters in length and can contain lowercase and uppercase letters a to z, digits, underscores (_), and hyphens (-). The header field name cannot be used more than once in <code>InsertHeader</code>.</p>
             * <blockquote>
             * <p>You cannot use <strong>Cookie</strong> or <strong>Host</strong> as the header field name.</p>
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
             * <p>The content of the header field to insert.</p>
             * <ul>
             * <li>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, the following values are supported:<ul>
             * <li><strong>ClientSrcPort</strong>: the client port.</li>
             * <li><strong>ClientSrcIp</strong>: the client IP address.</li>
             * <li><strong>Protocol</strong>: the protocol used by the client request (HTTP or HTTPS).</li>
             * <li><strong>SLBId</strong>: the load balancing instance ID.</li>
             * <li><strong>SLBPort</strong>: the load balancing instance listener port.</li>
             * </ul>
             * </li>
             * <li>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>: you can specify a custom header field content. The content must be 1 to 128 characters in length and can contain wildcards such as asterisks (*) and question marks (?), as well as printable characters with ASCII values in the range of <code>ch &gt;= 32 &amp;&amp; ch &lt; 127</code>. The content cannot start or end with a space.</li>
             * <li>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>: you can reference a field from the request header. The value must be 1 to 128 characters in length and can contain lowercase letters a to z, digits, hyphens (-), and underscores (_).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ClientSrcPort</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The content type of the header field. Valid values:</p>
             * <ul>
             * <li><p><strong>UserDefined</strong>: user-defined.</p>
             * </li>
             * <li><p><strong>ReferenceHeader</strong>: references a field from the client request header.</p>
             * </li>
             * <li><p><strong>SystemDefined</strong>: system-defined.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SystemDefined</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The host address to redirect to. Valid values:</p>
             * <ul>
             * <li><strong>${host}</strong> (default): this value cannot be concatenated with other characters.</li>
             * <li>Other values. The character set and format restrictions are as follows:<ul>
             * <li>The hostname must be 3 to 128 characters in length and can contain lowercase letters a to z, digits, hyphens (-), periods (.), asterisks (*), and question marks (?).</li>
             * <li>The hostname must contain at least one period (.) and cannot start or end with a period (.).</li>
             * <li>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-).</li>
             * <li>Hyphens (-) cannot appear at the beginning or end of other domain labels.</li>
             * <li>Asterisks (*) and question marks (?) can appear at any position within a domain label.</li>
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
             * <p>The redirect type. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>301</p>
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * <p>The path to redirect to. Valid values:</p>
             * <ul>
             * <li><strong>${path}</strong> (default): you can reference <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>, which consist of <strong>${host}</strong>, <strong>${protocol}</strong>, and <strong>${port}</strong>. Each variable can appear at most once. These variables can be used together or concatenated with strings from the following valid character set.</li>
             * <li>Other values. The character set and format restrictions are as follows:<ul>
             * <li>The path must be 1 to 128 characters in length.</li>
             * <li>The path must start with a forward slash (/) and can contain letters, digits, and the special characters <code>$-_.+/&amp;~@:</code>. The characters <code>&quot;%#;!()[]^,&quot; </code> are not supported. Asterisks (*) and question marks (?) are supported as wildcards.</li>
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
             * <p>The port to redirect to. Valid values:</p>
             * <ul>
             * <li><strong>${port}</strong> (default): this value cannot be used with other characters.</li>
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
             * <p>The protocol to redirect to. Valid values:</p>
             * <ul>
             * <li><strong>${protocol}</strong> (default): this value cannot be concatenated with other characters.</li>
             * <li><strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
             * </ul>
             * <blockquote>
             * <p>HTTPS listeners support only redirects to HTTPS.</p>
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
             * <p>The query string to redirect to. The query string must be 1 to 128 characters in length and can contain lowercase letters and visible characters. The characters <code>#[]{}\|&lt;&gt;&amp;</code> are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>quert</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The name of the header field to remove. The name must be 1 to 40 characters in length and can contain lowercase and uppercase letters a to z, digits, underscores (_), and hyphens (-). The header field name cannot be used more than once in RemoveHeader.</p>
             * <ul>
             * <li>Request direction (Direction is set to Request): the header name cannot be set to the following fields (case-insensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, <code>authority</code>.</li>
             * <li>Response direction (Direction is set to Response): the header name cannot be set to the following fields (case-insensitive): <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>key</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The host address to redirect to. Valid values:</p>
             * <ul>
             * <li><strong>${host}</strong> (default): this value cannot be concatenated with other characters.</li>
             * <li>Other values. The character set and format restrictions are as follows:<ul>
             * <li>The hostname must be 3 to 128 characters in length and can contain lowercase letters a to z, digits, hyphens (-), periods (.), asterisks (*), and question marks (?).</li>
             * <li>The hostname must contain at least one period (.) and cannot start or end with a period (.).</li>
             * <li>The rightmost domain label can contain only letters and wildcards, and cannot contain digits or hyphens (-).</li>
             * <li>Hyphens (-) cannot appear at the beginning or end of other domain labels.</li>
             * <li>Asterisks (*) and question marks (?) can appear at any position within a domain label.</li>
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
             * <p>The destination path for the internal redirect. The path must be 1 to 128 characters in length, start with a forward slash (/), and can contain letters, digits, asterisks (*), question marks (?), and <code>$-_.+/&amp;~@:</code>. The characters <code>&quot;%#;!()[]^,&quot; </code> are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>/tsdf</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The query string for the internal redirect. The query string must be 1 to 128 characters in length and can contain lowercase letters and visible characters. The characters <code>#[]{}\|&lt;&gt;&amp;</code> are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>quedsa</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The QPS for each IP address. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
             * <blockquote>
             * <p>If you configure both the <strong>QPS</strong> and <strong>PerIpQps</strong> parameters, the value of <strong>PerIpQps</strong> must be smaller than the value of <strong>QPS</strong>.</p>
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
             * <p>The queries per second (QPS). Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
     */
    public static class MirrorGroupConfigServerGroupTuples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("Weight")
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

            private Builder() {
            } 

            private Builder(MirrorGroupConfigServerGroupTuples model) {
                this.serverGroupId = model.serverGroupId;
                this.weight = model.weight;
            } 

            /**
             * <p>The server group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-00mkgijak0w4qgz9****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The weight. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The destination of traffic mirroring, which can be a server group.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The fixed response configuration.</p>
             */
            public Builder fixedResponseConfig(FixedResponseConfig fixedResponseConfig) {
                this.fixedResponseConfig = fixedResponseConfig;
                return this;
            }

            /**
             * <p>The forward group configuration.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The insert header field configuration.</p>
             */
            public Builder insertHeaderConfig(InsertHeaderConfig insertHeaderConfig) {
                this.insertHeaderConfig = insertHeaderConfig;
                return this;
            }

            /**
             * <p>The order in which the forwarding rule action is executed. Valid values: <strong>1</strong> to <strong>50000</strong>. Actions are executed in ascending order of value. The value cannot be empty or duplicated.</p>
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
             */
            public Builder redirectConfig(RedirectConfig redirectConfig) {
                this.redirectConfig = redirectConfig;
                return this;
            }

            /**
             * <p>The remove HTTP header configuration.</p>
             */
            public Builder removeHeaderConfig(RemoveHeaderConfig removeHeaderConfig) {
                this.removeHeaderConfig = removeHeaderConfig;
                return this;
            }

            /**
             * <p>The rewrite configuration.</p>
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
             * <p>The traffic mirror configuration.</p>
             */
            public Builder trafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
                this.trafficMirrorConfig = trafficMirrorConfig;
                return this;
            }

            /**
             * <p>The action type. Valid values:</p>
             * <ul>
             * <li><p><strong>ForwardGroup</strong>: forwards requests to multiple virtual server groups.</p>
             * </li>
             * <li><p><strong>Redirect</strong>: redirects requests.</p>
             * </li>
             * <li><p><strong>FixedResponse</strong>: returns a fixed response.</p>
             * </li>
             * <li><p><strong>Rewrite</strong>: rewrites requests.</p>
             * </li>
             * <li><p><strong>InsertHeader</strong>: inserts a header field.</p>
             * </li>
             * <li><p><strong>RemoveHeaderConfig</strong>: deletes a header field.</p>
             * </li>
             * <li><p><strong>TrafficLimitConfig</strong>: throttles traffic.</p>
             * </li>
             * <li><p><strong>TrafficMirrorConfig</strong>: mirrors traffic.</p>
             * </li>
             * <li><p><strong>CorsConfig</strong>: enables cross-origin resource sharing (CORS).</p>
             * </li>
             * </ul>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The cookie key. The key must be 1 to 100 characters in length and can contain lowercase letters, printable characters, asterisks (*), and question marks (?). The key cannot contain spaces or <code>#[]{}\|&lt;&gt;&amp;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The cookie value. The value must be 1 to 128 characters in length and can contain lowercase letters, printable characters, asterisks (*), and question marks (?). The value cannot contain spaces or <code>#[]{}\|&lt;&gt;&amp;</code>.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The cookie values.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The header field key. The key must be 1 to 40 characters in length and can contain letters a to z, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Port</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The header field values.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The hostnames.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The request methods.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The forwarding paths.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The query string key. The key must be 1 to 100 characters in length and can contain lowercase letters, printable characters, asterisks (*), and question marks (?). The key cannot contain spaces or <code>#[]{}\|&lt;&gt;&amp;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The query string value. The value must be 1 to 128 characters in length and can contain lowercase letters, printable characters, asterisks (*), and question marks (?). The value cannot contain spaces or <code>#[]{}\|&lt;&gt;&amp;</code>.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The query strings.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The key of the response HTTP header. The key must be 1 to 40 characters in length. It can contain lowercase letters, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of response HTTP header values.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The source IP addresses to match.</p>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
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
             * <p>The hostname configuration.</p>
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
             * <p>The response HTTP header configuration.</p>
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
             * <p>The source IP-based service traffic matching configuration.</p>
             */
            public Builder sourceIpConfig(SourceIpConfig sourceIpConfig) {
                this.sourceIpConfig = sourceIpConfig;
                return this;
            }

            /**
             * <p>The type of the forwarding rule. Valid values:</p>
             * <ul>
             * <li><p><strong>Host</strong>: host.</p>
             * </li>
             * <li><p><strong>Path</strong>: path.</p>
             * </li>
             * <li><p><strong>Header</strong>: HTTP header field.</p>
             * </li>
             * <li><p><strong>QueryString</strong>: query character string.</p>
             * </li>
             * <li><p><strong>Method</strong>: request method.</p>
             * </li>
             * <li><p><strong>Cookie</strong>: cookie.</p>
             * </li>
             * <li><p><strong>SourceIp</strong>: source IP address.</p>
             * </li>
             * </ul>
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
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
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
    /**
     * 
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RuleActions")
        private java.util.List<RuleActions> ruleActions;

        @com.aliyun.core.annotation.NameInMap("RuleConditions")
        private java.util.List<RuleConditions> ruleConditions;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String direction; 
            private String listenerId; 
            private String loadBalancerId; 
            private Integer priority; 
            private java.util.List<RuleActions> ruleActions; 
            private java.util.List<RuleConditions> ruleConditions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.direction = model.direction;
                this.listenerId = model.listenerId;
                this.loadBalancerId = model.loadBalancerId;
                this.priority = model.priority;
                this.ruleActions = model.ruleActions;
                this.ruleConditions = model.ruleConditions;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.tags = model.tags;
            } 

            /**
             * <p>The direction of the forwarding rule. Valid values:</p>
             * <ul>
             * <li><p>Request (default): request-based. Condition matching and corresponding processing are performed on requests sent from clients to ALB.</p>
             * </li>
             * <li><p>Response: response-based. Condition matching and corresponding processing are performed on responses returned from backend server groups to ALB.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>ALB Basic Edition instances do not support the Response type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Request</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The ID of the listener to which the forwarding rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-i35udpz3pxsmnf****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The instance ID of the load balancing instance to which the forwarding rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-x30o38azsuj0sx****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The rule priority. Valid values: <strong>1</strong> to <strong>10000</strong>. A smaller value indicates a higher priority.</p>
             * <blockquote>
             * <p>Rule priorities must be unique within the same listener.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The list of forwarding rule actions.</p>
             */
            public Builder ruleActions(java.util.List<RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>The list of forwarding rule conditions.</p>
             */
            public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * <p>The forwarding rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-bpn0kn908w4nbw****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the forwarding rule. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-instance-test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the forwarding rule. Valid values:</p>
             * <ul>
             * <li><p><strong>Provisioning</strong>: being created.</p>
             * </li>
             * <li><p><strong>Configuring</strong>: being modified.</p>
             * </li>
             * <li><p><strong>Available</strong>: running.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
