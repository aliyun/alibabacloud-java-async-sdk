// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteFaceDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceDeviceGroupRequest</p>
 */
public class DeleteFaceDeviceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteFaceDeviceGroupRequest request) {
            super(request);
            this.deviceGroupId = request.deviceGroupId;
            this.isolationId = request.isolationId;
        } 

        /**
         * <p>The device group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qaf2tihq</p>
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * <p>The isolation ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestIsolationId</p>
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
