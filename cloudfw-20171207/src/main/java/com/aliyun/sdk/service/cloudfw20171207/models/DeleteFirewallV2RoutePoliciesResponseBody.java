// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFirewallV2RoutePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFirewallV2RoutePoliciesResponseBody</p>
 */
public class DeleteFirewallV2RoutePoliciesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteFirewallV2RoutePoliciesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFirewallV2RoutePoliciesResponseBody create() {
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

        public DeleteFirewallV2RoutePoliciesResponseBody build() {
            return new DeleteFirewallV2RoutePoliciesResponseBody(this);
        } 

    } 

}
