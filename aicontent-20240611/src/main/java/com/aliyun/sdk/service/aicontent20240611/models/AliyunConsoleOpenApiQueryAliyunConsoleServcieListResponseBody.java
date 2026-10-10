// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody} extends {@link TeaModel}
 *
 * <p>AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody</p>
 */
public class AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN_ERROR</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>未知错误</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody build() {
            return new AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody} extends {@link TeaModel}
     *
     * <p>AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FreeConcurrencyCount")
        private Integer freeConcurrencyCount;

        @com.aliyun.core.annotation.NameInMap("FreeCount")
        private Integer freeCount;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private Data(Builder builder) {
            this.freeConcurrencyCount = builder.freeConcurrencyCount;
            this.freeCount = builder.freeCount;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return freeConcurrencyCount
         */
        public Integer getFreeConcurrencyCount() {
            return this.freeConcurrencyCount;
        }

        /**
         * @return freeCount
         */
        public Integer getFreeCount() {
            return this.freeCount;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private Integer freeConcurrencyCount; 
            private Integer freeCount; 
            private String serviceCode; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.freeConcurrencyCount = model.freeConcurrencyCount;
                this.freeCount = model.freeCount;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The free trial concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder freeConcurrencyCount(Integer freeConcurrencyCount) {
                this.freeConcurrencyCount = freeConcurrencyCount;
                return this;
            }

            /**
             * <p>The free trial calls.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder freeCount(Integer freeCount) {
                this.freeCount = freeCount;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>online_ai_algorithm_personalized_text_to_image_call_count</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>AI算法模型-个性化文生图-在线按量调用</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
