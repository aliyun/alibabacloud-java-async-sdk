// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CreateAutoRepairPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAutoRepairPolicyResponseBody</p>
 */
public class CreateAutoRepairPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("policy_id")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    private CreateAutoRepairPolicyResponseBody(Builder builder) {
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoRepairPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAutoRepairPolicyResponseBody model) {
            this.policyId = model.policyId;
            this.requestId = model.requestId;
        } 

        /**
         * policy_id.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAutoRepairPolicyResponseBody build() {
            return new CreateAutoRepairPolicyResponseBody(this);
        } 

    } 

}
