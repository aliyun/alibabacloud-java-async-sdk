// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTraceExtractResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTraceExtractResponseBody</p>
 */
public class QueryTraceExtractResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestID")
    private String requestID;

    @NameInMap("StatusCode")
    private Long statusCode;

    private QueryTraceExtractResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestID = builder.requestID;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceExtractResponseBody create() {
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
     * @return requestID
     */
    public String getRequestID() {
        return this.requestID;
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
        private String requestID; 
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
         * RequestID.
         */
        public Builder requestID(String requestID) {
            this.requestID = requestID;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Long statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public QueryTraceExtractResponseBody build() {
            return new QueryTraceExtractResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Trace")
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
