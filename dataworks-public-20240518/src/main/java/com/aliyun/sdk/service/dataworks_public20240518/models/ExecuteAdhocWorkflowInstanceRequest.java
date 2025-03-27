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
 * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link RequestModel}
 *
 * <p>ExecuteAdhocWorkflowInstanceRequest</p>
 */
public class ExecuteAdhocWorkflowInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizDate")
    private Long bizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tasks> tasks;

    private ExecuteAdhocWorkflowInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizDate = builder.bizDate;
        this.envType = builder.envType;
        this.name = builder.name;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAdhocWorkflowInstanceRequest create() {
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
     * @return bizDate
     */
    public Long getBizDate() {
        return this.bizDate;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder extends Request.Builder<ExecuteAdhocWorkflowInstanceRequest, Builder> {
        private String regionId; 
        private Long bizDate; 
        private String envType; 
        private String name; 
        private String owner; 
        private Long projectId; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteAdhocWorkflowInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizDate = request.bizDate;
            this.envType = request.envType;
            this.name = request.name;
            this.owner = request.owner;
            this.projectId = request.projectId;
            this.tasks = request.tasks;
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
         * <p>The data timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder bizDate(Long bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
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
         * <p>The name of the workflow instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkflowInstance1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The tasks.</p>
         * <p>This parameter is required.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            String tasksShrink = shrink(tasks, "Tasks", "json");
            this.putBodyParameter("Tasks", tasksShrink);
            this.tasks = tasks;
            return this;
        }

        @Override
        public ExecuteAdhocWorkflowInstanceRequest build() {
            return new ExecuteAdhocWorkflowInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
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
             * <p>mysql_test</p>
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
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
     */
    public static class Dependencies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UpstreamOutput")
        private String upstreamOutput;

        private Dependencies(Builder builder) {
            this.upstreamOutput = builder.upstreamOutput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dependencies create() {
            return builder().build();
        }

        /**
         * @return upstreamOutput
         */
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public static final class Builder {
            private String upstreamOutput; 

            private Builder() {
            } 

            private Builder(Dependencies model) {
                this.upstreamOutput = model.upstreamOutput;
            } 

            /**
             * <p>The identifier of the output of the ancestor task.</p>
             * 
             * <strong>example:</strong>
             * <p>pre.odps_sql_demo_0</p>
             */
            public Builder upstreamOutput(String upstreamOutput) {
                this.upstreamOutput = upstreamOutput;
                return this;
            }

            public Dependencies build() {
                return new Dependencies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Variables(Builder builder) {
            this.name = builder.name;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.name = model.name;
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
             * <p>The value of the variable. You must configure this parameter in the <code>The ancestor output: The output variable name of the ancestor task</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>Value1</p>
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
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
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
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
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
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
     */
    public static class OutputsVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <li>System</li>
             * <li>Constant</li>
             * <li>NodeOutput</li>
             * <li>PassThrough</li>
             * </ul>
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
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
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

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.taskOutputs = model.taskOutputs;
                this.variables = model.variables;
            } 

            /**
             * <p>The task outputs.</p>
             */
            public Builder taskOutputs(java.util.List<TaskOutputs> taskOutputs) {
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

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
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
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
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
     * {@link ExecuteAdhocWorkflowInstanceRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdhocWorkflowInstanceRequest</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientUniqueCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clientUniqueCode;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Dependencies")
        private java.util.List<Dependencies> dependencies;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private Inputs inputs;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private Outputs outputs;

        @com.aliyun.core.annotation.NameInMap("Owner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        @com.aliyun.core.annotation.Validation(required = true)
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Tasks(Builder builder) {
            this.clientUniqueCode = builder.clientUniqueCode;
            this.dataSource = builder.dataSource;
            this.dependencies = builder.dependencies;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outputs = builder.outputs;
            this.owner = builder.owner;
            this.runtimeResource = builder.runtimeResource;
            this.script = builder.script;
            this.timeout = builder.timeout;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
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
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clientUniqueCode; 
            private DataSource dataSource; 
            private java.util.List<Dependencies> dependencies; 
            private Inputs inputs; 
            private String name; 
            private Outputs outputs; 
            private String owner; 
            private RuntimeResource runtimeResource; 
            private Script script; 
            private Integer timeout; 
            private String type; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.clientUniqueCode = model.clientUniqueCode;
                this.dataSource = model.dataSource;
                this.dependencies = model.dependencies;
                this.inputs = model.inputs;
                this.name = model.name;
                this.outputs = model.outputs;
                this.owner = model.owner;
                this.runtimeResource = model.runtimeResource;
                this.script = model.script;
                this.timeout = model.timeout;
                this.type = model.type;
            } 

            /**
             * <p>The unique code of the client. This code uniquely identifies a task.</p>
             * <p>This parameter is required.</p>
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
            public Builder dependencies(java.util.List<Dependencies> dependencies) {
                this.dependencies = dependencies;
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
             * <p>SQL node.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output information.</p>
             */
            public Builder outputs(Outputs outputs) {
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
}
