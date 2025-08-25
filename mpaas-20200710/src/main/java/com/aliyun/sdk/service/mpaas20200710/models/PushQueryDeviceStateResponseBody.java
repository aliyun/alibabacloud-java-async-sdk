// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710.models;

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
 * {@link PushQueryDeviceStateResponseBody} extends {@link TeaModel}
 *
 * <p>PushQueryDeviceStateResponseBody</p>
 */
public class PushQueryDeviceStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PushQueryDeviceStateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushQueryDeviceStateResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PushQueryDeviceStateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
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

        public PushQueryDeviceStateResponseBody build() {
            return new PushQueryDeviceStateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PushQueryDeviceStateResponseBody} extends {@link TeaModel}
     *
     * <p>PushQueryDeviceStateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryToken")
        private String deliveryToken;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Statue")
        private String statue;

        @com.aliyun.core.annotation.NameInMap("ThirdToken")
        private String thirdToken;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.deliveryToken = builder.deliveryToken;
            this.deviceId = builder.deviceId;
            this.manufacturer = builder.manufacturer;
            this.platform = builder.platform;
            this.statue = builder.statue;
            this.thirdToken = builder.thirdToken;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deliveryToken
         */
        public String getDeliveryToken() {
            return this.deliveryToken;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return statue
         */
        public String getStatue() {
            return this.statue;
        }

        /**
         * @return thirdToken
         */
        public String getThirdToken() {
            return this.thirdToken;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String deliveryToken; 
            private String deviceId; 
            private String manufacturer; 
            private String platform; 
            private String statue; 
            private String thirdToken; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deliveryToken = model.deliveryToken;
                this.deviceId = model.deviceId;
                this.manufacturer = model.manufacturer;
                this.platform = model.platform;
                this.statue = model.statue;
                this.thirdToken = model.thirdToken;
                this.userId = model.userId;
            } 

            /**
             * DeliveryToken.
             */
            public Builder deliveryToken(String deliveryToken) {
                this.deliveryToken = deliveryToken;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Statue.
             */
            public Builder statue(String statue) {
                this.statue = statue;
                return this;
            }

            /**
             * ThirdToken.
             */
            public Builder thirdToken(String thirdToken) {
                this.thirdToken = thirdToken;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
