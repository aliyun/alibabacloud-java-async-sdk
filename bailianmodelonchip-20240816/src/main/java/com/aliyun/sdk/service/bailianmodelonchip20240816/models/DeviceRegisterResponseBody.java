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
 * {@link DeviceRegisterResponseBody} extends {@link TeaModel}
 *
 * <p>DeviceRegisterResponseBody</p>
 */
public class DeviceRegisterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DeviceRegisterResponseBody(Builder builder) {
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

    public static DeviceRegisterResponseBody create() {
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
    public Integer getHttpStatusCode() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeviceRegisterResponseBody model) {
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
        public Builder httpStatusCode(Integer httpStatusCode) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>52548360-B3AA-55EA-893F-48C16470F64A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeviceRegisterResponseBody build() {
            return new DeviceRegisterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeviceRegisterResponseBody} extends {@link TeaModel}
     *
     * <p>DeviceRegisterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("deviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("nonce")
        private String nonce;

        @com.aliyun.core.annotation.NameInMap("responseTime")
        private String responseTime;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.deviceName = builder.deviceName;
            this.nonce = builder.nonce;
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
            private String responseTime; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.deviceName = model.deviceName;
                this.nonce = model.nonce;
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
