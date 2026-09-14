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
 * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskInstanceResponseBody</p>
 */
public class GetTaskInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskInstance")
    private TaskInstance taskInstance;

    private GetTaskInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskInstance = builder.taskInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskInstance
     */
    public TaskInstance getTaskInstance() {
        return this.taskInstance;
    }

    public static final class Builder {
        private String requestId; 
        private TaskInstance taskInstance; 

        private Builder() {
        } 

        private Builder(GetTaskInstanceResponseBody model) {
            this.requestId = model.requestId;
            this.taskInstance = model.taskInstance;
        } 

        /**
         * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detailed information about the task instance.</p>
         */
        public Builder taskInstance(TaskInstance taskInstance) {
            this.taskInstance = taskInstance;
            return this;
        }

        public GetTaskInstanceResponseBody build() {
            return new GetTaskInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
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
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>Key1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type. Valid values:</p>
             * <ul>
             * <li>Constant: constant.</li>
             * <li>PassThrough: output of a parameter node.</li>
             * <li>System: variable.</li>
             * <li>NodeOutput: script output.</li>
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
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
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
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
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
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
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
             * <li>Constant: constant.</li>
             * <li>PassThrough: output of a parameter node.</li>
             * <li>System: variable.</li>
             * <li>NodeOutput: script output.</li>
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
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
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
             * <p>The list of task output definitions.</p>
             */
            public Builder taskOutputs(java.util.List<TaskOutputs> taskOutputs) {
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

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        private Runtime(Builder builder) {
            this.gateway = builder.gateway;
            this.processId = builder.processId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        public static final class Builder {
            private String gateway; 
            private String processId; 

            private Builder() {
            } 

            private Builder(Runtime model) {
                this.gateway = model.gateway;
                this.processId = model.processId;
            } 

            /**
             * <p>The machine on which the task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai.1.2</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The unique ID of the run.</p>
             * 
             * <strong>example:</strong>
             * <p>T3_123</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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
             * <p>The compute unit (CU) consumption configured for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The image ID configured for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The identifier of the schedule resource group configured for the task.</p>
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
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
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
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
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
             * <p>The label key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The label value.</p>
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
     * {@link GetTaskInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInstanceResponseBody</p>
     */
    public static class TaskInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private Inputs inputs;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private Outputs outputs;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PeriodNumber")
        private Integer periodNumber;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectEnv")
        private String projectEnv;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("RunNumber")
        private Integer runNumber;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private Runtime runtime;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private Long startedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("TriggerRecurrence")
        private String triggerRecurrence;

        @com.aliyun.core.annotation.NameInMap("TriggerTime")
        private Long triggerTime;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("UnifiedWorkflowInstanceId")
        private Long unifiedWorkflowInstanceId;

        @com.aliyun.core.annotation.NameInMap("WaitingResourceTime")
        private Long waitingResourceTime;

        @com.aliyun.core.annotation.NameInMap("WaitingTriggerTime")
        private Long waitingTriggerTime;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
        private Long workflowInstanceId;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceType")
        private String workflowInstanceType;

        @com.aliyun.core.annotation.NameInMap("WorkflowName")
        private String workflowName;

        private TaskInstance(Builder builder) {
            this.baselineId = builder.baselineId;
            this.bizdate = builder.bizdate;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dataSource = builder.dataSource;
            this.description = builder.description;
            this.finishedTime = builder.finishedTime;
            this.id = builder.id;
            this.inputs = builder.inputs;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.operationType = builder.operationType;
            this.outputs = builder.outputs;
            this.owner = builder.owner;
            this.periodNumber = builder.periodNumber;
            this.priority = builder.priority;
            this.projectEnv = builder.projectEnv;
            this.projectId = builder.projectId;
            this.rerunMode = builder.rerunMode;
            this.runNumber = builder.runNumber;
            this.runtime = builder.runtime;
            this.runtimeResource = builder.runtimeResource;
            this.script = builder.script;
            this.startedTime = builder.startedTime;
            this.status = builder.status;
            this.tags = builder.tags;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.timeout = builder.timeout;
            this.triggerRecurrence = builder.triggerRecurrence;
            this.triggerTime = builder.triggerTime;
            this.triggerType = builder.triggerType;
            this.unifiedWorkflowInstanceId = builder.unifiedWorkflowInstanceId;
            this.waitingResourceTime = builder.waitingResourceTime;
            this.waitingTriggerTime = builder.waitingTriggerTime;
            this.workflowId = builder.workflowId;
            this.workflowInstanceId = builder.workflowInstanceId;
            this.workflowInstanceType = builder.workflowInstanceType;
            this.workflowName = builder.workflowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstance create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
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
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
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
         * @return periodNumber
         */
        public Integer getPeriodNumber() {
            return this.periodNumber;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectEnv
         */
        public String getProjectEnv() {
            return this.projectEnv;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return rerunMode
         */
        public String getRerunMode() {
            return this.rerunMode;
        }

        /**
         * @return runNumber
         */
        public Integer getRunNumber() {
            return this.runNumber;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
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
         * @return startedTime
         */
        public Long getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return triggerRecurrence
         */
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        /**
         * @return triggerTime
         */
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return unifiedWorkflowInstanceId
         */
        public Long getUnifiedWorkflowInstanceId() {
            return this.unifiedWorkflowInstanceId;
        }

        /**
         * @return waitingResourceTime
         */
        public Long getWaitingResourceTime() {
            return this.waitingResourceTime;
        }

        /**
         * @return waitingTriggerTime
         */
        public Long getWaitingTriggerTime() {
            return this.waitingTriggerTime;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowInstanceId
         */
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        /**
         * @return workflowInstanceType
         */
        public String getWorkflowInstanceType() {
            return this.workflowInstanceType;
        }

        /**
         * @return workflowName
         */
        public String getWorkflowName() {
            return this.workflowName;
        }

        public static final class Builder {
            private Long baselineId; 
            private Long bizdate; 
            private Long createTime; 
            private String createUser; 
            private DataSource dataSource; 
            private String description; 
            private Long finishedTime; 
            private Long id; 
            private Inputs inputs; 
            private Long modifyTime; 
            private String modifyUser; 
            private String operationType; 
            private Outputs outputs; 
            private String owner; 
            private Integer periodNumber; 
            private Integer priority; 
            private String projectEnv; 
            private Long projectId; 
            private String rerunMode; 
            private Integer runNumber; 
            private Runtime runtime; 
            private RuntimeResource runtimeResource; 
            private Script script; 
            private Long startedTime; 
            private String status; 
            private java.util.List<Tags> tags; 
            private Long taskId; 
            private String taskName; 
            private String taskType; 
            private Integer timeout; 
            private String triggerRecurrence; 
            private Long triggerTime; 
            private String triggerType; 
            private Long unifiedWorkflowInstanceId; 
            private Long waitingResourceTime; 
            private Long waitingTriggerTime; 
            private Long workflowId; 
            private Long workflowInstanceId; 
            private String workflowInstanceType; 
            private String workflowName; 

            private Builder() {
            } 

            private Builder(TaskInstance model) {
                this.baselineId = model.baselineId;
                this.bizdate = model.bizdate;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.dataSource = model.dataSource;
                this.description = model.description;
                this.finishedTime = model.finishedTime;
                this.id = model.id;
                this.inputs = model.inputs;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.operationType = model.operationType;
                this.outputs = model.outputs;
                this.owner = model.owner;
                this.periodNumber = model.periodNumber;
                this.priority = model.priority;
                this.projectEnv = model.projectEnv;
                this.projectId = model.projectId;
                this.rerunMode = model.rerunMode;
                this.runNumber = model.runNumber;
                this.runtime = model.runtime;
                this.runtimeResource = model.runtimeResource;
                this.script = model.script;
                this.startedTime = model.startedTime;
                this.status = model.status;
                this.tags = model.tags;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
                this.timeout = model.timeout;
                this.triggerRecurrence = model.triggerRecurrence;
                this.triggerTime = model.triggerTime;
                this.triggerType = model.triggerType;
                this.unifiedWorkflowInstanceId = model.unifiedWorkflowInstanceId;
                this.waitingResourceTime = model.waitingResourceTime;
                this.waitingTriggerTime = model.waitingTriggerTime;
                this.workflowId = model.workflowId;
                this.workflowInstanceId = model.workflowInstanceId;
                this.workflowInstanceType = model.workflowInstanceType;
                this.workflowName = model.workflowName;
            } 

            /**
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The account ID of the user who created the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The data source information associated with the instance.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The unique identifier of the node instance.</p>
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
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The account ID of the user who modified the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The type of the most recent operation on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>TriggerDqc</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
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
             * <p>The account ID of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The period number. Indicates which scheduling cycle of the day the task instance is in.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodNumber(Integer periodNumber) {
                this.periodNumber = periodNumber;
                return this;
            }

            /**
             * <p>The running priority of the task. Minimum value: 1. Maximum value: 8. A larger value indicates a higher priority. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The project environment. Valid values:</p>
             * <ul>
             * <li>Prod: Production.</li>
             * <li>Dev: Development.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder projectEnv(String projectEnv) {
                this.projectEnv = projectEnv;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The rerun configuration of the task. Valid values:</p>
             * <ul>
             * <li>AllDenied: reruns are not allowed regardless of whether the task fails or succeeds.</li>
             * <li>AllAllowed: reruns are allowed regardless of whether the task fails or succeeds.</li>
             * <li>FailureAllowed: reruns are allowed only when the task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AllAllowed</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The current run number. The value starts from 1 by default.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runNumber(Integer runNumber) {
                this.runNumber = runNumber;
                return this;
            }

            /**
             * <p>The runtime information of the instance.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The resource group information associated with the instance.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The running script information.</p>
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The start time of the run.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The instance running status. Valid values:</p>
             * <ul>
             * <li>NotRun: Not run.</li>
             * <li>Running: Running.</li>
             * <li>WaitTime: Waiting for the TriggerTime to arrive.</li>
             * <li>CheckingCondition: Checking branch conditions.</li>
             * <li>WaitResource: Waiting for resources.</li>
             * <li>Failure: Execution failed.</li>
             * <li>Success: Execution succeeded.</li>
             * <li>Checking: Submitted for data quality check.</li>
             * <li>WaitTrigger: Waiting for an external trigger. Trigger-based nodes enter this status after the waiting time elapses.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of node tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the corresponding task.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the corresponding task.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL node</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the corresponding task.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The timeout period for task execution. Unit: seconds.</p>
             * <p>Note: The scheduling system rounds the configured value to the nearest hour.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The running mode when triggered. This parameter takes effect when TriggerType is set to Scheduler. Valid values:</p>
             * <ul>
             * <li>Normal: a normal scheduled task that is scheduled on a regular basis.</li>
             * <li>Manual: a manual task that is not scheduled on a regular basis.</li>
             * <li>Pause: a paused task that is scheduled on a regular basis but is set to failed when scheduling starts.</li>
             * <li>Skip: a dry-run task that is scheduled on a regular basis but is set to succeeded when scheduling starts.</li>
             * <li>SkipUnchoose: a task that is not selected in a temporary workflow. This value exists only in temporary workflows. The task is set to succeeded when scheduling starts.</li>
             * <li>SkipCycle: a weekly or monthly task whose running cycle has not arrived. The task is scheduled on a regular basis but is set to succeeded when scheduling starts.</li>
             * <li>ConditionUnchoose: a downstream node that is not selected by an upstream branch (IF) node. The task directly becomes a dry run.</li>
             * <li>RealtimeDeprecated: an expired periodic instance generated in real time. The task is set to succeeded.</li>
             * <li>PauseCalendar: the instance is paused because a calendar is referenced.</li>
             * <li>SkipCalendar: the instance is a dry run because a calendar is referenced.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder triggerRecurrence(String triggerRecurrence) {
                this.triggerRecurrence = triggerRecurrence;
                return this;
            }

            /**
             * <p>The scheduled trigger time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder triggerTime(Long triggerTime) {
                this.triggerTime = triggerTime;
                return this;
            }

            /**
             * <p>The trigger type. You can obtain the trigger type from the Trigger.Type response parameter of the GetTask operation. Valid values:</p>
             * <ul>
             * <li>Scheduler: triggered by a scheduling cycle.</li>
             * <li>Manual: manually triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The unified workflow instance ID. All task instances within the same business date under a single trigger share the same value for this field.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder unifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
                this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
                return this;
            }

            /**
             * <p>The time when the instance entered the waiting-for-resource state.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder waitingResourceTime(Long waitingResourceTime) {
                this.waitingResourceTime = waitingResourceTime;
                return this;
            }

            /**
             * <p>The time when the instance entered the waiting-for-scheduled-time state.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder waitingTriggerTime(Long waitingTriggerTime) {
                this.waitingTriggerTime = waitingTriggerTime;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the task instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * <p>The ID of the workflow instance to which the task instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * <p>The type of the workflow instance to which the task instance belongs. Valid values:</p>
             * <ul>
             * <li>SmokeTest: test.</li>
             * <li>SupplementData: data backfill.</li>
             * <li>Manual: manual task.</li>
             * <li>ManualWorkflow: manual workflow.</li>
             * <li>Normal: periodic scheduling.</li>
             * <li>ManualFlow: manually executed business flow.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder workflowInstanceType(String workflowInstanceType) {
                this.workflowInstanceType = workflowInstanceType;
                return this;
            }

            /**
             * <p>The name of the workflow to which the task instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Test workflow</p>
             */
            public Builder workflowName(String workflowName) {
                this.workflowName = workflowName;
                return this;
            }

            public TaskInstance build() {
                return new TaskInstance(this);
            } 

        } 

    }
}
