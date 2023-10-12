// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceFormResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeviceFormResponseBody</p>
 */
public class CreateDeviceFormResponseBody extends TeaModel {
    @NameInMap("DeviceFormId")
    private String deviceFormId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDeviceFormResponseBody(Builder builder) {
        this.deviceFormId = builder.deviceFormId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceFormResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceFormId
     */
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deviceFormId; 
        private String requestId; 

        /**
         * DeviceFormId.
         */
        public Builder deviceFormId(String deviceFormId) {
            this.deviceFormId = deviceFormId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDeviceFormResponseBody build() {
            return new CreateDeviceFormResponseBody(this);
        } 

    } 

}
