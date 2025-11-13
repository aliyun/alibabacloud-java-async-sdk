// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ActiveAiRtcLicenseRequest} extends {@link RequestModel}
 *
 * <p>ActiveAiRtcLicenseRequest</p>
 */
public class ActiveAiRtcLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseItemId")
    private String licenseItemId;

    private ActiveAiRtcLicenseRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.deviceId = builder.deviceId;
        this.licenseItemId = builder.licenseItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveAiRtcLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return licenseItemId
     */
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    public static final class Builder extends Request.Builder<ActiveAiRtcLicenseRequest, Builder> {
        private String authCode; 
        private String deviceId; 
        private String licenseItemId; 

        private Builder() {
            super();
        } 

        private Builder(ActiveAiRtcLicenseRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.deviceId = request.deviceId;
            this.licenseItemId = request.licenseItemId;
        } 

        /**
         * AuthCode.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
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
         * LicenseItemId.
         */
        public Builder licenseItemId(String licenseItemId) {
            this.putQueryParameter("LicenseItemId", licenseItemId);
            this.licenseItemId = licenseItemId;
            return this;
        }

        @Override
        public ActiveAiRtcLicenseRequest build() {
            return new ActiveAiRtcLicenseRequest(this);
        } 

    } 

}
