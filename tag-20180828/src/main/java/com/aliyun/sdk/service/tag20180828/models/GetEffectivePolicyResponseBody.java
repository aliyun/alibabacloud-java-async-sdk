// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEffectivePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetEffectivePolicyResponseBody</p>
 */
public class GetEffectivePolicyResponseBody extends TeaModel {
    @NameInMap("EffectivePolicy")
    private String effectivePolicy;

    @NameInMap("RequestId")
    private String requestId;

    private GetEffectivePolicyResponseBody(Builder builder) {
        this.effectivePolicy = builder.effectivePolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEffectivePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return effectivePolicy
     */
    public String getEffectivePolicy() {
        return this.effectivePolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String effectivePolicy; 
        private String requestId; 

        /**
         * The effective tag policy.
         */
        public Builder effectivePolicy(String effectivePolicy) {
            this.effectivePolicy = effectivePolicy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEffectivePolicyResponseBody build() {
            return new GetEffectivePolicyResponseBody(this);
        } 

    } 

}
