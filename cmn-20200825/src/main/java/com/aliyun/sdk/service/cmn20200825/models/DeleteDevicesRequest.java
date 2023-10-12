// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

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
    @NameInMap("DeviceIds")
    @Validation(required = true)
    private java.util.List < String > deviceIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteDevicesRequest(Builder builder) {
        super(builder);
        this.deviceIds = builder.deviceIds;
        this.instanceId = builder.instanceId;
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
     * @return deviceIds
     */
    public java.util.List < String > getDeviceIds() {
        return this.deviceIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDevicesRequest, Builder> {
        private java.util.List < String > deviceIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevicesRequest request) {
            super(request);
            this.deviceIds = request.deviceIds;
            this.instanceId = request.instanceId;
        } 

        /**
         * DeviceIds.
         */
        public Builder deviceIds(java.util.List < String > deviceIds) {
            String deviceIdsShrink = shrink(deviceIds, "DeviceIds", "json");
            this.putBodyParameter("DeviceIds", deviceIdsShrink);
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteDevicesRequest build() {
            return new DeleteDevicesRequest(this);
        } 

    } 

}
