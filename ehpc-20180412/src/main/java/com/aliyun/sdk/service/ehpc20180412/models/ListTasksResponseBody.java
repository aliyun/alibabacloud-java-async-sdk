// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksResponseBody</p>
 */
public class ListTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Tasks> getTasks() {
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
        private java.util.List<Tasks> tasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89A1AC0F-4A6C-4F3D-98F9-BEF9A823****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTasksResponseBody build() {
            return new ListTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CurrentStep")
        private Integer currentStep;

        @com.aliyun.core.annotation.NameInMap("Errors")
        private String errors;

        @com.aliyun.core.annotation.NameInMap("Request")
        private String request;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TotalSteps")
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

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.clusterId = model.clusterId;
                this.currentStep = model.currentStep;
                this.errors = model.errors;
                this.request = model.request;
                this.result = model.result;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.totalSteps = model.totalSteps;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-hz-FYUr32****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The current step of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder currentStep(Integer currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * <p>The error messages returned for the task.</p>
             * <p>You can view the error messages and the corresponding solutions in the <a href="https://error-center.alibabacloud.com/status/product/EHPC">Error Center</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder errors(String errors) {
                this.errors = errors;
                return this;
            }

            /**
             * <p>The request parameters of the task. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;requestId&quot;:&quot;0A6CA33E-BFBF-4F92-BDAE-4E8860DA****&quot;,&quot;uid&quot;:&quot;160998252992****&quot;,&quot;bid&quot;:&quot;268**&quot;,&quot;clusterId&quot;:&quot;ehpc-hz-ysQtcZ****&quot;}</p>
             */
            public Builder request(String request) {
                this.request = request;
                return this;
            }

            /**
             * <p>The result of the task. Valid values:</p>
             * <ul>
             * <li>If you set TaskType to CreateCluster or AddComputes, the value of this parameter is in the <code>{\&quot;Instances\&quot;:[]}</code> format. The value indicates the information about the nodes that are added to the cluster.</li>
             * <li>If you set TaskType to a value other than CreateCluster and AddComputes, the value of this parameter is in the <code>{}</code> format.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Instances&quot;:[{&quot;InstanceId&quot;:&quot;i-bp1inb1j2xz8pnoi****&quot;,&quot;Ip&quot;:&quot;192.168.<em>.</em>&quot;,&quot;Hostname&quot;:&quot;login0&quot;,&quot;role&quot;:&quot;login&quot;}]}</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li>Processing: The task is running.</li>
             * <li>Success: The task succeeded.</li>
             * <li>Failed: The task failed.</li>
             * <li>PartialFail: The task partially failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Processing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>CreateCluster: creates a cluster by calling the <a href="https://help.aliyun.com/document_detail/87100.html">CreateCluster</a> operation.</li>
             * <li>StartCluster: starts a cluster by calling the <a href="https://help.aliyun.com/document_detail/200345.html">StartCluster</a> operation.</li>
             * <li>StopCluster: stops a cluster by calling the <a href="https://help.aliyun.com/document_detail/200346.html">StopCluster</a> operation.</li>
             * <li>DeleteCluster: releases a cluster by calling the <a href="https://help.aliyun.com/document_detail/87110.html">DeleteCluster</a> operation.</li>
             * <li>AddComputes: adds nodes to a cluster by calling the <a href="https://help.aliyun.com/document_detail/87147.html">AddNodes</a> operation.</li>
             * <li>StartComputes: starts nodes by calling the <a href="https://help.aliyun.com/document_detail/87159.html">StartNodes</a> operation.</li>
             * <li>ResetCompute: resets nodes by calling the <a href="https://help.aliyun.com/document_detail/87158.html">ResetNodes</a> operation.</li>
             * <li>StopComputes: stops nodes by calling the <a href="https://help.aliyun.com/document_detail/87160.html">StopNodes</a> operation.</li>
             * <li>DeleteComputes: deletes nodes by calling the <a href="https://help.aliyun.com/document_detail/87155.html">DeleteNodes</a> operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StopCluster</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The total number of steps of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
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
