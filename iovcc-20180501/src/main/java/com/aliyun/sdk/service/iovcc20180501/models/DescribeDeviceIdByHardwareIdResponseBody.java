// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceIdByHardwareIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceIdByHardwareIdResponseBody</p>
 */
public class DescribeDeviceIdByHardwareIdResponseBody extends TeaModel {
    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeviceIdByHardwareIdResponseBody(Builder builder) {
        this.deviceId = builder.deviceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceIdByHardwareIdResponseBody create() {
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

        public DescribeDeviceIdByHardwareIdResponseBody build() {
            return new DescribeDeviceIdByHardwareIdResponseBody(this);
        } 

    } 

}
