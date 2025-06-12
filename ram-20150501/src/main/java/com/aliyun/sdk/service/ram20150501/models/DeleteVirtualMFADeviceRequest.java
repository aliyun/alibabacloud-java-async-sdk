// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link DeleteVirtualMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteVirtualMFADeviceRequest</p>
 */
public class DeleteVirtualMFADeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
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
         * <p>The serial number of the MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:mfa/device002</p>
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
