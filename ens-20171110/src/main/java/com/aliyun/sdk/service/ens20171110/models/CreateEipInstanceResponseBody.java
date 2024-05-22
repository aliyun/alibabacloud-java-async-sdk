// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEipInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEipInstanceResponseBody</p>
 */
public class CreateEipInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private String allocationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEipInstanceResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEipInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String allocationId; 
        private String requestId; 

        /**
         * The ID of the EIP.
         */
        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEipInstanceResponseBody build() {
            return new CreateEipInstanceResponseBody(this);
        } 

    } 

}
