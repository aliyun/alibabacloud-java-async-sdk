// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link RegisterDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterDeviceResponseBody</p>
 */
public class RegisterDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RegisterDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDeviceResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RegisterDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The device information returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RegisterDeviceResponseBody build() {
            return new RegisterDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RegisterDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>RegisterDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevEui")
        private String devEui;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("JoinEui")
        private String joinEui;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        private Data(Builder builder) {
            this.devEui = builder.devEui;
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.iotId = builder.iotId;
            this.joinEui = builder.joinEui;
            this.nickname = builder.nickname;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return devEui
         */
        public String getDevEui() {
            return this.devEui;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSecret
         */
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return joinEui
         */
        public String getJoinEui() {
            return this.joinEui;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String devEui; 
            private String deviceName; 
            private String deviceSecret; 
            private String iotId; 
            private String joinEui; 
            private String nickname; 
            private String productKey; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.devEui = model.devEui;
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.iotId = model.iotId;
                this.joinEui = model.joinEui;
                this.nickname = model.nickname;
                this.productKey = model.productKey;
            } 

            /**
             * <p>The DevEUI of the LoRaWAN device. This parameter is returned only when you create a LoRaWAN device.</p>
             * 
             * <strong>example:</strong>
             * <p>e8SDdgeIlk3nED****</p>
             */
            public Builder devEui(String devEui) {
                this.devEui = devEui;
                return this;
            }

            /**
             * <p>The DeviceName of the device.</p>
             * <blockquote>
             * <p>Keep the information confidential.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The DeviceSecret of the device.</p>
             * <blockquote>
             * <p>Keep the information confidential.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>mz2Canp4GB7qRVf1OYPNtRqB2anu****</p>
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
             * <blockquote>
             * <p>Keep the information confidential.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1O4YPNtRqB2anumz2Canp4GB7q****</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The JoinEUI of the LoRaWAN device. This parameter is returned only when you create a LoRaWAN device.</p>
             * 
             * <strong>example:</strong>
             * <p>Ede4tde8erth****</p>
             */
            public Builder joinEui(String joinEui) {
                this.joinEui = joinEui;
                return this;
            }

            /**
             * <p>The alias of the device.</p>
             * <p>If you do not specify an alias for the device, this parameter is empty.</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
