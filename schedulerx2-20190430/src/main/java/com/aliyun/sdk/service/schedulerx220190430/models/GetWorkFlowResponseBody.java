// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkFlowResponseBody</p>
 */
public class GetWorkFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * 错误码
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * 工作流的数据
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 会否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkFlowResponseBody build() {
            return new GetWorkFlowResponseBody(this);
        } 

    } 

    public static class WorkFlowInfo extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        @NameInMap("TimeExpression")
        private String timeExpression;

        @NameInMap("TimeType")
        private String timeType;

        @NameInMap("WorkflowId")
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
             * 工作流描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 工作流名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 工作流状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 工作流时间表达式
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * 工作流时间类型
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * 工作流ID
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
    public static class Edges extends TeaModel {
        @NameInMap("Source")
        private Long source;

        @NameInMap("Target")
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
             * 起始任务ID
             */
            public Builder source(Long source) {
                this.source = source;
                return this;
            }

            /**
             * 目的任务ID
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
    public static class Nodes extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Label")
        private String label;

        @NameInMap("Status")
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
             * 任务ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 任务名称
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * 任务状态
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
    public static class WorkFlowNodeInfo extends TeaModel {
        @NameInMap("Edges")
        private java.util.List < Edges> edges;

        @NameInMap("Nodes")
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
             * 工作流边列表
             */
            public Builder edges(java.util.List < Edges> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * 工作流节点列表
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
    public static class Data extends TeaModel {
        @NameInMap("WorkFlowInfo")
        private WorkFlowInfo workFlowInfo;

        @NameInMap("WorkFlowNodeInfo")
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
             * 工作流基本信息
             */
            public Builder workFlowInfo(WorkFlowInfo workFlowInfo) {
                this.workFlowInfo = workFlowInfo;
                return this;
            }

            /**
             * 工作流节点信息
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
