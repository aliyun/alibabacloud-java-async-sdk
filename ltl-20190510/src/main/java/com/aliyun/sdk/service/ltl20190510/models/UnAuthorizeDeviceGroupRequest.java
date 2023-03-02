// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnAuthorizeDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>UnAuthorizeDeviceGroupRequest</p>
 */
public class UnAuthorizeDeviceGroupRequest extends Request {
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

    private UnAuthorizeDeviceGroupRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.deviceGroupId = builder.deviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnAuthorizeDeviceGroupRequest create() {
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

    public static final class Builder extends Request.Builder<UnAuthorizeDeviceGroupRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String deviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UnAuthorizeDeviceGroupRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.deviceGroupId = request.deviceGroupId;
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

        @Override
        public UnAuthorizeDeviceGroupRequest build() {
            return new UnAuthorizeDeviceGroupRequest(this);
        } 

    } 

}
