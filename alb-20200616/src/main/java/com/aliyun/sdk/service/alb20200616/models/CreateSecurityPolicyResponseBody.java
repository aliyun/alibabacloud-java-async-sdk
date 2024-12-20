// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link CreateSecurityPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecurityPolicyResponseBody</p>
 */
public class CreateSecurityPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    private CreateSecurityPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityPolicyId = builder.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public static final class Builder {
        private String requestId; 
        private String securityPolicyId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>scp-bp1bpn0kn9****</p>
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        public CreateSecurityPolicyResponseBody build() {
            return new CreateSecurityPolicyResponseBody(this);
        } 

    } 

}
