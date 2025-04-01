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
 * {@link GetAsyncErrorRequestStatResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncErrorRequestStatResultResponseBody</p>
 */
public class GetAsyncErrorRequestStatResultResponseBody extends TeaModel {
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

    private GetAsyncErrorRequestStatResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncErrorRequestStatResultResponseBody create() {
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

        private Builder(GetAsyncErrorRequestStatResultResponseBody model) {
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
         * <p>{         &quot;fail&quot;: false,         &quot;data&quot;: {             &quot;ad78a4e7d3ce81590c9dc2d5f4bc****&quot;: {                 &quot;sqlId&quot;: &quot;ad78a4e7d3ce81590c9dc2d5f4bc****&quot;,                 &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,                 &quot;count&quot;: 1             },             &quot;0f92feacd92c048b06a16617a633****&quot;: {                 &quot;sqlId&quot;: &quot;0f92feacd92c048b06a16617a633****&quot;,                 &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,                 &quot;count&quot;: 2             }         },         &quot;resultId&quot;: &quot;async__61f45ee381b2fa4e8a6545e3bee9****&quot;,         &quot;isFinish&quot;: true,         &quot;state&quot;: &quot;SUCCESS&quot;,         &quot;complete&quot;: true,         &quot;timestamp&quot;: 1644558576717     }</p>
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
         * <p>3FC3F8EB-3564-5D1A-B187-3B03E5B0****</p>
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

        public GetAsyncErrorRequestStatResultResponseBody build() {
            return new GetAsyncErrorRequestStatResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAsyncErrorRequestStatResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAsyncErrorRequestStatResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("complete")
        private Boolean complete;

        @com.aliyun.core.annotation.NameInMap("fail")
        private Boolean fail;

        @com.aliyun.core.annotation.NameInMap("isFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.Map<String, DataResultValue> result;

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
        public java.util.Map<String, DataResultValue> getResult() {
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
            private java.util.Map<String, DataResultValue> result; 
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
             * <p>Indicates whether the request failed. Valid values:</p>
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
             * <p>Indicates whether the asynchronous request was successful. Valid values:</p>
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
             * <p>The returned data of the asynchronous request.</p>
             */
            public Builder result(java.util.Map<String, DataResultValue> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The ID of the asynchronous request.</p>
             * 
             * <strong>example:</strong>
             * <p>async__61f45ee381b2fa4e8a6545e3bee9****</p>
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * <p>The state of the asynchronous request. Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong>: The asynchronous request is running.</li>
             * <li><strong>SUCCESS</strong>: The asynchronous request is successful.</li>
             * <li><strong>FAIL</strong>: The asynchronous request fails.</li>
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
             * <p>1644558576717</p>
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
