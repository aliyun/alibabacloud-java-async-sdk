// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInnerNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInnerNodesResponseBody</p>
 */
public class ListInnerNodesResponseBody extends TeaModel {
    @NameInMap("Paging")
    private Paging paging;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListInnerNodesResponseBody(Builder builder) {
        this.paging = builder.paging;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInnerNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return paging
     */
    public Paging getPaging() {
        return this.paging;
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
        private Paging paging; 
        private String requestId; 
        private Boolean success; 

        /**
         * The paging information.
         */
        public Builder paging(Paging paging) {
            this.paging = paging;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
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

        public ListInnerNodesResponseBody build() {
            return new ListInnerNodesResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("BaselineId")
        private Long baselineId;

        @NameInMap("BusinessId")
        private Long businessId;

        @NameInMap("Connection")
        private String connection;

        @NameInMap("CronExpress")
        private String cronExpress;

        @NameInMap("Description")
        private String description;

        @NameInMap("DqcDescription")
        private String dqcDescription;

        @NameInMap("DqcType")
        private String dqcType;

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

        @NameInMap("RepeatInterval")
        private Long repeatInterval;

        @NameInMap("Repeatability")
        private Boolean repeatability;

        @NameInMap("ResGroupName")
        private String resGroupName;

        @NameInMap("SchedulerType")
        private String schedulerType;

        private Nodes(Builder builder) {
            this.baselineId = builder.baselineId;
            this.businessId = builder.businessId;
            this.connection = builder.connection;
            this.cronExpress = builder.cronExpress;
            this.description = builder.description;
            this.dqcDescription = builder.dqcDescription;
            this.dqcType = builder.dqcType;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.ownerId = builder.ownerId;
            this.paramValues = builder.paramValues;
            this.priority = builder.priority;
            this.programType = builder.programType;
            this.projectId = builder.projectId;
            this.repeatInterval = builder.repeatInterval;
            this.repeatability = builder.repeatability;
            this.resGroupName = builder.resGroupName;
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
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
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
        public String getDqcType() {
            return this.dqcType;
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
         * @return repeatInterval
         */
        public Long getRepeatInterval() {
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
            private Long businessId; 
            private String connection; 
            private String cronExpress; 
            private String description; 
            private String dqcDescription; 
            private String dqcType; 
            private Long nodeId; 
            private String nodeName; 
            private String ownerId; 
            private String paramValues; 
            private Integer priority; 
            private String programType; 
            private Long projectId; 
            private Long repeatInterval; 
            private Boolean repeatability; 
            private String resGroupName; 
            private String schedulerType; 

            /**
             * The ID of the baseline with which the inner node is associated.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The ID of the workflow.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * The connection string.
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
             * The description of the inner node.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The table and partition filter expression in Data Quality that are associated with the inner node.
             */
            public Builder dqcDescription(String dqcDescription) {
                this.dqcDescription = dqcDescription;
                return this;
            }

            /**
             * Indicates whether the node is associated with Data Quality. Valid values: 0 and 1. The value 0 indicates that the node is associated with Data Quality. The value 1 indicates that the node is not associated with Data Quality.
             */
            public Builder dqcType(String dqcType) {
                this.dqcType = dqcType;
                return this;
            }

            /**
             * The ID of the inner node.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the inner node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The ID of the owner of the inner node.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The values of other parameters related to the inner node.
             */
            public Builder paramValues(String paramValues) {
                this.paramValues = paramValues;
                return this;
            }

            /**
             * The priority of the inner node. Valid values: 1, 3, 5, 7, and 8.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The type of the inner node.
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
             * The interval at which the inner node is rerun after the inner node fails to be run.
             */
            public Builder repeatInterval(Long repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * Indicates whether the inner node can be rerun.
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
             * The scheduling type of the inner node. Valid values:
             * <p>
             * 
             * *   NORMAL: The inner node is an auto triggered node.
             * *   MANUAL: The inner node is a manually triggered node. Manually triggered nodes cannot be automatically triggered.
             * *   PAUSE: The inner node is a paused node.
             * *   SKIP: The inner node is a dry-run node. Dry-run nodes are started as scheduled but the scheduling system sets the status of the nodes to succeeded when the scheduling system starts to run the nodes.
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
    public static class Paging extends TeaModel {
        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Paging(Builder builder) {
            this.nodes = builder.nodes;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paging create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Nodes> nodes; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The list of inner nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of inner nodes returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Paging build() {
                return new Paging(this);
            } 

        } 

    }
}
