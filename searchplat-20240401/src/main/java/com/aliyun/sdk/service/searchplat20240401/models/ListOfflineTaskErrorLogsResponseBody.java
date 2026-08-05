// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ListOfflineTaskErrorLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOfflineTaskErrorLogsResponseBody</p>
 */
public class ListOfflineTaskErrorLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListOfflineTaskErrorLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfflineTaskErrorLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListOfflineTaskErrorLogsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.totalCount = model.totalCount;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOfflineTaskErrorLogsResponseBody build() {
            return new ListOfflineTaskErrorLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOfflineTaskErrorLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfflineTaskErrorLogsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("request")
        private String request;

        @com.aliyun.core.annotation.NameInMap("response")
        private String response;

        @com.aliyun.core.annotation.NameInMap("retry")
        private String retry;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private Result(Builder builder) {
            this.request = builder.request;
            this.response = builder.response;
            this.retry = builder.retry;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return request
         */
        public String getRequest() {
            return this.request;
        }

        /**
         * @return response
         */
        public String getResponse() {
            return this.response;
        }

        /**
         * @return retry
         */
        public String getRetry() {
            return this.retry;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String request; 
            private String response; 
            private String retry; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.request = model.request;
                this.response = model.response;
                this.retry = model.retry;
                this.timestamp = model.timestamp;
            } 

            /**
             * request.
             */
            public Builder request(String request) {
                this.request = request;
                return this;
            }

            /**
             * response.
             */
            public Builder response(String response) {
                this.response = response;
                return this;
            }

            /**
             * retry.
             */
            public Builder retry(String retry) {
                this.retry = retry;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
