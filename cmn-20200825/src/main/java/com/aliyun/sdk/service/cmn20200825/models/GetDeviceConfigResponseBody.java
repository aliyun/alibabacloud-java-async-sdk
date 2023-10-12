// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceConfigResponseBody</p>
 */
public class GetDeviceConfigResponseBody extends TeaModel {
    @NameInMap("DeviceConfig")
    private String deviceConfig;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceConfigResponseBody(Builder builder) {
        this.deviceConfig = builder.deviceConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceConfig
     */
    public String getDeviceConfig() {
        return this.deviceConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deviceConfig; 
        private String requestId; 

        /**
         * 设备配置内容
         */
        public Builder deviceConfig(String deviceConfig) {
            this.deviceConfig = deviceConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceConfigResponseBody build() {
            return new GetDeviceConfigResponseBody(this);
        } 

    } 

}
