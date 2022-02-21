// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveCameraForInstanceRequest} extends {@link RequestModel}
 *
 * <p>RemoveCameraForInstanceRequest</p>
 */
public class RemoveCameraForInstanceRequest extends Request {
    @Body
    @NameInMap("CameraIds")
    @Validation(required = true)
    private java.util.List < String > cameraIds;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private RemoveCameraForInstanceRequest(Builder builder) {
        super(builder);
        this.cameraIds = builder.cameraIds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveCameraForInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveCameraForInstanceRequest, Builder> {
        private java.util.List < String > cameraIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveCameraForInstanceRequest response) {
            super(response);
            this.cameraIds = response.cameraIds;
            this.instanceId = response.instanceId;
        } 

        /**
         * 设备ID列表
         */
        public Builder cameraIds(java.util.List < String > cameraIds) {
            this.putBodyParameter("CameraIds", cameraIds);
            this.cameraIds = cameraIds;
            return this;
        }

        /**
         * 实例id
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public RemoveCameraForInstanceRequest build() {
            return new RemoveCameraForInstanceRequest(this);
        } 

    } 

}
