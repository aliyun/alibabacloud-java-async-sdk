// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJobStatisticsResponseBody</p>
 */
public class QueryJobStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class Data extends TeaModel {
        @NameInMap("Cancelled")
        private Integer cancelled;

        @NameInMap("Failed")
        private Integer failed;

        @NameInMap("InProgress")
        private Integer inProgress;

        @NameInMap("Queued")
        private Integer queued;

        @NameInMap("Rejected")
        private Integer rejected;

        @NameInMap("Sent")
        private Integer sent;

        @NameInMap("Succeeded")
        private Integer succeeded;

        @NameInMap("TimeOut")
        private Integer timeOut;

        @NameInMap("Total")
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
