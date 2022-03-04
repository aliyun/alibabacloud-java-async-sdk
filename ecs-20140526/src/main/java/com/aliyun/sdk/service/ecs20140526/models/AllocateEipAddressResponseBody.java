// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateEipAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateEipAddressResponseBody</p>
 */
public class AllocateEipAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("AllocationId")
    private String allocationId;

    @NameInMap("EipAddress")
    private String eipAddress;

    private AllocateEipAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.allocationId = builder.allocationId;
        this.eipAddress = builder.eipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return eipAddress
     */
    public String getEipAddress() {
        return this.eipAddress;
    }

    public static final class Builder {
        private String requestId; 
        private String allocationId; 
        private String eipAddress; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * AllocationId.
         */
        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * EipAddress.
         */
        public Builder eipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }

        public AllocateEipAddressResponseBody build() {
            return new AllocateEipAddressResponseBody(this);
        } 

    } 

}
