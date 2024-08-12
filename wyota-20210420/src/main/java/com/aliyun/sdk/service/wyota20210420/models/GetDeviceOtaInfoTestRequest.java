// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceOtaInfoTestRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceOtaInfoTestRequest</p>
 */
public class GetDeviceOtaInfoTestRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    @com.aliyun.core.annotation.Validation(required = true)
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private GetDeviceOtaInfoTestRequest(Builder builder) {
        super(builder);
        this.baseVersion = builder.baseVersion;
        this.deviceId = builder.deviceId;
        this.model = builder.model;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOtaInfoTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseVersion
     */
    public String getBaseVersion() {
        return this.baseVersion;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetDeviceOtaInfoTestRequest, Builder> {
        private String baseVersion; 
        private String deviceId; 
        private String model; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceOtaInfoTestRequest request) {
            super(request);
            this.baseVersion = request.baseVersion;
            this.deviceId = request.deviceId;
            this.model = request.model;
            this.tenantId = request.tenantId;
        } 

        /**
         * BaseVersion.
         */
        public Builder baseVersion(String baseVersion) {
            this.putBodyParameter("BaseVersion", baseVersion);
            this.baseVersion = baseVersion;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetDeviceOtaInfoTestRequest build() {
            return new GetDeviceOtaInfoTestRequest(this);
        } 

    } 

}
