// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChangeOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChangeOrderResponseBody</p>
 */
public class DescribeChangeOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeChangeOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChangeOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the change order.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         * <p>
         * 
         * *   The **ErrorCode** parameter is not returned when the request succeeds.
         * *   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the information of a change order was obtained. Valid values:
         * <p>
         * 
         * *   **true**: The information was obtained.
         * *   **false**: The information could not be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. It is used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeChangeOrderResponseBody build() {
            return new DescribeChangeOrderResponseBody(this);
        } 

    } 

    public static class Pipelines extends TeaModel {
        @NameInMap("BatchType")
        private Integer batchType;

        @NameInMap("ParallelCount")
        private Integer parallelCount;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("PipelineName")
        private String pipelineName;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Pipelines(Builder builder) {
            this.batchType = builder.batchType;
            this.parallelCount = builder.parallelCount;
            this.pipelineId = builder.pipelineId;
            this.pipelineName = builder.pipelineName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipelines create() {
            return builder().build();
        }

        /**
         * @return batchType
         */
        public Integer getBatchType() {
            return this.batchType;
        }

        /**
         * @return parallelCount
         */
        public Integer getParallelCount() {
            return this.parallelCount;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
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
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Integer batchType; 
            private Integer parallelCount; 
            private String pipelineId; 
            private String pipelineName; 
            private Long startTime; 
            private Integer status; 
            private Long updateTime; 

            /**
             * The batch type.
             */
            public Builder batchType(Integer batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * The number of parallel tasks in a batch.
             */
            public Builder parallelCount(Integer parallelCount) {
                this.parallelCount = parallelCount;
                return this;
            }

            /**
             * The ID of the batch.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The name of the batch.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * The time when the batch processing starts.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the batch. Valid values:
             * <p>
             * 
             * *   **0**: The batch is being prepared.
             * *   **1**: The batch is being processed.
             * *   **2**: The batch was processed.
             * *   **3**: The batch could not be processed.
             * *   **6**: The batch processing was terminated.
             * *   **8**: The execution process is pending. You must manually determine the release batch.
             * *   **9**: The execution process is pending. SAE will automatically determine the release batch.
             * *   **10**: The batch could not be processed due to a system exception.
             * *   **11**: The change order is pending approval.
             * *   **12**: The change order is approved and is pending execution.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the batch information is last modified.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Pipelines build() {
                return new Pipelines(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("ApprovalId")
        private String approvalId;

        @NameInMap("Auto")
        private Boolean auto;

        @NameInMap("BatchCount")
        private Integer batchCount;

        @NameInMap("BatchType")
        private String batchType;

        @NameInMap("BatchWaitTime")
        private Integer batchWaitTime;

        @NameInMap("ChangeOrderId")
        private String changeOrderId;

        @NameInMap("CoType")
        private String coType;

        @NameInMap("CoTypeCode")
        private String coTypeCode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CurrentPipelineId")
        private String currentPipelineId;

        @NameInMap("Description")
        private String description;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Pipelines")
        private java.util.List < Pipelines> pipelines;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SubStatus")
        private Integer subStatus;

        @NameInMap("SupportRollback")
        private Boolean supportRollback;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.approvalId = builder.approvalId;
            this.auto = builder.auto;
            this.batchCount = builder.batchCount;
            this.batchType = builder.batchType;
            this.batchWaitTime = builder.batchWaitTime;
            this.changeOrderId = builder.changeOrderId;
            this.coType = builder.coType;
            this.coTypeCode = builder.coTypeCode;
            this.createTime = builder.createTime;
            this.currentPipelineId = builder.currentPipelineId;
            this.description = builder.description;
            this.errorMessage = builder.errorMessage;
            this.pipelines = builder.pipelines;
            this.status = builder.status;
            this.subStatus = builder.subStatus;
            this.supportRollback = builder.supportRollback;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return approvalId
         */
        public String getApprovalId() {
            return this.approvalId;
        }

        /**
         * @return auto
         */
        public Boolean getAuto() {
            return this.auto;
        }

        /**
         * @return batchCount
         */
        public Integer getBatchCount() {
            return this.batchCount;
        }

        /**
         * @return batchType
         */
        public String getBatchType() {
            return this.batchType;
        }

        /**
         * @return batchWaitTime
         */
        public Integer getBatchWaitTime() {
            return this.batchWaitTime;
        }

        /**
         * @return changeOrderId
         */
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        /**
         * @return coType
         */
        public String getCoType() {
            return this.coType;
        }

        /**
         * @return coTypeCode
         */
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentPipelineId
         */
        public String getCurrentPipelineId() {
            return this.currentPipelineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return pipelines
         */
        public java.util.List < Pipelines> getPipelines() {
            return this.pipelines;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subStatus
         */
        public Integer getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return supportRollback
         */
        public Boolean getSupportRollback() {
            return this.supportRollback;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String approvalId; 
            private Boolean auto; 
            private Integer batchCount; 
            private String batchType; 
            private Integer batchWaitTime; 
            private String changeOrderId; 
            private String coType; 
            private String coTypeCode; 
            private String createTime; 
            private String currentPipelineId; 
            private String description; 
            private String errorMessage; 
            private java.util.List < Pipelines> pipelines; 
            private Integer status; 
            private Integer subStatus; 
            private Boolean supportRollback; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The approval ID of the change order.
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * Indicates whether SAE automatically determines the release batches. Valid values:
             * <p>
             * 
             * *   **true**: SAE automatically determines the release batches.
             * *   **false**: SAE does not automatically determine the release batches.
             */
            public Builder auto(Boolean auto) {
                this.auto = auto;
                return this;
            }

            /**
             * The number of release batches.
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * The mode in which the release batches are determined. Valid values:
             * <p>
             * 
             * *   **auto**: SAE automatically determines the release batches.
             * *   **Manual**: You must manually determine the release batches.
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * The interval between batches when SAE automatically determines the release batches in a phased release. Unit: minutes.
             */
            public Builder batchWaitTime(Integer batchWaitTime) {
                this.batchWaitTime = batchWaitTime;
                return this;
            }

            /**
             * The ID of the change order.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * The description about the change type, which corresponds to the **CoTypeCode** parameter.
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * The code of the change type. Valid values:
             * <p>
             * 
             * *   **CoBindSlb**: associates the Server Load Balancer (SLB) instance with the application.
             * *   **CoUnbindSlb**: disassociates the SLB instance from the application.
             * *   **CoCreateApp**: creates the application.
             * *   **CoDeleteApp**: deletes the application.
             * *   **CoDeploy**: deploys the application.
             * *   **CoRestartApplication**: restarts the application.
             * *   **CoRollback**: rolls back the application.
             * *   **CoScaleIn**: scales in the application.
             * *   **CoScaleOut**: scales out the application.
             * *   **CoStart**: starts the application.
             * *   **CoStop**: stops the application.
             * *   **CoRescaleApplicationVertically**: modifies the instance specifications.
             * *   **CoDeployHistroy**: rolls back the application to a historical version.
             * *   **CoBindNas**: associates a network-attached storage (NAS) file system with the application.
             * *   **CoUnbindNas**: disassociates the NAS file system from the application.
             * *   **CoBatchStartApplication**: starts multiple applications concurrently.
             * *   **CoBatchStopApplication**: stops multiple applications concurrently.
             * *   **CoRestartInstances**: restarts the instances.
             * *   **CoDeleteInstances**: deletes the instances.
             * *   **CoScaleInAppWithInstances**: reduces the number of specified application instances.
             */
            public Builder coTypeCode(String coTypeCode) {
                this.coTypeCode = coTypeCode;
                return this;
            }

            /**
             * The time when the change order was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the current batch.
             */
            public Builder currentPipelineId(String currentPipelineId) {
                this.currentPipelineId = currentPipelineId;
                return this;
            }

            /**
             * The description of the change order.
             */
            public Builder description(String description) {
                this.description = description;
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
             * The batch information.
             */
            public Builder pipelines(java.util.List < Pipelines> pipelines) {
                this.pipelines = pipelines;
                return this;
            }

            /**
             * The status of the change order. Valid values:
             * <p>
             * 
             * *   **0**: The change order is being prepared.
             * *   **1**: The change order is being executed.
             * *   **2**: The change order was executed.
             * *   **3**: The change order could not be executed.
             * *   **6**: The change order was terminated.
             * *   **8**: The execution process is pending. You must manually determine the release batch.
             * *   **9**: The execution process is pending. SAE will automatically determine the release batches.
             * *   **10**: The execution failed due to a system exception.
             * *   **11**: The change order is pending approval.
             * *   **12**: The change order is approved and is pending execution.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The substatus of the change order. This parameter indicates whether an exception occurred while the change order was being executed. Valid values:
             * <p>
             * 
             * *   **0**: No exception occurred.
             * *   **1**: An exception occurred. For example, when an error occurred during a phased release, you must manually roll back the application. In this case, the change order cannot be completed, so the Status parameter is still displayed as "1", which indicates that the change order is being executed. You can check the value of this parameter to determine whether an exception occurs.
             */
            public Builder subStatus(Integer subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * Indicates whether the application can be rolled back. Valid values:
             * <p>
             * 
             * *   **true**: The application can be rolled back.
             * *   **false**: The application cannot be rolled back.
             */
            public Builder supportRollback(Boolean supportRollback) {
                this.supportRollback = supportRollback;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
