// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The serial number of the virtual MFA device, which is a unique identifier.
         * <p>
         * 
         * You can call the [DescribeVirtualMFADevices](~~206210~~) operation to query the serial number of the virtual MFA device bound to AD users.
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
