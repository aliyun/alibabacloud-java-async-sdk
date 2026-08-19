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
 * {@link RemoveDeviceGroupMatchDevicesRequest} extends {@link RequestModel}
 *
 * <p>RemoveDeviceGroupMatchDevicesRequest</p>
 */
public class RemoveDeviceGroupMatchDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> devTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceGroupId;

    private RemoveDeviceGroupMatchDevicesRequest(Builder builder) {
        super(builder);
        this.devTags = builder.devTags;
        this.deviceGroupId = builder.deviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDeviceGroupMatchDevicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devTags
     */
    public java.util.List<String> getDevTags() {
        return this.devTags;
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public static final class Builder extends Request.Builder<RemoveDeviceGroupMatchDevicesRequest, Builder> {
        private java.util.List<String> devTags; 
        private String deviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDeviceGroupMatchDevicesRequest request) {
            super(request);
            this.devTags = request.devTags;
            this.deviceGroupId = request.deviceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder devTags(java.util.List<String> devTags) {
            this.putBodyParameter("DevTags", devTags);
            this.devTags = devTags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device-group-5191cf830a5e****</p>
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putBodyParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        @Override
        public RemoveDeviceGroupMatchDevicesRequest build() {
            return new RemoveDeviceGroupMatchDevicesRequest(this);
        } 

    } 

}
