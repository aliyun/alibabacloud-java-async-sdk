// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceGroupRequest</p>
 */
public class GetDeviceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceGroupId;

    private GetDeviceGroupRequest(Builder builder) {
        super(builder);
        this.deviceGroupId = builder.deviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public static final class Builder extends Request.Builder<GetDeviceGroupRequest, Builder> {
        private String deviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceGroupRequest request) {
            super(request);
            this.deviceGroupId = request.deviceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device-group-5191cf830a5e****</p>
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        @Override
        public GetDeviceGroupRequest build() {
            return new GetDeviceGroupRequest(this);
        } 

    } 

}
