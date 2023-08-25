// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectFullVerifyResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectFullVerifyResultResponseBody</p>
 */
public class ListProjectFullVerifyResultResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Cost")
    private String cost;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListProjectFullVerifyResultResponseBody(Builder builder) {
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

    public static ListProjectFullVerifyResultResponseBody create() {
        return builder().build();
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

        public ListProjectFullVerifyResultResponseBody build() {
            return new ListProjectFullVerifyResultResponseBody(this);
        } 

    } 

    public static class ErrorDetails extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("ExtraContext")
        private java.util.Map < String, ? > extraContext;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("MessageMcmsContext")
        private java.util.Map < String, String > messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        private String messageMcmsKey;

        @NameInMap("Proposal")
        private String proposal;

        @NameInMap("ProposalMcmsContext")
        private java.util.Map < String, String > proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        private String proposalMcmsKey;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("ReasonMcmsContext")
        private java.util.Map < String, String > reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        private String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
        private Object upstreamErrorDetail;

        private ErrorDetails(Builder builder) {
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

        public static ErrorDetails create() {
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
        public java.util.Map < String, ? > getExtraContext() {
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
        public java.util.Map < String, String > getMessageMcmsContext() {
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
        public java.util.Map < String, String > getProposalMcmsContext() {
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
        public java.util.Map < String, String > getReasonMcmsContext() {
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
            private java.util.Map < String, ? > extraContext; 
            private String level; 
            private String message; 
            private java.util.Map < String, String > messageMcmsContext; 
            private String messageMcmsKey; 
            private String proposal; 
            private java.util.Map < String, String > proposalMcmsContext; 
            private String proposalMcmsKey; 
            private String reason; 
            private java.util.Map < String, String > reasonMcmsContext; 
            private String reasonMcmsKey; 
            private Object upstreamErrorDetail; 

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
            public Builder extraContext(java.util.Map < String, ? > extraContext) {
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
            public Builder messageMcmsContext(java.util.Map < String, String > messageMcmsContext) {
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
            public Builder proposalMcmsContext(java.util.Map < String, String > proposalMcmsContext) {
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
            public Builder reasonMcmsContext(java.util.Map < String, String > reasonMcmsContext) {
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

            public ErrorDetails build() {
                return new ErrorDetails(this);
            } 

        } 

    }
    public static class FullVerifyTableStatistics extends TeaModel {
        @NameInMap("ConsistentCount")
        private Long consistentCount;

        @NameInMap("DestOnlyCount")
        private Long destOnlyCount;

        @NameInMap("DestSchemaName")
        private String destSchemaName;

        @NameInMap("ErrorDetails")
        private java.util.List < ErrorDetails> errorDetails;

        @NameInMap("Message")
        private String message;

        @NameInMap("MismatchedCount")
        private Long mismatchedCount;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("ResultDesc")
        private String resultDesc;

        @NameInMap("ResultType")
        private String resultType;

        @NameInMap("SourceOnlyCount")
        private Long sourceOnlyCount;

        @NameInMap("SourceSchemaName")
        private String sourceSchemaName;

        @NameInMap("SourceTableName")
        private String sourceTableName;

        @NameInMap("Status")
        private String status;

        private FullVerifyTableStatistics(Builder builder) {
            this.consistentCount = builder.consistentCount;
            this.destOnlyCount = builder.destOnlyCount;
            this.destSchemaName = builder.destSchemaName;
            this.errorDetails = builder.errorDetails;
            this.message = builder.message;
            this.mismatchedCount = builder.mismatchedCount;
            this.progress = builder.progress;
            this.resultDesc = builder.resultDesc;
            this.resultType = builder.resultType;
            this.sourceOnlyCount = builder.sourceOnlyCount;
            this.sourceSchemaName = builder.sourceSchemaName;
            this.sourceTableName = builder.sourceTableName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullVerifyTableStatistics create() {
            return builder().build();
        }

        /**
         * @return consistentCount
         */
        public Long getConsistentCount() {
            return this.consistentCount;
        }

        /**
         * @return destOnlyCount
         */
        public Long getDestOnlyCount() {
            return this.destOnlyCount;
        }

        /**
         * @return destSchemaName
         */
        public String getDestSchemaName() {
            return this.destSchemaName;
        }

        /**
         * @return errorDetails
         */
        public java.util.List < ErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return mismatchedCount
         */
        public Long getMismatchedCount() {
            return this.mismatchedCount;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return resultDesc
         */
        public String getResultDesc() {
            return this.resultDesc;
        }

        /**
         * @return resultType
         */
        public String getResultType() {
            return this.resultType;
        }

        /**
         * @return sourceOnlyCount
         */
        public Long getSourceOnlyCount() {
            return this.sourceOnlyCount;
        }

        /**
         * @return sourceSchemaName
         */
        public String getSourceSchemaName() {
            return this.sourceSchemaName;
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long consistentCount; 
            private Long destOnlyCount; 
            private String destSchemaName; 
            private java.util.List < ErrorDetails> errorDetails; 
            private String message; 
            private Long mismatchedCount; 
            private String progress; 
            private String resultDesc; 
            private String resultType; 
            private Long sourceOnlyCount; 
            private String sourceSchemaName; 
            private String sourceTableName; 
            private String status; 

            /**
             * ConsistentCount.
             */
            public Builder consistentCount(Long consistentCount) {
                this.consistentCount = consistentCount;
                return this;
            }

            /**
             * DestOnlyCount.
             */
            public Builder destOnlyCount(Long destOnlyCount) {
                this.destOnlyCount = destOnlyCount;
                return this;
            }

            /**
             * DestSchemaName.
             */
            public Builder destSchemaName(String destSchemaName) {
                this.destSchemaName = destSchemaName;
                return this;
            }

            /**
             * ErrorDetails.
             */
            public Builder errorDetails(java.util.List < ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
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
             * MismatchedCount.
             */
            public Builder mismatchedCount(Long mismatchedCount) {
                this.mismatchedCount = mismatchedCount;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ResultDesc.
             */
            public Builder resultDesc(String resultDesc) {
                this.resultDesc = resultDesc;
                return this;
            }

            /**
             * ResultType.
             */
            public Builder resultType(String resultType) {
                this.resultType = resultType;
                return this;
            }

            /**
             * SourceOnlyCount.
             */
            public Builder sourceOnlyCount(Long sourceOnlyCount) {
                this.sourceOnlyCount = sourceOnlyCount;
                return this;
            }

            /**
             * SourceSchemaName.
             */
            public Builder sourceSchemaName(String sourceSchemaName) {
                this.sourceSchemaName = sourceSchemaName;
                return this;
            }

            /**
             * SourceTableName.
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FullVerifyTableStatistics build() {
                return new FullVerifyTableStatistics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DifferentNumber")
        private Long differentNumber;

        @NameInMap("FullVerifyTableStatistics")
        private java.util.List < FullVerifyTableStatistics> fullVerifyTableStatistics;

        private Data(Builder builder) {
            this.differentNumber = builder.differentNumber;
            this.fullVerifyTableStatistics = builder.fullVerifyTableStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return differentNumber
         */
        public Long getDifferentNumber() {
            return this.differentNumber;
        }

        /**
         * @return fullVerifyTableStatistics
         */
        public java.util.List < FullVerifyTableStatistics> getFullVerifyTableStatistics() {
            return this.fullVerifyTableStatistics;
        }

        public static final class Builder {
            private Long differentNumber; 
            private java.util.List < FullVerifyTableStatistics> fullVerifyTableStatistics; 

            /**
             * DifferentNumber.
             */
            public Builder differentNumber(Long differentNumber) {
                this.differentNumber = differentNumber;
                return this;
            }

            /**
             * FullVerifyTableStatistics.
             */
            public Builder fullVerifyTableStatistics(java.util.List < FullVerifyTableStatistics> fullVerifyTableStatistics) {
                this.fullVerifyTableStatistics = fullVerifyTableStatistics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ErrorDetail extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("ExtraContext")
        private java.util.Map < String, ? > extraContext;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("MessageMcmsContext")
        private java.util.Map < String, String > messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        private String messageMcmsKey;

        @NameInMap("Proposal")
        private String proposal;

        @NameInMap("ProposalMcmsContext")
        private java.util.Map < String, String > proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        private String proposalMcmsKey;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("ReasonMcmsContext")
        private java.util.Map < String, String > reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        private String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
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
        public java.util.Map < String, ? > getExtraContext() {
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
        public java.util.Map < String, String > getMessageMcmsContext() {
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
        public java.util.Map < String, String > getProposalMcmsContext() {
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
        public java.util.Map < String, String > getReasonMcmsContext() {
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
            private java.util.Map < String, ? > extraContext; 
            private String level; 
            private String message; 
            private java.util.Map < String, String > messageMcmsContext; 
            private String messageMcmsKey; 
            private String proposal; 
            private java.util.Map < String, String > proposalMcmsContext; 
            private String proposalMcmsKey; 
            private String reason; 
            private java.util.Map < String, String > reasonMcmsContext; 
            private String reasonMcmsKey; 
            private Object upstreamErrorDetail; 

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
            public Builder extraContext(java.util.Map < String, ? > extraContext) {
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
            public Builder messageMcmsContext(java.util.Map < String, String > messageMcmsContext) {
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
            public Builder proposalMcmsContext(java.util.Map < String, String > proposalMcmsContext) {
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
            public Builder reasonMcmsContext(java.util.Map < String, String > reasonMcmsContext) {
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
