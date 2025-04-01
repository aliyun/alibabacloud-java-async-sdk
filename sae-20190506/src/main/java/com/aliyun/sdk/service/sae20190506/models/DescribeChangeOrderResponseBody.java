// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeChangeOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChangeOrderResponseBody</p>
 */
public class DescribeChangeOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeChangeOrderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the change order.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the information of the change order was queried. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The information was queried.</li>
         * <li><strong>false</strong>: The information failed to be queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID that is used to query the details of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeChangeOrderResponseBody build() {
            return new DescribeChangeOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChangeOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChangeOrderResponseBody</p>
     */
    public static class Pipelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchType")
        private Integer batchType;

        @com.aliyun.core.annotation.NameInMap("ParallelCount")
        private Integer parallelCount;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("PipelineName")
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(Pipelines model) {
                this.batchType = model.batchType;
                this.parallelCount = model.parallelCount;
                this.pipelineId = model.pipelineId;
                this.pipelineName = model.pipelineName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The batch type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder batchType(Integer batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * <p>The number of parallel tasks in a batch.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parallelCount(Integer parallelCount) {
                this.parallelCount = parallelCount;
                return this;
            }

            /**
             * <p>The ID of the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>0e4acf82-c9b1-4c1e-ac28-55776338****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The name of the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>Batch 1 Change</p>
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * <p>The time when the batch processing started.</p>
             * 
             * <strong>example:</strong>
             * <p>1562831689704</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the batch. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The batch is being prepared.</li>
             * <li><strong>1</strong>: The batch is being processed.</li>
             * <li><strong>2</strong>: The batch was processed.</li>
             * <li><strong>3</strong>: The batch failed to be processed.</li>
             * <li><strong>6</strong>: The batch processing was terminated.</li>
             * <li><strong>8</strong>: The execution process is pending. You must manually release the batch.</li>
             * <li><strong>9</strong>: The execution process is pending. SAE will automatically release the batch.</li>
             * <li><strong>10</strong>: The batch failed to be processed due to a system exception.</li>
             * <li><strong>11</strong>: The batch is pending approval.</li>
             * <li><strong>12</strong>: The batch is approved and is pending execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the batch information was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1562847178007</p>
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
    /**
     * 
     * {@link DescribeChangeOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChangeOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ApprovalId")
        private String approvalId;

        @com.aliyun.core.annotation.NameInMap("Auto")
        private Boolean auto;

        @com.aliyun.core.annotation.NameInMap("BatchCount")
        private Integer batchCount;

        @com.aliyun.core.annotation.NameInMap("BatchType")
        private String batchType;

        @com.aliyun.core.annotation.NameInMap("BatchWaitTime")
        private Integer batchWaitTime;

        @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
        private String changeOrderId;

        @com.aliyun.core.annotation.NameInMap("CoType")
        private String coType;

        @com.aliyun.core.annotation.NameInMap("CoTypeCode")
        private String coTypeCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentPipelineId")
        private String currentPipelineId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Pipelines")
        private java.util.List<Pipelines> pipelines;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private Integer subStatus;

        @com.aliyun.core.annotation.NameInMap("SupportRollback")
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
        public java.util.List<Pipelines> getPipelines() {
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
            private java.util.List<Pipelines> pipelines; 
            private Integer status; 
            private Integer subStatus; 
            private Boolean supportRollback; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.approvalId = model.approvalId;
                this.auto = model.auto;
                this.batchCount = model.batchCount;
                this.batchType = model.batchType;
                this.batchWaitTime = model.batchWaitTime;
                this.changeOrderId = model.changeOrderId;
                this.coType = model.coType;
                this.coTypeCode = model.coTypeCode;
                this.createTime = model.createTime;
                this.currentPipelineId = model.currentPipelineId;
                this.description = model.description;
                this.errorMessage = model.errorMessage;
                this.pipelines = model.pipelines;
                this.status = model.status;
                this.subStatus = model.subStatus;
                this.supportRollback = model.supportRollback;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>bbbbb-3fd370b2-3646-4ba6-91f9-9423e19ab0cd-*****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-test</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The approval ID of the change order.</p>
             * 
             * <strong>example:</strong>
             * <p>67de0b39-a9d4-4c09-a170-cf438208****</p>
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * <p>Indicates whether SAE automatically releases the batches. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: SAE automatically releases the batches.</li>
             * <li><strong>false</strong>: SAE does not automatically release the batches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder auto(Boolean auto) {
                this.auto = auto;
                return this;
            }

            /**
             * <p>The number of release batches.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * <p>The processing method for the batches. Valid values:</p>
             * <ul>
             * <li><strong>auto</strong>: SAE automatically releases the batches.</li>
             * <li><strong>Manual</strong>: You must manually release the batches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * <p>The interval between batches in a phased release. SAE automatically releases batches at the specified interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder batchWaitTime(Integer batchWaitTime) {
                this.batchWaitTime = batchWaitTime;
                return this;
            }

            /**
             * <p>The ID of the change order.</p>
             * 
             * <strong>example:</strong>
             * <p>765fa5c0-9ebb-4bb4-b383-1f885447**</p>
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * <p>The change type, which corresponds to the <strong>CoTypeCode</strong> parameter.</p>
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * <p>The code of the change type. Valid values:</p>
             * <ul>
             * <li><strong>CoBindSlb</strong>: associates a Sever Load Balancer (SLB) instance with the application.</li>
             * <li><strong>CoUnbindSlb</strong>: disassociates the SLB instance from the application.</li>
             * <li><strong>CoCreateApp</strong>: creates the application.</li>
             * <li><strong>CoDeleteApp</strong>: deletes the application.</li>
             * <li><strong>CoDeploy</strong>: deploys the application.</li>
             * <li><strong>CoRestartApplication</strong>: restarts the application.</li>
             * <li><strong>CoRollback</strong>: rolls back the application.</li>
             * <li><strong>CoScaleIn</strong>: scales in the application.</li>
             * <li><strong>CoScaleOut</strong>: scales out the application.</li>
             * <li><strong>CoStart</strong>: starts the application.</li>
             * <li><strong>CoStop</strong>: stops the application.</li>
             * <li><strong>CoRescaleApplicationVertically</strong>: modifies the instance type.</li>
             * <li><strong>CoDeployHistroy</strong>: rolls back the application to a historical version.</li>
             * <li><strong>CoBindNas</strong>: associates a NAS file system with the application.</li>
             * <li><strong>CoUnbindNas</strong>: disassociates the NAS file system from the application.</li>
             * <li><strong>CoBatchStartApplication</strong>: starts multiple applications concurrently.</li>
             * <li><strong>CoBatchStopApplication</strong>: stops multiple applications concurrently.</li>
             * <li><strong>CoRestartInstances</strong>: restarts the instances.</li>
             * <li><strong>CoDeleteInstances</strong>: deletes the instances.</li>
             * <li><strong>CoScaleInAppWithInstances</strong>: reduces the specified number of application instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CoRestartInstances</p>
             */
            public Builder coTypeCode(String coTypeCode) {
                this.coTypeCode = coTypeCode;
                return this;
            }

            /**
             * <p>The time when the change order was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-17 21:06:45</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the current batch.</p>
             * 
             * <strong>example:</strong>
             * <p>0e4acf82-c9b1-4c1e-ac28-55776338****</p>
             */
            public Builder currentPipelineId(String currentPipelineId) {
                this.currentPipelineId = currentPipelineId;
                return this;
            }

            /**
             * <p>The description of the change order.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The batch information.</p>
             */
            public Builder pipelines(java.util.List<Pipelines> pipelines) {
                this.pipelines = pipelines;
                return this;
            }

            /**
             * <p>The status of the change order. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The change order is being prepared.</li>
             * <li><strong>1</strong>: The change order is being executed.</li>
             * <li><strong>2</strong>: The change order was executed.</li>
             * <li><strong>3</strong>: The change order failed to be executed.</li>
             * <li><strong>6</strong>: The change order was terminated.</li>
             * <li><strong>8</strong>: The execution process is pending. You must manually release the batches.</li>
             * <li><strong>9</strong>: The execution process is pending. SAE will automatically release the batches.</li>
             * <li><strong>10</strong>: The execution failed due to a system exception.</li>
             * <li><strong>11</strong>: The change order is pending approval.</li>
             * <li><strong>12</strong>: The change order is approved and is pending execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The substatus of the change order. This parameter indicates whether an exception occurred while the change order was being executed. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No exception occurred.</li>
             * <li><strong>1</strong>: An exception occurred. For example, if an error occurs during a phased release, you must manually roll back the application. In this case, the change order cannot be completed, so the Status parameter is still displayed as &quot;1&quot;, which indicates that the change order is being executed. You can check the value of this parameter to determine whether an exception occurs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subStatus(Integer subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * <p>Indicates whether the application can be rolled back. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The application can be rolled back.</li>
             * <li><strong>false</strong>: The application cannot be rolled back.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
