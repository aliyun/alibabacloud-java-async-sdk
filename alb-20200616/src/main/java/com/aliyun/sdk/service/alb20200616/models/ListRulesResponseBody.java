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
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 用来表示当前调用返回读取到的位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 转发规则列表
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRulesResponseBody build() {
            return new ListRulesResponseBody(this);
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
             * 内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 内容类型
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * HTTP响应码
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
    public static class ServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        private String serverGroupId;

        private ServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
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

        public static final class Builder {
            private String serverGroupId; 

            /**
             * 服务器组标识
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
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
             * 转发到的目的服务器组列表
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
             * HTTP标头
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * HTTP标头内容
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * 取值类型
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
             * 要跳转的主机地址
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * 跳转方式
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * 要跳转的路径
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * 要跳转的端口
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * 要跳转的协议
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * 要跳转的查询字符串
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
             * 主机名
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * 路径
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * 查询
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
    public static class RuleActions extends TeaModel {
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

        @NameInMap("RewriteConfig")
        private RewriteConfig rewriteConfig;

        @NameInMap("Type")
        private String type;

        private RuleActions(Builder builder) {
            this.fixedResponseConfig = builder.fixedResponseConfig;
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.insertHeaderConfig = builder.insertHeaderConfig;
            this.order = builder.order;
            this.redirectConfig = builder.redirectConfig;
            this.rewriteConfig = builder.rewriteConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActions create() {
            return builder().build();
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private FixedResponseConfig fixedResponseConfig; 
            private ForwardGroupConfig forwardGroupConfig; 
            private InsertHeaderConfig insertHeaderConfig; 
            private Integer order; 
            private RedirectConfig redirectConfig; 
            private RewriteConfig rewriteConfig; 
            private String type; 

            /**
             * 返回固定内容动作配置
             */
            public Builder fixedResponseConfig(FixedResponseConfig fixedResponseConfig) {
                this.fixedResponseConfig = fixedResponseConfig;
                return this;
            }

            /**
             * 转发组动作配置
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * 插入头部动作配置
             */
            public Builder insertHeaderConfig(InsertHeaderConfig insertHeaderConfig) {
                this.insertHeaderConfig = insertHeaderConfig;
                return this;
            }

            /**
             * 优先级
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * 重定向动作配置
             */
            public Builder redirectConfig(RedirectConfig redirectConfig) {
                this.redirectConfig = redirectConfig;
                return this;
            }

            /**
             * 内部重定向动作配置
             */
            public Builder rewriteConfig(RewriteConfig rewriteConfig) {
                this.rewriteConfig = rewriteConfig;
                return this;
            }

            /**
             * 转发规则动作类型
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
             * Cookie条件键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Cookie条件值
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
             * Cookie键值对列表
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
             * HTTP标头键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * HTTP标头值列表
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
             * 主机名列表
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
             * HTTP请求方法列表
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
             * 路径条件列表
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
             * 查询字符串条件键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 查询字符串条件值
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
             * 查询字符串条件键值对列表
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

        @NameInMap("Type")
        private String type;

        private RuleConditions(Builder builder) {
            this.cookieConfig = builder.cookieConfig;
            this.headerConfig = builder.headerConfig;
            this.hostConfig = builder.hostConfig;
            this.methodConfig = builder.methodConfig;
            this.pathConfig = builder.pathConfig;
            this.queryStringConfig = builder.queryStringConfig;
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
            private String type; 

            /**
             * Cookie条件配置
             */
            public Builder cookieConfig(CookieConfig cookieConfig) {
                this.cookieConfig = cookieConfig;
                return this;
            }

            /**
             * HTTP标头条件配置
             */
            public Builder headerConfig(HeaderConfig headerConfig) {
                this.headerConfig = headerConfig;
                return this;
            }

            /**
             * 主机名条件配置
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * HTTP请求方法条件配置
             */
            public Builder methodConfig(MethodConfig methodConfig) {
                this.methodConfig = methodConfig;
                return this;
            }

            /**
             * 路径条件配置
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * 查询字符串条件配置
             */
            public Builder queryStringConfig(QueryStringConfig queryStringConfig) {
                this.queryStringConfig = queryStringConfig;
                return this;
            }

            /**
             * 条件类型
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
    public static class Rules extends TeaModel {
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

        private Rules(Builder builder) {
            this.listenerId = builder.listenerId;
            this.loadBalancerId = builder.loadBalancerId;
            this.priority = builder.priority;
            this.ruleActions = builder.ruleActions;
            this.ruleConditions = builder.ruleConditions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
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

        public static final class Builder {
            private String listenerId; 
            private String loadBalancerId; 
            private Integer priority; 
            private java.util.List < RuleActions> ruleActions; 
            private java.util.List < RuleConditions> ruleConditions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 

            /**
             * 监听ID
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * 实例ID
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * 转发规则优先级
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * 转发规则动作
             */
            public Builder ruleActions(java.util.List < RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * 转发规则条件
             */
            public Builder ruleConditions(java.util.List < RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * 转发规则标识
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * 转发规则名称
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * 转发规则状态
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
