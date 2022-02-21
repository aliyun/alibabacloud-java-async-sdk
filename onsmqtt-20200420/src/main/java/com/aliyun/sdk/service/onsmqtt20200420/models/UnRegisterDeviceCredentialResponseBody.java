// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnRegisterDeviceCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>UnRegisterDeviceCredentialResponseBody</p>
 */
public class UnRegisterDeviceCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UnRegisterDeviceCredentialResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnRegisterDeviceCredentialResponseBody create() {
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

        public UnRegisterDeviceCredentialResponseBody build() {
            return new UnRegisterDeviceCredentialResponseBody(this);
        } 

    } 

}
