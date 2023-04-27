// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowEdgesByConditionResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowEdgesByConditionResponseBody</p>
 */
public class ListTaskFlowEdgesByConditionResponseBody extends TeaModel {
    @NameInMap("Edges")
    private Edges edges;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListTaskFlowEdgesByConditionResponseBody(Builder builder) {
        this.edges = builder.edges;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowEdgesByConditionResponseBody create() {
        return builder().build();
    }

    /**
     * @return edges
     */
    public Edges getEdges() {
        return this.edges;
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

    public static final class Builder {
        private Edges edges; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Edges.
         */
        public Builder edges(Edges edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The ID of the end node on the edge.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the start node on the edge.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The list of task flow edges.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to locate logs and troubleshoot issues.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTaskFlowEdgesByConditionResponseBody build() {
            return new ListTaskFlowEdgesByConditionResponseBody(this);
        } 

    } 

    public static class Edge extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("NodeEnd")
        private Long nodeEnd;

        @NameInMap("NodeFrom")
        private Long nodeFrom;

        private Edge(Builder builder) {
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
            private Long id; 
            private Long nodeEnd; 
            private Long nodeFrom; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * NodeEnd.
             */
            public Builder nodeEnd(Long nodeEnd) {
                this.nodeEnd = nodeEnd;
                return this;
            }

            /**
             * NodeFrom.
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
    public static class Edges extends TeaModel {
        @NameInMap("Edge")
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
}
