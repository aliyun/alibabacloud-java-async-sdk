// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecurityPolicyResponseBody</p>
 */
public class CreateSecurityPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityPolicyId")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 安全策略id
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
