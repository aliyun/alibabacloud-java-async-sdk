// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWorkFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkFlowResponseBody</p>
 */
public class GetWorkFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkFlowResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Error codes</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data of the workflow.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>workflow is not existed</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>45678xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkFlowResponseBody build() {
            return new GetWorkFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkFlowResponseBody</p>
     */
    public static class WorkFlowInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeExpression")
        private String timeExpression;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private String timeType;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        private WorkFlowInfo(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.status = builder.status;
            this.timeExpression = builder.timeExpression;
            this.timeType = builder.timeType;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkFlowInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeExpression
         */
        public String getTimeExpression() {
            return this.timeExpression;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String status; 
            private String timeExpression; 
            private String timeType; 
            private Long workflowId; 

            /**
             * <p>The description of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>my first workflow</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>workflow_111</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time expression of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * <p>The time type of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>cron</p>
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * <p>The ID of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>1234xxx</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public WorkFlowInfo build() {
                return new WorkFlowInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkFlowResponseBody</p>
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

            /**
             * <p>The ID of the source job.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder source(Long source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the object job.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
     * {@link GetWorkFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkFlowResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Nodes(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
            this.status = builder.status;
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
        public Long getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long id; 
            private String label; 
            private Integer status; 

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>123456xxx</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>job_111</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The status of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkFlowResponseBody</p>
     */
    public static class WorkFlowNodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edges")
        private java.util.List < Edges> edges;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        private WorkFlowNodeInfo(Builder builder) {
            this.edges = builder.edges;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkFlowNodeInfo create() {
            return builder().build();
        }

        /**
         * @return edges
         */
        public java.util.List < Edges> getEdges() {
            return this.edges;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List < Edges> edges; 
            private java.util.List < Nodes> nodes; 

            /**
             * <p>The workflow edges.</p>
             */
            public Builder edges(java.util.List < Edges> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * <p>The list of workflow nodes.</p>
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public WorkFlowNodeInfo build() {
                return new WorkFlowNodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkFlowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WorkFlowInfo")
        private WorkFlowInfo workFlowInfo;

        @com.aliyun.core.annotation.NameInMap("WorkFlowNodeInfo")
        private WorkFlowNodeInfo workFlowNodeInfo;

        private Data(Builder builder) {
            this.workFlowInfo = builder.workFlowInfo;
            this.workFlowNodeInfo = builder.workFlowNodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return workFlowInfo
         */
        public WorkFlowInfo getWorkFlowInfo() {
            return this.workFlowInfo;
        }

        /**
         * @return workFlowNodeInfo
         */
        public WorkFlowNodeInfo getWorkFlowNodeInfo() {
            return this.workFlowNodeInfo;
        }

        public static final class Builder {
            private WorkFlowInfo workFlowInfo; 
            private WorkFlowNodeInfo workFlowNodeInfo; 

            /**
             * <p>The basic information of the workflow.</p>
             */
            public Builder workFlowInfo(WorkFlowInfo workFlowInfo) {
                this.workFlowInfo = workFlowInfo;
                return this;
            }

            /**
             * <p>The node information of the workflow.</p>
             */
            public Builder workFlowNodeInfo(WorkFlowNodeInfo workFlowNodeInfo) {
                this.workFlowNodeInfo = workFlowNodeInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
