// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualMFADeviceRequest</p>
 */
public class CreateVirtualMFADeviceRequest extends Request {
    @Query
    @NameInMap("VirtualMFADeviceName")
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

        private Builder(CreateVirtualMFADeviceRequest response) {
            super(response);
            this.virtualMFADeviceName = response.virtualMFADeviceName;
        } 

        /**
         * VirtualMFADeviceName.
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
