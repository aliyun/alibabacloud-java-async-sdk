// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreatePipelineByAsyncRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineByAsyncRequest</p>
 */
public class CreatePipelineByAsyncRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Context")
    @com.aliyun.core.annotation.Validation(required = true)
    private Context context;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private CreatePipelineByAsyncRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineByAsyncRequest create() {
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
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<CreatePipelineByAsyncRequest, Builder> {
        private String regionId; 
        private Context context; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineByAsyncRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Request context information</p>
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>Create pipeline/workflow task configuration</p>
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>Tenant ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public CreatePipelineByAsyncRequest build() {
            return new CreatePipelineByAsyncRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePipelineByAsyncRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineByAsyncRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private Context(Builder builder) {
            this.env = builder.env;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String env; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.env = model.env;
                this.projectId = model.projectId;
            } 

            /**
             * <p>Current operating environment env: DEV - indicates the development environment, PROD - indicates the production environment (for workflows, only PROD is currently supported)</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>Project ID to which the integration pipeline/workflow task belongs</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineByAsyncRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineByAsyncRequest</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private Long pipelineId;

        private NodeInfo(Builder builder) {
            this.directory = builder.directory;
            this.fileId = builder.fileId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.pipelineId = builder.pipelineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public static final class Builder {
            private String directory; 
            private Long fileId; 
            private String nodeId; 
            private String nodeName; 
            private Long pipelineId; 

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.directory = model.directory;
                this.fileId = model.fileId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.pipelineId = model.pipelineId;
            } 

            /**
             * <p>Integration pipeline task node directory (defaults to the root directory). The directory must exist. If it does not exist, call the relevant API to create a directory of type offlinePipeline</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>Pipeline file ID. Leave empty for the first creation. When updating a pipeline task, at least one of pipelineId, fileId, or nodeId must be configured</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>Pipeline task scheduling node ID. Leave empty for the first creation. When updating a pipeline task, at least one of pipelineId, fileId, or nodeId must be configured</p>
             * 
             * <strong>example:</strong>
             * <p>n_123</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Integration pipeline task name</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>Pipeline task ID. Leave empty for the first creation. When updating a pipeline task, at least one of pipelineId, fileId, or nodeId must be configured</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineByAsyncRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineByAsyncRequest</p>
     */
    public static class Hops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SendTo")
        private Boolean sendTo;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private String source;

        @com.aliyun.core.annotation.NameInMap("Target")
        @com.aliyun.core.annotation.Validation(required = true)
        private String target;

        private Hops(Builder builder) {
            this.sendTo = builder.sendTo;
            this.source = builder.source;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hops create() {
            return builder().build();
        }

        /**
         * @return sendTo
         */
        public Boolean getSendTo() {
            return this.sendTo;
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
            private Boolean sendTo; 
            private String source; 
            private String target; 

            private Builder() {
            } 

            private Builder(Hops model) {
                this.sendTo = model.sendTo;
                this.source = model.source;
                this.target = model.target;
            } 

            /**
             * <p>For conditional distribution components, set to true when the downstream connection condition is true, otherwise set to false. This is not applicable to workflow tasks.</p>
             */
            public Builder sendTo(Boolean sendTo) {
                this.sendTo = sendTo;
                return this;
            }

            /**
             * <p>Input step name, i.e., Steps[*].StepName</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_reader</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Output step name, i.e., Steps[*].StepName</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_writer</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public Hops build() {
                return new Hops(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineByAsyncRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineByAsyncRequest</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDistribute")
        private Boolean isDistribute;

        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("PluginConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pluginConfig;

        @com.aliyun.core.annotation.NameInMap("StepName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("StepType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String stepType;

        private Steps(Builder builder) {
            this.isDistribute = builder.isDistribute;
            this.key = builder.key;
            this.pluginConfig = builder.pluginConfig;
            this.stepName = builder.stepName;
            this.stepType = builder.stepType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return isDistribute
         */
        public Boolean getIsDistribute() {
            return this.isDistribute;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return pluginConfig
         */
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return stepType
         */
        public String getStepType() {
            return this.stepType;
        }

        public static final class Builder {
            private Boolean isDistribute; 
            private String key; 
            private String pluginConfig; 
            private String stepName; 
            private String stepType; 

            private Builder() {
            } 

            private Builder(Steps model) {
                this.isDistribute = model.isDistribute;
                this.key = model.key;
                this.pluginConfig = model.pluginConfig;
                this.stepName = model.stepName;
                this.stepType = model.stepType;
            } 

            /**
             * <p>Indicates the data distribution method when the current component has multiple downstream components: true - indicates that the data of the current component is sent to all downstream components in a round-robin manner. For example, if the current component has 100 records and two downstream components, each downstream component receives 50 records. The default value is true. false - indicates that the data of the current component is sent in full to all downstream components. For example, if the current component has 100 records and two downstream components, both downstream components receive 100 records. This value is not applicable to workflow tasks.</p>
             */
            public Builder isDistribute(Boolean isDistribute) {
                this.isDistribute = isDistribute;
                return this;
            }

            /**
             * <p>Plugin ID. Each plugin/operator has a unique identifier. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepKey. Developers should extend the component/operator configuration class to implement the corresponding component/operator configuration. Each component/operator configuration has the same structure as a configuration created on the Dataphin page</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mysqlinput</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Specific component configuration in JSON string format. Refer to the utility class: subclasses of com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig (for workflow operators, use com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.unstructured.BaseOAUnstructuredNeuronConfig) and their toJsonString methods. Developers should extend the component/operator configuration class to implement the corresponding component/operator configuration. Each component/operator configuration has the same structure as a task configuration created on the Dataphin page</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder pluginConfig(String pluginConfig) {
                this.pluginConfig = pluginConfig;
                return this;
            }

            /**
             * <p>Step name. Step names must be unique within the same pipeline task</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_reader</p>
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * <p>Component type: input - indicates an input component, output - indicates an output component, transform - indicates a transform component, process - indicates a flow control component. For workflow tasks, it indicates the operator type, for example: image - image, text - text. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepType. Developers should extend the component/operator configuration class to implement the corresponding component/operator configuration. Each component/operator configuration has the same structure as a configuration created on the Dataphin page</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>input</p>
             */
            public Builder stepType(String stepType) {
                this.stepType = stepType;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineByAsyncRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineByAsyncRequest</p>
     */
    public static class PipelineConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hops")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Hops> hops;

        @com.aliyun.core.annotation.NameInMap("Steps")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Steps> steps;

        private PipelineConfig(Builder builder) {
            this.hops = builder.hops;
            this.steps = builder.steps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineConfig create() {
            return builder().build();
        }

        /**
         * @return hops
         */
        public java.util.List<Hops> getHops() {
            return this.hops;
        }

        /**
         * @return steps
         */
        public java.util.List<Steps> getSteps() {
            return this.steps;
        }

        public static final class Builder {
            private java.util.List<Hops> hops; 
            private java.util.List<Steps> steps; 

            private Builder() {
            } 

            private Builder(PipelineConfig model) {
                this.hops = model.hops;
                this.steps = model.steps;
            } 

            /**
             * <p>DAG (Directed Acyclic Graph) link configuration: describes the connection relationships of all components</p>
             * <p>This parameter is required.</p>
             */
            public Builder hops(java.util.List<Hops> hops) {
                this.hops = hops;
                return this;
            }

            /**
             * <p>Component/operator configuration: contains detailed configurations of all components/operators used</p>
             * <p>This parameter is required.</p>
             */
            public Builder steps(java.util.List<Steps> steps) {
                this.steps = steps;
                return this;
            }

            public PipelineConfig build() {
                return new PipelineConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineByAsyncRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineByAsyncRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private NodeInfo nodeInfo;

        @com.aliyun.core.annotation.NameInMap("PipelineConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private PipelineConfig pipelineConfig;

        @com.aliyun.core.annotation.NameInMap("PipelineJson")
        private String pipelineJson;

        @com.aliyun.core.annotation.NameInMap("PipelineType")
        private Integer pipelineType;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Settings")
        private String settings;

        @com.aliyun.core.annotation.NameInMap("Submit")
        private Boolean submit;

        private CreateCommand(Builder builder) {
            this.comment = builder.comment;
            this.mode = builder.mode;
            this.nodeInfo = builder.nodeInfo;
            this.pipelineConfig = builder.pipelineConfig;
            this.pipelineJson = builder.pipelineJson;
            this.pipelineType = builder.pipelineType;
            this.scheduleConfig = builder.scheduleConfig;
            this.settings = builder.settings;
            this.submit = builder.submit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return nodeInfo
         */
        public NodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        /**
         * @return pipelineConfig
         */
        public PipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

        /**
         * @return pipelineJson
         */
        public String getPipelineJson() {
            return this.pipelineJson;
        }

        /**
         * @return pipelineType
         */
        public Integer getPipelineType() {
            return this.pipelineType;
        }

        /**
         * @return scheduleConfig
         */
        public String getScheduleConfig() {
            return this.scheduleConfig;
        }

        /**
         * @return settings
         */
        public String getSettings() {
            return this.settings;
        }

        /**
         * @return submit
         */
        public Boolean getSubmit() {
            return this.submit;
        }

        public static final class Builder {
            private String comment; 
            private String mode; 
            private NodeInfo nodeInfo; 
            private PipelineConfig pipelineConfig; 
            private String pipelineJson; 
            private Integer pipelineType; 
            private String scheduleConfig; 
            private String settings; 
            private Boolean submit; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.comment = model.comment;
                this.mode = model.mode;
                this.nodeInfo = model.nodeInfo;
                this.pipelineConfig = model.pipelineConfig;
                this.pipelineJson = model.pipelineJson;
                this.pipelineType = model.pipelineType;
                this.scheduleConfig = model.scheduleConfig;
                this.settings = model.settings;
                this.submit = model.submit;
            } 

            /**
             * <p>Comment</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Integration pipeline configuration mode: PIPELINE - indicates pipeline mode (default), JSON - indicates script mode. This is not applicable to workflows.</p>
             * 
             * <strong>example:</strong>
             * <p>PIPELINE</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>Integration pipeline task basic information</p>
             * <p>This parameter is required.</p>
             */
            public Builder nodeInfo(NodeInfo nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            /**
             * <p>Integration pipeline component/workflow operator configuration</p>
             * <p>This parameter is required.</p>
             */
            public Builder pipelineConfig(PipelineConfig pipelineConfig) {
                this.pipelineConfig = pipelineConfig;
                return this;
            }

            /**
             * <p>In script mode: integration pipeline configuration (in JSON string format). Workflow tasks do not support script mode</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder pipelineJson(String pipelineJson) {
                this.pipelineJson = pipelineJson;
                return this;
            }

            /**
             * <p>Task type: 0 - indicates offline integration (default), 1 - indicates real-time integration, 14 - indicates a workflow task</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pipelineType(Integer pipelineType) {
                this.pipelineType = pipelineType;
                return this;
            }

            /**
             * <p>Scheduling configuration in JSON string format. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAScheduleConfig#toJsonString method</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cronExpression&quot;:&quot;0 0 0 * * ?&quot;}</p>
             */
            public Builder scheduleConfig(String scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
                return this;
            }

            /**
             * <p>Channel configuration in JSON string format. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAPipelineSetting#toJsonString method</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            /**
             * <p>Whether to submit. The default is to submit</p>
             */
            public Builder submit(Boolean submit) {
                this.submit = submit;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
