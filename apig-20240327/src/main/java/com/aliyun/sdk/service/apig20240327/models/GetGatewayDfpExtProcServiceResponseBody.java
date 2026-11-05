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
 * {@link GetGatewayDfpExtProcServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayDfpExtProcServiceResponseBody</p>
 */
public class GetGatewayDfpExtProcServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayDfpExtProcServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayDfpExtProcServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGatewayDfpExtProcServiceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request result code. The value is Ok if the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The binding information of the dynamic forwarding ExtProc service for the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bound&quot;:true,&quot;serviceId&quot;:&quot;svc-cr8k0udlhtgt80sh7png&quot;,&quot;servicePort&quot;:9002}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The result description. This field contains the fault information if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>F7B8A1C2-1234-5678-90AB-CDEF12345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayDfpExtProcServiceResponseBody build() {
            return new GetGatewayDfpExtProcServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayDfpExtProcServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayDfpExtProcServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bound")
        private Boolean bound;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("servicePort")
        private Integer servicePort;

        private Data(Builder builder) {
            this.bound = builder.bound;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bound
         */
        public Boolean getBound() {
            return this.bound;
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
        public Integer getServicePort() {
            return this.servicePort;
        }

        public static final class Builder {
            private Boolean bound; 
            private String serviceId; 
            private Integer servicePort; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bound = model.bound;
                this.serviceId = model.serviceId;
                this.servicePort = model.servicePort;
            } 

            /**
             * <p>Indicates whether the gateway is bound to a dynamic forwarding ExtProc service.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bound(Boolean bound) {
                this.bound = bound;
                return this;
            }

            /**
             * <p>The ID of the bound ExtProc gRPC service. This field is not returned if no service is bound.</p>
             * 
             * <strong>example:</strong>
             * <p>svc-cr8k0udlhtgt80sh7png</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The gRPC port of the bound service. This field is not returned if no service is bound.</p>
             * 
             * <strong>example:</strong>
             * <p>9002</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
