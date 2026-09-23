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
 * {@link GetPipelineByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineByIdResponseBody</p>
 */
public class GetPipelineByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPipelineByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineByIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPipelineByIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The pipeline node details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPipelineByIdResponseBody build() {
            return new GetPipelineByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPipelineByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineByIdResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private Long pipelineId;

        private NodeInfo(Builder builder) {
            this.desc = builder.desc;
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
         * @return desc
         */
        public String getDesc() {
            return this.desc;
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
            private String desc; 
            private String directory; 
            private Long fileId; 
            private String nodeId; 
            private String nodeName; 
            private Long pipelineId; 

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.desc = model.desc;
                this.directory = model.directory;
                this.fileId = model.fileId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.pipelineId = model.pipelineId;
            } 

            /**
             * <p>The description of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The folder of the integration pipeline node. The default value is the root folder. The folder must already exist. If it does not exist, call the relevant API operation to create a folder of the offlinePipeline type.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The pipeline file ID. This value is empty when the node is first created. When updating a pipeline node, at least one of pipelineId, fileId, or nodeId must be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The scheduling node ID of the pipeline node. This value is empty when the node is first created. When updating a pipeline node, at least one of pipelineId, fileId, or nodeId must be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>n_123</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the integration pipeline node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The pipeline node ID. This value is empty when the node is first created. When updating a pipeline node, at least one of pipelineId, fileId, or nodeId must be specified.</p>
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
     * {@link GetPipelineByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineByIdResponseBody</p>
     */
    public static class Hops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SendTo")
        private Boolean sendTo;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Target")
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
             * <p>Specifies the condition for a conditional distribution component. Set this parameter to true when the downstream connection condition is true, or false otherwise.</p>
             */
            public Builder sendTo(Boolean sendTo) {
                this.sendTo = sendTo;
                return this;
            }

            /**
             * <p>The name of the input step, which corresponds to Steps[*].StepName.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_reader</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The name of the output step, which corresponds to Steps[*].StepName.</p>
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
     * {@link GetPipelineByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineByIdResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDistribute")
        private Boolean isDistribute;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("PluginConfig")
        private String pluginConfig;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("StepType")
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
             * <p>Specifies the data distribution method when the current component has multiple downstream components. Valid values:</p>
             * <ul>
             * <li>true: The data of the current component is sent to all downstream components in a round-robin manner. For example, if the current component has 100 records and two downstream components, each downstream component receives 50 records. Default value: true.</li>
             * <li>false: The full data of the current component is sent to all downstream components. For example, if the current component has 100 records and two downstream components, both downstream components receive 100 records.</li>
             * </ul>
             */
            public Builder isDistribute(Boolean isDistribute) {
                this.isDistribute = isDistribute;
                return this;
            }

            /**
             * <p>The plugin ID. Each plugin has a unique identifier. Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepKey. Developers should inherit this component configuration class and implement the corresponding component configuration. Each component configuration has the same structure as the pipeline configuration created on the Dataphin console.</p>
             * 
             * <strong>example:</strong>
             * <p>mysqlinput</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The specific component configuration. The value is a JSON string. Refer to the toJsonString method of the subclasses of the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig. Developers should inherit this component configuration class and implement the corresponding component configuration. Each component configuration has the same structure as the pipeline configuration created on the Dataphin console.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder pluginConfig(String pluginConfig) {
                this.pluginConfig = pluginConfig;
                return this;
            }

            /**
             * <p>The step name. Step names must be unique within the same pipeline node.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_reader</p>
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * <p>The component type. Valid values:</p>
             * <ul>
             * <li>input: an input component.</li>
             * <li>output: an output component.</li>
             * <li>transfrom: a transform component.</li>
             * <li>process: a flow control component.</li>
             * </ul>
             * <p>Refer to the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.plugin.OABasePluginConfig#stepType. Developers should inherit this component configuration class and implement the corresponding component configuration. Each component configuration has the same structure as the pipeline configuration created on the Dataphin console.</p>
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
     * {@link GetPipelineByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineByIdResponseBody</p>
     */
    public static class PipelineConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hops")
        private java.util.List<Hops> hops;

        @com.aliyun.core.annotation.NameInMap("Steps")
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
             * <p>The DAG (directed acyclic graph) link configuration that describes the connections between all components.</p>
             */
            public Builder hops(java.util.List<Hops> hops) {
                this.hops = hops;
                return this;
            }

            /**
             * <p>The component configurations, which contain the detailed configurations of all components used.</p>
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
     * {@link GetPipelineByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineByIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private NodeInfo nodeInfo;

        @com.aliyun.core.annotation.NameInMap("PipelineConfig")
        private PipelineConfig pipelineConfig;

        @com.aliyun.core.annotation.NameInMap("PipelineJson")
        private String pipelineJson;

        @com.aliyun.core.annotation.NameInMap("PipelineType")
        private Integer pipelineType;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
        private String scheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Settings")
        private String settings;

        private Data(Builder builder) {
            this.mode = builder.mode;
            this.nodeInfo = builder.nodeInfo;
            this.pipelineConfig = builder.pipelineConfig;
            this.pipelineJson = builder.pipelineJson;
            this.pipelineType = builder.pipelineType;
            this.scheduleConfig = builder.scheduleConfig;
            this.settings = builder.settings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

        public static final class Builder {
            private String mode; 
            private NodeInfo nodeInfo; 
            private PipelineConfig pipelineConfig; 
            private String pipelineJson; 
            private Integer pipelineType; 
            private String scheduleConfig; 
            private String settings; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.mode = model.mode;
                this.nodeInfo = model.nodeInfo;
                this.pipelineConfig = model.pipelineConfig;
                this.pipelineJson = model.pipelineJson;
                this.pipelineType = model.pipelineType;
                this.scheduleConfig = model.scheduleConfig;
                this.settings = model.settings;
            } 

            /**
             * <p>The configuration mode of the integration pipeline.</p>
             * 
             * <strong>example:</strong>
             * <p>PIPELINE</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The basic information of the pipeline node.</p>
             */
            public Builder nodeInfo(NodeInfo nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            /**
             * <p>The component configuration of the integration pipeline.</p>
             */
            public Builder pipelineConfig(PipelineConfig pipelineConfig) {
                this.pipelineConfig = pipelineConfig;
                return this;
            }

            /**
             * <p>The script mode configuration of the integration pipeline.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder pipelineJson(String pipelineJson) {
                this.pipelineJson = pipelineJson;
                return this;
            }

            /**
             * <p>The type of the pipeline node.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder pipelineType(Integer pipelineType) {
                this.pipelineType = pipelineType;
                return this;
            }

            /**
             * <p>The scheduling configuration of the integration pipeline. The value is a JSON string. You can deserialize it by using the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.vo.OAScheduleConfigVO.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder scheduleConfig(String scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
                return this;
            }

            /**
             * <p>The channel configuration of the integration pipeline. The value is a JSON string. You can deserialize it by using the utility class com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAPipelineSetting.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
