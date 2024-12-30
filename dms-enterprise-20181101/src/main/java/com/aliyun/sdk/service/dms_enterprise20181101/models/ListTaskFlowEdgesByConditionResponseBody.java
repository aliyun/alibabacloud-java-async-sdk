// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListTaskFlowEdgesByConditionResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowEdgesByConditionResponseBody</p>
 */
public class ListTaskFlowEdgesByConditionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Edges")
    private Edges edges;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The list of task flow edges.</p>
         */
        public Builder edges(Edges edges) {
            this.edges = edges;
            return this;
        }

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
         * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D86249CD-422F-5ACF-85BA-9187C986AE0B</p>
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

        public ListTaskFlowEdgesByConditionResponseBody build() {
            return new ListTaskFlowEdgesByConditionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskFlowEdgesByConditionResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowEdgesByConditionResponseBody</p>
     */
    public static class Edge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NodeEnd")
        private Long nodeEnd;

        @com.aliyun.core.annotation.NameInMap("NodeFrom")
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
     * {@link ListTaskFlowEdgesByConditionResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowEdgesByConditionResponseBody</p>
     */
    public static class Edges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edge")
        private java.util.List<Edge> edge;

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
        public java.util.List<Edge> getEdge() {
            return this.edge;
        }

        public static final class Builder {
            private java.util.List<Edge> edge; 

            /**
             * Edge.
             */
            public Builder edge(java.util.List<Edge> edge) {
                this.edge = edge;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
}
