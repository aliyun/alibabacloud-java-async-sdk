// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserDevicesStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserDevicesStatusRequest</p>
 */
public class UpdateUserDevicesStatusRequest extends Request {
    @Body
    @NameInMap("DeviceAction")
    @Validation(required = true)
    private String deviceAction;

    @Body
    @NameInMap("DeviceTags")
    @Validation(required = true)
    private java.util.List < String > deviceTags;

    private UpdateUserDevicesStatusRequest(Builder builder) {
        super(builder);
        this.deviceAction = builder.deviceAction;
        this.deviceTags = builder.deviceTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserDevicesStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceAction
     */
    public String getDeviceAction() {
        return this.deviceAction;
    }

    /**
     * @return deviceTags
     */
    public java.util.List < String > getDeviceTags() {
        return this.deviceTags;
    }

    public static final class Builder extends Request.Builder<UpdateUserDevicesStatusRequest, Builder> {
        private String deviceAction; 
        private java.util.List < String > deviceTags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserDevicesStatusRequest request) {
            super(request);
            this.deviceAction = request.deviceAction;
            this.deviceTags = request.deviceTags;
        } 

        /**
         * DeviceAction.
         */
        public Builder deviceAction(String deviceAction) {
            this.putBodyParameter("DeviceAction", deviceAction);
            this.deviceAction = deviceAction;
            return this;
        }

        /**
         * DeviceTags.
         */
        public Builder deviceTags(java.util.List < String > deviceTags) {
            this.putBodyParameter("DeviceTags", deviceTags);
            this.deviceTags = deviceTags;
            return this;
        }

        @Override
        public UpdateUserDevicesStatusRequest build() {
            return new UpdateUserDevicesStatusRequest(this);
        } 

    } 

}
