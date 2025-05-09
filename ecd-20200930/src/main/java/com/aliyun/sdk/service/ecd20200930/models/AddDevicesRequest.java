// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    private java.util.List<String> deviceIds;

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
    public java.util.List<String> getDeviceIds() {
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
        private java.util.List<String> deviceIds; 
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
         * <p>The type of the client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: hardware client.</li>
         * <li>2: software client.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The IDs of the devices. You can specify up to 200 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder deviceIds(java.util.List<String> deviceIds) {
            this.putQueryParameter("DeviceIds", deviceIds);
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
