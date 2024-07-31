// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFirewallTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFirewallTemplateResponseBody</p>
 */
public class CreateFirewallTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FirewallTemplateId")
    private String firewallTemplateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFirewallTemplateResponseBody(Builder builder) {
        this.firewallTemplateId = builder.firewallTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirewallTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return firewallTemplateId
     */
    public String getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String firewallTemplateId; 
        private String requestId; 

        /**
         * The ID of the firewall template.
         */
        public Builder firewallTemplateId(String firewallTemplateId) {
            this.firewallTemplateId = firewallTemplateId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFirewallTemplateResponseBody build() {
            return new CreateFirewallTemplateResponseBody(this);
        } 

    } 

}
