// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyGlobalAccelerationInstanceSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyGlobalAccelerationInstanceSpecResponseBody</p>
 */
public class ModifyGlobalAccelerationInstanceSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyGlobalAccelerationInstanceSpecResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalAccelerationInstanceSpecResponseBody create() {
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
         * <p>BD5BCEE8-F62C-40C2-9AC3-89XXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyGlobalAccelerationInstanceSpecResponseBody build() {
            return new ModifyGlobalAccelerationInstanceSpecResponseBody(this);
        } 

    } 

}
