// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link DescribeEapDeviceResourceAllocationRequest} extends {@link RequestModel}
 *
 * <p>DescribeEapDeviceResourceAllocationRequest</p>
 */
public class DescribeEapDeviceResourceAllocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceCount")
    private Integer deviceCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeEapDeviceResourceAllocationRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.deviceCount = builder.deviceCount;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEapDeviceResourceAllocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return deviceCount
     */
    public Integer getDeviceCount() {
        return this.deviceCount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeEapDeviceResourceAllocationRequest, Builder> {
        private String DBClusterId; 
        private Integer deviceCount; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEapDeviceResourceAllocationRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.deviceCount = request.deviceCount;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DeviceCount.
         */
        public Builder deviceCount(Integer deviceCount) {
            this.putQueryParameter("DeviceCount", deviceCount);
            this.deviceCount = deviceCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeEapDeviceResourceAllocationRequest build() {
            return new DescribeEapDeviceResourceAllocationRequest(this);
        } 

    } 

}
