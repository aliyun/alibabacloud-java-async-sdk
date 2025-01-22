// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskRequest</p>
 */
public class UpdateTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientUniqueCode")
    private String clientUniqueCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dependencies")
    private java.util.List<Dependencies> dependencies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Inputs")
    private Inputs inputs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceMode")
    private String instanceMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Outputs")
    private Outputs outputs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RerunInterval")
    private Integer rerunInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RerunMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rerunMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RerunTimes")
    private Integer rerunTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private RuntimeResource runtimeResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Script")
    private Script script;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Trigger")
    @com.aliyun.core.annotation.Validation(required = true)
    private Trigger trigger;

    private UpdateTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientUniqueCode = builder.clientUniqueCode;
        this.dataSource = builder.dataSource;
        this.dependencies = builder.dependencies;
        this.description = builder.description;
        this.envType = builder.envType;
        this.id = builder.id;
        this.inputs = builder.inputs;
        this.instanceMode = builder.instanceMode;
        this.name = builder.name;
        this.outputs = builder.outputs;
        this.owner = builder.owner;
        this.rerunInterval = builder.rerunInterval;
        this.rerunMode = builder.rerunMode;
        this.rerunTimes = builder.rerunTimes;
        this.runtimeResource = builder.runtimeResource;
        this.script = builder.script;
        this.tags = builder.tags;
        this.timeout = builder.timeout;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientUniqueCode
     */
    public String getClientUniqueCode() {
        return this.clientUniqueCode;
    }

    /**
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @return dependencies
     */
    public java.util.List<Dependencies> getDependencies() {
        return this.dependencies;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return inputs
     */
    public Inputs getInputs() {
        return this.inputs;
    }

    /**
     * @return instanceMode
     */
    public String getInstanceMode() {
        return this.instanceMode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputs
     */
    public Outputs getOutputs() {
        return this.outputs;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return rerunInterval
     */
    public Integer getRerunInterval() {
        return this.rerunInterval;
    }

    /**
     * @return rerunMode
     */
    public String getRerunMode() {
        return this.rerunMode;
    }

    /**
     * @return rerunTimes
     */
    public Integer getRerunTimes() {
        return this.rerunTimes;
    }

    /**
     * @return runtimeResource
     */
    public RuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    /**
     * @return script
     */
    public Script getScript() {
        return this.script;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return trigger
     */
    public Trigger getTrigger() {
        return this.trigger;
    }

    public static final class Builder extends Request.Builder<UpdateTaskRequest, Builder> {
        private String regionId; 
        private String clientUniqueCode; 
        private DataSource dataSource; 
        private java.util.List<Dependencies> dependencies; 
        private String description; 
        private String envType; 
        private Long id; 
        private Inputs inputs; 
        private String instanceMode; 
        private String name; 
        private Outputs outputs; 
        private String owner; 
        private Integer rerunInterval; 
        private String rerunMode; 
        private Integer rerunTimes; 
        private RuntimeResource runtimeResource; 
        private Script script; 
        private java.util.List<Tags> tags; 
        private Integer timeout; 
        private Trigger trigger; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientUniqueCode = request.clientUniqueCode;
            this.dataSource = request.dataSource;
            this.dependencies = request.dependencies;
            this.description = request.description;
            this.envType = request.envType;
            this.id = request.id;
            this.inputs = request.inputs;
            this.instanceMode = request.instanceMode;
            this.name = request.name;
            this.outputs = request.outputs;
            this.owner = request.owner;
            this.rerunInterval = request.rerunInterval;
            this.rerunMode = request.rerunMode;
            this.rerunTimes = request.rerunTimes;
            this.runtimeResource = request.runtimeResource;
            this.script = request.script;
            this.tags = request.tags;
            this.timeout = request.timeout;
            this.trigger = request.trigger;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientUniqueCode.
         */
        public Builder clientUniqueCode(String clientUniqueCode) {
            this.putBodyParameter("ClientUniqueCode", clientUniqueCode);
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }

        /**
         * DataSource.
         */
        public Builder dataSource(DataSource dataSource) {
            String dataSourceShrink = shrink(dataSource, "DataSource", "json");
            this.putBodyParameter("DataSource", dataSourceShrink);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * Dependencies.
         */
        public Builder dependencies(java.util.List<Dependencies> dependencies) {
            String dependenciesShrink = shrink(dependencies, "Dependencies", "json");
            this.putBodyParameter("Dependencies", dependenciesShrink);
            this.dependencies = dependencies;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Inputs.
         */
        public Builder inputs(Inputs inputs) {
            String inputsShrink = shrink(inputs, "Inputs", "json");
            this.putBodyParameter("Inputs", inputsShrink);
            this.inputs = inputs;
            return this;
        }

        /**
         * InstanceMode.
         */
        public Builder instanceMode(String instanceMode) {
            this.putBodyParameter("InstanceMode", instanceMode);
            this.instanceMode = instanceMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Outputs.
         */
        public Builder outputs(Outputs outputs) {
            String outputsShrink = shrink(outputs, "Outputs", "json");
            this.putBodyParameter("Outputs", outputsShrink);
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * RerunInterval.
         */
        public Builder rerunInterval(Integer rerunInterval) {
            this.putBodyParameter("RerunInterval", rerunInterval);
            this.rerunInterval = rerunInterval;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        public Builder rerunMode(String rerunMode) {
            this.putBodyParameter("RerunMode", rerunMode);
            this.rerunMode = rerunMode;
            return this;
        }

        /**
         * RerunTimes.
         */
        public Builder rerunTimes(Integer rerunTimes) {
            this.putBodyParameter("RerunTimes", rerunTimes);
            this.rerunTimes = rerunTimes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder runtimeResource(RuntimeResource runtimeResource) {
            String runtimeResourceShrink = shrink(runtimeResource, "RuntimeResource", "json");
            this.putBodyParameter("RuntimeResource", runtimeResourceShrink);
            this.runtimeResource = runtimeResource;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(Script script) {
            String scriptShrink = shrink(script, "Script", "json");
            this.putBodyParameter("Script", scriptShrink);
            this.script = script;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder trigger(Trigger trigger) {
            String triggerShrink = shrink(trigger, "Trigger", "json");
            this.putBodyParameter("Trigger", triggerShrink);
            this.trigger = trigger;
            return this;
        }

        @Override
        public UpdateTaskRequest build() {
            return new UpdateTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DataSource(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
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

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class Dependencies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpstreamOutput")
        private String upstreamOutput;

        @com.aliyun.core.annotation.NameInMap("UpstreamTaskId")
        private Long upstreamTaskId;

        private Dependencies(Builder builder) {
            this.type = builder.type;
            this.upstreamOutput = builder.upstreamOutput;
            this.upstreamTaskId = builder.upstreamTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dependencies create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return upstreamOutput
         */
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        /**
         * @return upstreamTaskId
         */
        public Long getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

        public static final class Builder {
            private String type; 
            private String upstreamOutput; 
            private Long upstreamTaskId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpstreamOutput.
             */
            public Builder upstreamOutput(String upstreamOutput) {
                this.upstreamOutput = upstreamOutput;
                return this;
            }

            /**
             * UpstreamTaskId.
             */
            public Builder upstreamTaskId(Long upstreamTaskId) {
                this.upstreamTaskId = upstreamTaskId;
                return this;
            }

            public Dependencies build() {
                return new Dependencies(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Variables(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
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
            private String name; 
            private String type; 
            private String value; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Constant</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<Variables> variables;

        private Inputs(Builder builder) {
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<Variables> variables; 

            /**
             * Variables.
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class TaskOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private TaskOutputs(Builder builder) {
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskOutputs create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String output; 

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public TaskOutputs build() {
                return new TaskOutputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class OutputsVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OutputsVariables(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputsVariables create() {
            return builder().build();
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
            private String name; 
            private String type; 
            private String value; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Constant</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OutputsVariables build() {
                return new OutputsVariables(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskOutputs")
        private java.util.List<TaskOutputs> taskOutputs;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<OutputsVariables> variables;

        private Outputs(Builder builder) {
            this.taskOutputs = builder.taskOutputs;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return taskOutputs
         */
        public java.util.List<TaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        /**
         * @return variables
         */
        public java.util.List<OutputsVariables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<TaskOutputs> taskOutputs; 
            private java.util.List<OutputsVariables> variables; 

            /**
             * TaskOutputs.
             */
            public Builder taskOutputs(java.util.List<TaskOutputs> taskOutputs) {
                this.taskOutputs = taskOutputs;
                return this;
            }

            /**
             * Variables.
             */
            public Builder variables(java.util.List<OutputsVariables> variables) {
                this.variables = variables;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceGroupId;

        private RuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.image = builder.image;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeResource create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String cu; 
            private String image; 
            private String resourceGroupId; 

            /**
             * Cu.
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public RuntimeResource build() {
                return new RuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class Script extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        private Script(Builder builder) {
            this.content = builder.content;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String content; 
            private String parameters; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link UpdateTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskRequest</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Recurrence")
        private String recurrence;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Trigger(Builder builder) {
            this.cron = builder.cron;
            this.endTime = builder.endTime;
            this.recurrence = builder.recurrence;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return recurrence
         */
        public String getRecurrence() {
            return this.recurrence;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cron; 
            private String endTime; 
            private String recurrence; 
            private String startTime; 
            private String type; 

            /**
             * Cron.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Recurrence.
             */
            public Builder recurrence(String recurrence) {
                this.recurrence = recurrence;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
}
