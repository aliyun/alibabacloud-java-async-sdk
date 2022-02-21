// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScalingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteScalingConfigurationResponseBody</p>
 */
public class DeleteScalingConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteScalingConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScalingConfigurationResponseBody create() {
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

        public DeleteScalingConfigurationResponseBody build() {
            return new DeleteScalingConfigurationResponseBody(this);
        } 

    } 

}
