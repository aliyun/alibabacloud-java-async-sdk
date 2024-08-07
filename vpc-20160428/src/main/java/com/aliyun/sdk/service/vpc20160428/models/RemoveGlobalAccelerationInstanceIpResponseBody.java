// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveGlobalAccelerationInstanceIpResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveGlobalAccelerationInstanceIpResponseBody</p>
 */
public class RemoveGlobalAccelerationInstanceIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveGlobalAccelerationInstanceIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveGlobalAccelerationInstanceIpResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveGlobalAccelerationInstanceIpResponseBody build() {
            return new RemoveGlobalAccelerationInstanceIpResponseBody(this);
        } 

    } 

}
