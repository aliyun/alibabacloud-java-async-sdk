// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIPCDeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteIPCDeviceRequest</p>
 */
public class DeleteIPCDeviceRequest extends Request {
    @Body
    @NameInMap("DeviceCodes")
    private String deviceCodes;

    private DeleteIPCDeviceRequest(Builder builder) {
        super(builder);
        this.deviceCodes = builder.deviceCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIPCDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteIPCDeviceRequest, Builder> {
        private String deviceCodes; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIPCDeviceRequest response) {
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
        public DeleteIPCDeviceRequest build() {
            return new DeleteIPCDeviceRequest(this);
        } 

    } 

}
