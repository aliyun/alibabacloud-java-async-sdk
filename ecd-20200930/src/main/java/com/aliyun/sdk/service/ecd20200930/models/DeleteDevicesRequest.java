// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevicesRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevicesRequest</p>
 */
public class DeleteDevicesRequest extends Request {
    @Query
    @NameInMap("ClientType")
    @Validation(required = true)
    private Integer clientType;

    @Query
    @NameInMap("DeviceIds")
    @Validation(required = true)
    private java.util.List < String > deviceIds;

    @Query
    @NameInMap("Force")
    @Validation(required = true)
    private Integer force;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteDevicesRequest(Builder builder) {
        super(builder);
        this.clientType = builder.clientType;
        this.deviceIds = builder.deviceIds;
        this.force = builder.force;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return deviceIds
     */
    public java.util.List < String > getDeviceIds() {
        return this.deviceIds;
    }

    /**
     * @return force
     */
    public Integer getForce() {
        return this.force;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDevicesRequest, Builder> {
        private Integer clientType; 
        private java.util.List < String > deviceIds; 
        private Integer force; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevicesRequest request) {
            super(request);
            this.clientType = request.clientType;
            this.deviceIds = request.deviceIds;
            this.force = request.force;
            this.regionId = request.regionId;
        } 

        /**
         * The type of the device.
         * <p>
         * 
         * *   1: the hardware client device
         * *   2: the software client device
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * The list of universally unique identifiers (UUIDs) of devices.
         */
        public Builder deviceIds(java.util.List < String > deviceIds) {
            this.putQueryParameter("DeviceIds", deviceIds);
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * Specifies whether to forcefully delete the device.
         * <p>
         * 
         * *   1: forcefully deletes the device.
         * *   0: does not forcefully delete the device. (You cannot delete a device to which a user is bound.)
         */
        public Builder force(Integer force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteDevicesRequest build() {
            return new DeleteDevicesRequest(this);
        } 

    } 

}
