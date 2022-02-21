// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionPlanInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionPlanInstancesResponseBody</p>
 */
public class ListExecutionPlanInstancesResponseBody extends TeaModel {
    @NameInMap("ExecutionPlanInstances")
    private ExecutionPlanInstances executionPlanInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListExecutionPlanInstancesResponseBody(Builder builder) {
        this.executionPlanInstances = builder.executionPlanInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionPlanInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return executionPlanInstances
     */
    public ExecutionPlanInstances getExecutionPlanInstances() {
        return this.executionPlanInstances;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ExecutionPlanInstances executionPlanInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ExecutionPlanInstances.
         */
        public Builder executionPlanInstances(ExecutionPlanInstances executionPlanInstances) {
            this.executionPlanInstances = executionPlanInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExecutionPlanInstancesResponseBody build() {
            return new ListExecutionPlanInstancesResponseBody(this);
        } 

    } 

    public static class ExecutionPlanInstance extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("ExecutionPlanId")
        private String executionPlanId;

        @NameInMap("ExecutionPlanName")
        private String executionPlanName;

        @NameInMap("Id")
        private String id;

        @NameInMap("LogEnable")
        private Boolean logEnable;

        @NameInMap("LogPath")
        private String logPath;

        @NameInMap("RunTime")
        private Integer runTime;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("WorkflowApp")
        private String workflowApp;

        private ExecutionPlanInstance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.executionPlanId = builder.executionPlanId;
            this.executionPlanName = builder.executionPlanName;
            this.id = builder.id;
            this.logEnable = builder.logEnable;
            this.logPath = builder.logPath;
            this.runTime = builder.runTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.workflowApp = builder.workflowApp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionPlanInstance create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return executionPlanId
         */
        public String getExecutionPlanId() {
            return this.executionPlanId;
        }

        /**
         * @return executionPlanName
         */
        public String getExecutionPlanName() {
            return this.executionPlanName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return logEnable
         */
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        /**
         * @return logPath
         */
        public String getLogPath() {
            return this.logPath;
        }

        /**
         * @return runTime
         */
        public Integer getRunTime() {
            return this.runTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workflowApp
         */
        public String getWorkflowApp() {
            return this.workflowApp;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private String executionPlanId; 
            private String executionPlanName; 
            private String id; 
            private Boolean logEnable; 
            private String logPath; 
            private Integer runTime; 
            private Long startTime; 
            private String status; 
            private String workflowApp; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * ExecutionPlanId.
             */
            public Builder executionPlanId(String executionPlanId) {
                this.executionPlanId = executionPlanId;
                return this;
            }

            /**
             * ExecutionPlanName.
             */
            public Builder executionPlanName(String executionPlanName) {
                this.executionPlanName = executionPlanName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LogEnable.
             */
            public Builder logEnable(Boolean logEnable) {
                this.logEnable = logEnable;
                return this;
            }

            /**
             * LogPath.
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * RunTime.
             */
            public Builder runTime(Integer runTime) {
                this.runTime = runTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WorkflowApp.
             */
            public Builder workflowApp(String workflowApp) {
                this.workflowApp = workflowApp;
                return this;
            }

            public ExecutionPlanInstance build() {
                return new ExecutionPlanInstance(this);
            } 

        } 

    }
    public static class ExecutionPlanInstances extends TeaModel {
        @NameInMap("ExecutionPlanInstance")
        private java.util.List < ExecutionPlanInstance> executionPlanInstance;

        private ExecutionPlanInstances(Builder builder) {
            this.executionPlanInstance = builder.executionPlanInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionPlanInstances create() {
            return builder().build();
        }

        /**
         * @return executionPlanInstance
         */
        public java.util.List < ExecutionPlanInstance> getExecutionPlanInstance() {
            return this.executionPlanInstance;
        }

        public static final class Builder {
            private java.util.List < ExecutionPlanInstance> executionPlanInstance; 

            /**
             * ExecutionPlanInstance.
             */
            public Builder executionPlanInstance(java.util.List < ExecutionPlanInstance> executionPlanInstance) {
                this.executionPlanInstance = executionPlanInstance;
                return this;
            }

            public ExecutionPlanInstances build() {
                return new ExecutionPlanInstances(this);
            } 

        } 

    }
}
