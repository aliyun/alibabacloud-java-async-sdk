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
 * {@link UpdatePipelineRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineRequest</p>
 */
public class UpdatePipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

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
    @com.aliyun.core.annotation.NameInMap("sink")
    private Sink sink;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdatePipelineRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.pipelineName = builder.pipelineName;
        this.description = builder.description;
        this.executePolicy = builder.executePolicy;
        this.pipeline = builder.pipeline;
        this.sink = builder.sink;
        this.source = builder.source;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelineRequest create() {
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
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
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

    public static final class Builder extends Request.Builder<UpdatePipelineRequest, Builder> {
        private String agentSpace; 
        private String pipelineName; 
        private String description; 
        private ExecutePolicy executePolicy; 
        private Pipeline pipeline; 
        private Sink sink; 
        private Source source; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePipelineRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.pipelineName = request.pipelineName;
            this.description = request.description;
            this.executePolicy = request.executePolicy;
            this.pipeline = request.pipeline;
            this.sink = request.sink;
            this.source = request.source;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The name of the AgentSpace where the pipeline to be updated resides.</p>
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
         * <p>The name of the pipeline to update.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.putPathParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The description of the pipeline, which helps users understand its purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>My pipeline</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The scheduling policy. If provided, the entire scheduling policy is overwritten.</p>
         */
        public Builder executePolicy(ExecutePolicy executePolicy) {
            this.putBodyParameter("executePolicy", executePolicy);
            this.executePolicy = executePolicy;
            return this;
        }

        /**
         * <p>The pipeline configuration (node orchestration). If specified, the existing pipeline configuration is entirely overwritten.</p>
         */
        public Builder pipeline(Pipeline pipeline) {
            this.putBodyParameter("pipeline", pipeline);
            this.pipeline = pipeline;
            return this;
        }

        /**
         * <p>The pipeline sink (data write destination). If provided, the entire sink configuration is overwritten.</p>
         */
        public Builder sink(Sink sink) {
            this.putBodyParameter("sink", sink);
            this.sink = sink;
            return this;
        }

        /**
         * <p>The pipeline data source. If specified, the existing source configuration is entirely overwritten.</p>
         */
        public Builder source(Source source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The idempotency token. A unique string generated by the client to ensure the idempotency of the update operation.</p>
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
        public UpdatePipelineRequest build() {
            return new UpdatePipelineRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The start time for data processing, in UNIX millisecond timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * <p>The end time for data processing, in UNIX millisecond timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1735747200000</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The scheduling start time, in UNIX millisecond timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * <p>The scheduling interval. For example, 1h.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
     */
    public static class ExecutePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("runOnce")
        private RunOnce runOnce;

        @com.aliyun.core.annotation.NameInMap("scheduled")
        private Scheduled scheduled;

        private ExecutePolicy(Builder builder) {
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
            private String mode; 
            private RunOnce runOnce; 
            private Scheduled scheduled; 

            private Builder() {
            } 

            private Builder(ExecutePolicy model) {
                this.mode = model.mode;
                this.runOnce = model.runOnce;
                this.scheduled = model.scheduled;
            } 

            /**
             * <p>The scheduling mode. For example, Scheduled (timed scheduling) or RunOnce (one-time execution).</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduled</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The configuration for one-time execution.</p>
             */
            public Builder runOnce(RunOnce runOnce) {
                this.runOnce = runOnce;
                return this;
            }

            /**
             * <p>The timed scheduling configuration.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>node-1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node parameters in key-value format. The parameters vary depending on the node type.</p>
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The node type.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The name of the AgentSpace to which the default destination dataset belongs.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The name of the AgentSpace to which the destination dataset belongs.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The route destination type. Currently, only dataset is supported.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The route expression in SPL. Only where, project, and extend are supported.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
     */
    public static class UpdatePipelineRequestSinkDataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private String dataset;

        private UpdatePipelineRequestSinkDataset(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.dataset = builder.dataset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdatePipelineRequestSinkDataset create() {
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

            private Builder(UpdatePipelineRequestSinkDataset model) {
                this.agentSpace = model.agentSpace;
                this.dataset = model.dataset;
            } 

            /**
             * <p>The name of the AgentSpace to which the destination dataset belongs.</p>
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

            public UpdatePipelineRequestSinkDataset build() {
                return new UpdatePipelineRequestSinkDataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private Condition condition;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private UpdatePipelineRequestSinkDataset dataset;

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
        public UpdatePipelineRequestSinkDataset getDataset() {
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
            private UpdatePipelineRequestSinkDataset dataset; 
            private String type; 

            private Builder() {
            } 

            private Builder(Sink model) {
                this.condition = model.condition;
                this.dataset = model.dataset;
                this.type = model.type;
            } 

            /**
             * <p>The conditional routing configuration. This parameter takes effect only when sink.type is set to condition.</p>
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The destination dataset configuration for the dataset sink. This parameter takes effect only when sink.type is set to dataset.</p>
             */
            public Builder dataset(UpdatePipelineRequestSinkDataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The sink type. Valid values: dataset and condition.</p>
             * 
             * <strong>example:</strong>
             * <p>condition</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The filter condition for the dataset data.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The field name.</p>
             * 
             * <strong>example:</strong>
             * <p>question</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The field type. Valid values: text, long, double, and json.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
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
             * <p>The name of the SLS Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>my-sls-logstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the SLS project.</p>
             * 
             * <strong>example:</strong>
             * <p>my-sls-project</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The data filtered query statement in SLS query/analysis syntax.</p>
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
     * {@link UpdatePipelineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePipelineRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private SourceDataset dataset;

        @com.aliyun.core.annotation.NameInMap("inputFields")
        private java.util.List<InputFields> inputFields;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private Logstore logstore;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
            this.dataset = builder.dataset;
            this.inputFields = builder.inputFields;
            this.logstore = builder.logstore;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private SourceDataset dataset; 
            private java.util.List<InputFields> inputFields; 
            private Logstore logstore; 
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.dataset = model.dataset;
                this.inputFields = model.inputFields;
                this.logstore = model.logstore;
                this.type = model.type;
            } 

            /**
             * <p>The dataset datasource config within the current AgentSpace.</p>
             */
            public Builder dataset(SourceDataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The input fields and their types. This parameter applies to all data source types.</p>
             */
            public Builder inputFields(java.util.List<InputFields> inputFields) {
                this.inputFields = inputFields;
                return this;
            }

            /**
             * <p>The SLS Logstore datasource config.</p>
             */
            public Builder logstore(Logstore logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The data source type. Valid values: logstore and dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset</p>
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
