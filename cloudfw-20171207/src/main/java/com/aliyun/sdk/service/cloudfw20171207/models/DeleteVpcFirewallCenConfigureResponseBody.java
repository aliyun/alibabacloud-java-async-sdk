// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcFirewallCenConfigureResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteVpcFirewallCenConfigureResponseBody</p>
 */
public class DeleteVpcFirewallCenConfigureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteVpcFirewallCenConfigureResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcFirewallCenConfigureResponseBody create() {
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

        public DeleteVpcFirewallCenConfigureResponseBody build() {
            return new DeleteVpcFirewallCenConfigureResponseBody(this);
        } 

    } 

}
