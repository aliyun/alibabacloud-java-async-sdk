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
 * {@link CreateDataPipelineRequest} extends {@link RequestModel}
 *
 * <p>CreateDataPipelineRequest</p>
 */
public class CreateDataPipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputs")
    private java.util.List<Outputs> outputs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("processors")
    private java.util.List<Processors> processors;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sinks")
    private java.util.List<Sinks> sinks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    private CreateDataPipelineRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.description = builder.description;
        this.kind = builder.kind;
        this.outputs = builder.outputs;
        this.pipelineName = builder.pipelineName;
        this.processors = builder.processors;
        this.sinks = builder.sinks;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataPipelineRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDataPipelineRequest, Builder> {
        private String workspace; 
        private String description; 
        private String kind; 
        private java.util.List<Outputs> outputs; 
        private String pipelineName; 
        private java.util.List<Processors> processors; 
        private java.util.List<Sinks> sinks; 
        private Source source; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataPipelineRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.description = request.description;
            this.kind = request.kind;
            this.outputs = request.outputs;
            this.pipelineName = request.pipelineName;
            this.processors = request.processors;
            this.sinks = request.sinks;
            this.source = request.source;
        } 

        /**
         * <p>The workspace name.</p>
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
         * <p>The pipeline description.</p>
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
         * <p>The pipeline type.</p>
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
         * <p>The named outputs.</p>
         */
        public Builder outputs(java.util.List<Outputs> outputs) {
            this.putBodyParameter("outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>The pipeline name.</p>
         * 
         * <strong>example:</strong>
         * <p>export-traces-to-prod</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.putBodyParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The common processors.</p>
         */
        public Builder processors(java.util.List<Processors> processors) {
            this.putBodyParameter("processors", processors);
            this.processors = processors;
            return this;
        }

        /**
         * <p>The output destinations.</p>
         */
        public Builder sinks(java.util.List<Sinks> sinks) {
            this.putBodyParameter("sinks", sinks);
            this.sinks = sinks;
            return this;
        }

        /**
         * <p>The data source.</p>
         */
        public Builder source(Source source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateDataPipelineRequest build() {
            return new CreateDataPipelineRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class Assignments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        private Assignments(Builder builder) {
            this.expression = builder.expression;
            this.field = builder.field;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assignments create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        public static final class Builder {
            private String expression; 
            private String field; 

            private Builder() {
            } 

            private Builder(Assignments model) {
                this.expression = model.expression;
                this.field = model.field;
            } 

            /**
             * <p>The assignment expression.</p>
             * 
             * <strong>example:</strong>
             * <p>duration / 1000000.0</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The output field.</p>
             * 
             * <strong>example:</strong>
             * <p>latency_ms</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            public Assignments build() {
                return new Assignments(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class Projections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("target")
        private String target;

        private Projections(Builder builder) {
            this.source = builder.source;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projections create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String source; 
            private String target; 

            private Builder() {
            } 

            private Builder(Projections model) {
                this.source = model.source;
                this.target = model.target;
            } 

            /**
             * <p>The source field.</p>
             * 
             * <strong>example:</strong>
             * <p>serviceName</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The target field.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public Projections build() {
                return new Projections(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The length of the prefix to retain.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder keepPrefix(Integer keepPrefix) {
                this.keepPrefix = keepPrefix;
                return this;
            }

            /**
             * <p>The length of the suffix to retain.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder keepSuffix(Integer keepSuffix) {
                this.keepSuffix = keepSuffix;
                return this;
            }

            /**
             * <p>The sensitive keywords.</p>
             */
            public Builder keys(java.util.List<String> keys) {
                this.keys = keys;
                return this;
            }

            /**
             * <p>The mask character.</p>
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
             * <p>The masking mode.</p>
             * 
             * <strong>example:</strong>
             * <p>keyword</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The built-in sensitive types.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class Field extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("container")
        private String container;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("path")
        private java.util.List<String> path;

        private Field(Builder builder) {
            this.container = builder.container;
            this.kind = builder.kind;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Field create() {
            return builder().build();
        }

        /**
         * @return container
         */
        public String getContainer() {
            return this.container;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public java.util.List<String> getPath() {
            return this.path;
        }

        public static final class Builder {
            private String container; 
            private String kind; 
            private String name; 
            private java.util.List<String> path; 

            private Builder() {
            } 

            private Builder(Field model) {
                this.container = model.container;
                this.kind = model.kind;
                this.name = model.name;
                this.path = model.path;
            } 

            /**
             * <p>The JSON object container.</p>
             * 
             * <strong>example:</strong>
             * <p>attributes</p>
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The reference data type.</p>
             * 
             * <strong>example:</strong>
             * <p>label</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The field or dimension name.</p>
             * 
             * <strong>example:</strong>
             * <p>serviceName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The JSON literal key path.</p>
             */
            public Builder path(java.util.List<String> path) {
                this.path = path;
                return this;
            }

            public Field build() {
                return new Field(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("field")
        private Field field;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private Conditions(Builder builder) {
            this.field = builder.field;
            this.matchType = builder.matchType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public Field getField() {
            return this.field;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private Field field; 
            private String matchType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.field = model.field;
                this.matchType = model.matchType;
                this.values = model.values;
            } 

            /**
             * <p>The field reference.</p>
             */
            public Builder field(Field field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The matching method.</p>
             * 
             * <strong>example:</strong>
             * <p>EXACT</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The match values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class MetricName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private MetricName(Builder builder) {
            this.matchType = builder.matchType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricName create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String matchType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(MetricName model) {
                this.matchType = model.matchType;
                this.values = model.values;
            } 

            /**
             * <p>The matching method.</p>
             * 
             * <strong>example:</strong>
             * <p>EXACT</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The metric names.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;http_requests_total&quot;]</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public MetricName build() {
                return new MetricName(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ServiceName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private ServiceName(Builder builder) {
            this.matchType = builder.matchType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceName create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String matchType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(ServiceName model) {
                this.matchType = model.matchType;
                this.values = model.values;
            } 

            /**
             * <p>The matching method.</p>
             * 
             * <strong>example:</strong>
             * <p>EXACT</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The match values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public ServiceName build() {
                return new ServiceName(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("metricName")
        private MetricName metricName;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private ServiceName serviceName;

        private Scope(Builder builder) {
            this.conditions = builder.conditions;
            this.metricName = builder.metricName;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return metricName
         */
        public MetricName getMetricName() {
            return this.metricName;
        }

        /**
         * @return serviceName
         */
        public ServiceName getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private MetricName metricName; 
            private ServiceName serviceName; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.conditions = model.conditions;
                this.metricName = model.metricName;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The additional field conditions.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The metric name scope.</p>
             */
            public Builder metricName(MetricName metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The service name scope.</p>
             */
            public Builder serviceName(ServiceName serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The list of service names.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The target workspace.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applications")
        private java.util.List<String> applications;

        @com.aliyun.core.annotation.NameInMap("assignments")
        private java.util.List<Assignments> assignments;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List<String> fields;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("projections")
        private java.util.List<Projections> projections;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("selector")
        private Selector selector;

        @com.aliyun.core.annotation.NameInMap("target")
        private Target target;

        private Config(Builder builder) {
            this.applications = builder.applications;
            this.assignments = builder.assignments;
            this.expression = builder.expression;
            this.fields = builder.fields;
            this.parameters = builder.parameters;
            this.projections = builder.projections;
            this.rules = builder.rules;
            this.scope = builder.scope;
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
         * @return assignments
         */
        public java.util.List<Assignments> getAssignments() {
            return this.assignments;
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
         * @return parameters
         */
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        /**
         * @return projections
         */
        public java.util.List<Projections> getProjections() {
            return this.projections;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
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
            private java.util.List<Assignments> assignments; 
            private String expression; 
            private java.util.List<String> fields; 
            private java.util.Map<String, ?> parameters; 
            private java.util.List<Projections> projections; 
            private java.util.List<Rules> rules; 
            private Scope scope; 
            private String script; 
            private Selector selector; 
            private Target target; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.applications = model.applications;
                this.assignments = model.assignments;
                this.expression = model.expression;
                this.fields = model.fields;
                this.parameters = model.parameters;
                this.projections = model.projections;
                this.rules = model.rules;
                this.scope = model.scope;
                this.script = model.script;
                this.selector = model.selector;
                this.target = model.target;
            } 

            /**
             * <p>The list of applications.</p>
             */
            public Builder applications(java.util.List<String> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The list of field assignments.</p>
             */
            public Builder assignments(java.util.List<Assignments> assignments) {
                this.assignments = assignments;
                return this;
            }

            /**
             * <p>The filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>attributes[&quot;http.route&quot;] != &quot;/health&quot;</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The list of fields.</p>
             */
            public Builder fields(java.util.List<String> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>The extended parameters.</p>
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The list of field projections.</p>
             */
            public Builder projections(java.util.List<Projections> projections) {
                this.projections = projections;
                return this;
            }

            /**
             * <p>The list of masking rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The pipeline processing scope.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The SPL script.</p>
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
             * <p>The service selector.</p>
             */
            public Builder selector(Selector selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>The processing target.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The processor configuration.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The processor name.</p>
             * 
             * <strong>example:</strong>
             * <p>drop-health-check</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The processor type.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The output name.</p>
             * 
             * <strong>example:</strong>
             * <p>checkout_route</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The branch processors.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ConfigAssignments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        private ConfigAssignments(Builder builder) {
            this.expression = builder.expression;
            this.field = builder.field;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigAssignments create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        public static final class Builder {
            private String expression; 
            private String field; 

            private Builder() {
            } 

            private Builder(ConfigAssignments model) {
                this.expression = model.expression;
                this.field = model.field;
            } 

            /**
             * <p>The assignment expression.</p>
             * 
             * <strong>example:</strong>
             * <p>duration / 1000000.0</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The output field.</p>
             * 
             * <strong>example:</strong>
             * <p>latency_ms</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            public ConfigAssignments build() {
                return new ConfigAssignments(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ConfigProjections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("target")
        private String target;

        private ConfigProjections(Builder builder) {
            this.source = builder.source;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigProjections create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String source; 
            private String target; 

            private Builder() {
            } 

            private Builder(ConfigProjections model) {
                this.source = model.source;
                this.target = model.target;
            } 

            /**
             * <p>The source field.</p>
             * 
             * <strong>example:</strong>
             * <p>serviceName</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The target field.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public ConfigProjections build() {
                return new ConfigProjections(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The length of the prefix to retain.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder keepPrefix(Integer keepPrefix) {
                this.keepPrefix = keepPrefix;
                return this;
            }

            /**
             * <p>The length of the suffix to retain.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder keepSuffix(Integer keepSuffix) {
                this.keepSuffix = keepSuffix;
                return this;
            }

            /**
             * <p>The sensitive keywords.</p>
             */
            public Builder keys(java.util.List<String> keys) {
                this.keys = keys;
                return this;
            }

            /**
             * <p>The mask character.</p>
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
             * <p>The masking mode.</p>
             * 
             * <strong>example:</strong>
             * <p>keyword</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The built-in sensitive types.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ConditionsField extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("container")
        private String container;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("path")
        private java.util.List<String> path;

        private ConditionsField(Builder builder) {
            this.container = builder.container;
            this.kind = builder.kind;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionsField create() {
            return builder().build();
        }

        /**
         * @return container
         */
        public String getContainer() {
            return this.container;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public java.util.List<String> getPath() {
            return this.path;
        }

        public static final class Builder {
            private String container; 
            private String kind; 
            private String name; 
            private java.util.List<String> path; 

            private Builder() {
            } 

            private Builder(ConditionsField model) {
                this.container = model.container;
                this.kind = model.kind;
                this.name = model.name;
                this.path = model.path;
            } 

            /**
             * <p>The JSON object container.</p>
             * 
             * <strong>example:</strong>
             * <p>attributes</p>
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The reference data type.</p>
             * 
             * <strong>example:</strong>
             * <p>field</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The field or dimension name.</p>
             * 
             * <strong>example:</strong>
             * <p>serviceName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The JSON literal key path.</p>
             */
            public Builder path(java.util.List<String> path) {
                this.path = path;
                return this;
            }

            public ConditionsField build() {
                return new ConditionsField(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ScopeConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("field")
        private ConditionsField field;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private ScopeConditions(Builder builder) {
            this.field = builder.field;
            this.matchType = builder.matchType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeConditions create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public ConditionsField getField() {
            return this.field;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private ConditionsField field; 
            private String matchType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(ScopeConditions model) {
                this.field = model.field;
                this.matchType = model.matchType;
                this.values = model.values;
            } 

            /**
             * <p>The field reference.</p>
             */
            public Builder field(ConditionsField field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The matching method.</p>
             * 
             * <strong>example:</strong>
             * <p>EXACT</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The match values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public ScopeConditions build() {
                return new ScopeConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ScopeMetricName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private ScopeMetricName(Builder builder) {
            this.matchType = builder.matchType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeMetricName create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String matchType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(ScopeMetricName model) {
                this.matchType = model.matchType;
                this.values = model.values;
            } 

            /**
             * <p>The matching method.</p>
             * 
             * <strong>example:</strong>
             * <p>EXACT</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The metric names.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;http_requests_total&quot;]</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public ScopeMetricName build() {
                return new ScopeMetricName(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ScopeServiceName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private ScopeServiceName(Builder builder) {
            this.matchType = builder.matchType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeServiceName create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String matchType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(ScopeServiceName model) {
                this.matchType = model.matchType;
                this.values = model.values;
            } 

            /**
             * <p>The matching method.</p>
             * 
             * <strong>example:</strong>
             * <p>EXACT</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The match values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public ScopeServiceName build() {
                return new ScopeServiceName(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ConfigScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<ScopeConditions> conditions;

        @com.aliyun.core.annotation.NameInMap("metricName")
        private ScopeMetricName metricName;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private ScopeServiceName serviceName;

        private ConfigScope(Builder builder) {
            this.conditions = builder.conditions;
            this.metricName = builder.metricName;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigScope create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<ScopeConditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return metricName
         */
        public ScopeMetricName getMetricName() {
            return this.metricName;
        }

        /**
         * @return serviceName
         */
        public ScopeServiceName getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List<ScopeConditions> conditions; 
            private ScopeMetricName metricName; 
            private ScopeServiceName serviceName; 

            private Builder() {
            } 

            private Builder(ConfigScope model) {
                this.conditions = model.conditions;
                this.metricName = model.metricName;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The additional field conditions.</p>
             */
            public Builder conditions(java.util.List<ScopeConditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The metric name scope.</p>
             */
            public Builder metricName(ScopeMetricName metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The service name scope.</p>
             */
            public Builder serviceName(ScopeServiceName serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ConfigScope build() {
                return new ConfigScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The list of service names.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The target workspace.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
     */
    public static class ProcessorsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applications")
        private java.util.List<String> applications;

        @com.aliyun.core.annotation.NameInMap("assignments")
        private java.util.List<ConfigAssignments> assignments;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List<String> fields;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("projections")
        private java.util.List<ConfigProjections> projections;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List<ConfigRules> rules;

        @com.aliyun.core.annotation.NameInMap("scope")
        private ConfigScope scope;

        @com.aliyun.core.annotation.NameInMap("script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("selector")
        private ConfigSelector selector;

        @com.aliyun.core.annotation.NameInMap("target")
        private ConfigTarget target;

        private ProcessorsConfig(Builder builder) {
            this.applications = builder.applications;
            this.assignments = builder.assignments;
            this.expression = builder.expression;
            this.fields = builder.fields;
            this.parameters = builder.parameters;
            this.projections = builder.projections;
            this.rules = builder.rules;
            this.scope = builder.scope;
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
         * @return assignments
         */
        public java.util.List<ConfigAssignments> getAssignments() {
            return this.assignments;
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
         * @return parameters
         */
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        /**
         * @return projections
         */
        public java.util.List<ConfigProjections> getProjections() {
            return this.projections;
        }

        /**
         * @return rules
         */
        public java.util.List<ConfigRules> getRules() {
            return this.rules;
        }

        /**
         * @return scope
         */
        public ConfigScope getScope() {
            return this.scope;
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
            private java.util.List<ConfigAssignments> assignments; 
            private String expression; 
            private java.util.List<String> fields; 
            private java.util.Map<String, ?> parameters; 
            private java.util.List<ConfigProjections> projections; 
            private java.util.List<ConfigRules> rules; 
            private ConfigScope scope; 
            private String script; 
            private ConfigSelector selector; 
            private ConfigTarget target; 

            private Builder() {
            } 

            private Builder(ProcessorsConfig model) {
                this.applications = model.applications;
                this.assignments = model.assignments;
                this.expression = model.expression;
                this.fields = model.fields;
                this.parameters = model.parameters;
                this.projections = model.projections;
                this.rules = model.rules;
                this.scope = model.scope;
                this.script = model.script;
                this.selector = model.selector;
                this.target = model.target;
            } 

            /**
             * <p>The list of applications.</p>
             */
            public Builder applications(java.util.List<String> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The list of field assignments.</p>
             */
            public Builder assignments(java.util.List<ConfigAssignments> assignments) {
                this.assignments = assignments;
                return this;
            }

            /**
             * <p>The filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>attributes[&quot;http.route&quot;] != &quot;/health&quot;</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The list of fields.</p>
             */
            public Builder fields(java.util.List<String> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>The extended parameters.</p>
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The list of field projections.</p>
             */
            public Builder projections(java.util.List<ConfigProjections> projections) {
                this.projections = projections;
                return this;
            }

            /**
             * <p>The list of masking rules.</p>
             */
            public Builder rules(java.util.List<ConfigRules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The pipeline processing scope in which the processor takes effect.</p>
             */
            public Builder scope(ConfigScope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The SPL script.</p>
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
             * <p>The service selector.</p>
             */
            public Builder selector(ConfigSelector selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>The processing target.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The processor configuration.</p>
             */
            public Builder config(ProcessorsConfig config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The processor name.</p>
             * 
             * <strong>example:</strong>
             * <p>drop-health-check</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The processor type.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The list of datasets.</p>
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
             * <p>The name of the output destination.</p>
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
             * <p>The type of the output destination.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1722844800</p>
             */
            public Builder from(Long from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The end time.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The run mode.</p>
             * 
             * <strong>example:</strong>
             * <p>continuous</p>
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * <p>The read start point.</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder startFrom(String startFrom) {
                this.startFrom = startFrom;
                return this;
            }

            /**
             * <p>The backfill time range.</p>
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
     * {@link CreateDataPipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPipelineRequest</p>
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
             * <p>The datasource config.</p>
             */
            public Builder config(SourceConfig config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
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
