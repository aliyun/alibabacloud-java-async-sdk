// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeviceChannelsRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceChannelsRequest</p>
 */
public class ModifyDeviceChannelsRequest extends Request {
    @Query
    @NameInMap("Channels")
    @Validation(required = true)
    private String channels;

    @Query
    @NameInMap("DeviceStatus")
    private String deviceStatus;

    @Query
    @NameInMap("Dsn")
    private String dsn;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private ModifyDeviceChannelsRequest(Builder builder) {
        super(builder);
        this.channels = builder.channels;
        this.deviceStatus = builder.deviceStatus;
        this.dsn = builder.dsn;
        this.id = builder.id;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeviceChannelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channels
     */
    public String getChannels() {
        return this.channels;
    }

    /**
     * @return deviceStatus
     */
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * @return dsn
     */
    public String getDsn() {
        return this.dsn;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ModifyDeviceChannelsRequest, Builder> {
        private String channels; 
        private String deviceStatus; 
        private String dsn; 
        private String id; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDeviceChannelsRequest response) {
            super(response);
            this.channels = response.channels;
            this.deviceStatus = response.deviceStatus;
            this.dsn = response.dsn;
            this.id = response.id;
            this.ownerId = response.ownerId;
        } 

        /**
         * Channels.
         */
        public Builder channels(String channels) {
            this.putQueryParameter("Channels", channels);
            this.channels = channels;
            return this;
        }

        /**
         * DeviceStatus.
         */
        public Builder deviceStatus(String deviceStatus) {
            this.putQueryParameter("DeviceStatus", deviceStatus);
            this.deviceStatus = deviceStatus;
            return this;
        }

        /**
         * Dsn.
         */
        public Builder dsn(String dsn) {
            this.putQueryParameter("Dsn", dsn);
            this.dsn = dsn;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public ModifyDeviceChannelsRequest build() {
            return new ModifyDeviceChannelsRequest(this);
        } 

    } 

}
