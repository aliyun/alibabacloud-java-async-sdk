// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateNodePrivateNetworkAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateNodePrivateNetworkAddressResponseBody</p>
 */
public class AllocateNodePrivateNetworkAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocateNodePrivateNetworkAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateNodePrivateNetworkAddressResponseBody create() {
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

        public AllocateNodePrivateNetworkAddressResponseBody build() {
            return new AllocateNodePrivateNetworkAddressResponseBody(this);
        } 

    } 

}
