// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitImageCopyrightResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitImageCopyrightResponseBody</p>
 */
public class SubmitImageCopyrightResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestID")
    private String requestID;

    @NameInMap("StatusCode")
    private Long statusCode;

    private SubmitImageCopyrightResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestID = builder.requestID;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitImageCopyrightResponseBody create() {
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
         * 返回数据
         */
        public Builder data(Data data) {
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

        public SubmitImageCopyrightResponseBody build() {
            return new SubmitImageCopyrightResponseBody(this);
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
             * 任务id
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
