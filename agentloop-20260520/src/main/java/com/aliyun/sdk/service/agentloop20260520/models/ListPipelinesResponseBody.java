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
 * {@link ListPipelinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelinesResponseBody</p>
 */
public class ListPipelinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("pipelines")
    private java.util.List<Pipelines> pipelines;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListPipelinesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pipelines = builder.pipelines;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelinesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pipelines
     */
    public java.util.List<Pipelines> getPipelines() {
        return this.pipelines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Pipelines> pipelines; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPipelinesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pipelines = model.pipelines;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * pipelines.
         */
        public Builder pipelines(java.util.List<Pipelines> pipelines) {
            this.pipelines = pipelines;
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
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPipelinesResponseBody build() {
            return new ListPipelinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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

            public DefaultSink build() {
                return new DefaultSink(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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

            public SinkDataset build() {
                return new SinkDataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private SinkDataset dataset;

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

            private Builder(Sink model) {
                this.dataset = model.dataset;
                this.type = model.type;
            } 

            /**
             * dataset.
             */
            public Builder dataset(SinkDataset dataset) {
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("sink")
        private Sink sink;

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
        public Sink getSink() {
            return this.sink;
        }

        public static final class Builder {
            private String expression; 
            private String id; 
            private Sink sink; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.expression = model.expression;
                this.id = model.id;
                this.sink = model.sink;
            } 

            /**
             * expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * sink.
             */
            public Builder sink(Sink sink) {
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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
             * defaultSink.
             */
            public Builder defaultSink(DefaultSink defaultSink) {
                this.defaultSink = defaultSink;
                return this;
            }

            /**
             * matchMode.
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * routes.
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
     */
    public static class PipelinesSinkDataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private String dataset;

        private PipelinesSinkDataset(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.dataset = builder.dataset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelinesSinkDataset create() {
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

            private Builder(PipelinesSinkDataset model) {
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

            public PipelinesSinkDataset build() {
                return new PipelinesSinkDataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
     */
    public static class PipelinesSink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private Condition condition;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private PipelinesSinkDataset dataset;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PipelinesSink(Builder builder) {
            this.condition = builder.condition;
            this.dataset = builder.dataset;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelinesSink create() {
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
        public PipelinesSinkDataset getDataset() {
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
            private PipelinesSinkDataset dataset; 
            private String type; 

            private Builder() {
            } 

            private Builder(PipelinesSink model) {
                this.condition = model.condition;
                this.dataset = model.dataset;
                this.type = model.type;
            } 

            /**
             * condition.
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * dataset.
             */
            public Builder dataset(PipelinesSinkDataset dataset) {
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

            public PipelinesSink build() {
                return new PipelinesSink(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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
             * dataset.
             */
            public Builder dataset(String dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * filter.
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
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
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private SourceDataset dataset;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private Logstore logstore;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
            this.dataset = builder.dataset;
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
            private Logstore logstore; 
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.dataset = model.dataset;
                this.logstore = model.logstore;
                this.type = model.type;
            } 

            /**
             * dataset.
             */
            public Builder dataset(SourceDataset dataset) {
                this.dataset = dataset;
                return this;
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
    /**
     * 
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
     */
    public static class Pipelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("executePolicy")
        private ExecutePolicy executePolicy;

        @com.aliyun.core.annotation.NameInMap("pipelineName")
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("scheduleStatus")
        private String scheduleStatus;

        @com.aliyun.core.annotation.NameInMap("scheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("sink")
        private PipelinesSink sink;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Pipelines(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.executePolicy = builder.executePolicy;
            this.pipelineName = builder.pipelineName;
            this.regionId = builder.regionId;
            this.scheduleStatus = builder.scheduleStatus;
            this.scheduleType = builder.scheduleType;
            this.sink = builder.sink;
            this.source = builder.source;
            this.updateTime = builder.updateTime;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipelines create() {
            return builder().build();
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
         * @return scheduleStatus
         */
        public String getScheduleStatus() {
            return this.scheduleStatus;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return sink
         */
        public PipelinesSink getSink() {
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
            private String pipelineName; 
            private String regionId; 
            private String scheduleStatus; 
            private String scheduleType; 
            private PipelinesSink sink; 
            private Source source; 
            private String updateTime; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Pipelines model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.executePolicy = model.executePolicy;
                this.pipelineName = model.pipelineName;
                this.regionId = model.regionId;
                this.scheduleStatus = model.scheduleStatus;
                this.scheduleType = model.scheduleType;
                this.sink = model.sink;
                this.source = model.source;
                this.updateTime = model.updateTime;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
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
             * scheduleStatus.
             */
            public Builder scheduleStatus(String scheduleStatus) {
                this.scheduleStatus = scheduleStatus;
                return this;
            }

            /**
             * scheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * sink.
             */
            public Builder sink(PipelinesSink sink) {
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
             * <p>2026-01-02T00:00:00Z</p>
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

            public Pipelines build() {
                return new Pipelines(this);
            } 

        } 

    }
}
