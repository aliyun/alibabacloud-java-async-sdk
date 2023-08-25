// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOmsOpenAPIProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOmsOpenAPIProjectResponseBody</p>
 */
public class CreateOmsOpenAPIProjectResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Cost")
    private String cost;

    @NameInMap("Data")
    private String data;

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

    private CreateOmsOpenAPIProjectResponseBody(Builder builder) {
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

    public static CreateOmsOpenAPIProjectResponseBody create() {
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
    public String getData() {
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
        private String data; 
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
        public Builder data(String data) {
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

        public CreateOmsOpenAPIProjectResponseBody build() {
            return new CreateOmsOpenAPIProjectResponseBody(this);
        } 

    } 

    public static class ErrorDetail extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("Proposal")
        private String proposal;

        private ErrorDetail(Builder builder) {
            this.code = builder.code;
            this.level = builder.level;
            this.message = builder.message;
            this.proposal = builder.proposal;
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
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        public static final class Builder {
            private String code; 
            private String level; 
            private String message; 
            private String proposal; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Proposal.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
