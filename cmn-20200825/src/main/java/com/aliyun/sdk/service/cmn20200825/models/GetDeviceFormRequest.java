// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceFormRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceFormRequest</p>
 */
public class GetDeviceFormRequest extends Request {
    @Query
    @NameInMap("DeviceFormId")
    @Validation(required = true)
    private String deviceFormId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetDeviceFormRequest(Builder builder) {
        super(builder);
        this.deviceFormId = builder.deviceFormId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceFormRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceFormId
     */
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetDeviceFormRequest, Builder> {
        private String deviceFormId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceFormRequest request) {
            super(request);
            this.deviceFormId = request.deviceFormId;
            this.instanceId = request.instanceId;
        } 

        /**
         * DeviceFormId.
         */
        public Builder deviceFormId(String deviceFormId) {
            this.putQueryParameter("DeviceFormId", deviceFormId);
            this.deviceFormId = deviceFormId;
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
        public GetDeviceFormRequest build() {
            return new GetDeviceFormRequest(this);
        } 

    } 

}
