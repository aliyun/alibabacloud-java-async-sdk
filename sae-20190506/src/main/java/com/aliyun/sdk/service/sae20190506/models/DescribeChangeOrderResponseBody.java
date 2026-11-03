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
         * <p>The HTTP status code or POP error code. Valid values:</p>
         * <ul>
         * <li><p><strong>2xx</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>3xx</strong>: The request was redirected.</p>
         * </li>
         * <li><p><strong>4xx</strong>: A client-side error occurred.</p>
         * </li>
         * <li><p><strong>5xx</strong>: A server-side error occurred.</p>
         * </li>
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
         * <p>The error code.</p>
         * <ul>
         * <li><p>If the request is successful, this parameter is not returned.</p>
         * </li>
         * <li><p>If the request fails, this parameter is returned. For more information, see the <strong>error codes</strong> section of this topic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.NotEmpty</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
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
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
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
         * <p>The trace ID of the request. This ID is used for troubleshooting.</p>
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
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0e4acf82-c9b1-4c1e-ac28-55776338****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The batch name.</p>
             * 
             * <strong>example:</strong>
             * <p>Batch 1 Change</p>
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * <p>The start time of the batch.</p>
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
             * <li><p><strong>0</strong>: Preparing</p>
             * </li>
             * <li><p><strong>1</strong>: In progress</p>
             * </li>
             * <li><p><strong>2</strong>: Succeeded</p>
             * </li>
             * <li><p><strong>3</strong>: Failed</p>
             * </li>
             * <li><p><strong>6</strong>: Terminated</p>
             * </li>
             * <li><p><strong>8</strong>: Awaiting manual confirmation</p>
             * </li>
             * <li><p><strong>9</strong>: Awaiting automatic confirmation</p>
             * </li>
             * <li><p><strong>10</strong>: Failed due to a system error</p>
             * </li>
             * <li><p><strong>11</strong>: Pending approval</p>
             * </li>
             * <li><p><strong>12</strong>: Approved and pending execution</p>
             * </li>
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
             * <p>The time when the batch was last updated.</p>
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

        @com.aliyun.core.annotation.NameInMap("ApplicationEnableGreyTagRoute")
        private Boolean applicationEnableGreyTagRoute;

        @com.aliyun.core.annotation.NameInMap("ApplicationUpdateStrategy")
        private String applicationUpdateStrategy;

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
            this.applicationEnableGreyTagRoute = builder.applicationEnableGreyTagRoute;
            this.applicationUpdateStrategy = builder.applicationUpdateStrategy;
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
         * @return applicationEnableGreyTagRoute
         */
        public Boolean getApplicationEnableGreyTagRoute() {
            return this.applicationEnableGreyTagRoute;
        }

        /**
         * @return applicationUpdateStrategy
         */
        public String getApplicationUpdateStrategy() {
            return this.applicationUpdateStrategy;
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
            private Boolean applicationEnableGreyTagRoute; 
            private String applicationUpdateStrategy; 
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
                this.applicationEnableGreyTagRoute = model.applicationEnableGreyTagRoute;
                this.applicationUpdateStrategy = model.applicationUpdateStrategy;
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
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bbbbb-3fd370b2-3646-4ba6-91f9-9423e19ab0cd-*****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>app-test</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>Indicates whether gray tag routing is enabled.</p>
             */
            public Builder applicationEnableGreyTagRoute(Boolean applicationEnableGreyTagRoute) {
                this.applicationEnableGreyTagRoute = applicationEnableGreyTagRoute;
                return this;
            }

            /**
             * <p>The update strategy for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
             */
            public Builder applicationUpdateStrategy(String applicationUpdateStrategy) {
                this.applicationUpdateStrategy = applicationUpdateStrategy;
                return this;
            }

            /**
             * <p>The approval ID for the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>67de0b39-a9d4-4c09-a170-cf438208****</p>
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * <p>Indicates whether to automatically release the change in batches. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The change is automatically released.</p>
             * </li>
             * <li><p><strong>false</strong>: The change is not automatically released.</p>
             * </li>
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
             * <p>The number of batches.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * <p>The release mode for batches. Valid values:</p>
             * <ul>
             * <li><p><strong>auto</strong>: Automatic release.</p>
             * </li>
             * <li><p><strong>manual</strong>: Manual release.</p>
             * </li>
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
             * <p>The wait time, in minutes, between batches in an automatic release.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder batchWaitTime(Integer batchWaitTime) {
                this.batchWaitTime = batchWaitTime;
                return this;
            }

            /**
             * <p>The change order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>765fa5c0-9ebb-4bb4-b383-1f885447**</p>
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * <p>The change type. This parameter is a description of <code>CoTypeCode</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Batch Restart Instances</p>
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * <p>The change type code. Valid values:</p>
             * <ul>
             * <li><p><strong>CoBindSlb</strong>: Binds an SLB instance.</p>
             * </li>
             * <li><p><strong>CoUnbindSlb</strong>: Unbinds an SLB instance.</p>
             * </li>
             * <li><p><strong>CoCreateApp</strong>: Creates an application.</p>
             * </li>
             * <li><p><strong>CoDeleteApp</strong>: Deletes an application.</p>
             * </li>
             * <li><p><strong>CoDeploy</strong>: Deploys an application.</p>
             * </li>
             * <li><p><strong>CoRestartApplication</strong>: Restarts an application.</p>
             * </li>
             * <li><p><strong>CoRollback</strong>: Rolls back an application.</p>
             * </li>
             * <li><p><strong>CoScaleIn</strong>: Scales in an application.</p>
             * </li>
             * <li><p><strong>CoScaleOut</strong>: Scales out an application.</p>
             * </li>
             * <li><p><strong>CoStart</strong>: Starts an application.</p>
             * </li>
             * <li><p><strong>CoStop</strong>: Stops an application.</p>
             * </li>
             * <li><p><strong>CoRescaleApplicationVertically</strong>: Modifies instance specifications.</p>
             * </li>
             * <li><p><strong>CoDeployHistroy</strong>: Rolls back to a historical version.</p>
             * </li>
             * <li><p><strong>CoBindNas</strong>: Binds a NAS file system.</p>
             * </li>
             * <li><p><strong>CoUnbindNas</strong>: Unbinds a NAS file system.</p>
             * </li>
             * <li><p><strong>CoBatchStartApplication</strong>: Starts applications in batches.</p>
             * </li>
             * <li><p><strong>CoBatchStopApplication</strong>: Stops applications in batches.</p>
             * </li>
             * <li><p><strong>CoRestartInstances</strong>: Restarts instances.</p>
             * </li>
             * <li><p><strong>CoDeleteInstances</strong>: Deletes instances.</p>
             * </li>
             * <li><p><strong>CoScaleInAppWithInstances</strong>: Scales in an application by specifying instances.</p>
             * </li>
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
             * <li><p><strong>0</strong>: Preparing</p>
             * </li>
             * <li><p><strong>1</strong>: In progress</p>
             * </li>
             * <li><p><strong>2</strong>: Succeeded</p>
             * </li>
             * <li><p><strong>3</strong>: Failed</p>
             * </li>
             * <li><p><strong>6</strong>: Terminated</p>
             * </li>
             * <li><p><strong>8</strong>: Awaiting manual confirmation</p>
             * </li>
             * <li><p><strong>9</strong>: Awaiting automatic confirmation</p>
             * </li>
             * <li><p><strong>10</strong>: Failed due to a system error</p>
             * </li>
             * <li><p><strong>11</strong>: Pending approval</p>
             * </li>
             * <li><p><strong>12</strong>: Approved and pending execution</p>
             * </li>
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
             * <p>The substatus of the release order. This parameter indicates whether an exception occurred during the release. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Normal.</p>
             * </li>
             * <li><p><strong>1</strong>: Abnormal. For example, if a batch release fails, you must manually perform a rollback, leaving the release order in the In Progress state.</p>
             * </li>
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
             * <p>Indicates whether rollback is supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Rollback is supported.</p>
             * </li>
             * <li><p><strong>false</strong>: Rollback is not supported.</p>
             * </li>
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
