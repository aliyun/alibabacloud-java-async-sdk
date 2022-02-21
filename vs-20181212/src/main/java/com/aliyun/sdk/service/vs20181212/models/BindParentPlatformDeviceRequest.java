// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindParentPlatformDeviceRequest} extends {@link RequestModel}
 *
 * <p>BindParentPlatformDeviceRequest</p>
 */
public class BindParentPlatformDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ParentPlatformId")
    @Validation(required = true)
    private String parentPlatformId;

    private BindParentPlatformDeviceRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.ownerId = builder.ownerId;
        this.parentPlatformId = builder.parentPlatformId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindParentPlatformDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<BindParentPlatformDeviceRequest, Builder> {
        private String deviceId; 
        private Long ownerId; 
        private String parentPlatformId; 

        private Builder() {
            super();
        } 

        private Builder(BindParentPlatformDeviceRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.ownerId = response.ownerId;
            this.parentPlatformId = response.parentPlatformId;
        } 

        /**
         * DeviceId.
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
         * ParentPlatformId.
         */
        public Builder parentPlatformId(String parentPlatformId) {
            this.putQueryParameter("ParentPlatformId", parentPlatformId);
            this.parentPlatformId = parentPlatformId;
            return this;
        }

        @Override
        public BindParentPlatformDeviceRequest build() {
            return new BindParentPlatformDeviceRequest(this);
        } 

    } 

}
