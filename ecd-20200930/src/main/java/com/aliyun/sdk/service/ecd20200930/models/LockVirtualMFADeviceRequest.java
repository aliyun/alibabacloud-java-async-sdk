// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockVirtualMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>LockVirtualMFADeviceRequest</p>
 */
public class LockVirtualMFADeviceRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SerialNumber")
    @Validation(required = true)
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

        private Builder(LockVirtualMFADeviceRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.serialNumber = response.serialNumber;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SerialNumber.
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
