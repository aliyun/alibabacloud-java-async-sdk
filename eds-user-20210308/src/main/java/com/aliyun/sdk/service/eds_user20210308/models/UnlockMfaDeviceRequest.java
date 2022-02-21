// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockMfaDeviceRequest} extends {@link RequestModel}
 *
 * <p>UnlockMfaDeviceRequest</p>
 */
public class UnlockMfaDeviceRequest extends Request {
    @Query
    @NameInMap("SerialNumber")
    private String serialNumber;

    private UnlockMfaDeviceRequest(Builder builder) {
        super(builder);
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnlockMfaDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<UnlockMfaDeviceRequest, Builder> {
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(UnlockMfaDeviceRequest response) {
            super(response);
            this.serialNumber = response.serialNumber;
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
        public UnlockMfaDeviceRequest build() {
            return new UnlockMfaDeviceRequest(this);
        } 

    } 

}
