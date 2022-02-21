// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeviceCaptureStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceCaptureStrategyRequest</p>
 */
public class UpdateDeviceCaptureStrategyRequest extends Request {
    @Body
    @NameInMap("DeviceCode")
    @Validation(required = true)
    private String deviceCode;

    @Body
    @NameInMap("DeviceType")
    private String deviceType;

    @Body
    @NameInMap("MondayCaptureStrategy")
    @Validation(required = true)
    private String mondayCaptureStrategy;

    private UpdateDeviceCaptureStrategyRequest(Builder builder) {
        super(builder);
        this.deviceCode = builder.deviceCode;
        this.deviceType = builder.deviceType;
        this.mondayCaptureStrategy = builder.mondayCaptureStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceCaptureStrategyRequest create() {
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

    /**
     * @return mondayCaptureStrategy
     */
    public String getMondayCaptureStrategy() {
        return this.mondayCaptureStrategy;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceCaptureStrategyRequest, Builder> {
        private String deviceCode; 
        private String deviceType; 
        private String mondayCaptureStrategy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceCaptureStrategyRequest response) {
            super(response);
            this.deviceCode = response.deviceCode;
            this.deviceType = response.deviceType;
            this.mondayCaptureStrategy = response.mondayCaptureStrategy;
        } 

        /**
         * 设备通道
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

        /**
         * 周一图片抓去模式
         */
        public Builder mondayCaptureStrategy(String mondayCaptureStrategy) {
            this.putBodyParameter("MondayCaptureStrategy", mondayCaptureStrategy);
            this.mondayCaptureStrategy = mondayCaptureStrategy;
            return this;
        }

        @Override
        public UpdateDeviceCaptureStrategyRequest build() {
            return new UpdateDeviceCaptureStrategyRequest(this);
        } 

    } 

}
