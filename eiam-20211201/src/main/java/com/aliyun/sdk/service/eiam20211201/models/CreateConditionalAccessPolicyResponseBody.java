// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateConditionalAccessPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConditionalAccessPolicyResponseBody</p>
 */
public class CreateConditionalAccessPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicyId")
    private String conditionalAccessPolicyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateConditionalAccessPolicyResponseBody(Builder builder) {
        this.conditionalAccessPolicyId = builder.conditionalAccessPolicyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConditionalAccessPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return conditionalAccessPolicyId
     */
    public String getConditionalAccessPolicyId() {
        return this.conditionalAccessPolicyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String conditionalAccessPolicyId; 
        private String requestId; 

        /**
         * <p>Conditional Access Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>cp_xxxxx</p>
         */
        public Builder conditionalAccessPolicyId(String conditionalAccessPolicyId) {
            this.conditionalAccessPolicyId = conditionalAccessPolicyId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConditionalAccessPolicyResponseBody build() {
            return new CreateConditionalAccessPolicyResponseBody(this);
        } 

    } 

}
