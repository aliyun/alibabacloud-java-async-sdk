// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AllocateEipAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateEipAddressResponseBody</p>
 */
public class AllocateEipAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private String allocationId;

    @com.aliyun.core.annotation.NameInMap("EipAddress")
    private String eipAddress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocateEipAddressResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.eipAddress = builder.eipAddress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipAddressResponseBody create() {
        return builder().build();
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String allocationId; 
        private String eipAddress; 
        private String requestId; 

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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateEipAddressResponseBody build() {
            return new AllocateEipAddressResponseBody(this);
        } 

    } 

}
