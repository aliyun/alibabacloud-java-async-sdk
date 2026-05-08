// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineResponseBody</p>
 */
public class GetPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("executePolicy")
    private ExecutePolicy executePolicy;

    @com.aliyun.core.annotation.NameInMap("pipeline")
    private Pipeline pipeline;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sink")
    private Sink sink;

    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private GetPipelineResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.executePolicy = builder.executePolicy;
        this.pipeline = builder.pipeline;
        this.pipelineName = builder.pipelineName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.sink = builder.sink;
        this.source = builder.source;
        this.updateTime = builder.updateTime;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private ExecutePolicy executePolicy; 
        private Pipeline pipeline; 
        private String pipelineName; 
        private String regionId; 
        private String requestId; 
        private Sink sink; 
        private Source source; 
        private String updateTime; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(GetPipelineResponseBody model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.executePolicy = model.executePolicy;
            this.pipeline = model.pipeline;
            this.pipelineName = model.pipelineName;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.sink = model.sink;
            this.source = model.source;
            this.updateTime = model.updateTime;
            this.workspace = model.workspace;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * executePolicy.
         */
        public Builder executePolicy(ExecutePolicy executePolicy) {
            this.executePolicy = executePolicy;
            return this;
        }

        /**
         * pipeline.
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sink.
         */
        public Builder sink(Sink sink) {
            this.sink = sink;
            return this;
        }

        /**
         * source.
         */
        public Builder source(Source source) {
            this.source = source;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T14:09:11Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetPipelineResponseBody build() {
            return new GetPipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
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
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
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
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
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
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
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
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
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
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
     */
    public static class Dataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private String dataset;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Dataset(Builder builder) {
            this.dataset = builder.dataset;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dataset create() {
            return builder().build();
        }

        /**
         * @return dataset
         */
        public String getDataset() {
            return this.dataset;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String dataset; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Dataset model) {
                this.dataset = model.dataset;
                this.workspace = model.workspace;
            } 

            /**
             * dataset.
             */
            public Builder dataset(String dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
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
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
     */
    public static class Logstore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private Logstore(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
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

        public static final class Builder {
            private String logstore; 
            private String project; 

            private Builder() {
            } 

            private Builder(Logstore model) {
                this.logstore = model.logstore;
                this.project = model.project;
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

            public Logstore build() {
                return new Logstore(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
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
