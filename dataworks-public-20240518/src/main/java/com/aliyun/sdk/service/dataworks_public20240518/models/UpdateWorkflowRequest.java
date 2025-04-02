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
 * {@link UpdateWorkflowRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkflowRequest</p>
 */
public class UpdateWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientUniqueCode")
    private String clientUniqueCode;

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
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Trigger")
    @com.aliyun.core.annotation.Validation(required = true)
    private Trigger trigger;

    private UpdateWorkflowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientUniqueCode = builder.clientUniqueCode;
        this.dependencies = builder.dependencies;
        this.description = builder.description;
        this.envType = builder.envType;
        this.id = builder.id;
        this.name = builder.name;
        this.outputs = builder.outputs;
        this.owner = builder.owner;
        this.parameters = builder.parameters;
        this.tags = builder.tags;
        this.tasks = builder.tasks;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowRequest create() {
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
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return trigger
     */
    public Trigger getTrigger() {
        return this.trigger;
    }

    public static final class Builder extends Request.Builder<UpdateWorkflowRequest, Builder> {
        private String regionId; 
        private String clientUniqueCode; 
        private java.util.List<Dependencies> dependencies; 
        private String description; 
        private String envType; 
        private Long id; 
        private String name; 
        private Outputs outputs; 
        private String owner; 
        private String parameters; 
        private java.util.List<Tags> tags; 
        private java.util.List<Tasks> tasks; 
        private Trigger trigger; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientUniqueCode = request.clientUniqueCode;
            this.dependencies = request.dependencies;
            this.description = request.description;
            this.envType = request.envType;
            this.id = request.id;
            this.name = request.name;
            this.outputs = request.outputs;
            this.owner = request.owner;
            this.parameters = request.parameters;
            this.tags = request.tags;
            this.tasks = request.tasks;
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
         * <p>The unique code of the client. This parameter is used to create a workflow asynchronously and implement the idempotence of the workflow. If you do not specify this parameter when you create the workflow, the system automatically generates a unique code. The unique code is uniquely associated with the workflow ID. If you specify this parameter when you update or delete the workflow, the value of this parameter must be the unique code that is used to create the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
         */
        public Builder clientUniqueCode(String clientUniqueCode) {
            this.putBodyParameter("ClientUniqueCode", clientUniqueCode);
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }

        /**
         * <p>The dependency information.</p>
         */
        public Builder dependencies(java.util.List<Dependencies> dependencies) {
            String dependenciesShrink = shrink(dependencies, "Dependencies", "json");
            this.putBodyParameter("Dependencies", dependenciesShrink);
            this.dependencies = dependencies;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The workflow ID.</p>
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
         * <p>The name of the workflow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>My Workflow</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The output information.</p>
         */
        public Builder outputs(Outputs outputs) {
            String outputsShrink = shrink(outputs, "Outputs", "json");
            this.putBodyParameter("Outputs", outputsShrink);
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>The account ID of the owner.</p>
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
         * <p>The parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate para2=$[yyyymmdd]</p>
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            String tasksShrink = shrink(tasks, "Tasks", "json");
            this.putBodyParameter("Tasks", tasksShrink);
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The trigger method.</p>
         * <p>This parameter is required.</p>
         */
        public Builder trigger(Trigger trigger) {
            String triggerShrink = shrink(trigger, "Trigger", "json");
            this.putBodyParameter("Trigger", triggerShrink);
            this.trigger = trigger;
            return this;
        }

        @Override
        public UpdateWorkflowRequest build() {
            return new UpdateWorkflowRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(Dependencies model) {
                this.type = model.type;
                this.upstreamOutput = model.upstreamOutput;
                this.upstreamTaskId = model.upstreamTaskId;
            } 

            /**
             * <p>The dependency type. Valid values:</p>
             * <ul>
             * <li>CrossCycleDependsOnChildren: cross-cycle dependency on level-1 descendant nodes</li>
             * <li>CrossCycleDependsOnSelf: cross-cycle dependency on the current node</li>
             * <li>CrossCycleDependsOnOtherNode: cross-cycle dependency on other nodes</li>
             * <li>Normal: same-cycle scheduling dependency</li>
             * </ul>
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
             * <p>The identifier of the output of the ancestor task. This parameter is returned only if <code>same-cycle scheduling dependencies</code> and the node input are configured.</p>
             * 
             * <strong>example:</strong>
             * <p>pre.odps_sql_demo_0</p>
             */
            public Builder upstreamOutput(String upstreamOutput) {
                this.upstreamOutput = upstreamOutput;
                return this;
            }

            /**
             * <p>The ancestor task ID. This parameter is returned only if <code>cross-cycle scheduling dependencies</code> or <code>same-cycle scheduling dependencies</code> and the node input are not configured.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(TaskOutputs model) {
                this.output = model.output;
            } 

            /**
             * <p>The identifier of the output.</p>
             * 
             * <strong>example:</strong>
             * <p>pre.odps_sql_demo_0</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskOutputs")
        private java.util.List<TaskOutputs> taskOutputs;

        private Outputs(Builder builder) {
            this.taskOutputs = builder.taskOutputs;
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

        public static final class Builder {
            private java.util.List<TaskOutputs> taskOutputs; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.taskOutputs = model.taskOutputs;
            } 

            /**
             * <p>The task outputs.</p>
             */
            public Builder taskOutputs(java.util.List<TaskOutputs> taskOutputs) {
                this.taskOutputs = taskOutputs;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
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
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_test</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
     */
    public static class TasksDependencies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpstreamOutput")
        private String upstreamOutput;

        @com.aliyun.core.annotation.NameInMap("UpstreamTaskId")
        private Long upstreamTaskId;

        private TasksDependencies(Builder builder) {
            this.type = builder.type;
            this.upstreamOutput = builder.upstreamOutput;
            this.upstreamTaskId = builder.upstreamTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksDependencies create() {
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

            private Builder() {
            } 

            private Builder(TasksDependencies model) {
                this.type = model.type;
                this.upstreamOutput = model.upstreamOutput;
                this.upstreamTaskId = model.upstreamTaskId;
            } 

            /**
             * <p>The dependency type. Valid values:</p>
             * <ul>
             * <li>CrossCycleDependsOnChildren: cross-cycle dependency on level-1 descendant nodes</li>
             * <li>CrossCycleDependsOnSelf: cross-cycle dependency on the current node</li>
             * <li>CrossCycleDependsOnOtherNode: cross-cycle dependency on other nodes</li>
             * <li>Normal: same-cycle scheduling dependency</li>
             * </ul>
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
             * <p>The identifier of the output of the ancestor task. This parameter is returned only if <code>same-cycle scheduling dependencies</code> and the node input are configured.</p>
             * 
             * <strong>example:</strong>
             * <p>pre.odps_sql_demo_0</p>
             */
            public Builder upstreamOutput(String upstreamOutput) {
                this.upstreamOutput = upstreamOutput;
                return this;
            }

            /**
             * <p>The ancestor task ID. This parameter is returned only if <code>cross-cycle scheduling dependencies</code> or <code>same-cycle scheduling dependencies</code> and the node input are not configured.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder upstreamTaskId(Long upstreamTaskId) {
                this.upstreamTaskId = upstreamTaskId;
                return this;
            }

            public TasksDependencies build() {
                return new TasksDependencies(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(Variables model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The name of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type. Valid values:</p>
             * <ul>
             * <li>Constant: constant</li>
             * <li>PassThrough: node output</li>
             * <li>System: variable</li>
             * <li>NodeOutput: script output</li>
             * </ul>
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
             * <p>The value of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(Inputs model) {
                this.variables = model.variables;
            } 

            /**
             * <p>The variables.</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
     */
    public static class OutputsTaskOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private OutputsTaskOutputs(Builder builder) {
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputsTaskOutputs create() {
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

            private Builder() {
            } 

            private Builder(OutputsTaskOutputs model) {
                this.output = model.output;
            } 

            /**
             * <p>The identifier of the output.</p>
             * 
             * <strong>example:</strong>
             * <p>pre.odps_sql_demo_0</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public OutputsTaskOutputs build() {
                return new OutputsTaskOutputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(OutputsVariables model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The name of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type. Valid values:</p>
             * <ul>
             * <li>Constant: constant</li>
             * <li>PassThrough: node output</li>
             * <li>System: variable</li>
             * <li>NodeOutput: script output</li>
             * </ul>
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
             * <p>The value of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
     */
    public static class TasksOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskOutputs")
        private java.util.List<OutputsTaskOutputs> taskOutputs;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<OutputsVariables> variables;

        private TasksOutputs(Builder builder) {
            this.taskOutputs = builder.taskOutputs;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksOutputs create() {
            return builder().build();
        }

        /**
         * @return taskOutputs
         */
        public java.util.List<OutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        /**
         * @return variables
         */
        public java.util.List<OutputsVariables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<OutputsTaskOutputs> taskOutputs; 
            private java.util.List<OutputsVariables> variables; 

            private Builder() {
            } 

            private Builder(TasksOutputs model) {
                this.taskOutputs = model.taskOutputs;
                this.variables = model.variables;
            } 

            /**
             * <p>The task outputs.</p>
             */
            public Builder taskOutputs(java.util.List<OutputsTaskOutputs> taskOutputs) {
                this.taskOutputs = taskOutputs;
                return this;
            }

            /**
             * <p>The variables.</p>
             */
            public Builder variables(java.util.List<OutputsVariables> variables) {
                this.variables = variables;
                return this;
            }

            public TasksOutputs build() {
                return new TasksOutputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(RuntimeResource model) {
                this.cu = model.cu;
                this.image = model.image;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The default number of compute units (CUs) configured for task running.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The ID of the image configured for task running.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The ID of the resource group for scheduling configured for task running.</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
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

            private Builder() {
            } 

            private Builder(Script model) {
                this.content = model.content;
                this.parameters = model.parameters;
            } 

            /**
             * <p>The script content.</p>
             * 
             * <strong>example:</strong>
             * <p>echo &quot;helloWorld&quot;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The script parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>para1=$bizdate</p>
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
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
     */
    public static class TasksTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TasksTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksTags create() {
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

            private Builder(TasksTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
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
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TasksTags build() {
                return new TasksTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
     */
    public static class TasksTrigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Recurrence")
        @com.aliyun.core.annotation.Validation(required = true)
        private String recurrence;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TasksTrigger(Builder builder) {
            this.recurrence = builder.recurrence;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksTrigger create() {
            return builder().build();
        }

        /**
         * @return recurrence
         */
        public String getRecurrence() {
            return this.recurrence;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String recurrence; 
            private String type; 

            private Builder() {
            } 

            private Builder(TasksTrigger model) {
                this.recurrence = model.recurrence;
                this.type = model.type;
            } 

            /**
             * <p>The running mode of the task after it is triggered. This parameter takes effect only if the Type parameter is set to Scheduler. Valid values:</p>
             * <ul>
             * <li>Pause</li>
             * <li>Skip</li>
             * <li>Normal</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder recurrence(String recurrence) {
                this.recurrence = recurrence;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:</p>
             * <ul>
             * <li>Scheduler: scheduling cycle-based trigger</li>
             * <li>Manual: manual trigger</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TasksTrigger build() {
                return new TasksTrigger(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseLineId")
        private Long baseLineId;

        @com.aliyun.core.annotation.NameInMap("ClientUniqueCode")
        private String clientUniqueCode;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Dependencies")
        private java.util.List<TasksDependencies> dependencies;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private Inputs inputs;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private TasksOutputs outputs;

        @com.aliyun.core.annotation.NameInMap("Owner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RerunInterval")
        private Integer rerunInterval;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("RerunTimes")
        private Integer rerunTimes;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        @com.aliyun.core.annotation.Validation(required = true)
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<TasksTags> tags;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        @com.aliyun.core.annotation.Validation(required = true)
        private TasksTrigger trigger;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Tasks(Builder builder) {
            this.baseLineId = builder.baseLineId;
            this.clientUniqueCode = builder.clientUniqueCode;
            this.dataSource = builder.dataSource;
            this.dependencies = builder.dependencies;
            this.description = builder.description;
            this.envType = builder.envType;
            this.id = builder.id;
            this.inputs = builder.inputs;
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
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return baseLineId
         */
        public Long getBaseLineId() {
            return this.baseLineId;
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
        public java.util.List<TasksDependencies> getDependencies() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputs
         */
        public TasksOutputs getOutputs() {
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
        public java.util.List<TasksTags> getTags() {
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
        public TasksTrigger getTrigger() {
            return this.trigger;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long baseLineId; 
            private String clientUniqueCode; 
            private DataSource dataSource; 
            private java.util.List<TasksDependencies> dependencies; 
            private String description; 
            private String envType; 
            private Long id; 
            private Inputs inputs; 
            private String name; 
            private TasksOutputs outputs; 
            private String owner; 
            private Integer rerunInterval; 
            private String rerunMode; 
            private Integer rerunTimes; 
            private RuntimeResource runtimeResource; 
            private Script script; 
            private java.util.List<TasksTags> tags; 
            private Integer timeout; 
            private TasksTrigger trigger; 
            private String type; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.baseLineId = model.baseLineId;
                this.clientUniqueCode = model.clientUniqueCode;
                this.dataSource = model.dataSource;
                this.dependencies = model.dependencies;
                this.description = model.description;
                this.envType = model.envType;
                this.id = model.id;
                this.inputs = model.inputs;
                this.name = model.name;
                this.outputs = model.outputs;
                this.owner = model.owner;
                this.rerunInterval = model.rerunInterval;
                this.rerunMode = model.rerunMode;
                this.rerunTimes = model.rerunTimes;
                this.runtimeResource = model.runtimeResource;
                this.script = model.script;
                this.tags = model.tags;
                this.timeout = model.timeout;
                this.trigger = model.trigger;
                this.type = model.type;
            } 

            /**
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baseLineId(Long baseLineId) {
                this.baseLineId = baseLineId;
                return this;
            }

            /**
             * <p>The unique code of the client. This parameter is used to create a task asynchronously and implement the idempotence of the task. If you do not specify this parameter when you create the task, the system automatically generates a unique code. The unique code is uniquely associated with the task ID. If you specify this parameter when you update or delete the task, the value of this parameter must be the unique code that is used to create the task.</p>
             * 
             * <strong>example:</strong>
             * <p>Task_0bc5213917368545132902xxxxxxxx</p>
             */
            public Builder clientUniqueCode(String clientUniqueCode) {
                this.clientUniqueCode = clientUniqueCode;
                return this;
            }

            /**
             * <p>The information about the associated data source.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The dependency information.</p>
             */
            public Builder dependencies(java.util.List<TasksDependencies> dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment of the workspace. Valid values:</p>
             * <ul>
             * <li>Prod</li>
             * <li>Dev</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The task ID. If you configure this parameter, full update is performed on the task. If you do not configure this parameter, another task is created.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The input information.</p>
             */
            public Builder inputs(Inputs inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL node</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output information.</p>
             */
            public Builder outputs(TasksOutputs outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The account ID of the owner.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The rerun interval. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rerunInterval(Integer rerunInterval) {
                this.rerunInterval = rerunInterval;
                return this;
            }

            /**
             * <p>The rerun mode. Valid values:</p>
             * <ul>
             * <li>AllDenied: The task cannot be rerun regardless of whether the task is successfully run or fails to run.</li>
             * <li>FailureAllowed: The task can be rerun only after it fails to run.</li>
             * <li>AllAllowed: The task can be rerun regardless of whether the task is successfully run or fails to run.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AllAllowed</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The number of times that the task is rerun. This parameter takes effect only if the RerunMode parameter is set to AllAllowed or FailureAllowed.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder rerunTimes(Integer rerunTimes) {
                this.rerunTimes = rerunTimes;
                return this;
            }

            /**
             * <p>The configurations of the runtime environment, such as the resource group information.</p>
             * <p>This parameter is required.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The script information.</p>
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<TasksTags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The timeout period of task running. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The trigger method.</p>
             * <p>This parameter is required.</p>
             */
            public Builder trigger(TasksTrigger trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The type of the task.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowRequest</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Trigger(Builder builder) {
            this.cron = builder.cron;
            this.endTime = builder.endTime;
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
            private String startTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(Trigger model) {
                this.cron = model.cron;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.type = model.type;
            } 

            /**
             * <p>The CRON expression. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>00 00 00 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The end time of the time range during which the workflow is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler. The value of this parameter is in the <code>yyyy-mm-dd hh:mm:ss</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>9999-01-01 00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the time range during which the workflow is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler. The value of this parameter is in the <code>yyyy-mm-dd hh:mm:ss</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>1970-01-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:</p>
             * <ul>
             * <li>Scheduler: scheduling cycle-based trigger</li>
             * <li>Manual: manual trigger</li>
             * </ul>
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
