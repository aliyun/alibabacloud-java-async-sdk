// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNVRDeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteNVRDeviceRequest</p>
 */
public class DeleteNVRDeviceRequest extends Request {
    @Body
    @NameInMap("DeviceCodes")
    private String deviceCodes;

    private DeleteNVRDeviceRequest(Builder builder) {
        super(builder);
        this.deviceCodes = builder.deviceCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNVRDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceCodes
     */
    public String getDeviceCodes() {
        return this.deviceCodes;
    }

    public static final class Builder extends Request.Builder<DeleteNVRDeviceRequest, Builder> {
        private String deviceCodes; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNVRDeviceRequest response) {
            super(response);
            this.deviceCodes = response.deviceCodes;
        } 

        /**
         * DeviceCodes.
         */
        public Builder deviceCodes(String deviceCodes) {
            this.putBodyParameter("DeviceCodes", deviceCodes);
            this.deviceCodes = deviceCodes;
            return this;
        }

        @Override
        public DeleteNVRDeviceRequest build() {
            return new DeleteNVRDeviceRequest(this);
        } 

    } 

}
