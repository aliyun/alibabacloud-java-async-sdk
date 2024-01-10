// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTraceMuResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTraceMuResponseBody</p>
 */
public class QueryTraceMuResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestID")
    private String requestID;

    @NameInMap("StatusCode")
    private Long statusCode;

    private QueryTraceMuResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestID = builder.requestID;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceMuResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestID; 
        private Long statusCode; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public QueryTraceMuResponseBody build() {
            return new QueryTraceMuResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("Output")
        private String output;

        @NameInMap("Status")
        private String status;

        @NameInMap("Trace")
        private String trace;

        @NameInMap("TraceId")
        private Long traceId;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.output = builder.output;
            this.status = builder.status;
            this.trace = builder.trace;
            this.traceId = builder.traceId;
            this.userData = builder.userData;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trace
         */
        public String getTrace() {
            return this.trace;
        }

        /**
         * @return traceId
         */
        public Long getTraceId() {
            return this.traceId;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private String jobId; 
            private String mediaId; 
            private String output; 
            private String status; 
            private String trace; 
            private Long traceId; 
            private String userData; 
            private Long userId; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Trace.
             */
            public Builder trace(String trace) {
                this.trace = trace;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(Long traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
