// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link GetTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenResponseBody</p>
 */
public class GetTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private GetTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetTokenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetTokenResponseBody build() {
            return new GetTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("deviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("nonce")
        private String nonce;

        @com.aliyun.core.annotation.NameInMap("requestIp")
        private String requestIp;

        @com.aliyun.core.annotation.NameInMap("responseTime")
        private String responseTime;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.deviceName = builder.deviceName;
            this.nonce = builder.nonce;
            this.requestIp = builder.requestIp;
            this.responseTime = builder.responseTime;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return nonce
         */
        public String getNonce() {
            return this.nonce;
        }

        /**
         * @return requestIp
         */
        public String getRequestIp() {
            return this.requestIp;
        }

        /**
         * @return responseTime
         */
        public String getResponseTime() {
            return this.responseTime;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String appId; 
            private String deviceName; 
            private String nonce; 
            private String requestIp; 
            private String responseTime; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.deviceName = model.deviceName;
                this.nonce = model.nonce;
                this.requestIp = model.requestIp;
                this.responseTime = model.responseTime;
                this.signature = model.signature;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * deviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * nonce.
             */
            public Builder nonce(String nonce) {
                this.nonce = nonce;
                return this;
            }

            /**
             * requestIp.
             */
            public Builder requestIp(String requestIp) {
                this.requestIp = requestIp;
                return this;
            }

            /**
             * responseTime.
             */
            public Builder responseTime(String responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            /**
             * signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
