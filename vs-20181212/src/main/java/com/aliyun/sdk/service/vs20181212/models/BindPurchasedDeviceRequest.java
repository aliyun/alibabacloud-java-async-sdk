// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindPurchasedDeviceRequest} extends {@link RequestModel}
 *
 * <p>BindPurchasedDeviceRequest</p>
 */
public class BindPurchasedDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    private BindPurchasedDeviceRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.groupId = builder.groupId;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindPurchasedDeviceRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<BindPurchasedDeviceRequest, Builder> {
        private String deviceId; 
        private String groupId; 
        private Long ownerId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(BindPurchasedDeviceRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.groupId = response.groupId;
            this.ownerId = response.ownerId;
            this.region = response.region;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public BindPurchasedDeviceRequest build() {
            return new BindPurchasedDeviceRequest(this);
        } 

    } 

}
