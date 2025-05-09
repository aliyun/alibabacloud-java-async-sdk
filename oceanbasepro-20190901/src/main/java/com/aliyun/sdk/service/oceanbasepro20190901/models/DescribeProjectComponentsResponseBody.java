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
 * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectComponentsResponseBody</p>
 */
public class DescribeProjectComponentsResponseBody extends TeaModel {
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

    private DescribeProjectComponentsResponseBody(Builder builder) {
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

    public static DescribeProjectComponentsResponseBody create() {
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

        private Builder(DescribeProjectComponentsResponseBody model) {
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

        public DescribeProjectComponentsResponseBody build() {
            return new DescribeProjectComponentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class ErrorDetails extends TeaModel {
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

            private Builder(ErrorDetails model) {
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

            public ErrorDetails build() {
                return new ErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class FullImportComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<ErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FullImportComponents(Builder builder) {
            this.errorDetails = builder.errorDetails;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.identity = builder.identity;
            this.ip = builder.ip;
            this.name = builder.name;
            this.progress = builder.progress;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullImportComponents create() {
            return builder().build();
        }

        /**
         * @return errorDetails
         */
        public java.util.List<ErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<ErrorDetails> errorDetails; 
            private String gmtCreate; 
            private String gmtModify; 
            private String identity; 
            private String ip; 
            private String name; 
            private Integer progress; 
            private String region; 
            private String status; 

            private Builder() {
            } 

            private Builder(FullImportComponents model) {
                this.errorDetails = model.errorDetails;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.identity = model.identity;
                this.ip = model.ip;
                this.name = model.name;
                this.progress = model.progress;
                this.region = model.region;
                this.status = model.status;
            } 

            /**
             * ErrorDetails.
             */
            public Builder errorDetails(java.util.List<ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FullImportComponents build() {
                return new FullImportComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class FullVerifyComponentsErrorDetails extends TeaModel {
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

        private FullVerifyComponentsErrorDetails(Builder builder) {
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

        public static FullVerifyComponentsErrorDetails create() {
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

            private Builder(FullVerifyComponentsErrorDetails model) {
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

            public FullVerifyComponentsErrorDetails build() {
                return new FullVerifyComponentsErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class FullVerifyComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsistentQuantity")
        private Long consistentQuantity;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<FullVerifyComponentsErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("InconsistentQuantity")
        private Long inconsistentQuantity;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RecordProgress")
        private Integer recordProgress;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private FullVerifyComponents(Builder builder) {
            this.consistentQuantity = builder.consistentQuantity;
            this.errorDetails = builder.errorDetails;
            this.inconsistentQuantity = builder.inconsistentQuantity;
            this.ip = builder.ip;
            this.name = builder.name;
            this.progress = builder.progress;
            this.recordProgress = builder.recordProgress;
            this.region = builder.region;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullVerifyComponents create() {
            return builder().build();
        }

        /**
         * @return consistentQuantity
         */
        public Long getConsistentQuantity() {
            return this.consistentQuantity;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<FullVerifyComponentsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return inconsistentQuantity
         */
        public Long getInconsistentQuantity() {
            return this.inconsistentQuantity;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return recordProgress
         */
        public Integer getRecordProgress() {
            return this.recordProgress;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long consistentQuantity; 
            private java.util.List<FullVerifyComponentsErrorDetails> errorDetails; 
            private Long inconsistentQuantity; 
            private String ip; 
            private String name; 
            private String progress; 
            private Integer recordProgress; 
            private String region; 
            private String status; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(FullVerifyComponents model) {
                this.consistentQuantity = model.consistentQuantity;
                this.errorDetails = model.errorDetails;
                this.inconsistentQuantity = model.inconsistentQuantity;
                this.ip = model.ip;
                this.name = model.name;
                this.progress = model.progress;
                this.recordProgress = model.recordProgress;
                this.region = model.region;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * ConsistentQuantity.
             */
            public Builder consistentQuantity(Long consistentQuantity) {
                this.consistentQuantity = consistentQuantity;
                return this;
            }

            /**
             * ErrorDetails.
             */
            public Builder errorDetails(java.util.List<FullVerifyComponentsErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * InconsistentQuantity.
             */
            public Builder inconsistentQuantity(Long inconsistentQuantity) {
                this.inconsistentQuantity = inconsistentQuantity;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * RecordProgress.
             */
            public Builder recordProgress(Integer recordProgress) {
                this.recordProgress = recordProgress;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public FullVerifyComponents build() {
                return new FullVerifyComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class IncrSyncComponentsErrorDetails extends TeaModel {
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

        private IncrSyncComponentsErrorDetails(Builder builder) {
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

        public static IncrSyncComponentsErrorDetails create() {
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

            private Builder(IncrSyncComponentsErrorDetails model) {
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

            public IncrSyncComponentsErrorDetails build() {
                return new IncrSyncComponentsErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class IncrSyncComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("CheckpointSampleTimestamp")
        private Long checkpointSampleTimestamp;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<IncrSyncComponentsErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Subtopics")
        private java.util.List<String> subtopics;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Long tps;

        private IncrSyncComponents(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.checkpointSampleTimestamp = builder.checkpointSampleTimestamp;
            this.delay = builder.delay;
            this.errorDetails = builder.errorDetails;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.identity = builder.identity;
            this.ip = builder.ip;
            this.name = builder.name;
            this.region = builder.region;
            this.status = builder.status;
            this.subtopics = builder.subtopics;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncrSyncComponents create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return checkpointSampleTimestamp
         */
        public Long getCheckpointSampleTimestamp() {
            return this.checkpointSampleTimestamp;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<IncrSyncComponentsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subtopics
         */
        public java.util.List<String> getSubtopics() {
            return this.subtopics;
        }

        /**
         * @return tps
         */
        public Long getTps() {
            return this.tps;
        }

        public static final class Builder {
            private String checkpoint; 
            private Long checkpointSampleTimestamp; 
            private Long delay; 
            private java.util.List<IncrSyncComponentsErrorDetails> errorDetails; 
            private String gmtCreate; 
            private String gmtModify; 
            private String identity; 
            private String ip; 
            private String name; 
            private String region; 
            private String status; 
            private java.util.List<String> subtopics; 
            private Long tps; 

            private Builder() {
            } 

            private Builder(IncrSyncComponents model) {
                this.checkpoint = model.checkpoint;
                this.checkpointSampleTimestamp = model.checkpointSampleTimestamp;
                this.delay = model.delay;
                this.errorDetails = model.errorDetails;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.identity = model.identity;
                this.ip = model.ip;
                this.name = model.name;
                this.region = model.region;
                this.status = model.status;
                this.subtopics = model.subtopics;
                this.tps = model.tps;
            } 

            /**
             * Checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * CheckpointSampleTimestamp.
             */
            public Builder checkpointSampleTimestamp(Long checkpointSampleTimestamp) {
                this.checkpointSampleTimestamp = checkpointSampleTimestamp;
                return this;
            }

            /**
             * Delay.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * ErrorDetails.
             */
            public Builder errorDetails(java.util.List<IncrSyncComponentsErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * Subtopics.
             */
            public Builder subtopics(java.util.List<String> subtopics) {
                this.subtopics = subtopics;
                return this;
            }

            /**
             * Tps.
             */
            public Builder tps(Long tps) {
                this.tps = tps;
                return this;
            }

            public IncrSyncComponents build() {
                return new IncrSyncComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class ReverseIncrSyncComponentsErrorDetails extends TeaModel {
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

        private ReverseIncrSyncComponentsErrorDetails(Builder builder) {
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

        public static ReverseIncrSyncComponentsErrorDetails create() {
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

            private Builder(ReverseIncrSyncComponentsErrorDetails model) {
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

            public ReverseIncrSyncComponentsErrorDetails build() {
                return new ReverseIncrSyncComponentsErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class ReverseIncrSyncComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("CheckpointSampleTimestamp")
        private Long checkpointSampleTimestamp;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<ReverseIncrSyncComponentsErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Subtopics")
        private java.util.List<String> subtopics;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Long tps;

        private ReverseIncrSyncComponents(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.checkpointSampleTimestamp = builder.checkpointSampleTimestamp;
            this.delay = builder.delay;
            this.errorDetails = builder.errorDetails;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.identity = builder.identity;
            this.ip = builder.ip;
            this.name = builder.name;
            this.region = builder.region;
            this.status = builder.status;
            this.subtopics = builder.subtopics;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseIncrSyncComponents create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return checkpointSampleTimestamp
         */
        public Long getCheckpointSampleTimestamp() {
            return this.checkpointSampleTimestamp;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<ReverseIncrSyncComponentsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subtopics
         */
        public java.util.List<String> getSubtopics() {
            return this.subtopics;
        }

        /**
         * @return tps
         */
        public Long getTps() {
            return this.tps;
        }

        public static final class Builder {
            private String checkpoint; 
            private Long checkpointSampleTimestamp; 
            private Long delay; 
            private java.util.List<ReverseIncrSyncComponentsErrorDetails> errorDetails; 
            private String gmtCreate; 
            private String gmtModify; 
            private String identity; 
            private String ip; 
            private String name; 
            private String region; 
            private String status; 
            private java.util.List<String> subtopics; 
            private Long tps; 

            private Builder() {
            } 

            private Builder(ReverseIncrSyncComponents model) {
                this.checkpoint = model.checkpoint;
                this.checkpointSampleTimestamp = model.checkpointSampleTimestamp;
                this.delay = model.delay;
                this.errorDetails = model.errorDetails;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.identity = model.identity;
                this.ip = model.ip;
                this.name = model.name;
                this.region = model.region;
                this.status = model.status;
                this.subtopics = model.subtopics;
                this.tps = model.tps;
            } 

            /**
             * Checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * CheckpointSampleTimestamp.
             */
            public Builder checkpointSampleTimestamp(Long checkpointSampleTimestamp) {
                this.checkpointSampleTimestamp = checkpointSampleTimestamp;
                return this;
            }

            /**
             * Delay.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * ErrorDetails.
             */
            public Builder errorDetails(java.util.List<ReverseIncrSyncComponentsErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * Subtopics.
             */
            public Builder subtopics(java.util.List<String> subtopics) {
                this.subtopics = subtopics;
                return this;
            }

            /**
             * Tps.
             */
            public Builder tps(Long tps) {
                this.tps = tps;
                return this;
            }

            public ReverseIncrSyncComponents build() {
                return new ReverseIncrSyncComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class ReverseStoreListErrorDetails extends TeaModel {
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

        private ReverseStoreListErrorDetails(Builder builder) {
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

        public static ReverseStoreListErrorDetails create() {
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

            private Builder(ReverseStoreListErrorDetails model) {
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

            public ReverseStoreListErrorDetails build() {
                return new ReverseStoreListErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class ReverseStoreList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginCheckpoint")
        private String beginCheckpoint;

        @com.aliyun.core.annotation.NameInMap("Conn")
        private Long conn;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("EndCheckpoint")
        private String endCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<ReverseStoreListErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("Gmt")
        private Long gmt;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("LatelyHeartbeatTimeSec")
        private Long latelyHeartbeatTimeSec;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorePort")
        private Integer storePort;

        @com.aliyun.core.annotation.NameInMap("Subtopic")
        private String subtopic;

        @com.aliyun.core.annotation.NameInMap("ToSwitch")
        private Boolean toSwitch;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Long tps;

        private ReverseStoreList(Builder builder) {
            this.beginCheckpoint = builder.beginCheckpoint;
            this.conn = builder.conn;
            this.delay = builder.delay;
            this.endCheckpoint = builder.endCheckpoint;
            this.errMsg = builder.errMsg;
            this.errorDetails = builder.errorDetails;
            this.gmt = builder.gmt;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ip = builder.ip;
            this.latelyHeartbeatTimeSec = builder.latelyHeartbeatTimeSec;
            this.name = builder.name;
            this.port = builder.port;
            this.region = builder.region;
            this.status = builder.status;
            this.storePort = builder.storePort;
            this.subtopic = builder.subtopic;
            this.toSwitch = builder.toSwitch;
            this.topic = builder.topic;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseStoreList create() {
            return builder().build();
        }

        /**
         * @return beginCheckpoint
         */
        public String getBeginCheckpoint() {
            return this.beginCheckpoint;
        }

        /**
         * @return conn
         */
        public Long getConn() {
            return this.conn;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return endCheckpoint
         */
        public String getEndCheckpoint() {
            return this.endCheckpoint;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<ReverseStoreListErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return gmt
         */
        public Long getGmt() {
            return this.gmt;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return latelyHeartbeatTimeSec
         */
        public Long getLatelyHeartbeatTimeSec() {
            return this.latelyHeartbeatTimeSec;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storePort
         */
        public Integer getStorePort() {
            return this.storePort;
        }

        /**
         * @return subtopic
         */
        public String getSubtopic() {
            return this.subtopic;
        }

        /**
         * @return toSwitch
         */
        public Boolean getToSwitch() {
            return this.toSwitch;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return tps
         */
        public Long getTps() {
            return this.tps;
        }

        public static final class Builder {
            private String beginCheckpoint; 
            private Long conn; 
            private Long delay; 
            private String endCheckpoint; 
            private String errMsg; 
            private java.util.List<ReverseStoreListErrorDetails> errorDetails; 
            private Long gmt; 
            private String gmtCreate; 
            private String gmtModified; 
            private String ip; 
            private Long latelyHeartbeatTimeSec; 
            private String name; 
            private Integer port; 
            private String region; 
            private String status; 
            private Integer storePort; 
            private String subtopic; 
            private Boolean toSwitch; 
            private String topic; 
            private Long tps; 

            private Builder() {
            } 

            private Builder(ReverseStoreList model) {
                this.beginCheckpoint = model.beginCheckpoint;
                this.conn = model.conn;
                this.delay = model.delay;
                this.endCheckpoint = model.endCheckpoint;
                this.errMsg = model.errMsg;
                this.errorDetails = model.errorDetails;
                this.gmt = model.gmt;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.ip = model.ip;
                this.latelyHeartbeatTimeSec = model.latelyHeartbeatTimeSec;
                this.name = model.name;
                this.port = model.port;
                this.region = model.region;
                this.status = model.status;
                this.storePort = model.storePort;
                this.subtopic = model.subtopic;
                this.toSwitch = model.toSwitch;
                this.topic = model.topic;
                this.tps = model.tps;
            } 

            /**
             * BeginCheckpoint.
             */
            public Builder beginCheckpoint(String beginCheckpoint) {
                this.beginCheckpoint = beginCheckpoint;
                return this;
            }

            /**
             * Conn.
             */
            public Builder conn(Long conn) {
                this.conn = conn;
                return this;
            }

            /**
             * Delay.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * EndCheckpoint.
             */
            public Builder endCheckpoint(String endCheckpoint) {
                this.endCheckpoint = endCheckpoint;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * ErrorDetails.
             */
            public Builder errorDetails(java.util.List<ReverseStoreListErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * Gmt.
             */
            public Builder gmt(Long gmt) {
                this.gmt = gmt;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * LatelyHeartbeatTimeSec.
             */
            public Builder latelyHeartbeatTimeSec(Long latelyHeartbeatTimeSec) {
                this.latelyHeartbeatTimeSec = latelyHeartbeatTimeSec;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * StorePort.
             */
            public Builder storePort(Integer storePort) {
                this.storePort = storePort;
                return this;
            }

            /**
             * <p>SubTopic。</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder subtopic(String subtopic) {
                this.subtopic = subtopic;
                return this;
            }

            /**
             * ToSwitch.
             */
            public Builder toSwitch(Boolean toSwitch) {
                this.toSwitch = toSwitch;
                return this;
            }

            /**
             * <p>Topic。</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * Tps.
             */
            public Builder tps(Long tps) {
                this.tps = tps;
                return this;
            }

            public ReverseStoreList build() {
                return new ReverseStoreList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class StoreListErrorDetails extends TeaModel {
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

        private StoreListErrorDetails(Builder builder) {
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

        public static StoreListErrorDetails create() {
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

            private Builder(StoreListErrorDetails model) {
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

            public StoreListErrorDetails build() {
                return new StoreListErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class StoreList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginCheckpoint")
        private String beginCheckpoint;

        @com.aliyun.core.annotation.NameInMap("Conn")
        private Long conn;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("EndCheckpoint")
        private String endCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<StoreListErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("Gmt")
        private Long gmt;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("LatelyHeartbeatTimeSec")
        private Long latelyHeartbeatTimeSec;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorePort")
        private Integer storePort;

        @com.aliyun.core.annotation.NameInMap("Subtopic")
        private String subtopic;

        @com.aliyun.core.annotation.NameInMap("ToSwitch")
        private Boolean toSwitch;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Long tps;

        private StoreList(Builder builder) {
            this.beginCheckpoint = builder.beginCheckpoint;
            this.conn = builder.conn;
            this.delay = builder.delay;
            this.endCheckpoint = builder.endCheckpoint;
            this.errMsg = builder.errMsg;
            this.errorDetails = builder.errorDetails;
            this.gmt = builder.gmt;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ip = builder.ip;
            this.latelyHeartbeatTimeSec = builder.latelyHeartbeatTimeSec;
            this.name = builder.name;
            this.port = builder.port;
            this.region = builder.region;
            this.status = builder.status;
            this.storePort = builder.storePort;
            this.subtopic = builder.subtopic;
            this.toSwitch = builder.toSwitch;
            this.topic = builder.topic;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoreList create() {
            return builder().build();
        }

        /**
         * @return beginCheckpoint
         */
        public String getBeginCheckpoint() {
            return this.beginCheckpoint;
        }

        /**
         * @return conn
         */
        public Long getConn() {
            return this.conn;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return endCheckpoint
         */
        public String getEndCheckpoint() {
            return this.endCheckpoint;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<StoreListErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return gmt
         */
        public Long getGmt() {
            return this.gmt;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return latelyHeartbeatTimeSec
         */
        public Long getLatelyHeartbeatTimeSec() {
            return this.latelyHeartbeatTimeSec;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storePort
         */
        public Integer getStorePort() {
            return this.storePort;
        }

        /**
         * @return subtopic
         */
        public String getSubtopic() {
            return this.subtopic;
        }

        /**
         * @return toSwitch
         */
        public Boolean getToSwitch() {
            return this.toSwitch;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return tps
         */
        public Long getTps() {
            return this.tps;
        }

        public static final class Builder {
            private String beginCheckpoint; 
            private Long conn; 
            private Long delay; 
            private String endCheckpoint; 
            private String errMsg; 
            private java.util.List<StoreListErrorDetails> errorDetails; 
            private Long gmt; 
            private String gmtCreate; 
            private String gmtModified; 
            private String ip; 
            private Long latelyHeartbeatTimeSec; 
            private String name; 
            private Integer port; 
            private String region; 
            private String status; 
            private Integer storePort; 
            private String subtopic; 
            private Boolean toSwitch; 
            private String topic; 
            private Long tps; 

            private Builder() {
            } 

            private Builder(StoreList model) {
                this.beginCheckpoint = model.beginCheckpoint;
                this.conn = model.conn;
                this.delay = model.delay;
                this.endCheckpoint = model.endCheckpoint;
                this.errMsg = model.errMsg;
                this.errorDetails = model.errorDetails;
                this.gmt = model.gmt;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.ip = model.ip;
                this.latelyHeartbeatTimeSec = model.latelyHeartbeatTimeSec;
                this.name = model.name;
                this.port = model.port;
                this.region = model.region;
                this.status = model.status;
                this.storePort = model.storePort;
                this.subtopic = model.subtopic;
                this.toSwitch = model.toSwitch;
                this.topic = model.topic;
                this.tps = model.tps;
            } 

            /**
             * BeginCheckpoint.
             */
            public Builder beginCheckpoint(String beginCheckpoint) {
                this.beginCheckpoint = beginCheckpoint;
                return this;
            }

            /**
             * Conn.
             */
            public Builder conn(Long conn) {
                this.conn = conn;
                return this;
            }

            /**
             * Delay.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * EndCheckpoint.
             */
            public Builder endCheckpoint(String endCheckpoint) {
                this.endCheckpoint = endCheckpoint;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * ErrorDetails.
             */
            public Builder errorDetails(java.util.List<StoreListErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * Gmt.
             */
            public Builder gmt(Long gmt) {
                this.gmt = gmt;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * LatelyHeartbeatTimeSec.
             */
            public Builder latelyHeartbeatTimeSec(Long latelyHeartbeatTimeSec) {
                this.latelyHeartbeatTimeSec = latelyHeartbeatTimeSec;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * StorePort.
             */
            public Builder storePort(Integer storePort) {
                this.storePort = storePort;
                return this;
            }

            /**
             * <p>SubTopic。</p>
             * 
             * <strong>example:</strong>
             * <p>OB_ORACLE_np_4w3*<strong>c_4w3</strong>-0</p>
             */
            public Builder subtopic(String subtopic) {
                this.subtopic = subtopic;
                return this;
            }

            /**
             * ToSwitch.
             */
            public Builder toSwitch(Boolean toSwitch) {
                this.toSwitch = toSwitch;
                return this;
            }

            /**
             * <p>Topic。</p>
             * 
             * <strong>example:</strong>
             * <p>OB_ORACLE_np_4w3r29c_4w3****</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * Tps.
             */
            public Builder tps(Long tps) {
                this.tps = tps;
                return this;
            }

            public StoreList build() {
                return new StoreList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullImportComponents")
        private java.util.List<FullImportComponents> fullImportComponents;

        @com.aliyun.core.annotation.NameInMap("FullVerifyComponents")
        private java.util.List<FullVerifyComponents> fullVerifyComponents;

        @com.aliyun.core.annotation.NameInMap("IncrSyncComponents")
        private java.util.List<IncrSyncComponents> incrSyncComponents;

        @com.aliyun.core.annotation.NameInMap("ReverseIncrSyncComponents")
        private java.util.List<ReverseIncrSyncComponents> reverseIncrSyncComponents;

        @com.aliyun.core.annotation.NameInMap("ReverseStoreList")
        private java.util.List<ReverseStoreList> reverseStoreList;

        @com.aliyun.core.annotation.NameInMap("StoreList")
        private java.util.List<StoreList> storeList;

        private Data(Builder builder) {
            this.fullImportComponents = builder.fullImportComponents;
            this.fullVerifyComponents = builder.fullVerifyComponents;
            this.incrSyncComponents = builder.incrSyncComponents;
            this.reverseIncrSyncComponents = builder.reverseIncrSyncComponents;
            this.reverseStoreList = builder.reverseStoreList;
            this.storeList = builder.storeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fullImportComponents
         */
        public java.util.List<FullImportComponents> getFullImportComponents() {
            return this.fullImportComponents;
        }

        /**
         * @return fullVerifyComponents
         */
        public java.util.List<FullVerifyComponents> getFullVerifyComponents() {
            return this.fullVerifyComponents;
        }

        /**
         * @return incrSyncComponents
         */
        public java.util.List<IncrSyncComponents> getIncrSyncComponents() {
            return this.incrSyncComponents;
        }

        /**
         * @return reverseIncrSyncComponents
         */
        public java.util.List<ReverseIncrSyncComponents> getReverseIncrSyncComponents() {
            return this.reverseIncrSyncComponents;
        }

        /**
         * @return reverseStoreList
         */
        public java.util.List<ReverseStoreList> getReverseStoreList() {
            return this.reverseStoreList;
        }

        /**
         * @return storeList
         */
        public java.util.List<StoreList> getStoreList() {
            return this.storeList;
        }

        public static final class Builder {
            private java.util.List<FullImportComponents> fullImportComponents; 
            private java.util.List<FullVerifyComponents> fullVerifyComponents; 
            private java.util.List<IncrSyncComponents> incrSyncComponents; 
            private java.util.List<ReverseIncrSyncComponents> reverseIncrSyncComponents; 
            private java.util.List<ReverseStoreList> reverseStoreList; 
            private java.util.List<StoreList> storeList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fullImportComponents = model.fullImportComponents;
                this.fullVerifyComponents = model.fullVerifyComponents;
                this.incrSyncComponents = model.incrSyncComponents;
                this.reverseIncrSyncComponents = model.reverseIncrSyncComponents;
                this.reverseStoreList = model.reverseStoreList;
                this.storeList = model.storeList;
            } 

            /**
             * FullImportComponents.
             */
            public Builder fullImportComponents(java.util.List<FullImportComponents> fullImportComponents) {
                this.fullImportComponents = fullImportComponents;
                return this;
            }

            /**
             * FullVerifyComponents.
             */
            public Builder fullVerifyComponents(java.util.List<FullVerifyComponents> fullVerifyComponents) {
                this.fullVerifyComponents = fullVerifyComponents;
                return this;
            }

            /**
             * IncrSyncComponents.
             */
            public Builder incrSyncComponents(java.util.List<IncrSyncComponents> incrSyncComponents) {
                this.incrSyncComponents = incrSyncComponents;
                return this;
            }

            /**
             * ReverseIncrSyncComponents.
             */
            public Builder reverseIncrSyncComponents(java.util.List<ReverseIncrSyncComponents> reverseIncrSyncComponents) {
                this.reverseIncrSyncComponents = reverseIncrSyncComponents;
                return this;
            }

            /**
             * ReverseStoreList.
             */
            public Builder reverseStoreList(java.util.List<ReverseStoreList> reverseStoreList) {
                this.reverseStoreList = reverseStoreList;
                return this;
            }

            /**
             * StoreList.
             */
            public Builder storeList(java.util.List<StoreList> storeList) {
                this.storeList = storeList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectComponentsResponseBody</p>
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
