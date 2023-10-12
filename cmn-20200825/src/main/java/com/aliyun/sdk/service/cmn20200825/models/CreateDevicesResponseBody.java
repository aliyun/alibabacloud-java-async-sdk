// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDevicesResponseBody</p>
 */
public class CreateDevicesResponseBody extends TeaModel {
    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDevicesResponseBody(Builder builder) {
        this.deviceId = builder.deviceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deviceId; 
        private String requestId; 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDevicesResponseBody build() {
            return new CreateDevicesResponseBody(this);
        } 

    } 

}
