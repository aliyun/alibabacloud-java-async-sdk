// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link UpdateWorkflowDAGRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkflowDAGRequest</p>
 */
public class UpdateWorkflowDAGRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dag")
    @com.aliyun.core.annotation.Validation(required = true)
    private Dag dag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DagVersion")
    private String dagVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workflowId;

    private UpdateWorkflowDAGRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.dag = builder.dag;
        this.dagVersion = builder.dagVersion;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowDAGRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dag
     */
    public Dag getDag() {
        return this.dag;
    }

    /**
     * @return dagVersion
     */
    public String getDagVersion() {
        return this.dagVersion;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<UpdateWorkflowDAGRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String clusterId; 
        private Dag dag; 
        private String dagVersion; 
        private Long workflowId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowDAGRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.dag = request.dag;
            this.dagVersion = request.dagVersion;
            this.workflowId = request.workflowId;
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
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-a1804a3226d</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dag(Dag dag) {
            String dagShrink = shrink(dag, "Dag", "json");
            this.putBodyParameter("Dag", dagShrink);
            this.dag = dag;
            return this;
        }

        /**
         * DagVersion.
         */
        public Builder dagVersion(String dagVersion) {
            this.putBodyParameter("DagVersion", dagVersion);
            this.dagVersion = dagVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workflowId(Long workflowId) {
            this.putBodyParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public UpdateWorkflowDAGRequest build() {
            return new UpdateWorkflowDAGRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkflowDAGRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowDAGRequest</p>
     */
    public static class Edges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private Long source;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Long target;

        private Edges(Builder builder) {
            this.source = builder.source;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edges create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public Long getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public Long getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Long source; 
            private Long target; 

            private Builder() {
            } 

            private Builder(Edges model) {
                this.source = model.source;
                this.target = model.target;
            } 

            /**
             * Source.
             */
            public Builder source(Long source) {
                this.source = source;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Long target) {
                this.target = target;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowDAGRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowDAGRequest</p>
     */
    public static class Coordinate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        private Coordinate(Builder builder) {
            this.height = builder.height;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coordinate create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Float height; 
            private Float width; 
            private Float x; 
            private Float y; 

            private Builder() {
            } 

            private Builder(Coordinate model) {
                this.height = model.height;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public Coordinate build() {
                return new Coordinate(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowDAGRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowDAGRequest</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Coordinate")
        private Coordinate coordinate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private Nodes(Builder builder) {
            this.content = builder.content;
            this.coordinate = builder.coordinate;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return coordinate
         */
        public Coordinate getCoordinate() {
            return this.coordinate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String content; 
            private Coordinate coordinate; 
            private Long id; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.content = model.content;
                this.coordinate = model.coordinate;
                this.id = model.id;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Coordinate.
             */
            public Builder coordinate(Coordinate coordinate) {
                this.coordinate = coordinate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowDAGRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowDAGRequest</p>
     */
    public static class Dag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edges")
        private java.util.List<Edges> edges;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        private Dag(Builder builder) {
            this.edges = builder.edges;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dag create() {
            return builder().build();
        }

        /**
         * @return edges
         */
        public java.util.List<Edges> getEdges() {
            return this.edges;
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<Edges> edges; 
            private java.util.List<Nodes> nodes; 

            private Builder() {
            } 

            private Builder(Dag model) {
                this.edges = model.edges;
                this.nodes = model.nodes;
            } 

            /**
             * Edges.
             */
            public Builder edges(java.util.List<Edges> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Dag build() {
                return new Dag(this);
            } 

        } 

    }
}
