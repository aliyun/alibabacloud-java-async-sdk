// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncErrorRequestStatByCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncErrorRequestStatByCodeResponseBody</p>
 */
public class GetAsyncErrorRequestStatByCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAsyncErrorRequestStatByCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncErrorRequestStatByCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAsyncErrorRequestStatByCodeResponseBody build() {
            return new GetAsyncErrorRequestStatByCodeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private Result(Builder builder) {
            this.count = builder.count;
            this.errorCode = builder.errorCode;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer count; 
            private String errorCode; 
            private String instanceId; 

            /**
             * The number of SQL queries corresponding to the error code.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The error code returned if the request failed.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("complete")
        private Boolean complete;

        @com.aliyun.core.annotation.NameInMap("fail")
        private Boolean fail;

        @com.aliyun.core.annotation.NameInMap("isFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("resultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.complete = builder.complete;
            this.fail = builder.fail;
            this.isFinish = builder.isFinish;
            this.result = builder.result;
            this.resultId = builder.resultId;
            this.state = builder.state;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return complete
         */
        public Boolean getComplete() {
            return this.complete;
        }

        /**
         * @return fail
         */
        public Boolean getFail() {
            return this.fail;
        }

        /**
         * @return isFinish
         */
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Boolean complete; 
            private Boolean fail; 
            private Boolean isFinish; 
            private java.util.List < Result> result; 
            private String resultId; 
            private String state; 
            private Long timestamp; 

            /**
             * Indicates whether the asynchronous request was complete.
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder complete(Boolean complete) {
                this.complete = complete;
                return this;
            }

            /**
             * Indicates whether the asynchronous request failed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder fail(Boolean fail) {
                this.fail = fail;
                return this;
            }

            /**
             * Indicates whether the asynchronous request was complete. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * The number of SQL queries corresponding to the error code.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The ID of the asynchronous request.
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * The state of the asynchronous request. Valid values:
             * <p>
             * 
             * *   **RUNNING**
             * *   **SUCCESS**
             * *   **FAIL**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
