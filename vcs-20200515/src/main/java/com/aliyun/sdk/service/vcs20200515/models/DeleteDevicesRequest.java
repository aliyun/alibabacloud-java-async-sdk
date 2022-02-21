// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevicesRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevicesRequest</p>
 */
public class DeleteDevicesRequest extends Request {
    @Body
    @NameInMap("DeviceIdList")
    @Validation(required = true)
    private String deviceIdList;

    private DeleteDevicesRequest(Builder builder) {
        super(builder);
        this.deviceIdList = builder.deviceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceIdList
     */
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

    public static final class Builder extends Request.Builder<DeleteDevicesRequest, Builder> {
        private String deviceIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevicesRequest response) {
            super(response);
            this.deviceIdList = response.deviceIdList;
        } 

        /**
         * DeviceIdList.
         */
        public Builder deviceIdList(String deviceIdList) {
            this.putBodyParameter("DeviceIdList", deviceIdList);
            this.deviceIdList = deviceIdList;
            return this;
        }

        @Override
        public DeleteDevicesRequest build() {
            return new DeleteDevicesRequest(this);
        } 

    } 

}
