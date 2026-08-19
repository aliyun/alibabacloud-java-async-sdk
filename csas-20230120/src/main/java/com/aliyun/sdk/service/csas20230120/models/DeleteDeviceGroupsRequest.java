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
 * {@link DeleteDeviceGroupsRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceGroupsRequest</p>
 */
public class DeleteDeviceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceGroupIds")
    private java.util.List<String> deviceGroupIds;

    private DeleteDeviceGroupsRequest(Builder builder) {
        super(builder);
        this.deviceGroupIds = builder.deviceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeviceGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupIds
     */
    public java.util.List<String> getDeviceGroupIds() {
        return this.deviceGroupIds;
    }

    public static final class Builder extends Request.Builder<DeleteDeviceGroupsRequest, Builder> {
        private java.util.List<String> deviceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeviceGroupsRequest request) {
            super(request);
            this.deviceGroupIds = request.deviceGroupIds;
        } 

        /**
         * DeviceGroupIds.
         */
        public Builder deviceGroupIds(java.util.List<String> deviceGroupIds) {
            this.putBodyParameter("DeviceGroupIds", deviceGroupIds);
            this.deviceGroupIds = deviceGroupIds;
            return this;
        }

        @Override
        public DeleteDeviceGroupsRequest build() {
            return new DeleteDeviceGroupsRequest(this);
        } 

    } 

}
