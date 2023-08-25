// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ResumeProjectResponseBody</p>
 */
public class ResumeProjectResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Cost")
    private String cost;

    @NameInMap("Data")
    private Object data;

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

    private ResumeProjectResponseBody(Builder builder) {
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

    public static ResumeProjectResponseBody create() {
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
    public Object getData() {
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
        private Object data; 
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
        public Builder data(Object data) {
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

        public ResumeProjectResponseBody build() {
            return new ResumeProjectResponseBody(this);
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
