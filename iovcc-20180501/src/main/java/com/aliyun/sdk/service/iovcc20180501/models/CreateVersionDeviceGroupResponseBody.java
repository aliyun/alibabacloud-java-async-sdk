// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVersionDeviceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVersionDeviceGroupResponseBody</p>
 */
public class CreateVersionDeviceGroupResponseBody extends TeaModel {
    @NameInMap("DeviceGroupId")
    private String deviceGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateVersionDeviceGroupResponseBody(Builder builder) {
        this.deviceGroupId = builder.deviceGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVersionDeviceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deviceGroupId; 
        private String requestId; 

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVersionDeviceGroupResponseBody build() {
            return new CreateVersionDeviceGroupResponseBody(this);
        } 

    } 

}
