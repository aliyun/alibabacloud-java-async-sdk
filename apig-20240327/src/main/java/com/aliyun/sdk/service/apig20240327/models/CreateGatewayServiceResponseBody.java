// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGatewayServiceResponseBody</p>
 */
public class CreateGatewayServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateGatewayServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayServiceResponseBody create() {
        return builder().build();
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

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGatewayServiceResponseBody build() {
            return new CreateGatewayServiceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayServiceIds")
        private java.util.List < String > gatewayServiceIds;

        private Data(Builder builder) {
            this.gatewayServiceIds = builder.gatewayServiceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gatewayServiceIds
         */
        public java.util.List < String > getGatewayServiceIds() {
            return this.gatewayServiceIds;
        }

        public static final class Builder {
            private java.util.List < String > gatewayServiceIds; 

            /**
             * gatewayServiceIds.
             */
            public Builder gatewayServiceIds(java.util.List < String > gatewayServiceIds) {
                this.gatewayServiceIds = gatewayServiceIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
