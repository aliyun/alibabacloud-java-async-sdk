// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRenderingDeviceSpecResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRenderingDeviceSpecResponseBody</p>
 */
public class UpdateRenderingDeviceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateRenderingDeviceSpecResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRenderingDeviceSpecResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateRenderingDeviceSpecResponseBody build() {
            return new UpdateRenderingDeviceSpecResponseBody(this);
        } 

    } 

}
