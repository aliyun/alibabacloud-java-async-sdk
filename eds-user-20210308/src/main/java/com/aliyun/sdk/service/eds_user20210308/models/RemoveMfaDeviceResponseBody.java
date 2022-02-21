// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveMfaDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveMfaDeviceResponseBody</p>
 */
public class RemoveMfaDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveMfaDeviceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveMfaDeviceResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveMfaDeviceResponseBody build() {
            return new RemoveMfaDeviceResponseBody(this);
        } 

    } 

}
