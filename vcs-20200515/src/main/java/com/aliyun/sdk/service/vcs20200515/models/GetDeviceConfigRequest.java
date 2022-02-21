// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceConfigRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceConfigRequest</p>
 */
public class GetDeviceConfigRequest extends Request {
    @Body
    @NameInMap("DeviceSn")
    private String deviceSn;

    @Body
    @NameInMap("DeviceTimeStamp")
    private String deviceTimeStamp;

    private GetDeviceConfigRequest(Builder builder) {
        super(builder);
        this.deviceSn = builder.deviceSn;
        this.deviceTimeStamp = builder.deviceTimeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceSn
     */
    public String getDeviceSn() {
        return this.deviceSn;
    }

    /**
     * @return deviceTimeStamp
     */
    public String getDeviceTimeStamp() {
        return this.deviceTimeStamp;
    }

    public static final class Builder extends Request.Builder<GetDeviceConfigRequest, Builder> {
        private String deviceSn; 
        private String deviceTimeStamp; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceConfigRequest response) {
            super(response);
            this.deviceSn = response.deviceSn;
            this.deviceTimeStamp = response.deviceTimeStamp;
        } 

        /**
         * DeviceSn.
         */
        public Builder deviceSn(String deviceSn) {
            this.putBodyParameter("DeviceSn", deviceSn);
            this.deviceSn = deviceSn;
            return this;
        }

        /**
         * DeviceTimeStamp.
         */
        public Builder deviceTimeStamp(String deviceTimeStamp) {
            this.putBodyParameter("DeviceTimeStamp", deviceTimeStamp);
            this.deviceTimeStamp = deviceTimeStamp;
            return this;
        }

        @Override
        public GetDeviceConfigRequest build() {
            return new GetDeviceConfigRequest(this);
        } 

    } 

}
