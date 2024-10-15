// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyTrFirewallV2ConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTrFirewallV2ConfigurationResponseBody</p>
 */
public class ModifyTrFirewallV2ConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyTrFirewallV2ConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTrFirewallV2ConfigurationResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A74C8FDD-2BEF-52D5-8B01-EB6FD94606F9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyTrFirewallV2ConfigurationResponseBody build() {
            return new ModifyTrFirewallV2ConfigurationResponseBody(this);
        } 

    } 

}
