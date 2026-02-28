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
 * {@link RegisterDeviceRequest} extends {@link RequestModel}
 *
 * <p>RegisterDeviceRequest</p>
 */
public class RegisterDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevEui")
    private String devEui;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JoinEui")
    private String joinEui;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoraNodeType")
    private String loraNodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nickname")
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PinCode")
    private String pinCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private RegisterDeviceRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.devEui = builder.devEui;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.joinEui = builder.joinEui;
        this.loraNodeType = builder.loraNodeType;
        this.nickname = builder.nickname;
        this.pinCode = builder.pinCode;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return joinEui
     */
    public String getJoinEui() {
        return this.joinEui;
    }

    /**
     * @return loraNodeType
     */
    public String getLoraNodeType() {
        return this.loraNodeType;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return pinCode
     */
    public String getPinCode() {
        return this.pinCode;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<RegisterDeviceRequest, Builder> {
        private String appKey; 
        private String devEui; 
        private String deviceName; 
        private String iotInstanceId; 
        private String joinEui; 
        private String loraNodeType; 
        private String nickname; 
        private String pinCode; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(RegisterDeviceRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.devEui = request.devEui;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.joinEui = request.joinEui;
            this.loraNodeType = request.loraNodeType;
            this.nickname = request.nickname;
            this.pinCode = request.pinCode;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The AppKey of the LoRaWAN device.</p>
         * <p>When you create a LoRaWAN device, set <strong>LoraNodeType</strong> to <strong>USERDEFINED</strong>. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>674f***</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The DevEUI of the LoRaWAN device.</p>
         * <p>This parameter is required when you create a LoRaWAN device.</p>
         * 
         * <strong>example:</strong>
         * <p>e8SDdgeIlk3nED****</p>
         */
        public Builder devEui(String devEui) {
            this.putQueryParameter("DevEui", devEui);
            this.devEui = devEui;
            return this;
        }

        /**
         * <p>The DeviceName of the device. The name must be 4 to 32 characters in length, and can contain letters, digits, hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
         * <p>You can use a combination of the DeviceName and ProductKey parameters to identify a device.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, IoT Platform randomly generates a DeviceName.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
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
         * <p>The JoinEUI of the LoRaWAN device.</p>
         * <p>When you create a LoRaWAN device, set <strong>LoraNodeType</strong> to <strong>USERDEFINED</strong>. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ede4tde8erth****</p>
         */
        public Builder joinEui(String joinEui) {
            this.putQueryParameter("JoinEui", joinEui);
            this.joinEui = joinEui;
            return this;
        }

        /**
         * <p>The type of the LoRaWAN device. Valid values:</p>
         * <ul>
         * <li><strong>ALIYUNDEFINED</strong>: The device is issued by Alibaba Cloud. You must specify <strong>DevEui</strong> and <strong>PinCode</strong>.</li>
         * <li><strong>USERDEFINED</strong>: The device is user-defined. You must specify <strong>DevEui</strong>, <strong>JoinEui</strong>, and <strong>AppKey</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUNDEFINED</p>
         */
        public Builder loraNodeType(String loraNodeType) {
            this.putQueryParameter("LoraNodeType", loraNodeType);
            this.loraNodeType = loraNodeType;
            return this;
        }

        /**
         * <p>The alias of the device. The alias must be 4 to 64 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <blockquote>
         * <p> If you do not specify this parameter, IoT Platform does not generate an alias for the device.</p>
         * </blockquote>
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The PIN code of the LoRaWAN device. This parameter is used to verify the DevEUI.</p>
         * <p>When you create a LoRaWAN device, set <strong>LoraNodeType</strong> to <strong>ALIYUNDEFINED</strong>. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DIe80dfeg*****</p>
         */
        public Builder pinCode(String pinCode) {
            this.putQueryParameter("PinCode", pinCode);
            this.pinCode = pinCode;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the device belongs. A ProductKey is a GUID that is issued by IoT Platform to a product.</p>
         * <p>You can use the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products within the current account.</p>
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
        public RegisterDeviceRequest build() {
            return new RegisterDeviceRequest(this);
        } 

    } 

}
