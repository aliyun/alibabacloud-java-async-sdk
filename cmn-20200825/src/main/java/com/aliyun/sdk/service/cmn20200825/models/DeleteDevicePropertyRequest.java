// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevicePropertyRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevicePropertyRequest</p>
 */
public class DeleteDevicePropertyRequest extends Request {
    @Body
    @NameInMap("DevicePropertyId")
    @Validation(required = true)
    private String devicePropertyId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteDevicePropertyRequest(Builder builder) {
        super(builder);
        this.devicePropertyId = builder.devicePropertyId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevicePropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devicePropertyId
     */
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDevicePropertyRequest, Builder> {
        private String devicePropertyId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevicePropertyRequest request) {
            super(request);
            this.devicePropertyId = request.devicePropertyId;
            this.instanceId = request.instanceId;
        } 

        /**
         * DevicePropertyId.
         */
        public Builder devicePropertyId(String devicePropertyId) {
            this.putBodyParameter("DevicePropertyId", devicePropertyId);
            this.devicePropertyId = devicePropertyId;
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
        public DeleteDevicePropertyRequest build() {
            return new DeleteDevicePropertyRequest(this);
        } 

    } 

}
