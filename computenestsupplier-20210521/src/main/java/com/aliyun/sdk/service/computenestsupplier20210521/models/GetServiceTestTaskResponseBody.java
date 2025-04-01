// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetServiceTestTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceTestTaskResponseBody</p>
 */
public class GetServiceTestTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutionDetails")
    private java.util.List<ExecutionDetails> executionDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskRegionId")
    private String taskRegionId;

    private GetServiceTestTaskResponseBody(Builder builder) {
        this.executionDetails = builder.executionDetails;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.taskName = builder.taskName;
        this.taskRegionId = builder.taskRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceTestTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionDetails
     */
    public java.util.List<ExecutionDetails> getExecutionDetails() {
        return this.executionDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskRegionId
     */
    public String getTaskRegionId() {
        return this.taskRegionId;
    }

    public static final class Builder {
        private java.util.List<ExecutionDetails> executionDetails; 
        private String requestId; 
        private String status; 
        private String taskName; 
        private String taskRegionId; 

        private Builder() {
        } 

        private Builder(GetServiceTestTaskResponseBody model) {
            this.executionDetails = model.executionDetails;
            this.requestId = model.requestId;
            this.status = model.status;
            this.taskName = model.taskName;
            this.taskRegionId = model.taskRegionId;
        } 

        /**
         * <p>The execution details.</p>
         */
        public Builder executionDetails(java.util.List<ExecutionDetails> executionDetails) {
            this.executionDetails = executionDetails;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A361BA9E-xxxx-xxxx-xxxx-C26E5180456E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the service test task. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Success</li>
         * <li>Failure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The task execution region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder taskRegionId(String taskRegionId) {
            this.taskRegionId = taskRegionId;
            return this;
        }

        public GetServiceTestTaskResponseBody build() {
            return new GetServiceTestTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceTestTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceTestTaskResponseBody</p>
     */
    public static class ExecutionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaseName")
        private String caseName;

        @com.aliyun.core.annotation.NameInMap("ExecutionReport")
        private String executionReport;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubTaskId")
        private String subTaskId;

        private ExecutionDetails(Builder builder) {
            this.caseName = builder.caseName;
            this.executionReport = builder.executionReport;
            this.status = builder.status;
            this.subTaskId = builder.subTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionDetails create() {
            return builder().build();
        }

        /**
         * @return caseName
         */
        public String getCaseName() {
            return this.caseName;
        }

        /**
         * @return executionReport
         */
        public String getExecutionReport() {
            return this.executionReport;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subTaskId
         */
        public String getSubTaskId() {
            return this.subTaskId;
        }

        public static final class Builder {
            private String caseName; 
            private String executionReport; 
            private String status; 
            private String subTaskId; 

            private Builder() {
            } 

            private Builder(ExecutionDetails model) {
                this.caseName = model.caseName;
                this.executionReport = model.executionReport;
                this.status = model.status;
                this.subTaskId = model.subTaskId;
            } 

            /**
             * <p>The service test case name.</p>
             * 
             * <strong>example:</strong>
             * <p>case1</p>
             */
            public Builder caseName(String caseName) {
                this.caseName = caseName;
                return this;
            }

            /**
             * <p>The execution report</p>
             * 
             * <strong>example:</strong>
             * <hr>
             * <p>Region: cn-qingdao
             * StackName: iact3-default-cn-qingd
             * StackId: 009d2991-f494-d</p>
             * <hr>
             */
            public Builder executionReport(String executionReport) {
                this.executionReport = executionReport;
                return this;
            }

            /**
             * <p>The sub task status.</p>
             * 
             * <strong>example:</strong>
             * <p>Runing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub task id.</p>
             * 
             * <strong>example:</strong>
             * <p>stt-xxxx</p>
             */
            public Builder subTaskId(String subTaskId) {
                this.subTaskId = subTaskId;
                return this;
            }

            public ExecutionDetails build() {
                return new ExecutionDetails(this);
            } 

        } 

    }
}
