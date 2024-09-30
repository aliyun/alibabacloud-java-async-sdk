// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEffectivePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetEffectivePolicyResponseBody</p>
 */
public class GetEffectivePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EffectivePolicy")
    private String effectivePolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The effective tag policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tags&quot;:{&quot;costcenter&quot;:{&quot;tag_value&quot;:[&quot;Beijing&quot;,&quot;Shanghai&quot;],&quot;tag_key&quot;:&quot;CostCenter&quot;}}}</p>
         */
        public Builder effectivePolicy(String effectivePolicy) {
            this.effectivePolicy = effectivePolicy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BB532282-94F5-5F56-877F-32D5E2A04F3F</p>
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
