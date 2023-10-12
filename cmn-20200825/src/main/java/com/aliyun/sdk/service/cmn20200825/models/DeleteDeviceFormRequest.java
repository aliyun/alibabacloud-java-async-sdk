// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeviceFormRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceFormRequest</p>
 */
public class DeleteDeviceFormRequest extends Request {
    @Body
    @NameInMap("DeviceFormId")
    @Validation(required = true)
    private String deviceFormId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteDeviceFormRequest(Builder builder) {
        super(builder);
        this.deviceFormId = builder.deviceFormId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeviceFormRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDeviceFormRequest, Builder> {
        private String deviceFormId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeviceFormRequest request) {
            super(request);
            this.deviceFormId = request.deviceFormId;
            this.instanceId = request.instanceId;
        } 

        /**
         * DeviceFormId.
         */
        public Builder deviceFormId(String deviceFormId) {
            this.putBodyParameter("DeviceFormId", deviceFormId);
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
        public DeleteDeviceFormRequest build() {
            return new DeleteDeviceFormRequest(this);
        } 

    } 

}
