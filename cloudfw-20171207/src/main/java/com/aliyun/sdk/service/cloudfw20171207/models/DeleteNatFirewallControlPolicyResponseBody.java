// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNatFirewallControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNatFirewallControlPolicyResponseBody</p>
 */
public class DeleteNatFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteNatFirewallControlPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNatFirewallControlPolicyResponseBody create() {
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

        public DeleteNatFirewallControlPolicyResponseBody build() {
            return new DeleteNatFirewallControlPolicyResponseBody(this);
        } 

    } 

}
