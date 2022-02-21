// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceCaptureStrategyRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceCaptureStrategyRequest</p>
 */
public class GetDeviceCaptureStrategyRequest extends Request {
    @Body
    @NameInMap("DeviceCode")
    @Validation(required = true)
    private String deviceCode;

    @Body
    @NameInMap("DeviceType")
    private String deviceType;

    private GetDeviceCaptureStrategyRequest(Builder builder) {
        super(builder);
        this.deviceCode = builder.deviceCode;
        this.deviceType = builder.deviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceCaptureStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceCode
     */
    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    public static final class Builder extends Request.Builder<GetDeviceCaptureStrategyRequest, Builder> {
        private String deviceCode; 
        private String deviceType; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceCaptureStrategyRequest response) {
            super(response);
            this.deviceCode = response.deviceCode;
            this.deviceType = response.deviceType;
        } 

        /**
         * 设备通道号
         */
        public Builder deviceCode(String deviceCode) {
            this.putBodyParameter("DeviceCode", deviceCode);
            this.deviceCode = deviceCode;
            return this;
        }

        /**
         * 设备类型
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        @Override
        public GetDeviceCaptureStrategyRequest build() {
            return new GetDeviceCaptureStrategyRequest(this);
        } 

    } 

}
