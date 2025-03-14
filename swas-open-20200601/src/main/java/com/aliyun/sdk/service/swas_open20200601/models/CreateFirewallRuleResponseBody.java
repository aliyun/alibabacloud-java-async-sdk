// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link CreateFirewallRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFirewallRuleResponseBody</p>
 */
public class CreateFirewallRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFirewallRuleResponseBody(Builder builder) {
        this.firewallId = builder.firewallId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirewallRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firewallId
     */
    public String getFirewallId() {
        return this.firewallId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String firewallId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateFirewallRuleResponseBody model) {
            this.firewallId = model.firewallId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the firewall rule.</p>
         * 
         * <strong>example:</strong>
         * <p>8007e18c61024aafbd776d52d0****</p>
         */
        public Builder firewallId(String firewallId) {
            this.firewallId = firewallId;
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

        public CreateFirewallRuleResponseBody build() {
            return new CreateFirewallRuleResponseBody(this);
        } 

    } 

}
