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
 * {@link ModifyDeviceChannelsRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceChannelsRequest</p>
 */
public class ModifyDeviceChannelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channels")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceStatus")
    private String deviceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dsn")
    private String dsn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
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

        private Builder(ModifyDeviceChannelsRequest request) {
            super(request);
            this.channels = request.channels;
            this.deviceStatus = request.deviceStatus;
            this.dsn = request.dsn;
            this.id = request.id;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>An array of channels in a JSON-formatted string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ChannelId&quot;:12333,&quot;Name&quot;:&quot;测试&quot;,&quot;DeviceStatus&quot;:&quot;on&quot;}]</p>
         */
        public Builder channels(String channels) {
            this.putQueryParameter("Channels", channels);
            this.channels = channels;
            return this;
        }

        /**
         * <p>The status of the device. Valid values:</p>
         * <ul>
         * <li><p>on: online</p>
         * </li>
         * <li><p>off: offline</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder deviceStatus(String deviceStatus) {
            this.putQueryParameter("DeviceStatus", deviceStatus);
            this.deviceStatus = deviceStatus;
            return this;
        }

        /**
         * <p>The device serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>210235C3GN32090008286cf17e130d</p>
         */
        public Builder dsn(String dsn) {
            this.putQueryParameter("Dsn", dsn);
            this.dsn = dsn;
            return this;
        }

        /**
         * <p>The device ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
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
