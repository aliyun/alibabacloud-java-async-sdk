// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDevicesRequest} extends {@link RequestModel}
 *
 * <p>AddDevicesRequest</p>
 */
public class AddDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > deviceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AddDevicesRequest(Builder builder) {
        super(builder);
        this.clientType = builder.clientType;
        this.deviceIds = builder.deviceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDevicesRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddDevicesRequest, Builder> {
        private Integer clientType; 
        private java.util.List < String > deviceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddDevicesRequest request) {
            super(request);
            this.clientType = request.clientType;
            this.deviceIds = request.deviceIds;
            this.regionId = request.regionId;
        } 

        /**
         * The type of the client.
         * <p>
         * 
         * Valid values:
         * 
         * *   1: hardware client.
         * *   2: software client.
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * The IDs of the devices. You can specify up to 200 IDs.
         */
        public Builder deviceIds(java.util.List < String > deviceIds) {
            this.putQueryParameter("DeviceIds", deviceIds);
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by WUYING Workspace.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddDevicesRequest build() {
            return new AddDevicesRequest(this);
        } 

    } 

}
