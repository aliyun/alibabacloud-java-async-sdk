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
 * {@link PreviewPipelineRequest} extends {@link RequestModel}
 *
 * <p>PreviewPipelineRequest</p>
 */
public class PreviewPipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fromTime")
    private Long fromTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pipeline")
    private Pipeline pipeline;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("toTime")
    private Long toTime;

    private PreviewPipelineRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.fromTime = builder.fromTime;
        this.pipeline = builder.pipeline;
        this.source = builder.source;
        this.toTime = builder.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewPipelineRequest create() {
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
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return pipeline
     */
    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * @return source
     */
    public Source getSource() {
        return this.source;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    public static final class Builder extends Request.Builder<PreviewPipelineRequest, Builder> {
        private String agentSpace; 
        private Long fromTime; 
        private Pipeline pipeline; 
        private Source source; 
        private Long toTime; 

        private Builder() {
            super();
        } 

        private Builder(PreviewPipelineRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.fromTime = request.fromTime;
            this.pipeline = request.pipeline;
            this.source = request.source;
            this.toTime = request.toTime;
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
         * fromTime.
         */
        public Builder fromTime(Long fromTime) {
            this.putBodyParameter("fromTime", fromTime);
            this.fromTime = fromTime;
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
         * source.
         */
        public Builder source(Source source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * toTime.
         */
        public Builder toTime(Long toTime) {
            this.putBodyParameter("toTime", toTime);
            this.toTime = toTime;
            return this;
        }

        @Override
        public PreviewPipelineRequest build() {
            return new PreviewPipelineRequest(this);
        } 

    } 

    /**
     * 
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
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
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
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
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
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
             * logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
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
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
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
