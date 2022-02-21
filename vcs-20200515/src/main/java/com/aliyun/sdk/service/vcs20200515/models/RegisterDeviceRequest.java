// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

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
    @NameInMap("DeviceId")
    private String deviceId;

    @Body
    @NameInMap("DeviceSn")
    @Validation(required = true)
    private String deviceSn;

    @Body
    @NameInMap("DeviceTimeStamp")
    @Validation(required = true)
    private String deviceTimeStamp;

    @Body
    @NameInMap("ServerId")
    private String serverId;

    private RegisterDeviceRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.deviceSn = builder.deviceSn;
        this.deviceTimeStamp = builder.deviceTimeStamp;
        this.serverId = builder.serverId;
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
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceSn
     */
    public String getDeviceSn() {
        return this.deviceSn;
    }

    /**
     * @return deviceTimeStamp
     */
    public String getDeviceTimeStamp() {
        return this.deviceTimeStamp;
    }

    /**
     * @return serverId
     */
    public String getServerId() {
        return this.serverId;
    }

    public static final class Builder extends Request.Builder<RegisterDeviceRequest, Builder> {
        private String deviceId; 
        private String deviceSn; 
        private String deviceTimeStamp; 
        private String serverId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterDeviceRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.deviceSn = response.deviceSn;
            this.deviceTimeStamp = response.deviceTimeStamp;
            this.serverId = response.serverId;
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
         * DeviceSn.
         */
        public Builder deviceSn(String deviceSn) {
            this.putBodyParameter("DeviceSn", deviceSn);
            this.deviceSn = deviceSn;
            return this;
        }

        /**
         * DeviceTimeStamp.
         */
        public Builder deviceTimeStamp(String deviceTimeStamp) {
            this.putBodyParameter("DeviceTimeStamp", deviceTimeStamp);
            this.deviceTimeStamp = deviceTimeStamp;
            return this;
        }

        /**
         * ServerId.
         */
        public Builder serverId(String serverId) {
            this.putBodyParameter("ServerId", serverId);
            this.serverId = serverId;
            return this;
        }

        @Override
        public RegisterDeviceRequest build() {
            return new RegisterDeviceRequest(this);
        } 

    } 

}
