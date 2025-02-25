// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyScalingGroupResponseBody</p>
 */
public class ModifyScalingGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyScalingGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingGroupResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyScalingGroupResponseBody build() {
            return new ModifyScalingGroupResponseBody(this);
        } 

    } 

}
