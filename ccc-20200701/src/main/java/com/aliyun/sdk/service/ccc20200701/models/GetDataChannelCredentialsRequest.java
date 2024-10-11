// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataChannelCredentialsRequest} extends {@link RequestModel}
 *
 * <p>GetDataChannelCredentialsRequest</p>
 */
public class GetDataChannelCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetDataChannelCredentialsRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataChannelCredentialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetDataChannelCredentialsRequest, Builder> {
        private String deviceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataChannelCredentialsRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetDataChannelCredentialsRequest build() {
            return new GetDataChannelCredentialsRequest(this);
        } 

    } 

}
