// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockMfaDeviceRequest} extends {@link RequestModel}
 *
 * <p>LockMfaDeviceRequest</p>
 */
public class LockMfaDeviceRequest extends Request {
    @Query
    @NameInMap("SerialNumber")
    private String serialNumber;

    private LockMfaDeviceRequest(Builder builder) {
        super(builder);
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockMfaDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder extends Request.Builder<LockMfaDeviceRequest, Builder> {
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(LockMfaDeviceRequest request) {
            super(request);
            this.serialNumber = request.serialNumber;
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
        public LockMfaDeviceRequest build() {
            return new LockMfaDeviceRequest(this);
        } 

    } 

}
