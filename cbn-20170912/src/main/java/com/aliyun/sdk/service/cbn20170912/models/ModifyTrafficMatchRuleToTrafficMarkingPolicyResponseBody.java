// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody</p>
 */
public class ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody create() {
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

        public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody build() {
            return new ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody(this);
        } 

    } 

}
