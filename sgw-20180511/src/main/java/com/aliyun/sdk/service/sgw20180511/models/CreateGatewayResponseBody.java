// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGatewayResponseBody</p>
 */
public class CreateGatewayResponseBody extends TeaModel {
    @NameInMap("BuyURL")
    private String buyURL;

    @NameInMap("Code")
    private String code;

    @NameInMap("GatewayId")
    private String gatewayId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateGatewayResponseBody(Builder builder) {
        this.buyURL = builder.buyURL;
        this.code = builder.code;
        this.gatewayId = builder.gatewayId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return buyURL
     */
    public String getBuyURL() {
        return this.buyURL;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
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
        private String buyURL; 
        private String code; 
        private String gatewayId; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * BuyURL.
         */
        public Builder buyURL(String buyURL) {
            this.buyURL = buyURL;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateGatewayResponseBody build() {
            return new CreateGatewayResponseBody(this);
        } 

    } 

}
