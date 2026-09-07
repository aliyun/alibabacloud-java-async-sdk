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
 * {@link LockVirtualMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>LockVirtualMFADeviceRequest</p>
 */
public class LockVirtualMFADeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNumber;

    private LockVirtualMFADeviceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockVirtualMFADeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder extends Request.Builder<LockVirtualMFADeviceRequest, Builder> {
        private String regionId; 
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(LockVirtualMFADeviceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.serialNumber = request.serialNumber;
        } 

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The serial number of the virtual MFA device, which is also its unique identifier. You can call <a href="~~DescribeVirtualMFADevices~~">DescribeVirtualMFADevices</a> to query the serial number of the virtual MFA device bound to an AD account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a25f297f-f2e1-4a44-bbf1-5f48a6e5****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        @Override
        public LockVirtualMFADeviceRequest build() {
            return new LockVirtualMFADeviceRequest(this);
        } 

    } 

}
