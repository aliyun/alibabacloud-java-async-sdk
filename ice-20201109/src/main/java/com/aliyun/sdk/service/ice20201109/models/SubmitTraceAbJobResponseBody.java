// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitTraceAbJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitTraceAbJobResponseBody</p>
 */
public class SubmitTraceAbJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Long statusCode;

    private SubmitTraceAbJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTraceAbJobResponseBody create() {
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
         * <p><strong><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></strong></p>
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

        public SubmitTraceAbJobResponseBody build() {
            return new SubmitTraceAbJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTraceAbJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitTraceAbJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("TraceMediaId")
        private String traceMediaId;

        private Data(Builder builder) {
            this.jobId = builder.jobId;
            this.traceMediaId = builder.traceMediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return traceMediaId
         */
        public String getTraceMediaId() {
            return this.traceMediaId;
        }

        public static final class Builder {
            private String jobId; 
            private String traceMediaId; 

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * TraceMediaId.
             */
            public Builder traceMediaId(String traceMediaId) {
                this.traceMediaId = traceMediaId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
