// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksResponseBody</p>
 */
public class ListTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksResponseBody create() {
        return builder().build();
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
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < Tasks> tasks; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of task information.
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * The total number of entries of the task.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTasksResponseBody build() {
            return new ListTasksResponseBody(this);
        } 

    } 

    public static class Tasks extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CurrentStep")
        private Integer currentStep;

        @NameInMap("Errors")
        private String errors;

        @NameInMap("Request")
        private String request;

        @NameInMap("Result")
        private String result;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TotalSteps")
        private Integer totalSteps;

        private Tasks(Builder builder) {
            this.clusterId = builder.clusterId;
            this.currentStep = builder.currentStep;
            this.errors = builder.errors;
            this.request = builder.request;
            this.result = builder.result;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.totalSteps = builder.totalSteps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return currentStep
         */
        public Integer getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return errors
         */
        public String getErrors() {
            return this.errors;
        }

        /**
         * @return request
         */
        public String getRequest() {
            return this.request;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return totalSteps
         */
        public Integer getTotalSteps() {
            return this.totalSteps;
        }

        public static final class Builder {
            private String clusterId; 
            private Integer currentStep; 
            private String errors; 
            private String request; 
            private String result; 
            private String status; 
            private String taskId; 
            private String taskType; 
            private Integer totalSteps; 

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The current step of the task.
             */
            public Builder currentStep(Integer currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * The list of error messages returned for the task.
             * <p>
             * 
             * For information about error messages and their solutions, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/EHPC).
             */
            public Builder errors(String errors) {
                this.errors = errors;
                return this;
            }

            /**
             * The request parameters of the task. The value is a JSON string.
             */
            public Builder request(String request) {
                this.request = request;
                return this;
            }

            /**
             * The result of the task. Valid values:
             * <p>
             * 
             * *   If TaskType is set to CreateCluster and AddComputes, the value is in the `{\"Instances\":[]}` format, which indicates the information of the nodes added to the cluster.
             * *   If TaskType is set to a value other than CreateCluster and AddComputes, the value is in the `{}` format.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   Processing: The task is running.
             * *   Success: The task is completed.
             * *   Fail: The task failed.
             * *   PartialFail: The task partially failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   CreateCluster: creates a cluster by calling the [CreateCluster](~~87100~~) operation.
             * *   StartCluster: starts a cluster by calling the [StartCluster](~~200345~~) operation.
             * *   StopCluster: stops a cluster by calling the [StopCluster](~~200346~~) operation.
             * *   DeleteCluster: releases a cluster by calling the [DeleteCluster](~~87110~~) operation.
             * *   AddComputes: adds nodes to a cluster by calling the [AddNodes](~~87147~~) operation.
             * *   StartComputes: starts nodes by calling the [StartNodes](~~87159~~) operation.
             * *   ResetCompute: resets nodes by calling the [ResetNodes](~~87158~~) operation.
             * *   StopComputes: stops nodes by calling the [StopNodes](~~87160~~) operation.
             * *   DeleteComputes: deletes nodes by calling the [DeleteNodes](~~87155~~) operation.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The total number of steps of the task.
             */
            public Builder totalSteps(Integer totalSteps) {
                this.totalSteps = totalSteps;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
