// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartOmsOpenAPIProjectResponseBody} extends {@link TeaModel}
 *
 * <p>StartOmsOpenAPIProjectResponseBody</p>
 */
public class StartOmsOpenAPIProjectResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Cost")
    private String cost;

    @NameInMap("Data")
    private Boolean data;

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

    private StartOmsOpenAPIProjectResponseBody(Builder builder) {
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

    public static StartOmsOpenAPIProjectResponseBody create() {
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
    public Boolean getData() {
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
        private Boolean data; 
        private ErrorDetail errorDetail; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * 建议（旧）
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * 错误码（旧）
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 耗时，单位为秒
         */
        public Builder cost(String cost) {
            this.cost = cost;
            return this;
        }

        /**
         * 返回的业务数据
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * 错误详情
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * 错误描述（旧）
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 页序号，分页查询时生效
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页大小，分页查询时生效
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 请求 ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否调用成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 总数，分页查询时生效
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public StartOmsOpenAPIProjectResponseBody build() {
            return new StartOmsOpenAPIProjectResponseBody(this);
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
             * 错误码（新）
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 错误等级（CRITICAL, ERROR, WARN）
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * 错误描述（新）
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 建议（新）
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
