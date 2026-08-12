// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataPipelinesResponseBody</p>
 */
public class ListDataPipelinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("pipelines")
    private java.util.List<Pipelines> pipelines;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListDataPipelinesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pipelines = builder.pipelines;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataPipelinesResponseBody create() {
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
     * @return pipelines
     */
    public java.util.List<Pipelines> getPipelines() {
        return this.pipelines;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Pipelines> pipelines; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListDataPipelinesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pipelines = model.pipelines;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>本次请求允许返回的最大数据流水线数量。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>用于获取下一页数据的令牌；为空表示没有下一页。</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>当前页返回的数据流水线完整配置与运行状态。</p>
         */
        public Builder pipelines(java.util.List<Pipelines> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        /**
         * <p>用于排查问题的请求唯一标识。</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>符合查询条件的数据流水线总数。</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataPipelinesResponseBody build() {
            return new ListDataPipelinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keepPrefix")
        private Integer keepPrefix;

        @com.aliyun.core.annotation.NameInMap("keepSuffix")
        private Integer keepSuffix;

        @com.aliyun.core.annotation.NameInMap("keys")
        private java.util.List<String> keys;

        @com.aliyun.core.annotation.NameInMap("maskChar")
        private String maskChar;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("types")
        private java.util.List<String> types;

        private Rules(Builder builder) {
            this.keepPrefix = builder.keepPrefix;
            this.keepSuffix = builder.keepSuffix;
            this.keys = builder.keys;
            this.maskChar = builder.maskChar;
            this.mode = builder.mode;
            this.types = builder.types;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return keepPrefix
         */
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        /**
         * @return keepSuffix
         */
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        /**
         * @return keys
         */
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        /**
         * @return maskChar
         */
        public String getMaskChar() {
            return this.maskChar;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return types
         */
        public java.util.List<String> getTypes() {
            return this.types;
        }

        public static final class Builder {
            private Integer keepPrefix; 
            private Integer keepSuffix; 
            private java.util.List<String> keys; 
            private String maskChar; 
            private String mode; 
            private java.util.List<String> types; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.keepPrefix = model.keepPrefix;
                this.keepSuffix = model.keepSuffix;
                this.keys = model.keys;
                this.maskChar = model.maskChar;
                this.mode = model.mode;
                this.types = model.types;
            } 

            /**
             * <p>脱敏后保留的前缀字符数。</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder keepPrefix(Integer keepPrefix) {
                this.keepPrefix = keepPrefix;
                return this;
            }

            /**
             * <p>脱敏后保留的后缀字符数。</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder keepSuffix(Integer keepSuffix) {
                this.keepSuffix = keepSuffix;
                return this;
            }

            /**
             * <p>keyword 模式下要匹配的敏感关键词。</p>
             */
            public Builder keys(java.util.List<String> keys) {
                this.keys = keys;
                return this;
            }

            /**
             * <p>替换敏感内容时使用的单个掩码字符。</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder maskChar(String maskChar) {
                this.maskChar = maskChar;
                return this;
            }

            /**
             * <p>脱敏规则模式。可选值为 buildin 或 keyword。</p>
             * 
             * <strong>example:</strong>
             * <p>keyword</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>buildin 模式下要识别的内置敏感数据类型。</p>
             */
            public Builder types(java.util.List<String> types) {
                this.types = types;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Selector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("serviceNames")
        private java.util.List<String> serviceNames;

        private Selector(Builder builder) {
            this.serviceNames = builder.serviceNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Selector create() {
            return builder().build();
        }

        /**
         * @return serviceNames
         */
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        public static final class Builder {
            private java.util.List<String> serviceNames; 

            private Builder() {
            } 

            private Builder(Selector model) {
                this.serviceNames = model.serviceNames;
            } 

            /**
             * <p>用于匹配源工作空间服务的 glob 模式列表；仅支持星号（*）通配符。</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
             */
            public Builder serviceNames(java.util.List<String> serviceNames) {
                this.serviceNames = serviceNames;
                return this;
            }

            public Selector build() {
                return new Selector(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Target(Builder builder) {
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String workspace; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.workspace = model.workspace;
            } 

            /**
             * <p>service_export 处理器要导入数据的目标工作空间名称。</p>
             * 
             * <strong>example:</strong>
             * <p>target-checkout-ws</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applications")
        private java.util.List<String> applications;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List<String> fields;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("selector")
        private Selector selector;

        @com.aliyun.core.annotation.NameInMap("target")
        private Target target;

        private Config(Builder builder) {
            this.applications = builder.applications;
            this.expression = builder.expression;
            this.fields = builder.fields;
            this.rules = builder.rules;
            this.script = builder.script;
            this.selector = builder.selector;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return fields
         */
        public java.util.List<String> getFields() {
            return this.fields;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return selector
         */
        public Selector getSelector() {
            return this.selector;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        public static final class Builder {
            private java.util.List<String> applications; 
            private String expression; 
            private java.util.List<String> fields; 
            private java.util.List<Rules> rules; 
            private String script; 
            private Selector selector; 
            private Target target; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.applications = model.applications;
                this.expression = model.expression;
                this.fields = model.fields;
                this.rules = model.rules;
                this.script = model.script;
                this.selector = model.selector;
                this.target = model.target;
            } 

            /**
             * <p>数据安全处理器生效的应用名称列表；星号（*）表示全部应用。</p>
             */
            public Builder applications(java.util.List<String> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>filter 处理器使用的 SPL 条件表达式。</p>
             * 
             * <strong>example:</strong>
             * <p>attributes[&quot;http.route&quot;] != &quot;/health&quot;</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>字段处理器要处理的遥测字段路径列表。</p>
             */
            public Builder fields(java.util.List<String> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>mask_fields 处理器按顺序使用的脱敏规则。</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>spl 处理器执行的 ETL SPL pipeline expression，必须以星号（*）开头。</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>| extend latency_ms = duration / 1000000</li>
             * </ul>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * <p>service_export 处理器的源服务名称选择器。</p>
             */
            public Builder selector(Selector selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>service_export 处理器的目标工作空间配置。</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Processors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Processors(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processors create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Config config; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Processors model) {
                this.config = model.config;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>与处理器类型对应的配置。</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>处理器在所在有序处理链中的唯一名称。</p>
             * 
             * <strong>example:</strong>
             * <p>drop-health-check</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>平台注册的处理器类型，例如 filter、spl 或 service_export。</p>
             * 
             * <strong>example:</strong>
             * <p>filter</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Processors build() {
                return new Processors(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("processors")
        private java.util.List<Processors> processors;

        private Outputs(Builder builder) {
            this.name = builder.name;
            this.processors = builder.processors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return processors
         */
        public java.util.List<Processors> getProcessors() {
            return this.processors;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<Processors> processors; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.name = model.name;
                this.processors = model.processors;
            } 

            /**
             * <p>命名输出的唯一名称，也是公开 Dataset 名称。</p>
             * 
             * <strong>example:</strong>
             * <p>checkout_route</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>该命名输出按数组顺序执行的处理器列表。</p>
             */
            public Builder processors(java.util.List<Processors> processors) {
                this.processors = processors;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class ConfigRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keepPrefix")
        private Integer keepPrefix;

        @com.aliyun.core.annotation.NameInMap("keepSuffix")
        private Integer keepSuffix;

        @com.aliyun.core.annotation.NameInMap("keys")
        private java.util.List<String> keys;

        @com.aliyun.core.annotation.NameInMap("maskChar")
        private String maskChar;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("types")
        private java.util.List<String> types;

        private ConfigRules(Builder builder) {
            this.keepPrefix = builder.keepPrefix;
            this.keepSuffix = builder.keepSuffix;
            this.keys = builder.keys;
            this.maskChar = builder.maskChar;
            this.mode = builder.mode;
            this.types = builder.types;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRules create() {
            return builder().build();
        }

        /**
         * @return keepPrefix
         */
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        /**
         * @return keepSuffix
         */
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        /**
         * @return keys
         */
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        /**
         * @return maskChar
         */
        public String getMaskChar() {
            return this.maskChar;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return types
         */
        public java.util.List<String> getTypes() {
            return this.types;
        }

        public static final class Builder {
            private Integer keepPrefix; 
            private Integer keepSuffix; 
            private java.util.List<String> keys; 
            private String maskChar; 
            private String mode; 
            private java.util.List<String> types; 

            private Builder() {
            } 

            private Builder(ConfigRules model) {
                this.keepPrefix = model.keepPrefix;
                this.keepSuffix = model.keepSuffix;
                this.keys = model.keys;
                this.maskChar = model.maskChar;
                this.mode = model.mode;
                this.types = model.types;
            } 

            /**
             * <p>脱敏后保留的前缀字符数。</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder keepPrefix(Integer keepPrefix) {
                this.keepPrefix = keepPrefix;
                return this;
            }

            /**
             * <p>脱敏后保留的后缀字符数。</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder keepSuffix(Integer keepSuffix) {
                this.keepSuffix = keepSuffix;
                return this;
            }

            /**
             * <p>keyword 模式下要匹配的敏感关键词。</p>
             */
            public Builder keys(java.util.List<String> keys) {
                this.keys = keys;
                return this;
            }

            /**
             * <p>替换敏感内容时使用的单个掩码字符。</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder maskChar(String maskChar) {
                this.maskChar = maskChar;
                return this;
            }

            /**
             * <p>脱敏规则模式。可选值为 buildin 或 keyword。</p>
             * 
             * <strong>example:</strong>
             * <p>keyword</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>buildin 模式下要识别的内置敏感数据类型。</p>
             */
            public Builder types(java.util.List<String> types) {
                this.types = types;
                return this;
            }

            public ConfigRules build() {
                return new ConfigRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class ConfigSelector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("serviceNames")
        private java.util.List<String> serviceNames;

        private ConfigSelector(Builder builder) {
            this.serviceNames = builder.serviceNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSelector create() {
            return builder().build();
        }

        /**
         * @return serviceNames
         */
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        public static final class Builder {
            private java.util.List<String> serviceNames; 

            private Builder() {
            } 

            private Builder(ConfigSelector model) {
                this.serviceNames = model.serviceNames;
            } 

            /**
             * <p>用于匹配源工作空间服务的 glob 模式列表；仅支持星号（*）通配符。</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
             */
            public Builder serviceNames(java.util.List<String> serviceNames) {
                this.serviceNames = serviceNames;
                return this;
            }

            public ConfigSelector build() {
                return new ConfigSelector(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class ConfigTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private ConfigTarget(Builder builder) {
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTarget create() {
            return builder().build();
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String workspace; 

            private Builder() {
            } 

            private Builder(ConfigTarget model) {
                this.workspace = model.workspace;
            } 

            /**
             * <p>service_export 处理器要导入数据的目标工作空间名称。</p>
             * 
             * <strong>example:</strong>
             * <p>target-checkout-ws</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public ConfigTarget build() {
                return new ConfigTarget(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class ProcessorsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applications")
        private java.util.List<String> applications;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List<String> fields;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List<ConfigRules> rules;

        @com.aliyun.core.annotation.NameInMap("script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("selector")
        private ConfigSelector selector;

        @com.aliyun.core.annotation.NameInMap("target")
        private ConfigTarget target;

        private ProcessorsConfig(Builder builder) {
            this.applications = builder.applications;
            this.expression = builder.expression;
            this.fields = builder.fields;
            this.rules = builder.rules;
            this.script = builder.script;
            this.selector = builder.selector;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessorsConfig create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return fields
         */
        public java.util.List<String> getFields() {
            return this.fields;
        }

        /**
         * @return rules
         */
        public java.util.List<ConfigRules> getRules() {
            return this.rules;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return selector
         */
        public ConfigSelector getSelector() {
            return this.selector;
        }

        /**
         * @return target
         */
        public ConfigTarget getTarget() {
            return this.target;
        }

        public static final class Builder {
            private java.util.List<String> applications; 
            private String expression; 
            private java.util.List<String> fields; 
            private java.util.List<ConfigRules> rules; 
            private String script; 
            private ConfigSelector selector; 
            private ConfigTarget target; 

            private Builder() {
            } 

            private Builder(ProcessorsConfig model) {
                this.applications = model.applications;
                this.expression = model.expression;
                this.fields = model.fields;
                this.rules = model.rules;
                this.script = model.script;
                this.selector = model.selector;
                this.target = model.target;
            } 

            /**
             * <p>数据安全处理器生效的应用名称列表；星号（*）表示全部应用。</p>
             */
            public Builder applications(java.util.List<String> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>filter 处理器使用的 SPL 条件表达式。</p>
             * 
             * <strong>example:</strong>
             * <p>attributes[&quot;http.route&quot;] != &quot;/health&quot;</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>字段处理器要处理的遥测字段路径列表。</p>
             */
            public Builder fields(java.util.List<String> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>mask_fields 处理器按顺序使用的脱敏规则。</p>
             */
            public Builder rules(java.util.List<ConfigRules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>spl 处理器执行的 ETL SPL pipeline expression，必须以星号（*）开头。</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>| extend latency_ms = duration / 1000000</li>
             * </ul>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * <p>service_export 处理器的源服务名称选择器。</p>
             */
            public Builder selector(ConfigSelector selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>service_export 处理器的目标工作空间配置。</p>
             */
            public Builder target(ConfigTarget target) {
                this.target = target;
                return this;
            }

            public ProcessorsConfig build() {
                return new ProcessorsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class PipelinesProcessors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private ProcessorsConfig config;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PipelinesProcessors(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelinesProcessors create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public ProcessorsConfig getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ProcessorsConfig config; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(PipelinesProcessors model) {
                this.config = model.config;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>与处理器类型对应的配置。</p>
             */
            public Builder config(ProcessorsConfig config) {
                this.config = config;
                return this;
            }

            /**
             * <p>处理器在所在有序处理链中的唯一名称。</p>
             * 
             * <strong>example:</strong>
             * <p>drop-health-check</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>平台注册的处理器类型，例如 filter、spl 或 service_export。</p>
             * 
             * <strong>example:</strong>
             * <p>filter</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PipelinesProcessors build() {
                return new PipelinesProcessors(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Sinks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("datasets")
        private java.util.List<String> datasets;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Sinks(Builder builder) {
            this.datasets = builder.datasets;
            this.logstore = builder.logstore;
            this.name = builder.name;
            this.project = builder.project;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sinks create() {
            return builder().build();
        }

        /**
         * @return datasets
         */
        public java.util.List<String> getDatasets() {
            return this.datasets;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> datasets; 
            private String logstore; 
            private String name; 
            private String project; 
            private String type; 

            private Builder() {
            } 

            private Builder(Sinks model) {
                this.datasets = model.datasets;
                this.logstore = model.logstore;
                this.name = model.name;
                this.project = model.project;
                this.type = model.type;
            } 

            /**
             * <p>该输出目标消费的非空、去重 Dataset 名称列表。</p>
             */
            public Builder datasets(java.util.List<String> datasets) {
                this.datasets = datasets;
                return this;
            }

            /**
             * <p>SLS Logstore</p>
             * 
             * <strong>example:</strong>
             * <p>error-spans</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>输出目标在流水线内的唯一名称。</p>
             * 
             * <strong>example:</strong>
             * <p>error-archive</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>SLS Project</p>
             * 
             * <strong>example:</strong>
             * <p>customer-project</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>输出目标类型。第一版仅支持 logstore。</p>
             * 
             * <strong>example:</strong>
             * <p>logstore</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Sinks build() {
                return new Sinks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class TimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("from")
        private Long from;

        @com.aliyun.core.annotation.NameInMap("to")
        private Long to;

        private TimeRange(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Long getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Long getTo() {
            return this.to;
        }

        public static final class Builder {
            private Long from; 
            private Long to; 

            private Builder() {
            } 

            private Builder(TimeRange model) {
                this.from = model.from;
                this.to = model.to;
            } 

            /**
             * <p>回填范围的开始时间，使用 Unix 秒并对齐到 5 分钟边界。</p>
             * 
             * <strong>example:</strong>
             * <p>1722844800</p>
             */
            public Builder from(Long from) {
                this.from = from;
                return this;
            }

            /**
             * <p>回填范围的结束时间，使用 Unix 秒并对齐到 5 分钟边界。</p>
             * 
             * <strong>example:</strong>
             * <p>1722848400</p>
             */
            public Builder to(Long to) {
                this.to = to;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class SourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("runMode")
        private String runMode;

        @com.aliyun.core.annotation.NameInMap("startFrom")
        private String startFrom;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private TimeRange timeRange;

        private SourceConfig(Builder builder) {
            this.runMode = builder.runMode;
            this.startFrom = builder.startFrom;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceConfig create() {
            return builder().build();
        }

        /**
         * @return runMode
         */
        public String getRunMode() {
            return this.runMode;
        }

        /**
         * @return startFrom
         */
        public String getStartFrom() {
            return this.startFrom;
        }

        /**
         * @return timeRange
         */
        public TimeRange getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private String runMode; 
            private String startFrom; 
            private TimeRange timeRange; 

            private Builder() {
            } 

            private Builder(SourceConfig model) {
                this.runMode = model.runMode;
                this.startFrom = model.startFrom;
                this.timeRange = model.timeRange;
            } 

            /**
             * <p>数据源读取模式。可选值为 continuous 或 backfill。</p>
             * 
             * <strong>example:</strong>
             * <p>continuous</p>
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * <p>continuous 模式的读取起点，支持 latest、earliest 或 Unix 秒时间戳。</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder startFrom(String startFrom) {
                this.startFrom = startFrom;
                return this;
            }

            /**
             * <p>backfill 模式使用的有限时间范围。</p>
             */
            public Builder timeRange(TimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public SourceConfig build() {
                return new SourceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private SourceConfig config;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
            this.config = builder.config;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public SourceConfig getConfig() {
            return this.config;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private SourceConfig config; 
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.config = model.config;
                this.type = model.type;
            } 

            /**
             * <p>数据源的读取模式与起始范围配置。</p>
             */
            public Builder config(SourceConfig config) {
                this.config = config;
                return this;
            }

            /**
             * <p>平台注册的逻辑数据源类型。首版 export 流水线使用 traces-default。</p>
             * 
             * <strong>example:</strong>
             * <p>traces-default</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataPipelinesResponseBody</p>
     */
    public static class Pipelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("kind")
        @com.aliyun.core.annotation.Validation(required = true)
        private String kind;

        @com.aliyun.core.annotation.NameInMap("outputs")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Outputs> outputs;

        @com.aliyun.core.annotation.NameInMap("pipelineName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("processors")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<PipelinesProcessors> processors;

        @com.aliyun.core.annotation.NameInMap("signalType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String signalType;

        @com.aliyun.core.annotation.NameInMap("sinks")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Sinks> sinks;

        @com.aliyun.core.annotation.NameInMap("source")
        @com.aliyun.core.annotation.Validation(required = true)
        private Source source;

        @com.aliyun.core.annotation.NameInMap("status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("version")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long version;

        private Pipelines(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.kind = builder.kind;
            this.outputs = builder.outputs;
            this.pipelineName = builder.pipelineName;
            this.processors = builder.processors;
            this.signalType = builder.signalType;
            this.sinks = builder.sinks;
            this.source = builder.source;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipelines create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return outputs
         */
        public java.util.List<Outputs> getOutputs() {
            return this.outputs;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
        }

        /**
         * @return processors
         */
        public java.util.List<PipelinesProcessors> getProcessors() {
            return this.processors;
        }

        /**
         * @return signalType
         */
        public String getSignalType() {
            return this.signalType;
        }

        /**
         * @return sinks
         */
        public java.util.List<Sinks> getSinks() {
            return this.sinks;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String kind; 
            private java.util.List<Outputs> outputs; 
            private String pipelineName; 
            private java.util.List<PipelinesProcessors> processors; 
            private String signalType; 
            private java.util.List<Sinks> sinks; 
            private Source source; 
            private String status; 
            private String statusMessage; 
            private String updateTime; 
            private Long version; 

            private Builder() {
            } 

            private Builder(Pipelines model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.kind = model.kind;
                this.outputs = model.outputs;
                this.pipelineName = model.pipelineName;
                this.processors = model.processors;
                this.signalType = model.signalType;
                this.sinks = model.sinks;
                this.source = model.source;
                this.status = model.status;
                this.statusMessage = model.statusMessage;
                this.updateTime = model.updateTime;
                this.version = model.version;
            } 

            /**
             * <p>数据流水线的创建时间，使用 ISO 8601 UTC 格式。</p>
             * <p>This parameter is required.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-10T05:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>用户提供的数据流水线说明。</p>
             * 
             * <strong>example:</strong>
             * <p>Export selected trace services to the target workspace.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>数据流水线类型。可选值为 default、custom 或 export。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>export</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>从公共处理链结果分出的单层命名输出列表。</p>
             * <p>This parameter is required.</p>
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>工作空间内唯一的数据流水线名称。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>export-traces-to-prod</p>
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * <p>所有命名输出共享并按数组顺序执行的处理器列表。</p>
             * <p>This parameter is required.</p>
             */
            public Builder processors(java.util.List<PipelinesProcessors> processors) {
                this.processors = processors;
                return this;
            }

            /**
             * <p>由 source.type 推导的只读遥测信号类型。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>traces</p>
             */
            public Builder signalType(String signalType) {
                this.signalType = signalType;
                return this;
            }

            /**
             * <p>Dataset 到客户 Logstore 的绑定列表；default 和 export 流水线返回空数组。</p>
             * <p>This parameter is required.</p>
             */
            public Builder sinks(java.util.List<Sinks> sinks) {
                this.sinks = sinks;
                return this;
            }

            /**
             * <p>数据流水线读取的逻辑遥测数据源。</p>
             * <p>This parameter is required.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>数据流水线的运行健康状态。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>运行状态的补充说明。</p>
             * 
             * <strong>example:</strong>
             * <p>Pipeline is running.</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>数据流水线的最后更新时间，使用 ISO 8601 UTC 格式。</p>
             * <p>This parameter is required.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-10T05:10:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>最新成功提交的完整配置版本。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Pipelines build() {
                return new Pipelines(this);
            } 

        } 

    }
}
