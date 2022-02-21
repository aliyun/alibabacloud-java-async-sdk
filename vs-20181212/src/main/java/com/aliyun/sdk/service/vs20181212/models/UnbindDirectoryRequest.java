// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDirectoryRequest} extends {@link RequestModel}
 *
 * <p>UnbindDirectoryRequest</p>
 */
public class UnbindDirectoryRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("DirectoryId")
    @Validation(required = true)
    private String directoryId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UnbindDirectoryRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.directoryId = builder.directoryId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindDirectoryRequest create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<UnbindDirectoryRequest, Builder> {
        private String deviceId; 
        private String directoryId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindDirectoryRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.directoryId = response.directoryId;
            this.ownerId = response.ownerId;
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
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
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

        @Override
        public UnbindDirectoryRequest build() {
            return new UnbindDirectoryRequest(this);
        } 

    } 

}
