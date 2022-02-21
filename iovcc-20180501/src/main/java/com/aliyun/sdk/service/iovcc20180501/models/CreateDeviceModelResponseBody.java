// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceModelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeviceModelResponseBody</p>
 */
public class CreateDeviceModelResponseBody extends TeaModel {
    @NameInMap("DeviceModelId")
    private Long deviceModelId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDeviceModelResponseBody(Builder builder) {
        this.deviceModelId = builder.deviceModelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceModelId
     */
    public Long getDeviceModelId() {
        return this.deviceModelId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long deviceModelId; 
        private String requestId; 

        /**
         * DeviceModelId.
         */
        public Builder deviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDeviceModelResponseBody build() {
            return new CreateDeviceModelResponseBody(this);
        } 

    } 

}
