// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executePolicy")
    private ExecutePolicy executePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipeline")
    private Pipeline pipeline;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sink")
    private Sink sink;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreatePipelineRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.description = builder.description;
        this.executePolicy = builder.executePolicy;
        this.pipeline = builder.pipeline;
        this.pipelineName = builder.pipelineName;
        this.sink = builder.sink;
        this.source = builder.source;
        this.clientToken = builder.clientToken;
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
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executePolicy
     */
    public ExecutePolicy getExecutePolicy() {
        return this.executePolicy;
    }

    /**
     * @return pipeline
     */
    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return sink
     */
    public Sink getSink() {
        return this.sink;
    }

    /**
     * @return source
     */
    public Source getSource() {
        return this.source;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreatePipelineRequest, Builder> {
        private String agentSpace; 
        private String description; 
        private ExecutePolicy executePolicy; 
        private Pipeline pipeline; 
        private String pipelineName; 
        private Sink sink; 
        private Source source; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.description = request.description;
            this.executePolicy = request.executePolicy;
            this.pipeline = request.pipeline;
            this.pipelineName = request.pipelineName;
            this.sink = request.sink;
            this.source = request.source;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The name of the AgentSpace. The pipeline will be created under this AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The description of the pipeline. Maximum length: 256 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Collect trace data from SLS and perform data cleaning into a dataset</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The scheduling method.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;RunOnce&quot;,&quot;runOnce&quot;:{&quot;fromTime&quot;:1735660800,&quot;toTime&quot;:1735664400}}</p>
         */
        public Builder executePolicy(ExecutePolicy executePolicy) {
            this.putBodyParameter("executePolicy", executePolicy);
            this.executePolicy = executePolicy;
            return this;
        }

        /**
         * <p>The pipeline configuration, including node orchestration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nodes&quot;:[{&quot;id&quot;:&quot;select-fields&quot;,&quot;type&quot;:&quot;project&quot;,&quot;parameters&quot;:{&quot;question&quot;:&quot;user_query&quot;}}]}</p>
         */
        public Builder pipeline(Pipeline pipeline) {
            this.putBodyParameter("pipeline", pipeline);
            this.pipeline = pipeline;
            return this;
        }

        /**
         * <p>The name of the pipeline. The name must be 3 to 63 characters in length and can contain only lowercase letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.putBodyParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The pipeline sink, which is the data write destination.</p>
         */
        public Builder sink(Sink sink) {
            this.putBodyParameter("sink", sink);
            this.sink = sink;
            return this;
        }

        /**
         * <p>The data source for the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;logstore&quot;,&quot;logstore&quot;:{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;},&quot;inputFields&quot;:[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]}</p>
         */
        public Builder source(Source source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The idempotency token. This is a unique string generated by the client to ensure the idempotency of the create operation.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
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
    public static class Continuous extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fromTime")
        private Long fromTime;

        private Continuous(Builder builder) {
            this.fromTime = builder.fromTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Continuous create() {
            return builder().build();
        }

        /**
         * @return fromTime
         */
        public Long getFromTime() {
            return this.fromTime;
        }

        public static final class Builder {
            private Long fromTime; 

            private Builder() {
            } 

            private Builder(Continuous model) {
                this.fromTime = model.fromTime;
            } 

            /**
             * <p>The bootstrap start time in UNIX seconds. It has the same precision as runOnce or scheduled fromTime. Millisecond values greater than or equal to 1e12 are automatically converted. The cursor starts from this time aligned to the grid and catches up window by window. After catching up, it switches to minute intervals. By default, it starts from the current time and processes only incremental data.</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            public Continuous build() {
                return new Continuous(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class RunOnce extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fromTime")
        private Long fromTime;

        @com.aliyun.core.annotation.NameInMap("toTime")
        private Long toTime;

        private RunOnce(Builder builder) {
            this.fromTime = builder.fromTime;
            this.toTime = builder.toTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunOnce create() {
            return builder().build();
        }

        /**
         * @return fromTime
         */
        public Long getFromTime() {
            return this.fromTime;
        }

        /**
         * @return toTime
         */
        public Long getToTime() {
            return this.toTime;
        }

        public static final class Builder {
            private Long fromTime; 
            private Long toTime; 

            private Builder() {
            } 

            private Builder(RunOnce model) {
                this.fromTime = model.fromTime;
                this.toTime = model.toTime;
            } 

            /**
             * <p>The start time of the data processing window in UNIX seconds. The value must be less than the toTime value.</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * <p>The end time of the data processing window in UNIX seconds. The value must be greater than the fromTime value.</p>
             * 
             * <strong>example:</strong>
             * <p>1735747200</p>
             */
            public Builder toTime(Long toTime) {
                this.toTime = toTime;
                return this;
            }

            public RunOnce build() {
                return new RunOnce(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Scheduled extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fromTime")
        private Long fromTime;

        @com.aliyun.core.annotation.NameInMap("interval")
        private String interval;

        private Scheduled(Builder builder) {
            this.fromTime = builder.fromTime;
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scheduled create() {
            return builder().build();
        }

        /**
         * @return fromTime
         */
        public Long getFromTime() {
            return this.fromTime;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private Long fromTime; 
            private String interval; 

            private Builder() {
            } 

            private Builder(Scheduled model) {
                this.fromTime = model.fromTime;
                this.interval = model.interval;
            } 

            /**
             * <p>The start time of the scheduling in UNIX milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * <p>The scheduling interval. Valid values: 1h, 6h, 12h, and 1d.</p>
             * 
             * <strong>example:</strong>
             * <p>1h</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            public Scheduled build() {
                return new Scheduled(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class ExecutePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("continuous")
        private Continuous continuous;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("runOnce")
        private RunOnce runOnce;

        @com.aliyun.core.annotation.NameInMap("scheduled")
        private Scheduled scheduled;

        private ExecutePolicy(Builder builder) {
            this.continuous = builder.continuous;
            this.mode = builder.mode;
            this.runOnce = builder.runOnce;
            this.scheduled = builder.scheduled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutePolicy create() {
            return builder().build();
        }

        /**
         * @return continuous
         */
        public Continuous getContinuous() {
            return this.continuous;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return runOnce
         */
        public RunOnce getRunOnce() {
            return this.runOnce;
        }

        /**
         * @return scheduled
         */
        public Scheduled getScheduled() {
            return this.scheduled;
        }

        public static final class Builder {
            private Continuous continuous; 
            private String mode; 
            private RunOnce runOnce; 
            private Scheduled scheduled; 

            private Builder() {
            } 

            private Builder(ExecutePolicy model) {
                this.continuous = model.continuous;
                this.mode = model.mode;
                this.runOnce = model.runOnce;
                this.scheduled = model.scheduled;
            } 

            /**
             * <p>The continuous execution configuration. This is used when the type is trace. The processing frequency is a fixed value managed by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;fromTime&quot;:1735660800}</p>
             */
            public Builder continuous(Continuous continuous) {
                this.continuous = continuous;
                return this;
            }

            /**
             * <p>The scheduling mode. Valid values: RunOnce (single execution) and Scheduled (periodic scheduling).</p>
             * 
             * <strong>example:</strong>
             * <p>RunOnce</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The single execution configuration. This parameter is required only when the mode is RunOnce.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;fromTime&quot;:1735660800,&quot;toTime&quot;:1735664400}</p>
             */
            public Builder runOnce(RunOnce runOnce) {
                this.runOnce = runOnce;
                return this;
            }

            /**
             * <p>The periodic scheduling configuration. This parameter is required only when the mode is Scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;interval&quot;:&quot;1h&quot;,&quot;fromTime&quot;:1735660800}</p>
             */
            public Builder scheduled(Scheduled scheduled) {
                this.scheduled = scheduled;
                return this;
            }

            public ExecutePolicy build() {
                return new ExecutePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Nodes(Builder builder) {
            this.id = builder.id;
            this.parameters = builder.parameters;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private java.util.Map<String, ?> parameters; 
            private String type; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.id = model.id;
                this.parameters = model.parameters;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>node-1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The parameters of the node. This is a key-value structure and varies based on the node type.</p>
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>transform</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Pipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nodes")
        private java.util.List<Nodes> nodes;

        private Pipeline(Builder builder) {
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipeline create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 

            private Builder() {
            } 

            private Builder(Pipeline model) {
                this.nodes = model.nodes;
            } 

            /**
             * <p>The list of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;id&quot;:&quot;select-fields&quot;,&quot;type&quot;:&quot;project&quot;,&quot;parameters&quot;:{}}]</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Pipeline build() {
                return new Pipeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Dataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private String dataset;

        private Dataset(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.dataset = builder.dataset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dataset create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return dataset
         */
        public String getDataset() {
            return this.dataset;
        }

        public static final class Builder {
            private String agentSpace; 
            private String dataset; 

            private Builder() {
            } 

            private Builder(Dataset model) {
                this.agentSpace = model.agentSpace;
                this.dataset = model.dataset;
            } 

            /**
             * <p>The name of the agent space to which the default destination dataset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The name of the default destination dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>other-result</p>
             */
            public Builder dataset(String dataset) {
                this.dataset = dataset;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class DefaultSink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private Dataset dataset;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DefaultSink(Builder builder) {
            this.dataset = builder.dataset;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultSink create() {
            return builder().build();
        }

        /**
         * @return dataset
         */
        public Dataset getDataset() {
            return this.dataset;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Dataset dataset; 
            private String type; 

            private Builder() {
            } 

            private Builder(DefaultSink model) {
                this.dataset = model.dataset;
                this.type = model.type;
            } 

            /**
             * <p>The default destination dataset.</p>
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The default destination type. Currently, only dataset is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DefaultSink build() {
                return new DefaultSink(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class SinkDataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private String dataset;

        private SinkDataset(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.dataset = builder.dataset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkDataset create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return dataset
         */
        public String getDataset() {
            return this.dataset;
        }

        public static final class Builder {
            private String agentSpace; 
            private String dataset; 

            private Builder() {
            } 

            private Builder(SinkDataset model) {
                this.agentSpace = model.agentSpace;
                this.dataset = model.dataset;
            } 

            /**
             * <p>The name of the agent space to which the destination dataset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The name of the destination dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>refund-result</p>
             */
            public Builder dataset(String dataset) {
                this.dataset = dataset;
                return this;
            }

            public SinkDataset build() {
                return new SinkDataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class RoutesSink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private SinkDataset dataset;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private RoutesSink(Builder builder) {
            this.dataset = builder.dataset;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutesSink create() {
            return builder().build();
        }

        /**
         * @return dataset
         */
        public SinkDataset getDataset() {
            return this.dataset;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private SinkDataset dataset; 
            private String type; 

            private Builder() {
            } 

            private Builder(RoutesSink model) {
                this.dataset = model.dataset;
                this.type = model.type;
            } 

            /**
             * <p>The destination dataset for the route.</p>
             */
            public Builder dataset(SinkDataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The destination type for the route. Currently, only dataset is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RoutesSink build() {
                return new RoutesSink(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("sink")
        private RoutesSink sink;

        private Routes(Builder builder) {
            this.expression = builder.expression;
            this.id = builder.id;
            this.sink = builder.sink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routes create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return sink
         */
        public RoutesSink getSink() {
            return this.sink;
        }

        public static final class Builder {
            private String expression; 
            private String id; 
            private RoutesSink sink; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.expression = model.expression;
                this.id = model.id;
                this.sink = model.sink;
            } 

            /**
             * <p>The route expression in Search Processing Language (SPL). Only where, project, and extend are supported.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>| where intent = \&quot;refund\&quot;</li>
             * </ul>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The route ID.</p>
             * 
             * <strong>example:</strong>
             * <p>refund</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The write destination for the route.</p>
             */
            public Builder sink(RoutesSink sink) {
                this.sink = sink;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultSink")
        private DefaultSink defaultSink;

        @com.aliyun.core.annotation.NameInMap("matchMode")
        private String matchMode;

        @com.aliyun.core.annotation.NameInMap("routes")
        private java.util.List<Routes> routes;

        private Condition(Builder builder) {
            this.defaultSink = builder.defaultSink;
            this.matchMode = builder.matchMode;
            this.routes = builder.routes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return defaultSink
         */
        public DefaultSink getDefaultSink() {
            return this.defaultSink;
        }

        /**
         * @return matchMode
         */
        public String getMatchMode() {
            return this.matchMode;
        }

        /**
         * @return routes
         */
        public java.util.List<Routes> getRoutes() {
            return this.routes;
        }

        public static final class Builder {
            private DefaultSink defaultSink; 
            private String matchMode; 
            private java.util.List<Routes> routes; 

            private Builder() {
            } 

            private Builder(Condition model) {
                this.defaultSink = model.defaultSink;
                this.matchMode = model.matchMode;
                this.routes = model.routes;
            } 

            /**
             * <p>The default write destination used when no conditional route is matched.</p>
             */
            public Builder defaultSink(DefaultSink defaultSink) {
                this.defaultSink = defaultSink;
                return this;
            }

            /**
             * <p>The route matching mode. Currently, only all is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * <p>The list of conditional routes.</p>
             */
            public Builder routes(java.util.List<Routes> routes) {
                this.routes = routes;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class CreatePipelineRequestSinkDataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private String dataset;

        private CreatePipelineRequestSinkDataset(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.dataset = builder.dataset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreatePipelineRequestSinkDataset create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return dataset
         */
        public String getDataset() {
            return this.dataset;
        }

        public static final class Builder {
            private String agentSpace; 
            private String dataset; 

            private Builder() {
            } 

            private Builder(CreatePipelineRequestSinkDataset model) {
                this.agentSpace = model.agentSpace;
                this.dataset = model.dataset;
            } 

            /**
             * <p>The name of the agent space to which the destination dataset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The name of the destination dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>my-dataset</p>
             */
            public Builder dataset(String dataset) {
                this.dataset = dataset;
                return this;
            }

            public CreatePipelineRequestSinkDataset build() {
                return new CreatePipelineRequestSinkDataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private Condition condition;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private CreatePipelineRequestSinkDataset dataset;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Sink(Builder builder) {
            this.condition = builder.condition;
            this.dataset = builder.dataset;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sink create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public Condition getCondition() {
            return this.condition;
        }

        /**
         * @return dataset
         */
        public CreatePipelineRequestSinkDataset getDataset() {
            return this.dataset;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Condition condition; 
            private CreatePipelineRequestSinkDataset dataset; 
            private String type; 

            private Builder() {
            } 

            private Builder(Sink model) {
                this.condition = model.condition;
                this.dataset = model.dataset;
                this.type = model.type;
            } 

            /**
             * <p>The conditional routing configuration. This is used only when sink.type is set to condition.</p>
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The destination dataset configuration for the dataset sink. This is used only when sink.type is set to dataset.</p>
             */
            public Builder dataset(CreatePipelineRequestSinkDataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The destination type. Currently, dataset is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Dataset</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Sink build() {
                return new Sink(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class SourceDataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private String dataset;

        @com.aliyun.core.annotation.NameInMap("filter")
        private String filter;

        private SourceDataset(Builder builder) {
            this.dataset = builder.dataset;
            this.filter = builder.filter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDataset create() {
            return builder().build();
        }

        /**
         * @return dataset
         */
        public String getDataset() {
            return this.dataset;
        }

        /**
         * @return filter
         */
        public String getFilter() {
            return this.filter;
        }

        public static final class Builder {
            private String dataset; 
            private String filter; 

            private Builder() {
            } 

            private Builder(SourceDataset model) {
                this.dataset = model.dataset;
                this.filter = model.filter;
            } 

            /**
             * <p>The name of the source dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>my-dataset</p>
             */
            public Builder dataset(String dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The data filter condition for the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>status = \&quot;pending\&quot;</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            public SourceDataset build() {
                return new SourceDataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class InputFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private InputFields(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFields create() {
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

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(InputFields model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>question</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The data type of the field. Valid values: text, long, double, and json.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InputFields build() {
                return new InputFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Logstore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        private Logstore(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logstore create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 
            private String query; 

            private Builder() {
            } 

            private Builder(Logstore model) {
                this.logstore = model.logstore;
                this.project = model.project;
                this.query = model.query;
            } 

            /**
             * <p>The name of the Simple Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>my-sls-logstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>my-sls-project</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The data filtered query statement, which uses the Simple Log Service query and analysis syntax.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>| SELECT *</li>
             * </ul>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public Logstore build() {
                return new Logstore(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Enrich extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private Enrich(Builder builder) {
            this.columns = builder.columns;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Enrich create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private java.util.List<String> columns; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(Enrich model) {
                this.columns = model.columns;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The list of enrichment columns. This parameter is retained for backward compatibility. The current implementation outputs only the fixed agent_trajectory column, and this parameter no longer affects the output.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;input&quot;,&quot;output&quot;,&quot;session_id&quot;]</p>
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>Specifies whether to enable trajectory enrichment.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Enrich build() {
                return new Enrich(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Trajectory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enrich")
        private Enrich enrich;

        private Trajectory(Builder builder) {
            this.enrich = builder.enrich;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trajectory create() {
            return builder().build();
        }

        /**
         * @return enrich
         */
        public Enrich getEnrich() {
            return this.enrich;
        }

        public static final class Builder {
            private Enrich enrich; 

            private Builder() {
            } 

            private Builder(Trajectory model) {
                this.enrich = model.enrich;
            } 

            /**
             * <p>The trajectory enrichment configuration. It mounts trajectory data into the scrubbing results based on the trace_id. When writing to a dataset, the data is stored in the fixed agent_trajectory column, where the column value is the trajectory JSON content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}</p>
             */
            public Builder enrich(Enrich enrich) {
                this.enrich = enrich;
                return this;
            }

            public Trajectory build() {
                return new Trajectory(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private SourceDataset dataset;

        @com.aliyun.core.annotation.NameInMap("inputFields")
        private java.util.List<InputFields> inputFields;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private Logstore logstore;

        @com.aliyun.core.annotation.NameInMap("trajectory")
        private Trajectory trajectory;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
            this.dataset = builder.dataset;
            this.inputFields = builder.inputFields;
            this.logstore = builder.logstore;
            this.trajectory = builder.trajectory;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return dataset
         */
        public SourceDataset getDataset() {
            return this.dataset;
        }

        /**
         * @return inputFields
         */
        public java.util.List<InputFields> getInputFields() {
            return this.inputFields;
        }

        /**
         * @return logstore
         */
        public Logstore getLogstore() {
            return this.logstore;
        }

        /**
         * @return trajectory
         */
        public Trajectory getTrajectory() {
            return this.trajectory;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private SourceDataset dataset; 
            private java.util.List<InputFields> inputFields; 
            private Logstore logstore; 
            private Trajectory trajectory; 
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.dataset = model.dataset;
                this.inputFields = model.inputFields;
                this.logstore = model.logstore;
                this.trajectory = model.trajectory;
                this.type = model.type;
            } 

            /**
             * <p>The dataset datasource config under the current agent space.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dataset&quot;:&quot;my-dataset&quot;,&quot;filter&quot;:&quot;status = \&quot;pending\&quot;&quot;}</p>
             */
            public Builder dataset(SourceDataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The input fields and their data types. This applies to all data source types.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]</p>
             */
            public Builder inputFields(java.util.List<InputFields> inputFields) {
                this.inputFields = inputFields;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore datasource config.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;}</p>
             */
            public Builder logstore(Logstore logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The trajectory data configuration. This is optional and takes effect only when the type is set to trace. It retrieves ATIF standard trajectory data from the trajectory scrubbing service and extends it based on features.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enrich&quot;:{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}}</p>
             */
            public Builder trajectory(Trajectory trajectory) {
                this.trajectory = trajectory;
                return this;
            }

            /**
             * <p>The data source type. Currently, Simple Log Service is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>SLS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
}
