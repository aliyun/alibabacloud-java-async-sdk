// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFirewallRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFirewallRulesResponseBody</p>
 */
public class CreateFirewallRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FirewallRuleIds")
    private java.util.List < String > firewallRuleIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFirewallRulesResponseBody(Builder builder) {
        this.firewallRuleIds = builder.firewallRuleIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirewallRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return firewallRuleIds
     */
    public java.util.List < String > getFirewallRuleIds() {
        return this.firewallRuleIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > firewallRuleIds; 
        private String requestId; 

        /**
         * <p>The IDs of the firewall rules that you created.</p>
         */
        public Builder firewallRuleIds(java.util.List < String > firewallRuleIds) {
            this.firewallRuleIds = firewallRuleIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFirewallRulesResponseBody build() {
            return new CreateFirewallRulesResponseBody(this);
        } 

    } 

}
