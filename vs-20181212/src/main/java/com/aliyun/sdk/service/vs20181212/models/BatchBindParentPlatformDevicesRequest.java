// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchBindParentPlatformDevicesRequest} extends {@link RequestModel}
 *
 * <p>BatchBindParentPlatformDevicesRequest</p>
 */
public class BatchBindParentPlatformDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentPlatformId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentPlatformId;

    private BatchBindParentPlatformDevicesRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.ownerId = builder.ownerId;
        this.parentPlatformId = builder.parentPlatformId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindParentPlatformDevicesRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return parentPlatformId
     */
    public String getParentPlatformId() {
        return this.parentPlatformId;
    }

    public static final class Builder extends Request.Builder<BatchBindParentPlatformDevicesRequest, Builder> {
        private String deviceId; 
        private Long ownerId; 
        private String parentPlatformId; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindParentPlatformDevicesRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.ownerId = request.ownerId;
            this.parentPlatformId = request.parentPlatformId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>361*****212-cn-qingdao</p>
         */
        public Builder parentPlatformId(String parentPlatformId) {
            this.putQueryParameter("ParentPlatformId", parentPlatformId);
            this.parentPlatformId = parentPlatformId;
            return this;
        }

        @Override
        public BatchBindParentPlatformDevicesRequest build() {
            return new BatchBindParentPlatformDevicesRequest(this);
        } 

    } 

}
