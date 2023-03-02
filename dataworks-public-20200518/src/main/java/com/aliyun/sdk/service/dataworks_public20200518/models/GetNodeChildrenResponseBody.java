// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeChildrenResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeChildrenResponseBody</p>
 */
public class GetNodeChildrenResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * The information of the descendant nodes.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetNodeChildrenResponseBody build() {
            return new GetNodeChildrenResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("BaselineId")
        private Long baselineId;

        @NameInMap("CronExpress")
        private String cronExpress;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ProgramType")
        private String programType;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("Repeatability")
        private Boolean repeatability;

        @NameInMap("SchedulerType")
        private String schedulerType;

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

            /**
             * The ID of the baseline.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The cron expression. Cron expressions are used to run auto triggered nodes.
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the node owner.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The priority of the node. Valid values: 1 to 8. A large value indicates a high priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The type of the node.
             */
            public Builder programType(String programType) {
                this.programType = programType;
                return this;
            }

            /**
             * The ID of the workspace to which the node belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Indicates whether the node can be rerun if the node fails to run. Valid values:
             * <p>
             * 
             * *   true: indicates that the node can be rerun.
             * *   false: indicates that the node cannot be rerun.
             */
            public Builder repeatability(Boolean repeatability) {
                this.repeatability = repeatability;
                return this;
            }

            /**
             * The scheduling type of the node. Valid values:
             * <p>
             * 
             * *   NORMAL: indicates that the node is an auto triggered node.
             * *   MANUAL: indicates that node is a manually triggered node.
             * *   PAUSE: indicates that the node is a paused node. Paused nodes are started as scheduled but the system sets the status of the nodes to failed when it starts to run them.
             * *   SKIP: indicates that the node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

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
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List < Nodes> nodes; 

            /**
             * The descendant nodes returned.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
