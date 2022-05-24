// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTraceAbResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTraceAbResponseBody</p>
 */
public class QueryTraceAbResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestID")
    private String requestID;

    @NameInMap("StatusCode")
    private Long statusCode;

    private QueryTraceAbResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestID = builder.requestID;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceAbResponseBody create() {
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
         * 返回结构
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

        public QueryTraceAbResponseBody build() {
            return new QueryTraceAbResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Callback")
        private String callback;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Input")
        private String input;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Level")
        private Long level;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("Output")
        private String output;

        @NameInMap("Result")
        private String result;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.callback = builder.callback;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.level = builder.level;
            this.mediaId = builder.mediaId;
            this.output = builder.output;
            this.result = builder.result;
            this.status = builder.status;
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
         * @return callback
         */
        public String getCallback() {
            return this.callback;
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
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
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
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String callback; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String input; 
            private String jobId; 
            private Long level; 
            private String mediaId; 
            private String output; 
            private String result; 
            private String status; 
            private String userData; 
            private Long userId; 

            /**
             * 任务结果回调
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

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
             * 输入oss地址
             */
            public Builder input(String input) {
                this.input = input;
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
             * 水印强度
             */
            public Builder level(Long level) {
                this.level = level;
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
             * 输出地址
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * 任务结果
             */
            public Builder result(String result) {
                this.result = result;
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
             * 用户数据
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
