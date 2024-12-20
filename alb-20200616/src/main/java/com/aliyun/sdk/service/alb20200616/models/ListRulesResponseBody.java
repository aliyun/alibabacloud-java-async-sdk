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

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
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
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the forwarding rule.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
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

            /**
             * <p>Indicates whether credentials can be carried in CORS requests. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
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
             * <p>The allowed headers of CORS requests.</p>
             */
            public Builder allowHeaders(java.util.List<String> allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * <p>The allowed HTTP methods of CORS requests.</p>
             */
            public Builder allowMethods(java.util.List<String> allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * <p>The allowed origins of CORS requests.</p>
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
             * <p>The maximum cache time of dry runs in the browser. Unit: seconds.</p>
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

            /**
             * <p>The content of the custom response. The content can be up to 1 KB in size, and can contain only ASCII characters.</p>
             * 
             * <strong>example:</strong>
             * <p>dssacav</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The format of the response.</p>
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
             * <p>The HTTP status code in responses. Valid values: <strong>HTTP_2xx</strong>, <strong>HTTP_4xx</strong>, and <strong>HTTP_5xx</strong>. <strong>x</strong> is a digit.</p>
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

            /**
             * <p>If the value of N in ServerGroupTuple.N is larger than 1, you can enable or disable session persistence for server groups.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>If Enabled is set to True, you can specify a session persistence timeout period.</p>
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

            /**
             * <p>The server group to which requests are forwarded.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-atstuj3rtoptyui****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The weight of the server group. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
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

            /**
             * <p>The session persistence configurations of the server group.</p>
             */
            public Builder serverGroupStickySession(ServerGroupStickySession serverGroupStickySession) {
                this.serverGroupStickySession = serverGroupStickySession;
                return this;
            }

            /**
             * <p>The server groups to which requests are forwarded.</p>
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

            /**
             * <p>The key of the header. The header key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The header key specified in <code>InsertHeader</code> must be unique.</p>
             * <blockquote>
             * <p> <strong>Cookie</strong> and <strong>Host</strong> are not supported.</p>
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
             * <p>The value of the header to be inserted.</p>
             * <ul>
             * <li><p>If <strong>ValueType</strong> is set to <strong>SystemDefined</strong>, you can set the Value parameter to one of the following values:</p>
             * <ul>
             * <li><strong>ClientSrcPort</strong>: the client port.</li>
             * <li><strong>ClientSrcIp</strong>: the IP address of the client.</li>
             * <li><strong>Protocol</strong>: the request protocol (HTTP or HTTPS).</li>
             * <li><strong>SLBId</strong>: the ID of the ALB instance.</li>
             * <li><strong>SLBPort</strong>: the listener port.</li>
             * </ul>
             * </li>
             * <li><p>If <strong>ValueType</strong> is set to <strong>UserDefined</strong>, you can specify a custom header value. The header value must be 1 to 128 characters in length, and can contain wildcard characters, such as asterisks (*) and question marks (?), and printable characters whose ASCII values are <code>larger than or equal to 32 and smaller than 127</code>. The header value cannot start or end with a space character.</p>
             * </li>
             * <li><p>If <strong>ValueType</strong> is set to <strong>ReferenceHeader</strong>, you can reference a value from a request header. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
             * </li>
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
             * <p>The type of the header value. Valid values:</p>
             * <ul>
             * <li><strong>UserDefined</strong>: a user-defined header value.</li>
             * <li><strong>ReferenceHeader</strong>: a header value that is referenced from a request header.</li>
             * <li><strong>SystemDefined:</strong> a system-defined header value.</li>
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

            /**
             * <p>The hostname to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><p><strong>${host}</strong> (default): If ${host} is returned, no other characters are appended.</p>
             * </li>
             * <li><p>A custom value. Make sure that the custom value meets the following requirements:</p>
             * <ul>
             * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?).</li>
             * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
             * <li>The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</li>
             * <li>The domain labels cannot start or end with a hyphen (-).</li>
             * <li>You can use asterisks (*) and question marks (?) anywhere in a domain label as wildcard characters.</li>
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
             * <p>The forwarding method. Valid values: <strong>301</strong>, <strong>302</strong>, <strong>303</strong>, <strong>307</strong>, and <strong>308</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>301</p>
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * <p>The URL to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><p><strong>${path}</strong> (default): You can reference **${host}<strong>, <strong>${protocol}</strong>, and</strong>${port}<strong>. The URL can consist of <strong>${host}</strong>,</strong>${protocol}**, and **${port}**. Each variable can be used only once. The preceding variables can be used at the same time or combined with a custom value.</p>
             * </li>
             * <li><p>A custom value. Make sure that the custom value meets the following requirements:</p>
             * <ul>
             * <li>The URL must be 1 to 128 characters in length.</li>
             * <li>It must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>$ - _ .+ / &amp; ~ @ :</code>. It cannot contain the following special characters: <code>&quot; % # ; ! ( ) [ ] ^ , &quot;</code>. You can use asterisks (*) and question marks (?) as wildcard characters.</li>
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
             * <li><strong>${port}</strong> (default): If ${port} is returned, no other characters are appended.</li>
             * <li>Other valid values: <strong>1 to 63335</strong>.</li>
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
             * <p>The redirect protocol. Valid values:</p>
             * <ul>
             * <li><strong>${protocol}</strong> (default): If ${protocol} is returned, no other characters are appended.</li>
             * <li><strong>HTTP</strong> or <strong>HTTPS</strong></li>
             * </ul>
             * <blockquote>
             * <p> HTTPS listeners supports only HTTPS redirects.</p>
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
             * <p>The query string of the URL to which requests are redirected. The query string must be 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: <code># [ ] { } \ | &lt; &gt; &amp;</code>.</p>
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

            /**
             * <p>The key of the header to be removed. The header key must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The header keys specified in RemoveHeader must be unique.</p>
             * <ul>
             * <li>If Direction is set to Request, the specified headers are removed from requests. The following header keys are not supported (not case-sensitive): <code>slb-id</code>, <code>slb-ip</code>, <code>x-forwarded-for</code>, <code>x-forwarded-proto</code>, <code>x-forwarded-eip</code>, <code>x-forwarded-port</code>, <code>x-forwarded-client-srcport</code>, <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, <code>transfer-encoding</code>, <code>keep-alive</code>, <code>te</code>, <code>host</code>, <code>cookie</code>, <code>remoteip</code>, and <code>authority</code>.</li>
             * <li>If Direction is set to Response, the specified headers are removed from responses. The following header keys are not supported (not case-sensitive): <code>connection</code>, <code>upgrade</code>, <code>content-length</code>, and <code>transfer-encoding</code>.</li>
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

            /**
             * <p>The hostname to which requests are redirected. Valid values:</p>
             * <ul>
             * <li><p><strong>${host}</strong> (default): If ${host} is returned, no other characters are appended.</p>
             * </li>
             * <li><p>A custom value. Make sure that the custom value meets the following requirements:</p>
             * <ul>
             * <li>The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?).</li>
             * <li>The hostname must contain at least one period (.) but cannot start or end with a period (.).</li>
             * <li>The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).</li>
             * <li>The domain labels cannot start or end with a hyphen (-).</li>
             * <li>You can use asterisks (*) and question marks (?) anywhere in a domain label as wildcard characters.</li>
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
             * <p>The URL to which requests are redirected. The URL must be 1 to 128 characters in length, and can contain letters, digits, asterisks (*), question marks (?), and the following special characters: <code>$ - _ . + / &amp; ~ @ :</code>. It must start with a forward slash (/) and does not contain the following special characters: <code>&quot; % # ; ! ( ) [ ] ^ , &quot;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>/tsdf</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The query string of the URL to which requests are redirected. The query string must be 1 to 128 characters in length, and can contain printable characters, excluding uppercase letters and the following special characters: <code># [ ] { } \ | &lt; &gt; &amp;</code>.</p>
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

            /**
             * <p>The number of requests per IP address. Valid values: <strong>1 to 100000</strong>.</p>
             * <blockquote>
             * <p> If both the <strong>QPS</strong> and <strong>PerIpQps</strong> parameters are specified, the value of the <strong>QPS</strong> parameter is smaller than the value of the PerIpQps parameter.</p>
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
             * <p>The number of queries per second (QPS). Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
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

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>srg-00mkgijak0w4qgz9****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The weight of the server group. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
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

            /**
             * <p>The server group to which traffic is mirrored.</p>
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

            /**
             * <p>The configuration of the server group to which traffic is mirrored.</p>
             */
            public Builder mirrorGroupConfig(MirrorGroupConfig mirrorGroupConfig) {
                this.mirrorGroupConfig = mirrorGroupConfig;
                return this;
            }

            /**
             * <p>The destination to which traffic is mirrored. The destination can be a server group.</p>
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

            /**
             * <p>The CORS configuration.</p>
             */
            public Builder corsConfig(CorsConfig corsConfig) {
                this.corsConfig = corsConfig;
                return this;
            }

            /**
             * <p>The configuration of the custom response.</p>
             */
            public Builder fixedResponseConfig(FixedResponseConfig fixedResponseConfig) {
                this.fixedResponseConfig = fixedResponseConfig;
                return this;
            }

            /**
             * <p>The configurations of the server groups.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The key of the header to be inserted.</p>
             */
            public Builder insertHeaderConfig(InsertHeaderConfig insertHeaderConfig) {
                this.insertHeaderConfig = insertHeaderConfig;
                return this;
            }

            /**
             * <p>The priority of the action. Valid values: <strong>1 to 50000</strong>. A smaller value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter cannot empty. The priority of each action within a forwarding rule must be unique.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The configuration of the redirect action.</p>
             */
            public Builder redirectConfig(RedirectConfig redirectConfig) {
                this.redirectConfig = redirectConfig;
                return this;
            }

            /**
             * <p>The HTTP header to be removed.</p>
             */
            public Builder removeHeaderConfig(RemoveHeaderConfig removeHeaderConfig) {
                this.removeHeaderConfig = removeHeaderConfig;
                return this;
            }

            /**
             * <p>The configuration of the rewrite action.</p>
             */
            public Builder rewriteConfig(RewriteConfig rewriteConfig) {
                this.rewriteConfig = rewriteConfig;
                return this;
            }

            /**
             * <p>The configuration of traffic throttling.</p>
             */
            public Builder trafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
                this.trafficLimitConfig = trafficLimitConfig;
                return this;
            }

            /**
             * <p>The configuration of traffic mirroring.</p>
             */
            public Builder trafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
                this.trafficMirrorConfig = trafficMirrorConfig;
                return this;
            }

            /**
             * <p>The action. Valid values:</p>
             * <ul>
             * <li><strong>ForwardGroup</strong>: distributes requests to multiple vServer groups.</li>
             * <li><strong>Redirect</strong>: redirects requests.</li>
             * <li><strong>FixedResponse</strong>: returns a custom response.</li>
             * <li><strong>Rewrite</strong>: rewrites requests.</li>
             * <li><strong>InsertHeader</strong>: inserts headers.</li>
             * <li><strong>RemoveHeaderConfig</strong>: removes headers.</li>
             * <li><strong>TrafficLimitConfig</strong>: throttles network traffic.</li>
             * <li><strong>TrafficMirrorConfig</strong>: mirrors network traffic.</li>
             * <li><strong>CorsConfig</strong>: forwards requests based on CORS.</li>
             * </ul>
             * <p>The preceding actions can be classified into two broad types:</p>
             * <ul>
             * <li><strong>FinalType</strong>: Each forwarding rule can contain only one FinalType action, which is performed at the end. You can specify only one of <strong>ForwardGroup</strong>, <strong>Redirect</strong>, and <strong>FixedResponse</strong>.</li>
             * <li><strong>ExtType</strong>: Each forwarding rule can contain one or more <strong>ExtType</strong> actions, which are performed before the <strong>FinalType</strong> action. If you want to specify an ExtType action, you must also specify a <strong>FinalType</strong> action. You can specify multiple <strong>InsertHeader</strong> actions or one <strong>Rewrite</strong> action.</li>
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

            /**
             * <p>The cookie key. The cookie key must be 1 to 100 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \ | &lt; &gt; &amp;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The cookie value. The cookie value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \ | &lt; &gt; &amp;</code>.</p>
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

            /**
             * <p>The cookie value.</p>
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

            /**
             * <p>The key of the header. The header key must be 1 to 40 characters in length. It can contain letters, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Port</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the header.</p>
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

            /**
             * <p>The URLs to which requests are forwarded.</p>
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

            /**
             * <p>They key of the query string. The key must be 1 to 100 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \ | &lt; &gt; &amp;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the query string. The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters, asterisks (*), and question marks (?). It cannot contain space characters or the following special characters: <code># [ ] { } \ | &lt; &gt; &amp;</code>.</p>
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

            /**
             * <p>The query string.</p>
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

            /**
             * <p>The key of the HTTP header. The header key must be 1 to 40 characters in length, It can contain letters, digits, hyphens (-), and underscores (_). Cookie and Host are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The values of the HTTP header.</p>
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

            /**
             * <p>The response status codes.</p>
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

            /**
             * <p>The source IP addresses.</p>
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

            /**
             * <p>The key-value pairs of the cookie.</p>
             */
            public Builder cookieConfig(CookieConfig cookieConfig) {
                this.cookieConfig = cookieConfig;
                return this;
            }

            /**
             * <p>The configuration of the header.</p>
             */
            public Builder headerConfig(HeaderConfig headerConfig) {
                this.headerConfig = headerConfig;
                return this;
            }

            /**
             * <p>The configuration of the hosts.</p>
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * <p>The configurations of the request methods.</p>
             */
            public Builder methodConfig(MethodConfig methodConfig) {
                this.methodConfig = methodConfig;
                return this;
            }

            /**
             * <p>The configurations of the forwarding URLs.</p>
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * <p>The configurations of the query strings.</p>
             */
            public Builder queryStringConfig(QueryStringConfig queryStringConfig) {
                this.queryStringConfig = queryStringConfig;
                return this;
            }

            /**
             * <p>The HTTP header in responses.</p>
             */
            public Builder responseHeaderConfig(ResponseHeaderConfig responseHeaderConfig) {
                this.responseHeaderConfig = responseHeaderConfig;
                return this;
            }

            /**
             * <p>The configurations of the response status codes.</p>
             */
            public Builder responseStatusCodeConfig(ResponseStatusCodeConfig responseStatusCodeConfig) {
                this.responseStatusCodeConfig = responseStatusCodeConfig;
                return this;
            }

            /**
             * <p>Traffic matching based on source IP addresses.</p>
             */
            public Builder sourceIpConfig(SourceIpConfig sourceIpConfig) {
                this.sourceIpConfig = sourceIpConfig;
                return this;
            }

            /**
             * <p>The type of forwarding rule. Valid values:</p>
             * <ul>
             * <li><strong>Host</strong>: Responses are forwarded based on hosts.</li>
             * <li><strong>Path</strong>: Responses are forwarded based on URLs.</li>
             * <li><strong>Header</strong>: Responses are forwarded based on HTTP headers.</li>
             * <li><strong>QueryString</strong>: Responses are forwarded based on query strings.</li>
             * <li><strong>Method</strong>: Responses are forwarded based on request methods.</li>
             * <li><strong>Cookie</strong>: Responses are forwarded based on cookies.</li>
             * <li><strong>SourceIp</strong>: Responses are forwarded based on source IP addresses.</li>
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

            /**
             * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
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

            /**
             * <p>The direction to which the forwarding rule is applied. Valid values:</p>
             * <ul>
             * <li>Request (default): The forwarding rule is applied to requests. The forwarding action is performed on packets that are forwarded from clients to ALB.</li>
             * <li>Responses: The forwarding rule is applied to responses. The forwarding action is performed on packets that are returned from backend servers to ALB.</li>
             * </ul>
             * <blockquote>
             * <p> Basic ALB instances support only the Response direction.</p>
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
             * <p>The ID of the listener that is associated with the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-i35udpz3pxsmnf****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The ID of the Application Load Balancer (ALB) instance that is associated with the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-x30o38azsuj0sx****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A smaller value indicates a higher priority.</p>
             * <blockquote>
             * <p> The priority of each forwarding rule added to a listener must be unique.</p>
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
             * <p>The action of the forwarding rule.</p>
             */
            public Builder ruleActions(java.util.List<RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>The conditions of the forwarding rule.</p>
             */
            public Builder ruleConditions(java.util.List<RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * <p>The ID of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-bpn0kn908w4nbw****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the forwarding rule. The name must be 2 to 128 letters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
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
             * <li><strong>Provisioning</strong>: The forwarding rule is being created.</li>
             * <li><strong>Configuring</strong>: The forwarding rule is being modified.</li>
             * <li><strong>Available</strong>: The forwarding rule is available.</li>
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
