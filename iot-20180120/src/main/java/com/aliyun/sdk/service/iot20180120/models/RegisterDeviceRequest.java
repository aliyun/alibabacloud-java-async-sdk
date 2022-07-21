// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDeviceRequest} extends {@link RequestModel}
 *
 * <p>RegisterDeviceRequest</p>
 */
public class RegisterDeviceRequest extends Request {
    @Query
    @NameInMap("AppKey")
    private String appKey;

    @Query
    @NameInMap("DevEui")
    private String devEui;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JoinEui")
    private String joinEui;

    @Query
    @NameInMap("LoraNodeType")
    private String loraNodeType;

    @Query
    @NameInMap("Nickname")
    private String nickname;

    @Query
    @NameInMap("PinCode")
    private String pinCode;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
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
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * DevEui.
         */
        public Builder devEui(String devEui) {
            this.putQueryParameter("DevEui", devEui);
            this.devEui = devEui;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * JoinEui.
         */
        public Builder joinEui(String joinEui) {
            this.putQueryParameter("JoinEui", joinEui);
            this.joinEui = joinEui;
            return this;
        }

        /**
         * LoraNodeType.
         */
        public Builder loraNodeType(String loraNodeType) {
            this.putQueryParameter("LoraNodeType", loraNodeType);
            this.loraNodeType = loraNodeType;
            return this;
        }

        /**
         * Nickname.
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * PinCode.
         */
        public Builder pinCode(String pinCode) {
            this.putQueryParameter("PinCode", pinCode);
            this.pinCode = pinCode;
            return this;
        }

        /**
         * ProductKey.
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
