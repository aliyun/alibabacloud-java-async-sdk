// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveMfaDeviceRequest} extends {@link RequestModel}
 *
 * <p>RemoveMfaDeviceRequest</p>
 */
public class RemoveMfaDeviceRequest extends Request {
    @Query
    @NameInMap("SerialNumber")
    @Validation(required = true)
    private String serialNumber;

    private RemoveMfaDeviceRequest(Builder builder) {
        super(builder);
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveMfaDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveMfaDeviceRequest, Builder> {
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(RemoveMfaDeviceRequest request) {
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
        public RemoveMfaDeviceRequest build() {
            return new RemoveMfaDeviceRequest(this);
        } 

    } 

}
