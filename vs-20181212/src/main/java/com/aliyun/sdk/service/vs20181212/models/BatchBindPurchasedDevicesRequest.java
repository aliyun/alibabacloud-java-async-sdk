// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindPurchasedDevicesRequest} extends {@link RequestModel}
 *
 * <p>BatchBindPurchasedDevicesRequest</p>
 */
public class BatchBindPurchasedDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private BatchBindPurchasedDevicesRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.groupId = builder.groupId;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindPurchasedDevicesRequest create() {
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

    public static final class Builder extends Request.Builder<BatchBindPurchasedDevicesRequest, Builder> {
        private String deviceId; 
        private String groupId; 
        private Long ownerId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindPurchasedDevicesRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.groupId = request.groupId;
            this.ownerId = request.ownerId;
            this.region = request.region;
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
        public BatchBindPurchasedDevicesRequest build() {
            return new BatchBindPurchasedDevicesRequest(this);
        } 

    } 

}
