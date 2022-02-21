// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeDeviceEventRequest} extends {@link RequestModel}
 *
 * <p>SubscribeDeviceEventRequest</p>
 */
public class SubscribeDeviceEventRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("PushConfig")
    @Validation(required = true)
    private String pushConfig;

    private SubscribeDeviceEventRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.pushConfig = builder.pushConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeDeviceEventRequest create() {
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
     * @return pushConfig
     */
    public String getPushConfig() {
        return this.pushConfig;
    }

    public static final class Builder extends Request.Builder<SubscribeDeviceEventRequest, Builder> {
        private String deviceId; 
        private String pushConfig; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeDeviceEventRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.pushConfig = response.pushConfig;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * PushConfig.
         */
        public Builder pushConfig(String pushConfig) {
            this.putQueryParameter("PushConfig", pushConfig);
            this.pushConfig = pushConfig;
            return this;
        }

        @Override
        public SubscribeDeviceEventRequest build() {
            return new SubscribeDeviceEventRequest(this);
        } 

    } 

}
