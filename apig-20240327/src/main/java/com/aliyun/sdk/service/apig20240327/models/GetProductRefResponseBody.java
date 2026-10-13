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
 * {@link GetProductRefResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductRefResponseBody</p>
 */
public class GetProductRefResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetProductRefResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductRefResponseBody create() {
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

        private Builder(GetProductRefResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductRefResponseBody build() {
            return new GetProductRefResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProductRefResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductRefResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apigRefConfig")
        private HiMarketProductRefConfig apigRefConfig;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        private Data(Builder builder) {
            this.apigRefConfig = builder.apigRefConfig;
            this.gatewayId = builder.gatewayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apigRefConfig
         */
        public HiMarketProductRefConfig getApigRefConfig() {
            return this.apigRefConfig;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        public static final class Builder {
            private HiMarketProductRefConfig apigRefConfig; 
            private String gatewayId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apigRefConfig = model.apigRefConfig;
                this.gatewayId = model.gatewayId;
            } 

            /**
             * <p>The API configurations currently associated with the API product. The structure is derived from the common struct HiMarketProductRefConfig. This struct contains the gatewayId and apigRefConfig members. The inner apigRefConfig struct contains the mcpServerId, mcpRouteId, mcpServerName, agentApiId, agentApiName, modelApiId, and modelApiName members.</p>
             */
            public Builder apigRefConfig(HiMarketProductRefConfig apigRefConfig) {
                this.apigRefConfig = apigRefConfig;
                return this;
            }

            /**
             * <p>The gateway ID. The ID of the gateway instance where the association configuration of the API product resides.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-123456</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
