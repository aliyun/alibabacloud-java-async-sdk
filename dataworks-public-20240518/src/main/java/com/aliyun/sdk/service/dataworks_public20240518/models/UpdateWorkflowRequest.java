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
         * <p>The client-side unique code of the workflow for asynchronous and idempotent implementation. If not specified during creation, the system will automatically generate the code, which will be uniquely bound to the resource ID. If you specify this parameter when updating and deleting resources, it should be consistent with the client unique code when creating resources.</p>
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
         * <p>Dependency information.</p>
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
         * <p>The project environment.</p>
         * <ul>
         * <li>Prod: Production</li>
         * <li>Dev: Development</li>
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
         * <p>The ID of the workflow.</p>
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
         * <p>The name.</p>
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
         * <p>The list of parameters.</p>
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
         * <p>The list of workflow tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The list of tasks.</p>
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

            /**
             * <p>The type of the dependency.</p>
             * <ul>
             * <li>CrossCycleDependsOnChildren: cross-cycle dependency level-1 child nodes</li>
             * <li>CrossCycleDependsOnSelf: cross-cycle dependency</li>
             * <li>CrossCycleDependsOnOtherNode: cross-cycle dependency on other nodes</li>
             * <li>Normal: same-cycle dependency</li>
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
             * <p>The output identifier of the upstream task. (This field is returned when <code>same cycle dependence</code> and input content is set)</p>
             * 
             * <strong>example:</strong>
             * <p>pre.odps_sql_demo_0</p>
             */
            public Builder upstreamOutput(String upstreamOutput) {
                this.upstreamOutput = upstreamOutput;
                return this;
            }

            /**
             * <p>The Id of the upstream task. (This field is returned when the input content is not set for <code>cross-cycle dependency other nodes</code> and <code>same-cycle dependency </code>, otherwise it is not returned)</p>
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

            /**
             * <p>The output identifier.</p>
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

            /**
             * <p>The list of workflow task output definitions.</p>
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
             * <p>The value of the tag.</p>
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

            /**
             * <p>The type of the dependency.</p>
             * <ul>
             * <li>CrossCycleDependsOnChildren: cross-cycle dependency level-1 child nodes</li>
             * <li>CrossCycleDependsOnSelf: cross-cycle dependency</li>
             * <li>CrossCycleDependsOnOtherNode: cross-cycle dependency on other nodes</li>
             * <li>Normal: same-cycle dependency</li>
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
             * <p>The output identifier of the upstream task. (This field is returned when the input content is set depending on the same cycle)</p>
             * 
             * <strong>example:</strong>
             * <p>pre.odps_sql_demo_0</p>
             */
            public Builder upstreamOutput(String upstreamOutput) {
                this.upstreamOutput = upstreamOutput;
                return this;
            }

            /**
             * <p>The Id of the upstream task. (This field is returned when the input content is not set for cross-cycle dependencies on other nodes and same-cycle dependencies.</p>
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
             * <p>Type.</p>
             * <ul>
             * <li>Constant: Constant</li>
             * <li>PassThrough: parameter node output</li>
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

            /**
             * <p>The list of variable definitions.</p>
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

            /**
             * <p>The output identifier.</p>
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
             * <p>Type.</p>
             * <ul>
             * <li>Constant: Constant</li>
             * <li>PassThrough: parameter node output</li>
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

            /**
             * <p>The list of task output definitions.</p>
             */
            public Builder taskOutputs(java.util.List<OutputsTaskOutputs> taskOutputs) {
                this.taskOutputs = taskOutputs;
                return this;
            }

            /**
             * <p>The list of variable definitions.</p>
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

            /**
             * <p>Configure CU consumption for task running.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The ID of the image configured for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The identifier of the scheduling resource group configured for running the task.</p>
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
             * <p>The list of script parameters.</p>
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
             * <p>The value of the tag.</p>
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

            /**
             * <p>The operation mode when the trigger is triggered. It takes effect when type = Scheduler.</p>
             * <ul>
             * <li>Pause: Pause</li>
             * <li>Skip: empty run</li>
             * <li>Normal: Normal operation</li>
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
             * <p>The type of the trigger method.</p>
             * <ul>
             * <li>Scheduler: the scheduling cycle is triggered.</li>
             * <li>Manual: manually triggered</li>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The client-side unique code of the task, which is used to implement asynchronous and idempotent functions. If not specified during creation, the system will automatically generate the code, which will be uniquely bound to the resource ID. If you specify this parameter when updating and deleting resources, it should be consistent with the client unique code when creating resources.</p>
             * 
             * <strong>example:</strong>
             * <p>Task_0bc5213917368545132902xxxxxxxx</p>
             */
            public Builder clientUniqueCode(String clientUniqueCode) {
                this.clientUniqueCode = clientUniqueCode;
                return this;
            }

            /**
             * <p>The associated data source information.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>Dependency information.</p>
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
             * <p>The project environment.</p>
             * <ul>
             * <li>Prod: Production</li>
             * <li>Dev: Development</li>
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
             * <p>The ID of the task. If you enter this field, a full update is performed on the corresponding task. If you do not enter this field, a new task is created.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Enter information.</p>
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
             * <p>The retry interval, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rerunInterval(Integer rerunInterval) {
                this.rerunInterval = rerunInterval;
                return this;
            }

            /**
             * <p>The configuration of whether the task is allowed to rerun.</p>
             * <ul>
             * <li>AllDenied (failure or success cannot be rerun)</li>
             * <li>FailureAllowed (only failures can be rerun)</li>
             * <li>AllAllowed (run again if failed or successful)</li>
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
             * <p>The number of retries that take effect when the task is set to rerun.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder rerunTimes(Integer rerunTimes) {
                this.rerunTimes = rerunTimes;
                return this;
            }

            /**
             * <p>Configuration of the runtime environment, such as resource group information.</p>
             * <p>This parameter is required.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>Run the script information.</p>
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The list of task tags.</p>
             */
            public Builder tags(java.util.List<TasksTags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The timeout period of the task execution, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The trigger method of the task.</p>
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

            /**
             * <p>Cron expression, which takes effect when type = Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>00 00 00 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The expiration time of the periodic trigger, which takes effect when type = Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>9999-01-01 00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the cycle trigger takes effect. It takes effect when type = Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>1970-01-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The type of the trigger method.</p>
             * <ul>
             * <li>Scheduler: the scheduling cycle is triggered.</li>
             * <li>Manual: manually triggered</li>
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
