// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceDeviceGroupRequest</p>
 */
public class DeleteFaceDeviceGroupRequest extends Request {
    @Query
    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    private String deviceGroupId;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    private DeleteFaceDeviceGroupRequest(Builder builder) {
        super(builder);
        this.deviceGroupId = builder.deviceGroupId;
        this.isolationId = builder.isolationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceDeviceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    public static final class Builder extends Request.Builder<DeleteFaceDeviceGroupRequest, Builder> {
        private String deviceGroupId; 
        private String isolationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceDeviceGroupRequest response) {
            super(response);
            this.deviceGroupId = response.deviceGroupId;
            this.isolationId = response.isolationId;
        } 

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        @Override
        public DeleteFaceDeviceGroupRequest build() {
            return new DeleteFaceDeviceGroupRequest(this);
        } 

    } 

}
