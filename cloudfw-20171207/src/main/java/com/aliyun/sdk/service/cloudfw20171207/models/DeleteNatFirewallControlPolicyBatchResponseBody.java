// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNatFirewallControlPolicyBatchResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNatFirewallControlPolicyBatchResponseBody</p>
 */
public class DeleteNatFirewallControlPolicyBatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteNatFirewallControlPolicyBatchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNatFirewallControlPolicyBatchResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteNatFirewallControlPolicyBatchResponseBody build() {
            return new DeleteNatFirewallControlPolicyBatchResponseBody(this);
        } 

    } 

}
