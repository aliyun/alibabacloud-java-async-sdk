// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>AddFaceDeviceGroupRequest</p>
 */
public class AddFaceDeviceGroupRequest extends Request {
    @Query
    @NameInMap("DeviceGroupName")
    @Validation(required = true)
    private String deviceGroupName;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    private AddFaceDeviceGroupRequest(Builder builder) {
        super(builder);
        this.deviceGroupName = builder.deviceGroupName;
        this.isolationId = builder.isolationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFaceDeviceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupName
     */
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    public static final class Builder extends Request.Builder<AddFaceDeviceGroupRequest, Builder> {
        private String deviceGroupName; 
        private String isolationId; 

        private Builder() {
            super();
        } 

        private Builder(AddFaceDeviceGroupRequest request) {
            super(request);
            this.deviceGroupName = request.deviceGroupName;
            this.isolationId = request.isolationId;
        } 

        /**
         * DeviceGroupName.
         */
        public Builder deviceGroupName(String deviceGroupName) {
            this.putQueryParameter("DeviceGroupName", deviceGroupName);
            this.deviceGroupName = deviceGroupName;
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
        public AddFaceDeviceGroupRequest build() {
            return new AddFaceDeviceGroupRequest(this);
        } 

    } 

}
