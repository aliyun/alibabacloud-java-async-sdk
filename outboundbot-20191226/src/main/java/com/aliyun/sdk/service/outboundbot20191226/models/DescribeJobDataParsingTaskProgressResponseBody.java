// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeJobDataParsingTaskProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobDataParsingTaskProgressResponseBody</p>
 */
public class DescribeJobDataParsingTaskProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Progress progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeJobDataParsingTaskProgressResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobDataParsingTaskProgressResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return progress
     */
    public Progress getProgress() {
        return this.progress;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Progress progress; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeJobDataParsingTaskProgressResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Progress.
         */
        public Builder progress(Progress progress) {
            this.progress = progress;
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

        public DescribeJobDataParsingTaskProgressResponseBody build() {
            return new DescribeJobDataParsingTaskProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobDataParsingTaskProgressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobDataParsingTaskProgressResponseBody</p>
     */
    public static class Progress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailErrorCode")
        private String failErrorCode;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("FeedbackUrl")
        private String feedbackUrl;

        @com.aliyun.core.annotation.NameInMap("HandledJobCount")
        private Integer handledJobCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalJobCount")
        private Integer totalJobCount;

        private Progress(Builder builder) {
            this.failErrorCode = builder.failErrorCode;
            this.failReason = builder.failReason;
            this.feedbackUrl = builder.feedbackUrl;
            this.handledJobCount = builder.handledJobCount;
            this.status = builder.status;
            this.totalJobCount = builder.totalJobCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Progress create() {
            return builder().build();
        }

        /**
         * @return failErrorCode
         */
        public String getFailErrorCode() {
            return this.failErrorCode;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return feedbackUrl
         */
        public String getFeedbackUrl() {
            return this.feedbackUrl;
        }

        /**
         * @return handledJobCount
         */
        public Integer getHandledJobCount() {
            return this.handledJobCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalJobCount
         */
        public Integer getTotalJobCount() {
            return this.totalJobCount;
        }

        public static final class Builder {
            private String failErrorCode; 
            private String failReason; 
            private String feedbackUrl; 
            private Integer handledJobCount; 
            private String status; 
            private Integer totalJobCount; 

            private Builder() {
            } 

            private Builder(Progress model) {
                this.failErrorCode = model.failErrorCode;
                this.failReason = model.failReason;
                this.feedbackUrl = model.feedbackUrl;
                this.handledJobCount = model.handledJobCount;
                this.status = model.status;
                this.totalJobCount = model.totalJobCount;
            } 

            /**
             * FailErrorCode.
             */
            public Builder failErrorCode(String failErrorCode) {
                this.failErrorCode = failErrorCode;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * FeedbackUrl.
             */
            public Builder feedbackUrl(String feedbackUrl) {
                this.feedbackUrl = feedbackUrl;
                return this;
            }

            /**
             * HandledJobCount.
             */
            public Builder handledJobCount(Integer handledJobCount) {
                this.handledJobCount = handledJobCount;
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
             * TotalJobCount.
             */
            public Builder totalJobCount(Integer totalJobCount) {
                this.totalJobCount = totalJobCount;
                return this;
            }

            public Progress build() {
                return new Progress(this);
            } 

        } 

    }
}
