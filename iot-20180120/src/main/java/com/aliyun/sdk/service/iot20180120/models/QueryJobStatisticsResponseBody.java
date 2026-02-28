// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryJobStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJobStatisticsResponseBody</p>
 */
public class QueryJobStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryJobStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJobStatisticsResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryJobStatisticsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QueryJobStatisticsResponseBody build() {
            return new QueryJobStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryJobStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cancelled")
        private Integer cancelled;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Integer failed;

        @com.aliyun.core.annotation.NameInMap("InProgress")
        private Integer inProgress;

        @com.aliyun.core.annotation.NameInMap("Queued")
        private Integer queued;

        @com.aliyun.core.annotation.NameInMap("Rejected")
        private Integer rejected;

        @com.aliyun.core.annotation.NameInMap("Sent")
        private Integer sent;

        @com.aliyun.core.annotation.NameInMap("Succeeded")
        private Integer succeeded;

        @com.aliyun.core.annotation.NameInMap("TimeOut")
        private Integer timeOut;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.cancelled = builder.cancelled;
            this.failed = builder.failed;
            this.inProgress = builder.inProgress;
            this.queued = builder.queued;
            this.rejected = builder.rejected;
            this.sent = builder.sent;
            this.succeeded = builder.succeeded;
            this.timeOut = builder.timeOut;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cancelled
         */
        public Integer getCancelled() {
            return this.cancelled;
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return inProgress
         */
        public Integer getInProgress() {
            return this.inProgress;
        }

        /**
         * @return queued
         */
        public Integer getQueued() {
            return this.queued;
        }

        /**
         * @return rejected
         */
        public Integer getRejected() {
            return this.rejected;
        }

        /**
         * @return sent
         */
        public Integer getSent() {
            return this.sent;
        }

        /**
         * @return succeeded
         */
        public Integer getSucceeded() {
            return this.succeeded;
        }

        /**
         * @return timeOut
         */
        public Integer getTimeOut() {
            return this.timeOut;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer cancelled; 
            private Integer failed; 
            private Integer inProgress; 
            private Integer queued; 
            private Integer rejected; 
            private Integer sent; 
            private Integer succeeded; 
            private Integer timeOut; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cancelled = model.cancelled;
                this.failed = model.failed;
                this.inProgress = model.inProgress;
                this.queued = model.queued;
                this.rejected = model.rejected;
                this.sent = model.sent;
                this.succeeded = model.succeeded;
                this.timeOut = model.timeOut;
                this.total = model.total;
            } 

            /**
             * Cancelled.
             */
            public Builder cancelled(Integer cancelled) {
                this.cancelled = cancelled;
                return this;
            }

            /**
             * Failed.
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * InProgress.
             */
            public Builder inProgress(Integer inProgress) {
                this.inProgress = inProgress;
                return this;
            }

            /**
             * Queued.
             */
            public Builder queued(Integer queued) {
                this.queued = queued;
                return this;
            }

            /**
             * Rejected.
             */
            public Builder rejected(Integer rejected) {
                this.rejected = rejected;
                return this;
            }

            /**
             * Sent.
             */
            public Builder sent(Integer sent) {
                this.sent = sent;
                return this;
            }

            /**
             * Succeeded.
             */
            public Builder succeeded(Integer succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            /**
             * TimeOut.
             */
            public Builder timeOut(Integer timeOut) {
                this.timeOut = timeOut;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
