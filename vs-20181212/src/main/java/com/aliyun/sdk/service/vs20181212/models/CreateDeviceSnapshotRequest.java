// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceSnapshotRequest</p>
 */
public class CreateDeviceSnapshotRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SnapshotConfig")
    @Validation(required = true)
    private String snapshotConfig;

    @Query
    @NameInMap("StreamId")
    private String streamId;

    private CreateDeviceSnapshotRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.mode = builder.mode;
        this.ownerId = builder.ownerId;
        this.snapshotConfig = builder.snapshotConfig;
        this.streamId = builder.streamId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceSnapshotRequest create() {
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
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return snapshotConfig
     */
    public String getSnapshotConfig() {
        return this.snapshotConfig;
    }

    /**
     * @return streamId
     */
    public String getStreamId() {
        return this.streamId;
    }

    public static final class Builder extends Request.Builder<CreateDeviceSnapshotRequest, Builder> {
        private String deviceId; 
        private String mode; 
        private Long ownerId; 
        private String snapshotConfig; 
        private String streamId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceSnapshotRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.mode = response.mode;
            this.ownerId = response.ownerId;
            this.snapshotConfig = response.snapshotConfig;
            this.streamId = response.streamId;
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
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * SnapshotConfig.
         */
        public Builder snapshotConfig(String snapshotConfig) {
            this.putQueryParameter("SnapshotConfig", snapshotConfig);
            this.snapshotConfig = snapshotConfig;
            return this;
        }

        /**
         * StreamId.
         */
        public Builder streamId(String streamId) {
            this.putQueryParameter("StreamId", streamId);
            this.streamId = streamId;
            return this;
        }

        @Override
        public CreateDeviceSnapshotRequest build() {
            return new CreateDeviceSnapshotRequest(this);
        } 

    } 

}
