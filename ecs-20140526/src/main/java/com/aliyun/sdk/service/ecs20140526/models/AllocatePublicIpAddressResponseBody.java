// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocatePublicIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocatePublicIpAddressResponseBody</p>
 */
public class AllocatePublicIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocatePublicIpAddressResponseBody(Builder builder) {
        this.ipAddress = builder.ipAddress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocatePublicIpAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipAddress; 
        private String requestId; 

        /**
         * The public IP address.
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocatePublicIpAddressResponseBody build() {
            return new AllocatePublicIpAddressResponseBody(this);
        } 

    } 

}
