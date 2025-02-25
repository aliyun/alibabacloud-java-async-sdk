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
         * <p>The ID of the firewall template.</p>
         * 
         * <strong>example:</strong>
         * <p>ft-bcf1a7hrdq717****</p>
         */
        public Builder firewallTemplateId(String firewallTemplateId) {
            this.firewallTemplateId = firewallTemplateId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
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
