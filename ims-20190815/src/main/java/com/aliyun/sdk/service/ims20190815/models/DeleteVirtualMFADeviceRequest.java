// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVirtualMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteVirtualMFADeviceRequest</p>
 */
public class DeleteVirtualMFADeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNumber;

    private DeleteVirtualMFADeviceRequest(Builder builder) {
        super(builder);
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVirtualMFADeviceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteVirtualMFADeviceRequest, Builder> {
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVirtualMFADeviceRequest request) {
            super(request);
            this.serialNumber = request.serialNumber;
        } 

        /**
         * The serial number of the MFA device.
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        @Override
        public DeleteVirtualMFADeviceRequest build() {
            return new DeleteVirtualMFADeviceRequest(this);
        } 

    } 

}
