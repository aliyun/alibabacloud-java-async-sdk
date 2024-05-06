// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCanAllocateVpcPrivateIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCanAllocateVpcPrivateIpAddressResponseBody</p>
 */
public class CheckCanAllocateVpcPrivateIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanAllocate")
    private Boolean canAllocate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckCanAllocateVpcPrivateIpAddressResponseBody(Builder builder) {
        this.canAllocate = builder.canAllocate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCanAllocateVpcPrivateIpAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return canAllocate
     */
    public Boolean getCanAllocate() {
        return this.canAllocate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean canAllocate; 
        private String requestId; 

        /**
         * Indicates whether the private IP address is available. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder canAllocate(Boolean canAllocate) {
            this.canAllocate = canAllocate;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCanAllocateVpcPrivateIpAddressResponseBody build() {
            return new CheckCanAllocateVpcPrivateIpAddressResponseBody(this);
        } 

    } 

}
