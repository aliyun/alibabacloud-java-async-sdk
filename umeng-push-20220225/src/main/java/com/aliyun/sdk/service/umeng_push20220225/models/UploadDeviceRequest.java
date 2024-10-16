// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadDeviceRequest} extends {@link RequestModel}
 *
 * <p>UploadDeviceRequest</p>
 */
public class UploadDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceTokens")
    private String deviceTokens;

    private UploadDeviceRequest(Builder builder) {
        super(builder);
        this.deviceTokens = builder.deviceTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceTokens
     */
    public String getDeviceTokens() {
        return this.deviceTokens;
    }

    public static final class Builder extends Request.Builder<UploadDeviceRequest, Builder> {
        private String deviceTokens; 

        private Builder() {
            super();
        } 

        private Builder(UploadDeviceRequest request) {
            super(request);
            this.deviceTokens = request.deviceTokens;
        } 

        /**
         * DeviceTokens.
         */
        public Builder deviceTokens(String deviceTokens) {
            this.putBodyParameter("DeviceTokens", deviceTokens);
            this.deviceTokens = deviceTokens;
            return this;
        }

        @Override
        public UploadDeviceRequest build() {
            return new UploadDeviceRequest(this);
        } 

    } 

}
