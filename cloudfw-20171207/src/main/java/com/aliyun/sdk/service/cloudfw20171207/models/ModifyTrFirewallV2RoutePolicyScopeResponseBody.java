// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyTrFirewallV2RoutePolicyScopeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTrFirewallV2RoutePolicyScopeResponseBody</p>
 */
public class ModifyTrFirewallV2RoutePolicyScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    private ModifyTrFirewallV2RoutePolicyScopeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTrFirewallV2RoutePolicyScopeResponseBody create() {
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
         * <p>E7D4D635-0C70-5CEB-A609-851E94D51FBB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-4d724d0139df48f18091</p>
         */
        public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }

        public ModifyTrFirewallV2RoutePolicyScopeResponseBody build() {
            return new ModifyTrFirewallV2RoutePolicyScopeResponseBody(this);
        } 

    } 

}
