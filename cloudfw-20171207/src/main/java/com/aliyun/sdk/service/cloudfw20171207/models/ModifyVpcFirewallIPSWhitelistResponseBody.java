// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallIPSWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVpcFirewallIPSWhitelistResponseBody</p>
 */
public class ModifyVpcFirewallIPSWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyVpcFirewallIPSWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallIPSWhitelistResponseBody create() {
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

        public ModifyVpcFirewallIPSWhitelistResponseBody build() {
            return new ModifyVpcFirewallIPSWhitelistResponseBody(this);
        } 

    } 

}
