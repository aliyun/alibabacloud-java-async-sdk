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
 * {@link UpdateDataPipelineRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataPipelineRequest</p>
 */
public class UpdateDataPipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    private Long expectedVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputs")
    private java.util.List<Outputs> outputs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("processors")
    private java.util.List<Processors> processors;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sinks")
    private java.util.List<Sinks> sinks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    private UpdateDataPipelineRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.pipelineName = builder.pipelineName;
        this.description = builder.description;
        this.expectedVersion = builder.expectedVersion;
        this.kind = builder.kind;
        this.outputs = builder.outputs;
        this.processors = builder.processors;
        this.sinks = builder.sinks;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataPipelineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
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
     * @return processors
     */
    public java.util.List<Processors> getProcessors() {
        return this.processors;
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

    public static final class Builder extends Request.Builder<UpdateDataPipelineRequest, Builder> {
        private String workspace; 
        private String pipelineName; 
        private String description; 
        private Long expectedVersion; 
        private String kind; 
        private java.util.List<Outputs> outputs; 
        private java.util.List<Processors> processors; 
        private java.util.List<Sinks> sinks; 
        private Source source; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataPipelineRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.pipelineName = request.pipelineName;
            this.description = request.description;
            this.expectedVersion = request.expectedVersion;
            this.kind = request.kind;
            this.outputs = request.outputs;
            this.processors = request.processors;
            this.sinks = request.sinks;
            this.source = request.source;
        } 

        /**
         * <p>待修改数据流水线所属的工作空间名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-source</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
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
            this.putPathParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>用户提供的数据流水线说明；未提供表示清空。</p>
         * 
         * <strong>example:</strong>
         * <p>Export selected trace services to the target workspace.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>用于乐观并发控制的当前配置版本，必须大于 0。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder expectedVersion(Long expectedVersion) {
            this.putBodyParameter("expectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>数据流水线类型，必须与当前值一致。</p>
         * 
         * <strong>example:</strong>
         * <p>export</p>
         */
        public Builder kind(String kind) {
            this.putBodyParameter("kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * <p>更新后的完整单层命名输出列表。</p>
         */
        public Builder outputs(java.util.List<Outputs> outputs) {
            this.putBodyParameter("outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>更新后所有命名输出共享的完整有序处理器列表。</p>
         */
        public Builder processors(java.util.List<Processors> processors) {
            this.putBodyParameter("processors", processors);
            this.processors = processors;
            return this;
        }

        /**
         * <p>更新后的完整 Dataset 到客户 Logstore 绑定列表。</p>
         */
        public Builder sinks(java.util.List<Sinks> sinks) {
            this.putBodyParameter("sinks", sinks);
            this.sinks = sinks;
            return this;
        }

        /**
         * <p>数据流水线读取的逻辑遥测数据源，必须与当前值一致。</p>
         */
        public Builder source(Source source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public UpdateDataPipelineRequest build() {
            return new UpdateDataPipelineRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
     */
    public static class OutputsProcessors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private OutputsProcessors(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputsProcessors create() {
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

            private Builder(OutputsProcessors model) {
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

            public OutputsProcessors build() {
                return new OutputsProcessors(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("processors")
        private java.util.List<OutputsProcessors> processors;

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
        public java.util.List<OutputsProcessors> getProcessors() {
            return this.processors;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<OutputsProcessors> processors; 

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
            public Builder processors(java.util.List<OutputsProcessors> processors) {
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
     */
    public static class Processors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private ProcessorsConfig config;

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

            private Builder(Processors model) {
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

            public Processors build() {
                return new Processors(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
     * {@link UpdateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataPipelineRequest</p>
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
}
