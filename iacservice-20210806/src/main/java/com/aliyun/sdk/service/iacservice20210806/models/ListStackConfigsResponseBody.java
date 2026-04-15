// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackConfigsResponseBody</p>
 */
public class ListStackConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListStackConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListStackConfigsResponseBody model) {
            this.configs = model.configs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * configs.
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jIFUaFVhy2VD6whh5GaY854dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackConfigsResponseBody build() {
            return new ListStackConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class Component extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Component(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Component create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(Component model) {
                this.name = model.name;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Component build() {
                return new Component(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Output(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.description = model.description;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class Variable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("default")
        private String _default;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Variable(Builder builder) {
            this._default = builder._default;
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variable create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public String get_default() {
            return this._default;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String _default; 
            private String description; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Variable model) {
                this._default = model._default;
                this.description = model.description;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * default.
             */
            public Builder _default(String _default) {
                this._default = _default;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Variable build() {
                return new Variable(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class ComponentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("component")
        private java.util.List<Component> component;

        @com.aliyun.core.annotation.NameInMap("output")
        private java.util.List<Output> output;

        @com.aliyun.core.annotation.NameInMap("variable")
        private java.util.List<Variable> variable;

        private ComponentConfig(Builder builder) {
            this.component = builder.component;
            this.output = builder.output;
            this.variable = builder.variable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentConfig create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public java.util.List<Component> getComponent() {
            return this.component;
        }

        /**
         * @return output
         */
        public java.util.List<Output> getOutput() {
            return this.output;
        }

        /**
         * @return variable
         */
        public java.util.List<Variable> getVariable() {
            return this.variable;
        }

        public static final class Builder {
            private java.util.List<Component> component; 
            private java.util.List<Output> output; 
            private java.util.List<Variable> variable; 

            private Builder() {
            } 

            private Builder(ComponentConfig model) {
                this.component = model.component;
                this.output = model.output;
                this.variable = model.variable;
            } 

            /**
             * component.
             */
            public Builder component(java.util.List<Component> component) {
                this.component = component;
                return this;
            }

            /**
             * output.
             */
            public Builder output(java.util.List<Output> output) {
                this.output = output;
                return this;
            }

            /**
             * variable.
             */
            public Builder variable(java.util.List<Variable> variable) {
                this.variable = variable;
                return this;
            }

            public ComponentConfig build() {
                return new ComponentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class Deployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Deployment(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deployment create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(Deployment model) {
                this.name = model.name;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Deployment build() {
                return new Deployment(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class PublishOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private PublishOutput(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.result = builder.result;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishOutput create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String result; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(PublishOutput model) {
                this.description = model.description;
                this.name = model.name;
                this.result = model.result;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PublishOutput build() {
                return new PublishOutput(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class UpstreamInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        private UpstreamInput(Builder builder) {
            this.name = builder.name;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpstreamInput create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String name; 
            private String source; 

            private Builder() {
            } 

            private Builder(UpstreamInput model) {
                this.name = model.name;
                this.source = model.source;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public UpstreamInput build() {
                return new UpstreamInput(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class DeploymentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deployment")
        private java.util.List<Deployment> deployment;

        @com.aliyun.core.annotation.NameInMap("publishOutput")
        private java.util.List<PublishOutput> publishOutput;

        @com.aliyun.core.annotation.NameInMap("upstreamInput")
        private java.util.List<UpstreamInput> upstreamInput;

        private DeploymentConfig(Builder builder) {
            this.deployment = builder.deployment;
            this.publishOutput = builder.publishOutput;
            this.upstreamInput = builder.upstreamInput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentConfig create() {
            return builder().build();
        }

        /**
         * @return deployment
         */
        public java.util.List<Deployment> getDeployment() {
            return this.deployment;
        }

        /**
         * @return publishOutput
         */
        public java.util.List<PublishOutput> getPublishOutput() {
            return this.publishOutput;
        }

        /**
         * @return upstreamInput
         */
        public java.util.List<UpstreamInput> getUpstreamInput() {
            return this.upstreamInput;
        }

        public static final class Builder {
            private java.util.List<Deployment> deployment; 
            private java.util.List<PublishOutput> publishOutput; 
            private java.util.List<UpstreamInput> upstreamInput; 

            private Builder() {
            } 

            private Builder(DeploymentConfig model) {
                this.deployment = model.deployment;
                this.publishOutput = model.publishOutput;
                this.upstreamInput = model.upstreamInput;
            } 

            /**
             * deployment.
             */
            public Builder deployment(java.util.List<Deployment> deployment) {
                this.deployment = deployment;
                return this;
            }

            /**
             * publishOutput.
             */
            public Builder publishOutput(java.util.List<PublishOutput> publishOutput) {
                this.publishOutput = publishOutput;
                return this;
            }

            /**
             * upstreamInput.
             */
            public Builder upstreamInput(java.util.List<UpstreamInput> upstreamInput) {
                this.upstreamInput = upstreamInput;
                return this;
            }

            public DeploymentConfig build() {
                return new DeploymentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackConfigsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentConfig")
        private ComponentConfig componentConfig;

        @com.aliyun.core.annotation.NameInMap("componentContent")
        private String componentContent;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("deploymentConfig")
        private DeploymentConfig deploymentConfig;

        @com.aliyun.core.annotation.NameInMap("deploymentContent")
        private String deploymentContent;

        @com.aliyun.core.annotation.NameInMap("failedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Configs(Builder builder) {
            this.componentConfig = builder.componentConfig;
            this.componentContent = builder.componentContent;
            this.createTime = builder.createTime;
            this.deploymentConfig = builder.deploymentConfig;
            this.deploymentContent = builder.deploymentContent;
            this.failedReason = builder.failedReason;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return componentConfig
         */
        public ComponentConfig getComponentConfig() {
            return this.componentConfig;
        }

        /**
         * @return componentContent
         */
        public String getComponentContent() {
            return this.componentContent;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deploymentConfig
         */
        public DeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        /**
         * @return deploymentContent
         */
        public String getDeploymentContent() {
            return this.deploymentContent;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private ComponentConfig componentConfig; 
            private String componentContent; 
            private String createTime; 
            private DeploymentConfig deploymentConfig; 
            private String deploymentContent; 
            private String failedReason; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.componentConfig = model.componentConfig;
                this.componentContent = model.componentContent;
                this.createTime = model.createTime;
                this.deploymentConfig = model.deploymentConfig;
                this.deploymentContent = model.deploymentContent;
                this.failedReason = model.failedReason;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * componentConfig.
             */
            public Builder componentConfig(ComponentConfig componentConfig) {
                this.componentConfig = componentConfig;
                return this;
            }

            /**
             * componentContent.
             */
            public Builder componentContent(String componentContent) {
                this.componentContent = componentContent;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * deploymentConfig.
             */
            public Builder deploymentConfig(DeploymentConfig deploymentConfig) {
                this.deploymentConfig = deploymentConfig;
                return this;
            }

            /**
             * deploymentContent.
             */
            public Builder deploymentContent(String deploymentContent) {
                this.deploymentContent = deploymentContent;
                return this;
            }

            /**
             * failedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
