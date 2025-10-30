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
 * {@link CreatePipelineRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineRequest</p>
 */
public class CreatePipelineRequest extends Request {
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

    private CreatePipelineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePipelineRequest, Builder> {
        private String regionId; 
        private Context context; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
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
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
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

        @Override
        public CreatePipelineRequest build() {
            return new CreatePipelineRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
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
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
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
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
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
             * PipelineId.
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
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
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
             * SendTo.
             */
            public Builder sendTo(Boolean sendTo) {
                this.sendTo = sendTo;
                return this;
            }

            /**
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
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
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
             * IsDistribute.
             */
            public Builder isDistribute(Boolean isDistribute) {
                this.isDistribute = isDistribute;
                return this;
            }

            /**
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
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
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
             * <p>This parameter is required.</p>
             */
            public Builder hops(java.util.List<Hops> hops) {
                this.hops = hops;
                return this;
            }

            /**
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
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nodeInfo(NodeInfo nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder pipelineConfig(PipelineConfig pipelineConfig) {
                this.pipelineConfig = pipelineConfig;
                return this;
            }

            /**
             * PipelineJson.
             */
            public Builder pipelineJson(String pipelineJson) {
                this.pipelineJson = pipelineJson;
                return this;
            }

            /**
             * PipelineType.
             */
            public Builder pipelineType(Integer pipelineType) {
                this.pipelineType = pipelineType;
                return this;
            }

            /**
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
             * Settings.
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            /**
             * Submit.
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
