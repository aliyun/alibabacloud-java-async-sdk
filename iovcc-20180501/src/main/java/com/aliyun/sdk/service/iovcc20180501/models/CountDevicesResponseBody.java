// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>CountDevicesResponseBody</p>
 */
public class CountDevicesResponseBody extends TeaModel {
    @NameInMap("DeviceCount")
    private Integer deviceCount;

    @NameInMap("RequestId")
    private String requestId;

    private CountDevicesResponseBody(Builder builder) {
        this.deviceCount = builder.deviceCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceCount
     */
    public Integer getDeviceCount() {
        return this.deviceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer deviceCount; 
        private String requestId; 

        /**
         * DeviceCount.
         */
        public Builder deviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CountDevicesResponseBody build() {
            return new CountDevicesResponseBody(this);
        } 

    } 

}
