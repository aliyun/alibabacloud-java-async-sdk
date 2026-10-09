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
         * <p>The name of the AgentSpace where the pipeline is located.</p>
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
         * <p>The start time of the preview data window. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        public Builder fromTime(Long fromTime) {
            this.putBodyParameter("fromTime", fromTime);
            this.fromTime = fromTime;
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
         * <p>The data source of the pipeline.</p>
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
         * <p>The end time of the preview data window. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735747200</p>
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
             * <p>The parameters of the node. The parameters are in key-value format and vary based on the node type.</p>
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
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
     */
    public static class Dataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private String dataset;

        @com.aliyun.core.annotation.NameInMap("filter")
        private String filter;

        private Dataset(Builder builder) {
            this.dataset = builder.dataset;
            this.filter = builder.filter;
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

            private Builder(Dataset model) {
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

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
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
             * <p>The type of the field. Valid values: text, long, double, and json.</p>
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
             * <p>The filtered query statement (Simple Log Service query and analysis syntax).</p>
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
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
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
             * <p>The list of enrichment columns. This parameter is retained for compatibility. The current implementation outputs only the fixed agent_trajectory column, and this parameter no longer affects the output.</p>
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
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
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
             * <p>Trajectory enrichment: mounts trajectory data into the cleaning results based on the trace_id. When writing data to a dataset, the data is stored in the fixed agent_trajectory column, and the column value is the JSON content of the trajectory.</p>
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
     * {@link PreviewPipelineRequest} extends {@link TeaModel}
     *
     * <p>PreviewPipelineRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private Dataset dataset;

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
        public Dataset getDataset() {
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
            private Dataset dataset; 
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
             * <p>The dataset datasource config in the current AgentSpace.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dataset&quot;:&quot;my-dataset&quot;,&quot;filter&quot;:&quot;status = \&quot;pending\&quot;&quot;}</p>
             */
            public Builder dataset(Dataset dataset) {
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
             * <p>The configuration of trajectory data. This parameter is optional and takes effect only when the type is set to trace. It retrieves ATIF standard trajectory data from the trajectory cleaning service and extends the data based on features.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enrich&quot;:{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}}</p>
             */
            public Builder trajectory(Trajectory trajectory) {
                this.trajectory = trajectory;
                return this;
            }

            /**
             * <p>The type of the data source. Simple Log Service is currently supported.</p>
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
