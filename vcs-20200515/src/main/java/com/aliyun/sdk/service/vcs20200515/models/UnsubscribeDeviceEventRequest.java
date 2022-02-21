// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnsubscribeDeviceEventRequest} extends {@link RequestModel}
 *
 * <p>UnsubscribeDeviceEventRequest</p>
 */
public class UnsubscribeDeviceEventRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    private UnsubscribeDeviceEventRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnsubscribeDeviceEventRequest create() {
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

    public static final class Builder extends Request.Builder<UnsubscribeDeviceEventRequest, Builder> {
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(UnsubscribeDeviceEventRequest response) {
            super(response);
            this.deviceId = response.deviceId;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public UnsubscribeDeviceEventRequest build() {
            return new UnsubscribeDeviceEventRequest(this);
        } 

    } 

}
