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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TraceId.
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
             * BatchType.
             */
            public Builder batchType(Integer batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * ParallelCount.
             */
            public Builder parallelCount(Integer parallelCount) {
                this.parallelCount = parallelCount;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * PipelineName.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
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
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
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
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * ApprovalId.
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * Auto.
             */
            public Builder auto(Boolean auto) {
                this.auto = auto;
                return this;
            }

            /**
             * BatchCount.
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * BatchType.
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * BatchWaitTime.
             */
            public Builder batchWaitTime(Integer batchWaitTime) {
                this.batchWaitTime = batchWaitTime;
                return this;
            }

            /**
             * ChangeOrderId.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * CoType.
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * CoTypeCode.
             */
            public Builder coTypeCode(String coTypeCode) {
                this.coTypeCode = coTypeCode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentPipelineId.
             */
            public Builder currentPipelineId(String currentPipelineId) {
                this.currentPipelineId = currentPipelineId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Pipelines.
             */
            public Builder pipelines(java.util.List < Pipelines> pipelines) {
                this.pipelines = pipelines;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SubStatus.
             */
            public Builder subStatus(Integer subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * SupportRollback.
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
