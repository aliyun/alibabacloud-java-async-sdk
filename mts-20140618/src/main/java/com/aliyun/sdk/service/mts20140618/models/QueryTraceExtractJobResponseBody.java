// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryTraceExtractJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTraceExtractJobResponseBody</p>
 */
public class QueryTraceExtractJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Long statusCode;

    private QueryTraceExtractJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceExtractJobResponseBody create() {
        return builder().build();
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
     * @return statusCode
     */
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Long statusCode; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7D9F3008-9316-5817-BFA3-6180D752039D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Long statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public QueryTraceExtractJobResponseBody build() {
            return new QueryTraceExtractJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTraceExtractJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTraceExtractJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Trace")
        private String trace;

        private Data(Builder builder) {
            this.trace = builder.trace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return trace
         */
        public String getTrace() {
            return this.trace;
        }

        public static final class Builder {
            private String trace; 

            /**
             * Trace.
             */
            public Builder trace(String trace) {
                this.trace = trace;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
