// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnWafPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDcdnWafPolicyResponseBody</p>
 */
public class CreateDcdnWafPolicyResponseBody extends TeaModel {
    @NameInMap("PolicyId")
    private Long policyId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDcdnWafPolicyResponseBody(Builder builder) {
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnWafPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long policyId; 
        private String requestId; 

        /**
         * The ID of the protection policy that you created.
         */
        public Builder policyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDcdnWafPolicyResponseBody build() {
            return new CreateDcdnWafPolicyResponseBody(this);
        } 

    } 

}
