// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody</p>
 */
public class RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody create() {
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
         * <p>6DF9A765-BCD2-5C7E-8C32-C35C8A361A39</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody build() {
            return new RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody(this);
        } 

    } 

}
