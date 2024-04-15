// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVirtualMFADeviceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteVirtualMFADeviceResponseBody</p>
 */
public class DeleteVirtualMFADeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteVirtualMFADeviceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVirtualMFADeviceResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteVirtualMFADeviceResponseBody build() {
            return new DeleteVirtualMFADeviceResponseBody(this);
        } 

    } 

}
