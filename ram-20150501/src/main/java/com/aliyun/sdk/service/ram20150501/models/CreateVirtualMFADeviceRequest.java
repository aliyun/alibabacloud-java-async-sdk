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
 * {@link CreateVirtualMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualMFADeviceRequest</p>
 */
public class CreateVirtualMFADeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualMFADeviceName")
    private String virtualMFADeviceName;

    private CreateVirtualMFADeviceRequest(Builder builder) {
        super(builder);
        this.virtualMFADeviceName = builder.virtualMFADeviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualMFADeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return virtualMFADeviceName
     */
    public String getVirtualMFADeviceName() {
        return this.virtualMFADeviceName;
    }

    public static final class Builder extends Request.Builder<CreateVirtualMFADeviceRequest, Builder> {
        private String virtualMFADeviceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirtualMFADeviceRequest request) {
            super(request);
            this.virtualMFADeviceName = request.virtualMFADeviceName;
        } 

        /**
         * <p>The name of the MFA device.</p>
         * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>device001</p>
         */
        public Builder virtualMFADeviceName(String virtualMFADeviceName) {
            this.putQueryParameter("VirtualMFADeviceName", virtualMFADeviceName);
            this.virtualMFADeviceName = virtualMFADeviceName;
            return this;
        }

        @Override
        public CreateVirtualMFADeviceRequest build() {
            return new CreateVirtualMFADeviceRequest(this);
        } 

    } 

}
