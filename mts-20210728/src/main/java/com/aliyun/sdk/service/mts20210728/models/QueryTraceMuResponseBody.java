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
         * 返回数据结构
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 返回信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求id
         */
        public Builder requestID(String requestID) {
            this.requestID = requestID;
            return this;
        }

        /**
         * 状态码
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
             * 创建时间
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 最后修改时间
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 任务id
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * 媒体id
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * 输出oss地址
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * 任务状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 溯源水印信息
             */
            public Builder trace(String trace) {
                this.trace = trace;
                return this;
            }

            /**
             * 溯源水印信息id
             */
            public Builder traceId(Long traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * 用户自定义数据
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * uid
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
