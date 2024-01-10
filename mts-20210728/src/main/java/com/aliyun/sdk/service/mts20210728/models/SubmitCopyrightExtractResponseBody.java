// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCopyrightExtractResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitCopyrightExtractResponseBody</p>
 */
public class SubmitCopyrightExtractResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestID")
    private String requestID;

    @NameInMap("StatusCode")
    private Long statusCode;

    private SubmitCopyrightExtractResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestID = builder.requestID;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCopyrightExtractResponseBody create() {
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

        public SubmitCopyrightExtractResponseBody build() {
            return new SubmitCopyrightExtractResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("JobId")
        private String jobId;

        private Data(Builder builder) {
            this.jobId = builder.jobId;
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

        public static final class Builder {
            private String jobId; 

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
