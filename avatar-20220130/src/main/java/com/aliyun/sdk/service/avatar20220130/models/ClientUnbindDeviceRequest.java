// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClientUnbindDeviceRequest} extends {@link RequestModel}
 *
 * <p>ClientUnbindDeviceRequest</p>
 */
public class ClientUnbindDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("TenantId")
    private Long tenantId;

    private ClientUnbindDeviceRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientUnbindDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ClientUnbindDeviceRequest, Builder> {
        private String deviceId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ClientUnbindDeviceRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ClientUnbindDeviceRequest build() {
            return new ClientUnbindDeviceRequest(this);
        } 

    } 

}
