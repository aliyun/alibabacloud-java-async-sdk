// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountSecurityPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAccountSecurityPolicyResponseBody</p>
 */
public class ModifyAccountSecurityPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyAccountSecurityPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountSecurityPolicyResponseBody create() {
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

        public ModifyAccountSecurityPolicyResponseBody build() {
            return new ModifyAccountSecurityPolicyResponseBody(this);
        } 

    } 

}
