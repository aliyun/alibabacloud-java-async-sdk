// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIpv6EgressOnlyRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpv6EgressOnlyRuleResponseBody</p>
 */
public class CreateIpv6EgressOnlyRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6EgressRuleId")
    private String ipv6EgressRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpv6EgressOnlyRuleResponseBody(Builder builder) {
        this.ipv6EgressRuleId = builder.ipv6EgressRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpv6EgressOnlyRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6EgressRuleId
     */
    public String getIpv6EgressRuleId() {
        return this.ipv6EgressRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipv6EgressRuleId; 
        private String requestId; 

        /**
         * <p>The ID of the egress-only rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6py-hp3w98rmlbqp01245****</p>
         */
        public Builder ipv6EgressRuleId(String ipv6EgressRuleId) {
            this.ipv6EgressRuleId = ipv6EgressRuleId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFEDBEE-E5AB-49E8-A2DC-CC114C67AF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpv6EgressOnlyRuleResponseBody build() {
            return new CreateIpv6EgressOnlyRuleResponseBody(this);
        } 

    } 

}
