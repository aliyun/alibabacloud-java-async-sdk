// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClientAuthRequest} extends {@link RequestModel}
 *
 * <p>ClientAuthRequest</p>
 */
public class ClientAuthRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("DeviceInfo")
    private String deviceInfo;

    @Query
    @NameInMap("DeviceType")
    @Validation(required = true)
    private String deviceType;

    @Query
    @NameInMap("License")
    @Validation(required = true)
    private String license;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private ClientAuthRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deviceId = builder.deviceId;
        this.deviceInfo = builder.deviceInfo;
        this.deviceType = builder.deviceType;
        this.license = builder.license;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceInfo
     */
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ClientAuthRequest, Builder> {
        private String appId; 
        private String deviceId; 
        private String deviceInfo; 
        private String deviceType; 
        private String license; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ClientAuthRequest request) {
            super(request);
            this.appId = request.appId;
            this.deviceId = request.deviceId;
            this.deviceInfo = request.deviceInfo;
            this.deviceType = request.deviceType;
            this.license = request.license;
            this.tenantId = request.tenantId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
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
         * DeviceInfo.
         */
        public Builder deviceInfo(String deviceInfo) {
            this.putQueryParameter("DeviceInfo", deviceInfo);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * License.
         */
        public Builder license(String license) {
            this.putQueryParameter("License", license);
            this.license = license;
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
        public ClientAuthRequest build() {
            return new ClientAuthRequest(this);
        } 

    } 

}
