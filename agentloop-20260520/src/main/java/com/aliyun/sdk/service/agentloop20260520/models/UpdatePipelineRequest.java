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
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.putPathParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * executePolicy.
         */
        public Builder executePolicy(ExecutePolicy executePolicy) {
            this.putBodyParameter("executePolicy", executePolicy);
            this.executePolicy = executePolicy;
            return this;
        }

        /**
         * pipeline.
         */
        public Builder pipeline(Pipeline pipeline) {
            this.putBodyParameter("pipeline", pipeline);
            this.pipeline = pipeline;
            return this;
        }

        /**
         * sink.
         */
        public Builder sink(Sink sink) {
            this.putBodyParameter("sink", sink);
            this.sink = sink;
            return this;
        }

        /**
         * source.
         */
        public Builder source(Source source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * clientToken.
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
             * fromTime.
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * toTime.
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
             * fromTime.
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * interval.
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
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * runOnce.
             */
            public Builder runOnce(RunOnce runOnce) {
                this.runOnce = runOnce;
                return this;
            }

            /**
             * scheduled.
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * type.
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
             * nodes.
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
             * agentSpace.
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * dataset.
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
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private Dataset dataset;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Sink(Builder builder) {
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

            private Builder(Sink model) {
                this.dataset = model.dataset;
                this.type = model.type;
            } 

            /**
             * dataset.
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * type.
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
    public static class Logstore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        private Logstore(Builder builder) {
            this.logstore = builder.logstore;
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
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private String logstore; 
            private String query; 

            private Builder() {
            } 

            private Builder(Logstore model) {
                this.logstore = model.logstore;
                this.query = model.query;
            } 

            /**
             * logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * query.
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
        @com.aliyun.core.annotation.NameInMap("logstore")
        private Logstore logstore;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
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
            private Logstore logstore; 
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.logstore = model.logstore;
                this.type = model.type;
            } 

            /**
             * logstore.
             */
            public Builder logstore(Logstore logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * type.
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
