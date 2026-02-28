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
 * {@link CreateLoRaNodesTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateLoRaNodesTaskRequest</p>
 */
public class CreateLoRaNodesTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DeviceInfo> deviceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private CreateLoRaNodesTaskRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoRaNodesTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceInfo
     */
    public java.util.List<DeviceInfo> getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<CreateLoRaNodesTaskRequest, Builder> {
        private java.util.List<DeviceInfo> deviceInfo; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoRaNodesTaskRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The LoRaWAN devices.</p>
         * <p>This parameter is required.</p>
         */
        public Builder deviceInfo(java.util.List<DeviceInfo> deviceInfo) {
            this.putQueryParameter("DeviceInfo", deviceInfo);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the devices belong.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public CreateLoRaNodesTaskRequest build() {
            return new CreateLoRaNodesTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLoRaNodesTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateLoRaNodesTaskRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevEui")
        private String devEui;

        @com.aliyun.core.annotation.NameInMap("PinCode")
        private String pinCode;

        private DeviceInfo(Builder builder) {
            this.devEui = builder.devEui;
            this.pinCode = builder.pinCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return devEui
         */
        public String getDevEui() {
            return this.devEui;
        }

        /**
         * @return pinCode
         */
        public String getPinCode() {
            return this.pinCode;
        }

        public static final class Builder {
            private String devEui; 
            private String pinCode; 

            private Builder() {
            } 

            private Builder(DeviceInfo model) {
                this.devEui = model.devEui;
                this.pinCode = model.pinCode;
            } 

            /**
             * <p>The DevEUI of the LoRaWAN device.</p>
             * 
             * <strong>example:</strong>
             * <p>d896e0efff00****</p>
             */
            public Builder devEui(String devEui) {
                this.devEui = devEui;
                return this;
            }

            /**
             * <p>The PIN code of the LoRaWAN device. The value of the parameter is used to verify the DevEUI.</p>
             * 
             * <strong>example:</strong>
             * <p>123***</p>
             */
            public Builder pinCode(String pinCode) {
                this.pinCode = pinCode;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
}
