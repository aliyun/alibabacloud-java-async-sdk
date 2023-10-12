// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevicePropertyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDevicePropertyResponseBody</p>
 */
public class CreateDevicePropertyResponseBody extends TeaModel {
    @NameInMap("DevicePropertyId")
    private String devicePropertyId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDevicePropertyResponseBody(Builder builder) {
        this.devicePropertyId = builder.devicePropertyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevicePropertyResponseBody create() {
        return builder().build();
    }

    /**
     * @return devicePropertyId
     */
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String devicePropertyId; 
        private String requestId; 

        /**
         * DevicePropertyId.
         */
        public Builder devicePropertyId(String devicePropertyId) {
            this.devicePropertyId = devicePropertyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDevicePropertyResponseBody build() {
            return new CreateDevicePropertyResponseBody(this);
        } 

    } 

}
