// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyScalingConfigurationResponseBody</p>
 */
public class ModifyScalingConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyScalingConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingConfigurationResponseBody create() {
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

        public ModifyScalingConfigurationResponseBody build() {
            return new ModifyScalingConfigurationResponseBody(this);
        } 

    } 

}
