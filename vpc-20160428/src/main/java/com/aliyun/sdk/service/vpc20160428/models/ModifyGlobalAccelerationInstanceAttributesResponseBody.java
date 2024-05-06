// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGlobalAccelerationInstanceAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyGlobalAccelerationInstanceAttributesResponseBody</p>
 */
public class ModifyGlobalAccelerationInstanceAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyGlobalAccelerationInstanceAttributesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalAccelerationInstanceAttributesResponseBody create() {
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

        public ModifyGlobalAccelerationInstanceAttributesResponseBody build() {
            return new ModifyGlobalAccelerationInstanceAttributesResponseBody(this);
        } 

    } 

}
