// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeProjectProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectProgressResponseBody</p>
 */
public class DescribeProjectProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Advice")
    private String advice;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Cost")
    private String cost;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeProjectProgressResponseBody(Builder builder) {
        this.advice = builder.advice;
        this.code = builder.code;
        this.cost = builder.cost;
        this.data = builder.data;
        this.errorDetail = builder.errorDetail;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectProgressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advice
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cost
     */
    public String getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String advice; 
        private String code; 
        private String cost; 
        private Data data; 
        private ErrorDetail errorDetail; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeProjectProgressResponseBody model) {
            this.advice = model.advice;
            this.code = model.code;
            this.cost = model.cost;
            this.data = model.data;
            this.errorDetail = model.errorDetail;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Advice.
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Cost.
         */
        public Builder cost(String cost) {
            this.cost = cost;
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
         * ErrorDetail.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProjectProgressResponseBody build() {
            return new DescribeProjectProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProjectProgressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmLevel")
        private String alarmLevel;

        @com.aliyun.core.annotation.NameInMap("CurrentStep")
        private String currentStep;

        @com.aliyun.core.annotation.NameInMap("EnableFullTransfer")
        private Boolean enableFullTransfer;

        @com.aliyun.core.annotation.NameInMap("EnableIncrSync")
        private Boolean enableIncrSync;

        @com.aliyun.core.annotation.NameInMap("EnableReverseIncrTransfer")
        private Boolean enableReverseIncrTransfer;

        @com.aliyun.core.annotation.NameInMap("EnableStructTransfer")
        private Boolean enableStructTransfer;

        @com.aliyun.core.annotation.NameInMap("FullTransferProgress")
        private Integer fullTransferProgress;

        @com.aliyun.core.annotation.NameInMap("IncrSyncCheckpoint")
        private Long incrSyncCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ReverseIncrTransferCheckpoint")
        private Long reverseIncrTransferCheckpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructTransferProgress")
        private Integer structTransferProgress;

        private Data(Builder builder) {
            this.alarmLevel = builder.alarmLevel;
            this.currentStep = builder.currentStep;
            this.enableFullTransfer = builder.enableFullTransfer;
            this.enableIncrSync = builder.enableIncrSync;
            this.enableReverseIncrTransfer = builder.enableReverseIncrTransfer;
            this.enableStructTransfer = builder.enableStructTransfer;
            this.fullTransferProgress = builder.fullTransferProgress;
            this.incrSyncCheckpoint = builder.incrSyncCheckpoint;
            this.projectId = builder.projectId;
            this.reverseIncrTransferCheckpoint = builder.reverseIncrTransferCheckpoint;
            this.status = builder.status;
            this.structTransferProgress = builder.structTransferProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmLevel
         */
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        /**
         * @return currentStep
         */
        public String getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return enableFullTransfer
         */
        public Boolean getEnableFullTransfer() {
            return this.enableFullTransfer;
        }

        /**
         * @return enableIncrSync
         */
        public Boolean getEnableIncrSync() {
            return this.enableIncrSync;
        }

        /**
         * @return enableReverseIncrTransfer
         */
        public Boolean getEnableReverseIncrTransfer() {
            return this.enableReverseIncrTransfer;
        }

        /**
         * @return enableStructTransfer
         */
        public Boolean getEnableStructTransfer() {
            return this.enableStructTransfer;
        }

        /**
         * @return fullTransferProgress
         */
        public Integer getFullTransferProgress() {
            return this.fullTransferProgress;
        }

        /**
         * @return incrSyncCheckpoint
         */
        public Long getIncrSyncCheckpoint() {
            return this.incrSyncCheckpoint;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return reverseIncrTransferCheckpoint
         */
        public Long getReverseIncrTransferCheckpoint() {
            return this.reverseIncrTransferCheckpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structTransferProgress
         */
        public Integer getStructTransferProgress() {
            return this.structTransferProgress;
        }

        public static final class Builder {
            private String alarmLevel; 
            private String currentStep; 
            private Boolean enableFullTransfer; 
            private Boolean enableIncrSync; 
            private Boolean enableReverseIncrTransfer; 
            private Boolean enableStructTransfer; 
            private Integer fullTransferProgress; 
            private Long incrSyncCheckpoint; 
            private String projectId; 
            private Long reverseIncrTransferCheckpoint; 
            private String status; 
            private Integer structTransferProgress; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alarmLevel = model.alarmLevel;
                this.currentStep = model.currentStep;
                this.enableFullTransfer = model.enableFullTransfer;
                this.enableIncrSync = model.enableIncrSync;
                this.enableReverseIncrTransfer = model.enableReverseIncrTransfer;
                this.enableStructTransfer = model.enableStructTransfer;
                this.fullTransferProgress = model.fullTransferProgress;
                this.incrSyncCheckpoint = model.incrSyncCheckpoint;
                this.projectId = model.projectId;
                this.reverseIncrTransferCheckpoint = model.reverseIncrTransferCheckpoint;
                this.status = model.status;
                this.structTransferProgress = model.structTransferProgress;
            } 

            /**
             * AlarmLevel.
             */
            public Builder alarmLevel(String alarmLevel) {
                this.alarmLevel = alarmLevel;
                return this;
            }

            /**
             * CurrentStep.
             */
            public Builder currentStep(String currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * EnableFullTransfer.
             */
            public Builder enableFullTransfer(Boolean enableFullTransfer) {
                this.enableFullTransfer = enableFullTransfer;
                return this;
            }

            /**
             * EnableIncrSync.
             */
            public Builder enableIncrSync(Boolean enableIncrSync) {
                this.enableIncrSync = enableIncrSync;
                return this;
            }

            /**
             * EnableReverseIncrTransfer.
             */
            public Builder enableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
                this.enableReverseIncrTransfer = enableReverseIncrTransfer;
                return this;
            }

            /**
             * EnableStructTransfer.
             */
            public Builder enableStructTransfer(Boolean enableStructTransfer) {
                this.enableStructTransfer = enableStructTransfer;
                return this;
            }

            /**
             * FullTransferProgress.
             */
            public Builder fullTransferProgress(Integer fullTransferProgress) {
                this.fullTransferProgress = fullTransferProgress;
                return this;
            }

            /**
             * IncrSyncCheckpoint.
             */
            public Builder incrSyncCheckpoint(Long incrSyncCheckpoint) {
                this.incrSyncCheckpoint = incrSyncCheckpoint;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ReverseIncrTransferCheckpoint.
             */
            public Builder reverseIncrTransferCheckpoint(Long reverseIncrTransferCheckpoint) {
                this.reverseIncrTransferCheckpoint = reverseIncrTransferCheckpoint;
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
             * StructTransferProgress.
             */
            public Builder structTransferProgress(Integer structTransferProgress) {
                this.structTransferProgress = structTransferProgress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectProgressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectProgressResponseBody</p>
     */
    public static class ErrorDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExtraContext")
        private java.util.Map<String, ?> extraContext;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsContext")
        private java.util.Map<String, String> messageMcmsContext;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsKey")
        private String messageMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Proposal")
        private String proposal;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsContext")
        private java.util.Map<String, String> proposalMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsKey")
        private String proposalMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsContext")
        private java.util.Map<String, String> reasonMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsKey")
        private String reasonMcmsKey;

        @com.aliyun.core.annotation.NameInMap("UpstreamErrorDetail")
        private Object upstreamErrorDetail;

        private ErrorDetail(Builder builder) {
            this.code = builder.code;
            this.extraContext = builder.extraContext;
            this.level = builder.level;
            this.message = builder.message;
            this.messageMcmsContext = builder.messageMcmsContext;
            this.messageMcmsKey = builder.messageMcmsKey;
            this.proposal = builder.proposal;
            this.proposalMcmsContext = builder.proposalMcmsContext;
            this.proposalMcmsKey = builder.proposalMcmsKey;
            this.reason = builder.reason;
            this.reasonMcmsContext = builder.reasonMcmsContext;
            this.reasonMcmsKey = builder.reasonMcmsKey;
            this.upstreamErrorDetail = builder.upstreamErrorDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetail create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extraContext
         */
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return messageMcmsContext
         */
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        /**
         * @return messageMcmsKey
         */
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        /**
         * @return proposalMcmsContext
         */
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        /**
         * @return proposalMcmsKey
         */
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reasonMcmsContext
         */
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        /**
         * @return reasonMcmsKey
         */
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        /**
         * @return upstreamErrorDetail
         */
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

        public static final class Builder {
            private String code; 
            private java.util.Map<String, ?> extraContext; 
            private String level; 
            private String message; 
            private java.util.Map<String, String> messageMcmsContext; 
            private String messageMcmsKey; 
            private String proposal; 
            private java.util.Map<String, String> proposalMcmsContext; 
            private String proposalMcmsKey; 
            private String reason; 
            private java.util.Map<String, String> reasonMcmsContext; 
            private String reasonMcmsKey; 
            private Object upstreamErrorDetail; 

            private Builder() {
            } 

            private Builder(ErrorDetail model) {
                this.code = model.code;
                this.extraContext = model.extraContext;
                this.level = model.level;
                this.message = model.message;
                this.messageMcmsContext = model.messageMcmsContext;
                this.messageMcmsKey = model.messageMcmsKey;
                this.proposal = model.proposal;
                this.proposalMcmsContext = model.proposalMcmsContext;
                this.proposalMcmsKey = model.proposalMcmsKey;
                this.reason = model.reason;
                this.reasonMcmsContext = model.reasonMcmsContext;
                this.reasonMcmsKey = model.reasonMcmsKey;
                this.upstreamErrorDetail = model.upstreamErrorDetail;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExtraContext.
             */
            public Builder extraContext(java.util.Map<String, ?> extraContext) {
                this.extraContext = extraContext;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * MessageMcmsContext.
             */
            public Builder messageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
                this.messageMcmsContext = messageMcmsContext;
                return this;
            }

            /**
             * MessageMcmsKey.
             */
            public Builder messageMcmsKey(String messageMcmsKey) {
                this.messageMcmsKey = messageMcmsKey;
                return this;
            }

            /**
             * Proposal.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            /**
             * ProposalMcmsContext.
             */
            public Builder proposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
                this.proposalMcmsContext = proposalMcmsContext;
                return this;
            }

            /**
             * ProposalMcmsKey.
             */
            public Builder proposalMcmsKey(String proposalMcmsKey) {
                this.proposalMcmsKey = proposalMcmsKey;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReasonMcmsContext.
             */
            public Builder reasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
                this.reasonMcmsContext = reasonMcmsContext;
                return this;
            }

            /**
             * ReasonMcmsKey.
             */
            public Builder reasonMcmsKey(String reasonMcmsKey) {
                this.reasonMcmsKey = reasonMcmsKey;
                return this;
            }

            /**
             * UpstreamErrorDetail.
             */
            public Builder upstreamErrorDetail(Object upstreamErrorDetail) {
                this.upstreamErrorDetail = upstreamErrorDetail;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
