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
         * <p>The list of stack configurations.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The maximum number of records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The position from which the current call starts reading. An empty value indicates that all data has been read.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9BEDBCF8-03BE-5A59-AC93-9263942B37E8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that match the request conditions. This parameter is optional and may not be returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
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
             * <p>The component name.</p>
             * 
             * <strong>example:</strong>
             * <p>log</p>
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
             * <p>The output description.</p>
             * 
             * <strong>example:</strong>
             * <p>the name of sls project</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The output name.</p>
             * 
             * <strong>example:</strong>
             * <p>project_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The output value.</p>
             * 
             * <strong>example:</strong>
             * <p>log-test</p>
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

        @com.aliyun.core.annotation.NameInMap("sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Variable(Builder builder) {
            this._default = builder._default;
            this.description = builder.description;
            this.name = builder.name;
            this.sensitive = builder.sensitive;
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
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
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
            private Boolean sensitive; 
            private String type; 

            private Builder() {
            } 

            private Builder(Variable model) {
                this._default = model._default;
                this.description = model.description;
                this.name = model.name;
                this.sensitive = model.sensitive;
                this.type = model.type;
            } 

            /**
             * <p>The default value.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-3</p>
             */
            public Builder _default(String _default) {
                this._default = _default;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>region of sls project</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The variable name.</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sensitive.
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The variable type, such as:</p>
             * <ul>
             * <li>string</li>
             * <li>list(string)</li>
             * <li>map(string).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>string</p>
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
             * <p>The list of components.</p>
             */
            public Builder component(java.util.List<Component> component) {
                this.component = component;
                return this;
            }

            /**
             * <p>The list of component outputs.</p>
             */
            public Builder output(java.util.List<Output> output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The list of component variables.</p>
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
             * <p>The deployment name.</p>
             * 
             * <strong>example:</strong>
             * <p>production</p>
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
             * <p>The output description.</p>
             * 
             * <strong>example:</strong>
             * <p>the name of sls project</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The output name.</p>
             * 
             * <strong>example:</strong>
             * <p>project_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The actual output value after the stack deployment is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>log-test</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The output type, such as string or list(string).</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The original definition of the output value. Currently, string or list(string) is supported. You can reference a deployment output in the format: deployment.{deploymentName}.{deploymentOutputName}.</p>
             * 
             * <strong>example:</strong>
             * <p>deployment.production.project_name</p>
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
             * <p>The input name.</p>
             * 
             * <strong>example:</strong>
             * <p>network</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The input source. Currently, only an upstream stack can be specified. The format is {iacEndpoint}/{accountId}/{upstreamStackName}.</p>
             * 
             * <strong>example:</strong>
             * <p>IacEndpoint/156718871222312/stack_network</p>
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
             * <p>The list of deployments.</p>
             */
            public Builder deployment(java.util.List<Deployment> deployment) {
                this.deployment = deployment;
                return this;
            }

            /**
             * <p>The list of outputs.</p>
             */
            public Builder publishOutput(java.util.List<PublishOutput> publishOutput) {
                this.publishOutput = publishOutput;
                return this;
            }

            /**
             * <p>The list of upstream inputs.</p>
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
             * <p>The component configuration.</p>
             */
            public Builder componentConfig(ComponentConfig componentConfig) {
                this.componentConfig = componentConfig;
                return this;
            }

            /**
             * <p>The content of the component configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>format_version: IaCService/2021-08-06\ndescription: create ALB \nvariable:\n  - name: region\n    type: string\n ...</p>
             */
            public Builder componentContent(String componentContent) {
                this.componentContent = componentContent;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-15T16:14:06Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The deployment configuration.</p>
             */
            public Builder deploymentConfig(DeploymentConfig deploymentConfig) {
                this.deploymentConfig = deploymentConfig;
                return this;
            }

            /**
             * <p>The content of the deployment configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>format_version: IaCService/2021-08-06\ndescription: create ALB\nupstream_input:\n  - name: stack_network\n ...</p>
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
             * <p>The status of the stack configuration.</p>
             * <table>
             * <thead>
             * <tr>
             * <th>Name</th>
             * <th>Description</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>Creating</td>
             * <td>Being created.</td>
             * </tr>
             * <tr>
             * <td>Created</td>
             * <td>Created.</td>
             * </tr>
             * <tr>
             * <td>Waiting</td>
             * <td>Waiting for deployment.</td>
             * </tr>
             * <tr>
             * <td>Deploying</td>
             * <td>Being deployed.</td>
             * </tr>
             * <tr>
             * <td>Deployed</td>
             * <td>Deployed.</td>
             * </tr>
             * <tr>
             * <td>Errored</td>
             * <td>Deployment failed.</td>
             * </tr>
             * <tr>
             * <td>Deleting</td>
             * <td>Being deleted.</td>
             * </tr>
             * <tr>
             * <td>Deleted</td>
             * <td>Deleted.</td>
             * </tr>
             * <tr>
             * <td>DeleteFailed</td>
             * <td>Deletion failed.</td>
             * </tr>
             * <tr>
             * <td>DetectTriggered</td>
             * <td>Drift detection triggered.</td>
             * </tr>
             * </tbody></table>
             * 
             * <strong>example:</strong>
             * <p>Deployed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The configuration version number, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
