// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceResourceRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceResourceRequest</p>
 */
public class GetDeviceResourceRequest extends Request {
    @Query
    @NameInMap("DeviceResourceId")
    @Validation(required = true)
    private String deviceResourceId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetDeviceResourceRequest(Builder builder) {
        super(builder);
        this.deviceResourceId = builder.deviceResourceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceResourceId
     */
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetDeviceResourceRequest, Builder> {
        private String deviceResourceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceResourceRequest request) {
            super(request);
            this.deviceResourceId = request.deviceResourceId;
            this.instanceId = request.instanceId;
        } 

        /**
         * DeviceResourceId.
         */
        public Builder deviceResourceId(String deviceResourceId) {
            this.putQueryParameter("DeviceResourceId", deviceResourceId);
            this.deviceResourceId = deviceResourceId;
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
        public GetDeviceResourceRequest build() {
            return new GetDeviceResourceRequest(this);
        } 

    } 

}
