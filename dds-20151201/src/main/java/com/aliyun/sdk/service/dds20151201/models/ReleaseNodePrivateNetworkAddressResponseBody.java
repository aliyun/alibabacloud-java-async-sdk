// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleaseNodePrivateNetworkAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseNodePrivateNetworkAddressResponseBody</p>
 */
public class ReleaseNodePrivateNetworkAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReleaseNodePrivateNetworkAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseNodePrivateNetworkAddressResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0FDDC511-7252-4A4A-ADDA-5CB1BF63873D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReleaseNodePrivateNetworkAddressResponseBody build() {
            return new ReleaseNodePrivateNetworkAddressResponseBody(this);
        } 

    } 

}
