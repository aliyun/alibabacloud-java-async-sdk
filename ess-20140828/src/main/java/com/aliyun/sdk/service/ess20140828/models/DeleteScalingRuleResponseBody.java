// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteScalingRuleResponseBody</p>
 */
public class DeleteScalingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteScalingRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScalingRuleResponseBody create() {
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

        public DeleteScalingRuleResponseBody build() {
            return new DeleteScalingRuleResponseBody(this);
        } 

    } 

}
