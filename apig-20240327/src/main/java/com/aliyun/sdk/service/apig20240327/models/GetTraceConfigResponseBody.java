// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetTraceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetTraceConfigResponseBody</p>
 */
public class GetTraceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetTraceConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTraceConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Response Code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response Data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error Message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>2F46B9E7-67EF-5C8A-BA52-D38D5B32AF2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Boolean	Request Result, with the following values:
         * true: Request succeeded.
         * false: Request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTraceConfigResponseBody build() {
            return new GetTraceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTraceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("sampleRatio")
        private Integer sampleRatio;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("servicePort")
        private String servicePort;

        @com.aliyun.core.annotation.NameInMap("traceType")
        private String traceType;

        private Data(Builder builder) {
            this.enable = builder.enable;
            this.sampleRatio = builder.sampleRatio;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
            this.traceType = builder.traceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return sampleRatio
         */
        public Integer getSampleRatio() {
            return this.sampleRatio;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return servicePort
         */
        public String getServicePort() {
            return this.servicePort;
        }

        /**
         * @return traceType
         */
        public String getTraceType() {
            return this.traceType;
        }

        public static final class Builder {
            private Boolean enable; 
            private Integer sampleRatio; 
            private String serviceId; 
            private String servicePort; 
            private String traceType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enable = model.enable;
                this.sampleRatio = model.sampleRatio;
                this.serviceId = model.serviceId;
                this.servicePort = model.servicePort;
                this.traceType = model.traceType;
            } 

            /**
             * <p>Whether to Enable Tracing:
             * true: Enabled
             * false: Disabled</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Sampling Rate</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder sampleRatio(Integer sampleRatio) {
                this.sampleRatio = sampleRatio;
                return this;
            }

            /**
             * <p>Service ID, present when the tracing type is SKYWALKING</p>
             * 
             * <strong>example:</strong>
             * <p>ss-co370icmjeu****</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>服务端口，链路追踪类型为SKYWALKING时存在该参数</p>
             * 
             * <strong>example:</strong>
             * <p>8090</p>
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>Tracing Type:</p>
             * <ul>
             * <li>XTRACE</li>
             * <li>SKYWALKING</li>
             * <li>OPENTELEMETRY</li>
             * <li>OTSKYWALKING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SKYWALKING</p>
             */
            public Builder traceType(String traceType) {
                this.traceType = traceType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
