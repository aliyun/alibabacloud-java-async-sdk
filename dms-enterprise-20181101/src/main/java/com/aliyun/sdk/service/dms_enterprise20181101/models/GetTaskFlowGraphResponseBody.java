// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTaskFlowGraphResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskFlowGraphResponseBody</p>
 */
public class GetTaskFlowGraphResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskFlowGraph")
    private TaskFlowGraph taskFlowGraph;

    private GetTaskFlowGraphResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskFlowGraph = builder.taskFlowGraph;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskFlowGraphResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return taskFlowGraph
     */
    public TaskFlowGraph getTaskFlowGraph() {
        return this.taskFlowGraph;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private TaskFlowGraph taskFlowGraph; 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D9D91166-A626-5F4E-9CA6-7AB10C59DBD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The list of DAG variables of the task flow.</p>
         */
        public Builder taskFlowGraph(TaskFlowGraph taskFlowGraph) {
            this.taskFlowGraph = taskFlowGraph;
            return this;
        }

        public GetTaskFlowGraphResponseBody build() {
            return new GetTaskFlowGraphResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskFlowGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskFlowGraphResponseBody</p>
     */
    public static class Edge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NodeEnd")
        private Long nodeEnd;

        @com.aliyun.core.annotation.NameInMap("NodeFrom")
        private Long nodeFrom;

        private Edge(Builder builder) {
            this.dagId = builder.dagId;
            this.id = builder.id;
            this.nodeEnd = builder.nodeEnd;
            this.nodeFrom = builder.nodeFrom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edge create() {
            return builder().build();
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return nodeEnd
         */
        public Long getNodeEnd() {
            return this.nodeEnd;
        }

        /**
         * @return nodeFrom
         */
        public Long getNodeFrom() {
            return this.nodeFrom;
        }

        public static final class Builder {
            private Long dagId; 
            private Long id; 
            private Long nodeEnd; 
            private Long nodeFrom; 

            /**
             * <p>The ID of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>15***</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The ID of the task flow edge.</p>
             * 
             * <strong>example:</strong>
             * <p>24***</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the end node on the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>44***</p>
             */
            public Builder nodeEnd(Long nodeEnd) {
                this.nodeEnd = nodeEnd;
                return this;
            }

            /**
             * <p>The ID of the start node on the edge.</p>
             * 
             * <strong>example:</strong>
             * <p>44***</p>
             */
            public Builder nodeFrom(Long nodeFrom) {
                this.nodeFrom = nodeFrom;
                return this;
            }

            public Edge build() {
                return new Edge(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskFlowGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskFlowGraphResponseBody</p>
     */
    public static class Edges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edge")
        private java.util.List < Edge> edge;

        private Edges(Builder builder) {
            this.edge = builder.edge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edges create() {
            return builder().build();
        }

        /**
         * @return edge
         */
        public java.util.List < Edge> getEdge() {
            return this.edge;
        }

        public static final class Builder {
            private java.util.List < Edge> edge; 

            /**
             * Edge.
             */
            public Builder edge(java.util.List < Edge> edge) {
                this.edge = edge;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskFlowGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskFlowGraphResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("GraphParam")
        private String graphParam;

        @com.aliyun.core.annotation.NameInMap("NodeConfig")
        private String nodeConfig;

        @com.aliyun.core.annotation.NameInMap("NodeContent")
        private String nodeContent;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Long nodeType;

        @com.aliyun.core.annotation.NameInMap("TimeVariables")
        private String timeVariables;

        private Node(Builder builder) {
            this.dagId = builder.dagId;
            this.graphParam = builder.graphParam;
            this.nodeConfig = builder.nodeConfig;
            this.nodeContent = builder.nodeContent;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.timeVariables = builder.timeVariables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return graphParam
         */
        public String getGraphParam() {
            return this.graphParam;
        }

        /**
         * @return nodeConfig
         */
        public String getNodeConfig() {
            return this.nodeConfig;
        }

        /**
         * @return nodeContent
         */
        public String getNodeContent() {
            return this.nodeContent;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeType
         */
        public Long getNodeType() {
            return this.nodeType;
        }

        /**
         * @return timeVariables
         */
        public String getTimeVariables() {
            return this.timeVariables;
        }

        public static final class Builder {
            private Long dagId; 
            private String graphParam; 
            private String nodeConfig; 
            private String nodeContent; 
            private Long nodeId; 
            private String nodeName; 
            private Long nodeType; 
            private String timeVariables; 

            /**
             * <p>The ID of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>15***</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The position of the node in the DAG.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;x&quot;:541,&quot;y&quot;:322,&quot;layoutType&quot;:&quot;Horizontal&quot;}</p>
             */
            public Builder graphParam(String graphParam) {
                this.graphParam = graphParam;
                return this;
            }

            /**
             * <p>The advanced configuration of the node.</p>
             */
            public Builder nodeConfig(String nodeConfig) {
                this.nodeConfig = nodeConfig;
                return this;
            }

            /**
             * <p>The configuration of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>{ODI3OTNRVC****UHVFT29&quot;}</p>
             */
            public Builder nodeContent(String nodeContent) {
                this.nodeContent = nodeContent;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>44***</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The type of the node. For more information about the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/424705.html">NodeType parameter</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder nodeType(Long nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The time variables for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;variables&quot;:[{&quot;name&quot;:&quot;Today&quot;,&quot;pattern&quot;:&quot;yyyy-MM-dd|+1d&quot;}]}</p>
             */
            public Builder timeVariables(String timeVariables) {
                this.timeVariables = timeVariables;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskFlowGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskFlowGraphResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Node")
        private java.util.List < Node> node;

        private Nodes(Builder builder) {
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return node
         */
        public java.util.List < Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List < Node> node; 

            /**
             * Node.
             */
            public Builder node(java.util.List < Node> node) {
                this.node = node;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskFlowGraphResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskFlowGraphResponseBody</p>
     */
    public static class TaskFlowGraph extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanEdit")
        private Boolean canEdit;

        @com.aliyun.core.annotation.NameInMap("DagName")
        private String dagName;

        @com.aliyun.core.annotation.NameInMap("Edges")
        private Edges edges;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private Nodes nodes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private TaskFlowGraph(Builder builder) {
            this.canEdit = builder.canEdit;
            this.dagName = builder.dagName;
            this.edges = builder.edges;
            this.nodes = builder.nodes;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFlowGraph create() {
            return builder().build();
        }

        /**
         * @return canEdit
         */
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        /**
         * @return dagName
         */
        public String getDagName() {
            return this.dagName;
        }

        /**
         * @return edges
         */
        public Edges getEdges() {
            return this.edges;
        }

        /**
         * @return nodes
         */
        public Nodes getNodes() {
            return this.nodes;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean canEdit; 
            private String dagName; 
            private Edges edges; 
            private Nodes nodes; 
            private Long status; 

            /**
             * <p>Indicates whether the task flow is editable. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: editable</li>
             * <li><strong>false</strong>: non-editable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canEdit(Boolean canEdit) {
                this.canEdit = canEdit;
                return this;
            }

            /**
             * <p>The name of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * <p>The list of task flow edges.</p>
             */
            public Builder edges(Edges edges) {
                this.edges = edges;
                return this;
            }

            /**
             * <p>The node list of the task flow.</p>
             */
            public Builder nodes(Nodes nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The status of the task flow. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invalid</li>
             * <li><strong>1</strong>: not scheduled</li>
             * <li><strong>2</strong>: to be scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public TaskFlowGraph build() {
                return new TaskFlowGraph(this);
            } 

        } 

    }
}
