// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTrFirewallV2RoutePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrFirewallV2RoutePolicyResponseBody</p>
 */
public class CreateTrFirewallV2RoutePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    private CreateTrFirewallV2RoutePolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrFirewallV2RoutePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trFirewallRoutePolicyId
     */
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

    public static final class Builder {
        private String requestId; 
        private String trFirewallRoutePolicyId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C91D68BA-A0BE-51BF-A0F1-1CB5C57FE58D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-8ebed27e13e14ce2****</p>
         */
        public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }

        public CreateTrFirewallV2RoutePolicyResponseBody build() {
            return new CreateTrFirewallV2RoutePolicyResponseBody(this);
        } 

    } 

}
