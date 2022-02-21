// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCameraForInstanceRequest} extends {@link RequestModel}
 *
 * <p>AddCameraForInstanceRequest</p>
 */
public class AddCameraForInstanceRequest extends Request {
    @Body
    @NameInMap("CameraIds")
    @Validation(required = true)
    private java.util.List < String > cameraIds;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private AddCameraForInstanceRequest(Builder builder) {
        super(builder);
        this.cameraIds = builder.cameraIds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCameraForInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cameraIds
     */
    public java.util.List < String > getCameraIds() {
        return this.cameraIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<AddCameraForInstanceRequest, Builder> {
        private java.util.List < String > cameraIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AddCameraForInstanceRequest response) {
            super(response);
            this.cameraIds = response.cameraIds;
            this.instanceId = response.instanceId;
        } 

        /**
         * 设备Id
         */
        public Builder cameraIds(java.util.List < String > cameraIds) {
            this.putBodyParameter("CameraIds", cameraIds);
            this.cameraIds = cameraIds;
            return this;
        }

        /**
         * 实例Id
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public AddCameraForInstanceRequest build() {
            return new AddCameraForInstanceRequest(this);
        } 

    } 

}
