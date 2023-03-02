// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.moguan_sdk20210415.models;

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
    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Body
    @NameInMap("Extend")
    @Validation(required = true)
    private java.util.Map < String, ? > extend;

    @Body
    @NameInMap("SdkCode")
    @Validation(required = true)
    private String sdkCode;

    @Body
    @NameInMap("UserDeviceId")
    @Validation(required = true)
    private String userDeviceId;

    private RegisterDeviceRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.deviceId = builder.deviceId;
        this.extend = builder.extend;
        this.sdkCode = builder.sdkCode;
        this.userDeviceId = builder.userDeviceId;
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
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return extend
     */
    public java.util.Map < String, ? > getExtend() {
        return this.extend;
    }

    /**
     * @return sdkCode
     */
    public String getSdkCode() {
        return this.sdkCode;
    }

    /**
     * @return userDeviceId
     */
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

    public static final class Builder extends Request.Builder<RegisterDeviceRequest, Builder> {
        private String appKey; 
        private String deviceId; 
        private java.util.Map < String, ? > extend; 
        private String sdkCode; 
        private String userDeviceId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterDeviceRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.deviceId = request.deviceId;
            this.extend = request.extend;
            this.sdkCode = request.sdkCode;
            this.userDeviceId = request.userDeviceId;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(java.util.Map < String, ? > extend) {
            String extendShrink = shrink(extend, "Extend", "json");
            this.putBodyParameter("Extend", extendShrink);
            this.extend = extend;
            return this;
        }

        /**
         * SdkCode.
         */
        public Builder sdkCode(String sdkCode) {
            this.putBodyParameter("SdkCode", sdkCode);
            this.sdkCode = sdkCode;
            return this;
        }

        /**
         * UserDeviceId.
         */
        public Builder userDeviceId(String userDeviceId) {
            this.putBodyParameter("UserDeviceId", userDeviceId);
            this.userDeviceId = userDeviceId;
            return this;
        }

        @Override
        public RegisterDeviceRequest build() {
            return new RegisterDeviceRequest(this);
        } 

    } 

}
