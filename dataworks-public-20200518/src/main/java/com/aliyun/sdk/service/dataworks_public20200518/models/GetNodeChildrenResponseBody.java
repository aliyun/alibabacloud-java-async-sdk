// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetNodeChildrenResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeChildrenResponseBody</p>
 */
public class GetNodeChildrenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetNodeChildrenResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeChildrenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetNodeChildrenResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The information about the descendant nodes.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1060010000000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>err</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>adsfasdf-adf-asdf-asdf-asdfadfasdd</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetNodeChildrenResponseBody build() {
            return new GetNodeChildrenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeChildrenResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeChildrenResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("CronExpress")
        private String cronExpress;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProgramType")
        private String programType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Repeatability")
        private Boolean repeatability;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("StepType")
        private String stepType;

        private Nodes(Builder builder) {
            this.baselineId = builder.baselineId;
            this.cronExpress = builder.cronExpress;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.ownerId = builder.ownerId;
            this.priority = builder.priority;
            this.programType = builder.programType;
            this.projectId = builder.projectId;
            this.repeatability = builder.repeatability;
            this.schedulerType = builder.schedulerType;
            this.stepType = builder.stepType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return cronExpress
         */
        public String getCronExpress() {
            return this.cronExpress;
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
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return programType
         */
        public String getProgramType() {
            return this.programType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return repeatability
         */
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return stepType
         */
        public String getStepType() {
            return this.stepType;
        }

        public static final class Builder {
            private Long baselineId; 
            private String cronExpress; 
            private Long nodeId; 
            private String nodeName; 
            private String ownerId; 
            private Integer priority; 
            private String programType; 
            private Long projectId; 
            private Boolean repeatability; 
            private String schedulerType; 
            private String stepType; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.baselineId = model.baselineId;
                this.cronExpress = model.cronExpress;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.ownerId = model.ownerId;
                this.priority = model.priority;
                this.programType = model.programType;
                this.projectId = model.projectId;
                this.repeatability = model.repeatability;
                this.schedulerType = model.schedulerType;
                this.stepType = model.stepType;
            } 

            /**
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345656</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The CRON expression. CRON expressions are used to run auto triggered nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>00 00 * * * *</p>
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1244564565</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>test_Node</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>123124561341251321</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The priority. Valid values: 1 to 8. A large value indicates a high priority.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder programType(String programType) {
                this.programType = programType;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12315412412</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Indicates whether the node can be rerun if the node fails to run. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder repeatability(Boolean repeatability) {
                this.repeatability = repeatability;
                return this;
            }

            /**
             * <p>The scheduling type of the node. Valid values:</p>
             * <ul>
             * <li>NORMAL: The node is an auto triggered node.</li>
             * <li>MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered.</li>
             * <li>PAUSE: The node is a paused node. Paused nodes are started as scheduled but the system sets the status of the nodes to failed when it starts to run them.</li>
             * <li>SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * <p>The scheduling dependency type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: same-cycle scheduling dependency</li>
             * <li><strong>3</strong>: cross-cycle scheduling dependency</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder stepType(String stepType) {
                this.stepType = stepType;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeChildrenResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeChildrenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        private Data(Builder builder) {
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

            private Builder(Data model) {
                this.nodes = model.nodes;
            } 

            /**
             * <p>The descendant nodes.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
