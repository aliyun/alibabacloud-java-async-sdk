// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesByOutputResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesByOutputResponseBody</p>
 */
public class ListNodesByOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

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

    private ListNodesByOutputResponseBody(Builder builder) {
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

    public static ListNodesByOutputResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The nodes returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListNodesByOutputResponseBody build() {
            return new ListNodesByOutputResponseBody(this);
        } 

    } 

    public static class NodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("Connection")
        private String connection;

        @com.aliyun.core.annotation.NameInMap("CronExpress")
        private String cronExpress;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DqcDescription")
        private String dqcDescription;

        @com.aliyun.core.annotation.NameInMap("DqcType")
        private Integer dqcType;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("ParamValues")
        private String paramValues;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProgramType")
        private String programType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RelatedFlowId")
        private Long relatedFlowId;

        @com.aliyun.core.annotation.NameInMap("RepeatInterval")
        private Integer repeatInterval;

        @com.aliyun.core.annotation.NameInMap("Repeatability")
        private Boolean repeatability;

        @com.aliyun.core.annotation.NameInMap("ResGroupName")
        private String resGroupName;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        private NodeList(Builder builder) {
            this.baselineId = builder.baselineId;
            this.connection = builder.connection;
            this.cronExpress = builder.cronExpress;
            this.description = builder.description;
            this.dqcDescription = builder.dqcDescription;
            this.dqcType = builder.dqcType;
            this.fileType = builder.fileType;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.ownerId = builder.ownerId;
            this.paramValues = builder.paramValues;
            this.priority = builder.priority;
            this.programType = builder.programType;
            this.projectId = builder.projectId;
            this.relatedFlowId = builder.relatedFlowId;
            this.repeatInterval = builder.repeatInterval;
            this.repeatability = builder.repeatability;
            this.resGroupName = builder.resGroupName;
            this.schedulerType = builder.schedulerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeList create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return connection
         */
        public String getConnection() {
            return this.connection;
        }

        /**
         * @return cronExpress
         */
        public String getCronExpress() {
            return this.cronExpress;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dqcDescription
         */
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        /**
         * @return dqcType
         */
        public Integer getDqcType() {
            return this.dqcType;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
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
         * @return paramValues
         */
        public String getParamValues() {
            return this.paramValues;
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
         * @return relatedFlowId
         */
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        /**
         * @return repeatInterval
         */
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

        /**
         * @return repeatability
         */
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        /**
         * @return resGroupName
         */
        public String getResGroupName() {
            return this.resGroupName;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public static final class Builder {
            private Long baselineId; 
            private String connection; 
            private String cronExpress; 
            private String description; 
            private String dqcDescription; 
            private Integer dqcType; 
            private String fileType; 
            private Long nodeId; 
            private String nodeName; 
            private String ownerId; 
            private String paramValues; 
            private Integer priority; 
            private String programType; 
            private Long projectId; 
            private Long relatedFlowId; 
            private Integer repeatInterval; 
            private Boolean repeatability; 
            private String resGroupName; 
            private String schedulerType; 

            /**
             * The baseline ID.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * The CRON expression.
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * The description of the node.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The table and partition filter expression in Data Quality that are associated with the node.
             */
            public Builder dqcDescription(String dqcDescription) {
                this.dqcDescription = dqcDescription;
                return this;
            }

            /**
             * Indicates whether the node is associated with a monitoring rule in Data Quality. Valid values: 0 and 1. The value 0 indicates that the node is associated with a monitoring rule in Data Quality. The value 1 indicates that the node is not associated with a monitoring rule in Data Quality.
             */
            public Builder dqcType(Integer dqcType) {
                this.dqcType = dqcType;
                return this;
            }

            /**
             * The node type. Valid values:
             * <p>
             * 
             * 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * The node ID.
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
             * The owner ID.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The scheduling parameters of the node.
             */
            public Builder paramValues(String paramValues) {
                this.paramValues = paramValues;
                return this;
            }

            /**
             * The priority of the node. Valid values: 1, 3, 5, 7, and 8. A greater value indicates a higher priority. Default value: 1.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The node type. This parameter is deprecated. For more information about node types, see valid values of the FileType parameter.
             */
            public Builder programType(String programType) {
                this.programType = programType;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The ID of the workflow to which the node belongs.
             */
            public Builder relatedFlowId(Long relatedFlowId) {
                this.relatedFlowId = relatedFlowId;
                return this;
            }

            /**
             * The interval at which the node is rerun after the node fails to run.
             */
            public Builder repeatInterval(Integer repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * Indicates whether the node can be rerun.
             */
            public Builder repeatability(Boolean repeatability) {
                this.repeatability = repeatability;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder resGroupName(String resGroupName) {
                this.resGroupName = resGroupName;
                return this;
            }

            /**
             * The scheduling type of the node. Valid values:
             * <p>
             * 
             * *   NORMAL: The node is an auto triggered node. The scheduling system regularly runs the node.
             * *   MANUAL: The node is a manually triggered node. The scheduling system does not regularly run the node.
             * *   PAUSE: The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.
             * *   SKIP: The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeList")
        private java.util.List < NodeList> nodeList;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private Data(Builder builder) {
            this.nodeList = builder.nodeList;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nodeList
         */
        public java.util.List < NodeList> getNodeList() {
            return this.nodeList;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private java.util.List < NodeList> nodeList; 
            private String output; 

            /**
             * The information about the nodes returned.
             */
            public Builder nodeList(java.util.List < NodeList> nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            /**
             * The output name of the current node.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
