// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesByOutputResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesByOutputResponseBody</p>
 */
public class ListNodesByOutputResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

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
         * The ID of the request. You can use the ID to locate logs and troubleshoot issues.
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

        public ListNodesByOutputResponseBody build() {
            return new ListNodesByOutputResponseBody(this);
        } 

    } 

    public static class NodeList extends TeaModel {
        @NameInMap("BaselineId")
        private Long baselineId;

        @NameInMap("Connection")
        private String connection;

        @NameInMap("CronExpress")
        private String cronExpress;

        @NameInMap("Description")
        private String description;

        @NameInMap("DqcDescription")
        private String dqcDescription;

        @NameInMap("DqcType")
        private Integer dqcType;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("ParamValues")
        private String paramValues;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ProgramType")
        private String programType;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("RelatedFlowId")
        private Long relatedFlowId;

        @NameInMap("RepeatInterval")
        private Integer repeatInterval;

        @NameInMap("Repeatability")
        private Boolean repeatability;

        @NameInMap("ResGroupName")
        private String resGroupName;

        @NameInMap("SchedulerType")
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
             * The ID of the baseline.
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
             * The cron expression.
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
             * Indicates whether the node is associated with Data Quality. Valid values: 0 and 1. The value 0 indicates that node is associated with Data Quality, and the value 1 indicates that the node is not associated with Data Quality.
             */
            public Builder dqcType(Integer dqcType) {
                this.dqcType = dqcType;
                return this;
            }

            /**
             * The type of the node.
             * <p>
             * 
             * Valid values:
             * 
             * 6 (Shell node), 10 (ODPS SQL node), 11 (ODPS MR node), 23 (Data Integration node), 24 (ODPS Script node), 99 (zero-load node), 221 (PyODPS 2 node), 225 (ODPS Spark node), 227 (EMR Hive node), 228 (EMR Spark node), 229 (EMR Spark SQL node), 230 (EMR MR node), 239 (OSS object inspection node), 257 (EMR Shell node), 258 (EMR Spark Shell node), 259 (EMR Presto node), 260 (EMR Impala node), 900 (real-time synchronization node), 1089 (cross-tenant collaboration node), 1091 (Hologres development node), 1093 (Hologres SQL node), 1100 (assignment node), and 1221 (PyODPS 3 node).
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
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
             * The ID of the node owner.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The values of the scheduling parameters configured for the node.
             */
            public Builder paramValues(String paramValues) {
                this.paramValues = paramValues;
                return this;
            }

            /**
             * The priority of the node. Valid values: 1, 3, 5, 7, and 8. A large value indicates a high priority. Default value: 1.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The type of the node. This parameter is deprecated. For more information about node types, see the valid values of FileType.
             */
            public Builder programType(String programType) {
                this.programType = programType;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The ID of the associated workflow.
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
             * *   NORAMAL: The node is an auto triggered node. The node is scheduled on a regular basis.
             * *   MANUAL: The node is a manually triggered node. The node is not scheduled on a regular basis.
             * *   PAUSE: The node is a frozen node. The system schedules the node on a regular basis but sets it to FAILURE when the system starts to schedule it.
             * *   SKIP: The node is a dry-run node. The system schedules the node on a regular basis but sets it to SUCCESS when the system starts to schedule it.
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
        @NameInMap("NodeList")
        private java.util.List < NodeList> nodeList;

        @NameInMap("Output")
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
             * The information of the nodes returned.
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
