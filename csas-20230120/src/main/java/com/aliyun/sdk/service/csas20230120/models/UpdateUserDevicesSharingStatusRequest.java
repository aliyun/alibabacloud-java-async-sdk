// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserDevicesSharingStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserDevicesSharingStatusRequest</p>
 */
public class UpdateUserDevicesSharingStatusRequest extends Request {
    @Body
    @NameInMap("DeviceTags")
    @Validation(required = true)
    private java.util.List < String > deviceTags;

    @Body
    @NameInMap("SharingStatus")
    @Validation(required = true)
    private Boolean sharingStatus;

    private UpdateUserDevicesSharingStatusRequest(Builder builder) {
        super(builder);
        this.deviceTags = builder.deviceTags;
        this.sharingStatus = builder.sharingStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserDevicesSharingStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceTags
     */
    public java.util.List < String > getDeviceTags() {
        return this.deviceTags;
    }

    /**
     * @return sharingStatus
     */
    public Boolean getSharingStatus() {
        return this.sharingStatus;
    }

    public static final class Builder extends Request.Builder<UpdateUserDevicesSharingStatusRequest, Builder> {
        private java.util.List < String > deviceTags; 
        private Boolean sharingStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserDevicesSharingStatusRequest request) {
            super(request);
            this.deviceTags = request.deviceTags;
            this.sharingStatus = request.sharingStatus;
        } 

        /**
         * DeviceTags.
         */
        public Builder deviceTags(java.util.List < String > deviceTags) {
            this.putBodyParameter("DeviceTags", deviceTags);
            this.deviceTags = deviceTags;
            return this;
        }

        /**
         * SharingStatus.
         */
        public Builder sharingStatus(Boolean sharingStatus) {
            this.putBodyParameter("SharingStatus", sharingStatus);
            this.sharingStatus = sharingStatus;
            return this;
        }

        @Override
        public UpdateUserDevicesSharingStatusRequest build() {
            return new UpdateUserDevicesSharingStatusRequest(this);
        } 

    } 

}
