// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserDevicesRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserDevicesRequest</p>
 */
public class DeleteUserDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceTags")
    private java.util.List < String > deviceTags;

    private DeleteUserDevicesRequest(Builder builder) {
        super(builder);
        this.deviceTags = builder.deviceTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserDevicesRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteUserDevicesRequest, Builder> {
        private java.util.List < String > deviceTags; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserDevicesRequest request) {
            super(request);
            this.deviceTags = request.deviceTags;
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
        public DeleteUserDevicesRequest build() {
            return new DeleteUserDevicesRequest(this);
        } 

    } 

}
