// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RemovePolarClawDevicePairRequest} extends {@link RequestModel}
 *
 * <p>RemovePolarClawDevicePairRequest</p>
 */
public class RemovePolarClawDevicePairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    private RemovePolarClawDevicePairRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePolarClawDevicePairRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    public static final class Builder extends Request.Builder<RemovePolarClawDevicePairRequest, Builder> {
        private String applicationId; 
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(RemovePolarClawDevicePairRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.deviceId = request.deviceId;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The ID of the paired device to be removed. The physical device must first initiate pairing through the PolarClaw mobile app and be approved by calling ApprovePolarClawDevicePair. After approval, the device is added to the paired device list returned by ListPolarClawDevicePairs, from which you can obtain the DeviceId. Pairing initiation cannot be completed solely through API calls.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device-mac-789</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public RemovePolarClawDevicePairRequest build() {
            return new RemovePolarClawDevicePairRequest(this);
        } 

    } 

}
