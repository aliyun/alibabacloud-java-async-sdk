// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ActivateEdgeMobileAgentRequest} extends {@link RequestModel}
 *
 * <p>ActivateEdgeMobileAgentRequest</p>
 */
public class ActivateEdgeMobileAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceClass")
    private String deviceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceMeta")
    private String deviceMeta;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseKey;

    private ActivateEdgeMobileAgentRequest(Builder builder) {
        super(builder);
        this.deviceClass = builder.deviceClass;
        this.deviceId = builder.deviceId;
        this.deviceMeta = builder.deviceMeta;
        this.licenseKey = builder.licenseKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateEdgeMobileAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceClass
     */
    public String getDeviceClass() {
        return this.deviceClass;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceMeta
     */
    public String getDeviceMeta() {
        return this.deviceMeta;
    }

    /**
     * @return licenseKey
     */
    public String getLicenseKey() {
        return this.licenseKey;
    }

    public static final class Builder extends Request.Builder<ActivateEdgeMobileAgentRequest, Builder> {
        private String deviceClass; 
        private String deviceId; 
        private String deviceMeta; 
        private String licenseKey; 

        private Builder() {
            super();
        } 

        private Builder(ActivateEdgeMobileAgentRequest request) {
            super(request);
            this.deviceClass = request.deviceClass;
            this.deviceId = request.deviceId;
            this.deviceMeta = request.deviceMeta;
            this.licenseKey = request.licenseKey;
        } 

        /**
         * DeviceClass.
         */
        public Builder deviceClass(String deviceClass) {
            this.putQueryParameter("DeviceClass", deviceClass);
            this.deviceClass = deviceClass;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sn-0001eevqa6jeapl*****</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceMeta.
         */
        public Builder deviceMeta(String deviceMeta) {
            this.putQueryParameter("DeviceMeta", deviceMeta);
            this.deviceMeta = deviceMeta;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lic-ez197xvdf0j5eo0*****</p>
         */
        public Builder licenseKey(String licenseKey) {
            this.putQueryParameter("LicenseKey", licenseKey);
            this.licenseKey = licenseKey;
            return this;
        }

        @Override
        public ActivateEdgeMobileAgentRequest build() {
            return new ActivateEdgeMobileAgentRequest(this);
        } 

    } 

}
