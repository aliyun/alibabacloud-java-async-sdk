// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevicePictureRequest} extends {@link RequestModel}
 *
 * <p>GetDevicePictureRequest</p>
 */
public class GetDevicePictureRequest extends Request {
    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    private GetDevicePictureRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevicePictureRequest create() {
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

    public static final class Builder extends Request.Builder<GetDevicePictureRequest, Builder> {
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDevicePictureRequest response) {
            super(response);
            this.deviceId = response.deviceId;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public GetDevicePictureRequest build() {
            return new GetDevicePictureRequest(this);
        } 

    } 

}
