// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAsyncErrorRequestStatByCodeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;fail&quot;: false,     &quot;data&quot;: [       {         &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,         &quot;count&quot;: 1,         &quot;errorCode&quot;: &quot;1062&quot;       },       {         &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,         &quot;count&quot;: 2,         &quot;errorCode&quot;: &quot;1064&quot;      }     ],     &quot;resultId&quot;: &quot;async__fcd7c35788e62324622c3b4a03de****&quot;,     &quot;isFinish&quot;: true,     &quot;state&quot;: &quot;SUCCESS&quot;,     &quot;complete&quot;: true,     &quot;timestamp&quot;: 1644560866961   }</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>840F51F7-9C01-538D-94F6-AE712905****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAsyncErrorRequestStatByCodeResponseBody build() {
            return new GetAsyncErrorRequestStatByCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAsyncErrorRequestStatByCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetAsyncErrorRequestStatByCodeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.count = model.count;
                this.errorCode = model.errorCode;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The number of SQL queries corresponding to the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The error code returned if the request failed.</p>
             * 
             * <strong>example:</strong>
             * <p>1062</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
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
    /**
     * 
     * {@link GetAsyncErrorRequestStatByCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetAsyncErrorRequestStatByCodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("complete")
        private Boolean complete;

        @com.aliyun.core.annotation.NameInMap("fail")
        private Boolean fail;

        @com.aliyun.core.annotation.NameInMap("isFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<Result> result;

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
        public java.util.List<Result> getResult() {
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
            private java.util.List<Result> result; 
            private String resultId; 
            private String state; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.complete = model.complete;
                this.fail = model.fail;
                this.isFinish = model.isFinish;
                this.result = model.result;
                this.resultId = model.resultId;
                this.state = model.state;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>Indicates whether the asynchronous request was complete.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder complete(Boolean complete) {
                this.complete = complete;
                return this;
            }

            /**
             * <p>Indicates whether the asynchronous request failed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fail(Boolean fail) {
                this.fail = fail;
                return this;
            }

            /**
             * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * <p>The number of SQL queries corresponding to the error code.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The ID of the asynchronous request.</p>
             * 
             * <strong>example:</strong>
             * <p>async__fcd7c35788e62324622c3b4a03de****</p>
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * <p>The state of the asynchronous request. Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong></li>
             * <li><strong>SUCCESS</strong></li>
             * <li><strong>FAIL</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1644560866961</p>
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
