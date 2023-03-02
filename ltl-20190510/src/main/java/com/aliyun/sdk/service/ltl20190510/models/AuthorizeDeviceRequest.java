// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeDeviceRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeDeviceRequest</p>
 */
public class AuthorizeDeviceRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    private String deviceGroupId;

    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    private AuthorizeDeviceRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.deviceGroupId = builder.deviceGroupId;
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    public static final class Builder extends Request.Builder<AuthorizeDeviceRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String deviceGroupId; 
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeDeviceRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.deviceGroupId = request.deviceGroupId;
            this.deviceId = request.deviceId;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
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

        @Override
        public AuthorizeDeviceRequest build() {
            return new AuthorizeDeviceRequest(this);
        } 

    } 

}
